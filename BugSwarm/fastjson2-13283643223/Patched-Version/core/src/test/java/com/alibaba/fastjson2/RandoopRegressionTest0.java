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
        com.alibaba.fastjson2.JSONWriter.Context context0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofUTF8(context0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray6 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter0.writeInt64(longArray6);
        java.lang.reflect.Type type8 = null;
        java.lang.Class class9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.writer.ObjectWriter objectWriter10 = jSONWriter0.getObjectWriter(type8, class9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1, 10]");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray6 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter0.writeInt64(longArray6);
        com.alibaba.fastjson2.JSONObject jSONObject8 = null;
        jSONWriter0.write(jSONObject8);
        java.lang.Class class11 = null;
        boolean boolean13 = jSONWriter0.isWriteTypeInfo((java.lang.Object) false, class11, (long) (short) -1);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        java.nio.charset.Charset charset4 = jSONWriter0.getCharset();
        com.alibaba.fastjson2.JSONWriter.Feature feature5 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        jSONWriter0.config(feature5, true);
        com.alibaba.fastjson2.JSONWriter jSONWriter8 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj9 = null;
        boolean boolean10 = jSONWriter8.removeReference(obj9);
        char[] charArray14 = new char[] { '#', ' ', '#' };
        jSONWriter8.writeString(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeNameRaw(charArray14, 1, 0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature5.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertNotNull(jSONWriter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#,  , #]");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj3 = null;
        boolean boolean4 = jSONWriter2.removeReference(obj3);
        long[] longArray8 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter2.writeInt64(longArray8);
        jSONWriter1.writeInt64(longArray8);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1, 10]");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        char[] charArray6 = new char[] { '#', ' ', '#' };
        jSONWriter0.writeString(charArray6);
        java.math.BigDecimal bigDecimal8 = null;
        java.text.DecimalFormat decimalFormat10 = null;
        jSONWriter0.writeDecimal(bigDecimal8, 100L, decimalFormat10);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#,  , #]");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4 };
        com.alibaba.fastjson2.JSONWriter.Context context6 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray5);
        boolean boolean7 = context6.isFormatyyyyMMddhhmmss19();
        com.alibaba.fastjson2.writer.ObjectWriterProvider objectWriterProvider8 = context6.getProvider();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectWriterProvider8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4 };
        com.alibaba.fastjson2.JSONWriter.Context context6 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray5);
        boolean boolean7 = context6.isFormatyyyyMMddhhmmss19();
        java.time.ZoneId zoneId8 = context6.getZoneId();
        com.alibaba.fastjson2.filter.AfterFilter afterFilter9 = context6.getAfterFilter();
        com.alibaba.fastjson2.filter.NameFilter nameFilter10 = null;
        context6.setNameFilter(nameFilter10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNull(afterFilter9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        java.nio.charset.Charset charset4 = jSONWriter0.getCharset();
        com.alibaba.fastjson2.JSONWriter.Feature feature5 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        jSONWriter0.config(feature5, true);
        jSONWriter0.popPath((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature5.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        jSONWriter0.writeBooleanNull();
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeName((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: unsupported operation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature5 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray6 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4, feature5 };
        com.alibaba.fastjson2.JSONWriter jSONWriter7 = com.alibaba.fastjson2.JSONWriter.ofUTF16(featureArray6);
        com.alibaba.fastjson2.JSONWriter.Context context8 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray6);
        boolean boolean9 = context8.isFormatyyyyMMddhhmmss19();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature5.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertNotNull(featureArray6);
        org.junit.Assert.assertNotNull(jSONWriter7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        jSONWriter0.writeNull();
        java.math.BigDecimal bigDecimal4 = null;
        jSONWriter0.writeDecimal(bigDecimal4, 1L);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.MapSortField;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.MapSortField + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.MapSortField));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        java.nio.charset.Charset charset4 = jSONWriter0.getCharset();
        char[] charArray10 = new char[] { 'a', '4', '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeRaw(charArray10, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4, 4,  ]");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray3 = new long[] {};
        jSONWriter0.writeInt64(longArray3);
        java.util.Map map5 = null;
        jSONWriter0.write(map5);
        jSONWriter0.close();
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        java.nio.charset.Charset charset4 = jSONWriter0.getCharset();
        com.alibaba.fastjson2.JSONWriter.Feature feature5 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        jSONWriter0.config(feature5, true);
        jSONWriter0.writeSymbol("");
        java.math.BigDecimal bigDecimal10 = null;
        jSONWriter0.writeDecimal(bigDecimal10, (long) ' ');
        com.alibaba.fastjson2.JSONWriter.Feature feature13 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature14 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature15 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature16 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature17 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray18 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature13, feature14, feature15, feature16, feature17 };
        com.alibaba.fastjson2.JSONWriter.Context context19 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray18);
        boolean boolean20 = context19.isFormatyyyyMMddhhmmss19();
        java.time.ZoneId zoneId21 = context19.getZoneId();
        com.alibaba.fastjson2.filter.AfterFilter afterFilter22 = context19.getAfterFilter();
        com.alibaba.fastjson2.filter.AfterFilter afterFilter23 = context19.getAfterFilter();
        java.lang.Class class24 = null;
        boolean boolean25 = jSONWriter0.isWriteTypeInfo((java.lang.Object) afterFilter23, class24);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature5.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature13.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature14.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature15.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature16.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature17.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertNull(afterFilter22);
        org.junit.Assert.assertNull(afterFilter23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4 };
        com.alibaba.fastjson2.JSONWriter.Context context6 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray5);
        boolean boolean7 = context6.isFormatyyyyMMddhhmmss19();
        boolean boolean9 = context6.isEnabled((long) (short) 10);
        com.alibaba.fastjson2.filter.PropertyPreFilter propertyPreFilter10 = null;
        context6.setPropertyPreFilter(propertyPreFilter10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4 };
        com.alibaba.fastjson2.JSONWriter.Context context6 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray5);
        com.alibaba.fastjson2.filter.AfterFilter afterFilter7 = context6.getAfterFilter();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertNull(afterFilter7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4 };
        com.alibaba.fastjson2.JSONWriter.Context context6 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray5);
        boolean boolean7 = context6.isFormatyyyyMMddhhmmss19();
        java.time.ZoneId zoneId8 = context6.getZoneId();
        com.alibaba.fastjson2.filter.AfterFilter afterFilter9 = context6.getAfterFilter();
        com.alibaba.fastjson2.filter.AfterFilter afterFilter10 = context6.getAfterFilter();
        com.alibaba.fastjson2.JSONWriter jSONWriter11 = com.alibaba.fastjson2.JSONWriter.ofUTF8(context6);
        com.alibaba.fastjson2.filter.NameFilter nameFilter12 = null;
        context6.setNameFilter(nameFilter12);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNull(afterFilter9);
        org.junit.Assert.assertNull(afterFilter10);
        org.junit.Assert.assertNotNull(jSONWriter11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4 };
        com.alibaba.fastjson2.JSONWriter.Context context6 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray5);
        boolean boolean7 = context6.isFormatyyyyMMddhhmmss19();
        java.time.ZoneId zoneId8 = context6.getZoneId();
        com.alibaba.fastjson2.filter.AfterFilter afterFilter9 = context6.getAfterFilter();
        com.alibaba.fastjson2.filter.AfterFilter afterFilter10 = context6.getAfterFilter();
        boolean boolean11 = context6.isDateFormatHasDay();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNull(afterFilter9);
        org.junit.Assert.assertNull(afterFilter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        jSONWriter0.writeString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeName(0L);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: unsupported operation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        jSONWriter0.writeNull();
        java.time.LocalDate localDate4 = null;
        jSONWriter0.writeLocalDate(localDate4);
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeNameRaw(byteArray6, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WritePairAsJavaBean;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WritePairAsJavaBean + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WritePairAsJavaBean));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray1 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0 };
        com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray1);
        com.alibaba.fastjson2.JSONWriter.Context context3 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable));
        org.junit.Assert.assertNotNull(featureArray1);
        org.junit.Assert.assertNotNull(jSONWriter2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray6 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter0.writeInt64(longArray6);
        java.nio.charset.Charset charset8 = jSONWriter0.getCharset();
        boolean[] booleanArray9 = new boolean[] {};
        jSONWriter0.writeBool(booleanArray9);
        jSONWriter0.writeSymbol((int) (byte) 100);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1, 10]");
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        jSONWriter0.writeBooleanNull();
        boolean boolean3 = jSONWriter0.isEnabled((long) (byte) 0);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofUTF8();
        org.junit.Assert.assertNotNull(jSONWriter0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray6 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter0.writeInt64(longArray6);
        java.nio.charset.Charset charset8 = jSONWriter0.getCharset();
        com.alibaba.fastjson2.JSONWriter jSONWriter9 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray11 = new byte[] { (byte) 100 };
        jSONWriter9.writeNameRaw(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeNameRaw(byteArray11, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1, 10]");
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(jSONWriter9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100]");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.alibaba.fastjson2.JSONWriter.Path path0 = com.alibaba.fastjson2.JSONWriter.Path.ROOT;
        org.junit.Assert.assertNotNull(path0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        java.nio.charset.Charset charset4 = jSONWriter0.getCharset();
        com.alibaba.fastjson2.JSONWriter.Feature feature5 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        jSONWriter0.config(feature5, true);
        jSONWriter0.writeNull();
        com.alibaba.fastjson2.JSONWriter jSONWriter9 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj10 = null;
        boolean boolean11 = jSONWriter9.removeReference(obj10);
        jSONWriter9.writeNull();
        java.lang.reflect.Type type14 = null;
        boolean boolean15 = jSONWriter9.isWriteTypeInfo((java.lang.Object) true, type14);
        jSONWriter0.popPath((java.lang.Object) boolean15);
        jSONWriter0.writeInt8((byte) 10);
        com.alibaba.fastjson2.JSONWriter jSONWriter19 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        jSONWriter19.writeNameRaw(byteArray21);
        jSONWriter0.writeNameRaw(byteArray21);
        com.alibaba.fastjson2.JSONWriter jSONWriter24 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj25 = null;
        boolean boolean26 = jSONWriter24.removeReference(obj25);
        char[] charArray30 = new char[] { '#', ' ', '#' };
        jSONWriter24.writeString(charArray30);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeNameRaw(charArray30);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature5.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertNotNull(jSONWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSONWriter19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jSONWriter24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#,  , #]");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        com.alibaba.fastjson2.JSONWriter jSONWriter4 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj5 = null;
        boolean boolean6 = jSONWriter4.removeReference(obj5);
        char[] charArray10 = new char[] { '#', ' ', '#' };
        jSONWriter4.writeString(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeNameRaw(charArray10);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jSONWriter4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  , #]");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        java.nio.charset.Charset charset4 = jSONWriter0.getCharset();
        com.alibaba.fastjson2.JSONWriter.Feature feature5 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        jSONWriter0.config(feature5, true);
        jSONWriter0.writeNull();
        com.alibaba.fastjson2.JSONWriter jSONWriter9 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj10 = null;
        boolean boolean11 = jSONWriter9.removeReference(obj10);
        jSONWriter9.writeNull();
        java.lang.reflect.Type type14 = null;
        boolean boolean15 = jSONWriter9.isWriteTypeInfo((java.lang.Object) true, type14);
        jSONWriter0.popPath((java.lang.Object) boolean15);
        jSONWriter0.writeInt8((byte) 10);
        com.alibaba.fastjson2.JSONWriter jSONWriter19 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        jSONWriter19.writeNameRaw(byteArray21);
        jSONWriter0.writeNameRaw(byteArray21);
        long long25 = jSONWriter0.getFeatures((long) ' ');
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature5.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertNotNull(jSONWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSONWriter19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1056L + "'", long25 == 1056L);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray3 = new long[] {};
        jSONWriter0.writeInt64(longArray3);
        java.util.Map map5 = null;
        jSONWriter0.write(map5);
        java.util.Map map7 = null;
        jSONWriter0.write(map7);
        com.alibaba.fastjson2.JSONWriter jSONWriter9 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        double[] doubleArray10 = new double[] {};
        java.text.DecimalFormat decimalFormat11 = null;
        jSONWriter9.writeDouble(doubleArray10, decimalFormat11);
        java.text.DecimalFormat decimalFormat13 = null;
        jSONWriter0.writeDouble(doubleArray10, decimalFormat13);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeString(reader15);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(jSONWriter9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray6 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter0.writeInt64(longArray6);
        java.nio.charset.Charset charset8 = jSONWriter0.getCharset();
        boolean[] booleanArray9 = new boolean[] {};
        jSONWriter0.writeBool(booleanArray9);
        boolean boolean12 = jSONWriter0.isWriteTypeInfo((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeRaw(' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1, 10]");
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray6 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter0.writeInt64(longArray6);
        boolean boolean9 = jSONWriter0.hasFilter(0L);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4 };
        com.alibaba.fastjson2.JSONWriter.Context context6 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray5);
        boolean boolean7 = context6.isFormatyyyyMMddhhmmss19();
        com.alibaba.fastjson2.filter.BeforeFilter beforeFilter8 = null;
        context6.setBeforeFilter(beforeFilter8);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            context6.config(featureArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.of();
        org.junit.Assert.assertNotNull(jSONWriter0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        jSONWriter0.writeString("hi!");
        java.math.BigDecimal bigDecimal6 = null;
        jSONWriter0.writeDecimal(bigDecimal6, (long) '#');
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray3 = new long[] {};
        jSONWriter0.writeInt64(longArray3);
        java.util.Map map5 = null;
        jSONWriter0.write(map5);
        java.util.Map map7 = null;
        jSONWriter0.write(map7);
        boolean boolean9 = jSONWriter0.jsonb;
        boolean boolean10 = jSONWriter0.isUTF16();
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature5 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray6 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4, feature5 };
        com.alibaba.fastjson2.JSONWriter jSONWriter7 = com.alibaba.fastjson2.JSONWriter.ofUTF16(featureArray6);
        jSONWriter7.writeBooleanNull();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature5.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertNotNull(featureArray6);
        org.junit.Assert.assertNotNull(jSONWriter7);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        long[] longArray6 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter0.writeInt64(longArray6);
        java.nio.charset.Charset charset8 = jSONWriter0.getCharset();
        boolean[] booleanArray9 = new boolean[] {};
        jSONWriter0.writeBool(booleanArray9);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeString(reader11);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1, 10]");
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat;
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature3 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName;
        com.alibaba.fastjson2.JSONWriter.Feature feature4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature0, feature1, feature2, feature3, feature4 };
        com.alibaba.fastjson2.JSONWriter.Context context6 = new com.alibaba.fastjson2.JSONWriter.Context(featureArray5);
        boolean boolean7 = context6.isFormatyyyyMMddhhmmss19();
        java.time.ZoneId zoneId8 = context6.getZoneId();
        boolean boolean10 = context6.isEnabled(0L);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat + "'", feature1.equals(com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName + "'", feature3.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName));
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure + "'", feature4.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure));
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        char[] charArray6 = new char[] { '#', ' ', '#' };
        jSONWriter0.writeString(charArray6);
        com.alibaba.fastjson2.JSONWriter jSONWriter8 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj9 = null;
        boolean boolean10 = jSONWriter8.removeReference(obj9);
        jSONWriter8.writeNull();
        boolean boolean12 = jSONWriter0.isWriteTypeInfo((java.lang.Object) jSONWriter8);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#,  , #]");
        org.junit.Assert.assertNotNull(jSONWriter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj1 = null;
        boolean boolean2 = jSONWriter0.removeReference(obj1);
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj4 = null;
        boolean boolean5 = jSONWriter3.removeReference(obj4);
        char[] charArray9 = new char[] { '#', ' ', '#' };
        jSONWriter3.writeString(charArray9);
        boolean boolean11 = jSONWriter0.removeReference((java.lang.Object) jSONWriter3);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#,  , #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        jSONWriter0.writeNameRaw(byteArray2);
        jSONWriter0.writeString("hi!");
        jSONWriter0.writeFloat((float) 'a');
        com.alibaba.fastjson2.JSONWriter jSONWriter8 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj9 = null;
        boolean boolean10 = jSONWriter8.removeReference(obj9);
        long[] longArray14 = new long[] { (short) -1, (-1), (byte) 10 };
        jSONWriter8.writeInt64(longArray14);
        com.alibaba.fastjson2.JSONWriter jSONWriter16 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        java.lang.Object obj17 = null;
        boolean boolean18 = jSONWriter16.removeReference(obj17);
        char[] charArray22 = new char[] { '#', ' ', '#' };
        jSONWriter16.writeString(charArray22);
        java.lang.Class class24 = null;
        boolean boolean25 = jSONWriter8.isWriteTypeInfo((java.lang.Object) charArray22, class24);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeString(charArray22, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jSONWriter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[-1, -1, 10]");
        org.junit.Assert.assertNotNull(jSONWriter16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#,  , #]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }
}

