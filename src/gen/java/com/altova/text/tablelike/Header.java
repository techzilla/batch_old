////////////////////////////////////////////////////////////////////////
//
// Header.java
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

import java.util.ArrayList;

public class Header {
    private ArrayList<ColumnSpecification> m_Columns = new ArrayList<ColumnSpecification>();

    public void add(ColumnSpecification rhs) {
        m_Columns.add(rhs);
    }

    public void clear() {
        m_Columns.clear();
    }

    public int size() {
        return m_Columns.size();
    }

    public ColumnSpecification getAt(int index) {
        return m_Columns.get(index);
    }

    public int getRecordSize() {
        int result = 0;
        for (int i = 0; i < m_Columns.size(); ++i)
            result += this.getAt(i).getLength();
        return result;
    }
}
