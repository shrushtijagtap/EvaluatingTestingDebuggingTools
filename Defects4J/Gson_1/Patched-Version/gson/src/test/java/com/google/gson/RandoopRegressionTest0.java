package com.google.gson;

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
        java.lang.reflect.Field field0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type type2 = null;
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] { type2 };
        java.lang.reflect.Type type4 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl5 = new com.google.gson.ParameterizedTypeImpl(type1, typeArray3, type4);
        boolean boolean7 = parameterizedTypeImpl5.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type8 = com.google.gson.TypeUtils.getActualTypeForFirstTypeVariable((java.lang.reflect.Type) parameterizedTypeImpl5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfo typeInfo9 = com.google.gson.TypeInfoFactory.getTypeInfoForField(field0, type8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test02");
        com.google.gson.DefaultTypeAdapters.DoubleSerializer doubleSerializer1 = new com.google.gson.DefaultTypeAdapters.DoubleSerializer(false);
        com.google.gson.AnonymousAndLocalClassExclusionStrategy anonymousAndLocalClassExclusionStrategy3 = com.google.gson.Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY;
        com.google.gson.JavaFieldNamingPolicy javaFieldNamingPolicy4 = new com.google.gson.JavaFieldNamingPolicy();
        com.google.gson.ObjectNavigatorFactory objectNavigatorFactory5 = new com.google.gson.ObjectNavigatorFactory((com.google.gson.ExclusionStrategy) anonymousAndLocalClassExclusionStrategy3, (com.google.gson.FieldNamingStrategy2) javaFieldNamingPolicy4);
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type type8 = null;
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] { type8 };
        java.lang.reflect.Type type10 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl11 = new com.google.gson.ParameterizedTypeImpl(type7, typeArray9, type10);
        java.lang.annotation.Annotation[] annotationArray12 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList13 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList13, annotationArray12);
        java.lang.String str15 = javaFieldNamingPolicy4.translateName("hi!", (java.lang.reflect.Type) parameterizedTypeImpl11, (java.util.Collection<java.lang.annotation.Annotation>) annotationList13);
        com.google.gson.JsonSerializationContext jsonSerializationContext16 = null;
        com.google.gson.JsonElement jsonElement17 = doubleSerializer1.serialize((java.lang.Double) 10.0d, (java.lang.reflect.Type) parameterizedTypeImpl11, jsonSerializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray18 = com.google.gson.TypeInfoFactory.getTypeInfoForArray((java.lang.reflect.Type) parameterizedTypeImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(anonymousAndLocalClassExclusionStrategy3);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(annotationArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test03");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { type1 };
        java.lang.reflect.Type type3 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl4 = new com.google.gson.ParameterizedTypeImpl(type0, typeArray2, type3);
        boolean boolean6 = parameterizedTypeImpl4.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type7 = parameterizedTypeImpl4.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl8 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl4);
        java.lang.reflect.Type type9 = genericArrayTypeImpl8.getGenericComponentType();
        boolean boolean10 = com.google.gson.TypeUtils.isArray(type9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray11 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test04");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        com.google.gson.AnonymousAndLocalClassExclusionStrategy anonymousAndLocalClassExclusionStrategy22 = com.google.gson.Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY;
        com.google.gson.JavaFieldNamingPolicy javaFieldNamingPolicy23 = new com.google.gson.JavaFieldNamingPolicy();
        com.google.gson.ObjectNavigatorFactory objectNavigatorFactory24 = new com.google.gson.ObjectNavigatorFactory((com.google.gson.ExclusionStrategy) anonymousAndLocalClassExclusionStrategy22, (com.google.gson.FieldNamingStrategy2) javaFieldNamingPolicy23);
        java.lang.reflect.Type type26 = null;
        java.lang.reflect.Type type27 = null;
        java.lang.reflect.Type[] typeArray28 = new java.lang.reflect.Type[] { type27 };
        java.lang.reflect.Type type29 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl30 = new com.google.gson.ParameterizedTypeImpl(type26, typeArray28, type29);
        java.lang.annotation.Annotation[] annotationArray31 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList32 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList32, annotationArray31);
        java.lang.String str34 = javaFieldNamingPolicy23.translateName("hi!", (java.lang.reflect.Type) parameterizedTypeImpl30, (java.util.Collection<java.lang.annotation.Annotation>) annotationList32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = gson0.toJson((java.lang.Object) (short) 0, (java.lang.reflect.Type) parameterizedTypeImpl30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertNotNull(anonymousAndLocalClassExclusionStrategy22);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(annotationArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test05");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        java.lang.Appendable appendable22 = null;
        java.io.Writer writer23 = com.google.gson.Streams.writerForAppendable(appendable22);
        java.io.Writer writer24 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer23);
        com.google.gson.stream.JsonWriter jsonWriter25 = new com.google.gson.stream.JsonWriter(writer23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.Streams.write((com.google.gson.JsonElement) jsonPrimitive19, false, jsonWriter25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JSON must start with an array or an object.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(writer24);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test06");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        com.google.gson.JsonArray jsonArray21 = new com.google.gson.JsonArray();
        boolean boolean22 = jsonArray21.isJsonPrimitive();
        jsonArray21.reverse();
        java.util.Iterator<com.google.gson.JsonElement> jsonElementItor24 = jsonArray21.iterator();
        com.google.gson.JsonObject jsonObject25 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement27 = jsonObject25.remove("com.google.gson.stream.MalformedJsonException: ");
        com.google.gson.JsonElement jsonElement29 = jsonObject25.remove("");
        jsonArray21.add(jsonElement29);
        java.lang.Appendable appendable31 = null;
        java.io.Writer writer32 = com.google.gson.Streams.writerForAppendable(appendable31);
        java.io.Writer writer33 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer32);
        com.google.gson.stream.JsonWriter jsonWriter34 = new com.google.gson.stream.JsonWriter(writer32);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonArray21, jsonWriter34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonElementItor24);
        org.junit.Assert.assertNull(jsonElement27);
        org.junit.Assert.assertNull(jsonElement29);
        org.junit.Assert.assertNotNull(writer32);
        org.junit.Assert.assertNotNull(writer33);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test07");
        java.lang.reflect.Field field0 = null;
        com.google.gson.JsonPrimitive jsonPrimitive2 = new com.google.gson.JsonPrimitive("100");
        java.lang.reflect.Type type3 = null;
        java.lang.reflect.Type type4 = null;
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] { type4 };
        java.lang.reflect.Type type6 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl7 = new com.google.gson.ParameterizedTypeImpl(type3, typeArray5, type6);
        boolean boolean9 = parameterizedTypeImpl7.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type10 = parameterizedTypeImpl7.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl11 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl7);
        com.google.gson.ObjectTypePair objectTypePair13 = new com.google.gson.ObjectTypePair((java.lang.Object) "100", (java.lang.reflect.Type) parameterizedTypeImpl7, true);
        java.lang.reflect.Type type14 = parameterizedTypeImpl7.getRawType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfo typeInfo15 = com.google.gson.TypeInfoFactory.getTypeInfoForField(field0, type14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(type14);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test08");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        com.google.gson.LongSerializationPolicy longSerializationPolicy21 = com.google.gson.LongSerializationPolicy.DEFAULT;
        com.google.gson.JsonElement jsonElement23 = longSerializationPolicy21.serialize((java.lang.Long) 0L);
        com.google.gson.JsonPrimitive jsonPrimitive24 = jsonElement23.getAsJsonPrimitive();
        java.lang.Appendable appendable25 = null;
        java.io.Writer writer26 = com.google.gson.Streams.writerForAppendable(appendable25);
        java.io.Writer writer27 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer26);
        java.io.Writer writer28 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer26);
        com.google.gson.stream.JsonWriter jsonWriter29 = new com.google.gson.stream.JsonWriter(writer26);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) jsonElement23, (java.lang.Appendable) writer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + longSerializationPolicy21 + "' != '" + com.google.gson.LongSerializationPolicy.DEFAULT + "'", longSerializationPolicy21.equals(com.google.gson.LongSerializationPolicy.DEFAULT));
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertNotNull(jsonPrimitive24);
        org.junit.Assert.assertNotNull(writer26);
        org.junit.Assert.assertNotNull(writer27);
        org.junit.Assert.assertNotNull(writer28);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test09");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { type1 };
        java.lang.reflect.Type type3 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl4 = new com.google.gson.ParameterizedTypeImpl(type0, typeArray2, type3);
        boolean boolean6 = parameterizedTypeImpl4.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type7 = parameterizedTypeImpl4.getRawType();
        java.lang.reflect.Type type8 = com.google.gson.TypeUtils.getActualTypeForFirstTypeVariable((java.lang.reflect.Type) parameterizedTypeImpl4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray9 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test10");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { type1 };
        java.lang.reflect.Type type3 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl4 = new com.google.gson.ParameterizedTypeImpl(type0, typeArray2, type3);
        boolean boolean6 = parameterizedTypeImpl4.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type7 = parameterizedTypeImpl4.getRawType();
        boolean boolean9 = parameterizedTypeImpl4.equals((java.lang.Object) "100");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray10 = com.google.gson.TypeInfoFactory.getTypeInfoForArray((java.lang.reflect.Type) parameterizedTypeImpl4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test11");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        boolean boolean21 = jsonPrimitive19.isNumber();
        boolean boolean22 = jsonPrimitive19.getAsBoolean();
        long long23 = jsonPrimitive19.getAsLong();
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4L + "'", long23 == 4L);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test12");
        com.google.gson.MemoryRefStack memoryRefStack0 = new com.google.gson.MemoryRefStack();
        com.google.gson.JsonPrimitive jsonPrimitive2 = new com.google.gson.JsonPrimitive("100");
        java.lang.reflect.Type type3 = null;
        java.lang.reflect.Type type4 = null;
        java.lang.reflect.Type[] typeArray5 = new java.lang.reflect.Type[] { type4 };
        java.lang.reflect.Type type6 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl7 = new com.google.gson.ParameterizedTypeImpl(type3, typeArray5, type6);
        boolean boolean9 = parameterizedTypeImpl7.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type10 = parameterizedTypeImpl7.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl11 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl7);
        com.google.gson.ObjectTypePair objectTypePair13 = new com.google.gson.ObjectTypePair((java.lang.Object) "100", (java.lang.reflect.Type) parameterizedTypeImpl7, true);
        com.google.gson.ObjectTypePair objectTypePair14 = objectTypePair13.toMoreSpecificType();
        com.google.gson.ObjectTypePair objectTypePair15 = memoryRefStack0.push(objectTypePair13);
        com.google.gson.MemoryRefStack memoryRefStack16 = new com.google.gson.MemoryRefStack();
        com.google.gson.JsonPrimitive jsonPrimitive18 = new com.google.gson.JsonPrimitive("100");
        java.lang.reflect.Type type19 = null;
        java.lang.reflect.Type type20 = null;
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { type20 };
        java.lang.reflect.Type type22 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl23 = new com.google.gson.ParameterizedTypeImpl(type19, typeArray21, type22);
        boolean boolean25 = parameterizedTypeImpl23.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type26 = parameterizedTypeImpl23.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl27 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl23);
        com.google.gson.ObjectTypePair objectTypePair29 = new com.google.gson.ObjectTypePair((java.lang.Object) "100", (java.lang.reflect.Type) parameterizedTypeImpl23, true);
        com.google.gson.ObjectTypePair objectTypePair30 = objectTypePair29.toMoreSpecificType();
        com.google.gson.ObjectTypePair objectTypePair31 = memoryRefStack16.push(objectTypePair29);
        boolean boolean32 = memoryRefStack0.contains(objectTypePair31);
        com.google.gson.ObjectTypePair objectTypePair33 = memoryRefStack0.pop();
        com.google.gson.AnonymousAndLocalClassExclusionStrategy anonymousAndLocalClassExclusionStrategy34 = com.google.gson.Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY;
        com.google.gson.JavaFieldNamingPolicy javaFieldNamingPolicy35 = new com.google.gson.JavaFieldNamingPolicy();
        com.google.gson.ObjectNavigatorFactory objectNavigatorFactory36 = new com.google.gson.ObjectNavigatorFactory((com.google.gson.ExclusionStrategy) anonymousAndLocalClassExclusionStrategy34, (com.google.gson.FieldNamingStrategy2) javaFieldNamingPolicy35);
        com.google.gson.FieldNamingStrategy2 fieldNamingStrategy2_37 = objectNavigatorFactory36.getFieldNamingPolicy();
        com.google.gson.JsonPrimitive jsonPrimitive39 = new com.google.gson.JsonPrimitive("100");
        java.lang.reflect.Type type40 = null;
        java.lang.reflect.Type type41 = null;
        java.lang.reflect.Type[] typeArray42 = new java.lang.reflect.Type[] { type41 };
        java.lang.reflect.Type type43 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl44 = new com.google.gson.ParameterizedTypeImpl(type40, typeArray42, type43);
        boolean boolean46 = parameterizedTypeImpl44.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type47 = parameterizedTypeImpl44.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl48 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl44);
        com.google.gson.ObjectTypePair objectTypePair50 = new com.google.gson.ObjectTypePair((java.lang.Object) "100", (java.lang.reflect.Type) parameterizedTypeImpl44, true);
        java.lang.reflect.Type type51 = objectTypePair50.type;
        com.google.gson.ObjectNavigator objectNavigator52 = objectNavigatorFactory36.create(objectTypePair50);
        com.google.gson.JsonPrimitive jsonPrimitive54 = new com.google.gson.JsonPrimitive("100");
        java.lang.reflect.Type type55 = null;
        java.lang.reflect.Type type56 = null;
        java.lang.reflect.Type[] typeArray57 = new java.lang.reflect.Type[] { type56 };
        java.lang.reflect.Type type58 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl59 = new com.google.gson.ParameterizedTypeImpl(type55, typeArray57, type58);
        boolean boolean61 = parameterizedTypeImpl59.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type62 = parameterizedTypeImpl59.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl63 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl59);
        com.google.gson.ObjectTypePair objectTypePair65 = new com.google.gson.ObjectTypePair((java.lang.Object) "100", (java.lang.reflect.Type) parameterizedTypeImpl59, true);
        com.google.gson.ObjectTypePair objectTypePair66 = objectTypePair65.toMoreSpecificType();
        com.google.gson.ObjectNavigator objectNavigator67 = objectNavigatorFactory36.create(objectTypePair65);
        com.google.gson.ObjectTypePair objectTypePair68 = memoryRefStack0.push(objectTypePair65);
        com.google.gson.ObjectTypePair objectTypePair69 = memoryRefStack0.pop();
        boolean boolean70 = objectTypePair69.isPreserveType();
        java.lang.reflect.Type type71 = objectTypePair69.getType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray72 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNotNull(objectTypePair14);
        org.junit.Assert.assertNotNull(objectTypePair15);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(type26);
        org.junit.Assert.assertNotNull(objectTypePair30);
        org.junit.Assert.assertNotNull(objectTypePair31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objectTypePair33);
        org.junit.Assert.assertNotNull(anonymousAndLocalClassExclusionStrategy34);
        org.junit.Assert.assertNotNull(fieldNamingStrategy2_37);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(type47);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(objectNavigator52);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(type62);
        org.junit.Assert.assertNotNull(objectTypePair66);
        org.junit.Assert.assertNotNull(objectNavigator67);
        org.junit.Assert.assertNotNull(objectTypePair68);
        org.junit.Assert.assertNotNull(objectTypePair69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(type71);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test13");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        boolean boolean21 = jsonPrimitive19.isBoolean();
        short short22 = jsonPrimitive19.getAsShort();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonNull jsonNull23 = jsonPrimitive19.getAsJsonNull();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: This is not a JSON Null.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 4 + "'", short22 == (short) 4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test14");
        java.lang.Object obj0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type type2 = null;
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] { type2 };
        java.lang.reflect.Type type4 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl5 = new com.google.gson.ParameterizedTypeImpl(type1, typeArray3, type4);
        boolean boolean7 = parameterizedTypeImpl5.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type8 = parameterizedTypeImpl5.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl9 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl5);
        java.lang.reflect.Type type10 = genericArrayTypeImpl9.getGenericComponentType();
        com.google.gson.JsonPrimitive jsonPrimitive12 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) 100);
        long long13 = jsonPrimitive12.getAsLong();
        java.lang.Number number14 = jsonPrimitive12.getAsNumber();
        java.lang.Number number15 = jsonPrimitive12.getAsNumber();
        boolean boolean16 = genericArrayTypeImpl9.equals((java.lang.Object) jsonPrimitive12);
        com.google.gson.ObjectTypePair objectTypePair18 = new com.google.gson.ObjectTypePair(obj0, (java.lang.reflect.Type) genericArrayTypeImpl9, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray19 = com.google.gson.TypeInfoFactory.getTypeInfoForArray((java.lang.reflect.Type) genericArrayTypeImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (short) 100 + "'", number14, (short) 100);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (short) 100 + "'", number15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test15");
        com.google.gson.DefaultTypeAdapters.DoubleSerializer doubleSerializer1 = new com.google.gson.DefaultTypeAdapters.DoubleSerializer(false);
        com.google.gson.AnonymousAndLocalClassExclusionStrategy anonymousAndLocalClassExclusionStrategy3 = com.google.gson.Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY;
        com.google.gson.JavaFieldNamingPolicy javaFieldNamingPolicy4 = new com.google.gson.JavaFieldNamingPolicy();
        com.google.gson.ObjectNavigatorFactory objectNavigatorFactory5 = new com.google.gson.ObjectNavigatorFactory((com.google.gson.ExclusionStrategy) anonymousAndLocalClassExclusionStrategy3, (com.google.gson.FieldNamingStrategy2) javaFieldNamingPolicy4);
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type type8 = null;
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] { type8 };
        java.lang.reflect.Type type10 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl11 = new com.google.gson.ParameterizedTypeImpl(type7, typeArray9, type10);
        java.lang.annotation.Annotation[] annotationArray12 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList13 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList13, annotationArray12);
        java.lang.String str15 = javaFieldNamingPolicy4.translateName("hi!", (java.lang.reflect.Type) parameterizedTypeImpl11, (java.util.Collection<java.lang.annotation.Annotation>) annotationList13);
        com.google.gson.JsonSerializationContext jsonSerializationContext16 = null;
        com.google.gson.JsonElement jsonElement17 = doubleSerializer1.serialize((java.lang.Double) 10.0d, (java.lang.reflect.Type) parameterizedTypeImpl11, jsonSerializationContext16);
        java.lang.reflect.Type type19 = null;
        java.lang.reflect.Type type20 = null;
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { type20 };
        java.lang.reflect.Type type22 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl23 = new com.google.gson.ParameterizedTypeImpl(type19, typeArray21, type22);
        boolean boolean25 = parameterizedTypeImpl23.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type26 = parameterizedTypeImpl23.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl27 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl23);
        java.lang.reflect.Type type28 = genericArrayTypeImpl27.getGenericComponentType();
        boolean boolean29 = com.google.gson.TypeUtils.isArray(type28);
        com.google.gson.JsonSerializationContext jsonSerializationContext30 = null;
        com.google.gson.JsonElement jsonElement31 = doubleSerializer1.serialize((java.lang.Double) (-1.0d), type28, jsonSerializationContext30);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray32 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(anonymousAndLocalClassExclusionStrategy3);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(annotationArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonElement31);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test16");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        boolean boolean21 = jsonPrimitive19.isBoolean();
        short short22 = jsonPrimitive19.getAsShort();
        java.lang.Object obj23 = null;
        boolean boolean24 = jsonPrimitive19.equals(obj23);
        java.lang.Class<?> wildcardClass25 = jsonPrimitive19.getClass();
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 4 + "'", short22 == (short) 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test17");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.reflect.Type type4 = null;
        java.lang.reflect.Type type5 = null;
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { type5 };
        java.lang.reflect.Type type7 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl8 = new com.google.gson.ParameterizedTypeImpl(type4, typeArray6, type7);
        boolean boolean10 = parameterizedTypeImpl8.equals((java.lang.Object) (byte) -1);
        com.google.gson.CircularReferenceException circularReferenceException11 = new com.google.gson.CircularReferenceException((java.lang.Object) parameterizedTypeImpl8);
        com.google.gson.FieldAttributes fieldAttributes12 = null;
        java.lang.IllegalStateException illegalStateException13 = circularReferenceException11.createDetailedException(fieldAttributes12);
        java.lang.reflect.Type type14 = null;
        java.lang.reflect.Type type15 = null;
        java.lang.reflect.Type[] typeArray16 = new java.lang.reflect.Type[] { type15 };
        java.lang.reflect.Type type17 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl18 = new com.google.gson.ParameterizedTypeImpl(type14, typeArray16, type17);
        boolean boolean20 = parameterizedTypeImpl18.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type21 = parameterizedTypeImpl18.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl22 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl18);
        com.google.gson.stream.MalformedJsonException malformedJsonException25 = new com.google.gson.stream.MalformedJsonException("");
        com.google.gson.JsonParseException jsonParseException26 = new com.google.gson.JsonParseException("", (java.lang.Throwable) malformedJsonException25);
        boolean boolean27 = parameterizedTypeImpl18.equals((java.lang.Object) "");
        java.lang.reflect.Type[] typeArray28 = parameterizedTypeImpl18.getActualTypeArguments();
        java.lang.reflect.Type type29 = parameterizedTypeImpl18.getRawType();
        com.google.gson.JsonElement jsonElement30 = gson0.toJsonTree((java.lang.Object) fieldAttributes12, type29);
        com.google.gson.JsonElement jsonElement31 = null;
        java.lang.Appendable appendable32 = null;
        java.io.Writer writer33 = com.google.gson.Streams.writerForAppendable(appendable32);
        gson0.toJson(jsonElement31, appendable32);
        com.google.gson.AnonymousAndLocalClassExclusionStrategy anonymousAndLocalClassExclusionStrategy35 = com.google.gson.Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY;
        com.google.gson.JavaFieldNamingPolicy javaFieldNamingPolicy36 = new com.google.gson.JavaFieldNamingPolicy();
        com.google.gson.ObjectNavigatorFactory objectNavigatorFactory37 = new com.google.gson.ObjectNavigatorFactory((com.google.gson.ExclusionStrategy) anonymousAndLocalClassExclusionStrategy35, (com.google.gson.FieldNamingStrategy2) javaFieldNamingPolicy36);
        com.google.gson.FieldNamingStrategy2 fieldNamingStrategy2_38 = objectNavigatorFactory37.getFieldNamingPolicy();
        com.google.gson.JsonPrimitive jsonPrimitive40 = new com.google.gson.JsonPrimitive("100");
        java.lang.reflect.Type type41 = null;
        java.lang.reflect.Type type42 = null;
        java.lang.reflect.Type[] typeArray43 = new java.lang.reflect.Type[] { type42 };
        java.lang.reflect.Type type44 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl45 = new com.google.gson.ParameterizedTypeImpl(type41, typeArray43, type44);
        boolean boolean47 = parameterizedTypeImpl45.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type48 = parameterizedTypeImpl45.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl49 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl45);
        com.google.gson.ObjectTypePair objectTypePair51 = new com.google.gson.ObjectTypePair((java.lang.Object) "100", (java.lang.reflect.Type) parameterizedTypeImpl45, true);
        java.lang.reflect.Type type52 = objectTypePair51.type;
        com.google.gson.ObjectNavigator objectNavigator53 = objectNavigatorFactory37.create(objectTypePair51);
        com.google.gson.MemoryRefStack memoryRefStack54 = new com.google.gson.MemoryRefStack();
        com.google.gson.JsonPrimitive jsonPrimitive56 = new com.google.gson.JsonPrimitive("100");
        java.lang.reflect.Type type57 = null;
        java.lang.reflect.Type type58 = null;
        java.lang.reflect.Type[] typeArray59 = new java.lang.reflect.Type[] { type58 };
        java.lang.reflect.Type type60 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl61 = new com.google.gson.ParameterizedTypeImpl(type57, typeArray59, type60);
        boolean boolean63 = parameterizedTypeImpl61.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type64 = parameterizedTypeImpl61.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl65 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl61);
        com.google.gson.ObjectTypePair objectTypePair67 = new com.google.gson.ObjectTypePair((java.lang.Object) "100", (java.lang.reflect.Type) parameterizedTypeImpl61, true);
        com.google.gson.ObjectTypePair objectTypePair68 = objectTypePair67.toMoreSpecificType();
        com.google.gson.ObjectTypePair objectTypePair69 = memoryRefStack54.push(objectTypePair67);
        com.google.gson.ObjectNavigator objectNavigator70 = objectNavigatorFactory37.create(objectTypePair67);
        java.lang.Appendable appendable71 = null;
        java.io.Writer writer72 = com.google.gson.Streams.writerForAppendable(appendable71);
        java.io.Writer writer73 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer72);
        java.io.Writer writer74 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer72);
        com.google.gson.stream.JsonWriter jsonWriter75 = new com.google.gson.stream.JsonWriter(writer72);
        java.io.Writer writer76 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer72);
        java.io.Writer writer77 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer72);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) objectTypePair67, (java.lang.Appendable) writer77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(illegalStateException13);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(type21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNull(type29);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNotNull(writer33);
        org.junit.Assert.assertNotNull(anonymousAndLocalClassExclusionStrategy35);
        org.junit.Assert.assertNotNull(fieldNamingStrategy2_38);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(type48);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(objectNavigator53);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(type64);
        org.junit.Assert.assertNotNull(objectTypePair68);
        org.junit.Assert.assertNotNull(objectTypePair69);
        org.junit.Assert.assertNotNull(objectNavigator70);
        org.junit.Assert.assertNotNull(writer72);
        org.junit.Assert.assertNotNull(writer73);
        org.junit.Assert.assertNotNull(writer74);
        org.junit.Assert.assertNotNull(writer76);
        org.junit.Assert.assertNotNull(writer77);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test18");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = null;
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] { type1 };
        java.lang.reflect.Type type3 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl4 = new com.google.gson.ParameterizedTypeImpl(type0, typeArray2, type3);
        boolean boolean6 = parameterizedTypeImpl4.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type7 = parameterizedTypeImpl4.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl8 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl4);
        java.lang.reflect.Type type9 = genericArrayTypeImpl8.getGenericComponentType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray10 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(type7);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test19");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) "");
        com.google.gson.JsonObject jsonObject6 = new com.google.gson.JsonObject();
        jsonObject6.addProperty("com.google.gson.JsonSyntaxException: 100", (java.lang.Boolean) true);
        com.google.gson.JsonPrimitive jsonPrimitive11 = jsonObject6.getAsJsonPrimitive("com.google.gson.CircularReferenceException: circular reference error");
        java.lang.String str12 = gson0.toJson((java.lang.Object) "com.google.gson.CircularReferenceException: circular reference error");
        java.lang.Appendable appendable13 = null;
        java.io.Writer writer14 = com.google.gson.Streams.writerForAppendable(appendable13);
        java.io.Writer writer15 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer14);
        java.io.Writer writer16 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer14);
        com.google.gson.stream.JsonWriter jsonWriter17 = new com.google.gson.stream.JsonWriter(writer14);
        java.io.Writer writer18 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer14);
        java.io.Writer writer19 = com.google.gson.Streams.writerForAppendable((java.lang.Appendable) writer14);
        com.google.gson.stream.JsonWriter jsonWriter20 = new com.google.gson.stream.JsonWriter(writer19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = gson0.toJson((java.lang.Object) writer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: circular reference error?  Offending field: lock??  Offending object: preserveType: false, type: class java.lang.Object, obj: com.google.gson.Streams$AppendableWriter@5466e7d8");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNull(jsonPrimitive11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"com.google.gson.CircularReferenceException: circular reference error\"" + "'", str12, "\"com.google.gson.CircularReferenceException: circular reference error\"");
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(writer15);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(writer18);
        org.junit.Assert.assertNotNull(writer19);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test20");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        boolean boolean21 = jsonPrimitive19.isBoolean();
        short short22 = jsonPrimitive19.getAsShort();
        boolean boolean23 = jsonPrimitive19.isString();
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 4 + "'", short22 == (short) 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test21");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        boolean boolean21 = jsonPrimitive19.isBoolean();
        short short22 = jsonPrimitive19.getAsShort();
        java.lang.Object obj23 = null;
        boolean boolean24 = jsonPrimitive19.equals(obj23);
        com.google.gson.CircularReferenceException circularReferenceException25 = new com.google.gson.CircularReferenceException(obj23);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 4 + "'", short22 == (short) 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test22");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray18 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test23");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        com.google.gson.JsonPrimitive jsonPrimitive5 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) 100);
        long long6 = jsonPrimitive5.getAsLong();
        java.lang.String str7 = jsonPrimitive5.toString();
        boolean boolean8 = jsonPrimitive5.isJsonArray();
        java.lang.String str9 = gson0.toJson((com.google.gson.JsonElement) jsonPrimitive5);
        com.google.gson.LongSerializationPolicy longSerializationPolicy11 = null;
        com.google.gson.ParameterizedTypeHandlerMap<com.google.gson.JsonSerializer<?>> wildcardJsonSerializerParameterizedTypeHandlerMap12 = com.google.gson.DefaultTypeAdapters.getDefaultSerializers(false, longSerializationPolicy11);
        java.lang.String str13 = wildcardJsonSerializerParameterizedTypeHandlerMap12.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = gson0.toJson((java.lang.Object) wildcardJsonSerializerParameterizedTypeHandlerMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Expecting parameterized type, got class com.google.gson.ParameterizedTypeHandlerMap.? Are you missing the use of TypeToken idiom?? See http://sites.google.com/site/gson/gson-user-guide#TOC-Serializing-and-Deserializing-Gener");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertNotNull(wildcardJsonSerializerParameterizedTypeHandlerMap12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test24");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        gson0.toJson(obj1, appendable2);
        java.lang.String str4 = gson0.toString();
        java.lang.reflect.Type type6 = null;
        java.lang.reflect.Type type7 = null;
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] { type7 };
        java.lang.reflect.Type type9 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl10 = new com.google.gson.ParameterizedTypeImpl(type6, typeArray8, type9);
        boolean boolean12 = parameterizedTypeImpl10.equals((java.lang.Object) (byte) -1);
        java.lang.reflect.Type type13 = parameterizedTypeImpl10.getRawType();
        com.google.gson.GenericArrayTypeImpl genericArrayTypeImpl14 = new com.google.gson.GenericArrayTypeImpl((java.lang.reflect.Type) parameterizedTypeImpl10);
        java.lang.reflect.Type type15 = genericArrayTypeImpl14.getGenericComponentType();
        boolean boolean16 = com.google.gson.TypeUtils.isArray(type15);
        com.google.gson.MappedObjectConstructor mappedObjectConstructor17 = gson0.fromJson("", type15);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        java.lang.String str20 = gson0.toJson((java.lang.Object) jsonPrimitive19);
        java.lang.String str21 = gson0.toString();
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mappedObjectConstructor17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"value\":\"4\"}" + "'", str20, "{\"value\":\"4\"}");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test25");
        java.lang.reflect.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray1 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test26");
        com.google.gson.AnonymousAndLocalClassExclusionStrategy anonymousAndLocalClassExclusionStrategy0 = com.google.gson.Gson.DEFAULT_ANON_LOCAL_CLASS_EXCLUSION_STRATEGY;
        com.google.gson.JavaFieldNamingPolicy javaFieldNamingPolicy1 = new com.google.gson.JavaFieldNamingPolicy();
        com.google.gson.ObjectNavigatorFactory objectNavigatorFactory2 = new com.google.gson.ObjectNavigatorFactory((com.google.gson.ExclusionStrategy) anonymousAndLocalClassExclusionStrategy0, (com.google.gson.FieldNamingStrategy2) javaFieldNamingPolicy1);
        java.lang.reflect.Type type4 = null;
        java.lang.reflect.Type type5 = null;
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] { type5 };
        java.lang.reflect.Type type7 = null;
        com.google.gson.ParameterizedTypeImpl parameterizedTypeImpl8 = new com.google.gson.ParameterizedTypeImpl(type4, typeArray6, type7);
        java.lang.annotation.Annotation[] annotationArray9 = new java.lang.annotation.Annotation[] {};
        java.util.ArrayList<java.lang.annotation.Annotation> annotationList10 = new java.util.ArrayList<java.lang.annotation.Annotation>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.annotation.Annotation>) annotationList10, annotationArray9);
        java.lang.String str12 = javaFieldNamingPolicy1.translateName("hi!", (java.lang.reflect.Type) parameterizedTypeImpl8, (java.util.Collection<java.lang.annotation.Annotation>) annotationList10);
        java.lang.Object obj13 = null;
        boolean boolean14 = parameterizedTypeImpl8.equals(obj13);
        java.lang.reflect.Type type15 = parameterizedTypeImpl8.getRawType();
        java.lang.reflect.Type[] typeArray16 = parameterizedTypeImpl8.getActualTypeArguments();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfoArray typeInfoArray17 = com.google.gson.TypeInfoFactory.getTypeInfoForArray((java.lang.reflect.Type) parameterizedTypeImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition failed: false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(anonymousAndLocalClassExclusionStrategy0);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(annotationArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test27");
        java.lang.reflect.Field field0 = null;
        java.lang.reflect.Type type1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeInfo typeInfo2 = com.google.gson.TypeInfoFactory.getTypeInfoForField(field0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type 'null' is not a Class, ParameterizedType, or GenericArrayType. Can't extract class.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

