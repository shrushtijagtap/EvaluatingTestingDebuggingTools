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
        com.alibaba.fastjson.parser.ParserConfig parserConfig1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = com.alibaba.fastjson.JSON.parse("hi!", parserConfig1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature2 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray3 = new com.alibaba.fastjson.serializer.SerializerFeature[] { serializerFeature2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) 100.0f, 100, serializerFeatureArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializerFeatureArray3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj1 = com.alibaba.fastjson.JSON.toJSON((java.lang.Object) (-1L));
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + (-1L) + "'", obj1, (-1L));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString;
        int int1 = serializerFeature0.getMask();
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        java.lang.Object obj2 = com.alibaba.fastjson.JSON.toJSON((java.lang.Object) 0L, serializeConfig1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 0L + "'", obj2, 0L);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.alibaba.fastjson.parser.ParserConfig parserConfig1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = com.alibaba.fastjson.JSON.parse("hi!", parserConfig1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringKeyAsString;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringKeyAsString + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringKeyAsString));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj2 = com.alibaba.fastjson.JSON.parse("", (int) (short) -1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        java.lang.reflect.Type type2 = null;
        com.alibaba.fastjson.parser.ParserConfig parserConfig3 = null;
        com.alibaba.fastjson.parser.deserializer.ParseProcess parseProcess4 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray7 = new com.alibaba.fastjson.parser.Feature[] {};
        com.alibaba.fastjson.JSONObject jSONObject8 = com.alibaba.fastjson.JSON.parseObject("", featureArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = com.alibaba.fastjson.JSON.parseObject(inputStream0, charset1, type2, parserConfig3, parseProcess4, 0, featureArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray7);
        org.junit.Assert.assertNull(jSONObject8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        boolean boolean1 = com.alibaba.fastjson.JSON.isValid("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.nio.charset.Charset charset0 = null;
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig2 = null;
        java.lang.Object obj3 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter4 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray5 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter4 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray6 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str7 = com.alibaba.fastjson.JSON.toJSONString(obj3, serializeFilterArray5, serializerFeatureArray6);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray12 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray13 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray12);
        int int14 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray12);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = com.alibaba.fastjson.JSON.toJSONBytes(charset0, (java.lang.Object) "hi!", serializeConfig2, serializeFilterArray5, "", (int) '4', serializerFeatureArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray5);
        org.junit.Assert.assertNotNull(serializerFeatureArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[48]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.Locale locale0 = null;
        com.alibaba.fastjson.JSON.defaultLocale = locale0;
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String str2 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) "null", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"null\"" + "'", str2, "\"null\"");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        char[] charArray5 = new char[] { '#', '4', '#', '4', ' ' };
        java.lang.reflect.Type type7 = null;
        com.alibaba.fastjson.parser.Feature feature8 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray9 = new com.alibaba.fastjson.parser.Feature[] { feature8 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable10 = com.alibaba.fastjson.JSON.parseObject(charArray5, (int) (byte) -1, type7, featureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, 4, #, 4,  ]");
        org.junit.Assert.assertNotNull(featureArray9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object> objList2 = com.alibaba.fastjson.JSON.parseArray("\"4\"", typeArray1);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: syntax error : string");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.QuoteFieldNames;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.QuoteFieldNames + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.QuoteFieldNames));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String str0 = com.alibaba.fastjson.JSON.DEFFAULT_DATE_FORMAT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd HH:mm:ss" + "'", str0, "yyyy-MM-dd HH:mm:ss");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Object obj1 = com.alibaba.fastjson.JSON.parse("");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        java.lang.Object obj2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter3 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray4 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter3 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str6 = com.alibaba.fastjson.JSON.toJSONString(obj2, serializeFilterArray4, serializerFeatureArray5);
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig7 = null;
        java.lang.Object obj8 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter9 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray10 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter9 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray11 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str12 = com.alibaba.fastjson.JSON.toJSONString(obj8, serializeFilterArray10, serializerFeatureArray11);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray17 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray18 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.alibaba.fastjson.JSON.writeJSONString(outputStream0, charset1, (java.lang.Object) serializeFilterArray4, serializeConfig7, serializeFilterArray10, "\"a\"", 0, serializerFeatureArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray4);
        org.junit.Assert.assertNotNull(serializerFeatureArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(serializeFilterArray10);
        org.junit.Assert.assertNotNull(serializerFeatureArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[48]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.String str0 = com.alibaba.fastjson.JSON.VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "1.2.61" + "'", str0, "1.2.61");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray2 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray3 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray2);
        java.nio.charset.Charset charset4 = null;
        java.lang.reflect.Type type5 = null;
        com.alibaba.fastjson.parser.ParserConfig parserConfig6 = null;
        com.alibaba.fastjson.parser.deserializer.ParseProcess parseProcess7 = null;
        java.lang.reflect.Type type10 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray12 = new com.alibaba.fastjson.parser.Feature[] {};
        com.alibaba.fastjson.JSONObject jSONObject13 = com.alibaba.fastjson.JSON.parseObject("", featureArray12);
        java.io.Serializable serializable14 = com.alibaba.fastjson.JSON.parseObject("null", type10, featureArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.Feature[] featureArray15 = com.alibaba.fastjson.JSON.parseObject(byteArray3, charset4, type5, parserConfig6, parseProcess7, (int) (short) 0, featureArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializerFeatureArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[48]");
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertNull(jSONObject13);
        org.junit.Assert.assertNull(serializable14);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.IgnoreErrorGetter;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.IgnoreErrorGetter + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.IgnoreErrorGetter));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int0 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3089 + "'", int0 == 3089);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.reflect.Type type1 = null;
        com.alibaba.fastjson.parser.ParserConfig parserConfig2 = null;
        com.alibaba.fastjson.parser.deserializer.ParseProcess parseProcess3 = null;
        java.lang.reflect.Type type6 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray8 = new com.alibaba.fastjson.parser.Feature[] {};
        com.alibaba.fastjson.JSONObject jSONObject9 = com.alibaba.fastjson.JSON.parseObject("", featureArray8);
        java.io.Serializable serializable10 = com.alibaba.fastjson.JSON.parseObject("null", type6, featureArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = com.alibaba.fastjson.JSON.parseObject("1.2.61", type1, parserConfig2, parseProcess3, 8, featureArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNull(jSONObject9);
        org.junit.Assert.assertNull(serializable10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE = (short) 100;
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.alibaba.fastjson.parser.ParserConfig parserConfig1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = com.alibaba.fastjson.JSON.parse("\"a\"", parserConfig1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter2 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray6 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray5);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) (short) -1, serializeConfig1, serializeFilter2, serializerFeatureArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializerFeatureArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48]");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.alibaba.fastjson.parser.ParserConfig parserConfig1 = null;
        java.lang.Object obj2 = com.alibaba.fastjson.JSON.toJSON((java.lang.Object) (short) 10, parserConfig1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (short) 10 + "'", obj2, (short) 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.String str1 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0" + "'", str1, "-1.0");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.TimeZone timeZone0 = com.alibaba.fastjson.JSON.defaultTimeZone;
        com.alibaba.fastjson.JSON.defaultTimeZone = timeZone0;
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Central Standard Time");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteDateUseDateFormat;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.WriteDateUseDateFormat + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.WriteDateUseDateFormat));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        java.lang.Object obj2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter3 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray4 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter3 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str6 = com.alibaba.fastjson.JSON.toJSONString(obj2, serializeFilterArray4, serializerFeatureArray5);
        java.io.Writer writer10 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray13 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray14 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray13);
        int int15 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray13);
        com.alibaba.fastjson.JSON.writeJSONStringTo((java.lang.Object) 100.0d, writer10, serializerFeatureArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) (short) 0, serializeConfig1, serializeFilterArray4, "yyyy-MM-dd HH:mm:ss", 0, serializerFeatureArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray4);
        org.junit.Assert.assertNotNull(serializerFeatureArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[48]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Object obj0 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray2 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter1 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray3 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str4 = com.alibaba.fastjson.JSON.toJSONString(obj0, serializeFilterArray2, serializerFeatureArray3);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter5 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray8 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray9 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray8);
        byte[] byteArray10 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilterArray2, serializeFilter5, serializerFeatureArray8);
        java.nio.charset.CharsetDecoder charsetDecoder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = com.alibaba.fastjson.JSON.parse(byteArray10, (int) (byte) 10, (int) 'a', charsetDecoder13, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray2);
        org.junit.Assert.assertNotNull(serializerFeatureArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[48]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[91, 110, 117, 108, 108, 93]");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.alibaba.fastjson.parser.Feature[] featureArray1 = new com.alibaba.fastjson.parser.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.JSONObject jSONObject2 = com.alibaba.fastjson.JSON.parseObject("hi!", featureArray1);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: syntax error, pos 1, line 1, column 2hi!");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.Locale locale0 = com.alibaba.fastjson.JSON.defaultLocale;
        org.junit.Assert.assertNull(locale0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.UseISO8601DateFormat;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.UseISO8601DateFormat + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.UseISO8601DateFormat));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue;
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter2 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray6 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray5);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializerFeature0, serializeConfig1, serializeFilter2, serializerFeatureArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue));
        org.junit.Assert.assertNotNull(serializerFeatureArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48]");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.lang.Object obj0 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray2 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter1 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray3 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str4 = com.alibaba.fastjson.JSON.toJSONString(obj0, serializeFilterArray2, serializerFeatureArray3);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter5 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray8 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray9 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray8);
        byte[] byteArray10 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilterArray2, serializeFilter5, serializerFeatureArray8);
        java.lang.Object obj11 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter12 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray13 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter12 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray14 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str15 = com.alibaba.fastjson.JSON.toJSONString(obj11, serializeFilterArray13, serializerFeatureArray14);
        byte[] byteArray16 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilter5, serializerFeatureArray14);
        java.nio.charset.Charset charset19 = null;
        java.lang.Object obj20 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter21 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray22 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter21 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray23 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str24 = com.alibaba.fastjson.JSON.toJSONString(obj20, serializeFilterArray22, serializerFeatureArray23);
        java.lang.Class<?> wildcardClass25 = serializerFeatureArray23.getClass();
        com.alibaba.fastjson.parser.Feature[] featureArray26 = new com.alibaba.fastjson.parser.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = com.alibaba.fastjson.JSON.parseObject(byteArray16, (int) 'a', (int) (byte) 0, charset19, (java.lang.reflect.Type) wildcardClass25, featureArray26);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: expect '[', but EOF, pos 0, line 1, column 1");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray2);
        org.junit.Assert.assertNotNull(serializerFeatureArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[48]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[91, 110, 117, 108, 108, 93]");
        org.junit.Assert.assertNotNull(serializeFilterArray13);
        org.junit.Assert.assertNotNull(serializerFeatureArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[110, 117, 108, 108]");
        org.junit.Assert.assertNotNull(serializeFilterArray22);
        org.junit.Assert.assertNotNull(serializerFeatureArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(featureArray26);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.io.OutputStream outputStream0 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray6 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.alibaba.fastjson.JSON.writeJSONString(outputStream0, (java.lang.Object) 0.0f, (int) (byte) 100, serializerFeatureArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializerFeatureArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48]");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Object obj0 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray2 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter1 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray3 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str4 = com.alibaba.fastjson.JSON.toJSONString(obj0, serializeFilterArray2, serializerFeatureArray3);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter5 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray8 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray9 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray8);
        byte[] byteArray10 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilterArray2, serializeFilter5, serializerFeatureArray8);
        java.nio.charset.CharsetDecoder charsetDecoder13 = null;
        java.lang.Object obj14 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter15 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray16 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter15 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray17 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str18 = com.alibaba.fastjson.JSON.toJSONString(obj14, serializeFilterArray16, serializerFeatureArray17);
        java.lang.Class<?> wildcardClass19 = serializerFeatureArray17.getClass();
        com.alibaba.fastjson.parser.Feature feature20 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray21 = new com.alibaba.fastjson.parser.Feature[] { feature20 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type22 = com.alibaba.fastjson.JSON.parseObject(byteArray10, (int) (byte) 1, 1, charsetDecoder13, (java.lang.reflect.Type) wildcardClass19, featureArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray2);
        org.junit.Assert.assertNotNull(serializerFeatureArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[48]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[91, 110, 117, 108, 108, 93]");
        org.junit.Assert.assertNotNull(serializeFilterArray16);
        org.junit.Assert.assertNotNull(serializerFeatureArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(featureArray21);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.SkipTransientField;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.SkipTransientField + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.SkipTransientField));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty;
        java.lang.Object obj2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter3 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray4 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter3 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str6 = com.alibaba.fastjson.JSON.toJSONString(obj2, serializeFilterArray4, serializerFeatureArray5);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter7 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray10 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray11 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray10);
        byte[] byteArray12 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilterArray4, serializeFilter7, serializerFeatureArray10);
        java.lang.Object obj13 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter14 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray15 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter14 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray16 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str17 = com.alibaba.fastjson.JSON.toJSONString(obj13, serializeFilterArray15, serializerFeatureArray16);
        byte[] byteArray18 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilter7, serializerFeatureArray16);
        java.lang.String str19 = com.alibaba.fastjson.JSON.toJSONStringWithDateFormat((java.lang.Object) serializerFeature0, "\"null\"", serializerFeatureArray16);
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty));
        org.junit.Assert.assertNotNull(serializeFilterArray4);
        org.junit.Assert.assertNotNull(serializerFeatureArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[91, 110, 117, 108, 108, 93]");
        org.junit.Assert.assertNotNull(serializeFilterArray15);
        org.junit.Assert.assertNotNull(serializerFeatureArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[110, 117, 108, 108]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"WriteNullListAsEmpty\"" + "'", str19, "\"WriteNullListAsEmpty\"");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        int int0 = com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.io.InputStream inputStream0 = null;
        java.lang.Object obj1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray3 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter2 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str5 = com.alibaba.fastjson.JSON.toJSONString(obj1, serializeFilterArray3, serializerFeatureArray4);
        java.lang.Class<?> wildcardClass6 = serializerFeatureArray4.getClass();
        com.alibaba.fastjson.parser.Feature[] featureArray8 = new com.alibaba.fastjson.parser.Feature[] {};
        com.alibaba.fastjson.JSONObject jSONObject9 = com.alibaba.fastjson.JSON.parseObject("", featureArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone10 = com.alibaba.fastjson.JSON.parseObject(inputStream0, (java.lang.reflect.Type) wildcardClass6, featureArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray3);
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNull(jSONObject9);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.Object obj1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray3 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter2 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str5 = com.alibaba.fastjson.JSON.toJSONString(obj1, serializeFilterArray3, serializerFeatureArray4);
        java.lang.Class<?> wildcardClass6 = serializerFeatureArray4.getClass();
        com.alibaba.fastjson.parser.Feature[] featureArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = com.alibaba.fastjson.JSON.parseObject("hi!", (java.lang.reflect.Type) wildcardClass6, featureArray7);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: expect '[', but error, pos 1, line 1, column 2hi!");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray3);
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.alibaba.fastjson.JSON.parse("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: syntax error, pos 1, line 1, column 2hi!");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        java.nio.charset.Charset charset4 = null;
        java.lang.Object obj5 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter6 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray7 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter6 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray8 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str9 = com.alibaba.fastjson.JSON.toJSONString(obj5, serializeFilterArray7, serializerFeatureArray8);
        java.lang.Class<?> wildcardClass10 = serializerFeatureArray8.getClass();
        com.alibaba.fastjson.parser.Feature[] featureArray12 = new com.alibaba.fastjson.parser.Feature[] {};
        com.alibaba.fastjson.JSONObject jSONObject13 = com.alibaba.fastjson.JSON.parseObject("", featureArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.SerializerFeature serializerFeature14 = com.alibaba.fastjson.JSON.parseObject(byteArray1, (-1), (int) (short) 0, charset4, (java.lang.reflect.Type) wildcardClass10, featureArray12);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: expect '[', but EOF, pos 0, line 1, column 1");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(serializeFilterArray7);
        org.junit.Assert.assertNotNull(serializerFeatureArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(featureArray12);
        org.junit.Assert.assertNull(jSONObject13);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray5 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray4);
        int int6 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) "yyyy-MM-dd HH:mm:ss", serializeConfig1, serializerFeatureArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[48]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.io.OutputStream outputStream0 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray6 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray7 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray6);
        java.lang.String str8 = com.alibaba.fastjson.JSON.toJSONStringWithDateFormat((java.lang.Object) 'a', "hi!", serializerFeatureArray6);
        byte[] byteArray9 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) "\"WriteNullListAsEmpty\"", serializerFeatureArray6);
        java.lang.Object obj11 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter12 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray13 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter12 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray14 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str15 = com.alibaba.fastjson.JSON.toJSONString(obj11, serializeFilterArray13, serializerFeatureArray14);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter16 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray19 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray20 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray19);
        byte[] byteArray21 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilterArray13, serializeFilter16, serializerFeatureArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.alibaba.fastjson.JSON.writeJSONString(outputStream0, (java.lang.Object) serializerFeatureArray6, 3089, serializerFeatureArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializerFeatureArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[48]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"a\"" + "'", str8, "\"a\"");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[34, 92, 34, 87, 114, 105, 116, 101, 78, 117, 108, 108, 76, 105, 115, 116, 65, 115, 69, 109, 112, 116, 121, 92, 34, 34]");
        org.junit.Assert.assertNotNull(serializeFilterArray13);
        org.junit.Assert.assertNotNull(serializerFeatureArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[91, 110, 117, 108, 108, 93]");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray2 = null;
        java.lang.Object obj3 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter4 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray5 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter4 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray6 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str7 = com.alibaba.fastjson.JSON.toJSONString(obj3, serializeFilterArray5, serializerFeatureArray6);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter8 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray11 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray12 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray11);
        byte[] byteArray13 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilterArray5, serializeFilter8, serializerFeatureArray11);
        java.lang.Object obj14 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter15 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray16 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter15 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray17 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str18 = com.alibaba.fastjson.JSON.toJSONString(obj14, serializeFilterArray16, serializerFeatureArray17);
        byte[] byteArray19 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilter8, serializerFeatureArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) (short) 1, serializeConfig1, serializeFilterArray2, serializerFeatureArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray5);
        org.junit.Assert.assertNotNull(serializerFeatureArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[48]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[91, 110, 117, 108, 108, 93]");
        org.junit.Assert.assertNotNull(serializeFilterArray16);
        org.junit.Assert.assertNotNull(serializerFeatureArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[110, 117, 108, 108]");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.String str0 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "@type" + "'", str0, "@type");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.lang.Object obj0 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray2 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter1 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray3 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str4 = com.alibaba.fastjson.JSON.toJSONString(obj0, serializeFilterArray2, serializerFeatureArray3);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter5 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray8 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray9 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray8);
        byte[] byteArray10 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilterArray2, serializeFilter5, serializerFeatureArray8);
        java.lang.Object obj11 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter12 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray13 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter12 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray14 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str15 = com.alibaba.fastjson.JSON.toJSONString(obj11, serializeFilterArray13, serializerFeatureArray14);
        byte[] byteArray16 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilter5, serializerFeatureArray14);
        com.alibaba.fastjson.parser.Feature[] featureArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = com.alibaba.fastjson.JSON.parse(byteArray16, featureArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray2);
        org.junit.Assert.assertNotNull(serializerFeatureArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[48]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[91, 110, 117, 108, 108, 93]");
        org.junit.Assert.assertNotNull(serializeFilterArray13);
        org.junit.Assert.assertNotNull(serializerFeatureArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[110, 117, 108, 108]");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.alibaba.fastjson.JSON.parse("yyyy-MM-dd HH:mm:ss", (int) ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: syntax error, pos 1, line 1, column 2yyyy-MM-dd HH:mm:ss");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray5 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray4);
        int int6 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray4);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray9 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray10 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.alibaba.fastjson.JSON.writeJSONString(outputStream0, charset1, (java.lang.Object) serializerFeatureArray4, serializerFeatureArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[48]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(serializerFeatureArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[48]");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature1 = com.alibaba.fastjson.serializer.SerializerFeature.MapSortField;
        int int3 = com.alibaba.fastjson.serializer.SerializerFeature.config((int) (byte) 1, serializerFeature1, true);
        org.junit.Assert.assertTrue("'" + serializerFeature1 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.MapSortField + "'", serializerFeature1.equals(com.alibaba.fastjson.serializer.SerializerFeature.MapSortField));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 536870913 + "'", int3 == 536870913);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.SortField;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.SortField + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.SortField));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.lang.Object obj1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray3 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter2 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str5 = com.alibaba.fastjson.JSON.toJSONString(obj1, serializeFilterArray3, serializerFeatureArray4);
        java.lang.Class<?> wildcardClass6 = serializerFeatureArray4.getClass();
        com.alibaba.fastjson.parser.deserializer.ParseProcess parseProcess7 = null;
        java.lang.reflect.Type type9 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray11 = new com.alibaba.fastjson.parser.Feature[] {};
        com.alibaba.fastjson.JSONObject jSONObject12 = com.alibaba.fastjson.JSON.parseObject("", featureArray11);
        java.io.Serializable serializable13 = com.alibaba.fastjson.JSON.parseObject("null", type9, featureArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type14 = com.alibaba.fastjson.JSON.parseObject("@type", (java.lang.reflect.Type) wildcardClass6, parseProcess7, featureArray11);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: expect '[', but error, pos 1, line 1, column 2@type");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray3);
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNull(jSONObject12);
        org.junit.Assert.assertNull(serializable13);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.lang.Object obj1 = com.alibaba.fastjson.JSON.parse("\"WriteNullListAsEmpty\"");
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + "WriteNullListAsEmpty" + "'", obj1, "WriteNullListAsEmpty");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.lang.String str1 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) 1.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0" + "'", str1, "1.0");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.lang.Object obj1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray3 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter2 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str5 = com.alibaba.fastjson.JSON.toJSONString(obj1, serializeFilterArray3, serializerFeatureArray4);
        java.lang.Class<?> wildcardClass6 = serializerFeatureArray4.getClass();
        com.alibaba.fastjson.parser.Feature[] featureArray8 = new com.alibaba.fastjson.parser.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = com.alibaba.fastjson.JSON.parseObject("\"WriteNullListAsEmpty\"", (java.lang.reflect.Type) wildcardClass6, (int) (byte) 1, featureArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast [B to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray3);
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(featureArray8);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        java.lang.Object obj0 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray2 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter1 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray3 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str4 = com.alibaba.fastjson.JSON.toJSONString(obj0, serializeFilterArray2, serializerFeatureArray3);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter5 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray8 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray9 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray8);
        byte[] byteArray10 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilterArray2, serializeFilter5, serializerFeatureArray8);
        java.lang.Object obj11 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter12 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray13 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter12 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray14 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str15 = com.alibaba.fastjson.JSON.toJSONString(obj11, serializeFilterArray13, serializerFeatureArray14);
        byte[] byteArray16 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) serializeFilter5, serializerFeatureArray14);
        java.nio.charset.CharsetDecoder charsetDecoder19 = null;
        java.lang.Object obj20 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter21 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray22 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter21 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray23 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str24 = com.alibaba.fastjson.JSON.toJSONString(obj20, serializeFilterArray22, serializerFeatureArray23);
        java.lang.Class<?> wildcardClass25 = serializerFeatureArray23.getClass();
        com.alibaba.fastjson.JSON.removeMixInAnnotations((java.lang.reflect.Type) wildcardClass25);
        com.alibaba.fastjson.parser.Feature[] featureArray27 = new com.alibaba.fastjson.parser.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.SerializerFeature serializerFeature28 = com.alibaba.fastjson.JSON.parseObject(byteArray16, (int) (short) 100, (int) (byte) -1, charsetDecoder19, (java.lang.reflect.Type) wildcardClass25, featureArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray2);
        org.junit.Assert.assertNotNull(serializerFeatureArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(serializerFeatureArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[48]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[91, 110, 117, 108, 108, 93]");
        org.junit.Assert.assertNotNull(serializeFilterArray13);
        org.junit.Assert.assertNotNull(serializerFeatureArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[110, 117, 108, 108]");
        org.junit.Assert.assertNotNull(serializeFilterArray22);
        org.junit.Assert.assertNotNull(serializerFeatureArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null" + "'", str24, "null");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(featureArray27);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.IgnoreNonFieldGetter;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.IgnoreNonFieldGetter + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.IgnoreNonFieldGetter));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray6 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray5);
        java.lang.String str7 = com.alibaba.fastjson.JSON.toJSONStringWithDateFormat((java.lang.Object) 'a', "hi!", serializerFeatureArray5);
        byte[] byteArray8 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) "\"WriteNullListAsEmpty\"", serializerFeatureArray5);
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig9 = null;
        java.lang.Object obj10 = com.alibaba.fastjson.JSON.toJSON((java.lang.Object) "\"WriteNullListAsEmpty\"", serializeConfig9);
        org.junit.Assert.assertNotNull(serializerFeatureArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"a\"" + "'", str7, "\"a\"");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[34, 92, 34, 87, 114, 105, 116, 101, 78, 117, 108, 108, 76, 105, 115, 116, 65, 115, 69, 109, 112, 116, 121, 92, 34, 34]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "\"WriteNullListAsEmpty\"" + "'", obj10, "\"WriteNullListAsEmpty\"");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        java.lang.Object obj2 = com.alibaba.fastjson.JSON.toJSON((java.lang.Object) (byte) 0, serializeConfig1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.lang.Object obj1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray3 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter2 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str5 = com.alibaba.fastjson.JSON.toJSONString(obj1, serializeFilterArray3, serializerFeatureArray4);
        java.lang.Class<?> wildcardClass6 = serializerFeatureArray4.getClass();
        com.alibaba.fastjson.parser.deserializer.ParseProcess parseProcess7 = null;
        java.lang.reflect.Type type9 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray11 = new com.alibaba.fastjson.parser.Feature[] {};
        com.alibaba.fastjson.JSONObject jSONObject12 = com.alibaba.fastjson.JSON.parseObject("", featureArray11);
        java.io.Serializable serializable13 = com.alibaba.fastjson.JSON.parseObject("null", type9, featureArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence14 = com.alibaba.fastjson.JSON.parseObject("hi!", (java.lang.reflect.Type) wildcardClass6, parseProcess7, featureArray11);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson.JSONException; message: expect '[', but error, pos 1, line 1, column 2hi!");
        } catch (com.alibaba.fastjson.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray3);
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(featureArray11);
        org.junit.Assert.assertNull(jSONObject12);
        org.junit.Assert.assertNull(serializable13);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteTabAsSpecial;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.WriteTabAsSpecial + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.WriteTabAsSpecial));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.lang.String str1 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.alibaba.fastjson.serializer.SerializerFeature.isEnabled((int) (short) 1, 10, serializerFeature2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.alibaba.fastjson.parser.Feature feature1 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray2 = new com.alibaba.fastjson.parser.Feature[] { feature1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = com.alibaba.fastjson.JSON.parse("null", featureArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray2);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray2 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter1 };
        java.io.Writer writer4 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray7 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray8 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray7);
        int int9 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray7);
        com.alibaba.fastjson.JSON.writeJSONStringTo((java.lang.Object) 100.0d, writer4, serializerFeatureArray7);
        java.lang.String str11 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) '4', serializeFilterArray2, serializerFeatureArray7);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter13 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray14 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter13 };
        java.io.Writer writer16 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray19 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray20 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray19);
        int int21 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray19);
        com.alibaba.fastjson.JSON.writeJSONStringTo((java.lang.Object) 100.0d, writer16, serializerFeatureArray19);
        java.lang.String str23 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) '4', serializeFilterArray14, serializerFeatureArray19);
        java.lang.String str24 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) serializeFilterArray2, serializerFeatureArray19);
        org.junit.Assert.assertNotNull(serializeFilterArray2);
        org.junit.Assert.assertNotNull(serializerFeatureArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4\"" + "'", str11, "\"4\"");
        org.junit.Assert.assertNotNull(serializeFilterArray14);
        org.junit.Assert.assertNotNull(serializerFeatureArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"4\"" + "'", str23, "\"4\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[null]" + "'", str24, "[null]");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        java.io.OutputStream outputStream0 = null;
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature1 = com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial;
        java.lang.Object obj2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter3 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray4 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter3 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray5 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str6 = com.alibaba.fastjson.JSON.toJSONString(obj2, serializeFilterArray4, serializerFeatureArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.alibaba.fastjson.JSON.writeJSONString(outputStream0, (java.lang.Object) serializerFeature1, serializerFeatureArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + serializerFeature1 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial + "'", serializerFeature1.equals(com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial));
        org.junit.Assert.assertNotNull(serializeFilterArray4);
        org.junit.Assert.assertNotNull(serializerFeatureArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray5 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray4);
        int int6 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray4);
        java.lang.String str7 = com.alibaba.fastjson.JSON.toJSONStringWithDateFormat((java.lang.Object) false, "null", serializerFeatureArray4);
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[48]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "false" + "'", str7, "false");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        boolean boolean1 = com.alibaba.fastjson.JSON.isValid("[null]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter3 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray4 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter3 };
        java.io.Writer writer6 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray9 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray10 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray9);
        int int11 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray9);
        com.alibaba.fastjson.JSON.writeJSONStringTo((java.lang.Object) 100.0d, writer6, serializerFeatureArray9);
        java.lang.String str13 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) '4', serializeFilterArray4, serializerFeatureArray9);
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter15 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray16 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter15 };
        java.io.Writer writer18 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray21 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray22 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray21);
        int int23 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray21);
        com.alibaba.fastjson.JSON.writeJSONStringTo((java.lang.Object) 100.0d, writer18, serializerFeatureArray21);
        java.lang.String str25 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) '4', serializeFilterArray16, serializerFeatureArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) "1.2.61", serializeConfig1, serializeFilterArray4, serializerFeatureArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray4);
        org.junit.Assert.assertNotNull(serializerFeatureArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[48]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"4\"" + "'", str13, "\"4\"");
        org.junit.Assert.assertNotNull(serializeFilterArray16);
        org.junit.Assert.assertNotNull(serializerFeatureArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[48]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"4\"" + "'", str25, "\"4\"");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        java.lang.Object obj1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter2 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray3 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter2 };
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray4 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        java.lang.String str5 = com.alibaba.fastjson.JSON.toJSONString(obj1, serializeFilterArray3, serializerFeatureArray4);
        java.lang.Class<?> wildcardClass6 = serializerFeatureArray4.getClass();
        com.alibaba.fastjson.parser.ParserConfig parserConfig7 = null;
        com.alibaba.fastjson.parser.Feature[] featureArray8 = new com.alibaba.fastjson.parser.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration9 = com.alibaba.fastjson.JSON.parseObject("[null]", (java.lang.reflect.Type) wildcardClass6, parserConfig7, featureArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray3);
        org.junit.Assert.assertNotNull(serializerFeatureArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(featureArray8);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.alibaba.fastjson.serializer.SerializeConfig serializeConfig1 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray2 = new com.alibaba.fastjson.serializer.SerializeFilter[] {};
        com.alibaba.fastjson.serializer.SerializeFilter serializeFilter6 = null;
        com.alibaba.fastjson.serializer.SerializeFilter[] serializeFilterArray7 = new com.alibaba.fastjson.serializer.SerializeFilter[] { serializeFilter6 };
        java.io.Writer writer9 = null;
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray12 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray13 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray12);
        int int14 = com.alibaba.fastjson.serializer.SerializerFeature.of(serializerFeatureArray12);
        com.alibaba.fastjson.JSON.writeJSONStringTo((java.lang.Object) 100.0d, writer9, serializerFeatureArray12);
        java.lang.String str16 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) '4', serializeFilterArray7, serializerFeatureArray12);
        com.alibaba.fastjson.serializer.SerializerFeature[] serializerFeatureArray20 = new com.alibaba.fastjson.serializer.SerializerFeature[] {};
        byte[] byteArray21 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) 0, (int) (short) -1, serializerFeatureArray20);
        java.lang.String str22 = com.alibaba.fastjson.JSON.toJSONString((java.lang.Object) str16, (int) (byte) 1, serializerFeatureArray20);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = com.alibaba.fastjson.JSON.toJSONBytes((java.lang.Object) (byte) 100, serializeConfig1, serializeFilterArray2, "\"a\"", (int) (short) 10, serializerFeatureArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializeFilterArray2);
        org.junit.Assert.assertNotNull(serializeFilterArray7);
        org.junit.Assert.assertNotNull(serializerFeatureArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[48]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"4\"" + "'", str16, "\"4\"");
        org.junit.Assert.assertNotNull(serializerFeatureArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[48]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"4\\\"\"" + "'", str22, "\"\\\"4\\\"\"");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        com.alibaba.fastjson.serializer.SerializerFeature serializerFeature0 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCheckSpecialChar;
        org.junit.Assert.assertTrue("'" + serializerFeature0 + "' != '" + com.alibaba.fastjson.serializer.SerializerFeature.DisableCheckSpecialChar + "'", serializerFeature0.equals(com.alibaba.fastjson.serializer.SerializerFeature.DisableCheckSpecialChar));
    }
}

