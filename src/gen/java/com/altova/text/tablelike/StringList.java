////////////////////////////////////////////////////////////////////////
//
// StringList.java
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

public class StringList {
    private ArrayList<String> m_List = new ArrayList<String>();

    public void add(String rhs) {
        m_List.add(rhs);
    }

    public void addRange(String[] rhs) {
        for (int i = 0; i < rhs.length; ++i)
            m_List.add(rhs[i]);
    }

    public int size() {
        return m_List.size();
    }

    public String getAt(int index) {
        return m_List.get(index);
    }

    public void clear() {
        m_List.clear();
    }

    public void toArray(String[] rhs) {
        m_List.toArray(rhs);
    }

    public void setFromArray(String[] rhs) {
        m_List.clear();
        this.addRange(rhs);
    }
}