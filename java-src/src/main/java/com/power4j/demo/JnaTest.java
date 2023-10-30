package com.power4j.demo;

import com.power4j.demo.jna.CPTPARAM;
import com.power4j.demo.jna.SLib;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class JnaTest {

    public static void testInit(){
        SLib lib = Native.load("dylib-demo", SLib.class);

        CPTPARAM.ByValue byValue  = new CPTPARAM.ByValue();
        byValue.IVLen = 16;
        byValue.PaddingType = 1;
        byValue.write();

        System.out.println("byValue = "+ byValue);

        Pointer pointer = Pointer.NULL;
        lib.test_init(pointer,byValue);
        System.out.println("call test_init end");
    }
}
