package com.aspectran.example.sample;

import com.aspectran.core.activity.Translet;

public class SampleAdvice {

    public String beforeCountTo10(Translet translet) {
        return "* before count to 10 without translet argument.";
    }

    public String _beforeCountTo10(Translet translet) {
        return "* before count to 10 with translet argument.";
    }

    public String afterCountTo10(Translet translet) {
        return "* after count to 10";
    }

}
