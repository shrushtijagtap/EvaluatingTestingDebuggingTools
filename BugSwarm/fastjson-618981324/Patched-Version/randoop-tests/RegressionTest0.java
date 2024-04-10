import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test001");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable6 = jdk8DateCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) 1.0f, "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test002");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer4 = jdk8DateCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test003");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable4 = jdk8DateCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test004");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        java.lang.Object obj2 = null;
        java.lang.reflect.Type type4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, obj2, (java.lang.Object) 1.0f, type4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test005");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (short) 0, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test006");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = jdk8DateCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) int4, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test007");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass3 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test008");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.reflect.Type type4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer8 = jdk8DateCodec0.deserialze(defaultJSONParser3, type4, (java.lang.Object) 100.0d, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test009");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.reflect.Type type6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) jdk8DateCodec4, (java.lang.Object) (short) 0, type6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test010");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (byte) 0, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test011");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 0, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test012");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass3 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test013");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 100, (java.lang.Object) jdk8DateCodec3, (java.lang.reflect.Type) wildcardClass6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test014");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test015");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer8 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test016");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) 100.0f, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRandoopRegressionTest0.test017");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) (-1), (java.lang.Object) 10L, (java.lang.reflect.Type) wildcardClass6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test018");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) (byte) -1, (java.lang.Object) '4', (java.lang.reflect.Type) wildcardClass6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test019");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 0.0f, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test020");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test021");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement6 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test022");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test023");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) "", (java.lang.Object) 'a', (java.lang.reflect.Type) wildcardClass5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test024");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test025");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) jdk8DateCodec2, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test026");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 10.0f, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test027");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) wildcardClass4, (java.lang.Object) 100L, (java.lang.reflect.Type) wildcardClass7, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test028");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (byte) -1, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test029");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 100.0f, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test030");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer6 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test031");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 100L, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement8 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 100.0d, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 10L, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 1L, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) jdk8DateCodec3, (java.lang.Object) (short) 0, (java.lang.reflect.Type) wildcardClass6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass3 = jdk8DateCodec2.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (short) 1, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) jdk8DateCodec2, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) "", (java.lang.Object) (-1L), (java.lang.reflect.Type) wildcardClass7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass3 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) jdk8DateCodec2, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) (-1), (java.lang.Object) (short) 0, (java.lang.reflect.Type) wildcardClass7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer8 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer9 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (byte) -1, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) true, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement8 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) '#', "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (short) 10, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) (short) 100, (java.lang.Object) (short) 0, (java.lang.reflect.Type) wildcardClass7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (byte) 100, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int7 = jdk8DateCodec6.getFastMatchToken();
        int int8 = jdk8DateCodec6.getFastMatchToken();
        int int9 = jdk8DateCodec6.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec10 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) (short) 100, (java.lang.Object) int9, (java.lang.reflect.Type) wildcardClass11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) jdk8DateCodec7, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (short) 10, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) 1L, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) '4', beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (byte) 10, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) '4', (java.lang.Object) (-1.0d), (java.lang.reflect.Type) wildcardClass7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 100.0d, (java.lang.Object) wildcardClass6, (java.lang.reflect.Type) wildcardClass9, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type7 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer9 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass7, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) (byte) 1, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 10.0f, (java.lang.Object) (-1L), (java.lang.reflect.Type) wildcardClass7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        int int6 = jdk8DateCodec3.getFastMatchToken();
        int int7 = jdk8DateCodec3.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 0.0d, (java.lang.Object) jdk8DateCodec3, (java.lang.reflect.Type) wildcardClass9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, obj3, (java.lang.Object) '#', (java.lang.reflect.Type) wildcardClass6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) 100, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        int int4 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (byte) -1, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) wildcardClass6, beanContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec5.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) wildcardClass8, beanContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 0.0f, (java.lang.Object) wildcardClass4, (java.lang.reflect.Type) wildcardClass7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) true, (java.lang.Object) 100L, (java.lang.reflect.Type) wildcardClass6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) (byte) 100, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 'a', (java.lang.Object) (byte) 100, (java.lang.reflect.Type) wildcardClass6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 'a', "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration6 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        int int11 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass12 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer5, (java.lang.Object) 0.0f, (java.lang.Object) 100L, (java.lang.reflect.Type) wildcardClass12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) 1, beanContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) wildcardClass4, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement7 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) jdk8DateCodec6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int4 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 10.0f, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int4 = jdk8DateCodec3.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) int4, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int8 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) 10, (java.lang.Object) (byte) 0, (java.lang.reflect.Type) wildcardClass9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = jdk8DateCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) 10.0d, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer5 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec3.getClass();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer7 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass5, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass3 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) (short) 10, beanContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement5 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer8 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (short) 1, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) 100, (java.lang.Object) 100.0d, (java.lang.reflect.Type) wildcardClass7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        int int4 = jdk8DateCodec2.getFastMatchToken();
        int int5 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec4.getClass();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer11 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass7, obj8, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer5 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer5, (java.lang.Object) 10, beanContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) "", beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int7 = jdk8DateCodec6.getFastMatchToken();
        int int8 = jdk8DateCodec6.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int10 = jdk8DateCodec9.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) jdk8DateCodec3, (java.lang.Object) jdk8DateCodec6, (java.lang.reflect.Type) wildcardClass11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) (byte) 10, (java.lang.Object) 1, (java.lang.reflect.Type) wildcardClass8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec6.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type10 = jdk8DateCodec0.deserialze(defaultJSONParser5, (java.lang.reflect.Type) wildcardClass7, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration6 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (byte) 0, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int4 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) 'a', beanContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, obj4, (java.lang.Object) (short) 1, (java.lang.reflect.Type) wildcardClass7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, obj3, (java.lang.Object) (byte) 100, (java.lang.reflect.Type) wildcardClass6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) 10L, beanContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) jdk8DateCodec5, beanContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 0.0f, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer11 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) wildcardClass8, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement8 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) '#', "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        java.lang.reflect.Type type5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int7 = jdk8DateCodec6.getFastMatchToken();
        int int8 = jdk8DateCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence12 = jdk8DateCodec0.deserialze(defaultJSONParser4, type5, (java.lang.Object) wildcardClass9, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) 100.0d, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 1.0d, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) '#', (java.lang.Object) 4, (java.lang.reflect.Type) wildcardClass6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        java.lang.reflect.Type type4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (byte) -1, (java.lang.Object) 10.0d, type4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (-1.0f), "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        int int7 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass8, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 0, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.reflect.Type type4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        int int8 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer12 = jdk8DateCodec0.deserialze(defaultJSONParser3, type4, (java.lang.Object) wildcardClass9, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        int int6 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass7, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) 0, beanContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        int int9 = jdk8DateCodec7.getFastMatchToken();
        int int10 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec7.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec12 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int13 = jdk8DateCodec12.getFastMatchToken();
        java.lang.Class<?> wildcardClass14 = jdk8DateCodec12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer15 = jdk8DateCodec0.deserialze(defaultJSONParser6, (java.lang.reflect.Type) wildcardClass11, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) (short) -1, (java.lang.Object) false, (java.lang.reflect.Type) wildcardClass6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer5 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer5, (java.lang.Object) (short) 0, beanContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer7 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, obj4, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 100L, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        int int7 = jdk8DateCodec4.getFastMatchToken();
        int int8 = jdk8DateCodec4.getFastMatchToken();
        int int9 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec4.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int12 = jdk8DateCodec11.getFastMatchToken();
        int int13 = jdk8DateCodec11.getFastMatchToken();
        int int14 = jdk8DateCodec11.getFastMatchToken();
        int int15 = jdk8DateCodec11.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement16 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass10, (java.lang.Object) jdk8DateCodec11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jdk8DateCodec11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer11 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass6, obj7, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        int int11 = jdk8DateCodec8.getFastMatchToken();
        int int12 = jdk8DateCodec8.getFastMatchToken();
        int int13 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass14 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) 1, (java.lang.Object) wildcardClass7, (java.lang.reflect.Type) wildcardClass14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jdk8DateCodec8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec4.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int9 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 0L, (java.lang.Object) jdk8DateCodec4, (java.lang.reflect.Type) wildcardClass10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement13 = jdk8DateCodec0.deserialze(defaultJSONParser6, (java.lang.reflect.Type) wildcardClass9, (java.lang.Object) 10, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) 0.0f, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        int int7 = jdk8DateCodec4.getFastMatchToken();
        int int8 = jdk8DateCodec4.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) jdk8DateCodec4, beanContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        int int9 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jdk8DateCodec0.deserialze(defaultJSONParser6, (java.lang.reflect.Type) wildcardClass10, (java.lang.Object) (-1.0d), "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        int int9 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec12 = jdk8DateCodec0.deserialze(defaultJSONParser6, (java.lang.reflect.Type) wildcardClass10, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer12 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass8, (java.lang.Object) 100, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        int int8 = jdk8DateCodec5.getFastMatchToken();
        int int9 = jdk8DateCodec5.getFastMatchToken();
        int int10 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type15 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass11, (java.lang.Object) true, "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) '4', beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int7 = jdk8DateCodec6.getFastMatchToken();
        int int8 = jdk8DateCodec6.getFastMatchToken();
        int int9 = jdk8DateCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer14 = jdk8DateCodec0.deserialze(defaultJSONParser5, (java.lang.reflect.Type) wildcardClass10, (java.lang.Object) (-1), "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        int int6 = jdk8DateCodec3.getFastMatchToken();
        int int7 = jdk8DateCodec3.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int10 = jdk8DateCodec9.getFastMatchToken();
        int int11 = jdk8DateCodec9.getFastMatchToken();
        int int12 = jdk8DateCodec9.getFastMatchToken();
        int int13 = jdk8DateCodec9.getFastMatchToken();
        int int14 = jdk8DateCodec9.getFastMatchToken();
        java.lang.Class<?> wildcardClass15 = jdk8DateCodec9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) int7, (java.lang.Object) false, (java.lang.reflect.Type) wildcardClass15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) "", (java.lang.Object) 100.0d, (java.lang.reflect.Type) wildcardClass6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 'a', (java.lang.Object) (byte) 0, (java.lang.reflect.Type) wildcardClass7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) 0, (java.lang.Object) (short) 1, (java.lang.reflect.Type) wildcardClass7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec3.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) wildcardClass6, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ContextObjectSerializer contextObjectSerializer6 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer6 = null;
        java.lang.Object obj7 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer6, obj7, beanContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer7 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec8.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec10 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int11 = jdk8DateCodec10.getFastMatchToken();
        int int12 = jdk8DateCodec10.getFastMatchToken();
        int int13 = jdk8DateCodec10.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec14 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int15 = jdk8DateCodec14.getFastMatchToken();
        int int16 = jdk8DateCodec14.getFastMatchToken();
        int int17 = jdk8DateCodec14.getFastMatchToken();
        java.lang.Class<?> wildcardClass18 = jdk8DateCodec14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer7, (java.lang.Object) wildcardClass9, (java.lang.Object) int13, (java.lang.reflect.Type) wildcardClass18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jdk8DateCodec10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass8, (java.lang.Object) (byte) 0, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 'a', beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        int int8 = jdk8DateCodec5.getFastMatchToken();
        int int9 = jdk8DateCodec5.getFastMatchToken();
        int int10 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) 1, (java.lang.Object) 0L, (java.lang.reflect.Type) wildcardClass11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser8 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int10 = jdk8DateCodec9.getFastMatchToken();
        int int11 = jdk8DateCodec9.getFastMatchToken();
        java.lang.Class<?> wildcardClass12 = jdk8DateCodec9.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec13 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int14 = jdk8DateCodec13.getFastMatchToken();
        int int15 = jdk8DateCodec13.getFastMatchToken();
        int int16 = jdk8DateCodec13.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer19 = jdk8DateCodec0.deserialze(defaultJSONParser8, (java.lang.reflect.Type) wildcardClass12, (java.lang.Object) jdk8DateCodec13, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jdk8DateCodec13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer11 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass7, (java.lang.Object) (-1L), "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int9 = jdk8DateCodec8.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec10 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int11 = jdk8DateCodec10.getFastMatchToken();
        int int12 = jdk8DateCodec10.getFastMatchToken();
        java.lang.Class<?> wildcardClass13 = jdk8DateCodec10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer6, (java.lang.Object) 1.0f, (java.lang.Object) jdk8DateCodec8, (java.lang.reflect.Type) wildcardClass13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        int int6 = jdk8DateCodec3.getFastMatchToken();
        int int7 = jdk8DateCodec3.getFastMatchToken();
        int int8 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec3.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec10 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration12 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass9, (java.lang.Object) jdk8DateCodec10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jdk8DateCodec10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int7 = jdk8DateCodec6.getFastMatchToken();
        int int8 = jdk8DateCodec6.getFastMatchToken();
        int int9 = jdk8DateCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec6.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int12 = jdk8DateCodec11.getFastMatchToken();
        int int13 = jdk8DateCodec11.getFastMatchToken();
        int int14 = jdk8DateCodec11.getFastMatchToken();
        int int15 = jdk8DateCodec11.getFastMatchToken();
        int int16 = jdk8DateCodec11.getFastMatchToken();
        int int17 = jdk8DateCodec11.getFastMatchToken();
        int int18 = jdk8DateCodec11.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer21 = jdk8DateCodec0.deserialze(defaultJSONParser5, (java.lang.reflect.Type) wildcardClass10, (java.lang.Object) int18, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jdk8DateCodec11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser7 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec8.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec12 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int13 = jdk8DateCodec12.getFastMatchToken();
        int int14 = jdk8DateCodec12.getFastMatchToken();
        int int15 = jdk8DateCodec12.getFastMatchToken();
        int int16 = jdk8DateCodec12.getFastMatchToken();
        int int17 = jdk8DateCodec12.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer20 = jdk8DateCodec0.deserialze(defaultJSONParser7, (java.lang.reflect.Type) wildcardClass11, (java.lang.Object) jdk8DateCodec12, "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(jdk8DateCodec12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec7.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer6, (java.lang.Object) wildcardClass8, beanContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser8 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence12 = jdk8DateCodec0.deserialze(defaultJSONParser8, (java.lang.reflect.Type) wildcardClass10, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        int int11 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass12 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer5, (java.lang.Object) false, (java.lang.Object) 1.0d, (java.lang.reflect.Type) wildcardClass12, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec3.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (short) 100, (java.lang.Object) wildcardClass6, (java.lang.reflect.Type) wildcardClass8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer9 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) jdk8DateCodec7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        java.lang.reflect.Type type2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = jdk8DateCodec0.deserialze(defaultJSONParser1, type2, (java.lang.Object) false, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        int int6 = jdk8DateCodec3.getFastMatchToken();
        int int7 = jdk8DateCodec3.getFastMatchToken();
        int int8 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (short) 10, (java.lang.Object) int8, (java.lang.reflect.Type) wildcardClass10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer8 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int12 = jdk8DateCodec11.getFastMatchToken();
        int int13 = jdk8DateCodec11.getFastMatchToken();
        java.lang.Class<?> wildcardClass14 = jdk8DateCodec11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer8, (java.lang.Object) "", (java.lang.Object) (short) -1, (java.lang.reflect.Type) wildcardClass14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 10, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer6 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer6, (java.lang.Object) (byte) 100, beanContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer7 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec12 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int13 = jdk8DateCodec12.getFastMatchToken();
        int int14 = jdk8DateCodec12.getFastMatchToken();
        int int15 = jdk8DateCodec12.getFastMatchToken();
        int int16 = jdk8DateCodec12.getFastMatchToken();
        int int17 = jdk8DateCodec12.getFastMatchToken();
        java.lang.Class<?> wildcardClass18 = jdk8DateCodec12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer7, (java.lang.Object) int10, (java.lang.Object) 100, (java.lang.reflect.Type) wildcardClass18, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        int int7 = jdk8DateCodec4.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) (-1.0f), (java.lang.Object) int7, (java.lang.reflect.Type) wildcardClass11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        int int4 = jdk8DateCodec2.getFastMatchToken();
        int int5 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec2.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        int int9 = jdk8DateCodec7.getFastMatchToken();
        int int10 = jdk8DateCodec7.getFastMatchToken();
        int int11 = jdk8DateCodec7.getFastMatchToken();
        int int12 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass13 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer16 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) jdk8DateCodec7, "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser5 = null;
        java.lang.reflect.Type type6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jdk8DateCodec0.deserialze(defaultJSONParser5, type6, (java.lang.Object) 1L, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        int int8 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec5.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec10 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass9, (java.lang.Object) jdk8DateCodec10, "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jdk8DateCodec10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 0.0f, (java.lang.Object) 1.0d, (java.lang.reflect.Type) wildcardClass7, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer8 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer8, (java.lang.Object) 10, beanContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        int int7 = jdk8DateCodec4.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) int7, beanContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec3.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) jdk8DateCodec3, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration7 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer8 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int10 = jdk8DateCodec9.getFastMatchToken();
        int int11 = jdk8DateCodec9.getFastMatchToken();
        java.lang.Class<?> wildcardClass12 = jdk8DateCodec9.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer8, (java.lang.Object) wildcardClass12, beanContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration12 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass8, (java.lang.Object) 10.0d, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec11 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass7, (java.lang.Object) (short) 0, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 1L, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) 0L, beanContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 0.0d, beanContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        int int9 = jdk8DateCodec7.getFastMatchToken();
        int int10 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec7.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec12 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer13 = jdk8DateCodec0.deserialze(defaultJSONParser6, (java.lang.reflect.Type) wildcardClass11, (java.lang.Object) jdk8DateCodec12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass3 = jdk8DateCodec2.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration5 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) jdk8DateCodec4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        int int6 = jdk8DateCodec3.getFastMatchToken();
        int int7 = jdk8DateCodec3.getFastMatchToken();
        int int8 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec3.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass12 = jdk8DateCodec11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, (java.lang.Object) wildcardClass9, (java.lang.Object) (byte) -1, (java.lang.reflect.Type) wildcardClass12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jdk8DateCodec11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer8 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass4, obj5, "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        int int9 = jdk8DateCodec7.getFastMatchToken();
        int int10 = jdk8DateCodec7.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence13 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) int10, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int3 = jdk8DateCodec2.getFastMatchToken();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type8 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass4, (java.lang.Object) (byte) 100, "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(jdk8DateCodec2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec2 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass3 = jdk8DateCodec2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = jdk8DateCodec0.deserialze(defaultJSONParser1, (java.lang.reflect.Type) wildcardClass3, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) wildcardClass5, beanContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) (short) 0, (java.lang.Object) 10L, (java.lang.reflect.Type) wildcardClass6, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int7 = jdk8DateCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer10 = jdk8DateCodec0.deserialze(defaultJSONParser5, (java.lang.reflect.Type) wildcardClass8, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        int int9 = jdk8DateCodec7.getFastMatchToken();
        int int10 = jdk8DateCodec7.getFastMatchToken();
        int int11 = jdk8DateCodec7.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec13 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int14 = jdk8DateCodec13.getFastMatchToken();
        int int15 = jdk8DateCodec13.getFastMatchToken();
        java.lang.Class<?> wildcardClass16 = jdk8DateCodec13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer6, (java.lang.Object) int11, (java.lang.Object) false, (java.lang.reflect.Type) wildcardClass16, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int7 = jdk8DateCodec6.getFastMatchToken();
        int int8 = jdk8DateCodec6.getFastMatchToken();
        int int9 = jdk8DateCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jdk8DateCodec0.deserialze(defaultJSONParser5, (java.lang.reflect.Type) wildcardClass10, (java.lang.Object) (short) 10, "hi!", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser7 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int9 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec8.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec11 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int12 = jdk8DateCodec11.getFastMatchToken();
        int int13 = jdk8DateCodec11.getFastMatchToken();
        int int14 = jdk8DateCodec11.getFastMatchToken();
        int int15 = jdk8DateCodec11.getFastMatchToken();
        int int16 = jdk8DateCodec11.getFastMatchToken();
        int int17 = jdk8DateCodec11.getFastMatchToken();
        int int18 = jdk8DateCodec11.getFastMatchToken();
        int int19 = jdk8DateCodec11.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type22 = jdk8DateCodec0.deserialze(defaultJSONParser7, (java.lang.reflect.Type) wildcardClass10, (java.lang.Object) jdk8DateCodec11, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jdk8DateCodec11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 1.0f, (java.lang.Object) '#', (java.lang.reflect.Type) wildcardClass6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        java.lang.Object obj8 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int10 = jdk8DateCodec9.getFastMatchToken();
        int int11 = jdk8DateCodec9.getFastMatchToken();
        int int12 = jdk8DateCodec9.getFastMatchToken();
        int int13 = jdk8DateCodec9.getFastMatchToken();
        int int14 = jdk8DateCodec9.getFastMatchToken();
        java.lang.Class<?> wildcardClass15 = jdk8DateCodec9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer4, (java.lang.Object) jdk8DateCodec5, obj8, (java.lang.reflect.Type) wildcardClass15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jdk8DateCodec9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (byte) 100, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser7 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        int int11 = jdk8DateCodec8.getFastMatchToken();
        int int12 = jdk8DateCodec8.getFastMatchToken();
        int int13 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass14 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer18 = jdk8DateCodec0.deserialze(defaultJSONParser7, (java.lang.reflect.Type) wildcardClass14, (java.lang.Object) (-1L), "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer contextObjectDeserializer8 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int7 = jdk8DateCodec6.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration12 = jdk8DateCodec0.deserialze(defaultJSONParser5, (java.lang.reflect.Type) wildcardClass8, (java.lang.Object) 100.0d, "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        int int8 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser9 = null;
        java.lang.reflect.Type type10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer14 = jdk8DateCodec0.deserialze(defaultJSONParser9, type10, (java.lang.Object) (byte) 10, "hi!", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer8 = null;
        java.lang.reflect.Type type11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer8, (java.lang.Object) (byte) 10, (java.lang.Object) (byte) 10, type11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer6 = null;
        com.alibaba.fastjson.serializer.BeanContext beanContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer6, (java.lang.Object) (-1L), beanContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        int int11 = jdk8DateCodec8.getFastMatchToken();
        int int12 = jdk8DateCodec8.getFastMatchToken();
        int int13 = jdk8DateCodec8.getFastMatchToken();
        int int14 = jdk8DateCodec8.getFastMatchToken();
        int int15 = jdk8DateCodec8.getFastMatchToken();
        int int16 = jdk8DateCodec8.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = jdk8DateCodec0.deserialze(defaultJSONParser5, (java.lang.reflect.Type) wildcardClass7, (java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jdk8DateCodec8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        int int6 = jdk8DateCodec4.getFastMatchToken();
        int int7 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass8 = jdk8DateCodec4.getClass();
        com.alibaba.fastjson.serializer.BeanContext beanContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) jdk8DateCodec4, beanContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser6 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int8 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = jdk8DateCodec0.deserialze(defaultJSONParser6, (java.lang.reflect.Type) wildcardClass9, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int5 = jdk8DateCodec4.getFastMatchToken();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int8 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer3, (java.lang.Object) int5, (java.lang.Object) 0L, (java.lang.reflect.Type) wildcardClass9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        int int7 = jdk8DateCodec5.getFastMatchToken();
        int int8 = jdk8DateCodec5.getFastMatchToken();
        int int9 = jdk8DateCodec5.getFastMatchToken();
        int int10 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec5.getClass();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass11, obj12, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser4 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = jdk8DateCodec0.deserialze(defaultJSONParser4, (java.lang.reflect.Type) wildcardClass7, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type9 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.serializer.ObjectSerializer objectSerializer9 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) (byte) 10, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        com.alibaba.fastjson.serializer.BeanContext beanContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer2, obj3, beanContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type9 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) 4, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer1 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass4 = jdk8DateCodec3.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec5 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int6 = jdk8DateCodec5.getFastMatchToken();
        java.lang.Class<?> wildcardClass7 = jdk8DateCodec5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer1, (java.lang.Object) 10.0f, (java.lang.Object) wildcardClass4, (java.lang.reflect.Type) wildcardClass7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jdk8DateCodec5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec7 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int8 = jdk8DateCodec7.getFastMatchToken();
        int int9 = jdk8DateCodec7.getFastMatchToken();
        java.lang.Class<?> wildcardClass10 = jdk8DateCodec7.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec11 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int12 = jdk8DateCodec11.getFastMatchToken();
        java.lang.Class<?> wildcardClass13 = jdk8DateCodec11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer5, (java.lang.Object) 100L, (java.lang.Object) wildcardClass10, (java.lang.reflect.Type) wildcardClass13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        int int5 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer objectDeserializer10 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) ' ', "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer6 = null;
        java.lang.Object obj8 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int10 = jdk8DateCodec9.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer6, (java.lang.Object) 1.0f, obj8, (java.lang.reflect.Type) wildcardClass11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser7 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        java.lang.Class<?> wildcardClass9 = jdk8DateCodec8.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec10 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int11 = jdk8DateCodec10.getFastMatchToken();
        int int12 = jdk8DateCodec10.getFastMatchToken();
        int int13 = jdk8DateCodec10.getFastMatchToken();
        int int14 = jdk8DateCodec10.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jdk8DateCodec0.deserialze(defaultJSONParser7, (java.lang.reflect.Type) wildcardClass9, (java.lang.Object) jdk8DateCodec10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser3 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec4 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int5 = jdk8DateCodec4.getFastMatchToken();
        java.lang.Class<?> wildcardClass6 = jdk8DateCodec4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = jdk8DateCodec0.deserialze(defaultJSONParser3, (java.lang.reflect.Type) wildcardClass6, (java.lang.Object) (byte) 1, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser8 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec9 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int10 = jdk8DateCodec9.getFastMatchToken();
        java.lang.Class<?> wildcardClass11 = jdk8DateCodec9.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec12 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int13 = jdk8DateCodec12.getFastMatchToken();
        int int14 = jdk8DateCodec12.getFastMatchToken();
        java.lang.Class<?> wildcardClass15 = jdk8DateCodec12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = jdk8DateCodec0.deserialze(defaultJSONParser8, (java.lang.reflect.Type) wildcardClass11, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec8 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int9 = jdk8DateCodec8.getFastMatchToken();
        int int10 = jdk8DateCodec8.getFastMatchToken();
        int int11 = jdk8DateCodec8.getFastMatchToken();
        java.lang.Class<?> wildcardClass12 = jdk8DateCodec8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer5, (java.lang.Object) (-1L), (java.lang.Object) 1.0d, (java.lang.reflect.Type) wildcardClass12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer5 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int7 = jdk8DateCodec6.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer5, (java.lang.Object) jdk8DateCodec6, beanContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser2 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec3 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int4 = jdk8DateCodec3.getFastMatchToken();
        java.lang.Class<?> wildcardClass5 = jdk8DateCodec3.getClass();
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec6 = new com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec();
        int int7 = jdk8DateCodec6.getFastMatchToken();
        int int8 = jdk8DateCodec6.getFastMatchToken();
        int int9 = jdk8DateCodec6.getFastMatchToken();
        int int10 = jdk8DateCodec6.getFastMatchToken();
        int int11 = jdk8DateCodec6.getFastMatchToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement14 = jdk8DateCodec0.deserialze(defaultJSONParser2, (java.lang.reflect.Type) wildcardClass5, (java.lang.Object) jdk8DateCodec6, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec0 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int1 = jdk8DateCodec0.getFastMatchToken();
        int int2 = jdk8DateCodec0.getFastMatchToken();
        int int3 = jdk8DateCodec0.getFastMatchToken();
        int int4 = jdk8DateCodec0.getFastMatchToken();
        int int5 = jdk8DateCodec0.getFastMatchToken();
        int int6 = jdk8DateCodec0.getFastMatchToken();
        int int7 = jdk8DateCodec0.getFastMatchToken();
        int int8 = jdk8DateCodec0.getFastMatchToken();
        com.alibaba.fastjson.serializer.JSONSerializer jSONSerializer9 = null;
        com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec jdk8DateCodec10 = com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.instance;
        int int11 = jdk8DateCodec10.getFastMatchToken();
        int int12 = jdk8DateCodec10.getFastMatchToken();
        int int13 = jdk8DateCodec10.getFastMatchToken();
        com.alibaba.fastjson.serializer.BeanContext beanContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jdk8DateCodec0.write(jSONSerializer9, (java.lang.Object) jdk8DateCodec10, beanContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jdk8DateCodec0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(jdk8DateCodec10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }
}

