package com.power4j.demo.jna;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class Lib2 {
    static {
        Native.register("dylib-demo");
    }

    public static native int test_init(Pointer hKey, CPTPARAM DecryptParam);
}
