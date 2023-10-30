package com.power4j.demo.jna;

import com.sun.jna.Structure;

@Structure.FieldOrder({ "IV", "IVLen", "PaddingType", "FeedBitLen" })
public class CPTPARAM extends Structure {
    public static final int MAX_IV_LEN = 32;
    public byte[] IV = new byte[MAX_IV_LEN];
    public int IVLen = 0;
    public int PaddingType = 0;
    public int FeedBitLen = 0;

    public CPTPARAM() {
        super(ALIGN_NONE);

    }

    public static class ByReference extends CPTPARAM implements Structure.ByReference {

    }

    public static class ByValue extends CPTPARAM implements Structure.ByValue {

    }
}
