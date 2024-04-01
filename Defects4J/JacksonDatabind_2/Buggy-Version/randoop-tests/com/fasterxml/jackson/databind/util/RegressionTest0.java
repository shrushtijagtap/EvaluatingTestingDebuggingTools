package com.fasterxml.jackson.databind.util;

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
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector nopAnnotationIntrospector5 = com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector.instance;
        java.lang.reflect.Field field6 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField8 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(field6, annotationMap7);
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = annotatedField8.withAnnotations(annotationMap9);
        com.fasterxml.jackson.annotation.JsonInclude.Include include11 = null;
        com.fasterxml.jackson.annotation.JsonInclude.Include include12 = nopAnnotationIntrospector5.findSerializationInclusion(annotated10, include11);
        java.lang.reflect.Field field13 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField15 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(field13, annotationMap14);
        java.lang.Object obj16 = nopAnnotationIntrospector5.findFilterId((com.fasterxml.jackson.databind.introspect.Annotated) annotatedField15);
        tokenBuffer4.writeObjectId((java.lang.Object) annotatedField15);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(nopAnnotationIntrospector5);
        org.junit.Assert.assertNotNull(annotated10);
        org.junit.Assert.assertNull(include12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        boolean boolean5 = tokenBuffer4._closed;
        boolean boolean6 = tokenBuffer4.canWriteObjectId();
        com.fasterxml.jackson.core.SerializableString serializableString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer4.writeFieldName(serializableString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        boolean boolean5 = tokenBuffer4._closed;
        boolean boolean6 = tokenBuffer4._hasNativeObjectIds;
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer4.writeRawUTF8String(byteArray13, (int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 100, 0, 100, 100]");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        boolean boolean5 = tokenBuffer4._closed;
        boolean boolean6 = tokenBuffer4.canWriteObjectId();
        java.lang.Object obj7 = tokenBuffer4.getOutputTarget();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicLongSerializer atomicLongSerializer0 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicLongSerializer();
        boolean boolean1 = atomicLongSerializer0.isUnwrappingSerializer();
        java.lang.Class<java.util.concurrent.atomic.AtomicLong> atomicLongClass2 = atomicLongSerializer0.handledType();
        java.util.concurrent.atomic.AtomicLong atomicLong3 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = objectMapper5.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = objectMapper5.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer8 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper5);
        boolean boolean9 = tokenBuffer8._closed;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = tokenBuffer8.firstToken();
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode12 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf(true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper14 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory13);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = objectMapper14.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper16 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory15);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = booleanNode12.traverse((com.fasterxml.jackson.core.ObjectCodec) objectMapper16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper19 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = objectMapper19.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = objectMapper19.getJsonFactory();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory21.createGenerator(outputStream22);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 100 };
        jsonGenerator23.writeBinary(byteArray26);
        com.fasterxml.jackson.databind.ser.std.NumberSerializer numberSerializer28 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        com.fasterxml.jackson.databind.PropertyName propertyName30 = null;
        com.fasterxml.jackson.databind.JavaType javaType31 = com.fasterxml.jackson.databind.type.TypeBindings.UNBOUND;
        com.fasterxml.jackson.databind.BeanProperty beanProperty32 = null;
        com.fasterxml.jackson.databind.ser.std.EnumSetSerializer enumSetSerializer33 = new com.fasterxml.jackson.databind.ser.std.EnumSetSerializer(javaType31, beanProperty32);
        com.fasterxml.jackson.databind.node.IntNode intNode35 = new com.fasterxml.jackson.databind.node.IntNode(0);
        java.util.Spliterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeSpliterator36 = intNode35.spliterator();
        java.util.List<java.lang.String> strList38 = null;
        java.util.List<java.lang.String> strList39 = intNode35.findValuesAsText("hi!", strList38);
        com.fasterxml.jackson.databind.JavaType javaType40 = javaType31.withValueHandler((java.lang.Object) intNode35);
        com.fasterxml.jackson.databind.PropertyName propertyName41 = null;
        com.fasterxml.jackson.databind.util.Annotations annotations42 = null;
        java.lang.reflect.Field field43 = null;
        com.fasterxml.jackson.databind.introspect.AnnotationMap annotationMap44 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
        com.fasterxml.jackson.databind.introspect.AnnotatedField annotatedField45 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(field43, annotationMap44);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata46 = null;
        com.fasterxml.jackson.databind.BeanProperty.Std std47 = new com.fasterxml.jackson.databind.BeanProperty.Std(propertyName30, javaType31, propertyName41, annotations42, (com.fasterxml.jackson.databind.introspect.AnnotatedMember) annotatedField45, propertyMetadata46);
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = numberSerializer28.getSchema(serializerProvider29, (java.lang.reflect.Type) javaType31, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper51 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory50);
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = objectMapper51.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter53 = objectMapper51.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.core.FormatSchema formatSchema54 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter55 = objectMapper51.writer(formatSchema54);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider56 = objectMapper51.getSerializerProvider();
        java.lang.reflect.Type type57 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = numberSerializer28.getSchema(serializerProvider56, type57, false);
        booleanNode12.serialize(jsonGenerator23, serializerProvider56);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer61 = null;
        // The following exception was thrown during execution in test generation
        try {
            atomicLongSerializer0.serializeWithType(atomicLong3, (com.fasterxml.jackson.core.JsonGenerator) tokenBuffer8, serializerProvider56, typeSerializer61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(atomicLongClass2);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNotNull(booleanNode12);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(javaType31);
        org.junit.Assert.assertNotNull(jsonNodeSpliterator36);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertNotNull(javaType40);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(objectWriter53);
        org.junit.Assert.assertNotNull(objectWriter55);
        org.junit.Assert.assertNotNull(serializerProvider56);
        org.junit.Assert.assertNotNull(jsonNode59);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        java.lang.Object obj7 = segment5.get(12);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode10 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf(true);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = booleanNode10.asToken();
        com.fasterxml.jackson.databind.node.IntNode intNode13 = new com.fasterxml.jackson.databind.node.IntNode(0);
        java.math.BigDecimal bigDecimal14 = intNode13.decimalValue();
        boolean boolean15 = intNode13.isContainerNode();
        long long16 = intNode13.longValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType17 = intNode13.getNodeType();
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes18 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = segment5.append(0, jsonToken11, (java.lang.Object) jsonNodeType17, (java.lang.Object) contextAttributes18, obj19);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap21 = segment5._nativeIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = segment5.next();
        long long23 = segment5._tokenTypes;
        tokenBuffer4._first = segment5;
        boolean boolean25 = tokenBuffer4.isClosed();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(booleanNode10);
        org.junit.Assert.assertTrue("'" + jsonToken11 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken11.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + jsonNodeType17 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.NUMBER + "'", jsonNodeType17.equals(com.fasterxml.jackson.databind.node.JsonNodeType.NUMBER));
        org.junit.Assert.assertNotNull(contextAttributes18);
        org.junit.Assert.assertNull(segment20);
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertNull(segment22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper2.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = objectMapper2.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer5 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper2);
        boolean boolean6 = tokenBuffer5._closed;
        tokenBuffer5.writeNumber((short) -1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        long long10 = segment9._tokenTypes;
        tokenBuffer5._last = segment9;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = objectMapper13.getJsonFactory();
        com.fasterxml.jackson.databind.ObjectWriter objectWriter15 = objectMapper13.writerWithDefaultPrettyPrinter();
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        com.fasterxml.jackson.databind.ObjectWriter objectWriter17 = objectMapper13.writer(formatSchema16);
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping18 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper20 = objectMapper13.enableDefaultTypingAsProperty(defaultTyping18, "hi!");
        com.fasterxml.jackson.databind.PropertyNamingStrategy propertyNamingStrategy21 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper22 = objectMapper20.setPropertyNamingStrategy(propertyNamingStrategy21);
        tokenBuffer5._objectId = objectMapper22;
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = dateFormat0.format((java.lang.Object) tokenBuffer5, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(objectWriter15);
        org.junit.Assert.assertNotNull(objectWriter17);
        org.junit.Assert.assertTrue("'" + defaultTyping18 + "' != '" + com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS + "'", defaultTyping18.equals(com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS));
        org.junit.Assert.assertNotNull(objectMapper20);
        org.junit.Assert.assertNotNull(objectMapper22);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        boolean boolean5 = tokenBuffer4._closed;
        tokenBuffer4.writeNumber((short) -1);
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer4.writeRawUTF8String(byteArray8, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        boolean boolean5 = tokenBuffer4._closed;
        tokenBuffer4.writeNumber((short) -1);
        com.fasterxml.jackson.core.Version version8 = tokenBuffer4.version();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        boolean boolean5 = tokenBuffer4._closed;
        boolean boolean6 = tokenBuffer4._hasNativeObjectIds;
        tokenBuffer4.writeStartObject();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = new com.fasterxml.jackson.databind.ObjectMapper(jsonFactory0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = objectMapper1.getJsonFactory();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer4 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.ObjectCodec) objectMapper1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        java.lang.Object obj7 = segment5.get(12);
        com.fasterxml.jackson.databind.node.BooleanNode booleanNode10 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf(true);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = booleanNode10.asToken();
        com.fasterxml.jackson.databind.node.IntNode intNode13 = new com.fasterxml.jackson.databind.node.IntNode(0);
        java.math.BigDecimal bigDecimal14 = intNode13.decimalValue();
        boolean boolean15 = intNode13.isContainerNode();
        long long16 = intNode13.longValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType17 = intNode13.getNodeType();
        com.fasterxml.jackson.databind.cfg.ContextAttributes contextAttributes18 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
        java.lang.Object obj19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = segment5.append(0, jsonToken11, (java.lang.Object) jsonNodeType17, (java.lang.Object) contextAttributes18, obj19);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap21 = segment5._nativeIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = segment5.next();
        long long23 = segment5._tokenTypes;
        tokenBuffer4._first = segment5;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = tokenBuffer4._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = segment25._next;
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(booleanNode10);
        org.junit.Assert.assertTrue("'" + jsonToken11 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken11.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + jsonNodeType17 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.NUMBER + "'", jsonNodeType17.equals(com.fasterxml.jackson.databind.node.JsonNodeType.NUMBER));
        org.junit.Assert.assertNotNull(contextAttributes18);
        org.junit.Assert.assertNull(segment20);
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertNull(segment22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(segment25);
        org.junit.Assert.assertNull(segment26);
    }
}

