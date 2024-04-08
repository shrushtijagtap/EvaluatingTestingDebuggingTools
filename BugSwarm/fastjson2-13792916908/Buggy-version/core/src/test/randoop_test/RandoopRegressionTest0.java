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
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject1 = com.alibaba.fastjson2.JSONObject.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: illegal input? offset 1, char h");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.time.Instant instant5 = jSONObject3.getInstant("");
        org.junit.Assert.assertNull(instant5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.alibaba.fastjson2.JSONObject jSONObject2 = com.alibaba.fastjson2.JSONObject.of("", (java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(jSONObject2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        java.lang.String str3 = com.alibaba.fastjson2.JSONObject.toJSONString((java.lang.Object) 10.0f, featureArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject4 = com.alibaba.fastjson2.JSONObject.from((java.lang.Object) "10.0", featureArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.alibaba.fastjson2.JSONObject");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.0" + "'", str3, "10.0");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean11 = jSONObject8.getBooleanValue("", true);
        java.util.Date date13 = jSONObject8.getDate("10.0");
        org.junit.Assert.assertNotNull(jSONObject8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj6 = jSONObject3.putIfAbsent("hi!", (java.lang.Object) "{}");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.alibaba.fastjson2.JSONObject jSONObject4 = com.alibaba.fastjson2.JSONObject.of("{}", (java.lang.Object) true, "10.0", (java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte byte6 = jSONObject4.getByte("{}");
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: Can not cast 'class java.lang.Boolean' to Byte");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONObject4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject12 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean15 = jSONObject12.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject19 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj22 = jSONObject19.getOrDefault("hi!", (java.lang.Object) 1.0f);
        boolean boolean23 = jSONObject3.remove((java.lang.Object) "", (java.lang.Object) jSONObject19);
        com.alibaba.fastjson2.JSONObject jSONObject30 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj32 = jSONObject30.get("");
        com.alibaba.fastjson2.JSONObject jSONObject34 = new com.alibaba.fastjson2.JSONObject();
        com.alibaba.fastjson2.JSONObject jSONObject39 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject48 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean51 = jSONObject48.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject55 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj58 = jSONObject55.getOrDefault("hi!", (java.lang.Object) 1.0f);
        boolean boolean59 = jSONObject39.remove((java.lang.Object) "", (java.lang.Object) jSONObject55);
        com.alibaba.fastjson2.JSONObject jSONObject60 = com.alibaba.fastjson2.JSONObject.of("{}", (java.lang.Object) "", "{}", (java.lang.Object) "", "10.0", (java.lang.Object) jSONObject34, "10.0", (java.lang.Object) boolean59);
        java.lang.Object obj61 = jSONObject3.get((java.lang.Object) "{}");
        com.alibaba.fastjson2.JSONObject jSONObject63 = jSONObject3.getJSONObject("10.0");
        org.junit.Assert.assertNotNull(jSONObject12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(jSONObject48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 1.0f + "'", obj58, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSONObject60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(jSONObject63);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        java.lang.Object obj6 = jSONObject3.getOrDefault("hi!", (java.lang.Object) 0);
        jSONObject3.clear();
        java.lang.Integer int9 = jSONObject3.getInteger("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.alibaba.fastjson2.JSONObject jSONObject6 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj9 = jSONObject6.put("10.0", (java.lang.Object) "");
        java.lang.Short short11 = jSONObject6.getShort("");
        com.alibaba.fastjson2.JSONObject jSONObject12 = com.alibaba.fastjson2.JSONObject.of("10.0", (java.lang.Object) 10.0f, "hi!", (java.lang.Object) jSONObject6);
        boolean boolean15 = jSONObject12.getBooleanValue("{}", true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(short11);
        org.junit.Assert.assertNotNull(jSONObject12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.alibaba.fastjson2.JSONObject jSONObject4 = com.alibaba.fastjson2.JSONObject.of("10.0", (java.lang.Object) 100L, "10.0", (java.lang.Object) '4');
        com.alibaba.fastjson2.JSONObject jSONObject8 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject17 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean20 = jSONObject17.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject24 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj27 = jSONObject24.getOrDefault("hi!", (java.lang.Object) 1.0f);
        boolean boolean28 = jSONObject8.remove((java.lang.Object) "", (java.lang.Object) jSONObject24);
        boolean boolean29 = jSONObject4.containsValue((java.lang.Object) boolean28);
        org.junit.Assert.assertNotNull(jSONObject4);
        org.junit.Assert.assertNotNull(jSONObject17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0f + "'", obj27, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.alibaba.fastjson2.JSONObject jSONObject1 = new com.alibaba.fastjson2.JSONObject(1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.alibaba.fastjson2.JSONObject jSONObject0 = new com.alibaba.fastjson2.JSONObject();
        java.lang.Object obj2 = jSONObject0.get((java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.alibaba.fastjson2.JSONObject jSONObject6 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj8 = jSONObject6.get("");
        com.alibaba.fastjson2.JSONObject jSONObject10 = new com.alibaba.fastjson2.JSONObject();
        com.alibaba.fastjson2.JSONObject jSONObject15 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject24 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean27 = jSONObject24.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject31 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj34 = jSONObject31.getOrDefault("hi!", (java.lang.Object) 1.0f);
        boolean boolean35 = jSONObject15.remove((java.lang.Object) "", (java.lang.Object) jSONObject31);
        com.alibaba.fastjson2.JSONObject jSONObject36 = com.alibaba.fastjson2.JSONObject.of("{}", (java.lang.Object) "", "{}", (java.lang.Object) "", "10.0", (java.lang.Object) jSONObject10, "10.0", (java.lang.Object) boolean35);
        com.alibaba.fastjson2.JSONObject jSONObject41 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject42 = new com.alibaba.fastjson2.JSONObject((java.util.Map) jSONObject41);
        com.alibaba.fastjson2.JSONArray jSONArray44 = jSONObject42.getJSONArray("10.0");
        java.lang.Object obj45 = jSONObject10.getOrDefault("10.0", (java.lang.Object) jSONArray44);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(jSONObject24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSONObject36);
        org.junit.Assert.assertNull(jSONArray44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        byte byte10 = jSONObject8.getByteValue("{}");
        org.junit.Assert.assertNotNull(jSONObject8);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        com.alibaba.fastjson2.JSONObject jSONObject10 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj13 = jSONObject10.put("10.0", (java.lang.Object) "");
        java.lang.Object obj14 = jSONObject3.getOrDefault("hi!", (java.lang.Object) jSONObject10);
        boolean boolean16 = jSONObject10.containsKey((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{\"10.0\":\"\"}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{\"10.0\":\"\"}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{\"10.0\":\"\"}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.alibaba.fastjson2.JSONObject jSONObject6 = com.alibaba.fastjson2.JSONObject.of("", (java.lang.Object) "hi!", "{}", (java.lang.Object) 1L, "10.0", (java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(jSONObject6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        java.lang.Boolean boolean7 = jSONObject3.getBoolean("");
        com.alibaba.fastjson2.filter.ValueFilter valueFilter8 = null;
        jSONObject3.valueFilter(valueFilter8);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.alibaba.fastjson2.JSONObject jSONObject11 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        com.alibaba.fastjson2.JSONObject jSONObject17 = com.alibaba.fastjson2.JSONObject.of("{}", (java.lang.Object) true, "10.0", (java.lang.Object) 0.0f);
        com.alibaba.fastjson2.JSONObject jSONObject18 = com.alibaba.fastjson2.JSONObject.of("", (java.lang.Object) 10.0d, "", (java.lang.Object) 'a', "{}", (java.lang.Object) 0.0f);
        com.alibaba.fastjson2.JSONObject jSONObject21 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 100, "", (java.lang.Object) (short) 10, "{}", (java.lang.Object) "{}", "10.0", (java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(jSONObject17);
        org.junit.Assert.assertNotNull(jSONObject18);
        org.junit.Assert.assertNotNull(jSONObject21);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        java.lang.Boolean boolean7 = jSONObject3.getBoolean("");
        java.lang.String str8 = jSONObject3.toString();
        long long10 = jSONObject3.getLongValue("10.0");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet11 = jSONObject3.entrySet();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(strEntrySet11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject4 = new com.alibaba.fastjson2.JSONObject((java.util.Map) jSONObject3);
        long long7 = jSONObject3.getLongValue("hi!", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        int int4 = jSONObject3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.alibaba.fastjson2.JSONObject jSONObject0 = new com.alibaba.fastjson2.JSONObject();
        java.time.Instant instant2 = jSONObject0.getInstant("");
        int int3 = jSONObject0.size();
        org.junit.Assert.assertNull(instant2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        java.lang.Integer int7 = jSONObject3.getInteger("hi!");
        float float9 = jSONObject3.getFloatValue("{}");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject4 = new com.alibaba.fastjson2.JSONObject((java.util.Map) jSONObject3);
        com.alibaba.fastjson2.JSONArray jSONArray6 = jSONObject4.getJSONArray("10.0");
        com.alibaba.fastjson2.JSONArray jSONArray8 = jSONObject4.getJSONArray("");
        java.lang.reflect.Type type9 = null;
        com.alibaba.fastjson2.JSONReader.Feature feature10 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray11 = new com.alibaba.fastjson2.JSONReader.Feature[] { feature10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntryCollection12 = jSONObject4.toJavaObject(type9, featureArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSONArray6);
        org.junit.Assert.assertNull(jSONArray8);
        org.junit.Assert.assertNotNull(featureArray11);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        java.lang.String str4 = jSONObject3.toString();
        java.lang.Integer int6 = jSONObject3.getInteger("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{}" + "'", str4, "{}");
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.alibaba.fastjson2.JSONObject jSONObject0 = new com.alibaba.fastjson2.JSONObject();
        com.alibaba.fastjson2.JSONArray jSONArray2 = jSONObject0.getJSONArray("10.0");
        com.alibaba.fastjson2.JSONObject jSONObject11 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        com.alibaba.fastjson2.JSONObject jSONObject15 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj17 = jSONObject15.get("");
        java.lang.Boolean boolean19 = jSONObject15.getBoolean("");
        java.lang.Object obj20 = jSONObject0.getOrDefault((java.lang.Object) true, (java.lang.Object) boolean19);
        org.junit.Assert.assertNull(jSONArray2);
        org.junit.Assert.assertNotNull(jSONObject11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject12 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean15 = jSONObject12.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject19 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj22 = jSONObject19.getOrDefault("hi!", (java.lang.Object) 1.0f);
        boolean boolean23 = jSONObject3.remove((java.lang.Object) "", (java.lang.Object) jSONObject19);
        com.alibaba.fastjson2.JSONObject jSONObject30 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj32 = jSONObject30.get("");
        com.alibaba.fastjson2.JSONObject jSONObject34 = new com.alibaba.fastjson2.JSONObject();
        com.alibaba.fastjson2.JSONObject jSONObject39 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject48 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean51 = jSONObject48.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject55 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj58 = jSONObject55.getOrDefault("hi!", (java.lang.Object) 1.0f);
        boolean boolean59 = jSONObject39.remove((java.lang.Object) "", (java.lang.Object) jSONObject55);
        com.alibaba.fastjson2.JSONObject jSONObject60 = com.alibaba.fastjson2.JSONObject.of("{}", (java.lang.Object) "", "{}", (java.lang.Object) "", "10.0", (java.lang.Object) jSONObject34, "10.0", (java.lang.Object) boolean59);
        java.lang.Object obj61 = jSONObject3.get((java.lang.Object) "{}");
        com.alibaba.fastjson2.JSONArray jSONArray63 = jSONObject3.putArray("10.0");
        org.junit.Assert.assertNotNull(jSONObject12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(jSONObject48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 1.0f + "'", obj58, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSONObject60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(jSONArray63);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        com.alibaba.fastjson2.JSONObject jSONObject10 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        java.lang.Object obj13 = jSONObject10.getOrDefault("hi!", (java.lang.Object) 0);
        jSONObject10.clear();
        java.lang.Object obj15 = jSONObject3.putIfAbsent("", (java.lang.Object) jSONObject10);
        com.alibaba.fastjson2.JSONObject jSONObject22 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj25 = jSONObject22.put("10.0", (java.lang.Object) "");
        java.lang.Short short27 = jSONObject22.getShort("");
        com.alibaba.fastjson2.JSONObject jSONObject28 = com.alibaba.fastjson2.JSONObject.of("10.0", (java.lang.Object) 10.0f, "hi!", (java.lang.Object) jSONObject22);
        boolean boolean29 = jSONObject3.containsValue((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(short27);
        org.junit.Assert.assertNotNull(jSONObject28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.alibaba.fastjson2.JSONObject jSONObject6 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj8 = jSONObject6.get("");
        com.alibaba.fastjson2.JSONObject jSONObject10 = new com.alibaba.fastjson2.JSONObject();
        com.alibaba.fastjson2.JSONObject jSONObject15 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject24 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean27 = jSONObject24.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject31 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj34 = jSONObject31.getOrDefault("hi!", (java.lang.Object) 1.0f);
        boolean boolean35 = jSONObject15.remove((java.lang.Object) "", (java.lang.Object) jSONObject31);
        com.alibaba.fastjson2.JSONObject jSONObject36 = com.alibaba.fastjson2.JSONObject.of("{}", (java.lang.Object) "", "{}", (java.lang.Object) "", "10.0", (java.lang.Object) jSONObject10, "10.0", (java.lang.Object) boolean35);
        com.alibaba.fastjson2.JSONObject jSONObject44 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj47 = jSONObject44.put("10.0", (java.lang.Object) "");
        java.lang.Short short49 = jSONObject44.getShort("");
        com.alibaba.fastjson2.JSONObject jSONObject50 = com.alibaba.fastjson2.JSONObject.of("10.0", (java.lang.Object) 10.0f, "hi!", (java.lang.Object) jSONObject44);
        java.lang.Object obj51 = jSONObject10.put("{}", (java.lang.Object) 10.0f);
        java.lang.Long long53 = jSONObject10.getLong("10.0");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(jSONObject24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSONObject36);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(short49);
        org.junit.Assert.assertNotNull(jSONObject50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(long53);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short short10 = jSONObject8.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: Can not cast 'class java.lang.Boolean' to Short");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONObject8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.alibaba.fastjson2.JSONObject jSONObject1 = new com.alibaba.fastjson2.JSONObject();
        com.alibaba.fastjson2.JSONObject jSONObject2 = com.alibaba.fastjson2.JSONObject.of("", (java.lang.Object) jSONObject1);
        org.junit.Assert.assertNotNull(jSONObject2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject2 = new com.alibaba.fastjson2.JSONObject((int) (byte) 0, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        com.alibaba.fastjson2.JSONObject jSONObject10 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        java.lang.Object obj13 = jSONObject10.getOrDefault("hi!", (java.lang.Object) 0);
        jSONObject10.clear();
        java.lang.Object obj15 = jSONObject3.putIfAbsent("", (java.lang.Object) jSONObject10);
        boolean boolean17 = jSONObject10.getBooleanValue("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.alibaba.fastjson2.JSONObject jSONObject6 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj9 = jSONObject6.put("10.0", (java.lang.Object) "");
        java.lang.Short short11 = jSONObject6.getShort("");
        com.alibaba.fastjson2.JSONObject jSONObject12 = com.alibaba.fastjson2.JSONObject.of("10.0", (java.lang.Object) 10.0f, "hi!", (java.lang.Object) jSONObject6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jSONObject6.getByPath("hi!");
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: not support !");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(short11);
        org.junit.Assert.assertNotNull(jSONObject12);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        java.lang.Boolean boolean7 = jSONObject3.getBoolean("");
        java.lang.String str8 = jSONObject3.toString();
        long long10 = jSONObject3.getLongValue("10.0");
        byte[] byteArray12 = jSONObject3.getBytes("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{}" + "'", str8, "{}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(byteArray12);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject4 = new com.alibaba.fastjson2.JSONObject((java.util.Map) jSONObject3);
        com.alibaba.fastjson2.JSONArray jSONArray6 = jSONObject4.getJSONArray("10.0");
        com.alibaba.fastjson2.JSONArray jSONArray8 = jSONObject4.getJSONArray("");
        com.alibaba.fastjson2.filter.ValueFilter valueFilter9 = null;
        jSONObject4.valueFilter(valueFilter9);
        org.junit.Assert.assertNull(jSONArray6);
        org.junit.Assert.assertNull(jSONArray8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject1 = com.alibaba.fastjson2.JSONObject.from((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.alibaba.fastjson2.JSONObject");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.alibaba.fastjson2.JSONObject jSONObject8 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean11 = jSONObject8.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject18 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj21 = jSONObject18.put("10.0", (java.lang.Object) "");
        java.lang.Short short23 = jSONObject18.getShort("");
        com.alibaba.fastjson2.JSONObject jSONObject24 = com.alibaba.fastjson2.JSONObject.of("10.0", (java.lang.Object) 10.0f, "hi!", (java.lang.Object) jSONObject18);
        boolean boolean25 = jSONObject18.isEmpty();
        java.lang.Object obj26 = jSONObject8.remove((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(jSONObject8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(short23);
        org.junit.Assert.assertNotNull(jSONObject24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject2 = new com.alibaba.fastjson2.JSONObject((int) ' ', (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) (byte) 0, (float) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        com.alibaba.fastjson2.JSONObject jSONObject10 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj13 = jSONObject10.put("10.0", (java.lang.Object) "");
        java.lang.Object obj14 = jSONObject3.getOrDefault("hi!", (java.lang.Object) jSONObject10);
        java.lang.reflect.Type type15 = null;
        com.alibaba.fastjson2.JSONReader.Feature[] featureArray16 = new com.alibaba.fastjson2.JSONReader.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntryCollection17 = jSONObject3.to(type15, featureArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast com.alibaba.fastjson2.JSONObject to java.util.Collection");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{\"10.0\":\"\"}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{\"10.0\":\"\"}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{\"10.0\":\"\"}");
        org.junit.Assert.assertNotNull(featureArray16);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.alibaba.fastjson2.JSONObject jSONObject6 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj9 = jSONObject6.put("10.0", (java.lang.Object) "");
        java.lang.Short short11 = jSONObject6.getShort("");
        com.alibaba.fastjson2.JSONObject jSONObject12 = com.alibaba.fastjson2.JSONObject.of("10.0", (java.lang.Object) 10.0f, "hi!", (java.lang.Object) jSONObject6);
        short short14 = jSONObject6.getShortValue("10.0");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(short11);
        org.junit.Assert.assertNotNull(jSONObject12);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        com.alibaba.fastjson2.JSONArray jSONArray5 = jSONObject3.getJSONArray("10.0");
        int int6 = jSONObject3.size();
        boolean boolean9 = jSONObject3.remove((java.lang.Object) 'a', (java.lang.Object) 10.0d);
        java.lang.Short short11 = jSONObject3.getShort("hi!");
        org.junit.Assert.assertNull(jSONArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(short11);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj5 = jSONObject3.get("");
        com.alibaba.fastjson2.JSONObject jSONObject10 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        java.lang.Object obj13 = jSONObject10.getOrDefault("hi!", (java.lang.Object) 0);
        jSONObject10.clear();
        java.lang.Object obj15 = jSONObject3.putIfAbsent("", (java.lang.Object) jSONObject10);
        java.math.BigDecimal bigDecimal17 = jSONObject10.getBigDecimal("{}");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(bigDecimal17);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.alibaba.fastjson2.JSONObject jSONObject6 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) 100, "10.0", (java.lang.Object) "10.0", "hi!", (java.lang.Object) (-1.0d));
        com.alibaba.fastjson2.filter.ValueFilter valueFilter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSONObject6.valueFilter(valueFilter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONObject6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.alibaba.fastjson2.JSONObject jSONObject2 = new com.alibaba.fastjson2.JSONObject(1, (float) 10);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.alibaba.fastjson2.JSONObject jSONObject1 = new com.alibaba.fastjson2.JSONObject();
        java.time.Instant instant3 = jSONObject1.getInstant("");
        com.alibaba.fastjson2.JSONObject jSONObject7 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj9 = jSONObject7.get("");
        java.lang.Boolean boolean11 = jSONObject7.getBoolean("");
        com.alibaba.fastjson2.JSONObject jSONObject15 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject16 = new com.alibaba.fastjson2.JSONObject((java.util.Map) jSONObject15);
        java.lang.Object obj17 = jSONObject1.getOrDefault((java.lang.Object) jSONObject7, (java.lang.Object) jSONObject15);
        com.alibaba.fastjson2.JSONObject jSONObject22 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject31 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        boolean boolean34 = jSONObject31.getBooleanValue("", true);
        com.alibaba.fastjson2.JSONObject jSONObject38 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj41 = jSONObject38.getOrDefault("hi!", (java.lang.Object) 1.0f);
        boolean boolean42 = jSONObject22.remove((java.lang.Object) "", (java.lang.Object) jSONObject38);
        java.lang.Short short44 = jSONObject38.getShort("10.0");
        int int45 = jSONObject38.size();
        com.alibaba.fastjson2.JSONObject jSONObject49 = new com.alibaba.fastjson2.JSONObject();
        java.time.Instant instant51 = jSONObject49.getInstant("");
        com.alibaba.fastjson2.JSONObject jSONObject55 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj57 = jSONObject55.get("");
        java.lang.Boolean boolean59 = jSONObject55.getBoolean("");
        com.alibaba.fastjson2.JSONObject jSONObject63 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        com.alibaba.fastjson2.JSONObject jSONObject64 = new com.alibaba.fastjson2.JSONObject((java.util.Map) jSONObject63);
        java.lang.Object obj65 = jSONObject49.getOrDefault((java.lang.Object) jSONObject55, (java.lang.Object) jSONObject63);
        com.alibaba.fastjson2.JSONObject jSONObject68 = com.alibaba.fastjson2.JSONObject.of("", (java.lang.Object) jSONObject1, "hi!", (java.lang.Object) jSONObject38, "{}", (java.lang.Object) (byte) -1, "{}", (java.lang.Object) jSONObject63, "10.0", (java.lang.Object) 1);
        com.alibaba.fastjson2.JSONObject jSONObject78 = com.alibaba.fastjson2.JSONObject.of("hi!", (java.lang.Object) (byte) 1, "", (java.lang.Object) (byte) -1, "hi!", (java.lang.Object) true, "", (java.lang.Object) 0L);
        double double80 = jSONObject78.getDoubleValue("");
        boolean boolean82 = jSONObject38.replace("{}", (java.lang.Object) double80, (java.lang.Object) 10L);
        org.junit.Assert.assertNull(instant3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "{}");
        org.junit.Assert.assertNotNull(jSONObject31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(short44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(instant51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(boolean59);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "{}");
        org.junit.Assert.assertNotNull(jSONObject68);
        org.junit.Assert.assertNotNull(jSONObject78);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.alibaba.fastjson2.JSONObject jSONObject3 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        java.lang.Object obj6 = jSONObject3.getOrDefault("hi!", (java.lang.Object) 0);
        com.alibaba.fastjson2.JSONObject jSONObject10 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        com.alibaba.fastjson2.JSONArray jSONArray12 = jSONObject10.getJSONArray("10.0");
        java.lang.Object obj13 = jSONObject3.remove((java.lang.Object) "10.0");
        com.alibaba.fastjson2.JSONObject jSONObject17 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj19 = jSONObject17.get("");
        java.lang.Object obj22 = jSONObject17.getOrDefault("hi!", (java.lang.Object) (byte) 1);
        boolean boolean23 = jSONObject3.equals((java.lang.Object) jSONObject17);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNull(jSONArray12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 1 + "'", obj22, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.alibaba.fastjson2.JSONObject jSONObject4 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj6 = jSONObject4.get("");
        java.lang.Boolean boolean8 = jSONObject4.getBoolean("");
        java.lang.String str9 = jSONObject4.toString();
        long long11 = jSONObject4.getLongValue("10.0");
        java.lang.Object obj13 = jSONObject4.get("hi!");
        com.alibaba.fastjson2.JSONObject jSONObject18 = new com.alibaba.fastjson2.JSONObject(10, (float) 'a', true);
        java.lang.Object obj20 = jSONObject18.get("");
        com.alibaba.fastjson2.JSONObject jSONObject25 = new com.alibaba.fastjson2.JSONObject((int) 'a', (float) 1L, false);
        java.lang.String str27 = jSONObject25.getString("{}");
        com.alibaba.fastjson2.JSONObject jSONObject28 = new com.alibaba.fastjson2.JSONObject();
        com.alibaba.fastjson2.JSONArray jSONArray30 = jSONObject28.getJSONArray("10.0");
        jSONObject25.putAll((java.util.Map<java.lang.String, java.lang.Object>) jSONObject28);
        com.alibaba.fastjson2.JSONArray jSONArray33 = jSONObject25.putArray("hi!");
        com.alibaba.fastjson2.JSONObject jSONObject36 = com.alibaba.fastjson2.JSONObject.of("{}", (java.lang.Object) "hi!", "10.0", obj20, "{}", (java.lang.Object) jSONArray33, "hi!", (java.lang.Object) 1.0f);
        java.lang.Object obj39 = jSONObject36.replace("hi!", (java.lang.Object) 1.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{}" + "'", str9, "{}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(jSONArray30);
        org.junit.Assert.assertNotNull(jSONArray33);
        org.junit.Assert.assertNotNull(jSONObject36);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
    }
}

