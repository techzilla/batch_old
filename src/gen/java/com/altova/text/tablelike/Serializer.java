////////////////////////////////////////////////////////////////////////
//
// Serializer.java
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

package com.altova.text.tablelike;

import java.io.IOException;
import java.io.Writer;

import com.altova.text.FileIO;

public abstract class Serializer implements ISerializer, IRecordBasedParserObserver 
{
    private Table m_Table = null;

    private Writer m_Stream = null;

    private String m_Encoding = "UTF-8";
	private boolean m_bBigEndian = false;
	private boolean m_bBOM = false;

    protected abstract RecordBasedParser createParser();

    protected abstract void doSerialize() throws IOException, MappingException;

    protected abstract boolean doStoreRecord(Record record);

    protected Writer getStream() 
    {
        return m_Stream;
    }

    protected Table getTable() 
    {
        return m_Table;
    }

    protected Serializer(Table table) 
    {
        m_Table = table;
    }

    public void setEncoding(String encoding, boolean bBigEndian, boolean bBOM) 
    {
        m_Encoding = encoding;
		m_bBigEndian = bBigEndian;
		m_bBOM = bBOM;
    }

    public void serialize(java.io.Writer writer) throws MappingException
    {
        m_Stream = writer; 
        try 
        {
            this.doSerialize();
            m_Stream.flush();
        }
        catch (IOException x) 
        {
            throw new MappingException("Could not write to writer", x);
        }
    }
    
    public void serialize(java.io.OutputStream stream) throws MappingException 
    {
        try 
        {
            FileIO io = new FileIO (stream, m_Encoding, m_bBigEndian, m_bBOM);
            m_Stream = io.openWriteStream();
            this.doSerialize();
            m_Stream.flush();
        } 
        catch (IOException x) 
        {
            throw new MappingException("Could not write to stream", x);
        }
    }

    public void deserialize(java.io.Reader reader) throws MappingException 
    {
    	deserialize(new FileIO (reader));
    }
    
    public void deserialize(java.io.InputStream stream) throws MappingException 
    {
    	deserialize(new FileIO (stream, m_Encoding, m_bBigEndian, m_bBOM));
    }
    
    public void deserialize(FileIO io) throws MappingException {
        try {
            m_Table.clear();
            String buffer = io.readToEnd().toString();
            RecordBasedParser parser = this.createParser();
            parser.setObserver(this);
            parser.parse(buffer);
        } catch (MappingException x) {
            throw new MappingException("Could not parse", x);
        } catch (IOException x) {
            throw new MappingException("Could not read", x);
        }
    }

    public void notifyAboutRecordFound(Record record) {
        if (this.doStoreRecord(record))
            m_Table.add(record);
    }
}
