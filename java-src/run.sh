#!/bin/bash

echo "native library path: $LIB_PATH"

export LD_LIBRARY_PATH=$LIB_PATH:$LD_LIBRARY_PATH
java  -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -XX:ErrorFile=crash.log -XX:+CrashOnOutOfMemoryError \
     -Djna.debug_load=true -Djna.dump_memory=true -Djna.library.path=$LIB_PATH \
     -jar target/jna-demo.jar