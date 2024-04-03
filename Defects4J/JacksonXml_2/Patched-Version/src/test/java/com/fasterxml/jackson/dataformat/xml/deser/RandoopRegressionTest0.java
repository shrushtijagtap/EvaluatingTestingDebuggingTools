package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test01");
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory0 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = xmlMapper1.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.setMixInResolver(mixInResolver4);
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setSerializationInclusion(include6);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper8.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.setMixInResolver(mixInResolver11);
        com.fasterxml.jackson.annotation.JsonInclude.Include include13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.setSerializationInclusion(include13);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean16 = xmlFactory15.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        boolean boolean18 = xmlFactory15.canUseSchema(formatSchema17);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = xmlFactory15.getInputDecorator();
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = xmlFactory15.createGenerator(dataOutput20, jsonEncoding21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass23 = xmlFactory15.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper12.readerWithView(featureClass23);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference25 = null;
        boolean boolean26 = objectMapper5.canSerialize(featureClass23, throwableAtomicReference25);
        java.lang.Object obj27 = null;
        byte[] byteArray28 = objectMapper5.writeValueAsBytes(obj27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = xmlFactory0.createJsonParser(byteArray28);
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = jsonParser29.readBinaryValue(outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Operation not supported by parser of type com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser29);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test02");
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory0 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = xmlMapper1.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.setMixInResolver(mixInResolver4);
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setSerializationInclusion(include6);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper8.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.setMixInResolver(mixInResolver11);
        com.fasterxml.jackson.annotation.JsonInclude.Include include13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.setSerializationInclusion(include13);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean16 = xmlFactory15.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        boolean boolean18 = xmlFactory15.canUseSchema(formatSchema17);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = xmlFactory15.getInputDecorator();
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = xmlFactory15.createGenerator(dataOutput20, jsonEncoding21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass23 = xmlFactory15.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper12.readerWithView(featureClass23);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference25 = null;
        boolean boolean26 = objectMapper5.canSerialize(featureClass23, throwableAtomicReference25);
        java.lang.Object obj27 = null;
        byte[] byteArray28 = objectMapper5.writeValueAsBytes(obj27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = xmlFactory0.createJsonParser(byteArray28);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper31 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = xmlMapper31.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper32.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver34 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper32.setMixInResolver(mixInResolver34);
        com.fasterxml.jackson.annotation.JsonInclude.Include include36 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper37 = objectMapper35.setSerializationInclusion(include36);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper38 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = xmlMapper38.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = objectMapper39.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = objectMapper39.setMixInResolver(mixInResolver41);
        com.fasterxml.jackson.annotation.JsonInclude.Include include43 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper42.setSerializationInclusion(include43);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean46 = xmlFactory45.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema47 = null;
        boolean boolean48 = xmlFactory45.canUseSchema(formatSchema47);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator49 = xmlFactory45.getInputDecorator();
        java.io.DataOutput dataOutput50 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding51 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = xmlFactory45.createGenerator(dataOutput50, jsonEncoding51);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass53 = xmlFactory45.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader54 = objectMapper42.readerWithView(featureClass53);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference55 = null;
        boolean boolean56 = objectMapper35.canSerialize(featureClass53, throwableAtomicReference55);
        java.lang.Object obj57 = null;
        byte[] byteArray58 = objectMapper35.writeValueAsBytes(obj57);
        com.fasterxml.jackson.core.JsonParser jsonParser59 = xmlFactory30.createJsonParser(byteArray58);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser62 = xmlFactory0.createParser(byteArray58, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxEOFException: Unexpected EOF in prolog? at [row,col {unknown-source}]: [1,0]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(inputDecorator49);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertNotNull(featureClass53);
        org.junit.Assert.assertNotNull(objectReader54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser59);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test03");
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper0 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory1 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = xmlFactory1.getXMLOutputFactory();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass3 = xmlFactory1.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType4 = xmlMapper0.constructType((java.lang.reflect.Type) featureClass3);
        com.fasterxml.jackson.core.Base64Variant base64Variant5 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter6 = xmlMapper0.writer(base64Variant5);
        java.text.DateFormat dateFormat7 = xmlMapper0.getDateFormat();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = xmlMapper0.writer(base64Variant8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper0.copy();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper12.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper13.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver15 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper13.setMixInResolver(mixInResolver15);
        com.fasterxml.jackson.annotation.JsonInclude.Include include17 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper16.setSerializationInclusion(include17);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper19.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver22 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = objectMapper20.setMixInResolver(mixInResolver22);
        com.fasterxml.jackson.annotation.JsonInclude.Include include24 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = objectMapper23.setSerializationInclusion(include24);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean27 = xmlFactory26.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema28 = null;
        boolean boolean29 = xmlFactory26.canUseSchema(formatSchema28);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator30 = xmlFactory26.getInputDecorator();
        java.io.DataOutput dataOutput31 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = xmlFactory26.createGenerator(dataOutput31, jsonEncoding32);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass34 = xmlFactory26.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader35 = objectMapper23.readerWithView(featureClass34);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference36 = null;
        boolean boolean37 = objectMapper16.canSerialize(featureClass34, throwableAtomicReference36);
        java.lang.Object obj38 = null;
        byte[] byteArray39 = objectMapper16.writeValueAsBytes(obj38);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = xmlFactory11.createJsonParser(byteArray39);
        java.io.OutputStream outputStream41 = null;
        int int42 = jsonParser40.releaseBuffered(outputStream41);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper43 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = xmlMapper43.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = objectMapper44.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = objectMapper45.getSerializerProviderInstance();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer47 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer49 = objJsonSerializer47.unwrappingSerializer(nameTransformer48);
        com.fasterxml.jackson.databind.BeanProperty beanProperty50 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer51 = serializerProvider46.handlePrimaryContextualization(objJsonSerializer49, beanProperty50);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer52 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer53 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer54 = objJsonSerializer52.unwrappingSerializer(nameTransformer53);
        serializerProvider46.setNullKeySerializer(objJsonSerializer54);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper56 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper56.disableDefaultTyping();
        com.fasterxml.jackson.core.Version version58 = xmlMapper56.version();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory60 = xmlFactory59.getXMLOutputFactory();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass61 = xmlFactory59.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType62 = xmlMapper56.constructType((java.lang.reflect.Type) featureClass61);
        com.fasterxml.jackson.databind.BeanProperty beanProperty63 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer64 = serializerProvider46.findKeySerializer(javaType62, beanProperty63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[] wildcardClassArray65 = xmlMapper0.readValue(jsonParser40, javaType62);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not deserialize instance of com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature out of START_OBJECT token? at [Source: [B@673e239b; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLOutputFactory2);
        org.junit.Assert.assertNotNull(featureClass3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputDecorator30);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(featureClass34);
        org.junit.Assert.assertNotNull(objectReader35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertNotNull(serializerProvider46);
        org.junit.Assert.assertNotNull(objJsonSerializer47);
        org.junit.Assert.assertNotNull(objJsonSerializer49);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer51);
        org.junit.Assert.assertNotNull(objJsonSerializer52);
        org.junit.Assert.assertNotNull(objJsonSerializer54);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertNotNull(version58);
        org.junit.Assert.assertNotNull(xMLOutputFactory60);
        org.junit.Assert.assertNotNull(featureClass61);
        org.junit.Assert.assertNotNull(javaType62);
        org.junit.Assert.assertNotNull(objJsonSerializer64);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test04");
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory0 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = xmlMapper1.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.setMixInResolver(mixInResolver4);
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setSerializationInclusion(include6);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper8.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.setMixInResolver(mixInResolver11);
        com.fasterxml.jackson.annotation.JsonInclude.Include include13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.setSerializationInclusion(include13);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean16 = xmlFactory15.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        boolean boolean18 = xmlFactory15.canUseSchema(formatSchema17);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = xmlFactory15.getInputDecorator();
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = xmlFactory15.createGenerator(dataOutput20, jsonEncoding21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass23 = xmlFactory15.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper12.readerWithView(featureClass23);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference25 = null;
        boolean boolean26 = objectMapper5.canSerialize(featureClass23, throwableAtomicReference25);
        java.lang.Object obj27 = null;
        byte[] byteArray28 = objectMapper5.writeValueAsBytes(obj27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = xmlFactory0.createJsonParser(byteArray28);
        com.fasterxml.jackson.core.JsonParser.Feature feature30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = xmlFactory0.isEnabled(feature30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser29);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test05");
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory0 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = xmlMapper1.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.setMixInResolver(mixInResolver4);
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setSerializationInclusion(include6);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper8.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.setMixInResolver(mixInResolver11);
        com.fasterxml.jackson.annotation.JsonInclude.Include include13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.setSerializationInclusion(include13);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean16 = xmlFactory15.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        boolean boolean18 = xmlFactory15.canUseSchema(formatSchema17);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = xmlFactory15.getInputDecorator();
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = xmlFactory15.createGenerator(dataOutput20, jsonEncoding21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass23 = xmlFactory15.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper12.readerWithView(featureClass23);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference25 = null;
        boolean boolean26 = objectMapper5.canSerialize(featureClass23, throwableAtomicReference25);
        java.lang.Object obj27 = null;
        byte[] byteArray28 = objectMapper5.writeValueAsBytes(obj27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = xmlFactory0.createJsonParser(byteArray28);
        java.io.OutputStream outputStream30 = null;
        int int31 = jsonParser29.releaseBuffered(outputStream30);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonParser29.overrideStdFeatures((int) 'a', 0);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(jsonParser34);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test06");
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper0 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory1 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = xmlFactory1.getXMLOutputFactory();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass3 = xmlFactory1.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType4 = xmlMapper0.constructType((java.lang.reflect.Type) featureClass3);
        com.fasterxml.jackson.core.Base64Variant base64Variant5 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter6 = xmlMapper0.writer(base64Variant5);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper0.setTypeFactory(typeFactory7);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper0);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory9);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper12.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper13.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver15 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper13.setMixInResolver(mixInResolver15);
        com.fasterxml.jackson.annotation.JsonInclude.Include include17 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper16.setSerializationInclusion(include17);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper19.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver22 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = objectMapper20.setMixInResolver(mixInResolver22);
        com.fasterxml.jackson.annotation.JsonInclude.Include include24 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = objectMapper23.setSerializationInclusion(include24);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean27 = xmlFactory26.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema28 = null;
        boolean boolean29 = xmlFactory26.canUseSchema(formatSchema28);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator30 = xmlFactory26.getInputDecorator();
        java.io.DataOutput dataOutput31 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = xmlFactory26.createGenerator(dataOutput31, jsonEncoding32);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass34 = xmlFactory26.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader35 = objectMapper23.readerWithView(featureClass34);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference36 = null;
        boolean boolean37 = objectMapper16.canSerialize(featureClass34, throwableAtomicReference36);
        java.lang.Object obj38 = null;
        byte[] byteArray39 = objectMapper16.writeValueAsBytes(obj38);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = xmlFactory11.createJsonParser(byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser43 = xmlFactory9.createJsonParser(byteArray39, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xMLOutputFactory2);
        org.junit.Assert.assertNotNull(featureClass3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputDecorator30);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(featureClass34);
        org.junit.Assert.assertNotNull(objectReader35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser40);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test07");
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory0 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean1 = xmlFactory0.requiresPropertyOrdering();
        java.io.DataOutput dataOutput2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = xmlFactory0.createGenerator(dataOutput2);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = xmlMapper5.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper6.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = objectMapper6.setMixInResolver(mixInResolver8);
        com.fasterxml.jackson.annotation.JsonInclude.Include include10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.setSerializationInclusion(include10);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper12.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper13.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver15 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper13.setMixInResolver(mixInResolver15);
        com.fasterxml.jackson.annotation.JsonInclude.Include include17 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper16.setSerializationInclusion(include17);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean20 = xmlFactory19.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema21 = null;
        boolean boolean22 = xmlFactory19.canUseSchema(formatSchema21);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator23 = xmlFactory19.getInputDecorator();
        java.io.DataOutput dataOutput24 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding25 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = xmlFactory19.createGenerator(dataOutput24, jsonEncoding25);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass27 = xmlFactory19.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader28 = objectMapper16.readerWithView(featureClass27);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference29 = null;
        boolean boolean30 = objectMapper9.canSerialize(featureClass27, throwableAtomicReference29);
        java.lang.Object obj31 = null;
        byte[] byteArray32 = objectMapper9.writeValueAsBytes(obj31);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = xmlFactory4.createJsonParser(byteArray32);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = xmlFactory0.createParser(byteArray32);
        javax.xml.stream.XMLStreamReader xMLStreamReader35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser36 = xmlFactory0.createParser(xMLStreamReader35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputDecorator23);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(featureClass27);
        org.junit.Assert.assertNotNull(objectReader28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonParser34);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test08");
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory0 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = xmlMapper1.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.setMixInResolver(mixInResolver4);
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setSerializationInclusion(include6);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper8.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.setMixInResolver(mixInResolver11);
        com.fasterxml.jackson.annotation.JsonInclude.Include include13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.setSerializationInclusion(include13);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean16 = xmlFactory15.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        boolean boolean18 = xmlFactory15.canUseSchema(formatSchema17);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = xmlFactory15.getInputDecorator();
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = xmlFactory15.createGenerator(dataOutput20, jsonEncoding21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass23 = xmlFactory15.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper12.readerWithView(featureClass23);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference25 = null;
        boolean boolean26 = objectMapper5.canSerialize(featureClass23, throwableAtomicReference25);
        java.lang.Object obj27 = null;
        byte[] byteArray28 = objectMapper5.writeValueAsBytes(obj27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = xmlFactory0.createJsonParser(byteArray28);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean31 = xmlFactory30.requiresPropertyOrdering();
        java.io.DataOutput dataOutput32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = xmlFactory30.createGenerator(dataOutput32);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper35 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = xmlMapper35.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper37 = objectMapper36.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver38 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = objectMapper36.setMixInResolver(mixInResolver38);
        com.fasterxml.jackson.annotation.JsonInclude.Include include40 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper41 = objectMapper39.setSerializationInclusion(include40);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper42 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = xmlMapper42.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper43.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver45 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = objectMapper43.setMixInResolver(mixInResolver45);
        com.fasterxml.jackson.annotation.JsonInclude.Include include47 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper48 = objectMapper46.setSerializationInclusion(include47);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean50 = xmlFactory49.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema51 = null;
        boolean boolean52 = xmlFactory49.canUseSchema(formatSchema51);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator53 = xmlFactory49.getInputDecorator();
        java.io.DataOutput dataOutput54 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding55 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator56 = xmlFactory49.createGenerator(dataOutput54, jsonEncoding55);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass57 = xmlFactory49.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader58 = objectMapper46.readerWithView(featureClass57);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference59 = null;
        boolean boolean60 = objectMapper39.canSerialize(featureClass57, throwableAtomicReference59);
        java.lang.Object obj61 = null;
        byte[] byteArray62 = objectMapper39.writeValueAsBytes(obj61);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = xmlFactory34.createJsonParser(byteArray62);
        com.fasterxml.jackson.core.JsonParser jsonParser64 = xmlFactory30.createParser(byteArray62);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser67 = xmlFactory0.createParser(byteArray62, 55296, 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxEOFException: Unexpected EOF in prolog? at [row,col {unknown-source}]: [1,55296]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectMapper41);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(inputDecorator53);
        org.junit.Assert.assertNotNull(jsonGenerator56);
        org.junit.Assert.assertNotNull(featureClass57);
        org.junit.Assert.assertNotNull(objectReader58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNotNull(jsonParser64);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test09");
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper0 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = xmlMapper0.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper1.disableDefaultTyping();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper4 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = xmlFactory5.getXMLOutputFactory();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass7 = xmlFactory5.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType8 = xmlMapper4.constructType((java.lang.reflect.Type) featureClass7);
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper4.writer(base64Variant9);
        java.text.DateFormat dateFormat11 = xmlMapper4.getDateFormat();
        com.fasterxml.jackson.core.Base64Variant base64Variant12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper4.writer(base64Variant12);
        java.lang.ClassLoader classLoader14 = null;
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList15 = com.fasterxml.jackson.databind.ObjectMapper.findModules(classLoader14);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper4.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList15);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = xmlMapper17.disableDefaultTyping();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = xmlFactory21.getXMLOutputFactory();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass23 = xmlFactory21.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType24 = xmlMapper20.constructType((java.lang.reflect.Type) featureClass23);
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.XmlPrettyPrinter> xmlPrettyPrinterItor25 = objectMapper18.readValues(jsonParser19, javaType24);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy26 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper18.setPropertyNamingStrategy(propertyNamingStrategy26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = objectMapper27.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper4.setNodeFactory(jsonNodeFactory28);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean31 = xmlFactory30.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema32 = null;
        boolean boolean33 = xmlFactory30.canUseSchema(formatSchema32);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator34 = xmlFactory30.getInputDecorator();
        java.io.DataOutput dataOutput35 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = xmlFactory30.createGenerator(dataOutput35, jsonEncoding36);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass38 = xmlFactory30.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader39 = xmlMapper4.readerWithView(featureClass38);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature40 = objectMapper1.readValue("<null/>", featureClass38);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not deserialize instance of com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature out of START_OBJECT token? at [Source: java.io.StringReader@2c831c44; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(xMLOutputFactory6);
        org.junit.Assert.assertNotNull(featureClass7);
        org.junit.Assert.assertNotNull(javaType8);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(moduleList15);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(xMLOutputFactory22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(javaType24);
        org.junit.Assert.assertNotNull(xmlPrettyPrinterItor25);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(jsonNodeFactory28);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(inputDecorator34);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNotNull(featureClass38);
        org.junit.Assert.assertNotNull(objectReader39);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test10");
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory0 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = xmlMapper1.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.setMixInResolver(mixInResolver4);
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setSerializationInclusion(include6);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper8.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.setMixInResolver(mixInResolver11);
        com.fasterxml.jackson.annotation.JsonInclude.Include include13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.setSerializationInclusion(include13);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean16 = xmlFactory15.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        boolean boolean18 = xmlFactory15.canUseSchema(formatSchema17);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = xmlFactory15.getInputDecorator();
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = xmlFactory15.createGenerator(dataOutput20, jsonEncoding21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass23 = xmlFactory15.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper12.readerWithView(featureClass23);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference25 = null;
        boolean boolean26 = objectMapper5.canSerialize(featureClass23, throwableAtomicReference25);
        java.lang.Object obj27 = null;
        byte[] byteArray28 = objectMapper5.writeValueAsBytes(obj27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = xmlFactory0.createJsonParser(byteArray28);
        javax.xml.stream.XMLInputFactory xMLInputFactory30 = xmlFactory0.getXMLInputFactory();
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(xMLInputFactory30);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test11");
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper0 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = xmlMapper0.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper1.disableDefaultTyping();
        com.fasterxml.jackson.dataformat.xml.XmlTypeResolverBuilder xmlTypeResolverBuilder3 = new com.fasterxml.jackson.dataformat.xml.XmlTypeResolverBuilder();
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder5 = xmlTypeResolverBuilder3.typeProperty("hi!");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = objectMapper1.setDefaultTyping((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder>) xmlTypeResolverBuilder3);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig7 = objectMapper1.getSerializationConfig();
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter8 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean10 = xmlFactory9.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = xmlFactory9.canUseSchema(formatSchema11);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator13 = xmlFactory9.getInputDecorator();
        java.io.DataOutput dataOutput14 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding15 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = xmlFactory9.createGenerator(dataOutput14, jsonEncoding15);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter17 = jsonGenerator16.getPrettyPrinter();
        defaultXmlPrettyPrinter8.writeStartArray(jsonGenerator16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper1.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper20.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = objectMapper21.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = objectMapper22.getSerializerProviderInstance();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = objJsonSerializer24.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.BeanProperty beanProperty27 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer28 = serializerProvider23.handlePrimaryContextualization(objJsonSerializer26, beanProperty27);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = objJsonSerializer29.unwrappingSerializer(nameTransformer30);
        serializerProvider23.setNullKeySerializer(objJsonSerializer31);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig33 = serializerProvider23.getConfig();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = objectMapper1.setConfig(serializationConfig33);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper37 = xmlMapper36.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = objectMapper37.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider39 = objectMapper38.getSerializerProviderInstance();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer40 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer41 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer42 = objJsonSerializer40.unwrappingSerializer(nameTransformer41);
        com.fasterxml.jackson.databind.BeanProperty beanProperty43 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer44 = serializerProvider39.handlePrimaryContextualization(objJsonSerializer42, beanProperty43);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper45 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = xmlMapper45.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper47 = objectMapper46.disableDefaultTyping();
        com.fasterxml.jackson.databind.InjectableValues injectableValues48 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader49 = objectMapper47.reader(injectableValues48);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper50 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper50.disableDefaultTyping();
        com.fasterxml.jackson.core.Version version52 = xmlMapper50.version();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory53 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory54 = xmlFactory53.getXMLOutputFactory();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass55 = xmlFactory53.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType56 = xmlMapper50.constructType((java.lang.reflect.Type) featureClass55);
        com.fasterxml.jackson.databind.JavaType javaType57 = objectMapper47.constructType((java.lang.reflect.Type) featureClass55);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray58 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper59 = objectMapper47.disable(featureArray58);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper60 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper61 = xmlMapper60.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper62 = objectMapper61.disableDefaultTyping();
        com.fasterxml.jackson.databind.InjectableValues injectableValues63 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader64 = objectMapper62.reader(injectableValues63);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper65 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = xmlMapper65.disableDefaultTyping();
        com.fasterxml.jackson.core.Version version67 = xmlMapper65.version();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory68 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory69 = xmlFactory68.getXMLOutputFactory();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass70 = xmlFactory68.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType71 = xmlMapper65.constructType((java.lang.reflect.Type) featureClass70);
        com.fasterxml.jackson.databind.JavaType javaType72 = objectMapper62.constructType((java.lang.reflect.Type) featureClass70);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter73 = objectMapper47.writerWithType(javaType72);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer74 = serializerProvider39.findValueSerializer(javaType72);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList75 = objectMapper34.readValue("<null/>", javaType72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper1);
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder5);
        org.junit.Assert.assertNotNull(objectMapper6);
        org.junit.Assert.assertNotNull(serializationConfig7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputDecorator13);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertNull(prettyPrinter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(serializerProvider23);
        org.junit.Assert.assertNotNull(objJsonSerializer24);
        org.junit.Assert.assertNotNull(objJsonSerializer26);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer28);
        org.junit.Assert.assertNotNull(objJsonSerializer29);
        org.junit.Assert.assertNotNull(objJsonSerializer31);
        org.junit.Assert.assertNotNull(serializationConfig33);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(serializerProvider39);
        org.junit.Assert.assertNotNull(objJsonSerializer40);
        org.junit.Assert.assertNotNull(objJsonSerializer42);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer44);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(objectReader49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(xMLOutputFactory54);
        org.junit.Assert.assertNotNull(featureClass55);
        org.junit.Assert.assertNotNull(javaType56);
        org.junit.Assert.assertNotNull(javaType57);
        org.junit.Assert.assertNotNull(featureArray58);
        org.junit.Assert.assertNotNull(objectMapper59);
        org.junit.Assert.assertNotNull(objectMapper61);
        org.junit.Assert.assertNotNull(objectMapper62);
        org.junit.Assert.assertNotNull(objectReader64);
        org.junit.Assert.assertNotNull(objectMapper66);
        org.junit.Assert.assertNotNull(version67);
        org.junit.Assert.assertNotNull(xMLOutputFactory69);
        org.junit.Assert.assertNotNull(featureClass70);
        org.junit.Assert.assertNotNull(javaType71);
        org.junit.Assert.assertNotNull(javaType72);
        org.junit.Assert.assertNotNull(objectWriter73);
        org.junit.Assert.assertNotNull(objJsonSerializer74);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test12");
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper0 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory1 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = xmlFactory1.getXMLOutputFactory();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass3 = xmlFactory1.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType4 = xmlMapper0.constructType((java.lang.reflect.Type) featureClass3);
        com.fasterxml.jackson.core.Base64Variant base64Variant5 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter6 = xmlMapper0.writer(base64Variant5);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory7 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper0.setTypeFactory(typeFactory7);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass9 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader10 = xmlMapper0.readerWithView(featureClass9);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper0);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = xmlFactory12.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = xmlFactory12.getCharacterEscapes();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = xmlFactory11.setCodec((com.fasterxml.jackson.core.ObjectCodec) xmlMapper16);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = xmlFactory11.createParser("<Boolean>false</Boolean>");
        org.junit.Assert.assertNotNull(xMLOutputFactory2);
        org.junit.Assert.assertNotNull(featureClass3);
        org.junit.Assert.assertNotNull(javaType4);
        org.junit.Assert.assertNotNull(objectWriter6);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(objectReader10);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test13");
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory0 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = xmlMapper1.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = objectMapper2.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper2.setMixInResolver(mixInResolver4);
        com.fasterxml.jackson.annotation.JsonInclude.Include include6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setSerializationInclusion(include6);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper8.disableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixInResolver11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.setMixInResolver(mixInResolver11);
        com.fasterxml.jackson.annotation.JsonInclude.Include include13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper12.setSerializationInclusion(include13);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        boolean boolean16 = xmlFactory15.requiresPropertyOrdering();
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        boolean boolean18 = xmlFactory15.canUseSchema(formatSchema17);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = xmlFactory15.getInputDecorator();
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = xmlFactory15.createGenerator(dataOutput20, jsonEncoding21);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass23 = xmlFactory15.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader24 = objectMapper12.readerWithView(featureClass23);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference25 = null;
        boolean boolean26 = objectMapper5.canSerialize(featureClass23, throwableAtomicReference25);
        java.lang.Object obj27 = null;
        byte[] byteArray28 = objectMapper5.writeValueAsBytes(obj27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = xmlFactory0.createJsonParser(byteArray28);
        java.lang.Object obj30 = jsonParser29.getObjectId();
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(objectMapper3);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(featureClass23);
        org.junit.Assert.assertNotNull(objectReader24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNull(obj30);
    }
}

