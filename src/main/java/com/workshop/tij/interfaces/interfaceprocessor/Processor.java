package com.workshop.tij.interfaces.interfaceprocessor;

public interface Processor {
    String name();

    Object process(Object input);
}