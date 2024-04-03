package com.fasterxml.jackson.databind.ser;

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
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = null;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter2 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter(beanPropertyWriter0, nameTransformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig serializerFactoryConfig0 = null;
        com.fasterxml.jackson.databind.ser.BeanSerializerFactory beanSerializerFactory1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(serializerFactoryConfig0);
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig2 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription3 = null;
        com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] beanPropertyDefinitionArray4 = new com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] {};
        java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition> beanPropertyDefinitionList5 = new java.util.ArrayList<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList5, beanPropertyDefinitionArray4);
        beanSerializerFactory1.removeSetterlessGetters(serializationConfig2, beanDescription3, (java.util.List<com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition>) beanPropertyDefinitionList5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = null;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap annotatedMethodMap9 = new com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap();
        com.fasterxml.jackson.databind.deser.std.JdkDeserializers.StackTraceElementDeserializer stackTraceElementDeserializer11 = new com.fasterxml.jackson.databind.deser.std.JdkDeserializers.StackTraceElementDeserializer();
        boolean boolean12 = stackTraceElementDeserializer11.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType13 = stackTraceElementDeserializer11.getValueType();
        java.lang.Class<?> wildcardClass14 = stackTraceElementDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.deser.std.JdkDeserializers.StackTraceElementDeserializer stackTraceElementDeserializer15 = new com.fasterxml.jackson.databind.deser.std.JdkDeserializers.StackTraceElementDeserializer();
        boolean boolean16 = stackTraceElementDeserializer15.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType17 = stackTraceElementDeserializer15.getValueType();
        java.lang.Class<?> wildcardClass18 = stackTraceElementDeserializer15.getValueClass();
        com.fasterxml.jackson.databind.deser.std.JdkDeserializers.URLDeserializer uRLDeserializer19 = com.fasterxml.jackson.databind.deser.std.JdkDeserializers.URLDeserializer.instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = uRLDeserializer19.getObjectIdReader();
        java.lang.Class<?> wildcardClass21 = uRLDeserializer19.getValueClass();
        java.lang.Class[] classArray23 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass14;
        wildcardClassArray24[1] = wildcardClass18;
        wildcardClassArray24[2] = wildcardClass21;
        com.fasterxml.jackson.databind.introspect.AnnotatedMethod annotatedMethod31 = annotatedMethodMap9.find("", wildcardClassArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = beanSerializerFactory1.constructFilteredBeanWriter(beanPropertyWriter8, wildcardClassArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(beanPropertyDefinitionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(uRLDeserializer19);
        org.junit.Assert.assertNull(objectIdReader20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNull(annotatedMethod31);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.InjectableValues injectableValues1 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper2 = objectMapper0.setInjectableValues(injectableValues1);
        com.fasterxml.jackson.databind.ser.std.NullSerializer nullSerializer3 = com.fasterxml.jackson.databind.ser.std.NullSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        objJsonSerializer5.acceptJsonFormatVisitor(jsonFormatVisitorWrapper6, javaType7);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer typeWrappedDeserializer11 = new com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer(typeDeserializer9, objJsonDeserializer10);
        java.lang.Object obj12 = typeWrappedDeserializer11.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JdkDeserializers.AtomicReferenceDeserializer atomicReferenceDeserializer13 = new com.fasterxml.jackson.databind.deser.std.JdkDeserializers.AtomicReferenceDeserializer(javaType7, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) typeWrappedDeserializer11);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = nullSerializer3.getSchema(serializerProvider4, (java.lang.reflect.Type) javaType7);
        boolean boolean15 = objectMapper0.canDeserialize(javaType7);
        com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer indexedStringListSerializer16 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance;
        boolean boolean17 = indexedStringListSerializer16.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.ser.std.NullSerializer nullSerializer18 = com.fasterxml.jackson.databind.ser.std.NullSerializer.instance;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = com.fasterxml.jackson.databind.SerializerProvider.DEFAULT_NULL_KEY_SERIALIZER;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
        objJsonSerializer20.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = null;
        com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer typeWrappedDeserializer26 = new com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer(typeDeserializer24, objJsonDeserializer25);
        java.lang.Object obj27 = typeWrappedDeserializer26.getNullValue();
        com.fasterxml.jackson.databind.deser.std.JdkDeserializers.AtomicReferenceDeserializer atomicReferenceDeserializer28 = new com.fasterxml.jackson.databind.deser.std.JdkDeserializers.AtomicReferenceDeserializer(javaType22, (com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) typeWrappedDeserializer26);
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = nullSerializer18.getSchema(serializerProvider19, (java.lang.reflect.Type) javaType22);
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        java.lang.reflect.Type type31 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = nullSerializer18.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl30, type31);
        com.fasterxml.jackson.databind.JavaType javaType33 = com.fasterxml.jackson.databind.type.TypeBindings.UNBOUND;
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = indexedStringListSerializer16.getSchema((com.fasterxml.jackson.databind.SerializerProvider) impl30, (java.lang.reflect.Type) javaType33, true);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = impl30.getDefaultNullValueSerializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ContainerNode<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeContainerNode37 = objectMapper0.valueToTree((java.lang.Object) impl30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (was java.lang.NullPointerException) (through reference chain: com.fasterxml.jackson.databind.ser.Impl[\"locale\"])");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectMapper2);
        org.junit.Assert.assertNotNull(nullSerializer3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(javaType7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexedStringListSerializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nullSerializer18);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertNotNull(javaType22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(javaType33);
        org.junit.Assert.assertNotNull(jsonNode35);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
    }
}

