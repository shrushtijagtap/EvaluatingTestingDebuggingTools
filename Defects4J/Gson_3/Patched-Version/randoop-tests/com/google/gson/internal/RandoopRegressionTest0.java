package com.google.gson.internal;

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
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.stream.JsonReader jsonReader1 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException3 = new com.google.gson.stream.MalformedJsonException("");
        java.lang.Throwable[] throwableArray4 = malformedJsonException3.getSuppressed();
        java.lang.Class<?> wildcardClass5 = malformedJsonException3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException iOException6 = gson0.fromJson(jsonReader1, (java.lang.reflect.Type) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test02");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonArray jsonArray1 = new com.google.gson.JsonArray();
        int int2 = jsonArray1.size();
        int int3 = jsonArray1.size();
        jsonArray1.add((java.lang.Character) 'a');
        com.google.gson.JsonObject jsonObject6 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive8 = jsonObject6.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable9 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException10 = new com.google.gson.stream.MalformedJsonException(throwable9);
        java.lang.Throwable throwable11 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException12 = new com.google.gson.stream.MalformedJsonException(throwable11);
        malformedJsonException10.addSuppressed((java.lang.Throwable) malformedJsonException12);
        boolean boolean14 = jsonObject6.equals((java.lang.Object) malformedJsonException12);
        jsonObject6.addProperty("$", (java.lang.Boolean) true);
        boolean boolean18 = jsonArray1.remove((com.google.gson.JsonElement) jsonObject6);
        com.google.gson.JsonElement jsonElement20 = jsonObject6.get("JsonTreeReader");
        com.google.gson.stream.MalformedJsonException malformedJsonException22 = new com.google.gson.stream.MalformedJsonException("");
        java.lang.Throwable[] throwableArray23 = malformedJsonException22.getSuppressed();
        java.lang.Class<?> wildcardClass24 = malformedJsonException22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement25 = gson0.toJsonTree((java.lang.Object) "JsonTreeReader", (java.lang.reflect.Type) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not set java.lang.String field java.lang.Throwable.detailMessage to java.lang.String");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(jsonPrimitive8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonElement20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test03");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = throwableArrayArrayTypeAdapter3.fromJson(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test04");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.Gson gson4 = new com.google.gson.Gson();
        java.lang.Appendable appendable5 = null;
        java.io.Writer writer6 = com.google.gson.internal.Streams.writerForAppendable(appendable5);
        com.google.gson.stream.JsonWriter jsonWriter7 = new com.google.gson.stream.JsonWriter(writer6);
        com.google.gson.stream.JsonWriter jsonWriter8 = gson4.newJsonWriter(writer6);
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        // The following exception was thrown during execution in test generation
        try {
            throwableArrayArrayTypeAdapter3.toJson(writer6, (java.lang.Object) jsonNull9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer6);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test05");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.JsonArray jsonArray4 = new com.google.gson.JsonArray();
        int int5 = jsonArray4.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader6 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray4);
        jsonTreeReader6.setLenient(true);
        com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader6.peek();
        com.google.gson.JsonElement jsonElement10 = gson0.toJsonTree((java.lang.Object) jsonToken9);
        com.google.gson.JsonObject jsonObject11 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull13 = new com.google.gson.JsonNull();
        jsonObject11.add("", (com.google.gson.JsonElement) jsonNull13);
        boolean boolean15 = jsonObject11.isJsonArray();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter16 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter18 = jsonTreeWriter16.value((java.lang.Number) (byte) -1);
        boolean boolean19 = jsonTreeWriter16.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter16.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter16.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter24 = jsonTreeWriter16.value((long) (short) 10);
        com.google.gson.JsonElement jsonElement25 = jsonTreeWriter16.get();
        com.google.gson.stream.JsonWriter jsonWriter26 = jsonTreeWriter16.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonObject11, jsonWriter26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken9 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_ARRAY + "'", jsonToken9.equals(com.google.gson.stream.JsonToken.BEGIN_ARRAY));
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonWriter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonWriter22);
        org.junit.Assert.assertNotNull(jsonWriter24);
        org.junit.Assert.assertNotNull(jsonElement25);
        org.junit.Assert.assertNotNull(jsonWriter26);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test06");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.JsonArray jsonArray4 = new com.google.gson.JsonArray();
        int int5 = jsonArray4.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader6 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray4);
        jsonTreeReader6.setLenient(true);
        com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader6.peek();
        com.google.gson.JsonElement jsonElement10 = gson0.toJsonTree((java.lang.Object) jsonToken9);
        java.lang.Object obj11 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException13 = new com.google.gson.stream.MalformedJsonException("");
        java.lang.Throwable[] throwableArray14 = malformedJsonException13.getSuppressed();
        java.lang.Class<?> wildcardClass15 = malformedJsonException13.getClass();
        com.google.gson.reflect.TypeToken<?> wildcardTypeToken16 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) wildcardClass15);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter17 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter17.value(true);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.value("");
        com.google.gson.stream.JsonWriter jsonWriter23 = jsonWriter19.value("");
        com.google.gson.stream.JsonWriter jsonWriter24 = jsonWriter19.beginObject();
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson(obj11, (java.lang.reflect.Type) wildcardClass15, jsonWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken9 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_ARRAY + "'", jsonToken9.equals(com.google.gson.stream.JsonToken.BEGIN_ARRAY));
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardTypeToken16);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonWriter23);
        org.junit.Assert.assertNotNull(jsonWriter24);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test07");
        com.google.gson.internal.bind.SqlDateTypeAdapter sqlDateTypeAdapter0 = new com.google.gson.internal.bind.SqlDateTypeAdapter();
        com.google.gson.TypeAdapter<java.sql.Date> dateTypeAdapter1 = sqlDateTypeAdapter0.nullSafe();
        com.google.gson.Gson gson2 = null;
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter3 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass4 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter5 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson2, throwableArrayTypeAdapter3, throwableArrayClass4);
        java.lang.Object obj6 = null;
        com.google.gson.JsonElement jsonElement7 = throwableArrayArrayTypeAdapter5.toJsonTree(obj6);
        java.sql.Date date8 = sqlDateTypeAdapter0.fromJsonTree(jsonElement7);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter9 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter9.value(true);
        jsonTreeWriter9.setSerializeNulls(true);
        boolean boolean14 = jsonTreeWriter9.getSerializeNulls();
        java.sql.Date date15 = null;
        sqlDateTypeAdapter0.write((com.google.gson.stream.JsonWriter) jsonTreeWriter9, date15);
        java.sql.Date date17 = null;
        com.google.gson.JsonElement jsonElement18 = sqlDateTypeAdapter0.toJsonTree(date17);
        com.google.gson.Gson gson19 = new com.google.gson.Gson();
        java.lang.Appendable appendable20 = null;
        java.io.Writer writer21 = com.google.gson.internal.Streams.writerForAppendable(appendable20);
        com.google.gson.stream.JsonWriter jsonWriter22 = new com.google.gson.stream.JsonWriter(writer21);
        com.google.gson.stream.JsonWriter jsonWriter23 = gson19.newJsonWriter(writer21);
        java.sql.Date date24 = null;
        // The following exception was thrown during execution in test generation
        try {
            sqlDateTypeAdapter0.write(jsonWriter23, date24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JSON must start with an array or an object.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNotNull(writer21);
        org.junit.Assert.assertNotNull(jsonWriter23);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test08");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder3 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder4 = excluder3.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder6 = excluder3.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder8 = excluder6.withVersion((double) (byte) 0);
        java.lang.String str9 = gson2.toJson((java.lang.Object) excluder6);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder6);
        java.lang.reflect.Field field11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reflectiveTypeAdapterFactory10.excludeField(field11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str9, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test09");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.JsonObject jsonObject4 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive6 = jsonObject4.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable7 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException8 = new com.google.gson.stream.MalformedJsonException(throwable7);
        java.lang.Throwable throwable9 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException10 = new com.google.gson.stream.MalformedJsonException(throwable9);
        malformedJsonException8.addSuppressed((java.lang.Throwable) malformedJsonException10);
        boolean boolean12 = jsonObject4.equals((java.lang.Object) malformedJsonException10);
        jsonObject4.addProperty("$", (java.lang.Boolean) true);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader16 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = throwableArrayArrayTypeAdapter3.toJson((java.lang.Object) jsonTreeReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(jsonPrimitive6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test10");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        boolean boolean24 = jsonNull9.isJsonNull();
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test11");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder3 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder4 = excluder3.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder6 = excluder3.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder8 = excluder6.withVersion((double) (byte) 0);
        java.lang.String str9 = gson2.toJson((java.lang.Object) excluder6);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder6);
        java.lang.reflect.Field field11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = fieldNamingPolicy1.translateName(field11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str9, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test12");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        // The following exception was thrown during execution in test generation
        try {
            byte byte24 = jsonNull9.getAsByte();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNull");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test13");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        com.google.gson.JsonObject jsonObject24 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive26 = jsonObject24.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable27 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException28 = new com.google.gson.stream.MalformedJsonException(throwable27);
        java.lang.Throwable throwable29 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException30 = new com.google.gson.stream.MalformedJsonException(throwable29);
        malformedJsonException28.addSuppressed((java.lang.Throwable) malformedJsonException30);
        boolean boolean32 = jsonObject24.equals((java.lang.Object) malformedJsonException30);
        com.google.gson.JsonObject jsonObject34 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull36 = new com.google.gson.JsonNull();
        jsonObject34.add("", (com.google.gson.JsonElement) jsonNull36);
        jsonObject24.add("{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}", (com.google.gson.JsonElement) jsonObject34);
        jsonObject34.addProperty("", (java.lang.Character) '#');
        java.lang.String str42 = gson0.toJson((java.lang.Object) jsonObject34);
        com.google.gson.internal.bind.SqlDateTypeAdapter sqlDateTypeAdapter43 = new com.google.gson.internal.bind.SqlDateTypeAdapter();
        com.google.gson.TypeAdapter<java.sql.Date> dateTypeAdapter44 = sqlDateTypeAdapter43.nullSafe();
        com.google.gson.Gson gson45 = null;
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter46 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass47 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter48 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson45, throwableArrayTypeAdapter46, throwableArrayClass47);
        java.lang.Object obj49 = null;
        com.google.gson.JsonElement jsonElement50 = throwableArrayArrayTypeAdapter48.toJsonTree(obj49);
        java.sql.Date date51 = sqlDateTypeAdapter43.fromJsonTree(jsonElement50);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter52 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter54 = jsonTreeWriter52.value(true);
        jsonTreeWriter52.setSerializeNulls(true);
        boolean boolean57 = jsonTreeWriter52.getSerializeNulls();
        java.sql.Date date58 = null;
        sqlDateTypeAdapter43.write((com.google.gson.stream.JsonWriter) jsonTreeWriter52, date58);
        com.google.gson.Gson gson60 = null;
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter61 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass62 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter63 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson60, throwableArrayTypeAdapter61, throwableArrayClass62);
        java.lang.Object obj64 = null;
        com.google.gson.JsonElement jsonElement65 = throwableArrayArrayTypeAdapter63.toJsonTree(obj64);
        com.google.gson.JsonObject jsonObject66 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull68 = new com.google.gson.JsonNull();
        jsonObject66.add("", (com.google.gson.JsonElement) jsonNull68);
        java.lang.String str70 = jsonNull68.toString();
        com.google.gson.JsonNull jsonNull71 = jsonNull68.getAsJsonNull();
        boolean boolean72 = jsonNull71.isJsonPrimitive();
        java.lang.Object obj73 = throwableArrayArrayTypeAdapter63.fromJsonTree((com.google.gson.JsonElement) jsonNull71);
        java.sql.Date date74 = sqlDateTypeAdapter43.fromJsonTree((com.google.gson.JsonElement) jsonNull71);
        com.google.gson.stream.JsonWriter jsonWriter75 = null;
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonNull71, jsonWriter75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNull(jsonPrimitive26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{\"\":\"#\"}" + "'", str42, "{\"\":\"#\"}");
        org.junit.Assert.assertNotNull(dateTypeAdapter44);
        org.junit.Assert.assertNotNull(jsonElement50);
        org.junit.Assert.assertNull(date51);
        org.junit.Assert.assertNotNull(jsonWriter54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jsonElement65);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "null" + "'", str70, "null");
        org.junit.Assert.assertNotNull(jsonNull71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(date74);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test14");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonObject jsonObject9 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive11 = jsonObject9.getAsJsonPrimitive("hi!");
        jsonObject9.addProperty("hi!", "");
        com.google.gson.JsonObject jsonObject16 = jsonObject9.getAsJsonObject("com.google.gson.stream.MalformedJsonException");
        com.google.gson.JsonElement jsonElement18 = jsonObject9.remove("hi!");
        java.lang.String str19 = gson0.toJson(jsonElement18);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger20 = jsonElement18.getAsBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNull(jsonPrimitive11);
        org.junit.Assert.assertNull(jsonObject16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test15");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.JsonArray jsonArray4 = new com.google.gson.JsonArray();
        int int5 = jsonArray4.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader6 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray4);
        jsonTreeReader6.setLenient(true);
        com.google.gson.stream.JsonToken jsonToken9 = jsonTreeReader6.peek();
        com.google.gson.JsonElement jsonElement10 = gson0.toJsonTree((java.lang.Object) jsonToken9);
        com.google.gson.internal.bind.SqlDateTypeAdapter sqlDateTypeAdapter11 = new com.google.gson.internal.bind.SqlDateTypeAdapter();
        com.google.gson.TypeAdapter<java.sql.Date> dateTypeAdapter12 = sqlDateTypeAdapter11.nullSafe();
        com.google.gson.Gson gson13 = null;
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter14 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass15 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter16 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson13, throwableArrayTypeAdapter14, throwableArrayClass15);
        java.lang.Object obj17 = null;
        com.google.gson.JsonElement jsonElement18 = throwableArrayArrayTypeAdapter16.toJsonTree(obj17);
        java.sql.Date date19 = sqlDateTypeAdapter11.fromJsonTree(jsonElement18);
        java.sql.Date date20 = null;
        com.google.gson.JsonElement jsonElement21 = sqlDateTypeAdapter11.toJsonTree(date20);
        java.lang.Appendable appendable22 = null;
        java.io.Writer writer23 = com.google.gson.internal.Streams.writerForAppendable(appendable22);
        java.io.Writer writer24 = com.google.gson.internal.Streams.writerForAppendable(appendable22);
        java.io.Writer writer25 = com.google.gson.internal.Streams.writerForAppendable((java.lang.Appendable) writer24);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson(jsonElement21, (java.lang.Appendable) writer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken9 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_ARRAY + "'", jsonToken9.equals(com.google.gson.stream.JsonToken.BEGIN_ARRAY));
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(dateTypeAdapter12);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(writer24);
        org.junit.Assert.assertNotNull(writer25);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test16");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonObject jsonObject9 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive11 = jsonObject9.getAsJsonPrimitive("hi!");
        jsonObject9.addProperty("hi!", "");
        com.google.gson.JsonObject jsonObject16 = jsonObject9.getAsJsonObject("com.google.gson.stream.MalformedJsonException");
        com.google.gson.JsonElement jsonElement18 = jsonObject9.remove("hi!");
        java.lang.String str19 = gson0.toJson(jsonElement18);
        // The following exception was thrown during execution in test generation
        try {
            char char20 = jsonElement18.getAsCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNull(jsonPrimitive11);
        org.junit.Assert.assertNull(jsonObject16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test17");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.JsonElement jsonElement4 = null;
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter5 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter5.value(true);
        jsonTreeWriter5.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter5.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((long) ' ');
        jsonWriter13.setSerializeNulls(true);
        gson0.toJson(jsonElement4, jsonWriter13);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter18 = gson0.newJsonWriter(writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test18");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.FLOAT;
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter1 = numberTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter2 = numberTypeAdapter0.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter3 = numberTypeAdapter0.nullSafe();
        com.google.gson.Gson gson4 = new com.google.gson.Gson();
        java.lang.Appendable appendable5 = null;
        java.io.Writer writer6 = com.google.gson.internal.Streams.writerForAppendable(appendable5);
        com.google.gson.stream.JsonWriter jsonWriter7 = new com.google.gson.stream.JsonWriter(writer6);
        com.google.gson.stream.JsonWriter jsonWriter8 = gson4.newJsonWriter(writer6);
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberTypeAdapter0.toJson(writer6, number9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JSON must start with an array or an object.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(numberTypeAdapter1);
        org.junit.Assert.assertNotNull(numberTypeAdapter2);
        org.junit.Assert.assertNotNull(numberTypeAdapter3);
        org.junit.Assert.assertNotNull(writer6);
        org.junit.Assert.assertNotNull(jsonWriter8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test19");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        com.google.gson.JsonSyntaxException jsonSyntaxException25 = new com.google.gson.JsonSyntaxException("{\"$\":true}");
        java.lang.Appendable appendable26 = null;
        java.io.Writer writer27 = com.google.gson.internal.Streams.writerForAppendable(appendable26);
        com.google.gson.stream.JsonWriter jsonWriter28 = new com.google.gson.stream.JsonWriter(writer27);
        java.io.Writer writer29 = com.google.gson.internal.Streams.writerForAppendable((java.lang.Appendable) writer27);
        com.google.gson.stream.JsonWriter jsonWriter30 = new com.google.gson.stream.JsonWriter(writer29);
        java.io.Writer writer31 = com.google.gson.internal.Streams.writerForAppendable((java.lang.Appendable) writer29);
        java.io.Writer writer32 = com.google.gson.internal.Streams.writerForAppendable((java.lang.Appendable) writer29);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) "{\"$\":true}", (java.lang.Appendable) writer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNotNull(writer27);
        org.junit.Assert.assertNotNull(writer29);
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertNotNull(writer32);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test20");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder3 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder4 = excluder3.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder6 = excluder3.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder8 = excluder6.withVersion((double) (byte) 0);
        java.lang.String str9 = gson2.toJson((java.lang.Object) excluder6);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder6);
        com.google.gson.ExclusionStrategy exclusionStrategy11 = null;
        com.google.gson.internal.Excluder excluder14 = excluder6.withExclusionStrategy(exclusionStrategy11, true, true);
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str9, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNotNull(excluder14);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test21");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        com.google.gson.JsonObject jsonObject24 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive26 = jsonObject24.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable27 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException28 = new com.google.gson.stream.MalformedJsonException(throwable27);
        java.lang.Throwable throwable29 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException30 = new com.google.gson.stream.MalformedJsonException(throwable29);
        malformedJsonException28.addSuppressed((java.lang.Throwable) malformedJsonException30);
        boolean boolean32 = jsonObject24.equals((java.lang.Object) malformedJsonException30);
        com.google.gson.JsonObject jsonObject34 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull36 = new com.google.gson.JsonNull();
        jsonObject34.add("", (com.google.gson.JsonElement) jsonNull36);
        jsonObject24.add("{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}", (com.google.gson.JsonElement) jsonObject34);
        jsonObject34.addProperty("", (java.lang.Character) '#');
        java.lang.String str42 = gson0.toJson((java.lang.Object) jsonObject34);
        com.google.gson.JsonPrimitive jsonPrimitive44 = jsonObject34.getAsJsonPrimitive("{\"hi!\":\"\",\"$\":\" \"}");
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNull(jsonPrimitive26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{\"\":\"#\"}" + "'", str42, "{\"\":\"#\"}");
        org.junit.Assert.assertNull(jsonPrimitive44);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test22");
        com.google.gson.internal.bind.TimeTypeAdapter timeTypeAdapter0 = new com.google.gson.internal.bind.TimeTypeAdapter();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter1 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter3 = jsonTreeWriter1.value(true);
        jsonTreeWriter1.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter1.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter1.value(false);
        java.sql.Time time10 = null;
        timeTypeAdapter0.write(jsonWriter9, time10);
        com.google.gson.TypeAdapter<java.sql.Time> timeTypeAdapter12 = timeTypeAdapter0.nullSafe();
        com.google.gson.Gson gson13 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder14 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder15 = excluder14.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder17 = excluder14.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder19 = excluder17.withVersion((double) (byte) 0);
        java.lang.String str20 = gson13.toJson((java.lang.Object) excluder17);
        java.lang.String str21 = gson13.toString();
        com.google.gson.JsonObject jsonObject22 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive24 = jsonObject22.getAsJsonPrimitive("hi!");
        jsonObject22.addProperty("hi!", "");
        com.google.gson.JsonObject jsonObject29 = jsonObject22.getAsJsonObject("com.google.gson.stream.MalformedJsonException");
        com.google.gson.JsonElement jsonElement31 = jsonObject22.remove("hi!");
        java.lang.String str32 = gson13.toJson(jsonElement31);
        // The following exception was thrown during execution in test generation
        try {
            java.sql.Time time33 = timeTypeAdapter12.fromJsonTree(jsonElement31);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.text.ParseException: Unparseable date: \"\"");
        } catch (com.google.gson.JsonSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter3);
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(timeTypeAdapter12);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertNotNull(excluder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str20, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNull(jsonPrimitive24);
        org.junit.Assert.assertNull(jsonObject29);
        org.junit.Assert.assertNotNull(jsonElement31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test23");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.String str1 = gson0.toString();
        com.google.gson.stream.JsonToken jsonToken2 = com.google.gson.stream.JsonToken.END_OBJECT;
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonToken2);
        org.junit.Assert.assertTrue("'" + jsonToken2 + "' != '" + com.google.gson.stream.JsonToken.END_OBJECT + "'", jsonToken2.equals(com.google.gson.stream.JsonToken.END_OBJECT));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"END_OBJECT\"" + "'", str3, "\"END_OBJECT\"");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test24");
        com.google.gson.JsonObject jsonObject0 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive2 = jsonObject0.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable3 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException4 = new com.google.gson.stream.MalformedJsonException(throwable3);
        java.lang.Throwable throwable5 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException6 = new com.google.gson.stream.MalformedJsonException(throwable5);
        malformedJsonException4.addSuppressed((java.lang.Throwable) malformedJsonException6);
        boolean boolean8 = jsonObject0.equals((java.lang.Object) malformedJsonException6);
        jsonObject0.addProperty("$", (java.lang.Boolean) true);
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> strEntrySet12 = jsonObject0.entrySet();
        com.google.gson.Gson gson13 = new com.google.gson.Gson();
        java.lang.Appendable appendable14 = null;
        java.io.Writer writer15 = com.google.gson.internal.Streams.writerForAppendable(appendable14);
        com.google.gson.stream.JsonWriter jsonWriter16 = new com.google.gson.stream.JsonWriter(writer15);
        com.google.gson.stream.JsonWriter jsonWriter17 = gson13.newJsonWriter(writer15);
        jsonWriter17.setIndent("{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        boolean boolean20 = jsonObject0.equals((java.lang.Object) "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        jsonObject0.addProperty("? super com.google.gson.stream.MalformedJsonException", (java.lang.Character) 'a');
        org.junit.Assert.assertNull(jsonPrimitive2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strEntrySet12);
        org.junit.Assert.assertNotNull(writer15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test25");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.String str1 = gson0.toString();
        com.google.gson.JsonObject jsonObject2 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive4 = jsonObject2.getAsJsonPrimitive("hi!");
        com.google.gson.JsonArray jsonArray6 = jsonObject2.getAsJsonArray("{\"$\":true}");
        java.lang.String str7 = gson0.toJson((java.lang.Object) jsonArray6);
        com.google.gson.JsonArray jsonArray8 = new com.google.gson.JsonArray();
        int int9 = jsonArray8.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader10 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray8);
        com.google.gson.JsonPrimitive jsonPrimitive12 = new com.google.gson.JsonPrimitive((java.lang.Boolean) false);
        boolean boolean13 = jsonArray8.remove((com.google.gson.JsonElement) jsonPrimitive12);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter14 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter14.value((java.lang.Number) (byte) -1);
        boolean boolean17 = jsonTreeWriter14.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter14.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter20 = jsonTreeWriter14.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter14.value((long) (short) 10);
        com.google.gson.JsonElement jsonElement23 = jsonTreeWriter14.get();
        boolean boolean24 = jsonArray8.contains(jsonElement23);
        com.google.gson.stream.JsonWriter jsonWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonArray8, jsonWriter25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(jsonPrimitive4);
        org.junit.Assert.assertNull(jsonArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonWriter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter20);
        org.junit.Assert.assertNotNull(jsonWriter22);
        org.junit.Assert.assertNotNull(jsonElement23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test26");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        com.google.gson.JsonObject jsonObject24 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive26 = jsonObject24.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable27 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException28 = new com.google.gson.stream.MalformedJsonException(throwable27);
        java.lang.Throwable throwable29 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException30 = new com.google.gson.stream.MalformedJsonException(throwable29);
        malformedJsonException28.addSuppressed((java.lang.Throwable) malformedJsonException30);
        boolean boolean32 = jsonObject24.equals((java.lang.Object) malformedJsonException30);
        com.google.gson.JsonObject jsonObject34 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull36 = new com.google.gson.JsonNull();
        jsonObject34.add("", (com.google.gson.JsonElement) jsonNull36);
        jsonObject24.add("{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}", (com.google.gson.JsonElement) jsonObject34);
        jsonObject34.addProperty("", (java.lang.Character) '#');
        java.lang.String str42 = gson0.toJson((java.lang.Object) jsonObject34);
        // The following exception was thrown during execution in test generation
        try {
            float float43 = jsonObject34.getAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonObject");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNull(jsonPrimitive26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{\"\":\"#\"}" + "'", str42, "{\"\":\"#\"}");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test27");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter4 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter4.value((java.lang.Number) (byte) -1);
        boolean boolean7 = jsonTreeWriter4.getSerializeNulls();
        com.google.gson.stream.JsonWriter jsonWriter9 = jsonTreeWriter4.value((double) 'a');
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter4.nullValue();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter4.value((long) (short) 10);
        jsonTreeWriter4.setLenient(true);
        com.google.gson.JsonElement jsonElement15 = jsonTreeWriter4.get();
        java.lang.Throwable throwable18 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException19 = new com.google.gson.stream.MalformedJsonException(throwable18);
        com.google.gson.JsonIOException jsonIOException20 = new com.google.gson.JsonIOException("? super com.google.gson.stream.MalformedJsonException", throwable18);
        com.google.gson.stream.MalformedJsonException malformedJsonException21 = new com.google.gson.stream.MalformedJsonException("null", (java.lang.Throwable) jsonIOException20);
        // The following exception was thrown during execution in test generation
        try {
            throwableArrayArrayTypeAdapter3.write((com.google.gson.stream.JsonWriter) jsonTreeWriter4, (java.lang.Object) jsonIOException20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonWriter9);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonElement15);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test28");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        com.google.gson.JsonObject jsonObject24 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive26 = jsonObject24.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable27 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException28 = new com.google.gson.stream.MalformedJsonException(throwable27);
        java.lang.Throwable throwable29 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException30 = new com.google.gson.stream.MalformedJsonException(throwable29);
        malformedJsonException28.addSuppressed((java.lang.Throwable) malformedJsonException30);
        boolean boolean32 = jsonObject24.equals((java.lang.Object) malformedJsonException30);
        com.google.gson.JsonObject jsonObject34 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull36 = new com.google.gson.JsonNull();
        jsonObject34.add("", (com.google.gson.JsonElement) jsonNull36);
        jsonObject24.add("{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}", (com.google.gson.JsonElement) jsonObject34);
        jsonObject34.addProperty("", (java.lang.Character) '#');
        java.lang.String str42 = gson0.toJson((java.lang.Object) jsonObject34);
        com.google.gson.JsonElement jsonElement44 = jsonObject34.remove("{\"\":\"a\"}");
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNull(jsonPrimitive26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{\"\":\"#\"}" + "'", str42, "{\"\":\"#\"}");
        org.junit.Assert.assertNull(jsonElement44);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test29");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        com.google.gson.JsonObject jsonObject24 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive26 = jsonObject24.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable27 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException28 = new com.google.gson.stream.MalformedJsonException(throwable27);
        java.lang.Throwable throwable29 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException30 = new com.google.gson.stream.MalformedJsonException(throwable29);
        malformedJsonException28.addSuppressed((java.lang.Throwable) malformedJsonException30);
        boolean boolean32 = jsonObject24.equals((java.lang.Object) malformedJsonException30);
        com.google.gson.JsonObject jsonObject34 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull36 = new com.google.gson.JsonNull();
        jsonObject34.add("", (com.google.gson.JsonElement) jsonNull36);
        jsonObject24.add("{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}", (com.google.gson.JsonElement) jsonObject34);
        jsonObject34.addProperty("", (java.lang.Character) '#');
        java.lang.String str42 = gson0.toJson((java.lang.Object) jsonObject34);
        java.lang.String str43 = gson0.toString();
        com.google.gson.JsonObject jsonObject44 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive46 = jsonObject44.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable47 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException48 = new com.google.gson.stream.MalformedJsonException(throwable47);
        java.lang.Throwable throwable49 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException50 = new com.google.gson.stream.MalformedJsonException(throwable49);
        malformedJsonException48.addSuppressed((java.lang.Throwable) malformedJsonException50);
        boolean boolean52 = jsonObject44.equals((java.lang.Object) malformedJsonException50);
        jsonObject44.addProperty("$", (java.lang.Boolean) true);
        java.lang.String str56 = jsonObject44.toString();
        com.google.gson.JsonElement jsonElement58 = jsonObject44.get("JsonTreeReader");
        jsonObject44.addProperty("0.0", (java.lang.Boolean) false);
        com.google.gson.JsonObject jsonObject63 = jsonObject44.getAsJsonObject("{\"calls\":{\"threadLocalHashCode\":-1753537387},\"typeTokenCache\":{\"com.google.gson.JsonNull\":{}},\"factories\":[null,null,{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]},null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,{\"constructorConstructor\":{\"instanceCreators\":{}}},{\"constructorConstructor\":{\"instanceCreators\":{}},\"complexMapKeySerialization\":false},{\"constructorConstructor\":{\"instanceCreators\":{}}},null,{\"constructorConstructor\":{\"instanceCreators\":{}},\"fieldNamingPolicy\":\"IDENTITY\",\"excluder\":{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}}],\"constructorConstructor\":{\"instanceCreators\":{}},\"serializeNulls\":false,\"htmlSafe\":true,\"generateNonExecutableJson\":false,\"prettyPrinting\":false}");
        com.google.gson.JsonElement jsonElement64 = gson0.toJsonTree((java.lang.Object) jsonObject44);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNull(jsonPrimitive26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{\"\":\"#\"}" + "'", str42, "{\"\":\"#\"}");
        org.junit.Assert.assertNull(jsonPrimitive46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "{\"$\":true}" + "'", str56, "{\"$\":true}");
        org.junit.Assert.assertNull(jsonElement58);
        org.junit.Assert.assertNull(jsonObject63);
        org.junit.Assert.assertNotNull(jsonElement64);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test30");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonObject jsonObject9 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull11 = new com.google.gson.JsonNull();
        jsonObject9.add("", (com.google.gson.JsonElement) jsonNull11);
        java.lang.String str13 = jsonNull11.toString();
        com.google.gson.JsonNull jsonNull14 = jsonNull11.getAsJsonNull();
        boolean boolean15 = jsonNull14.isJsonPrimitive();
        java.lang.reflect.Type type16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = gson0.fromJson((com.google.gson.JsonElement) jsonNull14, type16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertNotNull(jsonNull14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test31");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter4 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter4.value(true);
        jsonTreeWriter4.setSerializeNulls(true);
        boolean boolean9 = jsonTreeWriter4.getSerializeNulls();
        com.google.gson.JsonPrimitive jsonPrimitive11 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) -1);
        boolean boolean12 = jsonPrimitive11.isString();
        boolean boolean14 = jsonPrimitive11.equals((java.lang.Object) "JsonTreeReader");
        double double15 = jsonPrimitive11.getAsDouble();
        long long16 = jsonPrimitive11.getAsLong();
        java.math.BigInteger bigInteger17 = jsonPrimitive11.getAsBigInteger();
        // The following exception was thrown during execution in test generation
        try {
            throwableArrayArrayTypeAdapter3.write((com.google.gson.stream.JsonWriter) jsonTreeWriter4, (java.lang.Object) bigInteger17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger17);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test32");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        com.google.gson.JsonObject jsonObject24 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive26 = jsonObject24.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable27 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException28 = new com.google.gson.stream.MalformedJsonException(throwable27);
        java.lang.Throwable throwable29 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException30 = new com.google.gson.stream.MalformedJsonException(throwable29);
        malformedJsonException28.addSuppressed((java.lang.Throwable) malformedJsonException30);
        boolean boolean32 = jsonObject24.equals((java.lang.Object) malformedJsonException30);
        com.google.gson.JsonObject jsonObject34 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull36 = new com.google.gson.JsonNull();
        jsonObject34.add("", (com.google.gson.JsonElement) jsonNull36);
        jsonObject24.add("{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}", (com.google.gson.JsonElement) jsonObject34);
        jsonObject34.addProperty("", (java.lang.Character) '#');
        java.lang.String str42 = gson0.toJson((java.lang.Object) jsonObject34);
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter43 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass44 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter45 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter43, throwableArrayClass44);
        java.lang.Object obj46 = null;
        com.google.gson.JsonElement jsonElement47 = throwableArrayArrayTypeAdapter45.toJsonTree(obj46);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNull(jsonPrimitive26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{\"\":\"#\"}" + "'", str42, "{\"\":\"#\"}");
        org.junit.Assert.assertNotNull(jsonElement47);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test33");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        java.lang.Object obj24 = null;
        boolean boolean25 = jsonNull9.equals(obj24);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test34");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.String str1 = gson0.toString();
        java.lang.String str2 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter3 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass4 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter5 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter3, throwableArrayClass4);
        com.google.gson.JsonParseException jsonParseException8 = new com.google.gson.JsonParseException("com.google.gson.stream.MalformedJsonException");
        com.google.gson.JsonSyntaxException jsonSyntaxException9 = new com.google.gson.JsonSyntaxException("", (java.lang.Throwable) jsonParseException8);
        com.google.gson.stream.MalformedJsonException malformedJsonException10 = new com.google.gson.stream.MalformedJsonException((java.lang.Throwable) jsonParseException8);
        java.lang.Throwable[] throwableArray11 = malformedJsonException10.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = throwableArrayArrayTypeAdapter5.toJson((java.lang.Object) malformedJsonException10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test35");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonObject jsonObject9 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive11 = jsonObject9.getAsJsonPrimitive("hi!");
        jsonObject9.addProperty("hi!", "");
        com.google.gson.JsonObject jsonObject16 = jsonObject9.getAsJsonObject("com.google.gson.stream.MalformedJsonException");
        com.google.gson.JsonElement jsonElement18 = jsonObject9.remove("hi!");
        java.lang.String str19 = gson0.toJson(jsonElement18);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter20 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter20.value(true);
        com.google.gson.stream.JsonWriter jsonWriter24 = jsonWriter22.value("");
        com.google.gson.stream.JsonWriter jsonWriter26 = jsonWriter22.value("");
        com.google.gson.JsonElement jsonElement27 = gson0.toJsonTree((java.lang.Object) "");
        java.lang.String str28 = gson0.toString();
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNull(jsonPrimitive11);
        org.junit.Assert.assertNull(jsonObject16);
        org.junit.Assert.assertNotNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertNotNull(jsonWriter22);
        org.junit.Assert.assertNotNull(jsonWriter24);
        org.junit.Assert.assertNotNull(jsonWriter26);
        org.junit.Assert.assertNotNull(jsonElement27);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test36");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.internal.bind.DateTypeAdapter dateTypeAdapter4 = new com.google.gson.internal.bind.DateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter4.toJsonTree(date6);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter8 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter8.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter8.nullValue();
        boolean boolean12 = jsonTreeWriter8.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter8.value("{\"calls\":{\"threadLocalHashCode\":-1753537387},\"typeTokenCache\":{\"com.google.gson.JsonNull\":{}},\"factories\":[null,null,{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]},null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,{\"constructorConstructor\":{\"instanceCreators\":{}}},{\"constructorConstructor\":{\"instanceCreators\":{}},\"complexMapKeySerialization\":false},{\"constructorConstructor\":{\"instanceCreators\":{}}},null,{\"constructorConstructor\":{\"instanceCreators\":{}},\"fieldNamingPolicy\":\"IDENTITY\",\"excluder\":{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}}],\"constructorConstructor\":{\"instanceCreators\":{}},\"serializeNulls\":false,\"htmlSafe\":true,\"generateNonExecutableJson\":false,\"prettyPrinting\":false}");
        gson0.toJson(jsonElement7, (com.google.gson.stream.JsonWriter) jsonTreeWriter8);
        com.google.gson.JsonArray jsonArray16 = new com.google.gson.JsonArray();
        int int17 = jsonArray16.size();
        int int18 = jsonArray16.size();
        jsonArray16.add((java.lang.Character) 'a');
        com.google.gson.JsonObject jsonObject21 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive23 = jsonObject21.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable24 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException25 = new com.google.gson.stream.MalformedJsonException(throwable24);
        java.lang.Throwable throwable26 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException27 = new com.google.gson.stream.MalformedJsonException(throwable26);
        malformedJsonException25.addSuppressed((java.lang.Throwable) malformedJsonException27);
        boolean boolean29 = jsonObject21.equals((java.lang.Object) malformedJsonException27);
        jsonObject21.addProperty("$", (java.lang.Boolean) true);
        boolean boolean33 = jsonArray16.remove((com.google.gson.JsonElement) jsonObject21);
        jsonArray16.add((java.lang.Character) '4');
        java.lang.Appendable appendable36 = null;
        java.io.Writer writer37 = com.google.gson.internal.Streams.writerForAppendable(appendable36);
        com.google.gson.stream.JsonWriter jsonWriter38 = new com.google.gson.stream.JsonWriter(writer37);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonArray16, (java.lang.Appendable) writer37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jsonPrimitive23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(writer37);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test37");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        java.lang.String str9 = gson0.toString();
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test38");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.JsonElement jsonElement4 = null;
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter5 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter7 = jsonTreeWriter5.value(true);
        jsonTreeWriter5.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter5.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonWriter11.value((long) ' ');
        jsonWriter13.setSerializeNulls(true);
        gson0.toJson(jsonElement4, jsonWriter13);
        com.google.gson.JsonArray jsonArray17 = new com.google.gson.JsonArray();
        int int18 = jsonArray17.size();
        int int19 = jsonArray17.size();
        jsonArray17.add((java.lang.Character) 'a');
        java.util.Iterator<com.google.gson.JsonElement> jsonElementItor22 = jsonArray17.iterator();
        jsonArray17.add("$");
        com.google.gson.JsonArray jsonArray25 = jsonArray17.getAsJsonArray();
        com.google.gson.JsonArray jsonArray26 = new com.google.gson.JsonArray();
        int int27 = jsonArray26.size();
        int int28 = jsonArray26.size();
        jsonArray26.add((java.lang.Character) 'a');
        jsonArray26.add((java.lang.Boolean) true);
        com.google.gson.JsonArray jsonArray33 = new com.google.gson.JsonArray();
        int int34 = jsonArray33.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader35 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray33);
        int int36 = jsonArray33.size();
        boolean boolean37 = jsonArray26.contains((com.google.gson.JsonElement) jsonArray33);
        boolean boolean38 = jsonArray33.isJsonObject();
        com.google.gson.JsonObject jsonObject39 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive41 = jsonObject39.getAsJsonPrimitive("hi!");
        boolean boolean42 = jsonArray33.contains((com.google.gson.JsonElement) jsonPrimitive41);
        jsonArray25.addAll(jsonArray33);
        com.google.gson.stream.JsonWriter jsonWriter44 = null;
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonArray33, jsonWriter44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter7);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jsonElementItor22);
        org.junit.Assert.assertNotNull(jsonArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jsonPrimitive41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test39");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter4 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter6 = jsonTreeWriter4.value(true);
        jsonTreeWriter4.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter4.value((double) (-1));
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter4.value((java.lang.Number) (short) 1);
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter4.value((double) '4');
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter4.beginArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = throwableArrayArrayTypeAdapter3.toJson((java.lang.Object) jsonWriter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter6);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test40");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.String str1 = gson0.toString();
        java.lang.String str2 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter3 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass4 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter5 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter3, throwableArrayClass4);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter6 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter6.value((java.lang.Number) (byte) -1);
        boolean boolean9 = jsonTreeWriter6.getSerializeNulls();
        jsonTreeWriter6.setSerializeNulls(false);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter6.value((double) 100L);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter6.value(false);
        jsonWriter15.setIndent("{\"$\":true,\"\":true}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement18 = throwableArrayArrayTypeAdapter5.toJsonTree((java.lang.Object) "{\"$\":true,\"\":true}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test41");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.Iterable<com.google.gson.JsonElement>> jsonElementIterableTypeAdapter9 = null;
        java.lang.Class<java.lang.Iterable<com.google.gson.JsonElement>> jsonElementIterableClass10 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Iterable<com.google.gson.JsonElement>> jsonElementIterableArrayTypeAdapter11 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Iterable<com.google.gson.JsonElement>>(gson0, jsonElementIterableTypeAdapter9, jsonElementIterableClass10);
        com.google.gson.JsonPrimitive jsonPrimitive13 = new com.google.gson.JsonPrimitive((java.lang.Number) 0.0f);
        java.lang.String str14 = jsonPrimitive13.getAsString();
        com.google.gson.JsonObject jsonObject15 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive17 = jsonObject15.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable18 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException19 = new com.google.gson.stream.MalformedJsonException(throwable18);
        java.lang.Throwable throwable20 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException21 = new com.google.gson.stream.MalformedJsonException(throwable20);
        malformedJsonException19.addSuppressed((java.lang.Throwable) malformedJsonException21);
        boolean boolean23 = jsonObject15.equals((java.lang.Object) malformedJsonException21);
        com.google.gson.JsonArray jsonArray25 = jsonObject15.getAsJsonArray("hi!");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter26 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter28 = jsonTreeWriter26.value((java.lang.Number) (byte) -1);
        boolean boolean29 = jsonObject15.equals((java.lang.Object) jsonWriter28);
        gson0.toJson((com.google.gson.JsonElement) jsonPrimitive13, jsonWriter28);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertNull(jsonPrimitive17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jsonArray25);
        org.junit.Assert.assertNotNull(jsonWriter28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test42");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        com.google.gson.JsonObject jsonObject24 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive26 = jsonObject24.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable27 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException28 = new com.google.gson.stream.MalformedJsonException(throwable27);
        java.lang.Throwable throwable29 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException30 = new com.google.gson.stream.MalformedJsonException(throwable29);
        malformedJsonException28.addSuppressed((java.lang.Throwable) malformedJsonException30);
        boolean boolean32 = jsonObject24.equals((java.lang.Object) malformedJsonException30);
        com.google.gson.JsonObject jsonObject34 = new com.google.gson.JsonObject();
        com.google.gson.JsonNull jsonNull36 = new com.google.gson.JsonNull();
        jsonObject34.add("", (com.google.gson.JsonElement) jsonNull36);
        jsonObject24.add("{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}", (com.google.gson.JsonElement) jsonObject34);
        jsonObject34.addProperty("", (java.lang.Character) '#');
        java.lang.String str42 = gson0.toJson((java.lang.Object) jsonObject34);
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter43 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass44 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter45 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter43, throwableArrayClass44);
        com.google.gson.JsonArray jsonArray46 = new com.google.gson.JsonArray();
        int int47 = jsonArray46.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader48 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray46);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator49 = jsonArray46.spliterator();
        com.google.gson.JsonObject jsonObject50 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive52 = jsonObject50.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable53 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException54 = new com.google.gson.stream.MalformedJsonException(throwable53);
        java.lang.Throwable throwable55 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException56 = new com.google.gson.stream.MalformedJsonException(throwable55);
        malformedJsonException54.addSuppressed((java.lang.Throwable) malformedJsonException56);
        boolean boolean58 = jsonObject50.equals((java.lang.Object) malformedJsonException56);
        jsonObject50.addProperty("$", (java.lang.Boolean) true);
        java.lang.String str62 = jsonObject50.toString();
        jsonObject50.addProperty("", (java.lang.Boolean) true);
        boolean boolean66 = jsonObject50.isJsonArray();
        com.google.gson.JsonArray jsonArray68 = new com.google.gson.JsonArray();
        int int69 = jsonArray68.size();
        int int70 = jsonArray68.size();
        jsonArray68.add((java.lang.Character) 'a');
        jsonArray68.add((java.lang.Character) 'a');
        jsonObject50.add("$", (com.google.gson.JsonElement) jsonArray68);
        boolean boolean76 = jsonArray46.contains((com.google.gson.JsonElement) jsonArray68);
        int int77 = jsonArray46.size();
        java.lang.Appendable appendable78 = null;
        java.io.Writer writer79 = com.google.gson.internal.Streams.writerForAppendable(appendable78);
        com.google.gson.stream.JsonWriter jsonWriter80 = new com.google.gson.stream.JsonWriter(writer79);
        java.io.Writer writer81 = com.google.gson.internal.Streams.writerForAppendable((java.lang.Appendable) writer79);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonArray46, (java.lang.Appendable) writer79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertNull(jsonPrimitive26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{\"\":\"#\"}" + "'", str42, "{\"\":\"#\"}");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(jsonElementSpliterator49);
        org.junit.Assert.assertNull(jsonPrimitive52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "{\"$\":true}" + "'", str62, "{\"$\":true}");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(writer79);
        org.junit.Assert.assertNotNull(writer81);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test43");
        com.google.gson.JsonObject jsonObject0 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive2 = jsonObject0.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable3 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException4 = new com.google.gson.stream.MalformedJsonException(throwable3);
        java.lang.Throwable throwable5 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException6 = new com.google.gson.stream.MalformedJsonException(throwable5);
        malformedJsonException4.addSuppressed((java.lang.Throwable) malformedJsonException6);
        boolean boolean8 = jsonObject0.equals((java.lang.Object) malformedJsonException6);
        jsonObject0.addProperty("$", (java.lang.Boolean) true);
        java.lang.String str12 = jsonObject0.toString();
        jsonObject0.addProperty("", (java.lang.Boolean) true);
        boolean boolean16 = jsonObject0.isJsonArray();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter17 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter17.value(true);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonWriter19.value((long) ' ');
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonWriter19.beginObject();
        jsonWriter19.setLenient(false);
        boolean boolean25 = jsonObject0.equals((java.lang.Object) false);
        com.google.gson.JsonArray jsonArray26 = new com.google.gson.JsonArray();
        int int27 = jsonArray26.size();
        int int28 = jsonArray26.size();
        jsonArray26.add((java.lang.Character) 'a');
        jsonArray26.add((java.lang.Boolean) true);
        com.google.gson.JsonArray jsonArray33 = new com.google.gson.JsonArray();
        int int34 = jsonArray33.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader35 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray33);
        int int36 = jsonArray33.size();
        boolean boolean37 = jsonArray26.contains((com.google.gson.JsonElement) jsonArray33);
        com.google.gson.JsonArray jsonArray38 = new com.google.gson.JsonArray();
        int int39 = jsonArray38.size();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator40 = jsonArray38.spliterator();
        com.google.gson.JsonPrimitive jsonPrimitive42 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) -1);
        boolean boolean43 = jsonPrimitive42.isString();
        double double44 = jsonPrimitive42.getAsDouble();
        java.math.BigDecimal bigDecimal45 = jsonPrimitive42.getAsBigDecimal();
        boolean boolean46 = jsonArray38.contains((com.google.gson.JsonElement) jsonPrimitive42);
        jsonArray26.addAll(jsonArray38);
        com.google.gson.JsonArray jsonArray48 = new com.google.gson.JsonArray();
        int int49 = jsonArray48.size();
        int int50 = jsonArray48.size();
        jsonArray48.add((java.lang.Character) 'a');
        com.google.gson.JsonObject jsonObject53 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive55 = jsonObject53.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable56 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException57 = new com.google.gson.stream.MalformedJsonException(throwable56);
        java.lang.Throwable throwable58 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException59 = new com.google.gson.stream.MalformedJsonException(throwable58);
        malformedJsonException57.addSuppressed((java.lang.Throwable) malformedJsonException59);
        boolean boolean61 = jsonObject53.equals((java.lang.Object) malformedJsonException59);
        jsonObject53.addProperty("$", (java.lang.Boolean) true);
        boolean boolean65 = jsonArray48.remove((com.google.gson.JsonElement) jsonObject53);
        jsonArray48.add((java.lang.Character) '4');
        com.google.gson.JsonArray jsonArray69 = new com.google.gson.JsonArray();
        int int70 = jsonArray69.size();
        int int71 = jsonArray69.size();
        jsonArray69.add((java.lang.Character) 'a');
        com.google.gson.JsonElement jsonElement74 = jsonArray48.set((int) (short) 1, (com.google.gson.JsonElement) jsonArray69);
        boolean boolean75 = jsonArray26.remove((com.google.gson.JsonElement) jsonArray48);
        com.google.gson.Gson gson76 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter77 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass78 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter79 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson76, throwableArrayTypeAdapter77, throwableArrayClass78);
        com.google.gson.stream.JsonToken jsonToken80 = com.google.gson.stream.JsonToken.END_OBJECT;
        com.google.gson.JsonElement jsonElement81 = gson76.toJsonTree((java.lang.Object) jsonToken80);
        boolean boolean82 = jsonArray48.remove(jsonElement81);
        boolean boolean83 = jsonObject0.equals((java.lang.Object) jsonElement81);
        org.junit.Assert.assertNull(jsonPrimitive2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"$\":true}" + "'", str12, "{\"$\":true}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonWriter22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(jsonElementSpliterator40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(jsonPrimitive55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(jsonElement74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + jsonToken80 + "' != '" + com.google.gson.stream.JsonToken.END_OBJECT + "'", jsonToken80.equals(com.google.gson.stream.JsonToken.END_OBJECT));
        org.junit.Assert.assertNotNull(jsonElement81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test44");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        java.lang.Object obj4 = null;
        java.lang.String str5 = gson0.toJson(obj4);
        com.google.gson.TypeAdapter<java.util.Collection<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>>> strEntryCollectionTypeAdapter6 = null;
        java.lang.Class<java.util.Collection<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>>> strEntryCollectionClass7 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.util.Collection<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>>> strEntryCollectionArrayTypeAdapter8 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.util.Collection<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>>>(gson0, strEntryCollectionTypeAdapter6, strEntryCollectionClass7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement10 = strEntryCollectionArrayTypeAdapter8.toJsonTree((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test45");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        int int1 = jsonArray0.size();
        int int2 = jsonArray0.size();
        jsonArray0.add((java.lang.Character) 'a');
        jsonArray0.add((java.lang.Boolean) true);
        com.google.gson.JsonArray jsonArray7 = new com.google.gson.JsonArray();
        int int8 = jsonArray7.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray7);
        int int10 = jsonArray7.size();
        boolean boolean11 = jsonArray0.contains((com.google.gson.JsonElement) jsonArray7);
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator14 = jsonArray12.spliterator();
        com.google.gson.JsonPrimitive jsonPrimitive16 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) -1);
        boolean boolean17 = jsonPrimitive16.isString();
        double double18 = jsonPrimitive16.getAsDouble();
        java.math.BigDecimal bigDecimal19 = jsonPrimitive16.getAsBigDecimal();
        boolean boolean20 = jsonArray12.contains((com.google.gson.JsonElement) jsonPrimitive16);
        jsonArray0.addAll(jsonArray12);
        com.google.gson.JsonArray jsonArray22 = new com.google.gson.JsonArray();
        int int23 = jsonArray22.size();
        int int24 = jsonArray22.size();
        jsonArray22.add((java.lang.Character) 'a');
        com.google.gson.JsonObject jsonObject27 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive29 = jsonObject27.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable30 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException31 = new com.google.gson.stream.MalformedJsonException(throwable30);
        java.lang.Throwable throwable32 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException33 = new com.google.gson.stream.MalformedJsonException(throwable32);
        malformedJsonException31.addSuppressed((java.lang.Throwable) malformedJsonException33);
        boolean boolean35 = jsonObject27.equals((java.lang.Object) malformedJsonException33);
        jsonObject27.addProperty("$", (java.lang.Boolean) true);
        boolean boolean39 = jsonArray22.remove((com.google.gson.JsonElement) jsonObject27);
        jsonArray22.add((java.lang.Character) '4');
        com.google.gson.JsonArray jsonArray43 = new com.google.gson.JsonArray();
        int int44 = jsonArray43.size();
        int int45 = jsonArray43.size();
        jsonArray43.add((java.lang.Character) 'a');
        com.google.gson.JsonElement jsonElement48 = jsonArray22.set((int) (short) 1, (com.google.gson.JsonElement) jsonArray43);
        boolean boolean49 = jsonArray0.remove((com.google.gson.JsonElement) jsonArray22);
        com.google.gson.Gson gson50 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter51 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass52 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter53 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson50, throwableArrayTypeAdapter51, throwableArrayClass52);
        com.google.gson.stream.JsonToken jsonToken54 = com.google.gson.stream.JsonToken.END_OBJECT;
        com.google.gson.JsonElement jsonElement55 = gson50.toJsonTree((java.lang.Object) jsonToken54);
        boolean boolean56 = jsonArray22.remove(jsonElement55);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger57 = jsonArray22.getAsBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(jsonElementSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(jsonPrimitive29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(jsonElement48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + jsonToken54 + "' != '" + com.google.gson.stream.JsonToken.END_OBJECT + "'", jsonToken54.equals(com.google.gson.stream.JsonToken.END_OBJECT));
        org.junit.Assert.assertNotNull(jsonElement55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test46");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.String str1 = gson0.toString();
        java.lang.String str2 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter3 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass4 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter5 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter3, throwableArrayClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = throwableArrayArrayTypeAdapter5.fromJson("JsonTreeReader");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
        // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test47");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        int int1 = jsonArray0.size();
        int int2 = jsonArray0.size();
        com.google.gson.JsonObject jsonObject3 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive5 = jsonObject3.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable6 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException7 = new com.google.gson.stream.MalformedJsonException(throwable6);
        java.lang.Throwable throwable8 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException9 = new com.google.gson.stream.MalformedJsonException(throwable8);
        malformedJsonException7.addSuppressed((java.lang.Throwable) malformedJsonException9);
        boolean boolean11 = jsonObject3.equals((java.lang.Object) malformedJsonException9);
        boolean boolean12 = jsonArray0.equals((java.lang.Object) malformedJsonException9);
        jsonArray0.add("com.google.gson.JsonParseException: null");
        com.google.gson.JsonObject jsonObject15 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive17 = jsonObject15.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable18 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException19 = new com.google.gson.stream.MalformedJsonException(throwable18);
        java.lang.Throwable throwable20 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException21 = new com.google.gson.stream.MalformedJsonException(throwable20);
        malformedJsonException19.addSuppressed((java.lang.Throwable) malformedJsonException21);
        boolean boolean23 = jsonObject15.equals((java.lang.Object) malformedJsonException21);
        jsonObject15.addProperty("$", (java.lang.Boolean) true);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader27 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject15);
        boolean boolean28 = jsonArray0.remove((com.google.gson.JsonElement) jsonObject15);
        com.google.gson.JsonArray jsonArray29 = jsonArray0.getAsJsonArray();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader30 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray29);
        java.util.Iterator<com.google.gson.JsonElement> jsonElementItor31 = jsonArray29.iterator();
        com.google.gson.Gson gson32 = new com.google.gson.Gson();
        java.lang.Object obj33 = null;
        com.google.gson.JsonElement jsonElement34 = gson32.toJsonTree(obj33);
        boolean boolean35 = jsonArray29.equals((java.lang.Object) gson32);
        com.google.gson.TypeAdapter<java.io.Closeable> closeableTypeAdapter36 = null;
        java.lang.Class<java.io.Closeable> closeableClass37 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.io.Closeable> closeableArrayTypeAdapter38 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.io.Closeable>(gson32, closeableTypeAdapter36, closeableClass37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(jsonPrimitive5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPrimitive17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonArray29);
        org.junit.Assert.assertNotNull(jsonElementItor31);
        org.junit.Assert.assertNotNull(jsonElement34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test48");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.internal.bind.DateTypeAdapter dateTypeAdapter4 = new com.google.gson.internal.bind.DateTypeAdapter();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = dateTypeAdapter4.toJsonTree(date6);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter8 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter8.value((java.lang.Number) (byte) -1);
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter8.nullValue();
        boolean boolean12 = jsonTreeWriter8.isLenient();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter8.value("{\"calls\":{\"threadLocalHashCode\":-1753537387},\"typeTokenCache\":{\"com.google.gson.JsonNull\":{}},\"factories\":[null,null,{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]},null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,{\"constructorConstructor\":{\"instanceCreators\":{}}},{\"constructorConstructor\":{\"instanceCreators\":{}},\"complexMapKeySerialization\":false},{\"constructorConstructor\":{\"instanceCreators\":{}}},null,{\"constructorConstructor\":{\"instanceCreators\":{}},\"fieldNamingPolicy\":\"IDENTITY\",\"excluder\":{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}}],\"constructorConstructor\":{\"instanceCreators\":{}},\"serializeNulls\":false,\"htmlSafe\":true,\"generateNonExecutableJson\":false,\"prettyPrinting\":false}");
        gson0.toJson(jsonElement7, (com.google.gson.stream.JsonWriter) jsonTreeWriter8);
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter8.beginArray();
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertNotNull(jsonWriter16);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test49");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.Iterable<com.google.gson.JsonElement>> jsonElementIterableTypeAdapter9 = null;
        java.lang.Class<java.lang.Iterable<com.google.gson.JsonElement>> jsonElementIterableClass10 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Iterable<com.google.gson.JsonElement>> jsonElementIterableArrayTypeAdapter11 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Iterable<com.google.gson.JsonElement>>(gson0, jsonElementIterableTypeAdapter9, jsonElementIterableClass10);
        com.google.gson.internal.bind.SqlDateTypeAdapter sqlDateTypeAdapter12 = new com.google.gson.internal.bind.SqlDateTypeAdapter();
        com.google.gson.TypeAdapter<java.sql.Date> dateTypeAdapter13 = sqlDateTypeAdapter12.nullSafe();
        java.sql.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = dateTypeAdapter13.toJsonTree(date14);
        java.lang.String str16 = gson0.toJson((java.lang.Object) dateTypeAdapter13);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNotNull(dateTypeAdapter13);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null" + "'", str16, "null");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test50");
        com.google.gson.JsonObject jsonObject0 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive2 = jsonObject0.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable3 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException4 = new com.google.gson.stream.MalformedJsonException(throwable3);
        java.lang.Throwable throwable5 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException6 = new com.google.gson.stream.MalformedJsonException(throwable5);
        malformedJsonException4.addSuppressed((java.lang.Throwable) malformedJsonException6);
        boolean boolean8 = jsonObject0.equals((java.lang.Object) malformedJsonException6);
        jsonObject0.addProperty("$", (java.lang.Boolean) true);
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> strEntrySet12 = jsonObject0.entrySet();
        com.google.gson.Gson gson13 = new com.google.gson.Gson();
        java.lang.Appendable appendable14 = null;
        java.io.Writer writer15 = com.google.gson.internal.Streams.writerForAppendable(appendable14);
        com.google.gson.stream.JsonWriter jsonWriter16 = new com.google.gson.stream.JsonWriter(writer15);
        com.google.gson.stream.JsonWriter jsonWriter17 = gson13.newJsonWriter(writer15);
        jsonWriter17.setIndent("{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        boolean boolean20 = jsonObject0.equals((java.lang.Object) "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        com.google.gson.JsonElement jsonElement22 = jsonObject0.remove("");
        // The following exception was thrown during execution in test generation
        try {
            char char23 = jsonObject0.getAsCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonObject");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(jsonPrimitive2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strEntrySet12);
        org.junit.Assert.assertNotNull(writer15);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jsonElement22);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test51");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        com.google.gson.JsonNull jsonNull9 = new com.google.gson.JsonNull();
        boolean boolean10 = jsonNull9.isJsonPrimitive();
        boolean boolean11 = jsonNull9.isJsonNull();
        com.google.gson.JsonArray jsonArray12 = new com.google.gson.JsonArray();
        int int13 = jsonArray12.size();
        int int14 = jsonArray12.size();
        jsonArray12.add((java.lang.Character) 'a');
        jsonArray12.add((java.lang.Boolean) true);
        boolean boolean19 = jsonArray12.isJsonArray();
        jsonArray12.add((java.lang.Character) 'a');
        boolean boolean22 = jsonNull9.equals((java.lang.Object) jsonArray12);
        java.lang.String str23 = gson0.toJson((com.google.gson.JsonElement) jsonNull9);
        java.lang.String str24 = gson0.toString();
        com.google.gson.JsonArray jsonArray25 = new com.google.gson.JsonArray();
        int int26 = jsonArray25.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader27 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray25);
        java.lang.String str28 = jsonTreeReader27.getPath();
        jsonTreeReader27.beginArray();
        com.google.gson.JsonPrimitive jsonPrimitive32 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) -1);
        boolean boolean33 = jsonPrimitive32.isString();
        boolean boolean34 = jsonPrimitive32.isBoolean();
        short short35 = jsonPrimitive32.getAsShort();
        boolean boolean36 = jsonPrimitive32.isString();
        boolean boolean37 = jsonPrimitive32.getAsBoolean();
        com.google.gson.stream.MalformedJsonException malformedJsonException45 = new com.google.gson.stream.MalformedJsonException("hi!");
        com.google.gson.JsonSyntaxException jsonSyntaxException46 = new com.google.gson.JsonSyntaxException("com.google.gson.stream.MalformedJsonException", (java.lang.Throwable) malformedJsonException45);
        com.google.gson.stream.MalformedJsonException malformedJsonException47 = new com.google.gson.stream.MalformedJsonException("", (java.lang.Throwable) malformedJsonException45);
        com.google.gson.JsonIOException jsonIOException48 = new com.google.gson.JsonIOException((java.lang.Throwable) malformedJsonException45);
        com.google.gson.JsonParseException jsonParseException49 = new com.google.gson.JsonParseException("null", (java.lang.Throwable) malformedJsonException45);
        com.google.gson.JsonSyntaxException jsonSyntaxException50 = new com.google.gson.JsonSyntaxException("hi!", (java.lang.Throwable) jsonParseException49);
        com.google.gson.JsonIOException jsonIOException51 = new com.google.gson.JsonIOException("com.google.gson.stream.MalformedJsonException: hi!", (java.lang.Throwable) jsonParseException49);
        com.google.gson.JsonSyntaxException jsonSyntaxException52 = new com.google.gson.JsonSyntaxException((java.lang.Throwable) jsonParseException49);
        com.google.gson.JsonIOException jsonIOException53 = new com.google.gson.JsonIOException("? super com.google.gson.stream.MalformedJsonException", (java.lang.Throwable) jsonSyntaxException52);
        boolean boolean54 = jsonPrimitive32.equals((java.lang.Object) jsonSyntaxException52);
        com.google.gson.stream.MalformedJsonException malformedJsonException55 = new com.google.gson.stream.MalformedJsonException("{\"$\":true,\"{\\\"calls\\\":{\\\"threadLocalHashCode\\\":-1753537387},\\\"typeTokenCache\\\":{\\\"com.google.gson.JsonNull\\\":{}},\\\"factories\\\":[null,null,{\\\"version\\\":-1.0,\\\"modifiers\\\":136,\\\"serializeInnerClasses\\\":true,\\\"requireExpose\\\":false,\\\"serializationStrategies\\\":[],\\\"deserializationStrategies\\\":[]},null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,{\\\"constructorConstructor\\\":{\\\"instanceCreators\\\":{}}},{\\\"constructorConstructor\\\":{\\\"instanceCreators\\\":{}},\\\"complexMapKeySerialization\\\":false},{\\\"constructorConstructor\\\":{\\\"instanceCreators\\\":{}}},null,{\\\"constructorConstructor\\\":{\\\"instanceCreators\\\":{}},\\\"fieldNamingPolicy\\\":\\\"IDENTITY\\\",\\\"excluder\\\":{\\\"version\\\":-1.0,\\\"modifiers\\\":136,\\\"serializeInnerClasses\\\":true,\\\"requireExpose\\\":false,\\\"serializationStrategies\\\":[],\\\"deserializationStrategies\\\":[]}}],\\\"constructorConstructor\\\":{\\\"instanceCreators\\\":{}},\\\"serializeNulls\\\":false,\\\"htmlSafe\\\":true,\\\"generateNonExecutableJson\\\":false,\\\"prettyPrinting\\\":false}\":\"J\"}", (java.lang.Throwable) jsonSyntaxException52);
        java.lang.Class<?> wildcardClass56 = malformedJsonException55.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = gson0.fromJson((com.google.gson.stream.JsonReader) jsonTreeReader27, (java.lang.reflect.Type) wildcardClass56);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was END_ARRAY");
        } catch (com.google.gson.JsonSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null" + "'", str23, "null");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "$" + "'", str28, "$");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) -1 + "'", short35 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test52");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        int int1 = jsonArray0.size();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonArray0);
        com.google.gson.JsonPrimitive jsonPrimitive4 = new com.google.gson.JsonPrimitive((java.lang.Boolean) false);
        boolean boolean5 = jsonArray0.remove((com.google.gson.JsonElement) jsonPrimitive4);
        com.google.gson.JsonArray jsonArray6 = new com.google.gson.JsonArray();
        int int7 = jsonArray6.size();
        int int8 = jsonArray6.size();
        com.google.gson.JsonObject jsonObject9 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive11 = jsonObject9.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable12 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException13 = new com.google.gson.stream.MalformedJsonException(throwable12);
        java.lang.Throwable throwable14 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException15 = new com.google.gson.stream.MalformedJsonException(throwable14);
        malformedJsonException13.addSuppressed((java.lang.Throwable) malformedJsonException15);
        boolean boolean17 = jsonObject9.equals((java.lang.Object) malformedJsonException15);
        boolean boolean18 = jsonArray6.equals((java.lang.Object) malformedJsonException15);
        jsonArray6.add("com.google.gson.JsonParseException: null");
        com.google.gson.JsonObject jsonObject21 = new com.google.gson.JsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive23 = jsonObject21.getAsJsonPrimitive("hi!");
        java.lang.Throwable throwable24 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException25 = new com.google.gson.stream.MalformedJsonException(throwable24);
        java.lang.Throwable throwable26 = null;
        com.google.gson.stream.MalformedJsonException malformedJsonException27 = new com.google.gson.stream.MalformedJsonException(throwable26);
        malformedJsonException25.addSuppressed((java.lang.Throwable) malformedJsonException27);
        boolean boolean29 = jsonObject21.equals((java.lang.Object) malformedJsonException27);
        jsonObject21.addProperty("$", (java.lang.Boolean) true);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader33 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject21);
        boolean boolean34 = jsonArray6.remove((com.google.gson.JsonElement) jsonObject21);
        com.google.gson.internal.Excluder excluder35 = com.google.gson.internal.Excluder.DEFAULT;
        com.google.gson.internal.Excluder excluder36 = excluder35.excludeFieldsWithoutExposeAnnotation();
        int[] intArray42 = new int[] { (short) 0, '#', 1, (-1), (short) 0 };
        com.google.gson.internal.Excluder excluder43 = excluder35.withModifiers(intArray42);
        boolean boolean44 = jsonObject21.equals((java.lang.Object) excluder43);
        boolean boolean45 = jsonArray0.contains((com.google.gson.JsonElement) jsonObject21);
        com.google.gson.JsonObject jsonObject47 = jsonObject21.getAsJsonObject("{\"hi!\":\"\",\"$\":\" \"}");
        com.google.gson.Gson gson48 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter49 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass50 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter51 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson48, throwableArrayTypeAdapter49, throwableArrayClass50);
        java.lang.Object obj52 = null;
        java.lang.String str53 = gson48.toJson(obj52);
        boolean boolean54 = jsonObject21.equals((java.lang.Object) gson48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonPrimitive11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonPrimitive23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(excluder35);
        org.junit.Assert.assertNotNull(excluder36);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 35, 1, -1, 0]");
        org.junit.Assert.assertNotNull(excluder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(jsonObject47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "null" + "'", str53, "null");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test53");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        java.lang.Object obj4 = null;
        java.lang.String str5 = gson0.toJson(obj4);
        com.google.gson.TypeAdapter<com.google.gson.JsonElement> jsonElementTypeAdapter6 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT;
        java.lang.Class<com.google.gson.JsonElement> jsonElementClass7 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<com.google.gson.JsonElement> jsonElementArrayTypeAdapter8 = new com.google.gson.internal.bind.ArrayTypeAdapter<com.google.gson.JsonElement>(gson0, jsonElementTypeAdapter6, jsonElementClass7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(jsonElementTypeAdapter6);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test54");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.Excluder excluder1 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.Excluder excluder2 = excluder1.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder4 = excluder1.withVersion(100.0d);
        com.google.gson.internal.Excluder excluder6 = excluder4.withVersion((double) (byte) 0);
        java.lang.String str7 = gson0.toJson((java.lang.Object) excluder4);
        java.lang.String str8 = gson0.toString();
        java.lang.Object obj9 = null;
        java.lang.String str10 = gson0.toJson(obj9);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str7, "{\"version\":100.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test55");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Throwable[]> throwableArrayTypeAdapter1 = null;
        java.lang.Class<java.lang.Throwable[]> throwableArrayClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]> throwableArrayArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.Throwable[]>(gson0, throwableArrayTypeAdapter1, throwableArrayClass2);
        com.google.gson.stream.JsonReader jsonReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = throwableArrayArrayTypeAdapter3.read(jsonReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

