package com.workshop.tij.interfaces.interfaceprocessor;

import static com.workshop.tij.util.Print.print;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}