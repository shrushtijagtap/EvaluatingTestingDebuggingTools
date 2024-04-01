package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 2, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper4 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(jacksonXmlModule3);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig5 = xmlMapper4.getSerializationConfig();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter6 = xmlMapper4.writer();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory7.getOutputDecorator();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = xmlFactory7.copy();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass10 = xmlFactory7.getFormatReadFeatureType();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature11 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean12 = xmlFactory7.isEnabled(feature11);
        boolean boolean14 = feature11.enabledIn((int) (byte) -1);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper4.disable(feature11);
        javax.xml.stream.XMLStreamReader xMLStreamReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser17 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, 3, (com.fasterxml.jackson.core.ObjectCodec) objectMapper15, xMLStreamReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializationConfig5);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(xmlFactory9);
        org.junit.Assert.assertNotNull(featureClass10);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature11.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper4 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(jacksonXmlModule3);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig5 = xmlMapper4.getSerializationConfig();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper4.writer(characterEscapes6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader9 = xmlMapper4.readerFor(javaType8);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper11 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(jacksonXmlModule10);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig12 = xmlMapper11.getSerializationConfig();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper11.writer();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator15 = xmlFactory14.getOutputDecorator();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = xmlFactory14.copy();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass17 = xmlFactory14.getFormatReadFeatureType();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature18 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean19 = xmlFactory14.isEnabled(feature18);
        boolean boolean21 = feature18.enabledIn((int) (byte) -1);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper11.disable(feature18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper4.disable(feature18);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = xmlMapper4.copy();
        javax.xml.stream.XMLStreamReader xMLStreamReader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser26 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 55296, 55296, (com.fasterxml.jackson.core.ObjectCodec) xmlMapper24, xMLStreamReader25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializationConfig5);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectReader9);
        org.junit.Assert.assertNotNull(serializationConfig12);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNull(outputDecorator15);
        org.junit.Assert.assertNotNull(xmlFactory16);
        org.junit.Assert.assertNotNull(featureClass17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature18.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(xmlMapper24);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 55296, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

