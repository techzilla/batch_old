////////////////////////////////////////////////////////////////////////
//
// EDIFixedDataCompletion.java
//
// This file was generated by MapForce 2019.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.edi;

import com.altova.text.ITextNode;

public class EDIFixedDataCompletion extends DataCompletion {
//    private EDIFixedSettings mSettings = null;

    public EDIFixedDataCompletion(TextDocument document, EDIFixedSettings settings, String structurename) {
        super(document, structurename);
//        mSettings = settings;
    }

    public void completeData(ITextNode dataroot, Particle rootParticle) {
        completeMandatory(dataroot, rootParticle);
    }
}
