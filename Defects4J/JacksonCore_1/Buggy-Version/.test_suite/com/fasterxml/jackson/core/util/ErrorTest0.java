package com.fasterxml.jackson.core.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = jsonFactory0._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer2 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler1);
        int int3 = textBuffer2.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray4 = textBuffer2.expandCurrentSegment();
    }
}

