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

        public static CPTPARAM.ByValue of(CPTPARAM p) {
            CPTPARAM.ByValue value = new CPTPARAM.ByValue();
            System.arraycopy(p.IV, 0, value.IV, 0, p.IV.length);
            value.IVLen = p.IVLen;
            value.PaddingType = p.PaddingType;
            value.FeedBitLen = p.FeedBitLen;
            return value;
        }

    }

    public ByValue valueType() {
        return ByValue.of(this);
    }
}
