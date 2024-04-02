package com.google.gson.internal.bind;

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
        com.google.gson.JsonSyntaxException jsonSyntaxException1 = new com.google.gson.JsonSyntaxException("hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        com.google.gson.JsonPrimitive jsonPrimitive6 = new com.google.gson.JsonPrimitive((java.lang.Boolean) false);
        boolean boolean7 = jsonPrimitive6.isString();
        java.lang.String str8 = jsonPrimitive6.getAsString();
        boolean boolean9 = jsonPrimitive6.isJsonPrimitive();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) boolean9, appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false" + "'", str8, "false");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson(obj1, appendable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement9 = jsonObject7.get("null");
        com.google.gson.JsonElement jsonElement11 = jsonObject7.get("");
        com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber14 = new com.google.gson.internal.LazilyParsedNumber("true");
        jsonObject7.addProperty("false", (java.lang.Number) lazilyParsedNumber14);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter16 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter16.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter16.value(true);
        jsonWriter19.setSerializeNulls(false);
        gson0.toJson((com.google.gson.JsonElement) jsonObject7, jsonWriter19);
        com.google.gson.JsonPrimitive jsonPrimitive24 = jsonObject7.getAsJsonPrimitive("0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNull(jsonElement9);
        org.junit.Assert.assertNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNull(jsonPrimitive24);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement9 = jsonObject7.get("null");
        com.google.gson.JsonElement jsonElement11 = jsonObject7.get("");
        com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber14 = new com.google.gson.internal.LazilyParsedNumber("true");
        jsonObject7.addProperty("false", (java.lang.Number) lazilyParsedNumber14);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter16 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter16.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter16.value(true);
        jsonWriter19.setSerializeNulls(false);
        gson0.toJson((com.google.gson.JsonElement) jsonObject7, jsonWriter19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = jsonObject7.getAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonObject");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNull(jsonElement9);
        org.junit.Assert.assertNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonPrimitive jsonPrimitive8 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) 10);
        java.math.BigInteger bigInteger9 = jsonPrimitive8.getAsBigInteger();
        java.lang.String str10 = jsonPrimitive8.getAsString();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter11 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter11.value((double) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter11.value((long) (short) 0);
        jsonTreeWriter11.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter11.value((double) '4');
        com.google.gson.JsonElement jsonElement20 = jsonTreeWriter11.get();
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter11.beginArray();
        gson0.toJson((com.google.gson.JsonElement) jsonPrimitive8, jsonWriter21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter24 = jsonWriter21.name("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNotNull(jsonWriter21);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement9 = jsonObject7.get("null");
        com.google.gson.JsonElement jsonElement11 = jsonObject7.get("");
        com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber14 = new com.google.gson.internal.LazilyParsedNumber("true");
        jsonObject7.addProperty("false", (java.lang.Number) lazilyParsedNumber14);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter16 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter16.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter16.value(true);
        jsonWriter19.setSerializeNulls(false);
        gson0.toJson((com.google.gson.JsonElement) jsonObject7, jsonWriter19);
        com.google.gson.JsonArray jsonArray23 = new com.google.gson.JsonArray();
        jsonArray23.add((java.lang.Number) 1);
        int int26 = jsonArray23.size();
        java.lang.Number number27 = jsonArray23.getAsNumber();
        java.math.BigInteger bigInteger28 = jsonArray23.getAsBigInteger();
        double double29 = jsonArray23.getAsDouble();
        boolean boolean30 = jsonArray23.getAsBoolean();
        double double31 = jsonArray23.getAsDouble();
        boolean boolean32 = jsonObject7.equals((java.lang.Object) double31);
        // The following exception was thrown during execution in test generation
        try {
            char char33 = jsonObject7.getAsCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonObject");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNull(jsonElement9);
        org.junit.Assert.assertNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1 + "'", number27, 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement9 = jsonObject7.get("null");
        com.google.gson.JsonElement jsonElement11 = jsonObject7.get("");
        com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber14 = new com.google.gson.internal.LazilyParsedNumber("true");
        jsonObject7.addProperty("false", (java.lang.Number) lazilyParsedNumber14);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter16 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter16.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter16.value(true);
        jsonWriter19.setSerializeNulls(false);
        gson0.toJson((com.google.gson.JsonElement) jsonObject7, jsonWriter19);
        com.google.gson.JsonArray jsonArray23 = new com.google.gson.JsonArray();
        jsonArray23.add((java.lang.Number) 1);
        int int26 = jsonArray23.size();
        java.lang.Number number27 = jsonArray23.getAsNumber();
        java.math.BigInteger bigInteger28 = jsonArray23.getAsBigInteger();
        double double29 = jsonArray23.getAsDouble();
        boolean boolean30 = jsonArray23.getAsBoolean();
        double double31 = jsonArray23.getAsDouble();
        boolean boolean32 = jsonObject7.equals((java.lang.Object) double31);
        com.google.gson.JsonElement jsonElement34 = jsonObject7.get("false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNull(jsonElement9);
        org.junit.Assert.assertNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1 + "'", number27, 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonElement34);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        jsonArray0.add("true");
        java.util.Iterator<com.google.gson.JsonElement> jsonElementItor3 = jsonArray0.iterator();
        java.lang.String str4 = jsonArray0.getAsString();
        com.google.gson.JsonElement jsonElement5 = null;
        boolean boolean6 = jsonArray0.remove(jsonElement5);
        char char7 = jsonArray0.getAsCharacter();
        java.util.Iterator<com.google.gson.JsonElement> jsonElementItor8 = jsonArray0.iterator();
        jsonArray0.add((java.lang.Boolean) true);
        jsonArray0.add("");
        com.google.gson.Gson gson13 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor14 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory16 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor14, true);
        java.lang.String str17 = gson13.toJson((java.lang.Object) constructorConstructor14);
        java.lang.Object obj18 = null;
        com.google.gson.JsonElement jsonElement19 = gson13.toJsonTree(obj18);
        boolean boolean20 = jsonArray0.equals((java.lang.Object) gson13);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = jsonArray0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElementItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 't' + "'", char7 == 't');
        org.junit.Assert.assertNotNull(jsonElementItor8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(jsonElement19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.gson.Gson gson0 = null;
        com.google.gson.TypeAdapter<java.lang.reflect.Type> typeTypeAdapter1 = null;
        java.lang.Class<java.lang.reflect.Type> typeClass2 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.reflect.Type> typeArrayTypeAdapter3 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.reflect.Type>(gson0, typeTypeAdapter1, typeClass2);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter4 = typeArrayTypeAdapter3.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter5 = objTypeAdapter4.nullSafe();
        com.google.gson.Gson gson6 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor7 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory9 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor7, true);
        java.lang.String str10 = gson6.toJson((java.lang.Object) constructorConstructor7);
        java.lang.Object obj11 = null;
        com.google.gson.JsonElement jsonElement12 = gson6.toJsonTree(obj11);
        com.google.gson.JsonPrimitive jsonPrimitive14 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) 10);
        java.math.BigInteger bigInteger15 = jsonPrimitive14.getAsBigInteger();
        java.lang.String str16 = jsonPrimitive14.getAsString();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter17 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter17.value((double) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter17.value((long) (short) 0);
        jsonTreeWriter17.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter25 = jsonTreeWriter17.value((double) '4');
        com.google.gson.JsonElement jsonElement26 = jsonTreeWriter17.get();
        com.google.gson.stream.JsonWriter jsonWriter27 = jsonTreeWriter17.beginArray();
        gson6.toJson((com.google.gson.JsonElement) jsonPrimitive14, jsonWriter27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = objTypeAdapter5.toJson((java.lang.Object) jsonWriter27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objTypeAdapter4);
        org.junit.Assert.assertNotNull(objTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonWriter25);
        org.junit.Assert.assertNotNull(jsonElement26);
        org.junit.Assert.assertNotNull(jsonWriter27);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement9 = jsonObject7.get("null");
        com.google.gson.JsonElement jsonElement11 = jsonObject7.get("");
        com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber14 = new com.google.gson.internal.LazilyParsedNumber("true");
        jsonObject7.addProperty("false", (java.lang.Number) lazilyParsedNumber14);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter16 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter16.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter16.value(true);
        jsonWriter19.setSerializeNulls(false);
        gson0.toJson((com.google.gson.JsonElement) jsonObject7, jsonWriter19);
        com.google.gson.JsonArray jsonArray23 = new com.google.gson.JsonArray();
        jsonArray23.add((java.lang.Number) 1);
        int int26 = jsonArray23.size();
        java.lang.Number number27 = jsonArray23.getAsNumber();
        java.math.BigInteger bigInteger28 = jsonArray23.getAsBigInteger();
        double double29 = jsonArray23.getAsDouble();
        boolean boolean30 = jsonArray23.getAsBoolean();
        double double31 = jsonArray23.getAsDouble();
        boolean boolean32 = jsonObject7.equals((java.lang.Object) double31);
        com.google.gson.JsonPrimitive jsonPrimitive34 = jsonObject7.getAsJsonPrimitive("");
        com.google.gson.JsonArray jsonArray35 = new com.google.gson.JsonArray();
        jsonArray35.add("true");
        java.util.Iterator<com.google.gson.JsonElement> jsonElementItor38 = jsonArray35.iterator();
        char char39 = jsonArray35.getAsCharacter();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator40 = jsonArray35.spliterator();
        jsonArray35.add((java.lang.Boolean) true);
        boolean boolean43 = jsonObject7.equals((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNull(jsonElement9);
        org.junit.Assert.assertNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1 + "'", number27, 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jsonPrimitive34);
        org.junit.Assert.assertNotNull(jsonElementItor38);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + 't' + "'", char39 == 't');
        org.junit.Assert.assertNotNull(jsonElementSpliterator40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement9 = jsonObject7.get("null");
        com.google.gson.JsonElement jsonElement11 = jsonObject7.get("");
        com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber14 = new com.google.gson.internal.LazilyParsedNumber("true");
        jsonObject7.addProperty("false", (java.lang.Number) lazilyParsedNumber14);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter16 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter16.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter16.value(true);
        jsonWriter19.setSerializeNulls(false);
        gson0.toJson((com.google.gson.JsonElement) jsonObject7, jsonWriter19);
        com.google.gson.JsonArray jsonArray24 = new com.google.gson.JsonArray();
        jsonArray24.add("true");
        java.util.Iterator<com.google.gson.JsonElement> jsonElementItor27 = jsonArray24.iterator();
        java.lang.String str28 = jsonArray24.getAsString();
        com.google.gson.internal.Excluder excluder29 = com.google.gson.internal.Excluder.DEFAULT;
        com.google.gson.internal.Excluder excluder30 = excluder29.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder31 = excluder30.excludeFieldsWithoutExposeAnnotation();
        boolean boolean32 = jsonArray24.equals((java.lang.Object) excluder31);
        boolean boolean33 = jsonArray24.isJsonPrimitive();
        java.lang.String str34 = jsonArray24.getAsString();
        com.google.gson.internal.bind.SqlDateTypeAdapter sqlDateTypeAdapter35 = new com.google.gson.internal.bind.SqlDateTypeAdapter();
        com.google.gson.TypeAdapter<java.lang.Boolean> booleanTypeAdapter36 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN;
        com.google.gson.TypeAdapter<java.lang.Boolean> booleanTypeAdapter37 = booleanTypeAdapter36.nullSafe();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter38 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter40 = jsonTreeWriter38.value((double) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter42 = jsonTreeWriter38.value((long) (short) 0);
        jsonTreeWriter38.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter46 = jsonTreeWriter38.value("null");
        com.google.gson.stream.JsonWriter jsonWriter48 = jsonWriter46.value((double) (byte) 1);
        booleanTypeAdapter36.write(jsonWriter48, (java.lang.Boolean) false);
        java.sql.Date date51 = null;
        sqlDateTypeAdapter35.write(jsonWriter48, date51);
        com.google.gson.TypeAdapter<java.sql.Date> dateTypeAdapter53 = sqlDateTypeAdapter35.nullSafe();
        boolean boolean54 = jsonArray24.equals((java.lang.Object) sqlDateTypeAdapter35);
        com.google.gson.JsonElement jsonElement56 = jsonArray24.remove(0);
        jsonObject7.add("com.google.gson.JsonParseException: hi!", jsonElement56);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNull(jsonElement9);
        org.junit.Assert.assertNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonElementItor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "true" + "'", str28, "true");
        org.junit.Assert.assertNotNull(excluder29);
        org.junit.Assert.assertNotNull(excluder30);
        org.junit.Assert.assertNotNull(excluder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "true" + "'", str34, "true");
        org.junit.Assert.assertNotNull(booleanTypeAdapter36);
        org.junit.Assert.assertNotNull(booleanTypeAdapter37);
        org.junit.Assert.assertNotNull(jsonWriter40);
        org.junit.Assert.assertNotNull(jsonWriter42);
        org.junit.Assert.assertNotNull(jsonWriter46);
        org.junit.Assert.assertNotNull(jsonWriter48);
        org.junit.Assert.assertNotNull(dateTypeAdapter53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonElement56);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.JsonElement jsonElement9 = jsonObject7.get("null");
        com.google.gson.JsonElement jsonElement11 = jsonObject7.get("");
        com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber14 = new com.google.gson.internal.LazilyParsedNumber("true");
        jsonObject7.addProperty("false", (java.lang.Number) lazilyParsedNumber14);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter16 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter16.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter16.value(true);
        jsonWriter19.setSerializeNulls(false);
        gson0.toJson((com.google.gson.JsonElement) jsonObject7, jsonWriter19);
        com.google.gson.JsonArray jsonArray23 = new com.google.gson.JsonArray();
        jsonArray23.add((java.lang.Number) 1);
        int int26 = jsonArray23.size();
        java.lang.Number number27 = jsonArray23.getAsNumber();
        java.math.BigInteger bigInteger28 = jsonArray23.getAsBigInteger();
        double double29 = jsonArray23.getAsDouble();
        boolean boolean30 = jsonArray23.getAsBoolean();
        double double31 = jsonArray23.getAsDouble();
        boolean boolean32 = jsonObject7.equals((java.lang.Object) double31);
        com.google.gson.JsonPrimitive jsonPrimitive34 = jsonObject7.getAsJsonPrimitive("");
        com.google.gson.JsonObject jsonObject36 = jsonObject7.getAsJsonObject("");
        com.google.gson.internal.LazilyParsedNumber lazilyParsedNumber39 = new com.google.gson.internal.LazilyParsedNumber("com.google.gson.JsonIOException: com.google.gson.internal.bind.TypeAdapters$3");
        // The following exception was thrown during execution in test generation
        try {
            jsonObject36.addProperty("com.google.gson.JsonParseException", (java.lang.Number) lazilyParsedNumber39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNull(jsonElement9);
        org.junit.Assert.assertNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonWriter17);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + number27 + "' != '" + 1 + "'", number27, 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jsonPrimitive34);
        org.junit.Assert.assertNull(jsonObject36);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        com.google.gson.JsonPrimitive jsonPrimitive8 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) 10);
        java.math.BigInteger bigInteger9 = jsonPrimitive8.getAsBigInteger();
        java.lang.String str10 = jsonPrimitive8.getAsString();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter11 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter11.value((double) 1.0f);
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter11.value((long) (short) 0);
        jsonTreeWriter11.setSerializeNulls(true);
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter11.value((double) '4');
        com.google.gson.JsonElement jsonElement20 = jsonTreeWriter11.get();
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter11.beginArray();
        gson0.toJson((com.google.gson.JsonElement) jsonPrimitive8, jsonWriter21);
        com.google.gson.JsonPrimitive jsonPrimitive23 = jsonPrimitive8.getAsJsonPrimitive();
        short short24 = jsonPrimitive23.getAsShort();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(jsonWriter13);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter19);
        org.junit.Assert.assertNotNull(jsonElement20);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonPrimitive23);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.internal.ConstructorConstructor constructorConstructor1 = null;
        com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory3 = new com.google.gson.internal.bind.MapTypeAdapterFactory(constructorConstructor1, true);
        java.lang.String str4 = gson0.toJson((java.lang.Object) constructorConstructor1);
        java.lang.Object obj5 = null;
        com.google.gson.JsonElement jsonElement6 = gson0.toJsonTree(obj5);
        java.lang.String str7 = gson0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(jsonElement6);
    }
}

