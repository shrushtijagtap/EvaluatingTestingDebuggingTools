package com.fasterxml.jackson.core.json;

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
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int1 = bytesToNameCanonicalizer0.maxCollisionLength();
        int int2 = bytesToNameCanonicalizer0.collisionCount();
        boolean boolean3 = bytesToNameCanonicalizer0.maybeDirty();
        int[] intArray9 = new int[] { ' ', 56319, (short) 10, (byte) -1 };
        int[] intArray11 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray9, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.core.sym.Name name13 = bytesToNameCanonicalizer0.addName("hi!", intArray11, 16);
    }
}

