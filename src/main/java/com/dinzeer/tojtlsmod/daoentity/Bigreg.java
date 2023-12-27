package com.dinzeer.tojtlsmod.daoentity;

import com.dinzeer.tojtlsmod.init.init.Blockinit;
import com.dinzeer.tojtlsmod.init.init.Iteminit;

public class Bigreg {
    //这里是放调用的
    public static void regs(){
        Returner.registerAddlang();
        Iteminit.register();
        Blockinit.register();
    }
}
