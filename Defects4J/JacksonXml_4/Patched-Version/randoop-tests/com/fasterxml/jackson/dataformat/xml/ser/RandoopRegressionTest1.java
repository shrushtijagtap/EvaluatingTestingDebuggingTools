package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test501");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.BeanProperty beanProperty54 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider12.findKeySerializer(featureClass51, beanProperty54);
        java.lang.Class<?> wildcardClass56 = serializerProvider12.getActiveView();
        com.fasterxml.jackson.databind.introspect.Annotated annotated57 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo58 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.ObjectIdResolver objectIdResolver59 = serializerProvider12.objectIdResolverInstance(annotated57, objectIdInfo58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
        org.junit.Assert.assertNull(wildcardClass56);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = xmlFactory10.getCodec();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNull(objectCodec12);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        jacksonXmlAnnotationIntrospector0.setDefaultUseWrapper(false);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector4 = jacksonXmlAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(true);
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector6 = jacksonAnnotationIntrospector4.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec8, xMLInputFactory9, xMLOutputFactory10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory11);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper13.writer(characterEscapes14);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray16 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper13.disable(featureArray16);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = xmlMapper13.copy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory19 = xmlMapper13.getSerializerFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider28 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter29 = xmlMapper25.writer(filterProvider28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory31 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory32 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec30, xMLInputFactory31, xMLOutputFactory32);
        com.fasterxml.jackson.core.Version version34 = xmlFactory33.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper35 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory33);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes36 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter37 = xmlMapper35.writer(characterEscapes36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory39 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec38, xMLInputFactory39, xMLOutputFactory40);
        com.fasterxml.jackson.core.Version version42 = xmlFactory41.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper43 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory41);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter45 = xmlMapper43.writer(characterEscapes44);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory46 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper47 = xmlMapper43.setNodeFactory(jsonNodeFactory46);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider48 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = xmlMapper43.setFilterProvider(filterProvider48);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory52 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory53 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory54 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec51, xMLInputFactory52, xMLOutputFactory53);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature55 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = xmlFactory54.disable(feature55);
        com.fasterxml.jackson.core.Version version57 = xmlFactory56.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass58 = xmlFactory56.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor59 = objectMapper49.readValues(jsonParser50, featureClass58);
        boolean boolean60 = xmlMapper35.canSerialize(featureClass58);
        boolean boolean61 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass58);
        com.fasterxml.jackson.databind.JavaType javaType62 = xmlMapper25.constructType((java.lang.reflect.Type) featureClass58);
        boolean boolean63 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType62);
        com.fasterxml.jackson.databind.ObjectReader objectReader64 = xmlMapper13.readerFor(javaType62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass65 = jacksonAnnotationIntrospector4.findDeserializationContentType(annotated7, javaType62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector4);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector6);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(featureArray16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(xmlMapper18);
        org.junit.Assert.assertNotNull(serializerFactory19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(objectWriter29);
        org.junit.Assert.assertNotNull(version34);
        org.junit.Assert.assertNotNull(objectWriter37);
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertNotNull(objectWriter45);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature55.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory56);
        org.junit.Assert.assertNotNull(version57);
        org.junit.Assert.assertNotNull(featureClass58);
        org.junit.Assert.assertNotNull(featureItor59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(javaType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectReader64);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper5);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = xmlMapper5.getFactory();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(serializationFeature14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(xmlFactory13);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter2 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = xmlFactory6.setRootValueSeparator("");
        java.io.DataOutput dataOutput9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory8.createGenerator(dataOutput9);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = jsonGenerator10.setHighestNonEscapedChar((-1));
        boolean boolean13 = jsonGenerator12.canWriteObjectId();
        int int14 = jsonGenerator12.getHighestEscapedChar();
        defaultXmlPrettyPrinter2.writeArrayValueSeparator(jsonGenerator12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec16, xMLInputFactory17, xMLOutputFactory18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlFactory19.setRootValueSeparator("");
        java.io.DataOutput dataOutput22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory21.createGenerator(dataOutput22);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonGenerator23.setHighestNonEscapedChar((-1));
        defaultXmlPrettyPrinter2.beforeObjectEntries(jsonGenerator25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory28 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory29 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec27, xMLInputFactory28, xMLOutputFactory29);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = xmlFactory30.setRootValueSeparator("");
        java.io.DataOutput dataOutput33 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = jsonFactory32.createGenerator(dataOutput33);
        boolean boolean35 = jsonGenerator34.canWriteTypeId();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator34.setCharacterEscapes(characterEscapes36);
        boolean boolean38 = jsonGenerator34.canWriteBinaryNatively();
        jsonGenerator34.writeOmittedField("hi!");
        defaultXmlPrettyPrinter2.beforeArrayValues(jsonGenerator34);
        java.lang.Object obj42 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlSerializerProvider1.serializePolymorphic(jsonGenerator34, obj42, typeSerializer43);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: No element/attribute name specified when trying to output element");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature8 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper7.disable(feature8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider20 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper15.setFilterProvider(filterProvider20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature27 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = xmlFactory26.disable(feature27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass30 = xmlFactory28.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor31 = objectMapper21.readValues(jsonParser22, featureClass30);
        boolean boolean32 = objectMapper9.canSerialize(featureClass30);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes33 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter34 = objectMapper9.writer(characterEscapes33);
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = objectMapper9.getJsonFactory();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature8.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature27.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory28);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(featureClass30);
        org.junit.Assert.assertNotNull(featureItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objectWriter34);
        org.junit.Assert.assertNotNull(jsonFactory35);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier0 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec1, xMLInputFactory2, xMLOutputFactory3);
        com.fasterxml.jackson.core.Version version5 = xmlFactory4.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper6 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory4);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = xmlMapper6.writer(characterEscapes7);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper6.disable(featureArray9);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper10.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig12 = objectMapper10.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription13 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder14 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder15 = xmlBeanSerializerModifier0.updateBuilder(serializationConfig12, beanDescription13, beanSerializerBuilder14);
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier16 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec17, xMLInputFactory18, xMLOutputFactory19);
        com.fasterxml.jackson.core.Version version21 = xmlFactory20.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(characterEscapes23);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray25 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper22.disable(featureArray25);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper26.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig28 = objectMapper26.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription29 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder30 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder31 = xmlBeanSerializerModifier16.updateBuilder(serializationConfig28, beanDescription29, beanSerializerBuilder30);
        com.fasterxml.jackson.databind.type.CollectionType collectionType32 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription33 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray42 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = xmlMapper39.disable(featureArray42);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper43.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig45 = objectMapper43.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = objectMapper43.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory48 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory50 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec47, xMLInputFactory48, xMLOutputFactory49);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature51 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = xmlFactory50.disable(feature51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass54 = xmlFactory52.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider46.getUnknownTypeSerializer(featureClass54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory64 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper61.setNodeFactory(jsonNodeFactory64);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory66 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader67 = xmlMapper61.readerForUpdating((java.lang.Object) xmlFactory66);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass68 = xmlFactory66.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType69 = serializerProvider46.constructType((java.lang.reflect.Type) featureClass68);
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory71 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory72 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory73 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec70, xMLInputFactory71, xMLOutputFactory72);
        com.fasterxml.jackson.core.Version version74 = xmlFactory73.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper75 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory73);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes76 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter77 = xmlMapper75.writer(characterEscapes76);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider78 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter79 = xmlMapper75.writer(filterProvider78);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode80 = xmlMapper75.createArrayNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory82 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory83 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory84 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec81, xMLInputFactory82, xMLOutputFactory83);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature85 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory86 = xmlFactory84.disable(feature85);
        com.fasterxml.jackson.core.Version version87 = xmlFactory86.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper88 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory86);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass89 = xmlFactory86.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader90 = xmlMapper75.reader(featureClass89);
        com.fasterxml.jackson.databind.BeanProperty beanProperty91 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer92 = serializerProvider46.findValueSerializer(featureClass89, beanProperty91);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer93 = xmlBeanSerializerModifier0.modifyCollectionSerializer(serializationConfig28, collectionType32, beanDescription33, objJsonSerializer92);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(serializationConfig12);
        org.junit.Assert.assertNull(beanSerializerBuilder15);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(featureArray25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(serializationConfig28);
        org.junit.Assert.assertNull(beanSerializerBuilder31);
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(featureArray42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(serializationConfig45);
        org.junit.Assert.assertNotNull(serializerProvider46);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature51.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory52);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(featureClass54);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertNotNull(objectReader67);
        org.junit.Assert.assertNotNull(featureClass68);
        org.junit.Assert.assertNotNull(javaType69);
        org.junit.Assert.assertNotNull(version74);
        org.junit.Assert.assertNotNull(objectWriter77);
        org.junit.Assert.assertNotNull(objectWriter79);
        org.junit.Assert.assertNotNull(arrayNode80);
        org.junit.Assert.assertTrue("'" + feature85 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature85.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory86);
        org.junit.Assert.assertNotNull(version87);
        org.junit.Assert.assertNotNull(featureClass89);
        org.junit.Assert.assertNotNull(objectReader90);
        org.junit.Assert.assertNotNull(objJsonSerializer92);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer93);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = serializerProvider12.getDefaultNullValueSerializer();
        boolean boolean24 = objJsonSerializer23.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup2 = xmlSerializerProvider1._rootNameLookup;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = xmlFactory6.setRootValueSeparator("");
        java.io.DataOutput dataOutput9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory8.createGenerator(dataOutput9);
        jsonGenerator10.writeOmittedField("");
        // The following exception was thrown during execution in test generation
        try {
            xmlSerializerProvider1._serializeXmlNull(jsonGenerator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xmlRootNameLookup2);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        boolean boolean12 = xmlFactory10.canUseCharArrays();
        java.lang.String str13 = xmlFactory10.getRootValueSeparator();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = xmlFactory10.createJsonParser("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxEOFException: Unexpected EOF in prolog? at [row,col {unknown-source}]: [1,0]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.reader(jsonNodeFactory10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper25.setNodeFactory(jsonNodeFactory28);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper25.setFilterProvider(filterProvider30);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature37 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = xmlFactory36.disable(feature37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass40 = xmlFactory38.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor41 = objectMapper31.readValues(jsonParser32, featureClass40);
        boolean boolean42 = xmlMapper17.canSerialize(featureClass40);
        boolean boolean43 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass40);
        com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema44 = xmlMapper5.generateJsonSchema(featureClass40);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = xmlMapper5.findAndRegisterModules();
        com.fasterxml.jackson.core.FormatSchema formatSchema46 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter47 = xmlMapper5.writer(formatSchema46);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter48 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.core.FormatSchema formatSchema49 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader50 = xmlMapper5.reader(formatSchema49);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature37.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory38);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(featureClass40);
        org.junit.Assert.assertNotNull(featureItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonSchema44);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertNotNull(objectWriter47);
        org.junit.Assert.assertNotNull(objectWriter48);
        org.junit.Assert.assertNotNull(objectReader50);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper4 = xmlMapper2.setDefaultUseWrapper(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory6 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory7 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory8 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec5, xMLInputFactory6, xMLOutputFactory7);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = xmlFactory8.setRootValueSeparator("");
        java.io.DataOutput dataOutput11 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = jsonFactory10.createGenerator(dataOutput11);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory10.setInputDecorator(inputDecorator13);
        java.io.DataOutput dataOutput15 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = jsonFactory14.createGenerator(dataOutput15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec17, xMLInputFactory18, xMLOutputFactory19);
        com.fasterxml.jackson.core.Version version21 = xmlFactory20.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(characterEscapes23);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray25 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper22.disable(featureArray25);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode27 = objectMapper26.createArrayNode();
        xmlMapper2.writeTree(jsonGenerator16, (com.fasterxml.jackson.databind.JsonNode) arrayNode27);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator16.writeFieldId((long) 1);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xmlMapper4);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(featureArray25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(arrayNode27);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor21 = objectMapper11.readValues(jsonParser12, featureClass20);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair24 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector22, annotationIntrospector23);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        java.lang.Boolean boolean26 = pair24.isOutputAsCData(annotated25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair29 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector27, annotationIntrospector28);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector30 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair32 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector30, annotationIntrospector31);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair33 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair29, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair32);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair34 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair24, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper11.setAnnotationIntrospector((com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = objectMapper35.clearProblemHandlers();
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory38 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory39 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec37, xMLInputFactory38, xMLOutputFactory39);
        com.fasterxml.jackson.core.Version version41 = xmlFactory40.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper42 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory40);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes43 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter44 = xmlMapper42.writer(characterEscapes43);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray45 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = xmlMapper42.disable(featureArray45);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper47 = objectMapper46.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig48 = objectMapper46.getSerializationConfig();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = objectMapper36.setMixInResolver((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) serializationConfig48);
        com.fasterxml.jackson.core.Base64Variant base64Variant50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = objectMapper49.setBase64Variant(base64Variant50);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory53 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory54 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory55 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec52, xMLInputFactory53, xMLOutputFactory54);
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = xmlFactory55.setRootValueSeparator("");
        java.io.DataOutput dataOutput58 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator59 = jsonFactory57.createGenerator(dataOutput58);
        com.fasterxml.jackson.core.FormatSchema formatSchema60 = null;
        boolean boolean61 = jsonGenerator59.canUseSchema(formatSchema60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory63 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory64 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory65 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec62, xMLInputFactory63, xMLOutputFactory64);
        com.fasterxml.jackson.core.Version version66 = xmlFactory65.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper67 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory65);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes68 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter69 = xmlMapper67.writer(characterEscapes68);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider70 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter71 = xmlMapper67.writer(filterProvider70);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode72 = xmlMapper67.createArrayNode();
        // The following exception was thrown during execution in test generation
        try {
            objectMapper49.writeTree(jsonGenerator59, (com.fasterxml.jackson.databind.JsonNode) arrayNode72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(featureItor21);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(pair34);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(objectWriter44);
        org.junit.Assert.assertNotNull(featureArray45);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(serializationConfig48);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertNotNull(jsonFactory57);
        org.junit.Assert.assertNotNull(jsonGenerator59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(version66);
        org.junit.Assert.assertNotNull(objectWriter69);
        org.junit.Assert.assertNotNull(objectWriter71);
        org.junit.Assert.assertNotNull(arrayNode72);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        java.lang.String str11 = objectMapper9.writeValueAsString((java.lang.Object) "XML");
        com.fasterxml.jackson.databind.InjectableValues injectableValues12 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = objectMapper9.reader(injectableValues12);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper9.writer(formatSchema14);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup16 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider17 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper9.setSerializerProvider((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider) xmlSerializerProvider17);
        xmlSerializerProvider17.flushCachedSerializers();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<String>XML</String>" + "'", str11, "<String>XML</String>");
        org.junit.Assert.assertNotNull(objectReader13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper18);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = jacksonXmlAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.disable(featureArray11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = xmlMapper8.getDeserializationContext();
        com.fasterxml.jackson.core.Version version14 = xmlMapper8.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper8.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper8.enableDefaultTyping();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider17 = null;
        xmlMapper8.setFilters(filterProvider17);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig19 = xmlMapper8.getSerializationConfig();
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod20 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod22 = jacksonXmlAnnotationIntrospector0.resolveSetterConflict((com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig>) serializationConfig19, annotatedMethod20, annotatedMethod21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector2);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(deserializationContext13);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(serializationConfig19);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup2 = xmlSerializerProvider1._rootNameLookup;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = xmlSerializerProvider1.getGenerator();
        int int4 = xmlSerializerProvider1.cachedSerializersCount();
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory6 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory7 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory8 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec5, xMLInputFactory6, xMLOutputFactory7);
        com.fasterxml.jackson.core.Version version9 = xmlFactory8.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory8);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes11 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper10.writer(characterEscapes11);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray13 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = xmlMapper10.disable(featureArray13);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader16 = xmlMapper10.reader(jsonNodeFactory15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec17, xMLInputFactory18, xMLOutputFactory19);
        com.fasterxml.jackson.core.Version version21 = xmlFactory20.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(characterEscapes23);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory27 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec25, xMLInputFactory26, xMLOutputFactory27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper30 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory28);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes31 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter32 = xmlMapper30.writer(characterEscapes31);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = xmlMapper30.setNodeFactory(jsonNodeFactory33);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider35 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = xmlMapper30.setFilterProvider(filterProvider35);
        com.fasterxml.jackson.core.JsonParser jsonParser37 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory39 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec38, xMLInputFactory39, xMLOutputFactory40);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature42 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = xmlFactory41.disable(feature42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass45 = xmlFactory43.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor46 = objectMapper36.readValues(jsonParser37, featureClass45);
        boolean boolean47 = xmlMapper22.canSerialize(featureClass45);
        boolean boolean48 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass45);
        com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema49 = xmlMapper10.generateJsonSchema(featureClass45);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper50 = xmlMapper10.findAndRegisterModules();
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory52 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory53 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory54 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec51, xMLInputFactory52, xMLOutputFactory53);
        com.fasterxml.jackson.core.Version version55 = xmlFactory54.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper56 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory54);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes57 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter58 = xmlMapper56.writer(characterEscapes57);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory59 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = xmlMapper56.setNodeFactory(jsonNodeFactory59);
        com.fasterxml.jackson.databind.Module[] moduleArray61 = new com.fasterxml.jackson.databind.Module[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper62 = objectMapper60.registerModules(moduleArray61);
        com.fasterxml.jackson.annotation.JsonInclude.Include include63 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper64 = objectMapper60.setSerializationInclusion(include63);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory66 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory67 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory68 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec65, xMLInputFactory66, xMLOutputFactory67);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature69 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory70 = xmlFactory68.disable(feature69);
        com.fasterxml.jackson.core.Version version71 = xmlFactory70.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass72 = xmlFactory70.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema73 = objectMapper60.generateJsonSchema(featureClass72);
        com.fasterxml.jackson.databind.ObjectReader objectReader74 = xmlMapper10.readerWithView(featureClass72);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema75 = xmlSerializerProvider1.generateJsonSchema(featureClass72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(xmlRootNameLookup2);
        org.junit.Assert.assertNull(jsonGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(featureArray13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectReader16);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(objectWriter32);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature42.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(featureClass45);
        org.junit.Assert.assertNotNull(featureItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jsonSchema49);
        org.junit.Assert.assertNotNull(objectMapper50);
        org.junit.Assert.assertNotNull(version55);
        org.junit.Assert.assertNotNull(objectWriter58);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertNotNull(moduleArray61);
        org.junit.Assert.assertNotNull(objectMapper62);
        org.junit.Assert.assertNotNull(objectMapper64);
        org.junit.Assert.assertTrue("'" + feature69 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature69.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory70);
        org.junit.Assert.assertNotNull(version71);
        org.junit.Assert.assertNotNull(featureClass72);
        org.junit.Assert.assertNotNull(jsonSchema73);
        org.junit.Assert.assertNotNull(objectReader74);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray13 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper9.enable(featureArray13);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver15 = objectMapper14.getSubtypeResolver();
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = objectMapper14.writerWithType(javaType16);
        java.lang.Object obj18 = null;
        com.fasterxml.jackson.databind.node.BaseJsonNode baseJsonNode19 = objectMapper14.valueToTree(obj18);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(featureArray13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(subtypeResolver15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNull(baseJsonNode19);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.annotation.JsonInclude.Value value3 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = xmlMapper2.setPropertyInclusion(value3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper2.findAndRegisterModules();
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setInjectableValues(injectableValues6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectMapper7.createObjectNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = objectMapper7.getNodeFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper7.setPropertyNamingStrategy(propertyNamingStrategy10);
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(jsonNodeFactory9);
        org.junit.Assert.assertNotNull(objectMapper11);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload25 = null;
        jsonParser24.setRequestPayloadOnError(requestPayload25);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload27 = null;
        jsonParser24.setRequestPayloadOnError(requestPayload27);
        java.lang.Object obj29 = jsonParser24.getInputSource();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = jsonParser24.isEnabled(feature25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        java.lang.String str12 = xmlFactory10.getRootValueSeparator();
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser14 = xmlFactory10.createJsonParser(file13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser24.overrideStdFeatures((int) '#', (int) (short) -1);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload29 = null;
        jsonParser28.setRequestPayloadOnError(requestPayload29);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonParser28);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory33 = serializerProvider12.getTypeFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray42 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = xmlMapper39.disable(featureArray42);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper43.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig45 = objectMapper43.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider46 = objectMapper43.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory48 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory50 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec47, xMLInputFactory48, xMLOutputFactory49);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature51 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = xmlFactory50.disable(feature51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass54 = xmlFactory52.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer55 = serializerProvider46.getUnknownTypeSerializer(featureClass54);
        boolean boolean56 = objJsonSerializer55.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty57 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer58 = serializerProvider12.handleSecondaryContextualization(objJsonSerializer55, beanProperty57);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertNotNull(typeFactory33);
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(featureArray42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(serializationConfig45);
        org.junit.Assert.assertNotNull(serializerProvider46);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature51.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory52);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(featureClass54);
        org.junit.Assert.assertNotNull(objJsonSerializer55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer58);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider14 = null;
        xmlMapper5.setFilters(filterProvider14);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = xmlMapper5.isEnabled(serializationFeature16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.core.Version version15 = xmlFactory14.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory14);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper16.writer(characterEscapes17);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray19 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper16.disable(featureArray19);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig22 = objectMapper20.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = objectMapper20.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature28 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = xmlFactory27.disable(feature28);
        com.fasterxml.jackson.core.Version version30 = xmlFactory29.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass31 = xmlFactory29.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = serializerProvider23.getUnknownTypeSerializer(featureClass31);
        java.util.TimeZone timeZone33 = serializerProvider23.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory43 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory44 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec42, xMLInputFactory43, xMLOutputFactory44);
        com.fasterxml.jackson.core.Version version46 = xmlFactory45.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper47 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory45);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes48 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter49 = xmlMapper47.writer(characterEscapes48);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper47.setNodeFactory(jsonNodeFactory50);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider52 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper53 = xmlMapper47.setFilterProvider(filterProvider52);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory56 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory57 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec55, xMLInputFactory56, xMLOutputFactory57);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature59 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory60 = xmlFactory58.disable(feature59);
        com.fasterxml.jackson.core.Version version61 = xmlFactory60.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass62 = xmlFactory60.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor63 = objectMapper53.readValues(jsonParser54, featureClass62);
        boolean boolean64 = xmlMapper39.canSerialize(featureClass62);
        com.fasterxml.jackson.databind.JavaType javaType65 = serializerProvider23.constructType((java.lang.reflect.Type) featureClass62);
        com.fasterxml.jackson.databind.ObjectReader objectReader66 = xmlMapper10.readerFor(javaType65);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver67 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper68 = xmlMapper10.setSubtypeResolver(subtypeResolver67);
        java.io.DataOutput dataOutput69 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectMapper68.writeValue(dataOutput69, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(featureArray19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(serializationConfig22);
        org.junit.Assert.assertNotNull(serializerProvider23);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature28.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory29);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(featureClass31);
        org.junit.Assert.assertNotNull(objJsonSerializer32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNotNull(objectWriter49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertNotNull(objectMapper53);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature59.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory60);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(featureClass62);
        org.junit.Assert.assertNotNull(featureItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(javaType65);
        org.junit.Assert.assertNotNull(objectReader66);
        org.junit.Assert.assertNotNull(objectMapper68);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier xmlBeanDeserializerModifier2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier(" ");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory5 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec4, xMLInputFactory5, xMLOutputFactory6);
        com.fasterxml.jackson.core.Version version8 = xmlFactory7.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory7);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper9.writer(characterEscapes10);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper9.writer(filterProvider12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec22, xMLInputFactory23, xMLOutputFactory24);
        com.fasterxml.jackson.core.Version version26 = xmlFactory25.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory25);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes28 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter29 = xmlMapper27.writer(characterEscapes28);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper27.setNodeFactory(jsonNodeFactory30);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider32 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper27.setFilterProvider(filterProvider32);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature39 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = xmlFactory38.disable(feature39);
        com.fasterxml.jackson.core.Version version41 = xmlFactory40.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass42 = xmlFactory40.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor43 = objectMapper33.readValues(jsonParser34, featureClass42);
        boolean boolean44 = xmlMapper19.canSerialize(featureClass42);
        boolean boolean45 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass42);
        com.fasterxml.jackson.databind.JavaType javaType46 = xmlMapper9.constructType((java.lang.reflect.Type) featureClass42);
        boolean boolean47 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType46);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer48 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer49 = xmlBeanDeserializerModifier2.modifyKeyDeserializer(deserializationConfig3, javaType46, keyDeserializer48);
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule50 = jacksonXmlModule0.setDeserializerModifier((com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) xmlBeanDeserializerModifier2);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType51 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray52 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType51 };
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule53 = simpleModule50.registerSubtypes(namedTypeArray52);
        java.lang.String str54 = simpleModule50.getModuleName();
        com.fasterxml.jackson.databind.module.SimpleSerializers simpleSerializers55 = null;
        simpleModule50.setKeySerializers(simpleSerializers55);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(objectWriter29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature39.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory40);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(featureClass42);
        org.junit.Assert.assertNotNull(featureItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(keyDeserializer49);
        org.junit.Assert.assertNotNull(simpleModule50);
        org.junit.Assert.assertNotNull(namedTypeArray52);
        org.junit.Assert.assertNotNull(simpleModule53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "JacksonXmlModule" + "'", str54, "JacksonXmlModule");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean5 = xmlFactory3.isEnabled(feature4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature10 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = xmlFactory9.disable(feature10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory11);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature14 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper13.disable(feature14);
        boolean boolean16 = feature14.enabledByDefault();
        boolean boolean17 = xmlFactory3.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = xmlFactory3.setRootValueSeparator(" ");
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = xmlFactory3.createGenerator(dataOutput20);
        boolean boolean22 = jsonGenerator21.canWriteTypeId();
        com.fasterxml.jackson.core.SerializableString serializableString23 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator21.writeRaw(serializableString23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature10.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature14.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean14 = feature12.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(feature12);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory17, xMLOutputFactory18);
        com.fasterxml.jackson.annotation.JsonInclude.Value value20 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper19.setPropertyInclusion(value20);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper19.findAndRegisterModules();
        com.fasterxml.jackson.databind.jsontype.NamedType namedType23 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray24 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType23 };
        objectMapper22.registerSubtypes(namedTypeArray24);
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator26 = null;
        java.lang.Object obj27 = objectMapper22.setHandlerInstantiator(handlerInstantiator26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory30 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec28, xMLInputFactory29, xMLOutputFactory30);
        com.fasterxml.jackson.core.Version version32 = xmlFactory31.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper33 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory31);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes34 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter35 = xmlMapper33.writer(characterEscapes34);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray36 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper37 = xmlMapper33.disable(featureArray36);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper38 = xmlMapper33.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory40 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory41 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory42 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec39, xMLInputFactory40, xMLOutputFactory41);
        com.fasterxml.jackson.core.Version version43 = xmlFactory42.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper44 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory42);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes45 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter46 = xmlMapper44.writer(characterEscapes45);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray47 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper48 = xmlMapper44.disable(featureArray47);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = objectMapper48.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig50 = objectMapper48.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider51 = objectMapper48.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory53 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory54 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory55 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec52, xMLInputFactory53, xMLOutputFactory54);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature56 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory57 = xmlFactory55.disable(feature56);
        com.fasterxml.jackson.core.Version version58 = xmlFactory57.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass59 = xmlFactory57.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer60 = serializerProvider51.getUnknownTypeSerializer(featureClass59);
        java.util.TimeZone timeZone61 = serializerProvider51.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory63 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory64 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory65 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec62, xMLInputFactory63, xMLOutputFactory64);
        com.fasterxml.jackson.core.Version version66 = xmlFactory65.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper67 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory65);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes68 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter69 = xmlMapper67.writer(characterEscapes68);
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory71 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory72 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory73 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec70, xMLInputFactory71, xMLOutputFactory72);
        com.fasterxml.jackson.core.Version version74 = xmlFactory73.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper75 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory73);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes76 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter77 = xmlMapper75.writer(characterEscapes76);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory78 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper79 = xmlMapper75.setNodeFactory(jsonNodeFactory78);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider80 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper81 = xmlMapper75.setFilterProvider(filterProvider80);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec83 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory84 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory85 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory86 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec83, xMLInputFactory84, xMLOutputFactory85);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature87 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory88 = xmlFactory86.disable(feature87);
        com.fasterxml.jackson.core.Version version89 = xmlFactory88.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass90 = xmlFactory88.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor91 = objectMapper81.readValues(jsonParser82, featureClass90);
        boolean boolean92 = xmlMapper67.canSerialize(featureClass90);
        com.fasterxml.jackson.databind.JavaType javaType93 = serializerProvider51.constructType((java.lang.reflect.Type) featureClass90);
        com.fasterxml.jackson.databind.ObjectReader objectReader94 = xmlMapper38.readerFor(javaType93);
        com.fasterxml.jackson.databind.ObjectReader objectReader95 = objectMapper22.reader(javaType93);
        com.fasterxml.jackson.databind.MappingIterator<java.lang.Object> objItor96 = xmlMapper5.readValues(jsonParser16, javaType93);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature12.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(namedTypeArray24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(objectWriter35);
        org.junit.Assert.assertNotNull(featureArray36);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(xmlMapper38);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertNotNull(objectWriter46);
        org.junit.Assert.assertNotNull(featureArray47);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(serializationConfig50);
        org.junit.Assert.assertNotNull(serializerProvider51);
        org.junit.Assert.assertTrue("'" + feature56 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature56.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory57);
        org.junit.Assert.assertNotNull(version58);
        org.junit.Assert.assertNotNull(featureClass59);
        org.junit.Assert.assertNotNull(objJsonSerializer60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version66);
        org.junit.Assert.assertNotNull(objectWriter69);
        org.junit.Assert.assertNotNull(version74);
        org.junit.Assert.assertNotNull(objectWriter77);
        org.junit.Assert.assertNotNull(objectMapper79);
        org.junit.Assert.assertNotNull(objectMapper81);
        org.junit.Assert.assertTrue("'" + feature87 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature87.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory88);
        org.junit.Assert.assertNotNull(version89);
        org.junit.Assert.assertNotNull(featureClass90);
        org.junit.Assert.assertNotNull(featureItor91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(javaType93);
        org.junit.Assert.assertNotNull(objectReader94);
        org.junit.Assert.assertNotNull(objectReader95);
        org.junit.Assert.assertNotNull(objItor96);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.enableDefaultTypingAsProperty(defaultTyping10, "XML");
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy13 = objectMapper9.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper9.writer(filterProvider14);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy16 = objectMapper9.getPropertyNamingStrategy();
        java.util.Locale locale17 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper9.setLocale(locale17);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper9.clearProblemHandlers();
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray28 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper25.disable(featureArray28);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext30 = xmlMapper25.getDeserializationContext();
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver31 = xmlMapper25.getSubtypeResolver();
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler32 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper25.addHandler(deserializationProblemHandler32);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory34 = xmlMapper25.getSerializerFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper9.setSerializerFactory(serializerFactory34);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNull(propertyNamingStrategy13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNull(propertyNamingStrategy16);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(featureArray28);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(deserializationContext30);
        org.junit.Assert.assertNotNull(subtypeResolver31);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(serializerFactory34);
        org.junit.Assert.assertNotNull(objectMapper35);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider8 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter9 = xmlMapper5.writer(filterProvider8);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = xmlMapper5.createArrayNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature15 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = xmlFactory14.disable(feature15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory16);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass19 = xmlFactory16.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader20 = xmlMapper5.reader(featureClass19);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = xmlMapper5.isEnabled(serializationFeature21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectWriter9);
        org.junit.Assert.assertNotNull(arrayNode10);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature15.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(featureClass19);
        org.junit.Assert.assertNotNull(objectReader20);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray18 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.disable(featureArray18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = objectMapper19.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig21 = objectMapper19.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = objectMapper19.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray31 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = xmlMapper28.disable(featureArray31);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext33 = xmlMapper28.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper40 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory38);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes41 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter42 = xmlMapper40.writer(characterEscapes41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory45 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec43, xMLInputFactory44, xMLOutputFactory45);
        com.fasterxml.jackson.core.Version version47 = xmlFactory46.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper48 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory46);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes49 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter50 = xmlMapper48.writer(characterEscapes49);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper52 = xmlMapper48.setNodeFactory(jsonNodeFactory51);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider53 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper54 = xmlMapper48.setFilterProvider(filterProvider53);
        com.fasterxml.jackson.core.JsonParser jsonParser55 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature60 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory61 = xmlFactory59.disable(feature60);
        com.fasterxml.jackson.core.Version version62 = xmlFactory61.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass63 = xmlFactory61.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor64 = objectMapper54.readValues(jsonParser55, featureClass63);
        boolean boolean65 = xmlMapper40.canSerialize(featureClass63);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference66 = null;
        boolean boolean67 = xmlMapper28.canSerialize(featureClass63, throwableAtomicReference66);
        com.fasterxml.jackson.databind.BeanProperty beanProperty69 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer70 = serializerProvider22.findTypedValueSerializer(featureClass63, false, beanProperty69);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer71 = serializerProvider22.getDefaultNullKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer72 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer73 = objJsonSerializer71.unwrappingSerializer(nameTransformer72);
        com.fasterxml.jackson.databind.ObjectReader objectReader74 = xmlMapper5.readerForUpdating((java.lang.Object) objJsonSerializer71);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(featureArray18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(serializationConfig21);
        org.junit.Assert.assertNotNull(serializerProvider22);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(featureArray31);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(deserializationContext33);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(objectWriter42);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNotNull(objectWriter50);
        org.junit.Assert.assertNotNull(objectMapper52);
        org.junit.Assert.assertNotNull(objectMapper54);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature60.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory61);
        org.junit.Assert.assertNotNull(version62);
        org.junit.Assert.assertNotNull(featureClass63);
        org.junit.Assert.assertNotNull(featureItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer70);
        org.junit.Assert.assertNotNull(objJsonSerializer71);
        org.junit.Assert.assertNotNull(objJsonSerializer73);
        org.junit.Assert.assertNotNull(objectReader74);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.setSerializerFactory(serializerFactory12);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = objectMapper13.enable(serializationFeature14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = xmlMapper5.getSerializerProviderInstance();
        java.io.DataOutput dataOutput13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray22 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper19.disable(featureArray22);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = xmlMapper19.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory27 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec25, xMLInputFactory26, xMLOutputFactory27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper30 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory28);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes31 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter32 = xmlMapper30.writer(characterEscapes31);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider33 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter34 = xmlMapper30.writer(filterProvider33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper40 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory38);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes41 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter42 = xmlMapper40.writer(characterEscapes41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory45 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec43, xMLInputFactory44, xMLOutputFactory45);
        com.fasterxml.jackson.core.Version version47 = xmlFactory46.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper48 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory46);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes49 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter50 = xmlMapper48.writer(characterEscapes49);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper52 = xmlMapper48.setNodeFactory(jsonNodeFactory51);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider53 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper54 = xmlMapper48.setFilterProvider(filterProvider53);
        com.fasterxml.jackson.core.JsonParser jsonParser55 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature60 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory61 = xmlFactory59.disable(feature60);
        com.fasterxml.jackson.core.Version version62 = xmlFactory61.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass63 = xmlFactory61.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor64 = objectMapper54.readValues(jsonParser55, featureClass63);
        boolean boolean65 = xmlMapper40.canSerialize(featureClass63);
        boolean boolean66 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass63);
        com.fasterxml.jackson.databind.JavaType javaType67 = xmlMapper30.constructType((java.lang.reflect.Type) featureClass63);
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList68 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper69 = xmlMapper30.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList68);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper70 = xmlMapper19.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList68);
        // The following exception was thrown during execution in test generation
        try {
            xmlMapper5.writeValue(dataOutput13, (java.lang.Object) xmlMapper19);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: No serializer found for class com.ctc.wstx.api.WstxInputProperties$ParsingMode and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.fasterxml.jackson.dataformat.xml.XmlMapper[\"factory\"]->com.fasterxml.jackson.dataformat.xml.XmlFactory[\"xmlinputFactory\"]->com.ctc.wstx.stax.WstxInputFactory[\"config\"]->com.ctc.wstx.api.ReaderConfig[\"inputParsingMode\"])");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(featureArray22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(xmlMapper24);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(objectWriter32);
        org.junit.Assert.assertNotNull(objectWriter34);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(objectWriter42);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNotNull(objectWriter50);
        org.junit.Assert.assertNotNull(objectMapper52);
        org.junit.Assert.assertNotNull(objectMapper54);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature60.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory61);
        org.junit.Assert.assertNotNull(version62);
        org.junit.Assert.assertNotNull(featureClass63);
        org.junit.Assert.assertNotNull(featureItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(javaType67);
        org.junit.Assert.assertNotNull(moduleList68);
        org.junit.Assert.assertNotNull(objectMapper69);
        org.junit.Assert.assertNotNull(objectMapper70);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.core.Base64Variant base64Variant11 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader12 = objectMapper9.reader(base64Variant11);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectReader12);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        com.fasterxml.jackson.core.FormatSchema formatSchema26 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser24.setSchema(formatSchema26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper5.writer();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider11 = null;
        xmlMapper5.setFilters(filterProvider11);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.disableDefaultTyping();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory14 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.setSerializerFactory(serializerFactory14);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper5.setDefaultPrettyPrinter(prettyPrinter16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec18, xMLInputFactory19, xMLOutputFactory20);
        com.fasterxml.jackson.core.Version version22 = xmlFactory21.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory21);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = xmlMapper23.writer(characterEscapes24);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = xmlMapper23.setNodeFactory(jsonNodeFactory26);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper23.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = xmlMapper23.getJsonFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory31 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory32 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec30, xMLInputFactory31, xMLOutputFactory32);
        com.fasterxml.jackson.core.Version version34 = xmlFactory33.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper35 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory33);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes36 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter37 = xmlMapper35.writer(characterEscapes36);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray38 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = xmlMapper35.disable(featureArray38);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper40 = xmlMapper35.copy();
        java.text.DateFormat dateFormat41 = xmlMapper35.getDateFormat();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper23.setDateFormat(dateFormat41);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = objectMapper17.setDateFormat(dateFormat41);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode44 = objectMapper43.createArrayNode();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(version34);
        org.junit.Assert.assertNotNull(objectWriter37);
        org.junit.Assert.assertNotNull(featureArray38);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(xmlMapper40);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(arrayNode44);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser24.overrideStdFeatures((int) '#', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = jsonParser24.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: [B@358a3960; line: 1, column: 8]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonParser28);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper5);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory14 = xmlFactory11.configure(feature12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec8, xMLInputFactory9, xMLOutputFactory10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory11);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper13.writer(characterEscapes14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper13.setNodeFactory(jsonNodeFactory16);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper13.setFilterProvider(filterProvider18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory24 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec21, xMLInputFactory22, xMLOutputFactory23);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature25 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = xmlFactory24.disable(feature25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass28 = xmlFactory26.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor29 = objectMapper19.readValues(jsonParser20, featureClass28);
        boolean boolean30 = xmlMapper5.canSerialize(featureClass28);
        java.text.DateFormat dateFormat31 = xmlMapper5.getDateFormat();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature25.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory26);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(featureClass28);
        org.junit.Assert.assertNotNull(featureItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateFormat31);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload25 = null;
        jsonParser24.setRequestPayloadOnError(requestPayload25);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload27 = null;
        jsonParser24.setRequestPayloadOnError(requestPayload27);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = jsonParser24.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@2e21ad86; line: 1, column: 8]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray13 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper9.enable(featureArray13);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider15 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter16 = objectMapper14.writer(filterProvider15);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(featureArray13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectWriter16);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec8, xMLInputFactory9, xMLOutputFactory10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory11);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper13.writer(characterEscapes14);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray16 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper13.disable(featureArray16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper17.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig19 = objectMapper17.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = objectMapper17.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray21 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = objectMapper17.enable(featureArray21);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper5.disable(featureArray21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper29 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory27);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes30 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter31 = xmlMapper29.writer(characterEscapes30);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray32 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper29.disable(featureArray32);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = objectMapper33.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig35 = objectMapper33.getSerializationConfig();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode36 = objectMapper33.createArrayNode();
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList37 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = objectMapper33.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList37);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = xmlMapper5.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList37);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter40 = xmlMapper5.writer();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory41 = xmlMapper5.getTypeFactory();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(featureArray16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(serializationConfig19);
        org.junit.Assert.assertNotNull(serializerProvider20);
        org.junit.Assert.assertNotNull(featureArray21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(objectWriter31);
        org.junit.Assert.assertNotNull(featureArray32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(serializationConfig35);
        org.junit.Assert.assertNotNull(arrayNode36);
        org.junit.Assert.assertNotNull(moduleList37);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectWriter40);
        org.junit.Assert.assertNotNull(typeFactory41);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper5.enableDefaultTypingAsProperty(defaultTyping6, "XML");
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory11 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec9, xMLInputFactory10, xMLOutputFactory11);
        com.fasterxml.jackson.core.Version version13 = xmlFactory12.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter16 = xmlMapper14.writer(characterEscapes15);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray17 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = xmlMapper14.disable(featureArray17);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig20 = objectMapper18.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = objectMapper18.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec22, xMLInputFactory23, xMLOutputFactory24);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature26 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = xmlFactory25.disable(feature26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass29 = xmlFactory27.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = serializerProvider21.getUnknownTypeSerializer(featureClass29);
        java.util.TimeZone timeZone31 = serializerProvider21.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory33 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory34 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory35 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec32, xMLInputFactory33, xMLOutputFactory34);
        com.fasterxml.jackson.core.Version version36 = xmlFactory35.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper37 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory35);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes38 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter39 = xmlMapper37.writer(characterEscapes38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory41 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory42 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec40, xMLInputFactory41, xMLOutputFactory42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper45 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory43);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes46 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter47 = xmlMapper45.writer(characterEscapes46);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = xmlMapper45.setNodeFactory(jsonNodeFactory48);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper45.setFilterProvider(filterProvider50);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory54 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory55 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec53, xMLInputFactory54, xMLOutputFactory55);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature57 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = xmlFactory56.disable(feature57);
        com.fasterxml.jackson.core.Version version59 = xmlFactory58.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass60 = xmlFactory58.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor61 = objectMapper51.readValues(jsonParser52, featureClass60);
        boolean boolean62 = xmlMapper37.canSerialize(featureClass60);
        com.fasterxml.jackson.databind.BeanProperty beanProperty63 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer64 = serializerProvider21.findKeySerializer(featureClass60, beanProperty63);
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride65 = objectMapper8.configOverride(featureClass60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory67 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory68 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory69 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec66, xMLInputFactory67, xMLOutputFactory68);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature70 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = xmlFactory69.disable(feature70);
        java.lang.String str72 = xmlFactory69.getRootValueSeparator();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass73 = xmlFactory69.getFormatReadFeatureType();
        javax.xml.stream.XMLInputFactory xMLInputFactory74 = xmlFactory69.getXMLInputFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory75 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory76 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper8, xMLInputFactory74, xMLOutputFactory75);
        javax.xml.stream.XMLInputFactory xMLInputFactory77 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper78 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory77);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory79 = xmlMapper78.getTypeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper80 = objectMapper8.setTypeFactory(typeFactory79);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory81 = objectMapper8.getNodeFactory();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(objectWriter16);
        org.junit.Assert.assertNotNull(featureArray17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(serializationConfig20);
        org.junit.Assert.assertNotNull(serializerProvider21);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature26.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(featureClass29);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNotNull(objectWriter39);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(objectWriter47);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature57.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory58);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(featureClass60);
        org.junit.Assert.assertNotNull(featureItor61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer64);
        org.junit.Assert.assertNotNull(mutableConfigOverride65);
        org.junit.Assert.assertTrue("'" + feature70 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature70.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + " " + "'", str72, " ");
        org.junit.Assert.assertNotNull(featureClass73);
        org.junit.Assert.assertNotNull(xMLInputFactory74);
        org.junit.Assert.assertNotNull(typeFactory79);
        org.junit.Assert.assertNotNull(objectMapper80);
        org.junit.Assert.assertNotNull(jsonNodeFactory81);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper5.setSerializationInclusion(include11);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass13 = null;
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride14 = objectMapper12.configOverride(featureClass13);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = objectMapper12.getTypeFactory();
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy16 = objectMapper12.getPropertyNamingStrategy();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(mutableConfigOverride14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNull(propertyNamingStrategy16);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        byte byte26 = jsonParser24.getByteValue();
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = jsonParser24.readBinaryValue(outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Operation not supported by parser of type com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test546");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = xmlFactory5.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5, jacksonXmlModule8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper9.clearProblemHandlers();
        java.net.URL uRL11 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.JaxbWrapper jaxbWrapper13 = xmlMapper9.readValue(uRL11, typeReference12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNotNull(objectMapper10);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper5.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = xmlMapper5.getJsonFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray20 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper17.disable(featureArray20);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = xmlMapper17.copy();
        java.text.DateFormat dateFormat23 = xmlMapper17.getDateFormat();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper5.setDateFormat(dateFormat23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectMapper24.readTree("JacksonXmlModule");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character 'J' (code 74) in prolog; expected '<'? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(xmlMapper22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(objectMapper24);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.annotation.JsonInclude.Value value3 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = xmlMapper2.setPropertyInclusion(value3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper2.findAndRegisterModules();
        com.fasterxml.jackson.databind.InjectableValues injectableValues6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper7 = objectMapper5.setInjectableValues(injectableValues6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec8, xMLInputFactory9, xMLOutputFactory10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory11);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = xmlMapper13.writer(characterEscapes14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper13.setNodeFactory(jsonNodeFactory16);
        com.fasterxml.jackson.databind.Module[] moduleArray18 = new com.fasterxml.jackson.databind.Module[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper17.registerModules(moduleArray18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray28 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper25.disable(featureArray28);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = objectMapper29.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig31 = objectMapper29.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = objectMapper29.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature37 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = xmlFactory36.disable(feature37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass40 = xmlFactory38.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer41 = serializerProvider32.getUnknownTypeSerializer(featureClass40);
        java.util.TimeZone timeZone42 = serializerProvider32.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory45 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec43, xMLInputFactory44, xMLOutputFactory45);
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = xmlFactory46.setRootValueSeparator("");
        java.io.DataOutput dataOutput49 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator50 = jsonFactory48.createGenerator(dataOutput49);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider52 = serializerProvider32.setAttribute((java.lang.Object) jsonFactory48, (java.lang.Object) ' ');
        boolean boolean54 = serializerProvider52.hasSerializationFeatures(100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory56 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory57 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec55, xMLInputFactory56, xMLOutputFactory57);
        com.fasterxml.jackson.core.Version version59 = xmlFactory58.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper60 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory58);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes61 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter62 = xmlMapper60.writer(characterEscapes61);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray63 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper64 = xmlMapper60.disable(featureArray63);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = objectMapper64.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig66 = objectMapper64.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider67 = objectMapper64.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory69 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory70 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec68, xMLInputFactory69, xMLOutputFactory70);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature72 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory73 = xmlFactory71.disable(feature72);
        com.fasterxml.jackson.core.Version version74 = xmlFactory73.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass75 = xmlFactory73.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer76 = serializerProvider67.getUnknownTypeSerializer(featureClass75);
        boolean boolean77 = objJsonSerializer76.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.BeanProperty beanProperty78 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer79 = serializerProvider52.handleSecondaryContextualization(objJsonSerializer76, beanProperty78);
        java.util.TimeZone timeZone80 = serializerProvider52.getTimeZone();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper81 = objectMapper19.setTimeZone(timeZone80);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper82 = objectMapper7.setTimeZone(timeZone80);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper83 = objectMapper82.enableDefaultTyping();
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(objectMapper7);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(moduleArray18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(featureArray28);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(serializationConfig31);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature37.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory38);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(featureClass40);
        org.junit.Assert.assertNotNull(objJsonSerializer41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonGenerator50);
        org.junit.Assert.assertNotNull(serializerProvider52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(objectWriter62);
        org.junit.Assert.assertNotNull(featureArray63);
        org.junit.Assert.assertNotNull(objectMapper64);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertNotNull(serializationConfig66);
        org.junit.Assert.assertNotNull(serializerProvider67);
        org.junit.Assert.assertTrue("'" + feature72 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature72.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory73);
        org.junit.Assert.assertNotNull(version74);
        org.junit.Assert.assertNotNull(featureClass75);
        org.junit.Assert.assertNotNull(objJsonSerializer76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer79);
        org.junit.Assert.assertNotNull(timeZone80);
        org.junit.Assert.assertEquals(timeZone80.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(objectMapper81);
        org.junit.Assert.assertNotNull(objectMapper82);
        org.junit.Assert.assertNotNull(objectMapper83);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper5.enableDefaultTypingAsProperty(defaultTyping6, "XML");
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory11 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec9, xMLInputFactory10, xMLOutputFactory11);
        com.fasterxml.jackson.core.Version version13 = xmlFactory12.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter16 = xmlMapper14.writer(characterEscapes15);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray17 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = xmlMapper14.disable(featureArray17);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig20 = objectMapper18.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = objectMapper18.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec22, xMLInputFactory23, xMLOutputFactory24);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature26 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = xmlFactory25.disable(feature26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass29 = xmlFactory27.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = serializerProvider21.getUnknownTypeSerializer(featureClass29);
        java.util.TimeZone timeZone31 = serializerProvider21.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory33 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory34 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory35 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec32, xMLInputFactory33, xMLOutputFactory34);
        com.fasterxml.jackson.core.Version version36 = xmlFactory35.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper37 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory35);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes38 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter39 = xmlMapper37.writer(characterEscapes38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory41 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory42 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec40, xMLInputFactory41, xMLOutputFactory42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper45 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory43);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes46 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter47 = xmlMapper45.writer(characterEscapes46);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = xmlMapper45.setNodeFactory(jsonNodeFactory48);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper45.setFilterProvider(filterProvider50);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory54 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory55 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec53, xMLInputFactory54, xMLOutputFactory55);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature57 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = xmlFactory56.disable(feature57);
        com.fasterxml.jackson.core.Version version59 = xmlFactory58.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass60 = xmlFactory58.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor61 = objectMapper51.readValues(jsonParser52, featureClass60);
        boolean boolean62 = xmlMapper37.canSerialize(featureClass60);
        com.fasterxml.jackson.databind.BeanProperty beanProperty63 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer64 = serializerProvider21.findKeySerializer(featureClass60, beanProperty63);
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride65 = objectMapper8.configOverride(featureClass60);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig66 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper67 = objectMapper8.setConfig(deserializationConfig66);
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory69 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory70 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec68, xMLInputFactory69, xMLOutputFactory70);
        com.fasterxml.jackson.core.Version version72 = xmlFactory71.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper73 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory71);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes74 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter75 = xmlMapper73.writer(characterEscapes74);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray76 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper77 = xmlMapper73.disable(featureArray76);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper78 = objectMapper67.disable(featureArray76);
        com.fasterxml.jackson.core.type.TypeReference typeReference80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.JsonFormat.Value value81 = objectMapper67.readValue("XML", typeReference80);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character 'X' (code 88) in prolog; expected '<'? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(objectWriter16);
        org.junit.Assert.assertNotNull(featureArray17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(serializationConfig20);
        org.junit.Assert.assertNotNull(serializerProvider21);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature26.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(featureClass29);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNotNull(objectWriter39);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(objectWriter47);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature57.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory58);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(featureClass60);
        org.junit.Assert.assertNotNull(featureItor61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer64);
        org.junit.Assert.assertNotNull(mutableConfigOverride65);
        org.junit.Assert.assertNotNull(objectMapper67);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertNotNull(objectWriter75);
        org.junit.Assert.assertNotNull(featureArray76);
        org.junit.Assert.assertNotNull(objectMapper77);
        org.junit.Assert.assertNotNull(objectMapper78);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        java.lang.String str11 = objectMapper9.writeValueAsString((java.lang.Object) "XML");
        com.fasterxml.jackson.databind.InjectableValues injectableValues12 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = objectMapper9.reader(injectableValues12);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper9.writer(formatSchema14);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup16 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider17 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper9.setSerializerProvider((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider) xmlSerializerProvider17);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = xmlSerializerProvider17.getGenerator();
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = xmlFactory23.setRootValueSeparator("");
        java.io.DataOutput dataOutput26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory25.createGenerator(dataOutput26);
        boolean boolean28 = jsonGenerator27.canWriteTypeId();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonGenerator27.setCharacterEscapes(characterEscapes29);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter31 = jsonGenerator30.getPrettyPrinter();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector32 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair34 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector32, annotationIntrospector33);
        com.fasterxml.jackson.databind.introspect.Annotated annotated35 = null;
        java.lang.Boolean boolean36 = pair34.isOutputAsCData(annotated35);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector37 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair39 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector37, annotationIntrospector38);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector40 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector41 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair42 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector40, annotationIntrospector41);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair43 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair39, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair42);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair44 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair34, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair42);
        // The following exception was thrown during execution in test generation
        try {
            xmlSerializerProvider17.serializeValue(jsonGenerator30, (java.lang.Object) pair34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<String>XML</String>" + "'", str11, "<String>XML</String>");
        org.junit.Assert.assertNotNull(objectReader13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNull(jsonGenerator19);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNull(prettyPrinter31);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(pair44);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.core.Version version37 = xmlFactory36.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper38 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory36);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes39 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter40 = xmlMapper38.writer(characterEscapes39);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray41 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper38.disable(featureArray41);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = objectMapper42.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig44 = objectMapper42.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = objectMapper42.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature50 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = xmlFactory49.disable(feature50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass53 = xmlFactory51.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer54 = serializerProvider45.getUnknownTypeSerializer(featureClass53);
        java.util.TimeZone timeZone55 = serializerProvider45.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory65 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory66 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec64, xMLInputFactory65, xMLOutputFactory66);
        com.fasterxml.jackson.core.Version version68 = xmlFactory67.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper69 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory67);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes70 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter71 = xmlMapper69.writer(characterEscapes70);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory72 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper73 = xmlMapper69.setNodeFactory(jsonNodeFactory72);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider74 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper75 = xmlMapper69.setFilterProvider(filterProvider74);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory78 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory79 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory80 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec77, xMLInputFactory78, xMLOutputFactory79);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature81 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory82 = xmlFactory80.disable(feature81);
        com.fasterxml.jackson.core.Version version83 = xmlFactory82.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass84 = xmlFactory82.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor85 = objectMapper75.readValues(jsonParser76, featureClass84);
        boolean boolean86 = xmlMapper61.canSerialize(featureClass84);
        com.fasterxml.jackson.databind.JavaType javaType87 = serializerProvider45.constructType((java.lang.reflect.Type) featureClass84);
        com.fasterxml.jackson.databind.BeanProperty beanProperty89 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer90 = serializerProvider32.findTypedValueSerializer(featureClass84, false, beanProperty89);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertNotNull(objectWriter40);
        org.junit.Assert.assertNotNull(featureArray41);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(serializationConfig44);
        org.junit.Assert.assertNotNull(serializerProvider45);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature50.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory51);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(featureClass53);
        org.junit.Assert.assertNotNull(objJsonSerializer54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertNotNull(objectWriter71);
        org.junit.Assert.assertNotNull(objectMapper73);
        org.junit.Assert.assertNotNull(objectMapper75);
        org.junit.Assert.assertTrue("'" + feature81 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature81.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory82);
        org.junit.Assert.assertNotNull(version83);
        org.junit.Assert.assertNotNull(featureClass84);
        org.junit.Assert.assertNotNull(featureItor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(javaType87);
        org.junit.Assert.assertNotNull(objJsonSerializer90);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule6 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3, jacksonXmlModule6);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair10 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector8, annotationIntrospector9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair13 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector11, annotationIntrospector12);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair14 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair10, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair13);
        pair14.setDefaultUseWrapper(true);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector17 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair19 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector17, annotationIntrospector18);
        com.fasterxml.jackson.databind.introspect.Annotated annotated20 = null;
        java.lang.Boolean boolean21 = pair19.isOutputAsCData(annotated20);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair24 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector22, annotationIntrospector23);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair27 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector25, annotationIntrospector26);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair28 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair24, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair27);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair29 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair19, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair27);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair30 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair14, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair19);
        com.fasterxml.jackson.databind.introspect.Annotated annotated31 = null;
        java.lang.Boolean boolean32 = pair14.isOutputAsCData(annotated31);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper7.setAnnotationIntrospector((com.fasterxml.jackson.databind.AnnotationIntrospector) pair14);
        com.fasterxml.jackson.databind.introspect.Annotated annotated34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = pair14.hasCreatorAnnotation(annotated34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(pair29);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(objectMapper33);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair2 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.Boolean boolean4 = pair2.isOutputAsCData(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory6 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory7 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory6, xMLOutputFactory7);
        com.fasterxml.jackson.annotation.JsonInclude.Value value9 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper8.setPropertyInclusion(value9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.core.Version version15 = xmlFactory14.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory14);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper16.writer(characterEscapes17);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray19 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper16.disable(featureArray19);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig22 = objectMapper20.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = objectMapper20.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray24 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = objectMapper20.enable(featureArray24);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider26 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper20.setSerializerProvider(defaultSerializerProvider26);
        com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier xmlBeanDeserializerModifier29 = new com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier(" ");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider39 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter40 = xmlMapper36.writer(filterProvider39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory42 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory43 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory44 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec41, xMLInputFactory42, xMLOutputFactory43);
        com.fasterxml.jackson.core.Version version45 = xmlFactory44.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper46 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory44);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes47 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter48 = xmlMapper46.writer(characterEscapes47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory50 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory51 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec49, xMLInputFactory50, xMLOutputFactory51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper54 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory52);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes55 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter56 = xmlMapper54.writer(characterEscapes55);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory57 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper58 = xmlMapper54.setNodeFactory(jsonNodeFactory57);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider59 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = xmlMapper54.setFilterProvider(filterProvider59);
        com.fasterxml.jackson.core.JsonParser jsonParser61 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory63 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory64 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory65 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec62, xMLInputFactory63, xMLOutputFactory64);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature66 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = xmlFactory65.disable(feature66);
        com.fasterxml.jackson.core.Version version68 = xmlFactory67.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass69 = xmlFactory67.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor70 = objectMapper60.readValues(jsonParser61, featureClass69);
        boolean boolean71 = xmlMapper46.canSerialize(featureClass69);
        boolean boolean72 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass69);
        com.fasterxml.jackson.databind.JavaType javaType73 = xmlMapper36.constructType((java.lang.reflect.Type) featureClass69);
        boolean boolean74 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType73);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer75 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer76 = xmlBeanDeserializerModifier29.modifyKeyDeserializer(deserializationConfig30, javaType73, keyDeserializer75);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference77 = null;
        boolean boolean78 = objectMapper20.canDeserialize(javaType73, throwableAtomicReference77);
        com.fasterxml.jackson.databind.JavaType javaType79 = objectMapper10.constructType((java.lang.reflect.Type) javaType73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass80 = pair2.findSerializationKeyType(annotated5, javaType79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(featureArray19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(serializationConfig22);
        org.junit.Assert.assertNotNull(serializerProvider23);
        org.junit.Assert.assertNotNull(featureArray24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectWriter40);
        org.junit.Assert.assertNotNull(version45);
        org.junit.Assert.assertNotNull(objectWriter48);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(objectWriter56);
        org.junit.Assert.assertNotNull(objectMapper58);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature66.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory67);
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertNotNull(featureClass69);
        org.junit.Assert.assertNotNull(featureItor70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(javaType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(keyDeserializer76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(javaType79);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature8 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper7.disable(feature8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider20 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper15.setFilterProvider(filterProvider20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature27 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = xmlFactory26.disable(feature27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass30 = xmlFactory28.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor31 = objectMapper21.readValues(jsonParser22, featureClass30);
        boolean boolean32 = objectMapper9.canSerialize(featureClass30);
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray33 = new com.fasterxml.jackson.databind.MapperFeature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = objectMapper9.enable(mapperFeatureArray33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper40 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory38);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes41 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter42 = xmlMapper40.writer(characterEscapes41);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = xmlMapper40.setNodeFactory(jsonNodeFactory43);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = xmlMapper40.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = xmlMapper40.getJsonFactory();
        java.lang.Object obj47 = null;
        byte[] byteArray48 = xmlMapper40.writeValueAsBytes(obj47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory50 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory51 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec49, xMLInputFactory50, xMLOutputFactory51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper54 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory52);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes55 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter56 = xmlMapper54.writer(characterEscapes55);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory57 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper58 = xmlMapper54.setNodeFactory(jsonNodeFactory57);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider59 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = xmlMapper54.setFilterProvider(filterProvider59);
        com.fasterxml.jackson.core.JsonParser jsonParser61 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory63 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory64 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory65 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec62, xMLInputFactory63, xMLOutputFactory64);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature66 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = xmlFactory65.disable(feature66);
        com.fasterxml.jackson.core.Version version68 = xmlFactory67.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass69 = xmlFactory67.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor70 = objectMapper60.readValues(jsonParser61, featureClass69);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature71 = objectMapper9.readValue(byteArray48, featureClass69);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not deserialize instance of com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature out of START_OBJECT token? at [Source: [B@1aa6c025; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature8.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature27.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory28);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(featureClass30);
        org.junit.Assert.assertNotNull(featureItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(mapperFeatureArray33);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(objectWriter42);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(objectWriter56);
        org.junit.Assert.assertNotNull(objectMapper58);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature66.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory67);
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertNotNull(featureClass69);
        org.junit.Assert.assertNotNull(featureItor70);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector1 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector(false);
        com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig> serializationConfigMapperConfig2 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember3 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory5 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec4, xMLInputFactory5, xMLOutputFactory6);
        com.fasterxml.jackson.core.Version version8 = xmlFactory7.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory7);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper9.writer(characterEscapes10);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray12 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper9.disable(featureArray12);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper13.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig15 = objectMapper13.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = objectMapper13.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray17 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper13.enable(featureArray17);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider19 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = objectMapper13.setSerializerProvider(defaultSerializerProvider19);
        com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier xmlBeanDeserializerModifier22 = new com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier(" ");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig23 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper29 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory27);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes30 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter31 = xmlMapper29.writer(characterEscapes30);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider32 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter33 = xmlMapper29.writer(filterProvider32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory43 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory44 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec42, xMLInputFactory43, xMLOutputFactory44);
        com.fasterxml.jackson.core.Version version46 = xmlFactory45.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper47 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory45);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes48 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter49 = xmlMapper47.writer(characterEscapes48);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper47.setNodeFactory(jsonNodeFactory50);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider52 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper53 = xmlMapper47.setFilterProvider(filterProvider52);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory56 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory57 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec55, xMLInputFactory56, xMLOutputFactory57);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature59 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory60 = xmlFactory58.disable(feature59);
        com.fasterxml.jackson.core.Version version61 = xmlFactory60.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass62 = xmlFactory60.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor63 = objectMapper53.readValues(jsonParser54, featureClass62);
        boolean boolean64 = xmlMapper39.canSerialize(featureClass62);
        boolean boolean65 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass62);
        com.fasterxml.jackson.databind.JavaType javaType66 = xmlMapper29.constructType((java.lang.reflect.Type) featureClass62);
        boolean boolean67 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType66);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer68 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer69 = xmlBeanDeserializerModifier22.modifyKeyDeserializer(deserializationConfig23, javaType66, keyDeserializer68);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference70 = null;
        boolean boolean71 = objectMapper13.canDeserialize(javaType66, throwableAtomicReference70);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<?> wildcardTypeResolverBuilder72 = jacksonXmlAnnotationIntrospector1.findPropertyContentTypeResolver(serializationConfigMapperConfig2, annotatedMember3, javaType66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must call method with a container or reference type (got [simple type, class com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature])");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(serializationConfig15);
        org.junit.Assert.assertNotNull(serializerProvider16);
        org.junit.Assert.assertNotNull(featureArray17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(objectWriter31);
        org.junit.Assert.assertNotNull(objectWriter33);
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNotNull(objectWriter49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertNotNull(objectMapper53);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature59.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory60);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(featureClass62);
        org.junit.Assert.assertNotNull(featureItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(javaType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(keyDeserializer69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier0 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec1, xMLInputFactory2, xMLOutputFactory3);
        com.fasterxml.jackson.core.Version version5 = xmlFactory4.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper6 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory4);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = xmlMapper6.writer(characterEscapes7);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper6.disable(featureArray9);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper10.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig12 = objectMapper10.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription13 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder14 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder15 = xmlBeanSerializerModifier0.updateBuilder(serializationConfig12, beanDescription13, beanSerializerBuilder14);
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier16 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory19 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory20 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec17, xMLInputFactory18, xMLOutputFactory19);
        com.fasterxml.jackson.core.Version version21 = xmlFactory20.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper22 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory20);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes23 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter24 = xmlMapper22.writer(characterEscapes23);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray25 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper22.disable(featureArray25);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper26.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig28 = objectMapper26.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription29 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder30 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder31 = xmlBeanSerializerModifier16.updateBuilder(serializationConfig28, beanDescription29, beanSerializerBuilder30);
        com.fasterxml.jackson.databind.BeanDescription beanDescription32 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.core.Version version37 = xmlFactory36.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper38 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory36);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes39 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter40 = xmlMapper38.writer(characterEscapes39);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray41 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper38.disable(featureArray41);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = objectMapper42.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig44 = objectMapper42.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = objectMapper42.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature50 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = xmlFactory49.disable(feature50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass53 = xmlFactory51.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer54 = serializerProvider45.getUnknownTypeSerializer(featureClass53);
        java.util.TimeZone timeZone55 = serializerProvider45.getTimeZone();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer56 = serializerProvider45.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer57 = xmlBeanSerializerModifier0.modifySerializer(serializationConfig28, beanDescription32, objJsonSerializer56);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(serializationConfig12);
        org.junit.Assert.assertNull(beanSerializerBuilder15);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertNotNull(objectWriter24);
        org.junit.Assert.assertNotNull(featureArray25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(serializationConfig28);
        org.junit.Assert.assertNull(beanSerializerBuilder31);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertNotNull(objectWriter40);
        org.junit.Assert.assertNotNull(featureArray41);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(serializationConfig44);
        org.junit.Assert.assertNotNull(serializerProvider45);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature50.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory51);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(featureClass53);
        org.junit.Assert.assertNotNull(objJsonSerializer54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(objJsonSerializer56);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer57);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean5 = xmlFactory3.isEnabled(feature4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature10 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = xmlFactory9.disable(feature10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper13 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory11);
        boolean boolean14 = xmlFactory11.requiresCustomCodec();
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = xmlFactory11.getXMLInputFactory();
        xmlFactory3.setXMLInputFactory(xMLInputFactory15);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = xmlFactory3._getBufferRecycler();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature10.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(xMLInputFactory15);
        org.junit.Assert.assertNotNull(bufferRecycler17);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec22, xMLInputFactory23, xMLOutputFactory24);
        com.fasterxml.jackson.core.Version version26 = xmlFactory25.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory25);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes28 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter29 = xmlMapper27.writer(characterEscapes28);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper27.setNodeFactory(jsonNodeFactory30);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory32 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader33 = xmlMapper27.readerForUpdating((java.lang.Object) xmlFactory32);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass34 = xmlFactory32.getFormatWriteFeatureType();
        com.fasterxml.jackson.databind.JavaType javaType35 = serializerProvider12.constructType((java.lang.reflect.Type) featureClass34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec36, xMLInputFactory37, xMLOutputFactory38);
        com.fasterxml.jackson.core.Version version40 = xmlFactory39.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory39);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes42 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter43 = xmlMapper41.writer(characterEscapes42);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider44 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter45 = xmlMapper41.writer(filterProvider44);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode46 = xmlMapper41.createArrayNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory48 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory50 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec47, xMLInputFactory48, xMLOutputFactory49);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature51 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = xmlFactory50.disable(feature51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper54 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory52);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass55 = xmlFactory52.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader56 = xmlMapper41.reader(featureClass55);
        com.fasterxml.jackson.databind.BeanProperty beanProperty57 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer58 = serializerProvider12.findValueSerializer(featureClass55, beanProperty57);
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory60 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory61 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory62 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec59, xMLInputFactory60, xMLOutputFactory61);
        com.fasterxml.jackson.core.Version version63 = xmlFactory62.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper64 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory62);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes65 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter66 = xmlMapper64.writer(characterEscapes65);
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory68 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory69 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory70 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec67, xMLInputFactory68, xMLOutputFactory69);
        com.fasterxml.jackson.core.Version version71 = xmlFactory70.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper72 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory70);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes73 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter74 = xmlMapper72.writer(characterEscapes73);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory75 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper76 = xmlMapper72.setNodeFactory(jsonNodeFactory75);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider77 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper78 = xmlMapper72.setFilterProvider(filterProvider77);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory81 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory82 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory83 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec80, xMLInputFactory81, xMLOutputFactory82);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature84 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory85 = xmlFactory83.disable(feature84);
        com.fasterxml.jackson.core.Version version86 = xmlFactory85.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass87 = xmlFactory85.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor88 = objectMapper78.readValues(jsonParser79, featureClass87);
        boolean boolean89 = xmlMapper64.canSerialize(featureClass87);
        boolean boolean90 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass87);
        com.fasterxml.jackson.databind.BeanProperty beanProperty92 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer93 = serializerProvider12.findTypedValueSerializer(featureClass87, false, beanProperty92);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(objectWriter29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNotNull(objectReader33);
        org.junit.Assert.assertNotNull(featureClass34);
        org.junit.Assert.assertNotNull(javaType35);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(objectWriter43);
        org.junit.Assert.assertNotNull(objectWriter45);
        org.junit.Assert.assertNotNull(arrayNode46);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature51.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory52);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(featureClass55);
        org.junit.Assert.assertNotNull(objectReader56);
        org.junit.Assert.assertNotNull(objJsonSerializer58);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNotNull(objectWriter66);
        org.junit.Assert.assertNotNull(version71);
        org.junit.Assert.assertNotNull(objectWriter74);
        org.junit.Assert.assertNotNull(objectMapper76);
        org.junit.Assert.assertNotNull(objectMapper78);
        org.junit.Assert.assertTrue("'" + feature84 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature84.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory85);
        org.junit.Assert.assertNotNull(version86);
        org.junit.Assert.assertNotNull(featureClass87);
        org.junit.Assert.assertNotNull(featureItor88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer93);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory32 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec31, xMLInputFactory32, xMLOutputFactory33);
        com.fasterxml.jackson.core.Version version35 = xmlFactory34.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter38 = xmlMapper36.writer(characterEscapes37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper36.setNodeFactory(jsonNodeFactory39);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper36.setFilterProvider(filterProvider41);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory45 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory46 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec44, xMLInputFactory45, xMLOutputFactory46);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature48 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = xmlFactory47.disable(feature48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass51 = xmlFactory49.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor52 = objectMapper42.readValues(jsonParser43, featureClass51);
        boolean boolean53 = xmlMapper28.canSerialize(featureClass51);
        com.fasterxml.jackson.databind.JavaType javaType54 = serializerProvider12.constructType((java.lang.reflect.Type) featureClass51);
        boolean boolean55 = serializerProvider12.canOverrideAccessModifiers();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature56 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = serializerProvider12.isEnabled(serializationFeature56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature48.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(featureClass51);
        org.junit.Assert.assertNotNull(featureItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(javaType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper5.setFilterProvider(filterProvider10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor21 = objectMapper11.readValues(jsonParser12, featureClass20);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair24 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector22, annotationIntrospector23);
        com.fasterxml.jackson.databind.introspect.Annotated annotated25 = null;
        java.lang.Boolean boolean26 = pair24.isOutputAsCData(annotated25);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair29 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector27, annotationIntrospector28);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector30 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair32 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector30, annotationIntrospector31);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair33 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair29, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair32);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair34 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair24, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper11.setAnnotationIntrospector((com.fasterxml.jackson.databind.AnnotationIntrospector) pair33);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter36 = objectMapper11.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.InjectableValues injectableValues37 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = objectMapper11.setInjectableValues(injectableValues37);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter39 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory41 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory42 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec40, xMLInputFactory41, xMLOutputFactory42);
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = xmlFactory43.setRootValueSeparator("");
        java.io.DataOutput dataOutput46 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator47 = jsonFactory45.createGenerator(dataOutput46);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = jsonGenerator47.setHighestNonEscapedChar((-1));
        boolean boolean50 = jsonGenerator49.canWriteObjectId();
        int int51 = jsonGenerator49.getHighestEscapedChar();
        defaultXmlPrettyPrinter39.writeArrayValueSeparator(jsonGenerator49);
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory54 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory55 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec53, xMLInputFactory54, xMLOutputFactory55);
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = xmlFactory56.setRootValueSeparator("");
        java.io.DataOutput dataOutput59 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = jsonFactory58.createGenerator(dataOutput59);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = jsonGenerator60.setHighestNonEscapedChar((-1));
        defaultXmlPrettyPrinter39.beforeObjectEntries(jsonGenerator62);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = null;
        defaultXmlPrettyPrinter39.beforeArrayValues(jsonGenerator64);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter66 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory68 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory69 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory70 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec67, xMLInputFactory68, xMLOutputFactory69);
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = xmlFactory70.setRootValueSeparator("");
        java.io.DataOutput dataOutput73 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator74 = jsonFactory72.createGenerator(dataOutput73);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator76 = jsonGenerator74.setHighestNonEscapedChar((-1));
        boolean boolean77 = jsonGenerator76.canWriteObjectId();
        int int78 = jsonGenerator76.getHighestEscapedChar();
        defaultXmlPrettyPrinter66.writeArrayValueSeparator(jsonGenerator76);
        defaultXmlPrettyPrinter39.writeObjectFieldValueSeparator(jsonGenerator76);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper81 = objectMapper11.setDefaultPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultXmlPrettyPrinter39);
        org.codehaus.stax2.XMLStreamWriter2 xMLStreamWriter2_82 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultXmlPrettyPrinter39.writeLeafElement(xMLStreamWriter2_82, "", "", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(featureItor21);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(pair34);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(objectWriter36);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonGenerator47);
        org.junit.Assert.assertNotNull(jsonGenerator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertNotNull(jsonGenerator74);
        org.junit.Assert.assertNotNull(jsonGenerator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objectMapper81);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier0 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec1, xMLInputFactory2, xMLOutputFactory3);
        com.fasterxml.jackson.core.Version version5 = xmlFactory4.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper6 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory4);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = xmlMapper6.writer(characterEscapes7);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper6.disable(featureArray9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = xmlMapper6.getDeserializationContext();
        com.fasterxml.jackson.core.Version version12 = xmlMapper6.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper6.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig14 = xmlMapper6.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec16, xMLInputFactory17, xMLOutputFactory18);
        com.fasterxml.jackson.core.Version version20 = xmlFactory19.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper21 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory19);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes22 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter23 = xmlMapper21.writer(characterEscapes22);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray24 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = xmlMapper21.disable(featureArray24);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = objectMapper25.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig27 = objectMapper25.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = objectMapper25.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory30 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory32 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec29, xMLInputFactory30, xMLOutputFactory31);
        com.fasterxml.jackson.core.Version version33 = xmlFactory32.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper34 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory32);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes35 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter36 = xmlMapper34.writer(characterEscapes35);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray37 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = xmlMapper34.disable(featureArray37);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext39 = xmlMapper34.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory42 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory43 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory44 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec41, xMLInputFactory42, xMLOutputFactory43);
        com.fasterxml.jackson.core.Version version45 = xmlFactory44.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper46 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory44);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes47 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter48 = xmlMapper46.writer(characterEscapes47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory50 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory51 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec49, xMLInputFactory50, xMLOutputFactory51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper54 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory52);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes55 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter56 = xmlMapper54.writer(characterEscapes55);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory57 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper58 = xmlMapper54.setNodeFactory(jsonNodeFactory57);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider59 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = xmlMapper54.setFilterProvider(filterProvider59);
        com.fasterxml.jackson.core.JsonParser jsonParser61 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory63 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory64 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory65 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec62, xMLInputFactory63, xMLOutputFactory64);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature66 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = xmlFactory65.disable(feature66);
        com.fasterxml.jackson.core.Version version68 = xmlFactory67.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass69 = xmlFactory67.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor70 = objectMapper60.readValues(jsonParser61, featureClass69);
        boolean boolean71 = xmlMapper46.canSerialize(featureClass69);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference72 = null;
        boolean boolean73 = xmlMapper34.canSerialize(featureClass69, throwableAtomicReference72);
        com.fasterxml.jackson.databind.BeanProperty beanProperty75 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer76 = serializerProvider28.findTypedValueSerializer(featureClass69, false, beanProperty75);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer77 = serializerProvider28.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer78 = xmlBeanSerializerModifier0.modifySerializer(serializationConfig14, beanDescription15, objJsonSerializer77);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory80 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory81 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory82 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec79, xMLInputFactory80, xMLOutputFactory81);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature83 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory84 = xmlFactory82.disable(feature83);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule85 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper86 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory82, jacksonXmlModule85);
        boolean boolean87 = objJsonSerializer77.isEmpty((java.lang.Object) jacksonXmlModule85);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(deserializationContext11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(serializationConfig14);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(objectWriter23);
        org.junit.Assert.assertNotNull(featureArray24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(serializationConfig27);
        org.junit.Assert.assertNotNull(serializerProvider28);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(objectWriter36);
        org.junit.Assert.assertNotNull(featureArray37);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(deserializationContext39);
        org.junit.Assert.assertNotNull(version45);
        org.junit.Assert.assertNotNull(objectWriter48);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(objectWriter56);
        org.junit.Assert.assertNotNull(objectMapper58);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature66.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory67);
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertNotNull(featureClass69);
        org.junit.Assert.assertNotNull(featureItor70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer76);
        org.junit.Assert.assertNotNull(objJsonSerializer77);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer78);
        org.junit.Assert.assertTrue("'" + feature83 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature83.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper5.writer();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider11 = null;
        xmlMapper5.setFilters(filterProvider11);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = xmlMapper5.setDefaultUseWrapper(false);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(xmlMapper14);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature8 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper7.disable(feature8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider20 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper15.setFilterProvider(filterProvider20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature27 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = xmlFactory26.disable(feature27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass30 = xmlFactory28.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor31 = objectMapper21.readValues(jsonParser22, featureClass30);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector32 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector33 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair34 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector32, annotationIntrospector33);
        com.fasterxml.jackson.databind.introspect.Annotated annotated35 = null;
        java.lang.Boolean boolean36 = pair34.isOutputAsCData(annotated35);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector37 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair39 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector37, annotationIntrospector38);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector40 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector41 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair42 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector40, annotationIntrospector41);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair43 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair39, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair42);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair44 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair34, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair43);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = objectMapper21.setAnnotationIntrospector((com.fasterxml.jackson.databind.AnnotationIntrospector) pair43);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = objectMapper45.clearProblemHandlers();
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory48 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory50 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec47, xMLInputFactory48, xMLOutputFactory49);
        com.fasterxml.jackson.core.Version version51 = xmlFactory50.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper52 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory50);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes53 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter54 = xmlMapper52.writer(characterEscapes53);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray55 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper56 = xmlMapper52.disable(featureArray55);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory57 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader58 = xmlMapper52.reader(jsonNodeFactory57);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper59 = xmlMapper52.copy();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = xmlMapper52.setDefaultUseWrapper(true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory63 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory64 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory65 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec62, xMLInputFactory63, xMLOutputFactory64);
        com.fasterxml.jackson.core.Version version66 = xmlFactory65.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper67 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory65);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes68 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter69 = xmlMapper67.writer(characterEscapes68);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray70 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper71 = xmlMapper67.disable(featureArray70);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter72 = xmlMapper67.writer();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider73 = null;
        xmlMapper67.setFilters(filterProvider73);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper75 = xmlMapper67.disableDefaultTyping();
        com.fasterxml.jackson.core.ObjectCodec objectCodec76 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory77 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory78 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory79 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec76, xMLInputFactory77, xMLOutputFactory78);
        com.fasterxml.jackson.core.Version version80 = xmlFactory79.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper81 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory79);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes82 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter83 = xmlMapper81.writer(characterEscapes82);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray84 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper85 = xmlMapper81.disable(featureArray84);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext86 = xmlMapper81.getDeserializationContext();
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver87 = xmlMapper81.getSubtypeResolver();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper88 = objectMapper75.setSubtypeResolver(subtypeResolver87);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper89 = xmlMapper61.setSubtypeResolver(subtypeResolver87);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper90 = objectMapper46.setSubtypeResolver(subtypeResolver87);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper91 = objectMapper9.setSubtypeResolver(subtypeResolver87);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature8.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature27.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory28);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(featureClass30);
        org.junit.Assert.assertNotNull(featureItor31);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(pair44);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(version51);
        org.junit.Assert.assertNotNull(objectWriter54);
        org.junit.Assert.assertNotNull(featureArray55);
        org.junit.Assert.assertNotNull(objectMapper56);
        org.junit.Assert.assertNotNull(objectReader58);
        org.junit.Assert.assertNotNull(xmlMapper59);
        org.junit.Assert.assertNotNull(xmlMapper61);
        org.junit.Assert.assertNotNull(version66);
        org.junit.Assert.assertNotNull(objectWriter69);
        org.junit.Assert.assertNotNull(featureArray70);
        org.junit.Assert.assertNotNull(objectMapper71);
        org.junit.Assert.assertNotNull(objectWriter72);
        org.junit.Assert.assertNotNull(objectMapper75);
        org.junit.Assert.assertNotNull(version80);
        org.junit.Assert.assertNotNull(objectWriter83);
        org.junit.Assert.assertNotNull(featureArray84);
        org.junit.Assert.assertNotNull(objectMapper85);
        org.junit.Assert.assertNotNull(deserializationContext86);
        org.junit.Assert.assertNotNull(subtypeResolver87);
        org.junit.Assert.assertNotNull(objectMapper88);
        org.junit.Assert.assertNotNull(objectMapper89);
        org.junit.Assert.assertNotNull(objectMapper90);
        org.junit.Assert.assertNotNull(objectMapper91);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping14 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper13.enableDefaultTypingAsProperty(defaultTyping14, " ");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = objectMapper13.clearProblemHandlers();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector18 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector19 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair21 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector19, annotationIntrospector20);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair24 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector22, annotationIntrospector23);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair25 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair21, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair24);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair25, annotationIntrospector26);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair28 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector18, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair25);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = objectMapper13.setAnnotationIntrospector(annotationIntrospector18);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(annotationIntrospector26);
        org.junit.Assert.assertNotNull(annotationIntrospector27);
        org.junit.Assert.assertNotNull(objectMapper29);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector1 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector(false);
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory5 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec4, xMLInputFactory5, xMLOutputFactory6);
        com.fasterxml.jackson.core.Version version8 = xmlFactory7.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory7);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper9.writer(characterEscapes10);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray12 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper9.disable(featureArray12);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper13.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig15 = objectMapper13.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription16 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder17 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder18 = xmlBeanSerializerModifier3.updateBuilder(serializationConfig15, beanDescription16, beanSerializerBuilder17);
        com.fasterxml.jackson.databind.BeanDescription beanDescription19 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> beanPropertyWriterList21 = new java.util.ArrayList<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>) beanPropertyWriterList21, beanPropertyWriterArray20);
        java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> beanPropertyWriterList23 = xmlBeanSerializerModifier2.changeProperties(serializationConfig15, beanDescription19, (java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>) beanPropertyWriterList21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper29 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory27);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes30 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter31 = xmlMapper29.writer(characterEscapes30);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray32 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper29.disable(featureArray32);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext34 = xmlMapper29.getDeserializationContext();
        com.fasterxml.jackson.core.Version version35 = xmlMapper29.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter36 = xmlMapper29.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper37 = xmlMapper29.enableDefaultTyping();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory39 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec38, xMLInputFactory39, xMLOutputFactory40);
        com.fasterxml.jackson.core.Version version42 = xmlFactory41.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper43 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory41);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter45 = xmlMapper43.writer(characterEscapes44);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray46 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper47 = xmlMapper43.disable(featureArray46);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper48 = objectMapper47.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig49 = objectMapper47.getSerializationConfig();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper50 = xmlMapper29.setMixInResolver((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) serializationConfig49);
        com.fasterxml.jackson.databind.type.ArrayType arrayType51 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory54 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory55 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec53, xMLInputFactory54, xMLOutputFactory55);
        com.fasterxml.jackson.core.Version version57 = xmlFactory56.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper58 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory56);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes59 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter60 = xmlMapper58.writer(characterEscapes59);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray61 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper62 = xmlMapper58.disable(featureArray61);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper63 = objectMapper62.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig64 = objectMapper62.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider65 = objectMapper62.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory67 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory68 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory69 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec66, xMLInputFactory67, xMLOutputFactory68);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature70 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = xmlFactory69.disable(feature70);
        com.fasterxml.jackson.core.Version version72 = xmlFactory71.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass73 = xmlFactory71.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer74 = serializerProvider65.getUnknownTypeSerializer(featureClass73);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer75 = xmlBeanSerializerModifier2.modifyArraySerializer(serializationConfig49, arrayType51, beanDescription52, objJsonSerializer74);
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedClass76 = null;
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier77 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier78 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory80 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory81 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory82 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec79, xMLInputFactory80, xMLOutputFactory81);
        com.fasterxml.jackson.core.Version version83 = xmlFactory82.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper84 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory82);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes85 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter86 = xmlMapper84.writer(characterEscapes85);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray87 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper88 = xmlMapper84.disable(featureArray87);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper89 = objectMapper88.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig90 = objectMapper88.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription91 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder92 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder93 = xmlBeanSerializerModifier78.updateBuilder(serializationConfig90, beanDescription91, beanSerializerBuilder92);
        com.fasterxml.jackson.databind.BeanDescription beanDescription94 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray95 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> beanPropertyWriterList96 = new java.util.ArrayList<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>) beanPropertyWriterList96, beanPropertyWriterArray95);
        java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> beanPropertyWriterList98 = xmlBeanSerializerModifier77.changeProperties(serializationConfig90, beanDescription94, (java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>) beanPropertyWriterList96);
        // The following exception was thrown during execution in test generation
        try {
            jacksonXmlAnnotationIntrospector1.findAndAddVirtualProperties((com.fasterxml.jackson.databind.cfg.MapperConfig<com.fasterxml.jackson.databind.SerializationConfig>) serializationConfig49, annotatedClass76, beanPropertyWriterList98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(serializationConfig15);
        org.junit.Assert.assertNull(beanSerializerBuilder18);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriterList23);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(objectWriter31);
        org.junit.Assert.assertNotNull(featureArray32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(deserializationContext34);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(objectWriter36);
        org.junit.Assert.assertNotNull(objectMapper37);
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertNotNull(objectWriter45);
        org.junit.Assert.assertNotNull(featureArray46);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertNotNull(serializationConfig49);
        org.junit.Assert.assertNotNull(objectMapper50);
        org.junit.Assert.assertNotNull(version57);
        org.junit.Assert.assertNotNull(objectWriter60);
        org.junit.Assert.assertNotNull(featureArray61);
        org.junit.Assert.assertNotNull(objectMapper62);
        org.junit.Assert.assertNotNull(objectMapper63);
        org.junit.Assert.assertNotNull(serializationConfig64);
        org.junit.Assert.assertNotNull(serializerProvider65);
        org.junit.Assert.assertTrue("'" + feature70 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature70.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory71);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertNotNull(featureClass73);
        org.junit.Assert.assertNotNull(objJsonSerializer74);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer75);
        org.junit.Assert.assertNotNull(version83);
        org.junit.Assert.assertNotNull(objectWriter86);
        org.junit.Assert.assertNotNull(featureArray87);
        org.junit.Assert.assertNotNull(objectMapper88);
        org.junit.Assert.assertNotNull(objectMapper89);
        org.junit.Assert.assertNotNull(serializationConfig90);
        org.junit.Assert.assertNull(beanSerializerBuilder93);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriterList98);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper5.setSerializationInclusion(include11);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = xmlMapper5.enableDefaultTyping(defaultTyping13);
        com.fasterxml.jackson.core.Base64Variant base64Variant15 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper5.setBase64Variant(base64Variant15);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectMapper16);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper5.setSerializationInclusion(include11);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = xmlMapper5.getFactory();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(xmlFactory13);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier xmlBeanDeserializerModifier2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier(" ");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory5 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec4, xMLInputFactory5, xMLOutputFactory6);
        com.fasterxml.jackson.core.Version version8 = xmlFactory7.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory7);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper9.writer(characterEscapes10);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper9.writer(filterProvider12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec22, xMLInputFactory23, xMLOutputFactory24);
        com.fasterxml.jackson.core.Version version26 = xmlFactory25.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory25);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes28 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter29 = xmlMapper27.writer(characterEscapes28);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper27.setNodeFactory(jsonNodeFactory30);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider32 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper27.setFilterProvider(filterProvider32);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature39 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = xmlFactory38.disable(feature39);
        com.fasterxml.jackson.core.Version version41 = xmlFactory40.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass42 = xmlFactory40.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor43 = objectMapper33.readValues(jsonParser34, featureClass42);
        boolean boolean44 = xmlMapper19.canSerialize(featureClass42);
        boolean boolean45 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass42);
        com.fasterxml.jackson.databind.JavaType javaType46 = xmlMapper9.constructType((java.lang.reflect.Type) featureClass42);
        boolean boolean47 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType46);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer48 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer49 = xmlBeanDeserializerModifier2.modifyKeyDeserializer(deserializationConfig3, javaType46, keyDeserializer48);
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule50 = jacksonXmlModule0.setDeserializerModifier((com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) xmlBeanDeserializerModifier2);
        com.fasterxml.jackson.databind.jsontype.NamedType namedType51 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray52 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType51 };
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule53 = jacksonXmlModule0.registerSubtypes(namedTypeArray52);
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier54 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier55 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray64 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper61.disable(featureArray64);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = objectMapper65.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig67 = objectMapper65.getSerializationConfig();
        com.fasterxml.jackson.databind.BeanDescription beanDescription68 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder69 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerBuilder beanSerializerBuilder70 = xmlBeanSerializerModifier55.updateBuilder(serializationConfig67, beanDescription68, beanSerializerBuilder69);
        com.fasterxml.jackson.databind.BeanDescription beanDescription71 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray72 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> beanPropertyWriterList73 = new java.util.ArrayList<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>) beanPropertyWriterList73, beanPropertyWriterArray72);
        java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> beanPropertyWriterList75 = xmlBeanSerializerModifier54.changeProperties(serializationConfig67, beanDescription71, (java.util.List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>) beanPropertyWriterList73);
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule76 = simpleModule53.setSerializerModifier((com.fasterxml.jackson.databind.ser.BeanSerializerModifier) xmlBeanSerializerModifier54);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(objectWriter29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature39.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory40);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(featureClass42);
        org.junit.Assert.assertNotNull(featureItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(keyDeserializer49);
        org.junit.Assert.assertNotNull(simpleModule50);
        org.junit.Assert.assertNotNull(namedTypeArray52);
        org.junit.Assert.assertNotNull(simpleModule53);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(featureArray64);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertNotNull(objectMapper66);
        org.junit.Assert.assertNotNull(serializationConfig67);
        org.junit.Assert.assertNull(beanSerializerBuilder70);
        org.junit.Assert.assertNotNull(beanPropertyWriterArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriterList75);
        org.junit.Assert.assertNotNull(simpleModule76);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        com.fasterxml.jackson.databind.BeanProperty beanProperty33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = serializerProvider12.findNullValueSerializer(beanProperty33);
        java.lang.Class<?> wildcardClass35 = serializerProvider12.getActiveView();
        java.lang.reflect.Type type36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType37 = serializerProvider12.constructType(type36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized Type: [null]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertNotNull(objJsonSerializer34);
        org.junit.Assert.assertNull(wildcardClass35);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper5);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping(defaultTyping12);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes14 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader15 = xmlMapper5.reader(contextAttributes14);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectReader15);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = xmlFactory3.setRootValueSeparator("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.core.Version version10 = xmlFactory9.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper11 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory9);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper11.writer(characterEscapes12);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper11.setNodeFactory(jsonNodeFactory14);
        com.fasterxml.jackson.databind.Module[] moduleArray16 = new com.fasterxml.jackson.databind.Module[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = objectMapper15.registerModules(moduleArray16);
        com.fasterxml.jackson.annotation.JsonInclude.Include include18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper15.setSerializationInclusion(include18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory5.setCodec((com.fasterxml.jackson.core.ObjectCodec) objectMapper19);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(moduleArray16);
        org.junit.Assert.assertNotNull(objectMapper17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(jsonFactory20);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test572");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        byte byte26 = jsonParser24.getByteValue();
        jsonParser24.setRequestPayloadOnError("<String>XML</String>");
        com.fasterxml.jackson.core.Base64Variant base64Variant29 = null;
        java.io.OutputStream outputStream30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = jsonParser24.readBinaryValue(base64Variant29, outputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Operation not supported by parser of type com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test573");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping();
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray14 = new com.fasterxml.jackson.databind.MapperFeature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = objectMapper13.disable(mapperFeatureArray14);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectMapper15.readTree("<null/>");
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec18, xMLInputFactory19, xMLOutputFactory20);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature22 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = xmlFactory21.disable(feature22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = xmlFactory23.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23, jacksonXmlModule26);
        javax.xml.stream.XMLInputFactory xMLInputFactory28 = xmlFactory23.getXMLInputFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory29 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory30 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(xMLInputFactory28, xMLOutputFactory29);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper31 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory33 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory34 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory35 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec32, xMLInputFactory33, xMLOutputFactory34);
        com.fasterxml.jackson.core.Version version36 = xmlFactory35.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper37 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory35);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes38 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter39 = xmlMapper37.writer(characterEscapes38);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray40 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper41 = xmlMapper37.disable(featureArray40);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping42 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper41.enableDefaultTypingAsProperty(defaultTyping42, "XML");
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy45 = objectMapper41.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider46 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter47 = objectMapper41.writer(filterProvider46);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy48 = objectMapper41.getPropertyNamingStrategy();
        java.util.Locale locale49 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper50 = objectMapper41.setLocale(locale49);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory52 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory53 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory54 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec51, xMLInputFactory52, xMLOutputFactory53);
        com.fasterxml.jackson.core.Version version55 = xmlFactory54.version();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator56 = xmlFactory54.getOutputDecorator();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass57 = xmlFactory54.getFormatReadFeatureType();
        javax.xml.stream.XMLInputFactory xMLInputFactory58 = xmlFactory54.getXMLInputFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory60 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory61 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory62 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec59, xMLInputFactory60, xMLOutputFactory61);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature63 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory64 = xmlFactory62.disable(feature63);
        com.fasterxml.jackson.core.Version version65 = xmlFactory64.version();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory66 = xmlFactory64.getXMLOutputFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper67 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory58, xMLOutputFactory66);
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory69 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory70 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec68, xMLInputFactory69, xMLOutputFactory70);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature72 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory73 = xmlFactory71.disable(feature72);
        com.fasterxml.jackson.core.Version version74 = xmlFactory73.version();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory75 = xmlFactory73.getXMLOutputFactory();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory76 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper41, xMLInputFactory58, xMLOutputFactory75);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory77 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper15, xMLInputFactory28, xMLOutputFactory75);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(mapperFeatureArray14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature22.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory23);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNull(objectCodec25);
        org.junit.Assert.assertNotNull(xMLInputFactory28);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNotNull(objectWriter39);
        org.junit.Assert.assertNotNull(featureArray40);
        org.junit.Assert.assertNotNull(objectMapper41);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNull(propertyNamingStrategy45);
        org.junit.Assert.assertNotNull(objectWriter47);
        org.junit.Assert.assertNull(propertyNamingStrategy48);
        org.junit.Assert.assertNotNull(objectMapper50);
        org.junit.Assert.assertNotNull(version55);
        org.junit.Assert.assertNull(outputDecorator56);
        org.junit.Assert.assertNotNull(featureClass57);
        org.junit.Assert.assertNotNull(xMLInputFactory58);
        org.junit.Assert.assertTrue("'" + feature63 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature63.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory64);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertNotNull(xMLOutputFactory66);
        org.junit.Assert.assertTrue("'" + feature72 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature72.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory73);
        org.junit.Assert.assertNotNull(version74);
        org.junit.Assert.assertNotNull(xMLOutputFactory75);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test574");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = xmlFactory5.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5, jacksonXmlModule8);
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = xmlFactory5.getXMLInputFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = xmlFactory5.setRootValueSeparator("");
        com.fasterxml.jackson.core.JsonParser jsonParser14 = xmlFactory5.createParser("<null/>");
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNotNull(xMLInputFactory10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonParser14);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test575");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = jacksonXmlAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.setNodeFactory(jsonNodeFactory11);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader14 = xmlMapper8.readerForUpdating((java.lang.Object) xmlFactory13);
        boolean boolean15 = xmlFactory13.canUseCharArrays();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass16 = xmlFactory13.getFormatReadFeatureType();
        boolean boolean17 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass16);
        java.lang.Enum[] enumArray19 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray20 = (java.lang.Enum<?>[]) enumArray19;
        java.lang.String[] strArray21 = null;
        java.lang.String[] strArray22 = jacksonAnnotationIntrospector2.findEnumValues(featureClass16, (java.lang.Enum<?>[]) enumArray19, strArray21);
        com.fasterxml.jackson.databind.introspect.Annotated annotated23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.fasterxml.jackson.databind.jsontype.NamedType> namedTypeList24 = jacksonAnnotationIntrospector2.findSubtypes(annotated23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector2);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectReader14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(featureClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardEnumArray20);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test576");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule6 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3, jacksonXmlModule6);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector8 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector10 = jacksonXmlAnnotationIntrospector8.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.core.Version version15 = xmlFactory14.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory14);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper16.writer(characterEscapes17);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper16.setNodeFactory(jsonNodeFactory19);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader22 = xmlMapper16.readerForUpdating((java.lang.Object) xmlFactory21);
        boolean boolean23 = xmlFactory21.canUseCharArrays();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass24 = xmlFactory21.getFormatReadFeatureType();
        boolean boolean25 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass24);
        java.lang.Enum[] enumArray27 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray28 = (java.lang.Enum<?>[]) enumArray27;
        java.lang.String[] strArray29 = null;
        java.lang.String[] strArray30 = jacksonAnnotationIntrospector10.findEnumValues(featureClass24, (java.lang.Enum<?>[]) enumArray27, strArray29);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector31 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector33 = jacksonXmlAnnotationIntrospector31.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = xmlMapper39.setNodeFactory(jsonNodeFactory42);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory44 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader45 = xmlMapper39.readerForUpdating((java.lang.Object) xmlFactory44);
        boolean boolean46 = xmlFactory44.canUseCharArrays();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass47 = xmlFactory44.getFormatReadFeatureType();
        boolean boolean48 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass47);
        java.lang.Enum[] enumArray50 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray51 = (java.lang.Enum<?>[]) enumArray50;
        java.lang.String[] strArray52 = null;
        java.lang.String[] strArray53 = jacksonAnnotationIntrospector33.findEnumValues(featureClass47, (java.lang.Enum<?>[]) enumArray50, strArray52);
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule54 = jacksonXmlModule6.setMixInAnnotation(featureClass24, featureClass47);
        boolean boolean55 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass47);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector10);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectReader22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(featureClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(enumArray27);
        org.junit.Assert.assertNotNull(wildcardEnumArray28);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector33);
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(objectReader45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(featureClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(enumArray50);
        org.junit.Assert.assertNotNull(wildcardEnumArray51);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(simpleModule54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test577");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        java.io.Writer writer25 = null;
        int int26 = jsonParser24.releaseBuffered(writer25);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test578");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload25 = null;
        jsonParser24.setRequestPayloadOnError(requestPayload25);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload27 = null;
        jsonParser24.setRequestPayloadOnError(requestPayload27);
        java.lang.Boolean boolean29 = jsonParser24.nextBooleanValue();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNull(boolean29);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test579");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper5.findAndRegisterModules();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = objectMapper10.getSerializerProvider();
        com.fasterxml.jackson.dataformat.xml.XmlTypeResolverBuilder xmlTypeResolverBuilder12 = new com.fasterxml.jackson.dataformat.xml.XmlTypeResolverBuilder();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper10.setDefaultTyping((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder>) xmlTypeResolverBuilder12);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder15 = xmlTypeResolverBuilder12.typeIdVisibility(true);
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder17 = xmlTypeResolverBuilder12.typeIdVisibility(true);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializerProvider11);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder15);
        org.junit.Assert.assertNotNull(stdTypeResolverBuilder17);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test580");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = objectMapper9.enableDefaultTypingAsProperty(defaultTyping10, "XML");
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy13 = objectMapper9.getPropertyNamingStrategy();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper9.writer(filterProvider14);
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy16 = objectMapper9.getPropertyNamingStrategy();
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory27 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec26, xMLInputFactory27, xMLOutputFactory28);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature30 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = xmlFactory29.disable(feature30);
        com.fasterxml.jackson.core.Version version32 = xmlFactory31.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass33 = xmlFactory31.getFormatReadFeatureType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature34 = objectMapper9.readValue(byteArray23, 0, (int) (byte) 1, featureClass33);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character 'd' (code 100) in prolog; expected '<'? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNull(propertyNamingStrategy13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNull(propertyNamingStrategy16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 0, 10, 10, 10, 100]");
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature30.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory31);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(featureClass33);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test581");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser24.overrideStdFeatures((int) '#', (int) (short) -1);
        com.fasterxml.jackson.core.SerializableString serializableString29 = null;
        boolean boolean30 = jsonParser24.nextFieldName(serializableString29);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test582");
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter0 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec1, xMLInputFactory2, xMLOutputFactory3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = xmlFactory4.setRootValueSeparator("");
        java.io.DataOutput dataOutput7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory6.createGenerator(dataOutput7);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonGenerator8.setHighestNonEscapedChar((-1));
        boolean boolean11 = jsonGenerator10.canWriteObjectId();
        int int12 = jsonGenerator10.getHighestEscapedChar();
        defaultXmlPrettyPrinter0.writeArrayValueSeparator(jsonGenerator10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = xmlFactory17.setRootValueSeparator("");
        java.io.DataOutput dataOutput20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory19.createGenerator(dataOutput20);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonGenerator21.setHighestNonEscapedChar((-1));
        defaultXmlPrettyPrinter0.beforeObjectEntries(jsonGenerator23);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = null;
        defaultXmlPrettyPrinter0.beforeArrayValues(jsonGenerator25);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter27 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory30 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec28, xMLInputFactory29, xMLOutputFactory30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = xmlFactory31.setRootValueSeparator("");
        java.io.DataOutput dataOutput34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory33.createGenerator(dataOutput34);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator35.setHighestNonEscapedChar((-1));
        boolean boolean38 = jsonGenerator37.canWriteObjectId();
        int int39 = jsonGenerator37.getHighestEscapedChar();
        defaultXmlPrettyPrinter27.writeArrayValueSeparator(jsonGenerator37);
        defaultXmlPrettyPrinter0.writeObjectFieldValueSeparator(jsonGenerator37);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter defaultXmlPrettyPrinter42 = new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory45 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec43, xMLInputFactory44, xMLOutputFactory45);
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = xmlFactory46.setRootValueSeparator("");
        java.io.DataOutput dataOutput49 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator50 = jsonFactory48.createGenerator(dataOutput49);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = jsonGenerator50.setHighestNonEscapedChar((-1));
        boolean boolean53 = jsonGenerator52.canWriteObjectId();
        int int54 = jsonGenerator52.getHighestEscapedChar();
        defaultXmlPrettyPrinter42.writeArrayValueSeparator(jsonGenerator52);
        defaultXmlPrettyPrinter0.writeArrayValueSeparator(jsonGenerator52);
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory58 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory59 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory60 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec57, xMLInputFactory58, xMLOutputFactory59);
        com.fasterxml.jackson.core.Version version61 = xmlFactory60.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper62 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory60);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes63 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter64 = xmlMapper62.writer(characterEscapes63);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter65 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = xmlMapper62.setDefaultPrettyPrinter(prettyPrinter65);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper67 = objectMapper66.enableDefaultTyping();
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory69 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory70 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec68, xMLInputFactory69, xMLOutputFactory70);
        com.fasterxml.jackson.core.JsonFactory jsonFactory73 = xmlFactory71.setRootValueSeparator("");
        java.io.DataOutput dataOutput74 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator75 = jsonFactory73.createGenerator(dataOutput74);
        jsonGenerator75.writeOmittedField("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory79 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory80 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory81 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec78, xMLInputFactory79, xMLOutputFactory80);
        com.fasterxml.jackson.core.Version version82 = xmlFactory81.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper83 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory81);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes84 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter85 = xmlMapper83.writer(characterEscapes84);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider86 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter87 = xmlMapper83.writer(filterProvider86);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode88 = xmlMapper83.createArrayNode();
        objectMapper67.writeTree(jsonGenerator75, (com.fasterxml.jackson.core.TreeNode) arrayNode88);
        defaultXmlPrettyPrinter0.writeArrayValueSeparator(jsonGenerator75);
        defaultXmlPrettyPrinter0.spacesInObjectEntries(true);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonGenerator50);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(objectWriter64);
        org.junit.Assert.assertNotNull(objectMapper66);
        org.junit.Assert.assertNotNull(objectMapper67);
        org.junit.Assert.assertNotNull(jsonFactory73);
        org.junit.Assert.assertNotNull(jsonGenerator75);
        org.junit.Assert.assertNotNull(version82);
        org.junit.Assert.assertNotNull(objectWriter85);
        org.junit.Assert.assertNotNull(objectWriter87);
        org.junit.Assert.assertNotNull(arrayNode88);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test583");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = xmlFactory5.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5, jacksonXmlModule8);
        com.fasterxml.jackson.annotation.JsonInclude.Value value10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper9.setPropertyInclusion(value10);
        com.fasterxml.jackson.databind.ObjectReader objectReader12 = xmlMapper9.reader();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory16);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes19 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter20 = xmlMapper18.writer(characterEscapes19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory24 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec21, xMLInputFactory22, xMLOutputFactory23);
        com.fasterxml.jackson.core.Version version25 = xmlFactory24.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper26 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory24);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes27 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter28 = xmlMapper26.writer(characterEscapes27);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = xmlMapper26.setNodeFactory(jsonNodeFactory29);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider31 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = xmlMapper26.setFilterProvider(filterProvider31);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature38 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = xmlFactory37.disable(feature38);
        com.fasterxml.jackson.core.Version version40 = xmlFactory39.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass41 = xmlFactory39.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor42 = objectMapper32.readValues(jsonParser33, featureClass41);
        boolean boolean43 = xmlMapper18.canSerialize(featureClass41);
        com.fasterxml.jackson.databind.ObjectReader objectReader44 = xmlMapper9.readerFor(featureClass41);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectReader12);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(objectWriter20);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(objectWriter28);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature38.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory39);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(featureClass41);
        org.junit.Assert.assertNotNull(featureItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objectReader44);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test584");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean14 = feature12.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(feature12);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = objectMapper15.writerWithType(javaType16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec18, xMLInputFactory19, xMLOutputFactory20);
        com.fasterxml.jackson.core.Version version22 = xmlFactory21.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory21);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes24 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter25 = xmlMapper23.writer(characterEscapes24);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray26 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = xmlMapper23.disable(featureArray26);
        int int28 = xmlMapper23.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues29 = xmlMapper23.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature30 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean32 = feature30.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper23.disable(feature30);
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter35 = objectMapper33.writerWithType(javaType34);
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory36 = objectMapper33.getSerializerFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper37 = objectMapper15.setSerializerFactory(serializerFactory36);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = objectMapper37.isEnabled(deserializationFeature38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature12.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(objectWriter25);
        org.junit.Assert.assertNotNull(featureArray26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(injectableValues29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature30.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(objectWriter35);
        org.junit.Assert.assertNotNull(serializerFactory36);
        org.junit.Assert.assertNotNull(objectMapper37);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test585");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        xmlSerializerProvider2.flushCachedSerializers();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test586");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory3 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory4 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec2, xMLInputFactory3, xMLOutputFactory4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = xmlFactory5.setRootValueSeparator("");
        java.io.DataOutput dataOutput8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory7.createGenerator(dataOutput8);
        boolean boolean10 = jsonGenerator9.canWriteTypeId();
        boolean boolean11 = jsonGenerator9.canOmitFields();
        // The following exception was thrown during execution in test generation
        try {
            xmlSerializerProvider1._serializeXmlNull(jsonGenerator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test587");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        com.fasterxml.jackson.core.Base64Variant base64Variant25 = null;
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = jsonParser24.readBinaryValue(base64Variant25, outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Operation not supported by parser of type com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test588");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        int int12 = xmlMapper5.mixInCount();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test589");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.Module[] moduleArray10 = new com.fasterxml.jackson.databind.Module[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper9.registerModules(moduleArray10);
        java.text.DateFormat dateFormat12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper9.setDateFormat(dateFormat12);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver14 = objectMapper9.getSubtypeResolver();
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec15, xMLInputFactory16, xMLOutputFactory17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper20 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory18);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter22 = xmlMapper20.writer(characterEscapes21);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray23 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper20.disable(featureArray23);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = xmlMapper20.getDeserializationContext();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping26 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper20.enableDefaultTypingAsProperty(defaultTyping26, "");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = objectMapper28.getNodeFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory31 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory32 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec30, xMLInputFactory31, xMLOutputFactory32);
        com.fasterxml.jackson.core.Version version34 = xmlFactory33.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper35 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory33);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes36 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter37 = xmlMapper35.writer(characterEscapes36);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray38 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = xmlMapper35.disable(featureArray38);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = objectMapper39.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig41 = objectMapper39.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider42 = objectMapper39.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory45 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec43, xMLInputFactory44, xMLOutputFactory45);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature47 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory48 = xmlFactory46.disable(feature47);
        com.fasterxml.jackson.core.Version version49 = xmlFactory48.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass50 = xmlFactory48.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer51 = serializerProvider42.getUnknownTypeSerializer(featureClass50);
        java.util.TimeZone timeZone52 = serializerProvider42.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory54 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory55 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec53, xMLInputFactory54, xMLOutputFactory55);
        com.fasterxml.jackson.core.Version version57 = xmlFactory56.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper58 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory56);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes59 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter60 = xmlMapper58.writer(characterEscapes59);
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory62 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory63 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory64 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec61, xMLInputFactory62, xMLOutputFactory63);
        com.fasterxml.jackson.core.Version version65 = xmlFactory64.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper66 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory64);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes67 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter68 = xmlMapper66.writer(characterEscapes67);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory69 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper70 = xmlMapper66.setNodeFactory(jsonNodeFactory69);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider71 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper72 = xmlMapper66.setFilterProvider(filterProvider71);
        com.fasterxml.jackson.core.JsonParser jsonParser73 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory75 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory76 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory77 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec74, xMLInputFactory75, xMLOutputFactory76);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature78 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory79 = xmlFactory77.disable(feature78);
        com.fasterxml.jackson.core.Version version80 = xmlFactory79.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass81 = xmlFactory79.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor82 = objectMapper72.readValues(jsonParser73, featureClass81);
        boolean boolean83 = xmlMapper58.canSerialize(featureClass81);
        com.fasterxml.jackson.databind.JavaType javaType84 = serializerProvider42.constructType((java.lang.reflect.Type) featureClass81);
        boolean boolean85 = objectMapper28.canDeserialize(javaType84);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter86 = objectMapper9.writerWithType(javaType84);
        java.io.InputStream inputStream87 = null;
        com.fasterxml.jackson.core.type.TypeReference typeReference88 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler89 = objectMapper9.readValue(inputStream87, typeReference88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null InputStream is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(moduleArray10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(subtypeResolver14);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(objectWriter22);
        org.junit.Assert.assertNotNull(featureArray23);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(deserializationContext25);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(jsonNodeFactory29);
        org.junit.Assert.assertNotNull(version34);
        org.junit.Assert.assertNotNull(objectWriter37);
        org.junit.Assert.assertNotNull(featureArray38);
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(serializationConfig41);
        org.junit.Assert.assertNotNull(serializerProvider42);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature47.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory48);
        org.junit.Assert.assertNotNull(version49);
        org.junit.Assert.assertNotNull(featureClass50);
        org.junit.Assert.assertNotNull(objJsonSerializer51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version57);
        org.junit.Assert.assertNotNull(objectWriter60);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertNotNull(objectWriter68);
        org.junit.Assert.assertNotNull(objectMapper70);
        org.junit.Assert.assertNotNull(objectMapper72);
        org.junit.Assert.assertTrue("'" + feature78 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature78.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory79);
        org.junit.Assert.assertNotNull(version80);
        org.junit.Assert.assertNotNull(featureClass81);
        org.junit.Assert.assertNotNull(featureItor82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(javaType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(objectWriter86);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test590");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier xmlBeanDeserializerModifier2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier(" ");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory5 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec4, xMLInputFactory5, xMLOutputFactory6);
        com.fasterxml.jackson.core.Version version8 = xmlFactory7.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory7);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper9.writer(characterEscapes10);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper9.writer(filterProvider12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec22, xMLInputFactory23, xMLOutputFactory24);
        com.fasterxml.jackson.core.Version version26 = xmlFactory25.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory25);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes28 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter29 = xmlMapper27.writer(characterEscapes28);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper27.setNodeFactory(jsonNodeFactory30);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider32 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper27.setFilterProvider(filterProvider32);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory36 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory37 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec35, xMLInputFactory36, xMLOutputFactory37);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature39 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = xmlFactory38.disable(feature39);
        com.fasterxml.jackson.core.Version version41 = xmlFactory40.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass42 = xmlFactory40.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor43 = objectMapper33.readValues(jsonParser34, featureClass42);
        boolean boolean44 = xmlMapper19.canSerialize(featureClass42);
        boolean boolean45 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass42);
        com.fasterxml.jackson.databind.JavaType javaType46 = xmlMapper9.constructType((java.lang.reflect.Type) featureClass42);
        boolean boolean47 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType46);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer48 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer49 = xmlBeanDeserializerModifier2.modifyKeyDeserializer(deserializationConfig3, javaType46, keyDeserializer48);
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule50 = jacksonXmlModule0.setDeserializerModifier((com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) xmlBeanDeserializerModifier2);
        java.lang.Object obj51 = simpleModule50.getTypeId();
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(version26);
        org.junit.Assert.assertNotNull(objectWriter29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature39.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory40);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(featureClass42);
        org.junit.Assert.assertNotNull(featureItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(javaType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(keyDeserializer49);
        org.junit.Assert.assertNotNull(simpleModule50);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "com.fasterxml.jackson.dataformat.xml.JacksonXmlModule" + "'", obj51, "com.fasterxml.jackson.dataformat.xml.JacksonXmlModule");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test591");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = xmlFactory5.configure(feature8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test592");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray13 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = objectMapper9.enable(featureArray13);
        com.fasterxml.jackson.databind.ObjectReader objectReader15 = objectMapper14.reader();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature16 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray17 = new com.fasterxml.jackson.databind.DeserializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper14.disable(deserializationFeature16, deserializationFeatureArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(featureArray13);
        org.junit.Assert.assertNotNull(objectMapper14);
        org.junit.Assert.assertNotNull(objectReader15);
        org.junit.Assert.assertNotNull(deserializationFeatureArray17);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test593");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper2 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0, xMLOutputFactory1);
        com.fasterxml.jackson.annotation.JsonInclude.Value value3 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper4 = xmlMapper2.setPropertyInclusion(value3);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = xmlMapper2.findAndRegisterModules();
        com.fasterxml.jackson.databind.jsontype.NamedType namedType6 = null;
        com.fasterxml.jackson.databind.jsontype.NamedType[] namedTypeArray7 = new com.fasterxml.jackson.databind.jsontype.NamedType[] { namedType6 };
        objectMapper5.registerSubtypes(namedTypeArray7);
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator9 = null;
        java.lang.Object obj10 = objectMapper5.setHandlerInstantiator(handlerInstantiator9);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature11 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray12 = new com.fasterxml.jackson.databind.DeserializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectReader objectReader13 = objectMapper5.reader(deserializationFeature11, deserializationFeatureArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper4);
        org.junit.Assert.assertNotNull(objectMapper5);
        org.junit.Assert.assertNotNull(namedTypeArray7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(deserializationFeatureArray12);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test594");
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup0);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup2 = xmlSerializerProvider1._rootNameLookup;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.disable(featureArray11);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper12.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig14 = objectMapper12.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = objectMapper12.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec16, xMLInputFactory17, xMLOutputFactory18);
        com.fasterxml.jackson.core.Version version20 = xmlFactory19.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper21 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory19);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes22 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter23 = xmlMapper21.writer(characterEscapes22);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray24 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = xmlMapper21.disable(featureArray24);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext26 = xmlMapper21.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory30 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec28, xMLInputFactory29, xMLOutputFactory30);
        com.fasterxml.jackson.core.Version version32 = xmlFactory31.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper33 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory31);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes34 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter35 = xmlMapper33.writer(characterEscapes34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec36, xMLInputFactory37, xMLOutputFactory38);
        com.fasterxml.jackson.core.Version version40 = xmlFactory39.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory39);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes42 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter43 = xmlMapper41.writer(characterEscapes42);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = xmlMapper41.setNodeFactory(jsonNodeFactory44);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider46 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper47 = xmlMapper41.setFilterProvider(filterProvider46);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory50 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory51 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec49, xMLInputFactory50, xMLOutputFactory51);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature53 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory54 = xmlFactory52.disable(feature53);
        com.fasterxml.jackson.core.Version version55 = xmlFactory54.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass56 = xmlFactory54.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor57 = objectMapper47.readValues(jsonParser48, featureClass56);
        boolean boolean58 = xmlMapper33.canSerialize(featureClass56);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference59 = null;
        boolean boolean60 = xmlMapper21.canSerialize(featureClass56, throwableAtomicReference59);
        com.fasterxml.jackson.databind.BeanProperty beanProperty62 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer63 = serializerProvider15.findTypedValueSerializer(featureClass56, false, beanProperty62);
        com.fasterxml.jackson.databind.BeanProperty beanProperty64 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer65 = serializerProvider15.findNullValueSerializer(beanProperty64);
        xmlSerializerProvider1.setDefaultKeySerializer(objJsonSerializer65);
        org.junit.Assert.assertNotNull(xmlRootNameLookup2);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(serializationConfig14);
        org.junit.Assert.assertNotNull(serializerProvider15);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(objectWriter23);
        org.junit.Assert.assertNotNull(featureArray24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(deserializationContext26);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(objectWriter35);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(objectWriter43);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature53.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory54);
        org.junit.Assert.assertNotNull(version55);
        org.junit.Assert.assertNotNull(featureClass56);
        org.junit.Assert.assertNotNull(featureItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer63);
        org.junit.Assert.assertNotNull(objJsonSerializer65);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test595");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector jacksonXmlAnnotationIntrospector0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlAnnotationIntrospector();
        com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector jacksonAnnotationIntrospector2 = jacksonXmlAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory4 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory5 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory6 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec3, xMLInputFactory4, xMLOutputFactory5);
        com.fasterxml.jackson.core.Version version7 = xmlFactory6.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper8 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory6);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes9 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper8.writer(characterEscapes9);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper8.setNodeFactory(jsonNodeFactory11);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader14 = xmlMapper8.readerForUpdating((java.lang.Object) xmlFactory13);
        boolean boolean15 = xmlFactory13.canUseCharArrays();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass16 = xmlFactory13.getFormatReadFeatureType();
        boolean boolean17 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass16);
        java.lang.Enum[] enumArray19 = new java.lang.Enum[0];
        @SuppressWarnings("unchecked")
        java.lang.Enum<?>[] wildcardEnumArray20 = (java.lang.Enum<?>[]) enumArray19;
        java.lang.String[] strArray21 = null;
        java.lang.String[] strArray22 = jacksonAnnotationIntrospector2.findEnumValues(featureClass16, (java.lang.Enum<?>[]) enumArray19, strArray21);
        com.fasterxml.jackson.databind.introspect.Annotated annotated23 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper29 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory27);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes30 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter31 = xmlMapper29.writer(characterEscapes30);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray32 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper29.disable(featureArray32);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper34 = xmlMapper29.copy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory35 = xmlMapper29.getSerializerFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec36, xMLInputFactory37, xMLOutputFactory38);
        com.fasterxml.jackson.core.Version version40 = xmlFactory39.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory39);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes42 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter43 = xmlMapper41.writer(characterEscapes42);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider44 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter45 = xmlMapper41.writer(filterProvider44);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper51 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory49);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes52 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter53 = xmlMapper51.writer(characterEscapes52);
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory55 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory56 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory57 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec54, xMLInputFactory55, xMLOutputFactory56);
        com.fasterxml.jackson.core.Version version58 = xmlFactory57.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper59 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory57);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes60 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter61 = xmlMapper59.writer(characterEscapes60);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory62 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper63 = xmlMapper59.setNodeFactory(jsonNodeFactory62);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider64 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper59.setFilterProvider(filterProvider64);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory68 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory69 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory70 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec67, xMLInputFactory68, xMLOutputFactory69);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature71 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory72 = xmlFactory70.disable(feature71);
        com.fasterxml.jackson.core.Version version73 = xmlFactory72.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass74 = xmlFactory72.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor75 = objectMapper65.readValues(jsonParser66, featureClass74);
        boolean boolean76 = xmlMapper51.canSerialize(featureClass74);
        boolean boolean77 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass74);
        com.fasterxml.jackson.databind.JavaType javaType78 = xmlMapper41.constructType((java.lang.reflect.Type) featureClass74);
        boolean boolean79 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType78);
        com.fasterxml.jackson.databind.ObjectReader objectReader80 = xmlMapper29.readerFor(javaType78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass81 = jacksonAnnotationIntrospector2.findDeserializationType(annotated23, javaType78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jacksonAnnotationIntrospector2);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectReader14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(featureClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(enumArray19);
        org.junit.Assert.assertNotNull(wildcardEnumArray20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(objectWriter31);
        org.junit.Assert.assertNotNull(featureArray32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(xmlMapper34);
        org.junit.Assert.assertNotNull(serializerFactory35);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(objectWriter43);
        org.junit.Assert.assertNotNull(objectWriter45);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(objectWriter53);
        org.junit.Assert.assertNotNull(version58);
        org.junit.Assert.assertNotNull(objectWriter61);
        org.junit.Assert.assertNotNull(objectMapper63);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertTrue("'" + feature71 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature71.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory72);
        org.junit.Assert.assertNotNull(version73);
        org.junit.Assert.assertNotNull(featureClass74);
        org.junit.Assert.assertNotNull(featureItor75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(javaType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objectReader80);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test596");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray22 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper19.disable(featureArray22);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = xmlMapper19.copy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory25 = xmlMapper19.getSerializerFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper5.setSerializerFactory(serializerFactory25);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper26.clearProblemHandlers();
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter29 = objectMapper26.writerFor(javaType28);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(featureArray22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(xmlMapper24);
        org.junit.Assert.assertNotNull(serializerFactory25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(objectWriter29);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test597");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        java.lang.String str11 = objectMapper9.writeValueAsString((java.lang.Object) "XML");
        com.fasterxml.jackson.databind.InjectableValues injectableValues12 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = objectMapper9.reader(injectableValues12);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper9.writer(formatSchema14);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup16 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider17 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper9.setSerializerProvider((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider) xmlSerializerProvider17);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = xmlSerializerProvider17.getGenerator();
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = xmlFactory23.setRootValueSeparator("");
        java.io.DataOutput dataOutput26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory25.createGenerator(dataOutput26);
        boolean boolean28 = jsonGenerator27.canWriteTypeId();
        // The following exception was thrown during execution in test generation
        try {
            xmlSerializerProvider17._serializeXmlNull(jsonGenerator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<String>XML</String>" + "'", str11, "<String>XML</String>");
        org.junit.Assert.assertNotNull(objectReader13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNull(jsonGenerator19);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test598");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        byte byte26 = jsonParser24.getByteValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = jsonParser24.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: [B@1b445b17; line: 1, column: 8]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test599");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator5 = xmlFactory3.getOutputDecorator();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass6 = xmlFactory3.getFormatReadFeatureType();
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = xmlFactory3.getXMLInputFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory10 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory11 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec8, xMLInputFactory9, xMLOutputFactory10);
        com.fasterxml.jackson.core.Version version12 = xmlFactory11.version();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator13 = xmlFactory11.getOutputDecorator();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass14 = xmlFactory11.getFormatReadFeatureType();
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = xmlFactory11.getXMLInputFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec16, xMLInputFactory17, xMLOutputFactory18);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature20 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = xmlFactory19.disable(feature20);
        com.fasterxml.jackson.core.Version version22 = xmlFactory21.version();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory23 = xmlFactory21.getXMLOutputFactory();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory15, xMLOutputFactory23);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(xMLInputFactory7, xMLOutputFactory23);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper27 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory25, jacksonXmlModule26);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNull(outputDecorator5);
        org.junit.Assert.assertNotNull(featureClass6);
        org.junit.Assert.assertNotNull(xMLInputFactory7);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(outputDecorator13);
        org.junit.Assert.assertNotNull(featureClass14);
        org.junit.Assert.assertNotNull(xMLInputFactory15);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature20.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory21);
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertNotNull(xMLOutputFactory23);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test600");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        byte byte26 = jsonParser24.getByteValue();
        java.lang.Object obj27 = jsonParser24.getTypeId();
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = jsonParser24.readBinaryValue(outputStream28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Operation not supported by parser of type com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test601");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.core.FormatSchema formatSchema12 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = xmlMapper5.reader(formatSchema12);
        com.fasterxml.jackson.databind.cfg.HandlerInstantiator handlerInstantiator14 = null;
        java.lang.Object obj15 = xmlMapper5.setHandlerInstantiator(handlerInstantiator14);
        java.util.Locale locale16 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper17 = xmlMapper5.setLocale(locale16);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectReader13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(objectMapper17);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test602");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.core.Version version15 = xmlFactory14.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory14);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper16.writer(characterEscapes17);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray19 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper16.disable(featureArray19);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = objectMapper20.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig22 = objectMapper20.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = objectMapper20.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory25 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec24, xMLInputFactory25, xMLOutputFactory26);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature28 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = xmlFactory27.disable(feature28);
        com.fasterxml.jackson.core.Version version30 = xmlFactory29.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass31 = xmlFactory29.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = serializerProvider23.getUnknownTypeSerializer(featureClass31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.core.Version version37 = xmlFactory36.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper38 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory36);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes39 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter40 = xmlMapper38.writer(characterEscapes39);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = xmlMapper38.setNodeFactory(jsonNodeFactory41);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider43 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = xmlMapper38.setFilterProvider(filterProvider43);
        com.fasterxml.jackson.core.JsonParser jsonParser45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature50 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = xmlFactory49.disable(feature50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass53 = xmlFactory51.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor54 = objectMapper44.readValues(jsonParser45, featureClass53);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper55 = xmlMapper5.addMixIn(featureClass31, featureClass53);
        java.text.DateFormat dateFormat56 = objectMapper55.getDateFormat();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(featureArray19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(serializationConfig22);
        org.junit.Assert.assertNotNull(serializerProvider23);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature28.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory29);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(featureClass31);
        org.junit.Assert.assertNotNull(objJsonSerializer32);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertNotNull(objectWriter40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature50.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory51);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(featureClass53);
        org.junit.Assert.assertNotNull(featureItor54);
        org.junit.Assert.assertNotNull(objectMapper55);
        org.junit.Assert.assertNotNull(dateFormat56);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test603");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper5.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = xmlMapper5.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi_");
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonFactory13);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test604");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping14 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = objectMapper13.enableDefaultTypingAsProperty(defaultTyping14, " ");
        com.fasterxml.jackson.databind.MapperFeature mapperFeature17 = null;
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray18 = new com.fasterxml.jackson.databind.MapperFeature[] { mapperFeature17 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper13.disable(mapperFeatureArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(objectMapper16);
        org.junit.Assert.assertNotNull(mapperFeatureArray18);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test605");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory5 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec4, xMLInputFactory5, xMLOutputFactory6);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature8 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = xmlFactory7.disable(feature8);
        boolean boolean10 = feature8.enabledByDefault();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = xmlFactory3.configure(feature8, false);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass13 = xmlFactory12.getFormatWriteFeatureType();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule14 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory12, jacksonXmlModule14);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec16, xMLInputFactory17, xMLOutputFactory18);
        com.fasterxml.jackson.core.Version version20 = xmlFactory19.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper21 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory19);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping22 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper21.enableDefaultTypingAsProperty(defaultTyping22, "XML");
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory27 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec25, xMLInputFactory26, xMLOutputFactory27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper30 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory28);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes31 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter32 = xmlMapper30.writer(characterEscapes31);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray33 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = xmlMapper30.disable(featureArray33);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper34.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig36 = objectMapper34.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = objectMapper34.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory39 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec38, xMLInputFactory39, xMLOutputFactory40);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature42 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = xmlFactory41.disable(feature42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass45 = xmlFactory43.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer46 = serializerProvider37.getUnknownTypeSerializer(featureClass45);
        java.util.TimeZone timeZone47 = serializerProvider37.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory50 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec48, xMLInputFactory49, xMLOutputFactory50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper53 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory51);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = xmlMapper53.writer(characterEscapes54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory64 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper61.setNodeFactory(jsonNodeFactory64);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider66 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper67 = xmlMapper61.setFilterProvider(filterProvider66);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory70 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory71 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory72 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec69, xMLInputFactory70, xMLOutputFactory71);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature73 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory74 = xmlFactory72.disable(feature73);
        com.fasterxml.jackson.core.Version version75 = xmlFactory74.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass76 = xmlFactory74.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor77 = objectMapper67.readValues(jsonParser68, featureClass76);
        boolean boolean78 = xmlMapper53.canSerialize(featureClass76);
        com.fasterxml.jackson.databind.BeanProperty beanProperty79 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer80 = serializerProvider37.findKeySerializer(featureClass76, beanProperty79);
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride81 = objectMapper24.configOverride(featureClass76);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer82 = null;
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule83 = jacksonXmlModule14.addKeyDeserializer(featureClass76, keyDeserializer82);
        com.fasterxml.jackson.databind.module.SimpleSerializers simpleSerializers84 = null;
        jacksonXmlModule14.setKeySerializers(simpleSerializers84);
        jacksonXmlModule14.setDefaultUseWrapper(false);
        jacksonXmlModule14.setDefaultUseWrapper(false);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature8.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(xmlFactory12);
        org.junit.Assert.assertNotNull(featureClass13);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(objectWriter32);
        org.junit.Assert.assertNotNull(featureArray33);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(serializationConfig36);
        org.junit.Assert.assertNotNull(serializerProvider37);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature42.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(featureClass45);
        org.junit.Assert.assertNotNull(objJsonSerializer46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertNotNull(objectMapper67);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature73.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory74);
        org.junit.Assert.assertNotNull(version75);
        org.junit.Assert.assertNotNull(featureClass76);
        org.junit.Assert.assertNotNull(featureItor77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer80);
        org.junit.Assert.assertNotNull(mutableConfigOverride81);
        org.junit.Assert.assertNotNull(simpleModule83);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test606");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = objectMapper10.writerWithType(javaType11);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = objectMapper10.clearProblemHandlers();
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper13.writer(serializationFeature14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test607");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver11 = xmlMapper5.getSubtypeResolver();
        com.fasterxml.jackson.databind.deser.DeserializationProblemHandler deserializationProblemHandler12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.addHandler(deserializationProblemHandler12);
        java.text.DateFormat dateFormat14 = objectMapper13.getDateFormat();
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver15 = objectMapper13.getSubtypeResolver();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(subtypeResolver11);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(subtypeResolver15);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test608");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = xmlMapper5.copy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = xmlMapper5.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = xmlMapper5.clearProblemHandlers();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(xmlMapper12);
        org.junit.Assert.assertNull(jsonNodeFactory13);
        org.junit.Assert.assertNotNull(objectMapper14);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test609");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean14 = feature12.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(feature12);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper5.writer(contextAttributes16);
        java.io.InputStream inputStream18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory20 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory21 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory22 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec19, xMLInputFactory20, xMLOutputFactory21);
        com.fasterxml.jackson.core.Version version23 = xmlFactory22.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory22);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes25 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter26 = xmlMapper24.writer(characterEscapes25);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray27 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper28 = xmlMapper24.disable(featureArray27);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = objectMapper28.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig30 = objectMapper28.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider31 = objectMapper28.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray32 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper28.enable(featureArray32);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider34 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper28.setSerializerProvider(defaultSerializerProvider34);
        com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier xmlBeanDeserializerModifier37 = new com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier(" ");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig38 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory40 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory41 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory42 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec39, xMLInputFactory40, xMLOutputFactory41);
        com.fasterxml.jackson.core.Version version43 = xmlFactory42.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper44 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory42);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes45 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter46 = xmlMapper44.writer(characterEscapes45);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider47 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter48 = xmlMapper44.writer(filterProvider47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory50 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory51 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec49, xMLInputFactory50, xMLOutputFactory51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper54 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory52);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes55 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter56 = xmlMapper54.writer(characterEscapes55);
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory58 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory59 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory60 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec57, xMLInputFactory58, xMLOutputFactory59);
        com.fasterxml.jackson.core.Version version61 = xmlFactory60.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper62 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory60);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes63 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter64 = xmlMapper62.writer(characterEscapes63);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory65 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = xmlMapper62.setNodeFactory(jsonNodeFactory65);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider67 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper68 = xmlMapper62.setFilterProvider(filterProvider67);
        com.fasterxml.jackson.core.JsonParser jsonParser69 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory71 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory72 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory73 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec70, xMLInputFactory71, xMLOutputFactory72);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature74 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory75 = xmlFactory73.disable(feature74);
        com.fasterxml.jackson.core.Version version76 = xmlFactory75.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass77 = xmlFactory75.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor78 = objectMapper68.readValues(jsonParser69, featureClass77);
        boolean boolean79 = xmlMapper54.canSerialize(featureClass77);
        boolean boolean80 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass77);
        com.fasterxml.jackson.databind.JavaType javaType81 = xmlMapper44.constructType((java.lang.reflect.Type) featureClass77);
        boolean boolean82 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType81);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer83 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer84 = xmlBeanDeserializerModifier37.modifyKeyDeserializer(deserializationConfig38, javaType81, keyDeserializer83);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference85 = null;
        boolean boolean86 = objectMapper28.canDeserialize(javaType81, throwableAtomicReference85);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.util.TypeUtil typeUtil87 = xmlMapper5.readValue(inputStream18, javaType81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null InputStream is not a valid argument");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature12.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertNotNull(objectWriter26);
        org.junit.Assert.assertNotNull(featureArray27);
        org.junit.Assert.assertNotNull(objectMapper28);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(serializationConfig30);
        org.junit.Assert.assertNotNull(serializerProvider31);
        org.junit.Assert.assertNotNull(featureArray32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertNotNull(objectWriter46);
        org.junit.Assert.assertNotNull(objectWriter48);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(objectWriter56);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(objectWriter64);
        org.junit.Assert.assertNotNull(objectMapper66);
        org.junit.Assert.assertNotNull(objectMapper68);
        org.junit.Assert.assertTrue("'" + feature74 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature74.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory75);
        org.junit.Assert.assertNotNull(version76);
        org.junit.Assert.assertNotNull(featureClass77);
        org.junit.Assert.assertNotNull(featureItor78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(javaType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(keyDeserializer84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test610");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser24.setFeatureMask(0);
        double double28 = jsonParser27.getValueAsDouble();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test611");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.core.Version version11 = xmlMapper5.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter12 = xmlMapper5.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = xmlMapper5.enableDefaultTyping();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray22 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper19.disable(featureArray22);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = xmlMapper19.copy();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory25 = xmlMapper19.getSerializerFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper26 = xmlMapper5.setSerializerFactory(serializerFactory25);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = objectMapper26.clearProblemHandlers();
        com.fasterxml.jackson.databind.InjectableValues injectableValues28 = objectMapper26.getInjectableValues();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertNotNull(objectWriter12);
        org.junit.Assert.assertNotNull(objectMapper13);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(featureArray22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(xmlMapper24);
        org.junit.Assert.assertNotNull(serializerFactory25);
        org.junit.Assert.assertNotNull(objectMapper26);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNull(injectableValues28);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test612");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule6 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3, jacksonXmlModule6);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector9 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair10 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector8, annotationIntrospector9);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair13 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector11, annotationIntrospector12);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair14 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair10, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair13);
        pair14.setDefaultUseWrapper(true);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector17 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair19 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector17, annotationIntrospector18);
        com.fasterxml.jackson.databind.introspect.Annotated annotated20 = null;
        java.lang.Boolean boolean21 = pair19.isOutputAsCData(annotated20);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair24 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector22, annotationIntrospector23);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector25 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector26 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair27 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector25, annotationIntrospector26);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair28 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair24, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair27);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair29 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair19, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair27);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair30 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair14, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair19);
        com.fasterxml.jackson.databind.introspect.Annotated annotated31 = null;
        java.lang.Boolean boolean32 = pair14.isOutputAsCData(annotated31);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = xmlMapper7.setAnnotationIntrospector((com.fasterxml.jackson.databind.AnnotationIntrospector) pair14);
        com.fasterxml.jackson.databind.introspect.Annotated annotated34 = null;
        java.lang.String str35 = pair14.findNamespace(annotated34);
        com.fasterxml.jackson.databind.introspect.Annotated annotated36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = pair14.hasCreatorAnnotation(annotated36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(pair29);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test613");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.reader(jsonNodeFactory10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper25.setNodeFactory(jsonNodeFactory28);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider30 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper25.setFilterProvider(filterProvider30);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature37 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = xmlFactory36.disable(feature37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass40 = xmlFactory38.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor41 = objectMapper31.readValues(jsonParser32, featureClass40);
        boolean boolean42 = xmlMapper17.canSerialize(featureClass40);
        boolean boolean43 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass40);
        com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema44 = xmlMapper5.generateJsonSchema(featureClass40);
        com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature feature45 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper47 = xmlMapper5.configure(feature45, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature37.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory38);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(featureClass40);
        org.junit.Assert.assertNotNull(featureItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonSchema44);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test614");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.reader(jsonNodeFactory10);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = xmlMapper5.copy();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = xmlMapper5.setDefaultUseWrapper(true);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory15 = xmlMapper5.getTypeFactory();
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader17 = xmlMapper5.reader(formatSchema16);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(xmlMapper12);
        org.junit.Assert.assertNotNull(xmlMapper14);
        org.junit.Assert.assertNotNull(typeFactory15);
        org.junit.Assert.assertNotNull(objectReader17);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test615");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.core.Version version15 = xmlFactory14.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory14);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter18 = xmlMapper16.writer(characterEscapes17);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider19 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter20 = xmlMapper16.writer(filterProvider19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory24 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec21, xMLInputFactory22, xMLOutputFactory23);
        com.fasterxml.jackson.core.Version version25 = xmlFactory24.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper26 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory24);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes27 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter28 = xmlMapper26.writer(characterEscapes27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory30 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory31 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory32 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec29, xMLInputFactory30, xMLOutputFactory31);
        com.fasterxml.jackson.core.Version version33 = xmlFactory32.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper34 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory32);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes35 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter36 = xmlMapper34.writer(characterEscapes35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper38 = xmlMapper34.setNodeFactory(jsonNodeFactory37);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider39 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = xmlMapper34.setFilterProvider(filterProvider39);
        com.fasterxml.jackson.core.JsonParser jsonParser41 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory43 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory44 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory45 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec42, xMLInputFactory43, xMLOutputFactory44);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature46 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory47 = xmlFactory45.disable(feature46);
        com.fasterxml.jackson.core.Version version48 = xmlFactory47.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass49 = xmlFactory47.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor50 = objectMapper40.readValues(jsonParser41, featureClass49);
        boolean boolean51 = xmlMapper26.canSerialize(featureClass49);
        boolean boolean52 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass49);
        com.fasterxml.jackson.databind.JavaType javaType53 = xmlMapper16.constructType((java.lang.reflect.Type) featureClass49);
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList54 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper55 = xmlMapper16.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList54);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper56 = xmlMapper5.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList54);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper5.enableDefaultTyping();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(objectWriter18);
        org.junit.Assert.assertNotNull(objectWriter20);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(objectWriter28);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(objectWriter36);
        org.junit.Assert.assertNotNull(objectMapper38);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature46.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory47);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertNotNull(featureClass49);
        org.junit.Assert.assertNotNull(featureItor50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(javaType53);
        org.junit.Assert.assertNotNull(moduleList54);
        org.junit.Assert.assertNotNull(objectMapper55);
        org.junit.Assert.assertNotNull(objectMapper56);
        org.junit.Assert.assertNotNull(objectMapper57);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test616");
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule0 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.databind.module.SimpleSerializers simpleSerializers1 = null;
        jacksonXmlModule0.setSerializers(simpleSerializers1);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper3 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(jacksonXmlModule0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test617");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = xmlFactory5.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5, jacksonXmlModule8);
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = xmlFactory5.getXMLInputFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = xmlFactory5.setRootValueSeparator("");
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory12.disable(feature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNotNull(xMLInputFactory10);
        org.junit.Assert.assertNotNull(jsonFactory12);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test618");
        com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier xmlBeanSerializerModifier0 = new com.fasterxml.jackson.dataformat.xml.ser.XmlBeanSerializerModifier();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory2 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory3 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory4 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec1, xMLInputFactory2, xMLOutputFactory3);
        com.fasterxml.jackson.core.Version version5 = xmlFactory4.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper6 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory4);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter8 = xmlMapper6.writer(characterEscapes7);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper6.disable(featureArray9);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = objectMapper10.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig12 = objectMapper10.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = objectMapper10.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.Version version18 = xmlFactory17.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory17);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter21 = xmlMapper19.writer(characterEscapes20);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray22 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = xmlMapper19.disable(featureArray22);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext24 = xmlMapper19.getDeserializationContext();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory27 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec26, xMLInputFactory27, xMLOutputFactory28);
        com.fasterxml.jackson.core.Version version30 = xmlFactory29.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper31 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory29);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes32 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter33 = xmlMapper31.writer(characterEscapes32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = xmlMapper39.setNodeFactory(jsonNodeFactory42);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider44 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = xmlMapper39.setFilterProvider(filterProvider44);
        com.fasterxml.jackson.core.JsonParser jsonParser46 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory48 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory49 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory50 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec47, xMLInputFactory48, xMLOutputFactory49);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature51 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory52 = xmlFactory50.disable(feature51);
        com.fasterxml.jackson.core.Version version53 = xmlFactory52.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass54 = xmlFactory52.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor55 = objectMapper45.readValues(jsonParser46, featureClass54);
        boolean boolean56 = xmlMapper31.canSerialize(featureClass54);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference57 = null;
        boolean boolean58 = xmlMapper19.canSerialize(featureClass54, throwableAtomicReference57);
        com.fasterxml.jackson.databind.BeanProperty beanProperty60 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer61 = serializerProvider13.findTypedValueSerializer(featureClass54, false, beanProperty60);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer62 = serializerProvider13.getDefaultNullKeySerializer();
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory64 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory65 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory66 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec63, xMLInputFactory64, xMLOutputFactory65);
        com.fasterxml.jackson.core.Version version67 = xmlFactory66.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper68 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory66);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes69 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter70 = xmlMapper68.writer(characterEscapes69);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray71 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper72 = xmlMapper68.disable(featureArray71);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext73 = xmlMapper68.getDeserializationContext();
        com.fasterxml.jackson.core.Version version74 = xmlMapper68.version();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter75 = xmlMapper68.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper76 = xmlMapper68.enableDefaultTyping();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider77 = null;
        xmlMapper68.setFilters(filterProvider77);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig79 = xmlMapper68.getSerializationConfig();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector80 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector81 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair82 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector80, annotationIntrospector81);
        com.fasterxml.jackson.databind.introspect.Annotated annotated83 = null;
        java.lang.Boolean boolean84 = pair82.isOutputAsCData(annotated83);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector85 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector86 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair87 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector85, annotationIntrospector86);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector88 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector89 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair90 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector88, annotationIntrospector89);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair91 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair87, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair90);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair92 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair82, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair90);
        com.fasterxml.jackson.databind.introspect.Annotated annotated93 = null;
        java.lang.String str94 = pair90.findNamespace(annotated93);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider95 = serializerProvider13.setAttribute((java.lang.Object) serializationConfig79, (java.lang.Object) str94);
        com.fasterxml.jackson.databind.BeanDescription beanDescription96 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer97 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer98 = xmlBeanSerializerModifier0.modifySerializer(serializationConfig79, beanDescription96, objJsonSerializer97);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(objectWriter8);
        org.junit.Assert.assertNotNull(featureArray9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(serializationConfig12);
        org.junit.Assert.assertNotNull(serializerProvider13);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(objectWriter21);
        org.junit.Assert.assertNotNull(featureArray22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(deserializationContext24);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(objectWriter33);
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature51.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory52);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(featureClass54);
        org.junit.Assert.assertNotNull(featureItor55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer61);
        org.junit.Assert.assertNotNull(objJsonSerializer62);
        org.junit.Assert.assertNotNull(version67);
        org.junit.Assert.assertNotNull(objectWriter70);
        org.junit.Assert.assertNotNull(featureArray71);
        org.junit.Assert.assertNotNull(objectMapper72);
        org.junit.Assert.assertNotNull(deserializationContext73);
        org.junit.Assert.assertNotNull(version74);
        org.junit.Assert.assertNotNull(objectWriter75);
        org.junit.Assert.assertNotNull(objectMapper76);
        org.junit.Assert.assertNotNull(serializationConfig79);
        org.junit.Assert.assertNull(boolean84);
        org.junit.Assert.assertNotNull(pair92);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNotNull(serializerProvider95);
        org.junit.Assert.assertNull(wildcardJsonSerializer98);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test619");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.reader(jsonNodeFactory10);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = xmlMapper5.copy();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = xmlMapper12.createObjectNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature18 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = xmlFactory17.disable(feature18);
        com.fasterxml.jackson.core.Version version20 = xmlFactory19.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass21 = xmlFactory19.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.ObjectReader objectReader22 = xmlMapper12.reader(featureClass21);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(xmlMapper12);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature18.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory19);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(featureClass21);
        org.junit.Assert.assertNotNull(objectReader22);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test620");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper5.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = xmlMapper5.getJsonFactory();
        java.lang.Object obj12 = null;
        byte[] byteArray13 = xmlMapper5.writeValueAsBytes(obj12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory15 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory16 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory17 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec14, xMLInputFactory15, xMLOutputFactory16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory19 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory20 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec18, xMLInputFactory19, xMLOutputFactory20);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature22 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = xmlFactory21.disable(feature22);
        boolean boolean24 = feature22.enabledByDefault();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = xmlFactory17.configure(feature22, false);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes27 = xmlFactory26.getCharacterEscapes();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory29 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory30 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec28, xMLInputFactory29, xMLOutputFactory30);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature32 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = xmlFactory31.disable(feature32);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory34 = xmlFactory26.disable(feature32);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = xmlMapper5.configure(feature32, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = xmlMapper5.isEnabled(feature37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature22.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(xmlFactory26);
        org.junit.Assert.assertNull(characterEscapes27);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature32.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory33);
        org.junit.Assert.assertNotNull(xmlFactory34);
        org.junit.Assert.assertNotNull(objectMapper36);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test621");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper17.setNodeFactory(jsonNodeFactory20);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper17.findAndRegisterModules();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.Version version27 = xmlFactory26.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper28 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes29 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter30 = xmlMapper28.writer(characterEscapes29);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray31 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper32 = xmlMapper28.disable(featureArray31);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper32.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig34 = objectMapper32.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = objectMapper32.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec36, xMLInputFactory37, xMLOutputFactory38);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature40 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = xmlFactory39.disable(feature40);
        com.fasterxml.jackson.core.Version version42 = xmlFactory41.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass43 = xmlFactory41.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer44 = serializerProvider35.getUnknownTypeSerializer(featureClass43);
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride45 = objectMapper22.configOverride(featureClass43);
        com.fasterxml.jackson.databind.ObjectReader objectReader46 = objectMapper9.readerFor(featureClass43);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertNotNull(objectWriter30);
        org.junit.Assert.assertNotNull(featureArray31);
        org.junit.Assert.assertNotNull(objectMapper32);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(serializationConfig34);
        org.junit.Assert.assertNotNull(serializerProvider35);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature40.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory41);
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertNotNull(featureClass43);
        org.junit.Assert.assertNotNull(objJsonSerializer44);
        org.junit.Assert.assertNotNull(mutableConfigOverride45);
        org.junit.Assert.assertNotNull(objectReader46);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test622");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory5 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory6 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory7 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec4, xMLInputFactory5, xMLOutputFactory6);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature8 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = xmlFactory7.disable(feature8);
        boolean boolean10 = feature8.enabledByDefault();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = xmlFactory3.configure(feature8, false);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass13 = xmlFactory12.getFormatWriteFeatureType();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule14 = new com.fasterxml.jackson.dataformat.xml.JacksonXmlModule();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory12, jacksonXmlModule14);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec16, xMLInputFactory17, xMLOutputFactory18);
        com.fasterxml.jackson.core.Version version20 = xmlFactory19.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper21 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory19);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping22 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper24 = xmlMapper21.enableDefaultTypingAsProperty(defaultTyping22, "XML");
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory26 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory27 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory28 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec25, xMLInputFactory26, xMLOutputFactory27);
        com.fasterxml.jackson.core.Version version29 = xmlFactory28.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper30 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory28);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes31 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter32 = xmlMapper30.writer(characterEscapes31);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray33 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper34 = xmlMapper30.disable(featureArray33);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = objectMapper34.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig36 = objectMapper34.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider37 = objectMapper34.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory39 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory40 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory41 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec38, xMLInputFactory39, xMLOutputFactory40);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature42 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = xmlFactory41.disable(feature42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass45 = xmlFactory43.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer46 = serializerProvider37.getUnknownTypeSerializer(featureClass45);
        java.util.TimeZone timeZone47 = serializerProvider37.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory50 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec48, xMLInputFactory49, xMLOutputFactory50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper53 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory51);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = xmlMapper53.writer(characterEscapes54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory64 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper61.setNodeFactory(jsonNodeFactory64);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider66 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper67 = xmlMapper61.setFilterProvider(filterProvider66);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory70 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory71 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory72 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec69, xMLInputFactory70, xMLOutputFactory71);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature73 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory74 = xmlFactory72.disable(feature73);
        com.fasterxml.jackson.core.Version version75 = xmlFactory74.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass76 = xmlFactory74.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor77 = objectMapper67.readValues(jsonParser68, featureClass76);
        boolean boolean78 = xmlMapper53.canSerialize(featureClass76);
        com.fasterxml.jackson.databind.BeanProperty beanProperty79 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer80 = serializerProvider37.findKeySerializer(featureClass76, beanProperty79);
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride81 = objectMapper24.configOverride(featureClass76);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer82 = null;
        com.fasterxml.jackson.databind.module.SimpleModule simpleModule83 = jacksonXmlModule14.addKeyDeserializer(featureClass76, keyDeserializer82);
        com.fasterxml.jackson.databind.module.SimpleSerializers simpleSerializers84 = null;
        simpleModule83.setKeySerializers(simpleSerializers84);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature8.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(xmlFactory12);
        org.junit.Assert.assertNotNull(featureClass13);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(objectMapper24);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(objectWriter32);
        org.junit.Assert.assertNotNull(featureArray33);
        org.junit.Assert.assertNotNull(objectMapper34);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(serializationConfig36);
        org.junit.Assert.assertNotNull(serializerProvider37);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature42.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory43);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(featureClass45);
        org.junit.Assert.assertNotNull(objJsonSerializer46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertNotNull(objectMapper67);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature73.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory74);
        org.junit.Assert.assertNotNull(version75);
        org.junit.Assert.assertNotNull(featureClass76);
        org.junit.Assert.assertNotNull(featureItor77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer80);
        org.junit.Assert.assertNotNull(mutableConfigOverride81);
        org.junit.Assert.assertNotNull(simpleModule83);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test623");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload25 = null;
        jsonParser24.setRequestPayloadOnError(requestPayload25);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload27 = null;
        jsonParser24.setRequestPayloadOnError(requestPayload27);
        long long30 = jsonParser24.nextLongValue((long) 100);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = jsonParser24.isEnabled(feature31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test624");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter10 = xmlMapper5.writer();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper5.enableDefaultTyping(defaultTyping11);
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes13 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter14 = objectMapper12.writer(contextAttributes13);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectWriter10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(objectWriter14);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test625");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = xmlFactory5.copy();
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = xmlFactory10.getXMLInputFactory();
        boolean boolean12 = xmlFactory10.requiresPropertyOrdering();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(xmlFactory10);
        org.junit.Assert.assertNotNull(xMLInputFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test626");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = xmlFactory5.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5, jacksonXmlModule8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper9.clearProblemHandlers();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = objectMapper10.createArrayNode();
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(arrayNode11);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test627");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair2 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.Boolean boolean4 = pair2.isOutputAsCData(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        java.lang.Boolean boolean6 = pair2.isOutputAsText(annotated5);
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        java.lang.Boolean boolean8 = pair2.isOutputAsText(annotated7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory11 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec9, xMLInputFactory10, xMLOutputFactory11);
        com.fasterxml.jackson.core.Version version13 = xmlFactory12.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory16 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory17 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec15, xMLInputFactory16, xMLOutputFactory17);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature19 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean20 = xmlFactory18.isEnabled(feature19);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory21 = xmlFactory12.enable(feature19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = pair2.findEnumValue((java.lang.Enum<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature>) feature19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature19.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(xmlFactory21);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test628");
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector0 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair2 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector1);
        com.fasterxml.jackson.databind.introspect.Annotated annotated3 = null;
        java.lang.Boolean boolean4 = pair2.isOutputAsCData(annotated3);
        com.fasterxml.jackson.databind.introspect.Annotated annotated5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory7 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory9 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec6, xMLInputFactory7, xMLOutputFactory8);
        com.fasterxml.jackson.core.Version version10 = xmlFactory9.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper11 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory9);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes12 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter13 = xmlMapper11.writer(characterEscapes12);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray14 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper11.disable(featureArray14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader17 = xmlMapper11.reader(jsonNodeFactory16);
        javax.xml.stream.XMLInputFactory xMLInputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper19 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory18);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory20 = xmlMapper19.getTypeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper11.setTypeFactory(typeFactory20);
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper24 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory22, xMLOutputFactory23);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory27 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec26, xMLInputFactory27, xMLOutputFactory28);
        com.fasterxml.jackson.core.Version version30 = xmlFactory29.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper31 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory29);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes32 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter33 = xmlMapper31.writer(characterEscapes32);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray34 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = xmlMapper31.disable(featureArray34);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper36 = xmlMapper31.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory38 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory39 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory40 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec37, xMLInputFactory38, xMLOutputFactory39);
        com.fasterxml.jackson.core.Version version41 = xmlFactory40.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper42 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory40);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes43 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter44 = xmlMapper42.writer(characterEscapes43);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray45 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = xmlMapper42.disable(featureArray45);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper47 = objectMapper46.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig48 = objectMapper46.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider49 = objectMapper46.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory51 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory52 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory53 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec50, xMLInputFactory51, xMLOutputFactory52);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature54 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory55 = xmlFactory53.disable(feature54);
        com.fasterxml.jackson.core.Version version56 = xmlFactory55.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass57 = xmlFactory55.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer58 = serializerProvider49.getUnknownTypeSerializer(featureClass57);
        java.util.TimeZone timeZone59 = serializerProvider49.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec60 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory61 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory62 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory63 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec60, xMLInputFactory61, xMLOutputFactory62);
        com.fasterxml.jackson.core.Version version64 = xmlFactory63.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper65 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory63);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes66 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter67 = xmlMapper65.writer(characterEscapes66);
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory69 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory70 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec68, xMLInputFactory69, xMLOutputFactory70);
        com.fasterxml.jackson.core.Version version72 = xmlFactory71.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper73 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory71);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes74 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter75 = xmlMapper73.writer(characterEscapes74);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory76 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper77 = xmlMapper73.setNodeFactory(jsonNodeFactory76);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider78 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper79 = xmlMapper73.setFilterProvider(filterProvider78);
        com.fasterxml.jackson.core.JsonParser jsonParser80 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory82 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory83 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory84 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec81, xMLInputFactory82, xMLOutputFactory83);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature85 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory86 = xmlFactory84.disable(feature85);
        com.fasterxml.jackson.core.Version version87 = xmlFactory86.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass88 = xmlFactory86.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor89 = objectMapper79.readValues(jsonParser80, featureClass88);
        boolean boolean90 = xmlMapper65.canSerialize(featureClass88);
        com.fasterxml.jackson.databind.JavaType javaType91 = serializerProvider49.constructType((java.lang.reflect.Type) featureClass88);
        com.fasterxml.jackson.databind.ObjectReader objectReader92 = xmlMapper36.readerFor(javaType91);
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.databind.cfg.MapperConfigBase<com.fasterxml.jackson.databind.SerializationFeature, com.fasterxml.jackson.databind.SerializationConfig>> serializationFeatureMapperConfigBaseItor93 = xmlMapper24.readValues(jsonParser25, javaType91);
        boolean boolean94 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType91);
        boolean boolean95 = xmlMapper11.canDeserialize(javaType91);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass96 = pair2.findDeserializationKeyType(annotated5, javaType91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNotNull(objectWriter13);
        org.junit.Assert.assertNotNull(featureArray14);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(objectReader17);
        org.junit.Assert.assertNotNull(typeFactory20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(objectWriter33);
        org.junit.Assert.assertNotNull(featureArray34);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(xmlMapper36);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(objectWriter44);
        org.junit.Assert.assertNotNull(featureArray45);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(objectMapper47);
        org.junit.Assert.assertNotNull(serializationConfig48);
        org.junit.Assert.assertNotNull(serializerProvider49);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature54.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory55);
        org.junit.Assert.assertNotNull(version56);
        org.junit.Assert.assertNotNull(featureClass57);
        org.junit.Assert.assertNotNull(objJsonSerializer58);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version64);
        org.junit.Assert.assertNotNull(objectWriter67);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertNotNull(objectWriter75);
        org.junit.Assert.assertNotNull(objectMapper77);
        org.junit.Assert.assertNotNull(objectMapper79);
        org.junit.Assert.assertTrue("'" + feature85 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature85.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory86);
        org.junit.Assert.assertNotNull(version87);
        org.junit.Assert.assertNotNull(featureClass88);
        org.junit.Assert.assertNotNull(featureItor89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(javaType91);
        org.junit.Assert.assertNotNull(objectReader92);
        org.junit.Assert.assertNotNull(serializationFeatureMapperConfigBaseItor93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test629");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = xmlFactory5.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5, jacksonXmlModule8);
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = xmlFactory5.getXMLInputFactory();
        xmlFactory5.setXMLTextElementName("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory14 = xmlFactory5.enable(feature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNotNull(xMLInputFactory10);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test630");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        boolean boolean34 = serializerProvider32.hasSerializationFeatures(100);
        java.util.TimeZone timeZone35 = serializerProvider32.getTimeZone();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test631");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = xmlMapper5.findAndRegisterModules();
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode16 = xmlMapper5.readTree(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: com.ctc.wstx.exc.WstxUnexpectedCharException: Unexpected character 'd' (code 100) in prolog; expected '<'? at [row,col {unknown-source}]: [1,1]");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 0, 0, 100]");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test632");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = xmlMapper5.getDeserializationContext();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter11 = xmlMapper5.writer();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.Version version16 = xmlFactory15.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper17 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory15);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter19 = xmlMapper17.writer(characterEscapes18);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray20 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper21 = xmlMapper17.disable(featureArray20);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter22 = xmlMapper17.writer();
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider23 = null;
        xmlMapper17.setFilters(filterProvider23);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = xmlMapper17.disableDefaultTyping();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory26 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper27 = xmlMapper17.setSerializerFactory(serializerFactory26);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter28 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper17.setDefaultPrettyPrinter(prettyPrinter28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory31 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory32 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory33 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec30, xMLInputFactory31, xMLOutputFactory32);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature34 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory35 = xmlFactory33.disable(feature34);
        com.fasterxml.jackson.core.Version version36 = xmlFactory35.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper37 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature38 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper39 = xmlMapper37.disable(feature38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory41 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory42 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec40, xMLInputFactory41, xMLOutputFactory42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper45 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory43);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes46 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter47 = xmlMapper45.writer(characterEscapes46);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = xmlMapper45.setNodeFactory(jsonNodeFactory48);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper45.setFilterProvider(filterProvider50);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory54 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory55 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec53, xMLInputFactory54, xMLOutputFactory55);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature57 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = xmlFactory56.disable(feature57);
        com.fasterxml.jackson.core.Version version59 = xmlFactory58.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass60 = xmlFactory58.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor61 = objectMapper51.readValues(jsonParser52, featureClass60);
        boolean boolean62 = objectMapper39.canSerialize(featureClass60);
        com.fasterxml.jackson.databind.MapperFeature[] mapperFeatureArray63 = new com.fasterxml.jackson.databind.MapperFeature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper64 = objectMapper39.enable(mapperFeatureArray63);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper65 = xmlMapper17.enable(mapperFeatureArray63);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper66 = xmlMapper5.disable(mapperFeatureArray63);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper66);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(deserializationContext10);
        org.junit.Assert.assertNotNull(objectWriter11);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(objectWriter19);
        org.junit.Assert.assertNotNull(featureArray20);
        org.junit.Assert.assertNotNull(objectMapper21);
        org.junit.Assert.assertNotNull(objectWriter22);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(objectMapper27);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature34.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory35);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature38.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(objectMapper39);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(objectWriter47);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature57.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory58);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(featureClass60);
        org.junit.Assert.assertNotNull(featureItor61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(mapperFeatureArray63);
        org.junit.Assert.assertNotNull(objectMapper64);
        org.junit.Assert.assertNotNull(objectMapper65);
        org.junit.Assert.assertNotNull(objectMapper66);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test633");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper10 = xmlMapper5.copy();
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper12 = xmlMapper5.setSerializationInclusion(include11);
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory16);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes19 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter20 = xmlMapper18.writer(characterEscapes19);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray21 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = xmlMapper18.disable(featureArray21);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper23 = objectMapper22.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig24 = objectMapper22.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = objectMapper22.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory27 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec26, xMLInputFactory27, xMLOutputFactory28);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature30 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory31 = xmlFactory29.disable(feature30);
        com.fasterxml.jackson.core.Version version32 = xmlFactory31.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass33 = xmlFactory31.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = serializerProvider25.getUnknownTypeSerializer(featureClass33);
        java.util.TimeZone timeZone35 = serializerProvider25.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec36, xMLInputFactory37, xMLOutputFactory38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = xmlFactory39.setRootValueSeparator("");
        java.io.DataOutput dataOutput42 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = jsonFactory41.createGenerator(dataOutput42);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = serializerProvider25.setAttribute((java.lang.Object) jsonFactory41, (java.lang.Object) ' ');
        com.fasterxml.jackson.databind.BeanProperty beanProperty46 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer47 = serializerProvider25.findNullValueSerializer(beanProperty46);
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory50 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec48, xMLInputFactory49, xMLOutputFactory50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper53 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory51);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = xmlMapper53.writer(characterEscapes54);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider56 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter57 = xmlMapper53.writer(filterProvider56);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode58 = xmlMapper53.createArrayNode();
        java.lang.Object obj59 = serializerProvider25.getAttribute((java.lang.Object) xmlMapper53);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray60 = xmlMapper5.writeValueAsBytes((java.lang.Object) xmlMapper53);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: No serializer found for class com.ctc.wstx.api.WstxInputProperties$ParsingMode and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.fasterxml.jackson.dataformat.xml.XmlMapper[\"factory\"]->com.fasterxml.jackson.dataformat.xml.XmlFactory[\"xmlinputFactory\"]->com.ctc.wstx.stax.WstxInputFactory[\"config\"]->com.ctc.wstx.api.ReaderConfig[\"inputParsingMode\"])");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(xmlMapper10);
        org.junit.Assert.assertNotNull(objectMapper12);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(objectWriter20);
        org.junit.Assert.assertNotNull(featureArray21);
        org.junit.Assert.assertNotNull(objectMapper22);
        org.junit.Assert.assertNotNull(objectMapper23);
        org.junit.Assert.assertNotNull(serializationConfig24);
        org.junit.Assert.assertNotNull(serializerProvider25);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature30.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory31);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertNotNull(featureClass33);
        org.junit.Assert.assertNotNull(objJsonSerializer34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertNotNull(serializerProvider45);
        org.junit.Assert.assertNotNull(objJsonSerializer47);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(objectWriter57);
        org.junit.Assert.assertNotNull(arrayNode58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test634");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory11 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory12 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory13 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec10, xMLInputFactory11, xMLOutputFactory12);
        com.fasterxml.jackson.core.Version version14 = xmlFactory13.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper15 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory13);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = xmlMapper15.writer(characterEscapes16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper15.setNodeFactory(jsonNodeFactory18);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = xmlMapper15.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = xmlMapper15.getJsonFactory();
        java.lang.Object obj22 = null;
        byte[] byteArray23 = xmlMapper15.writeValueAsBytes(obj22);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = xmlFactory5.createJsonParser(byteArray23);
        boolean boolean25 = jsonParser24.canReadObjectId();
        byte byte26 = jsonParser24.getByteValue();
        java.lang.Object obj27 = jsonParser24.getTypeId();
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonParser24.enable(feature28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test635");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory13 = serializerProvider12.getTypeFactory();
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        com.fasterxml.jackson.databind.introspect.ObjectIdInfo objectIdInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.annotation.ObjectIdResolver objectIdResolver16 = serializerProvider12.objectIdResolverInstance(annotated14, objectIdInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertNotNull(typeFactory13);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test636");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        boolean boolean8 = xmlFactory5.requiresCustomCodec();
        javax.xml.stream.XMLInputFactory xMLInputFactory9 = xmlFactory5.getXMLInputFactory();
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory12 = xmlFactory5.configure(feature10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(xMLInputFactory9);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test637");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature15 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = xmlFactory14.disable(feature15);
        com.fasterxml.jackson.core.Version version17 = xmlFactory16.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper18 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory16);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass19 = xmlFactory16.getFormatReadFeatureType();
        boolean boolean20 = xmlFactory16.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory22 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory23 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory24 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec21, xMLInputFactory22, xMLOutputFactory23);
        com.fasterxml.jackson.core.Version version25 = xmlFactory24.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper26 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory24);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes27 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter28 = xmlMapper26.writer(characterEscapes27);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = xmlMapper26.setNodeFactory(jsonNodeFactory29);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper31 = xmlMapper26.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = xmlMapper26.getJsonFactory();
        java.lang.Object obj33 = null;
        byte[] byteArray34 = xmlMapper26.writeValueAsBytes(obj33);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = xmlFactory16.createJsonParser(byteArray34);
        boolean boolean36 = jsonParser35.canReadObjectId();
        byte byte37 = jsonParser35.getByteValue();
        java.lang.Object obj38 = jsonParser35.getTypeId();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = xmlMapper5.readTree(jsonParser35);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature15.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(featureClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(objectWriter28);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(objectMapper31);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 0 + "'", byte37 == (byte) 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objectNode39);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test638");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        com.fasterxml.jackson.databind.BeanProperty beanProperty33 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = serializerProvider12.findNullValueSerializer(beanProperty33);
        com.fasterxml.jackson.databind.SerializationFeature serializationFeature35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = serializerProvider12.isEnabled(serializationFeature35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertNotNull(objJsonSerializer34);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test639");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = objectMapper9.createArrayNode();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory12 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory13 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory14 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec11, xMLInputFactory12, xMLOutputFactory13);
        com.fasterxml.jackson.core.Version version15 = xmlFactory14.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper16 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory14);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping17 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = xmlMapper16.enableDefaultTypingAsProperty(defaultTyping17, "XML");
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory23 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec20, xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.core.Version version24 = xmlFactory23.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper25 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes26 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter27 = xmlMapper25.writer(characterEscapes26);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray28 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper25.disable(featureArray28);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper30 = objectMapper29.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig31 = objectMapper29.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = objectMapper29.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory34 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory35 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory36 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec33, xMLInputFactory34, xMLOutputFactory35);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature37 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory38 = xmlFactory36.disable(feature37);
        com.fasterxml.jackson.core.Version version39 = xmlFactory38.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass40 = xmlFactory38.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer41 = serializerProvider32.getUnknownTypeSerializer(featureClass40);
        java.util.TimeZone timeZone42 = serializerProvider32.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory44 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory45 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory46 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec43, xMLInputFactory44, xMLOutputFactory45);
        com.fasterxml.jackson.core.Version version47 = xmlFactory46.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper48 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory46);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes49 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter50 = xmlMapper48.writer(characterEscapes49);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory52 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory53 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory54 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec51, xMLInputFactory52, xMLOutputFactory53);
        com.fasterxml.jackson.core.Version version55 = xmlFactory54.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper56 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory54);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes57 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter58 = xmlMapper56.writer(characterEscapes57);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory59 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = xmlMapper56.setNodeFactory(jsonNodeFactory59);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider61 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper62 = xmlMapper56.setFilterProvider(filterProvider61);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory65 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory66 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec64, xMLInputFactory65, xMLOutputFactory66);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature68 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory69 = xmlFactory67.disable(feature68);
        com.fasterxml.jackson.core.Version version70 = xmlFactory69.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass71 = xmlFactory69.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor72 = objectMapper62.readValues(jsonParser63, featureClass71);
        boolean boolean73 = xmlMapper48.canSerialize(featureClass71);
        com.fasterxml.jackson.databind.BeanProperty beanProperty74 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer75 = serializerProvider32.findKeySerializer(featureClass71, beanProperty74);
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride76 = objectMapper19.configOverride(featureClass71);
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory78 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory79 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory80 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec77, xMLInputFactory78, xMLOutputFactory79);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature81 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory82 = xmlFactory80.disable(feature81);
        java.lang.String str83 = xmlFactory80.getRootValueSeparator();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass84 = xmlFactory80.getFormatReadFeatureType();
        javax.xml.stream.XMLInputFactory xMLInputFactory85 = xmlFactory80.getXMLInputFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory86 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory87 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper19, xMLInputFactory85, xMLOutputFactory86);
        javax.xml.stream.XMLInputFactory xMLInputFactory88 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper89 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory88);
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory90 = xmlMapper89.getTypeFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper91 = objectMapper19.setTypeFactory(typeFactory90);
        java.lang.String str92 = objectMapper9.writeValueAsString((java.lang.Object) typeFactory90);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(arrayNode10);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(objectWriter27);
        org.junit.Assert.assertNotNull(featureArray28);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(objectMapper30);
        org.junit.Assert.assertNotNull(serializationConfig31);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature37.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory38);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(featureClass40);
        org.junit.Assert.assertNotNull(objJsonSerializer41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNotNull(objectWriter50);
        org.junit.Assert.assertNotNull(version55);
        org.junit.Assert.assertNotNull(objectWriter58);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertNotNull(objectMapper62);
        org.junit.Assert.assertTrue("'" + feature68 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature68.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory69);
        org.junit.Assert.assertNotNull(version70);
        org.junit.Assert.assertNotNull(featureClass71);
        org.junit.Assert.assertNotNull(featureItor72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer75);
        org.junit.Assert.assertNotNull(mutableConfigOverride76);
        org.junit.Assert.assertTrue("'" + feature81 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature81.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + " " + "'", str83, " ");
        org.junit.Assert.assertNotNull(featureClass84);
        org.junit.Assert.assertNotNull(xMLInputFactory85);
        org.junit.Assert.assertNotNull(typeFactory90);
        org.junit.Assert.assertNotNull(objectMapper91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "<TypeFactory><classLoader/></TypeFactory>" + "'", str92, "<TypeFactory><classLoader/></TypeFactory>");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test640");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        boolean boolean34 = serializerProvider32.hasSerializationFeatures(100);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = serializerProvider32.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig36 = serializerProvider32.getConfig();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer35);
        org.junit.Assert.assertNotNull(serializationConfig36);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test641");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper7 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass8 = xmlFactory5.getFormatReadFeatureType();
        boolean boolean9 = xmlFactory5.requiresPropertyOrdering();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = xmlFactory5.getInputDecorator();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory12 = xmlFactory5.disable(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNotNull(featureClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputDecorator10);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test642");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        int int10 = xmlMapper5.mixInCount();
        com.fasterxml.jackson.databind.InjectableValues injectableValues11 = xmlMapper5.getInjectableValues();
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature12 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean14 = feature12.enabledIn((int) (byte) 10);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper15 = xmlMapper5.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory17 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory18 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory19 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec16, xMLInputFactory17, xMLOutputFactory18);
        com.fasterxml.jackson.core.Version version20 = xmlFactory19.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper21 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory19);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes22 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter23 = xmlMapper21.writer(characterEscapes22);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray24 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = xmlMapper21.disable(featureArray24);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext26 = xmlMapper21.getDeserializationContext();
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping27 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper29 = xmlMapper21.enableDefaultTypingAsProperty(defaultTyping27, "");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = objectMapper29.getNodeFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader31 = objectMapper15.reader(jsonNodeFactory30);
        com.fasterxml.jackson.databind.jsontype.SubtypeResolver subtypeResolver32 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper33 = objectMapper15.setSubtypeResolver(subtypeResolver32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory35 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory36 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory37 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec34, xMLInputFactory35, xMLOutputFactory36);
        com.fasterxml.jackson.core.Version version38 = xmlFactory37.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper39 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory37);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter41 = xmlMapper39.writer(characterEscapes40);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray42 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper43 = xmlMapper39.disable(featureArray42);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper44 = objectMapper43.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig45 = objectMapper43.getSerializationConfig();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode46 = objectMapper43.createArrayNode();
        java.util.List<com.fasterxml.jackson.databind.Module> moduleList47 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper48 = objectMapper43.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList47);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = objectMapper33.registerModules((java.lang.Iterable<com.fasterxml.jackson.databind.Module>) moduleList47);
        com.fasterxml.jackson.databind.ObjectWriter objectWriter50 = objectMapper49.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory52 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory53 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory54 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec51, xMLInputFactory52, xMLOutputFactory53);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature55 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = xmlFactory54.disable(feature55);
        com.fasterxml.jackson.core.Version version57 = xmlFactory56.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper58 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory56);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass59 = xmlFactory56.getFormatReadFeatureType();
        boolean boolean60 = xmlFactory56.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory62 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory63 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory64 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec61, xMLInputFactory62, xMLOutputFactory63);
        com.fasterxml.jackson.core.Version version65 = xmlFactory64.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper66 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory64);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes67 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter68 = xmlMapper66.writer(characterEscapes67);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory69 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper70 = xmlMapper66.setNodeFactory(jsonNodeFactory69);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper71 = xmlMapper66.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = xmlMapper66.getJsonFactory();
        java.lang.Object obj73 = null;
        byte[] byteArray74 = xmlMapper66.writeValueAsBytes(obj73);
        com.fasterxml.jackson.core.JsonParser jsonParser75 = xmlFactory56.createJsonParser(byteArray74);
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = objectMapper49.readTree(jsonParser75);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes77 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter78 = objectMapper49.writer(characterEscapes77);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(injectableValues11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature12.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objectMapper15);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(objectWriter23);
        org.junit.Assert.assertNotNull(featureArray24);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(deserializationContext26);
        org.junit.Assert.assertNotNull(objectMapper29);
        org.junit.Assert.assertNotNull(jsonNodeFactory30);
        org.junit.Assert.assertNotNull(objectReader31);
        org.junit.Assert.assertNotNull(objectMapper33);
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(objectWriter41);
        org.junit.Assert.assertNotNull(featureArray42);
        org.junit.Assert.assertNotNull(objectMapper43);
        org.junit.Assert.assertNotNull(objectMapper44);
        org.junit.Assert.assertNotNull(serializationConfig45);
        org.junit.Assert.assertNotNull(arrayNode46);
        org.junit.Assert.assertNotNull(moduleList47);
        org.junit.Assert.assertNotNull(objectMapper48);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(objectWriter50);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature55.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory56);
        org.junit.Assert.assertNotNull(version57);
        org.junit.Assert.assertNotNull(featureClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertNotNull(objectWriter68);
        org.junit.Assert.assertNotNull(objectMapper70);
        org.junit.Assert.assertNotNull(objectMapper71);
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[60, 110, 117, 108, 108, 47, 62]");
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertNotNull(jsonNode76);
        org.junit.Assert.assertNotNull(objectWriter78);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test643");
        javax.xml.stream.XMLInputFactory xMLInputFactory0 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper1 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory0);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider2 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper3 = xmlMapper1.setSerializerProvider(defaultSerializerProvider2);
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper3.disable(deserializationFeature4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper3);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test644");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping6 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper8 = xmlMapper5.enableDefaultTypingAsProperty(defaultTyping6, "XML");
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory10 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory11 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec9, xMLInputFactory10, xMLOutputFactory11);
        com.fasterxml.jackson.core.Version version13 = xmlFactory12.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper14 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter16 = xmlMapper14.writer(characterEscapes15);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray17 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = xmlMapper14.disable(featureArray17);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = objectMapper18.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig20 = objectMapper18.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = objectMapper18.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory23 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory24 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory25 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec22, xMLInputFactory23, xMLOutputFactory24);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature26 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory27 = xmlFactory25.disable(feature26);
        com.fasterxml.jackson.core.Version version28 = xmlFactory27.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass29 = xmlFactory27.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = serializerProvider21.getUnknownTypeSerializer(featureClass29);
        java.util.TimeZone timeZone31 = serializerProvider21.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory33 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory34 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory35 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec32, xMLInputFactory33, xMLOutputFactory34);
        com.fasterxml.jackson.core.Version version36 = xmlFactory35.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper37 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory35);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes38 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter39 = xmlMapper37.writer(characterEscapes38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory41 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory42 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory43 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec40, xMLInputFactory41, xMLOutputFactory42);
        com.fasterxml.jackson.core.Version version44 = xmlFactory43.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper45 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory43);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes46 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter47 = xmlMapper45.writer(characterEscapes46);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper49 = xmlMapper45.setNodeFactory(jsonNodeFactory48);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = xmlMapper45.setFilterProvider(filterProvider50);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory54 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory55 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory56 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec53, xMLInputFactory54, xMLOutputFactory55);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature57 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory58 = xmlFactory56.disable(feature57);
        com.fasterxml.jackson.core.Version version59 = xmlFactory58.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass60 = xmlFactory58.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor61 = objectMapper51.readValues(jsonParser52, featureClass60);
        boolean boolean62 = xmlMapper37.canSerialize(featureClass60);
        com.fasterxml.jackson.databind.BeanProperty beanProperty63 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer64 = serializerProvider21.findKeySerializer(featureClass60, beanProperty63);
        com.fasterxml.jackson.databind.cfg.MutableConfigOverride mutableConfigOverride65 = objectMapper8.configOverride(featureClass60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory67 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory68 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory69 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec66, xMLInputFactory67, xMLOutputFactory68);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature70 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory71 = xmlFactory69.disable(feature70);
        java.lang.String str72 = xmlFactory69.getRootValueSeparator();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass73 = xmlFactory69.getFormatReadFeatureType();
        javax.xml.stream.XMLInputFactory xMLInputFactory74 = xmlFactory69.getXMLInputFactory();
        javax.xml.stream.XMLOutputFactory xMLOutputFactory75 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory76 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) objectMapper8, xMLInputFactory74, xMLOutputFactory75);
        java.lang.String str77 = xmlFactory76.getXMLTextElementName();
        com.fasterxml.jackson.core.JsonFactory.Feature feature78 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory79 = xmlFactory76.disable(feature78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectMapper8);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(objectWriter16);
        org.junit.Assert.assertNotNull(featureArray17);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNotNull(objectMapper19);
        org.junit.Assert.assertNotNull(serializationConfig20);
        org.junit.Assert.assertNotNull(serializerProvider21);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature26.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(featureClass29);
        org.junit.Assert.assertNotNull(objJsonSerializer30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertNotNull(objectWriter39);
        org.junit.Assert.assertNotNull(version44);
        org.junit.Assert.assertNotNull(objectWriter47);
        org.junit.Assert.assertNotNull(objectMapper49);
        org.junit.Assert.assertNotNull(objectMapper51);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature57.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory58);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(featureClass60);
        org.junit.Assert.assertNotNull(featureItor61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer64);
        org.junit.Assert.assertNotNull(mutableConfigOverride65);
        org.junit.Assert.assertTrue("'" + feature70 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature70.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + " " + "'", str72, " ");
        org.junit.Assert.assertNotNull(featureClass73);
        org.junit.Assert.assertNotNull(xMLInputFactory74);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test645");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature4 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory5 = xmlFactory3.disable(feature4);
        com.fasterxml.jackson.core.Version version6 = xmlFactory5.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = xmlFactory5.getCodec();
        com.fasterxml.jackson.dataformat.xml.JacksonXmlModule jacksonXmlModule8 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper9 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory5, jacksonXmlModule8);
        com.fasterxml.jackson.annotation.JsonInclude.Value value10 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = xmlMapper9.setPropertyInclusion(value10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory13 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory14 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory15 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec12, xMLInputFactory13, xMLOutputFactory14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = xmlFactory15.setRootValueSeparator("");
        java.io.DataOutput dataOutput18 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = jsonFactory17.createGenerator(dataOutput18);
        boolean boolean20 = jsonGenerator19.canWriteTypeId();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = jsonGenerator19.setCharacterEscapes(characterEscapes21);
        boolean boolean23 = jsonGenerator19.canWriteBinaryNatively();
        jsonGenerator19.writeOmittedField("hi!");
        com.fasterxml.jackson.core.FormatSchema formatSchema26 = null;
        boolean boolean27 = jsonGenerator19.canUseSchema(formatSchema26);
        com.fasterxml.jackson.databind.ObjectReader objectReader28 = objectMapper11.readerForUpdating((java.lang.Object) jsonGenerator19);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator19.writeObjectId(obj29);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature4.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory5);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNotNull(objectMapper11);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectReader28);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test646");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper12 = xmlMapper5.copy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = xmlMapper5.getNodeFactory();
        com.fasterxml.jackson.databind.DeserializationFeature deserializationFeature14 = null;
        com.fasterxml.jackson.databind.DeserializationFeature[] deserializationFeatureArray15 = new com.fasterxml.jackson.databind.DeserializationFeature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = xmlMapper5.disable(deserializationFeature14, deserializationFeatureArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(xmlMapper12);
        org.junit.Assert.assertNull(jsonNodeFactory13);
        org.junit.Assert.assertNotNull(deserializationFeatureArray15);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test647");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        java.lang.String str11 = objectMapper9.writeValueAsString((java.lang.Object) "XML");
        com.fasterxml.jackson.databind.InjectableValues injectableValues12 = null;
        com.fasterxml.jackson.databind.ObjectReader objectReader13 = objectMapper9.reader(injectableValues12);
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper9.writer(formatSchema14);
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup16 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
        com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider xmlSerializerProvider17 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(xmlRootNameLookup16);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper18 = objectMapper9.setSerializerProvider((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider) xmlSerializerProvider17);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = xmlSerializerProvider17.getGenerator();
        com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup xmlRootNameLookup20 = xmlSerializerProvider17._rootNameLookup;
        javax.xml.stream.XMLInputFactory xMLInputFactory21 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory22 = null;
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper23 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xMLInputFactory21, xMLOutputFactory22);
        com.fasterxml.jackson.annotation.JsonInclude.Value value24 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper25 = xmlMapper23.setPropertyInclusion(value24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory27 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory28 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory29 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec26, xMLInputFactory27, xMLOutputFactory28);
        com.fasterxml.jackson.core.Version version30 = xmlFactory29.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper31 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory29);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes32 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter33 = xmlMapper31.writer(characterEscapes32);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray34 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper35 = xmlMapper31.disable(featureArray34);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper36 = objectMapper35.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig37 = objectMapper35.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider38 = objectMapper35.getSerializerProviderInstance();
        com.fasterxml.jackson.core.JsonParser.Feature[] featureArray39 = new com.fasterxml.jackson.core.JsonParser.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper40 = objectMapper35.enable(featureArray39);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider defaultSerializerProvider41 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper42 = objectMapper35.setSerializerProvider(defaultSerializerProvider41);
        com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier xmlBeanDeserializerModifier44 = new com.fasterxml.jackson.dataformat.xml.deser.XmlBeanDeserializerModifier(" ");
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory47 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory48 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory49 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec46, xMLInputFactory47, xMLOutputFactory48);
        com.fasterxml.jackson.core.Version version50 = xmlFactory49.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper51 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory49);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes52 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter53 = xmlMapper51.writer(characterEscapes52);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = xmlMapper51.writer(filterProvider54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory57 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory58 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory59 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec56, xMLInputFactory57, xMLOutputFactory58);
        com.fasterxml.jackson.core.Version version60 = xmlFactory59.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper61 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory59);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes62 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter63 = xmlMapper61.writer(characterEscapes62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory65 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory66 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory67 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec64, xMLInputFactory65, xMLOutputFactory66);
        com.fasterxml.jackson.core.Version version68 = xmlFactory67.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper69 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory67);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes70 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter71 = xmlMapper69.writer(characterEscapes70);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory72 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper73 = xmlMapper69.setNodeFactory(jsonNodeFactory72);
        com.fasterxml.jackson.databind.ser.FilterProvider filterProvider74 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper75 = xmlMapper69.setFilterProvider(filterProvider74);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory78 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory79 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory80 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec77, xMLInputFactory78, xMLOutputFactory79);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature81 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory82 = xmlFactory80.disable(feature81);
        com.fasterxml.jackson.core.Version version83 = xmlFactory82.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass84 = xmlFactory82.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.MappingIterator<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureItor85 = objectMapper75.readValues(jsonParser76, featureClass84);
        boolean boolean86 = xmlMapper61.canSerialize(featureClass84);
        boolean boolean87 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(featureClass84);
        com.fasterxml.jackson.databind.JavaType javaType88 = xmlMapper51.constructType((java.lang.reflect.Type) featureClass84);
        boolean boolean89 = com.fasterxml.jackson.dataformat.xml.util.TypeUtil.isIndexedType(javaType88);
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer90 = null;
        com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer91 = xmlBeanDeserializerModifier44.modifyKeyDeserializer(deserializationConfig45, javaType88, keyDeserializer90);
        java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwableAtomicReference92 = null;
        boolean boolean93 = objectMapper35.canDeserialize(javaType88, throwableAtomicReference92);
        com.fasterxml.jackson.databind.JavaType javaType94 = objectMapper25.constructType((java.lang.reflect.Type) javaType88);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper95 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlSerializerProvider17.acceptJsonFormatVisitor(javaType94, jsonFormatVisitorWrapper95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<String>XML</String>" + "'", str11, "<String>XML</String>");
        org.junit.Assert.assertNotNull(objectReader13);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectMapper18);
        org.junit.Assert.assertNull(jsonGenerator19);
        org.junit.Assert.assertNotNull(xmlRootNameLookup20);
        org.junit.Assert.assertNotNull(objectMapper25);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(objectWriter33);
        org.junit.Assert.assertNotNull(featureArray34);
        org.junit.Assert.assertNotNull(objectMapper35);
        org.junit.Assert.assertNotNull(objectMapper36);
        org.junit.Assert.assertNotNull(serializationConfig37);
        org.junit.Assert.assertNotNull(serializerProvider38);
        org.junit.Assert.assertNotNull(featureArray39);
        org.junit.Assert.assertNotNull(objectMapper40);
        org.junit.Assert.assertNotNull(objectMapper42);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(objectWriter53);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(objectWriter63);
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertNotNull(objectWriter71);
        org.junit.Assert.assertNotNull(objectMapper73);
        org.junit.Assert.assertNotNull(objectMapper75);
        org.junit.Assert.assertTrue("'" + feature81 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature81.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory82);
        org.junit.Assert.assertNotNull(version83);
        org.junit.Assert.assertNotNull(featureClass84);
        org.junit.Assert.assertNotNull(featureItor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(javaType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(keyDeserializer91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(javaType94);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test648");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.setNodeFactory(jsonNodeFactory8);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory10 = new com.fasterxml.jackson.dataformat.xml.XmlFactory();
        com.fasterxml.jackson.databind.ObjectReader objectReader11 = xmlMapper5.readerForUpdating((java.lang.Object) xmlFactory10);
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory12 = new com.fasterxml.jackson.dataformat.xml.XmlFactory((com.fasterxml.jackson.core.ObjectCodec) xmlMapper5);
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature> featureClass13 = xmlFactory12.getFormatWriteFeatureType();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectReader11);
        org.junit.Assert.assertNotNull(featureClass13);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test649");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory1 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory2 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory3 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec0, xMLInputFactory1, xMLOutputFactory2);
        com.fasterxml.jackson.core.Version version4 = xmlFactory3.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper5 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory3);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter7 = xmlMapper5.writer(characterEscapes6);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper9 = xmlMapper5.disable(featureArray8);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper10 = objectMapper9.disableDefaultTyping();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig11 = objectMapper9.getSerializationConfig();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = objectMapper9.getSerializerProviderInstance();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory14 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory15 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory16 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec13, xMLInputFactory14, xMLOutputFactory15);
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature17 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory18 = xmlFactory16.disable(feature17);
        com.fasterxml.jackson.core.Version version19 = xmlFactory18.version();
        java.lang.Class<com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature> featureClass20 = xmlFactory18.getFormatReadFeatureType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = serializerProvider12.getUnknownTypeSerializer(featureClass20);
        java.util.TimeZone timeZone22 = serializerProvider12.getTimeZone();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory24 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory25 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory26 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec23, xMLInputFactory24, xMLOutputFactory25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = xmlFactory26.setRootValueSeparator("");
        java.io.DataOutput dataOutput29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory28.createGenerator(dataOutput29);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider32 = serializerProvider12.setAttribute((java.lang.Object) jsonFactory28, (java.lang.Object) ' ');
        boolean boolean34 = serializerProvider32.hasSerializationFeatures(100);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = serializerProvider32.getDefaultNullValueSerializer();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory37 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory38 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory39 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec36, xMLInputFactory37, xMLOutputFactory38);
        com.fasterxml.jackson.core.Version version40 = xmlFactory39.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper41 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory39);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes42 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter43 = xmlMapper41.writer(characterEscapes42);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper45 = xmlMapper41.setNodeFactory(jsonNodeFactory44);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper46 = xmlMapper41.findAndRegisterModules();
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = xmlMapper41.getJsonFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        javax.xml.stream.XMLInputFactory xMLInputFactory49 = null;
        javax.xml.stream.XMLOutputFactory xMLOutputFactory50 = null;
        com.fasterxml.jackson.dataformat.xml.XmlFactory xmlFactory51 = new com.fasterxml.jackson.dataformat.xml.XmlFactory(objectCodec48, xMLInputFactory49, xMLOutputFactory50);
        com.fasterxml.jackson.core.Version version52 = xmlFactory51.version();
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper53 = new com.fasterxml.jackson.dataformat.xml.XmlMapper(xmlFactory51);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = xmlMapper53.writer(characterEscapes54);
        com.fasterxml.jackson.core.JsonGenerator.Feature[] featureArray56 = new com.fasterxml.jackson.core.JsonGenerator.Feature[] {};
        com.fasterxml.jackson.databind.ObjectMapper objectMapper57 = xmlMapper53.disable(featureArray56);
        com.fasterxml.jackson.dataformat.xml.XmlMapper xmlMapper58 = xmlMapper53.copy();
        java.text.DateFormat dateFormat59 = xmlMapper53.getDateFormat();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper60 = xmlMapper41.setDateFormat(dateFormat59);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector61 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector62 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair63 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector61, annotationIntrospector62);
        com.fasterxml.jackson.databind.introspect.Annotated annotated64 = null;
        java.lang.Boolean boolean65 = pair63.isOutputAsCData(annotated64);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector66 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector67 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair68 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector66, annotationIntrospector67);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector69 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector70 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair71 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector69, annotationIntrospector70);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair72 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair68, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair71);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair73 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair63, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair71);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector74 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector75 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair76 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector74, annotationIntrospector75);
        com.fasterxml.jackson.databind.introspect.Annotated annotated77 = null;
        java.lang.Boolean boolean78 = pair76.isOutputAsCData(annotated77);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector79 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector80 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair81 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector79, annotationIntrospector80);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector82 = null;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector83 = null;
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair84 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair(annotationIntrospector82, annotationIntrospector83);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair85 = new com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair((com.fasterxml.jackson.databind.AnnotationIntrospector) pair81, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair84);
        com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair pair86 = com.fasterxml.jackson.dataformat.xml.XmlAnnotationIntrospector.Pair.instance((com.fasterxml.jackson.databind.AnnotationIntrospector) pair76, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair84);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector87 = com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.create((com.fasterxml.jackson.databind.AnnotationIntrospector) pair71, (com.fasterxml.jackson.databind.AnnotationIntrospector) pair84);
        com.fasterxml.jackson.databind.introspect.Annotated annotated88 = null;
        java.lang.String str89 = pair71.findNamespace(annotated88);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider90 = serializerProvider32.setAttribute((java.lang.Object) objectMapper60, (java.lang.Object) str89);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(objectWriter7);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(objectMapper9);
        org.junit.Assert.assertNotNull(objectMapper10);
        org.junit.Assert.assertNotNull(serializationConfig11);
        org.junit.Assert.assertNotNull(serializerProvider12);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature17.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertNotNull(xmlFactory18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(featureClass20);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(serializerProvider32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer35);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(objectWriter43);
        org.junit.Assert.assertNotNull(objectMapper45);
        org.junit.Assert.assertNotNull(objectMapper46);
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(version52);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(featureArray56);
        org.junit.Assert.assertNotNull(objectMapper57);
        org.junit.Assert.assertNotNull(xmlMapper58);
        org.junit.Assert.assertNotNull(dateFormat59);
        org.junit.Assert.assertNotNull(objectMapper60);
        org.junit.Assert.assertNull(boolean65);
        org.junit.Assert.assertNotNull(pair73);
        org.junit.Assert.assertNull(boolean78);
        org.junit.Assert.assertNotNull(pair86);
        org.junit.Assert.assertNotNull(annotationIntrospector87);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(serializerProvider90);
    }
}

