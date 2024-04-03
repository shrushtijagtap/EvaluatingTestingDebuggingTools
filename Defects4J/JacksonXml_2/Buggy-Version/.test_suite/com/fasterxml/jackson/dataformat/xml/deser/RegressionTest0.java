package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature6 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean7 = feature6.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper1.enable(feature6);
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator9 = null;
        java.lang.Object obj10 = xmlMapper1.setHandlerInstantiator(handlerInstantiator9);
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory11);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector13 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version14 = jacksonXmlAnnotationIntrospector13.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember15 = null;
        java.lang.String str16 = jacksonXmlAnnotationIntrospector13.findImplicitPropertyName(annotatedMember15);
        byte[] byteArray17 = xmlMapper12.writeValueAsBytes((java.lang.Object) str16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass19 = xmlMapper1.readValue(byteArray17, javaType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature6.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[60, 110, 117, 108, 108, 47, 62]");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.reader(formatSchema6);
        javax.xml.stream.XMLInputFactory xMLInputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory8);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper9.writer(formatSchema10);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter12 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper9.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter12);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature14 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper9.enable(feature14);
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory17);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper18.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = xmlMapper18.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature21 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory22 = xmlFactory20.enable(feature21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass23 = xmlFactory20.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper16.readerWithView(featureClass23);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = objectMapper5.writerWithView(featureClass23);
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory26);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector28 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version29 = jacksonXmlAnnotationIntrospector28.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember30 = null;
        java.lang.String str31 = jacksonXmlAnnotationIntrospector28.findImplicitPropertyName(annotatedMember30);
        byte[] byteArray32 = xmlMapper27.writeValueAsBytes((java.lang.Object) str31);
        com.fasterxml.jackson.core.type.TypeReference typeReference33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.JaxbWrapper jaxbWrapper34 = objectMapper5.readValue(byteArray32, typeReference33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature14.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(xmlFactory20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature21.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[60, 110, 117, 108, 108, 47, 62]");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory1);
        com.fasterxml.jackson.core.FormatSchema formatSchema3 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter4 = xmlMapper2.writer(formatSchema3);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter5 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = xmlMapper2.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter5);
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = objectMapper6.addHandler(deserializationProblemHandler7);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector9 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version10 = jacksonXmlAnnotationIntrospector9.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        java.lang.String[] strArray12 = jacksonXmlAnnotationIntrospector9.findPropertiesToIgnore(annotated11);
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory13);
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter16 = xmlMapper14.writer(formatSchema15);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter17 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = xmlMapper14.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter17);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature19 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean20 = feature19.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper14.enable(feature19);
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory22);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper23.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = xmlMapper23.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature26 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = xmlFactory25.enable(feature26);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass28 = xmlFactory25.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader29 = objectMapper21.readerWithView(featureClass28);
        java.lang.Enum[] enumArray31 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray32 = (java.lang.Enum<?>[]) enumArray31;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray36 = jacksonXmlAnnotationIntrospector9.findEnumValues(featureClass28, wildcardEnumArray32, strArray35);
        com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema37 = objectMapper8.generateJsonSchema(featureClass28);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream38 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) jsonSchema37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter4);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(objectWriter16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature19.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(xmlFactory25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature26.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory27);
        org.junit.Assert.assertNotNull(featureClass28);
        org.junit.Assert.assertNotNull(objectReader29);
        org.junit.Assert.assertNotNull(enumArray31);
        org.junit.Assert.assertNotNull(wildcardEnumArray32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(jsonSchema37);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper2.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper2.setNodeFactory(jsonNodeFactory4);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory6 = xmlMapper2.getSerializerFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = xmlMapper2.copy();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream8 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) xmlMapper7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(serializerFactory6);
        org.junit.Assert.assertNotNull(xmlMapper7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        java.lang.Object obj19 = jsonParser16.getObjectId();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        boolean boolean23 = jsonParser16.getValueAsBoolean();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory23);
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper26 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory25);
        com.fasterxml.jackson.core.FormatSchema formatSchema27 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter28 = xmlMapper26.writer(formatSchema27);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter29 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = xmlMapper26.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter29);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature31 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean32 = feature31.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper26.enable(feature31);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = xmlMapper24.enable(feature31);
        com.fasterxml.jackson.annotation.JsonInclude.Include include35 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = objectMapper34.setSerializationInclusion(include35);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode37 = objectMapper36.createArrayNode();
        javax.xml.stream.XMLInputFactory xMLInputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory38);
        com.fasterxml.jackson.core.FormatSchema formatSchema40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(formatSchema40);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory42 = xmlMapper39.getSerializerFactory();
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper45 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory44);
        com.fasterxml.jackson.core.FormatSchema formatSchema46 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter47 = xmlMapper45.writer(formatSchema46);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter48 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = xmlMapper45.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter48);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader51 = objectMapper49.reader(formatSchema50);
        javax.xml.stream.XMLInputFactory xMLInputFactory52 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper53 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory52);
        com.fasterxml.jackson.core.FormatSchema formatSchema54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = xmlMapper53.writer(formatSchema54);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter56 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper53.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter56);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature58 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean59 = feature58.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = xmlMapper53.enable(feature58);
        javax.xml.stream.XMLInputFactory xMLInputFactory61 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper62 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory61);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper62.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory64 = xmlMapper62.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature65 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory66 = xmlFactory64.enable(feature65);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass67 = xmlFactory64.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader68 = objectMapper60.readerWithView(featureClass67);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter69 = objectMapper49.writerWithView(featureClass67);
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor70 = xmlMapper39.readValues(jsonParser43, featureClass67);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter71 = objectMapper36.writerFor(featureClass67);
        java.util.Iterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor72 = jsonParser16.readValuesAs(featureClass67);
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectWriter28);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature31.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(arrayNode37);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(serializerFactory42);
        org.junit.Assert.assertNotNull(objectWriter47);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(objectReader51);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertTrue("'" + feature58 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature58.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(xmlFactory64);
        org.junit.Assert.assertTrue("'" + feature65 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature65.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory66);
        org.junit.Assert.assertNotNull(featureClass67);
        org.junit.Assert.assertNotNull(objectReader68);
        org.junit.Assert.assertNotNull(objectWriter69);
        org.junit.Assert.assertNotNull(featureItor70);
        org.junit.Assert.assertNotNull(objectWriter71);
        org.junit.Assert.assertNotNull(featureItor72);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonParser16.setFeatureMask((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = jsonParser19.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: [B@6c9154bb; line: 1, column: 8]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector1 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version2 = jacksonXmlAnnotationIntrospector1.version();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream3 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) jacksonXmlAnnotationIntrospector1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        java.lang.Boolean boolean23 = jsonParser16.nextBooleanValue();
        java.lang.Object obj24 = jsonParser16.getTypeId();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        java.lang.Boolean boolean23 = jsonParser16.nextBooleanValue();
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        boolean boolean25 = jsonParser16.canUseSchema(formatSchema24);
        java.lang.Object obj26 = jsonParser16.getObjectId();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature6 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean7 = feature6.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper1.enable(feature6);
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator9 = null;
        java.lang.Object obj10 = xmlMapper1.setHandlerInstantiator(handlerInstantiator9);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = xmlMapper1.setDefaultUseWrapper(false);
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory13);
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory15);
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper16.writer(formatSchema17);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter19 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper16.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter19);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature21 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean22 = feature21.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper16.enable(feature21);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper14.enable(feature21);
        com.fasterxml.jackson.annotation.JsonInclude.Include include25 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = objectMapper24.setSerializationInclusion(include25);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode27 = objectMapper26.createArrayNode();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = xmlMapper12.treeAsTokens((com.fasterxml.jackson.core.TreeNode) arrayNode27);
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper30 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory29);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter31 = xmlMapper30.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory32 = xmlMapper30.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature33 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = xmlFactory32.enable(feature33);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = xmlFactory34.setInputDecorator(inputDecorator35);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator37 = xmlFactory34.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory38);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector40 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version41 = jacksonXmlAnnotationIntrospector40.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember42 = null;
        java.lang.String str43 = jacksonXmlAnnotationIntrospector40.findImplicitPropertyName(annotatedMember42);
        byte[] byteArray44 = xmlMapper39.writeValueAsBytes((java.lang.Object) str43);
        com.fasterxml.jackson.core.JsonParser jsonParser45 = xmlFactory34.createJsonParser(byteArray44);
        boolean boolean46 = jsonParser45.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonParser45.setFeatureMask((int) (short) -1);
        com.fasterxml.jackson.databind.JavaType javaType49 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec50 = xmlMapper12.readValue(jsonParser45, javaType49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature6.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(xmlMapper12);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature21.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(arrayNode27);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(objectWriter31);
        org.junit.Assert.assertNotNull(xmlFactory32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature33.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory34);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNull(outputDecorator37);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jsonParser48);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonParser16.setFeatureMask((int) (short) -1);
        jsonParser16.finishToken();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(jacksonXmlModule17);
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory19);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = xmlMapper20.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.setNodeFactory(jsonNodeFactory21);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker23 = objectMapper22.getVisibilityChecker();
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = objectMapper22.writer(formatSchema24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = xmlFactory5.setCodec((com.fasterxml.jackson.core.ObjectCodec) objectMapper22);
        boolean boolean27 = jsonFactory26.requiresPropertyOrdering();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonNodeFactory21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker23);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory7);
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(formatSchema9);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter11 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter11);
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.addHandler(deserializationProblemHandler13);
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory15);
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter20 = xmlMapper18.writer(formatSchema19);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter21 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter21);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature23 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean24 = feature23.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = xmlMapper18.enable(feature23);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper16.enable(feature23);
        javax.xml.stream.XMLInputFactory xMLInputFactory27 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory27);
        com.fasterxml.jackson.core.FormatSchema formatSchema29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(formatSchema29);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter31 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = xmlMapper28.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter31);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature33 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean34 = feature33.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = xmlMapper28.enable(feature33);
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper37 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory36);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper37.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = xmlMapper37.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature40 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = xmlFactory39.enable(feature40);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass42 = xmlFactory39.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader43 = objectMapper35.readerWithView(featureClass42);
        com.fasterxml.jackson.databind.ObjectReader objectReader44 = objectMapper26.reader(featureClass42);
        boolean boolean45 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass42);
        java.lang.Class<?> wildcardClass46 = objectMapper12.findMixInClassFor(featureClass42);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature47 = xmlMapper1.readValue("<?xml version='1.0' encoding='UTF-8'?><null/>", featureClass42);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not deserialize instance of com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature out of START_OBJECT token? at [Source: java.io.StringReader@271ba7ca; line: 1, column: 39]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectWriter20);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature23.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature33.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(xmlFactory39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature40.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory41);
        org.junit.Assert.assertNotNull(featureClass42);
        org.junit.Assert.assertNotNull(objectReader43);
        org.junit.Assert.assertNotNull(objectReader44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(wildcardClass46);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        long long18 = jsonParser16.nextLongValue((long) 4);
        java.io.OutputStream outputStream19 = null;
        int int20 = jsonParser16.releaseBuffered(outputStream19);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = jsonParser16.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (START_OBJECT) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@5f500070; line: 1, column: 8]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4L + "'", long18 == 4L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        java.io.Writer writer18 = null;
        int int19 = jsonParser16.releaseBuffered(writer18);
        jsonParser16.setRequestPayloadOnError("XML");
        boolean boolean22 = jsonParser16.getValueAsBoolean();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        java.io.Writer writer18 = null;
        int int19 = jsonParser16.releaseBuffered(writer18);
        jsonParser16.setRequestPayloadOnError("XML");
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonParser16.disable(feature22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        long long18 = jsonParser16.nextLongValue((long) 4);
        boolean boolean19 = jsonParser16.canReadObjectId();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4L + "'", long18 == 4L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        java.lang.Boolean boolean23 = jsonParser16.nextBooleanValue();
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        boolean boolean25 = jsonParser16.canUseSchema(formatSchema24);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = jsonParser16.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (START_OBJECT) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@b541b6b; line: 1, column: 8]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter0 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = null;
        defaultXmlPrettyPrinter0.writeObjectFieldValueSeparator(jsonGenerator1);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter3 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        defaultXmlPrettyPrinter3.spacesInObjectEntries(true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        defaultXmlPrettyPrinter3.writeArrayValueSeparator(jsonGenerator6);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        defaultXmlPrettyPrinter3.writeStartArray(jsonGenerator8);
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper11 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory10);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper11.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = xmlMapper11.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature14 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = xmlFactory13.enable(feature14);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = xmlFactory13.getCodec();
        boolean boolean17 = xmlFactory13.canHandleBinaryNatively();
        java.io.DataOutput dataOutput18 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = xmlFactory13.createGenerator(dataOutput18);
        defaultXmlPrettyPrinter3.writeRootValueSeparator(jsonGenerator19);
        defaultXmlPrettyPrinter0.writeRootValueSeparator(jsonGenerator19);
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = jsonGenerator19.getSchema();
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory24);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter26 = xmlMapper25.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = xmlMapper25.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature28 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = xmlFactory27.enable(feature28);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = xmlFactory29.setInputDecorator(inputDecorator30);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator32 = xmlFactory29.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper34 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory33);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector35 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version36 = jacksonXmlAnnotationIntrospector35.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember37 = null;
        java.lang.String str38 = jacksonXmlAnnotationIntrospector35.findImplicitPropertyName(annotatedMember37);
        byte[] byteArray39 = xmlMapper34.writeValueAsBytes((java.lang.Object) str38);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = xmlFactory29.createJsonParser(byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator19.writeBinaryField("JSON", byteArray39);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(xmlFactory13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature14.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory15);
        org.junit.Assert.assertNotNull(objectCodec16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonGenerator19);
        org.junit.Assert.assertNull(formatSchema22);
        org.junit.Assert.assertNotNull(objectWriter26);
        org.junit.Assert.assertNotNull(xmlFactory27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature28.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory29);
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNull(outputDecorator32);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser40);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory23);
        com.fasterxml.jackson.core.FormatSchema formatSchema25 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter26 = xmlMapper24.writer(formatSchema25);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter27 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper24.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter27);
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler29 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = objectMapper28.addHandler(deserializationProblemHandler29);
        jsonParser16.setCurrentValue((java.lang.Object) objectMapper28);
        byte byte32 = jsonParser16.getByteValue();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectWriter26);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 0 + "'", byte32 == (byte) 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        long long20 = jsonParser16.nextLongValue((long) 100);
        boolean boolean21 = jsonParser16.canReadTypeId();
        com.fasterxml.jackson.core.Base64Variant base64Variant22 = null;
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = jsonParser16.readBinaryValue(base64Variant22, outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Operation not supported by parser of type com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        byte byte18 = jsonParser16.getByteValue();
        int int20 = jsonParser16.nextIntValue(56319);
        jsonParser16.finishToken();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 56319 + "'", int20 == 56319);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(jacksonXmlModule0);
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper3 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory2);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = xmlMapper3.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setNodeFactory(jsonNodeFactory4);
        javax.xml.stream.XMLInputFactory xMLInputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(xMLInputFactory6);
        javax.xml.stream.XMLInputFactory xMLInputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper9.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper9.setNodeFactory(jsonNodeFactory11);
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory13);
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter16 = xmlMapper14.writer(formatSchema15);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray17 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        xmlMapper14.registerSubtypes(namedTypeArray17);
        objectMapper12.registerSubtypes(namedTypeArray17);
        com.fasterxml.jackson.databind.InjectableValues injectableValues20 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper12.setInjectableValues(injectableValues20);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector22 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version23 = jacksonXmlAnnotationIntrospector22.version();
        byte[] byteArray24 = objectMapper12.writeValueAsBytes((java.lang.Object) version23);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = xmlFactory7.createJsonParser(byteArray24);
        com.fasterxml.jackson.core.type.TypeReference typeReference28 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.xml.stream.XMLInputFactory xMLInputFactory29 = objectMapper5.readValue(byteArray24, 1, (int) (byte) -1, typeReference28);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxEOFException: Unexpected EOF in prolog? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNodeFactory4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectWriter16);
        org.junit.Assert.assertNotNull(namedTypeArray17);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[60, 86, 101, 114, 115, 105, 111, 110, 62, 60, 109, 97, 106, 111, 114, 86, 101, 114, 115, 105, 111, 110, 62, 50, 60, 47, 109, 97, 106, 111, 114, 86, 101, 114, 115, 105, 111, 110, 62, 60, 109, 105, 110, 111, 114, 86, 101, 114, 115, 105, 111, 110, 62, 56, 60, 47, 109, 105, 110, 111, 114, 86, 101, 114, 115, 105, 111, 110, 62, 60, 117, 110, 107, 110, 111, 119, 110, 86, 101, 114, 115, 105, 111, 110, 62, 102, 97, 108, 115, 101, 60, 47, 117, 110, 107, 110, 111, 119, 110, 86, 101, 114, 115, 105, 111, 110, 62, 60, 115, 110, 97, 112, 115, 104, 111, 116, 62, 116, 114, 117, 101, 60, 47, 115, 110, 97, 112, 115, 104, 111, 116, 62, 60, 117, 107, 110, 111, 119, 110, 86, 101, 114, 115, 105, 111, 110, 62, 102, 97, 108, 115, 101, 60, 47, 117, 107, 110, 111, 119, 110, 86, 101, 114, 115, 105, 111, 110, 62, 60, 112, 97, 116, 99, 104, 76, 101, 118, 101, 108, 62, 48, 60, 47, 112, 97, 116, 99, 104, 76, 101, 118, 101, 108, 62, 60, 103, 114, 111, 117, 112, 73, 100, 62, 99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 60, 47, 103, 114, 111, 117, 112, 73, 100, 62, 60, 97, 114, 116, 105, 102, 97, 99, 116, 73, 100, 62, 106, 97, 99, 107, 115, 111, 110, 45, 100, 97, 116, 97, 98, 105, 110, 100, 60, 47, 97, 114, 116, 105, 102, 97, 99, 116, 73, 100, 62, 60, 47, 86, 101, 114, 115, 105, 111, 110, 62]");
        org.junit.Assert.assertNotNull(jsonParser25);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.reader(formatSchema6);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray11 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList12 = new java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList12, namedTypeArray11);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = stdTypeResolverBuilder8.buildTypeDeserializer(deserializationConfig9, javaType10, (java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList12);
        java.lang.String str15 = stdTypeResolverBuilder8.getTypeProperty();
        boolean boolean16 = stdTypeResolverBuilder8.isTypeIdVisible();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder18 = stdTypeResolverBuilder8.typeIdVisibility(false);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper5.setDefaultTyping((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder>) stdTypeResolverBuilder18);
        javax.xml.stream.XMLInputFactory xMLInputFactory20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper21 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory20);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter22 = xmlMapper21.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = xmlMapper21.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature24 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = xmlFactory23.enable(feature24);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator26 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = xmlFactory25.setInputDecorator(inputDecorator26);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator28 = xmlFactory25.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper30 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory29);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector31 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version32 = jacksonXmlAnnotationIntrospector31.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember33 = null;
        java.lang.String str34 = jacksonXmlAnnotationIntrospector31.findImplicitPropertyName(annotatedMember33);
        byte[] byteArray35 = xmlMapper30.writeValueAsBytes((java.lang.Object) str34);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = xmlFactory25.createJsonParser(byteArray35);
        java.io.Writer writer37 = null;
        int int38 = jsonParser36.releaseBuffered(writer37);
        com.fasterxml.jackson.core.FormatSchema formatSchema39 = null;
        boolean boolean40 = jsonParser36.canUseSchema(formatSchema39);
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectMapper19.readTree(jsonParser36);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature42 = null;
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature43 = null;
        com.fasterxml.jackson.databind.SerializationFeature[] serializationFeatureArray44 = new com.fasterxml.jackson.databind.SerializationFeature[] { serializationFeature43 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = objectMapper19.disable(serializationFeature42, serializationFeatureArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder8);
        org.junit.Assert.assertNotNull(namedTypeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typeDeserializer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectWriter22);
        org.junit.Assert.assertNotNull(xmlFactory23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature24.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory25);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNull(outputDecorator28);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertNotNull(serializationFeatureArray44);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        java.lang.Object obj23 = jsonParser16.getObjectId();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        java.io.Writer writer18 = null;
        int int19 = jsonParser16.releaseBuffered(writer18);
        long long21 = jsonParser16.nextLongValue((long) (short) -1);
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonParser16.setFeatureMask((int) (short) -1);
        com.fasterxml.jackson.core.SerializableString serializableString20 = null;
        boolean boolean21 = jsonParser16.nextFieldName(serializableString20);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonParser16.setFeatureMask(56319);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = jsonParser16.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (START_OBJECT) not of boolean type? at [Source: [B@62a931db; line: 1, column: 8]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonParser23);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter0 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        defaultXmlPrettyPrinter0.spacesInObjectEntries(true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        defaultXmlPrettyPrinter0.writeEndArray(jsonGenerator3, (int) (byte) 100);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter6 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        defaultXmlPrettyPrinter6.spacesInObjectEntries(true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        defaultXmlPrettyPrinter6.writeEndArray(jsonGenerator9, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        defaultXmlPrettyPrinter6.writeArrayValueSeparator(jsonGenerator12);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter14 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = null;
        defaultXmlPrettyPrinter14.writeObjectFieldValueSeparator(jsonGenerator15);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter17 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        defaultXmlPrettyPrinter17.spacesInObjectEntries(true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = null;
        defaultXmlPrettyPrinter17.writeArrayValueSeparator(jsonGenerator20);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = null;
        defaultXmlPrettyPrinter17.writeStartArray(jsonGenerator22);
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory24);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter26 = xmlMapper25.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = xmlMapper25.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature28 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = xmlFactory27.enable(feature28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = xmlFactory27.getCodec();
        boolean boolean31 = xmlFactory27.canHandleBinaryNatively();
        java.io.DataOutput dataOutput32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = xmlFactory27.createGenerator(dataOutput32);
        defaultXmlPrettyPrinter17.writeRootValueSeparator(jsonGenerator33);
        defaultXmlPrettyPrinter14.writeRootValueSeparator(jsonGenerator33);
        com.fasterxml.jackson.core.FormatSchema formatSchema36 = jsonGenerator33.getSchema();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = jsonGenerator33.getCharacterEscapes();
        defaultXmlPrettyPrinter6.writeRootValueSeparator(jsonGenerator33);
        defaultXmlPrettyPrinter0.writeObjectEntrySeparator(jsonGenerator33);
        javax.xml.stream.XMLInputFactory xMLInputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory40);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter42 = xmlMapper41.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = xmlMapper41.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature44 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = xmlFactory43.enable(feature44);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator46 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = xmlFactory45.setInputDecorator(inputDecorator46);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator48 = xmlFactory45.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper50 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory49);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector51 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version52 = jacksonXmlAnnotationIntrospector51.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember53 = null;
        java.lang.String str54 = jacksonXmlAnnotationIntrospector51.findImplicitPropertyName(annotatedMember53);
        byte[] byteArray55 = xmlMapper50.writeValueAsBytes((java.lang.Object) str54);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = xmlFactory45.createJsonParser(byteArray55);
        boolean boolean57 = jsonParser56.getValueAsBoolean();
        java.io.Writer writer58 = null;
        int int59 = jsonParser56.releaseBuffered(writer58);
        jsonParser56.setRequestPayloadOnError("XML");
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator33.copyCurrentEvent(jsonParser56);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter26);
        org.junit.Assert.assertNotNull(xmlFactory27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature28.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory29);
        org.junit.Assert.assertNotNull(objectCodec30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNull(formatSchema36);
        org.junit.Assert.assertNull(characterEscapes37);
        org.junit.Assert.assertNotNull(objectWriter42);
        org.junit.Assert.assertNotNull(xmlFactory43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature44.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory45);
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNull(outputDecorator48);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory23);
        com.fasterxml.jackson.core.FormatSchema formatSchema25 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter26 = xmlMapper24.writer(formatSchema25);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter27 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper24.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter27);
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler29 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = objectMapper28.addHandler(deserializationProblemHandler29);
        jsonParser16.setCurrentValue((java.lang.Object) objectMapper28);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider32 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper28.setFilterProvider(filterProvider32);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper28);
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectWriter26);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(objectMapper33);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper3 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter5 = xmlMapper3.writer(formatSchema4);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter6 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = xmlMapper3.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter6);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature8 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean9 = feature8.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper3.enable(feature8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper1.enable(feature8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper1.findAndRegisterModules();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper1.enableDefaultTypingAsProperty(defaultTyping13, "/");
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory16);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper17.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = xmlMapper17.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature20 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = xmlFactory19.enable(feature20);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = xmlFactory21.setInputDecorator(inputDecorator22);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator24 = xmlFactory21.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper26 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory25);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector27 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version28 = jacksonXmlAnnotationIntrospector27.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember29 = null;
        java.lang.String str30 = jacksonXmlAnnotationIntrospector27.findImplicitPropertyName(annotatedMember29);
        byte[] byteArray31 = xmlMapper26.writeValueAsBytes((java.lang.Object) str30);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = xmlFactory21.createJsonParser(byteArray31);
        boolean boolean33 = jsonParser32.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser32.setFeatureMask((int) (short) -1);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        boolean boolean37 = jsonParser32.nextFieldName(serializableString36);
        int int39 = jsonParser32.nextIntValue(0);
        javax.xml.stream.XMLInputFactory xMLInputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory40);
        com.fasterxml.jackson.core.FormatSchema formatSchema42 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter43 = xmlMapper41.writer(formatSchema42);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter44 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = xmlMapper41.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter44);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature46 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean47 = feature46.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper48 = xmlMapper41.enable(feature46);
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper50 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory49);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter51 = xmlMapper50.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = xmlMapper50.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature53 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory54 = xmlFactory52.enable(feature53);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass55 = xmlFactory52.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader56 = objectMapper48.readerWithView(featureClass55);
        com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature57 = jsonParser32.readValueAs(featureClass55);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder58 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig59 = null;
        com.fasterxml.jackson.databind.JavaType javaType60 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray61 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList62 = new java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList62, namedTypeArray61);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer64 = stdTypeResolverBuilder58.buildTypeDeserializer(deserializationConfig59, javaType60, (java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList62);
        java.lang.String str65 = stdTypeResolverBuilder58.getTypeProperty();
        boolean boolean66 = stdTypeResolverBuilder58.isTypeIdVisible();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder68 = stdTypeResolverBuilder58.typeIdVisibility(false);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector69 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version70 = jacksonXmlAnnotationIntrospector69.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated71 = null;
        java.lang.String[] strArray72 = jacksonXmlAnnotationIntrospector69.findPropertiesToIgnore(annotated71);
        javax.xml.stream.XMLInputFactory xMLInputFactory73 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper74 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory73);
        com.fasterxml.jackson.core.FormatSchema formatSchema75 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter76 = xmlMapper74.writer(formatSchema75);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter77 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper78 = xmlMapper74.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter77);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature79 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean80 = feature79.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper81 = xmlMapper74.enable(feature79);
        javax.xml.stream.XMLInputFactory xMLInputFactory82 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper83 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory82);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter84 = xmlMapper83.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory85 = xmlMapper83.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature86 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory87 = xmlFactory85.enable(feature86);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass88 = xmlFactory85.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader89 = objectMapper81.readerWithView(featureClass88);
        java.lang.Enum[] enumArray91 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray92 = (java.lang.Enum<?>[]) enumArray91;
        java.lang.String[] strArray95 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray96 = jacksonXmlAnnotationIntrospector69.findEnumValues(featureClass88, wildcardEnumArray92, strArray95);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder97 = stdTypeResolverBuilder68.defaultImpl(featureClass88);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature98 = objectMapper15.readValue(jsonParser32, featureClass88);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: No content to map due to end-of-input? at [Source: [B@1b1db2be; line: 1, column: 8]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature8.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(xmlFactory19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature20.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory21);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNull(outputDecorator24);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objectWriter43);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature46.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertNotNull(objectWriter51);
        org.junit.Assert.assertNotNull(xmlFactory52);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature53.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory54);
        org.junit.Assert.assertNotNull(featureClass55);
        org.junit.Assert.assertNotNull(objectReader56);
        org.junit.Assert.assertNull(feature57);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder58);
        org.junit.Assert.assertNotNull(namedTypeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(typeDeserializer64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder68);
        org.junit.Assert.assertNotNull(version70);
        org.junit.Assert.assertNull(strArray72);
        org.junit.Assert.assertNotNull(objectWriter76);
        org.junit.Assert.assertNotNull(objectMapper78);
        org.junit.Assert.assertTrue("'" + feature79 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature79.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(objectMapper81);
        org.junit.Assert.assertNotNull(objectWriter84);
        org.junit.Assert.assertNotNull(xmlFactory85);
        org.junit.Assert.assertTrue("'" + feature86 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature86.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory87);
        org.junit.Assert.assertNotNull(featureClass88);
        org.junit.Assert.assertNotNull(objectReader89);
        org.junit.Assert.assertNotNull(enumArray91);
        org.junit.Assert.assertNotNull(wildcardEnumArray92);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder97);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        byte byte18 = jsonParser16.getByteValue();
        java.lang.Object obj19 = jsonParser16.getInputSource();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonParser16.setFeatureMask((int) (short) -1);
        com.fasterxml.jackson.core.SerializableString serializableString20 = null;
        boolean boolean21 = jsonParser16.nextFieldName(serializableString20);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonParser16.setFeatureMask(56319);
        boolean boolean24 = jsonParser23.canReadObjectId();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(jacksonXmlModule17);
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory19);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = xmlMapper20.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.setNodeFactory(jsonNodeFactory21);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker23 = objectMapper22.getVisibilityChecker();
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = objectMapper22.writer(formatSchema24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = xmlFactory5.setCodec((com.fasterxml.jackson.core.ObjectCodec) objectMapper22);
        java.text.DateFormat dateFormat27 = objectMapper22.getDateFormat();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonNodeFactory21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker23);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(dateFormat27);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = xmlFactory5.setCharacterEscapes(characterEscapes8);
        xmlFactory5.setXMLTextElementName("hi!");
        java.io.DataOutput dataOutput12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = xmlFactory5.createGenerator(dataOutput12);
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(xMLInputFactory14);
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory16);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper17.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper17.setNodeFactory(jsonNodeFactory19);
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory21);
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(formatSchema23);
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray25 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        xmlMapper22.registerSubtypes(namedTypeArray25);
        objectMapper20.registerSubtypes(namedTypeArray25);
        com.fasterxml.jackson.databind.InjectableValues injectableValues28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = objectMapper20.setInjectableValues(injectableValues28);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector30 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version31 = jacksonXmlAnnotationIntrospector30.version();
        byte[] byteArray32 = objectMapper20.writeValueAsBytes((java.lang.Object) version31);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = xmlFactory15.createJsonParser(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator13.writeBinary(byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No element/attribute name specified when trying to output element");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(namedTypeArray25);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[60, 86, 101, 114, 115, 105, 111, 110, 62, 60, 109, 97, 106, 111, 114, 86, 101, 114, 115, 105, 111, 110, 62, 50, 60, 47, 109, 97, 106, 111, 114, 86, 101, 114, 115, 105, 111, 110, 62, 60, 109, 105, 110, 111, 114, 86, 101, 114, 115, 105, 111, 110, 62, 56, 60, 47, 109, 105, 110, 111, 114, 86, 101, 114, 115, 105, 111, 110, 62, 60, 117, 110, 107, 110, 111, 119, 110, 86, 101, 114, 115, 105, 111, 110, 62, 102, 97, 108, 115, 101, 60, 47, 117, 110, 107, 110, 111, 119, 110, 86, 101, 114, 115, 105, 111, 110, 62, 60, 115, 110, 97, 112, 115, 104, 111, 116, 62, 116, 114, 117, 101, 60, 47, 115, 110, 97, 112, 115, 104, 111, 116, 62, 60, 117, 107, 110, 111, 119, 110, 86, 101, 114, 115, 105, 111, 110, 62, 102, 97, 108, 115, 101, 60, 47, 117, 107, 110, 111, 119, 110, 86, 101, 114, 115, 105, 111, 110, 62, 60, 112, 97, 116, 99, 104, 76, 101, 118, 101, 108, 62, 48, 60, 47, 112, 97, 116, 99, 104, 76, 101, 118, 101, 108, 62, 60, 103, 114, 111, 117, 112, 73, 100, 62, 99, 111, 109, 46, 102, 97, 115, 116, 101, 114, 120, 109, 108, 46, 106, 97, 99, 107, 115, 111, 110, 46, 99, 111, 114, 101, 60, 47, 103, 114, 111, 117, 112, 73, 100, 62, 60, 97, 114, 116, 105, 102, 97, 99, 116, 73, 100, 62, 106, 97, 99, 107, 115, 111, 110, 45, 100, 97, 116, 97, 98, 105, 110, 100, 60, 47, 97, 114, 116, 105, 102, 97, 99, 116, 73, 100, 62, 60, 47, 86, 101, 114, 115, 105, 111, 110, 62]");
        org.junit.Assert.assertNotNull(jsonParser33);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xmlFactory5.isEnabled(feature17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        boolean boolean19 = jsonParser16.getValueAsBoolean();
        java.lang.String str20 = jsonParser16.nextFieldName();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        javax.xml.stream.XMLInputFactory xMLInputFactory6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory8 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(xMLInputFactory8, xMLOutputFactory9);
        xmlFactory10.setXMLTextElementName("hi!");
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = xmlFactory10.getXMLOutputFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory7, xMLOutputFactory13);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper5, xMLInputFactory6, xMLOutputFactory13);
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory16);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper17.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper17.setNodeFactory(jsonNodeFactory19);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory21 = xmlMapper17.getSerializerFactory();
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory22);
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = xmlMapper23.writer(formatSchema24);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter26 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = xmlMapper23.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter26);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature28 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean29 = feature28.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = xmlMapper23.enable(feature28);
        javax.xml.stream.XMLInputFactory xMLInputFactory31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper32 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory31);
        com.fasterxml.jackson.core.FormatSchema formatSchema33 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter34 = xmlMapper32.writer(formatSchema33);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter35 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = xmlMapper32.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature37 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean38 = feature37.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = xmlMapper32.enable(feature37);
        javax.xml.stream.XMLInputFactory xMLInputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory40);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter42 = xmlMapper41.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = xmlMapper41.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature44 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = xmlFactory43.enable(feature44);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass46 = xmlFactory43.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader47 = objectMapper39.readerWithView(featureClass46);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter48 = xmlMapper23.writerFor(featureClass46);
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper50 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory49);
        com.fasterxml.jackson.core.FormatSchema formatSchema51 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter52 = xmlMapper50.writer(formatSchema51);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter53 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper54 = xmlMapper50.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter53);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature55 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean56 = feature55.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper50.enable(feature55);
        javax.xml.stream.XMLInputFactory xMLInputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper59 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory58);
        com.fasterxml.jackson.core.FormatSchema formatSchema60 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter61 = xmlMapper59.writer(formatSchema60);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter62 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper63 = xmlMapper59.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter62);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature64 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean65 = feature64.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = xmlMapper59.enable(feature64);
        javax.xml.stream.XMLInputFactory xMLInputFactory67 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper68 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory67);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter69 = xmlMapper68.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory70 = xmlMapper68.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature71 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory72 = xmlFactory70.enable(feature71);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass73 = xmlFactory70.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader74 = objectMapper66.readerWithView(featureClass73);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter75 = xmlMapper50.writerFor(featureClass73);
        xmlMapper17.addMixInAnnotations(featureClass46, featureClass73);
        java.lang.Object obj77 = null;
        byte[] byteArray78 = xmlMapper17.writeValueAsBytes(obj77);
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = objectMapper5.readTree(byteArray78);
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(xMLOutputFactory13);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(serializerFactory21);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature28.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(objectWriter34);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature37.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectWriter42);
        org.junit.Assert.assertNotNull(xmlFactory43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature44.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory45);
        org.junit.Assert.assertNotNull(featureClass46);
        org.junit.Assert.assertNotNull(objectReader47);
        org.junit.Assert.assertNotNull(objectWriter48);
        org.junit.Assert.assertNotNull(objectWriter52);
        org.junit.Assert.assertNotNull(objectMapper54);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature55.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertNotNull(objectWriter61);
        org.junit.Assert.assertNotNull(objectMapper63);
        org.junit.Assert.assertTrue("'" + feature64 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature64.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectMapper66);
        org.junit.Assert.assertNotNull(objectWriter69);
        org.junit.Assert.assertNotNull(xmlFactory70);
        org.junit.Assert.assertTrue("'" + feature71 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature71.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory72);
        org.junit.Assert.assertNotNull(featureClass73);
        org.junit.Assert.assertNotNull(objectReader74);
        org.junit.Assert.assertNotNull(objectWriter75);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonNode79);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.core.FormatSchema formatSchema2 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper1.writer(formatSchema2);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter4 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter4);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        defaultXmlPrettyPrinter4.beforeArrayValues(jsonGenerator6);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter8 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        defaultXmlPrettyPrinter8.spacesInObjectEntries(true);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        defaultXmlPrettyPrinter8.writeArrayValueSeparator(jsonGenerator11);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        defaultXmlPrettyPrinter8.writeStartArray(jsonGenerator13);
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory15);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper16.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlMapper16.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature19 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = xmlFactory18.enable(feature19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = xmlFactory18.getCodec();
        boolean boolean22 = xmlFactory18.canHandleBinaryNatively();
        java.io.DataOutput dataOutput23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = xmlFactory18.createGenerator(dataOutput23);
        defaultXmlPrettyPrinter8.writeRootValueSeparator(jsonGenerator24);
        defaultXmlPrettyPrinter4.writeArrayValueSeparator(jsonGenerator24);
        jsonGenerator24.writeStartArray(0);
        com.fasterxml.jackson.core.FormatSchema formatSchema29 = null;
        boolean boolean30 = jsonGenerator24.canUseSchema(formatSchema29);
        javax.xml.stream.XMLInputFactory xMLInputFactory31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper32 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory31);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter33 = xmlMapper32.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = xmlMapper32.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature35 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = xmlFactory34.enable(feature35);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = xmlFactory36.setInputDecorator(inputDecorator37);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator39 = xmlFactory36.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory40);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector42 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version43 = jacksonXmlAnnotationIntrospector42.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember44 = null;
        java.lang.String str45 = jacksonXmlAnnotationIntrospector42.findImplicitPropertyName(annotatedMember44);
        byte[] byteArray46 = xmlMapper41.writeValueAsBytes((java.lang.Object) str45);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = xmlFactory36.createJsonParser(byteArray46);
        java.io.Writer writer48 = null;
        int int49 = jsonParser47.releaseBuffered(writer48);
        long long51 = jsonParser47.nextLongValue((long) 100);
        jsonParser47.finishToken();
        byte byte53 = jsonParser47.getByteValue();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator24.copyCurrentStructure(jsonParser47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No element/attribute name specified when trying to output element");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature19.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory20);
        org.junit.Assert.assertNotNull(objectCodec21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectWriter33);
        org.junit.Assert.assertNotNull(xmlFactory34);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature35.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNull(outputDecorator39);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 0 + "'", byte53 == (byte) 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        java.io.Writer writer18 = null;
        int int19 = jsonParser16.releaseBuffered(writer18);
        jsonParser16.setRequestPayloadOnError("XML");
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = null;
        boolean boolean23 = jsonParser16.canUseSchema(formatSchema22);
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory1);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter3 = xmlMapper2.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper2.setNodeFactory(jsonNodeFactory4);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes6 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader7 = objectMapper5.reader(contextAttributes6);
        javax.xml.stream.XMLInputFactory xMLInputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper9.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper9.setNodeFactory(jsonNodeFactory11);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory13 = objectMapper12.getSerializerFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper5.setSerializerFactory(serializerFactory13);
        boolean boolean15 = objJsonSerializer0.isEmpty((java.lang.Object) objectMapper14);
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory16);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(formatSchema18);
        com.fasterxml.jackson.core.Base64Variant base64Variant20 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper17.setBase64Variant(base64Variant20);
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter23 = xmlMapper17.writerFor(javaType22);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector24 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version25 = jacksonXmlAnnotationIntrospector24.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated26 = null;
        java.lang.String[] strArray27 = jacksonXmlAnnotationIntrospector24.findPropertiesToIgnore(annotated26);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper17.setAnnotationIntrospector((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonXmlAnnotationIntrospector24);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector29 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version30 = jacksonXmlAnnotationIntrospector29.version();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector31 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version32 = jacksonXmlAnnotationIntrospector31.version();
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair33 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonXmlAnnotationIntrospector29, (com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonXmlAnnotationIntrospector31);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair34 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) jacksonXmlAnnotationIntrospector24, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory35);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter37 = xmlMapper36.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = xmlMapper36.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature39 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = xmlFactory38.enable(feature39);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass41 = xmlFactory38.getFormatReadFeatureType();
        java.lang.Enum[] enumArray43 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray44 = (java.lang.Enum<?>[]) enumArray43;
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector45 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version46 = jacksonXmlAnnotationIntrospector45.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated47 = null;
        java.lang.String[] strArray48 = jacksonXmlAnnotationIntrospector45.findPropertiesToIgnore(annotated47);
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper50 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory49);
        com.fasterxml.jackson.core.FormatSchema formatSchema51 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter52 = xmlMapper50.writer(formatSchema51);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter53 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper54 = xmlMapper50.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter53);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature55 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean56 = feature55.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper50.enable(feature55);
        javax.xml.stream.XMLInputFactory xMLInputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper59 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory58);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter60 = xmlMapper59.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory61 = xmlMapper59.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature62 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory63 = xmlFactory61.enable(feature62);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass64 = xmlFactory61.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader65 = objectMapper57.readerWithView(featureClass64);
        java.lang.Enum[] enumArray67 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray68 = (java.lang.Enum<?>[]) enumArray67;
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray72 = jacksonXmlAnnotationIntrospector45.findEnumValues(featureClass64, wildcardEnumArray68, strArray71);
        java.lang.String[] strArray73 = jacksonXmlAnnotationIntrospector24.findEnumValues(featureClass41, (java.lang.Enum<?>[]) enumArray43, strArray71);
        com.fasterxml.jackson.databind.ObjectReader objectReader74 = objectMapper14.readerWithView(featureClass41);
        javax.xml.stream.XMLInputFactory xMLInputFactory75 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper76 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory75);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter77 = xmlMapper76.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory78 = xmlMapper76.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature79 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory80 = xmlFactory78.enable(feature79);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator81 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory82 = xmlFactory80.setInputDecorator(inputDecorator81);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator83 = xmlFactory80.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory84 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper85 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory84);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector86 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version87 = jacksonXmlAnnotationIntrospector86.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember88 = null;
        java.lang.String str89 = jacksonXmlAnnotationIntrospector86.findImplicitPropertyName(annotatedMember88);
        byte[] byteArray90 = xmlMapper85.writeValueAsBytes((java.lang.Object) str89);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = xmlFactory80.createJsonParser(byteArray90);
        java.io.Writer writer92 = null;
        int int93 = jsonParser91.releaseBuffered(writer92);
        boolean boolean94 = jsonParser91.getValueAsBoolean();
        java.lang.String str95 = jsonParser91.nextFieldName();
        com.fasterxml.jackson.databind.JavaType javaType96 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.MappingIterator<java.lang.String[]> strArrayItor97 = objectMapper14.readValues(jsonParser91, javaType96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objectWriter3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectReader7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(serializerFactory13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectWriter23);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(pair34);
        org.junit.Assert.assertNotNull(objectWriter37);
        org.junit.Assert.assertNotNull(xmlFactory38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature39.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory40);
        org.junit.Assert.assertNotNull(featureClass41);
        org.junit.Assert.assertNotNull(enumArray43);
        org.junit.Assert.assertNotNull(wildcardEnumArray44);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(objectWriter52);
        org.junit.Assert.assertNotNull(objectMapper54);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature55.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertNotNull(objectWriter60);
        org.junit.Assert.assertNotNull(xmlFactory61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature62.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory63);
        org.junit.Assert.assertNotNull(featureClass64);
        org.junit.Assert.assertNotNull(objectReader65);
        org.junit.Assert.assertNotNull(enumArray67);
        org.junit.Assert.assertNotNull(wildcardEnumArray68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(objectReader74);
        org.junit.Assert.assertNotNull(objectWriter77);
        org.junit.Assert.assertNotNull(xmlFactory78);
        org.junit.Assert.assertTrue("'" + feature79 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature79.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory80);
        org.junit.Assert.assertNotNull(jsonFactory82);
        org.junit.Assert.assertNull(outputDecorator83);
        org.junit.Assert.assertNotNull(version87);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        java.io.Writer writer18 = null;
        int int19 = jsonParser16.releaseBuffered(writer18);
        jsonParser16.setRequestPayloadOnError("XML");
        java.lang.Object obj22 = jsonParser16.getInputSource();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        long long20 = jsonParser16.nextLongValue((long) 100);
        jsonParser16.finishToken();
        int int23 = jsonParser16.nextIntValue((int) (short) 1);
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        long long22 = jsonParser16.nextLongValue((-1L));
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        java.io.Writer writer18 = null;
        int int19 = jsonParser16.releaseBuffered(writer18);
        jsonParser16.finishToken();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(jacksonXmlModule17);
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory19);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = xmlMapper20.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.setNodeFactory(jsonNodeFactory21);
        com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> wildcardVisibilityChecker23 = objectMapper22.getVisibilityChecker();
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = objectMapper22.writer(formatSchema24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = xmlFactory5.setCodec((com.fasterxml.jackson.core.ObjectCodec) objectMapper22);
        boolean boolean27 = xmlFactory5.canUseCharArrays();
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonNodeFactory21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(wildcardVisibilityChecker23);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        java.io.Writer writer17 = null;
        int int18 = jsonParser16.releaseBuffered(writer17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        boolean boolean20 = jsonParser16.canUseSchema(formatSchema19);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload21 = null;
        jsonParser16.setRequestPayloadOnError(requestPayload21);
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory23);
        com.fasterxml.jackson.core.FormatSchema formatSchema25 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter26 = xmlMapper24.writer(formatSchema25);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter27 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper24.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter27);
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler29 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = objectMapper28.addHandler(deserializationProblemHandler29);
        jsonParser16.setCurrentValue((java.lang.Object) objectMapper28);
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper33 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory32);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter34 = xmlMapper33.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory35 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = xmlMapper33.setNodeFactory(jsonNodeFactory35);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper36);
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader39 = objectMapper36.reader(javaType38);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder40 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig41 = null;
        com.fasterxml.jackson.databind.JavaType javaType42 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray43 = new com.fasterxml.jackson.databind.jsontype.NamedType[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList44 = new java.util.ArrayList<com.fasterxml.jackson.databind.jsontype.NamedType>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList44, namedTypeArray43);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer46 = stdTypeResolverBuilder40.buildTypeDeserializer(deserializationConfig41, javaType42, (java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>) namedTypeList44);
        java.lang.String str47 = stdTypeResolverBuilder40.getTypeProperty();
        boolean boolean48 = stdTypeResolverBuilder40.isTypeIdVisible();
        java.lang.String str49 = stdTypeResolverBuilder40.getTypeProperty();
        java.lang.String str50 = stdTypeResolverBuilder40.getTypeProperty();
        javax.xml.stream.XMLInputFactory xMLInputFactory51 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper52 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory51);
        com.fasterxml.jackson.core.FormatSchema formatSchema53 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter54 = xmlMapper52.writer(formatSchema53);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory55 = xmlMapper52.getSerializerFactory();
        com.fasterxml.jackson.core.JsonParser jsonParser56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper58 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory57);
        com.fasterxml.jackson.core.FormatSchema formatSchema59 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter60 = xmlMapper58.writer(formatSchema59);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter61 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper62 = xmlMapper58.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter61);
        com.fasterxml.jackson.core.FormatSchema formatSchema63 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader64 = objectMapper62.reader(formatSchema63);
        javax.xml.stream.XMLInputFactory xMLInputFactory65 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper66 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory65);
        com.fasterxml.jackson.core.FormatSchema formatSchema67 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter68 = xmlMapper66.writer(formatSchema67);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter69 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper70 = xmlMapper66.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter69);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature71 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean72 = feature71.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper73 = xmlMapper66.enable(feature71);
        javax.xml.stream.XMLInputFactory xMLInputFactory74 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper75 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory74);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter76 = xmlMapper75.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory77 = xmlMapper75.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature78 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory79 = xmlFactory77.enable(feature78);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass80 = xmlFactory77.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader81 = objectMapper73.readerWithView(featureClass80);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter82 = objectMapper62.writerWithView(featureClass80);
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor83 = xmlMapper52.readValues(jsonParser56, featureClass80);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder84 = stdTypeResolverBuilder40.defaultImpl(featureClass80);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter85 = objectMapper36.writerWithView(featureClass80);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature86 = jsonParser16.readValueAs(featureClass80);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not deserialize instance of com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature out of START_OBJECT token? at [Source: [B@14cc6670; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectWriter26);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(objectWriter34);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(objectReader39);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder40);
        org.junit.Assert.assertNotNull(namedTypeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(typeDeserializer46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(objectWriter54);
        org.junit.Assert.assertNotNull(serializerFactory55);
        org.junit.Assert.assertNotNull(objectWriter60);
        org.junit.Assert.assertNotNull(objectMapper62);
        org.junit.Assert.assertNotNull(objectReader64);
        org.junit.Assert.assertNotNull(objectWriter68);
        org.junit.Assert.assertNotNull(objectMapper70);
        org.junit.Assert.assertTrue("'" + feature71 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature71.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objectMapper73);
        org.junit.Assert.assertNotNull(objectWriter76);
        org.junit.Assert.assertNotNull(xmlFactory77);
        org.junit.Assert.assertTrue("'" + feature78 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature78.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory79);
        org.junit.Assert.assertNotNull(featureClass80);
        org.junit.Assert.assertNotNull(objectReader81);
        org.junit.Assert.assertNotNull(objectWriter82);
        org.junit.Assert.assertNotNull(featureItor83);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder84);
        org.junit.Assert.assertNotNull(objectWriter85);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter2 = xmlMapper1.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = xmlMapper1.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.enable(feature4);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setInputDecorator(inputDecorator6);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = xmlFactory5.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory9);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector11 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version12 = jacksonXmlAnnotationIntrospector11.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = null;
        java.lang.String str14 = jacksonXmlAnnotationIntrospector11.findImplicitPropertyName(annotatedMember13);
        byte[] byteArray15 = xmlMapper10.writeValueAsBytes((java.lang.Object) str14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = xmlFactory5.createJsonParser(byteArray15);
        boolean boolean17 = jsonParser16.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonParser16.setFeatureMask((int) (short) -1);
        com.fasterxml.jackson.core.SerializableString serializableString20 = null;
        boolean boolean21 = jsonParser16.nextFieldName(serializableString20);
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory22);
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = xmlMapper23.writer(formatSchema24);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter26 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = xmlMapper23.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter26);
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = objectMapper27.addHandler(deserializationProblemHandler28);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector30 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version31 = jacksonXmlAnnotationIntrospector30.version();
        com.fasterxml.jackson.databind.introspect.Annotated annotated32 = null;
        java.lang.String[] strArray33 = jacksonXmlAnnotationIntrospector30.findPropertiesToIgnore(annotated32);
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper35 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory34);
        com.fasterxml.jackson.core.FormatSchema formatSchema36 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter37 = xmlMapper35.writer(formatSchema36);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter38 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = xmlMapper35.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter38);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature40 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean41 = feature40.enabledByDefault();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper35.enable(feature40);
        javax.xml.stream.XMLInputFactory xMLInputFactory43 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper44 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory43);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter45 = xmlMapper44.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = xmlMapper44.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature47 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory48 = xmlFactory46.enable(feature47);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass49 = xmlFactory46.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader50 = objectMapper42.readerWithView(featureClass49);
        java.lang.Enum[] enumArray52 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray53 = (java.lang.Enum<?>[]) enumArray52;
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray57 = jacksonXmlAnnotationIntrospector30.findEnumValues(featureClass49, wildcardEnumArray53, strArray56);
        com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema58 = objectMapper29.generateJsonSchema(featureClass49);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper59 = objectMapper29.disableDefaultTyping();
        javax.xml.stream.XMLInputFactory xMLInputFactory60 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory60);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter62 = xmlMapper61.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory63 = xmlMapper61.getFactory();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature64 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory65 = xmlFactory63.enable(feature64);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator66 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory67 = xmlFactory65.setInputDecorator(inputDecorator66);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator68 = xmlFactory65.getOutputDecorator();
        javax.xml.stream.XMLInputFactory xMLInputFactory69 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper70 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory69);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector71 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.core.Version version72 = jacksonXmlAnnotationIntrospector71.version();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember73 = null;
        java.lang.String str74 = jacksonXmlAnnotationIntrospector71.findImplicitPropertyName(annotatedMember73);
        byte[] byteArray75 = xmlMapper70.writeValueAsBytes((java.lang.Object) str74);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = xmlFactory65.createJsonParser(byteArray75);
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = objectMapper29.readTree(byteArray75);
        jsonParser16.setRequestPayloadOnError(byteArray75, "JSON");
        org.junit.Assert.assertNotNull(objectWriter2);
        org.junit.Assert.assertNotNull(xmlFactory3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(objectWriter37);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature40.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectWriter45);
        org.junit.Assert.assertNotNull(xmlFactory46);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature47.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory48);
        org.junit.Assert.assertNotNull(featureClass49);
        org.junit.Assert.assertNotNull(objectReader50);
        org.junit.Assert.assertNotNull(enumArray52);
        org.junit.Assert.assertNotNull(wildcardEnumArray53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(jsonSchema58);
        org.junit.Assert.assertNotNull(objectMapper59);
        org.junit.Assert.assertNotNull(objectWriter62);
        org.junit.Assert.assertNotNull(xmlFactory63);
        org.junit.Assert.assertTrue("'" + feature64 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature64.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertNotNull(xmlFactory65);
        org.junit.Assert.assertNotNull(jsonFactory67);
        org.junit.Assert.assertNull(outputDecorator68);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertNotNull(jsonNode77);
    }
}
