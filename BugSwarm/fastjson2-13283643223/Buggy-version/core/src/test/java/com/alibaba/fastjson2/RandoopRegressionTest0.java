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
        com.alibaba.fastjson2.writer.ObjectWriterProvider objectWriterProvider0 = null;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray1 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.of(objectWriterProvider0, featureArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: objectWriterProvider must not null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.alibaba.fastjson2.JSONWriter.Feature feature1 = null;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] { feature1 };
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONWriter.Context context3 = new com.alibaba.fastjson2.JSONWriter.Context("", featureArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.alibaba.fastjson2.writer.ObjectWriterProvider objectWriterProvider0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONWriter.Context context1 = new com.alibaba.fastjson2.JSONWriter.Context(objectWriterProvider0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: objectWriterProvider must not null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.alibaba.fastjson2.JSONWriter.Context context0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(context0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        jSONWriter1.close();
        jSONWriter1.writeSymbol("");
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringKeyAsString;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringKeyAsString + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringKeyAsString));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = jSONWriter3.getBytes(charset9);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: not support operator");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.text.DecimalFormat decimalFormat5 = null;
        jSONWriter1.writeDouble(1.0d, decimalFormat5);
        java.time.ZonedDateTime zonedDateTime7 = null;
        jSONWriter1.writeZonedDateTime(zonedDateTime7);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.ofPretty(jSONWriter1);
        boolean boolean4 = jSONWriter2.hasFilter(0L);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter2.writeRaw('#');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.text.DecimalFormat decimalFormat5 = null;
        jSONWriter1.writeDouble(1.0d, decimalFormat5);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter1.writeRaw("hi!");
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: unsupported operation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.text.DecimalFormat decimalFormat5 = null;
        jSONWriter1.writeDouble(1.0d, decimalFormat5);
        boolean boolean8 = jSONWriter1.removeReference((java.lang.Object) (short) -1);
        jSONWriter1.writeArrayNull();
        long long10 = jSONWriter1.getFeatures();
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.ofPretty(jSONWriter1);
        long long3 = jSONWriter1.getFeatures();
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter1.writeColon();
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        com.alibaba.fastjson2.JSONWriter.Feature feature2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteThrowableClassName;
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) feature2);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteThrowableClassName + "'", feature2.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteThrowableClassName));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofPretty();
        org.junit.Assert.assertNotNull(jSONWriter0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        java.time.LocalTime localTime2 = null;
        jSONWriter1.writeLocalTime(localTime2);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter1.writeDateTimeISO8601((int) (short) 1, 100, 10, (int) 'a', (int) (byte) 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: unsupported operation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        boolean boolean2 = jSONWriter1.isRefDetect();
        java.lang.String str5 = jSONWriter1.setPath("hi!", (java.lang.Object) 1);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.SymbolTable symbolTable2 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable2);
        boolean[] booleanArray8 = new boolean[] { false, true, true, true };
        jSONWriter3.writeBool(booleanArray8);
        jSONWriter1.writeBool(booleanArray8);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, true, true, true]");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.of();
        org.junit.Assert.assertNotNull(jSONWriter0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.ofPretty(jSONWriter1);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter2.writeName("");
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: unsupported operation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.alibaba.fastjson2.JSONWriter.Path path0 = null;
        com.alibaba.fastjson2.JSONWriter.Path path2 = new com.alibaba.fastjson2.JSONWriter.Path(path0, "");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.text.DecimalFormat decimalFormat5 = null;
        jSONWriter1.writeDouble(1.0d, decimalFormat5);
        boolean boolean8 = jSONWriter1.removeReference((java.lang.Object) (short) -1);
        byte[] byteArray10 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter1.writeNameRaw(byteArray10, 10, 0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        char[] charArray2 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter0.writeNameRaw(charArray2);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        jSONWriter1.close();
        java.util.List list3 = null;
        jSONWriter1.write(list3);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        byte[] byteArray10 = new byte[] { (byte) -1 };
        boolean boolean12 = jSONWriter3.writeTypeName(byteArray10, 0L);
        jSONWriter3.writeInt8((byte) 1);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray15 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter16 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray15);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = jSONWriter16.writeTypeName(byteArray19, (long) 10);
        jSONWriter3.writeNameRaw(byteArray19);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(featureArray15);
        org.junit.Assert.assertNotNull(jSONWriter16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean8 = jSONWriter3.writeTypeName(byteArray6, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter1.writeNameRaw(byteArray6, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WritePairAsJavaBean;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WritePairAsJavaBean + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WritePairAsJavaBean));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.math.BigDecimal bigDecimal4 = null;
        jSONWriter1.writeDecimal(bigDecimal4);
        boolean boolean7 = jSONWriter1.isIgnoreNoneSerializable((java.lang.Object) (byte) 1);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray8 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter9 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray8);
        boolean boolean11 = jSONWriter9.isRefDetect((java.lang.Object) 1L);
        java.text.DecimalFormat decimalFormat13 = null;
        jSONWriter9.writeDouble(1.0d, decimalFormat13);
        boolean boolean16 = jSONWriter9.removeReference((java.lang.Object) (short) -1);
        jSONWriter9.writeArrayNull();
        boolean boolean18 = jSONWriter1.isRefDetect((java.lang.Object) jSONWriter9);
        char[] charArray22 = new char[] { '#', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter1.writeNameRaw(charArray22);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(featureArray8);
        org.junit.Assert.assertNotNull(jSONWriter9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.math.BigDecimal bigDecimal4 = null;
        jSONWriter1.writeDecimal(bigDecimal4);
        boolean boolean7 = jSONWriter1.isIgnoreNoneSerializable((java.lang.Object) (byte) 1);
        jSONWriter1.writeArrayNull();
        jSONWriter1.writeChar('a');
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.alibaba.fastjson2.writer.ObjectWriterProvider objectWriterProvider0 = null;
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.of(objectWriterProvider0, featureArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: objectWriterProvider must not null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        byte[] byteArray10 = new byte[] { (byte) -1 };
        boolean boolean12 = jSONWriter3.writeTypeName(byteArray10, 0L);
        long long13 = jSONWriter3.getFeatures();
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.math.BigDecimal bigDecimal4 = null;
        jSONWriter1.writeDecimal(bigDecimal4);
        boolean boolean7 = jSONWriter1.isIgnoreNoneSerializable((java.lang.Object) (byte) 1);
        jSONWriter1.writeArrayNull();
        jSONWriter1.writeArrayNull();
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        java.time.LocalTime localTime2 = null;
        jSONWriter1.writeLocalTime(localTime2);
        com.alibaba.fastjson2.SymbolTable symbolTable4 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter5 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable4);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray6 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter7 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray6);
        boolean boolean9 = jSONWriter7.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class10 = null;
        boolean boolean12 = jSONWriter5.isWriteTypeInfo((java.lang.Object) jSONWriter7, class10, (long) ' ');
        byte[] byteArray14 = new byte[] { (byte) -1 };
        boolean boolean16 = jSONWriter7.writeTypeName(byteArray14, 0L);
        jSONWriter1.writeBinary(byteArray14);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter5);
        org.junit.Assert.assertNotNull(featureArray6);
        org.junit.Assert.assertNotNull(jSONWriter7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.OptimizedForAscii;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.OptimizedForAscii + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.OptimizedForAscii));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.math.BigDecimal bigDecimal4 = null;
        jSONWriter1.writeDecimal(bigDecimal4);
        boolean boolean7 = jSONWriter1.isIgnoreNoneSerializable((java.lang.Object) (byte) 1);
        jSONWriter1.writeDateYYYMMDD8(100, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.ofPretty(jSONWriter1);
        boolean boolean3 = jSONWriter1.utf16;
        jSONWriter1.endObject();
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        boolean boolean2 = jSONWriter1.isRefDetect();
        jSONWriter1.writeDateTime14((-1), (int) (byte) 100, 100, (int) (short) -1, 10, (int) ' ');
        jSONWriter1.writeFloat((java.lang.Float) (-1.0f));
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        boolean boolean10 = jSONWriter1.isEnabled((long) ' ');
        jSONWriter1.writeString("hi!");
        boolean boolean13 = jSONWriter1.isUTF8();
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        byte[] byteArray10 = new byte[] { (byte) -1 };
        boolean boolean12 = jSONWriter3.writeTypeName(byteArray10, 0L);
        byte[] byteArray13 = null;
        jSONWriter3.writeBinary(byteArray13);
        jSONWriter3.endObject();
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        byte[] byteArray10 = new byte[] { (byte) -1 };
        boolean boolean12 = jSONWriter3.writeTypeName(byteArray10, 0L);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter3.writeRaw('4', ' ');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.ofPretty(jSONWriter1);
        long long3 = jSONWriter1.getFeatures();
        java.time.LocalDateTime localDateTime4 = null;
        jSONWriter1.writeLocalDateTime(localDateTime4);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        java.lang.reflect.Type type3 = null;
        boolean boolean5 = jSONWriter1.isWriteTypeInfo((java.lang.Object) (byte) 1, type3, (long) '#');
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        boolean boolean10 = jSONWriter1.isEnabled((long) ' ');
        com.alibaba.fastjson2.SymbolTable symbolTable11 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter12 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable11);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray13 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter14 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray13);
        boolean boolean16 = jSONWriter14.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class17 = null;
        boolean boolean19 = jSONWriter12.isWriteTypeInfo((java.lang.Object) jSONWriter14, class17, (long) ' ');
        byte[] byteArray21 = new byte[] { (byte) -1 };
        boolean boolean23 = jSONWriter14.writeTypeName(byteArray21, 0L);
        jSONWriter14.writeInt8((byte) 1);
        jSONWriter14.close();
        boolean boolean27 = jSONWriter1.removeReference((java.lang.Object) jSONWriter14);
        java.time.LocalDate localDate28 = null;
        jSONWriter1.writeLocalDate(localDate28);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSONWriter12);
        org.junit.Assert.assertNotNull(featureArray13);
        org.junit.Assert.assertNotNull(jSONWriter14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        byte[] byteArray10 = new byte[] { (byte) -1 };
        boolean boolean12 = jSONWriter3.writeTypeName(byteArray10, 0L);
        java.util.UUID uUID13 = null;
        jSONWriter3.writeUUID(uUID13);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter3.writeNameAny((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: unsupported operation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        jSONWriter1.writeSymbol((-1));
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        com.alibaba.fastjson2.JSONWriter jSONWriter2 = com.alibaba.fastjson2.JSONWriter.ofPretty(jSONWriter1);
        boolean boolean4 = jSONWriter2.hasFilter(0L);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray5 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter6 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray5);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = jSONWriter6.writeTypeName(byteArray9, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter2.writeNameRaw(byteArray9, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(jSONWriter2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(featureArray5);
        org.junit.Assert.assertNotNull(jSONWriter6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        double[] doubleArray1 = null;
        jSONWriter0.writeDouble(doubleArray1);
        boolean boolean3 = jSONWriter0.utf16;
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        boolean boolean3 = jSONWriter1.isRefDetect((java.lang.Object) 1L);
        java.text.DecimalFormat decimalFormat5 = null;
        jSONWriter1.writeDouble(1.0d, decimalFormat5);
        boolean boolean8 = jSONWriter1.removeReference((java.lang.Object) (short) -1);
        jSONWriter1.writeArrayNull();
        jSONWriter1.writeAny((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.alibaba.fastjson2.JSONWriter jSONWriter0 = com.alibaba.fastjson2.JSONWriter.ofJSONB();
        double[] doubleArray1 = null;
        jSONWriter0.writeDouble(doubleArray1);
        jSONWriter0.writeArrayNull();
        short[] shortArray7 = new short[] { (byte) 0, (byte) 0, (byte) 100 };
        jSONWriter0.writeInt16(shortArray7);
        org.junit.Assert.assertNotNull(jSONWriter0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0, 0, 100]");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray0 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray0);
        jSONWriter1.close();
        java.text.DecimalFormat decimalFormat4 = null;
        jSONWriter1.writeFloat((float) 10, decimalFormat4);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray6 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter7 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray6);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean12 = jSONWriter7.writeTypeName(byteArray10, (long) 10);
        boolean boolean14 = jSONWriter1.writeTypeName(byteArray10, (long) (byte) 100);
        jSONWriter1.writeInt16((short) (byte) 100);
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray6);
        org.junit.Assert.assertNotNull(jSONWriter7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        boolean boolean10 = jSONWriter1.isEnabled((long) ' ');
        char[] charArray11 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter1.writeNameRaw(charArray11, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.alibaba.fastjson2.SymbolTable symbolTable0 = null;
        com.alibaba.fastjson2.JSONWriter jSONWriter1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(symbolTable0);
        com.alibaba.fastjson2.JSONWriter.Feature[] featureArray2 = new com.alibaba.fastjson2.JSONWriter.Feature[] {};
        com.alibaba.fastjson2.JSONWriter jSONWriter3 = com.alibaba.fastjson2.JSONWriter.ofJSONB(featureArray2);
        boolean boolean5 = jSONWriter3.isRefDetect((java.lang.Object) 1L);
        java.lang.Class class6 = null;
        boolean boolean8 = jSONWriter1.isWriteTypeInfo((java.lang.Object) jSONWriter3, class6, (long) ' ');
        byte[] byteArray10 = new byte[] { (byte) -1 };
        boolean boolean12 = jSONWriter3.writeTypeName(byteArray10, 0L);
        jSONWriter3.writeInt8((byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            jSONWriter3.writeRaw('a', 'a');
            org.junit.Assert.fail("Expected exception of type com.alibaba.fastjson2.JSONException; message: UnsupportedOperation");
        } catch (com.alibaba.fastjson2.JSONException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSONWriter1);
        org.junit.Assert.assertNotNull(featureArray2);
        org.junit.Assert.assertNotNull(jSONWriter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.alibaba.fastjson2.JSONWriter.Feature feature0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteBigDecimalAsPlain;
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.alibaba.fastjson2.JSONWriter.Feature.WriteBigDecimalAsPlain + "'", feature0.equals(com.alibaba.fastjson2.JSONWriter.Feature.WriteBigDecimalAsPlain));
    }
}

