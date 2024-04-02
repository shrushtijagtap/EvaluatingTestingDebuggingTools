package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test1");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider2 = xmlSerializerProvider1.getFilterProvider();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test2");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        int int2 = xmlSerializerProvider1.cachedSerializersCount();
        int int3 = xmlSerializerProvider1.cachedSerializersCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.xml.namespace.QName qName4 = xmlSerializerProvider1._rootNameFromConfig();
    }
}

