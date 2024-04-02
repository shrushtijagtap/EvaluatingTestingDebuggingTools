package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test1");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(xMLInputFactory3);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper6 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory4, jacksonXmlModule5);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup7 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider8 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup7);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper6.setSerializerProvider((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider) xmlSerializerProvider8);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper6.setNodeFactory(jsonNodeFactory10);
        javax.xml.stream.XMLStreamReader xMLStreamReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser13 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 55296, (int) '#', (com.fasterxml.jackson.core.ObjectCodec) objectMapper11, xMLStreamReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test2");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(xMLInputFactory3);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper6 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory4, jacksonXmlModule5);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup7 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider8 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup7);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper6.setSerializerProvider((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider) xmlSerializerProvider8);
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.addHandler(deserializationProblemHandler10);
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(xMLInputFactory12);
        boolean boolean14 = xmlFactory13.requiresPropertyOrdering();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass15 = xmlFactory13.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType16 = objectMapper11.constructType((java.lang.reflect.Type) featureClass15);
        javax.xml.stream.XMLStreamReader xMLStreamReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser18 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (byte) 100, (com.fasterxml.jackson.core.ObjectCodec) objectMapper11, xMLStreamReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(featureClass15);
        org.junit.Assert.assertNotNull(javaType16);
    }
}

