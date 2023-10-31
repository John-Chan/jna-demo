package com.power4j.demo.jna;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface SLib extends Library {

    int test_init(Pointer hKey, CPTPARAM.ByValue param);
}
