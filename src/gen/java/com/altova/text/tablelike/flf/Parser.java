////////////////////////////////////////////////////////////////////////
//
// Parser.java
//
// This file was generated by MapForce 2018r2sp1.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.tablelike.flf;

import com.altova.text.tablelike.Header;
import com.altova.text.tablelike.MappingException;
import com.altova.text.tablelike.RecordBasedParser;

public class Parser extends RecordBasedParser {
    private Format m_Format = null;

    private int m_Offset = 0;

    private int m_MaxOffset = 0;

    private String m_Buffer = "";

    private Header m_Header = null;

    private String trimEnd(String rhs) {
        int size = rhs.length();
        char fillcharacter = m_Format.getFillCharacter();
        int end = size - 1;
        while ((end > -1) && (fillcharacter == rhs.charAt(end)))
            --end;
        if (end == -1)
            return "";
        return rhs.substring(0, end + 1);
    }

    private void parseRecord() {
        int count = m_Header.size();
        String[] fields = new String[count];
        if (m_Format.getAssumeRecordDelimitersPresent()) {
            int maxfieldindex = count - 1;
            this.parseFields(fields, maxfieldindex);
            int start = m_Offset;
            this.moveToNextRecordDelimiter();
            int len = Math.min(m_Offset - start, m_Header.getAt(maxfieldindex).getLength());
            fields[maxfieldindex] = m_Buffer.substring(start, start + len);
            fields[maxfieldindex] = this.trimEnd(fields[maxfieldindex]);

            this.swallowTillNextRecord();
        } else
            this.parseFields(fields, count);

		if (m_Format.getRemoveEmpty())
		{
			for (int i = 0; i < fields.length; ++i) 
			{
				if (fields[i] != null && fields[i].length() == 0)
					fields[i] = null;
			}
		}
		super.notifyAboutRecordFound(fields);
    }

    private void parseFields(String[] fields, int fieldcount) {
        if (m_Format.getAssumeRecordDelimitersPresent()) {
            int i = 0;
            while ( i< fieldcount) {
                int count = Math.min(m_Header.getAt(i).getLength(), m_Buffer.length()-m_Offset);
                int recSepPos = m_Buffer.substring(m_Offset, m_Offset+count).indexOf('\r');
                
                if (recSepPos != -1 && recSepPos <= count) {
                    count = recSepPos;
                    fields[i] = trimEnd(m_Buffer.substring(m_Offset, m_Offset+count));
                    m_Offset += count;
                    i++;
                    break;
                }
                else {
                    fields[i] = trimEnd(m_Buffer.substring(m_Offset, m_Offset+count));
                    m_Offset += count;
                    i++;
                }
            }
        }
        else {
            for (int i = 0; i < fieldcount; ++i) {
                int len = m_Header.getAt(i).getLength();
				int bufLen = m_Buffer.length();
				if (bufLen < m_Offset)
                	fields[i] = null;
                else if (m_Buffer.length() < m_Offset + len)
                	fields[i] = trimEnd(m_Buffer.substring(m_Offset));
                else
                	fields[i] = trimEnd(m_Buffer.substring(m_Offset, m_Offset+ len));
                m_Offset += len;
            }
        }
    }

    private void moveToNextNonRecordDelimiter() {
        while ((m_Offset < m_Buffer.length())
                && (m_Format.IsRecordDelimiter(m_Buffer.charAt(m_Offset))))
            ++m_Offset;
    }

    private void moveToNextRecordDelimiter() {
        while ((m_Offset < m_Buffer.length())
                && (!m_Format.IsRecordDelimiter(m_Buffer.charAt(m_Offset))))
            ++m_Offset;
    }

    private void swallowTillNextRecord() {
        this.moveToNextRecordDelimiter();
        this.moveToNextNonRecordDelimiter();
    }

    public Parser(Format format, Header header) {
        m_Format = format;
        m_Header = header;
    }

    public Format getFormat() {
        return m_Format;
    }

    public int parse(String buffer) throws MappingException {
        int result = 0;
        m_Buffer = buffer;
        m_MaxOffset = m_Buffer.length() - m_Header.getRecordSize();
        m_Offset = 0;
          
        do {
            this.parseRecord();
            ++result;
        }
        while (m_Offset < m_Buffer.length());
        return result;
    }
}