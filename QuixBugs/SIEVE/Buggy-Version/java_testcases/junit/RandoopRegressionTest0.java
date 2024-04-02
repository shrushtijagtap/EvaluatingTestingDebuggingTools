import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0001");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0002");
        java.util.ArrayList<java.lang.Integer> intList1 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0003");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0004");
        java.util.ArrayList<java.lang.Boolean> booleanList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = java_programs.SIEVE.all(booleanList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0005");
        java.util.ArrayList<java.lang.Integer> intList1 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0006");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0007");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0008");
        java.util.ArrayList<java.lang.Boolean> booleanList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = java_programs.SIEVE.any(booleanList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0009");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0010");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(0, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0011");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '#', intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0012");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0013");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0014");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0015");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0016");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass7 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0017");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(0, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0018");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0019");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '#', intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0020");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass5 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0021");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0022");
        java.util.ArrayList<java.lang.Integer> intList1 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0023");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 0, 10 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0024");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0025");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) ' ', intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0026");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0027");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.any(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass7 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0028");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 100, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0029");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0030");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 0, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass5 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0031");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0032");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.all(booleanList2);
        boolean boolean6 = java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass7 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0033");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0034");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0035");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0036");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0037");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0038");
        java_programs.SIEVE sIEVE0 = new java_programs.SIEVE();
        java.lang.Class<?> wildcardClass1 = sIEVE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0039");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0040");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass5 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0041");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0042");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp(100, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0043");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0044");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0045");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) (short) 1, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0046");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0047");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0048");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0049");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp(10, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0050");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass8 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0051");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0052");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0053");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(1, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0054");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0055");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0056");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.any(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass6 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0057");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass14 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0058");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass15 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0059");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.any(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass9 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0060");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0061");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.all(booleanList2);
        boolean boolean6 = java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass8 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0062");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0063");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0064");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0065");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0066");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0067");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0068");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0069");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0070");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0071");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0072");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0073");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0074");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0075");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0076");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0077");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0078");
        java.util.ArrayList<java.lang.Integer> intList1 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass2 = intList1.getClass();
        org.junit.Assert.assertNotNull(intList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0079");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0080");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) (byte) 10, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0081");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass9 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0082");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0083");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0084");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0085");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0086");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0087");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass5 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0088");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.lang.Class<?> wildcardClass12 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0089");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0090");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0091");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0092");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0093");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0094");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0095");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0096");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0097");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0098");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0099");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0100");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) (short) 10, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0101");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0102");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.any(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass8 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0103");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0104");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0105");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) ' ', intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0106");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0107");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 0, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0108");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0109");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0110");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0111");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0112");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0113");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 100, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0114");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0115");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0116");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass7 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0117");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0118");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0119");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0120");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0121");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0122");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0123");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0124");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0125");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) '4', intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0126");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0127");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0128");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0129");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0130");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0131");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0132");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '4', intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0133");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp(0, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0134");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0135");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0136");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0137");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0138");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0139");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0140");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) (byte) 1, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0141");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0142");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0143");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass5 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0144");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0145");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0146");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0147");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0148");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0149");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0150");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) (byte) 0, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0151");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0152");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0153");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0154");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0155");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0156");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0157");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0158");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(1, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0159");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0160");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0161");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0162");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0163");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0164");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(100, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0165");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 1, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0166");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0167");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0168");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass14 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0169");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0170");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0171");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '4', intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0172");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) ' ', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0173");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(100, intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0174");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 0, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0175");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) '4', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0176");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0177");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0178");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0179");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0180");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0181");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        boolean boolean15 = java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass16 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0182");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0183");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((-1), intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0184");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0185");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0186");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0187");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(0, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0188");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0189");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0190");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0191");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.any(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = java_programs.SIEVE.any(booleanList2);
        boolean boolean9 = java_programs.SIEVE.all(booleanList2);
        boolean boolean10 = java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass11 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0192");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0193");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) ' ', intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0194");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0195");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0196");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass14 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0197");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.all(booleanList2);
        boolean boolean6 = java_programs.SIEVE.any(booleanList2);
        boolean boolean7 = java_programs.SIEVE.all(booleanList2);
        boolean boolean8 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass9 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0198");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0199");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(100, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0200");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0201");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0202");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = java_programs.SIEVE.any(booleanList11);
        boolean boolean16 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass17 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0203");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((-1), intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0204");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((-1), intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0205");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0206");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0207");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0208");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) ' ', intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0209");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0210");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0211");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0212");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0213");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0214");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) (byte) -1, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0215");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.any(booleanList2);
        boolean boolean5 = java_programs.SIEVE.all(booleanList2);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0216");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass9 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0217");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0218");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0219");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass9 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0220");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0221");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass15 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0222");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0223");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp(1, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0224");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0225");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0226");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0227");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(1, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0228");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0229");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0230");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0231");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        boolean boolean9 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass10 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0232");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0233");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass10 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0234");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0235");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) ' ', intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0236");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0237");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = java_programs.SIEVE.all(booleanList9);
        boolean boolean14 = java_programs.SIEVE.any(booleanList9);
        boolean boolean15 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass16 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0238");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(10, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0239");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0240");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        boolean boolean9 = java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0241");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) -1, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0242");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) '#', intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0243");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0244");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0245");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0246");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) ' ', intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.all(booleanList5);
        boolean boolean8 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0247");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0248");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass16 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0249");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0250");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) (short) -1, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0251");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0252");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0253");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((-1), intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0254");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0255");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = java_programs.SIEVE.all(booleanList2);
        boolean boolean9 = java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass10 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0256");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) '4', intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0257");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0258");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0259");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0260");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass12 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0261");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0262");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass8 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0263");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0264");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0265");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0266");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0267");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0268");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 0, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0269");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) 'a', intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0270");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = java_programs.SIEVE.all(booleanList2);
        boolean boolean9 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass10 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0271");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass21 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0272");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0273");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((-1), intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0274");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0275");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0276");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0277");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass16 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0278");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0279");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0280");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean16 = java_programs.SIEVE.any(booleanList15);
        java.lang.Class<?> wildcardClass17 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0281");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0282");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0283");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass12 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0284");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        boolean boolean20 = java_programs.SIEVE.all(booleanList19);
        java.lang.Class<?> wildcardClass21 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0285");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0286");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass5 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0287");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(100, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0288");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(100, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0289");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0290");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0291");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0292");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(100, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0293");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0294");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0295");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass5 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0296");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0297");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) '4', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0298");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 0, intList2);
        java.lang.Class<?> wildcardClass4 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0299");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0300");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0301");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0302");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0303");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) '4', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass8 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0304");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0305");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0306");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0307");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0308");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0309");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0310");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((-1), intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0311");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0312");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0313");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0314");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0315");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0316");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = java_programs.SIEVE.all(booleanList9);
        boolean boolean14 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass15 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0317");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0318");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass14 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0319");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0320");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0321");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0322");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0323");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) -1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0324");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(1, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0325");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        java.lang.Class<?> wildcardClass18 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0326");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0327");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0328");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '4', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0329");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0330");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) -1, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0331");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0332");
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.lang.Class<?> wildcardClass16 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0333");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((-1), intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0334");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0335");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        boolean boolean7 = java_programs.SIEVE.any(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass9 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0336");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0337");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        boolean boolean9 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass10 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0338");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        boolean boolean6 = java_programs.SIEVE.all(booleanList2);
        boolean boolean7 = java_programs.SIEVE.any(booleanList2);
        boolean boolean8 = java_programs.SIEVE.all(booleanList2);
        java.lang.Class<?> wildcardClass9 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0339");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass13 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0340");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0341");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0342");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList3 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList3, booleanArray2);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0343");
        java.lang.Integer[] intArray8 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList9 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList9, intArray8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0344");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (byte) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 0, intList11);
        java.lang.Class<?> wildcardClass22 = intList11.getClass();
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0345");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0346");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass9 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0347");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (short) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0348");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList7);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0349");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0350");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0351");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0352");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0353");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0354");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0355");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0356");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.any(booleanList11);
        boolean boolean15 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass16 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0357");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0358");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 1, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0359");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0360");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0361");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass20 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0362");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0363");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0364");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0365");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0366");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0367");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass15 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0368");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0369");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0370");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((int) (short) 100, intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0371");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) ' ', intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0372");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0373");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass12 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0374");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0375");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((-1), intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0376");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0377");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(100, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0378");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0379");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0380");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0381");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0382");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(100, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0383");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0384");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0385");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0386");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) 'a', intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass13 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0387");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0388");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0389");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = java_programs.SIEVE.any(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0390");
        java.util.ArrayList<java.lang.Integer> intList12 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) 'a', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) '#', intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp(0, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 1, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList22 = java_programs.SIEVE.list_comp((int) (short) 10, intList12);
        java.util.ArrayList<java.lang.Boolean> booleanList23 = java_programs.SIEVE.list_comp((int) (short) -1, intList12);
        java.lang.Class<?> wildcardClass24 = booleanList23.getClass();
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertNotNull(booleanList22);
        org.junit.Assert.assertNotNull(booleanList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0391");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0392");
        java.util.ArrayList<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Boolean> booleanList2 = java_programs.SIEVE.list_comp((-1), intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0393");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0394");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0395");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 1, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0396");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) 'a', intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0397");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0398");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0399");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass13 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0400");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0401");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0402");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0403");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        boolean boolean14 = java_programs.SIEVE.all(booleanList11);
        boolean boolean15 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass16 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0404");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 1, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0405");
        java.util.ArrayList<java.lang.Integer> intList11 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) 'a', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(0, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) -1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList20 = java_programs.SIEVE.list_comp((int) (short) 1, intList11);
        java.util.ArrayList<java.lang.Boolean> booleanList21 = java_programs.SIEVE.list_comp((int) (short) 10, intList11);
        boolean boolean22 = java_programs.SIEVE.all(booleanList21);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(booleanList20);
        org.junit.Assert.assertNotNull(booleanList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0406");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0407");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0408");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0409");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0410");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) '4', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '4', intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0411");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((-1), intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0412");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass11 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0413");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0414");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) '4', intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList3);
        java.lang.Class<?> wildcardClass6 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0415");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass11 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0416");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0417");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0418");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        boolean boolean13 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass14 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0419");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0420");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0421");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList5);
        boolean boolean10 = java_programs.SIEVE.all(booleanList9);
        boolean boolean11 = java_programs.SIEVE.all(booleanList9);
        boolean boolean12 = java_programs.SIEVE.all(booleanList9);
        java.lang.Class<?> wildcardClass13 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0422");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0423");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) -1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((-1), intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0424");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0425");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0426");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0427");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0428");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        boolean boolean15 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0429");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 10, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '#', intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0430");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0431");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(1, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0432");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '4', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.lang.Class<?> wildcardClass20 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0433");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0434");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.all(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass14 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0435");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(100, intList8);
        boolean boolean16 = java_programs.SIEVE.all(booleanList15);
        boolean boolean17 = java_programs.SIEVE.any(booleanList15);
        boolean boolean18 = java_programs.SIEVE.all(booleanList15);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0436");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0437");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        boolean boolean21 = java_programs.SIEVE.any(booleanList19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0438");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0439");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp(0, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 0, intList3);
        java.lang.Class<?> wildcardClass6 = intList3.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0440");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass5 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0441");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) -1, intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0442");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (short) 1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((-1), intList10);
        boolean boolean20 = java_programs.SIEVE.any(booleanList19);
        java.lang.Class<?> wildcardClass21 = booleanList19.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0443");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0444");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0445");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) '#', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (short) 1, intList5);
        boolean boolean10 = java_programs.SIEVE.any(booleanList9);
        boolean boolean11 = java_programs.SIEVE.any(booleanList9);
        boolean boolean12 = java_programs.SIEVE.any(booleanList9);
        boolean boolean13 = java_programs.SIEVE.any(booleanList9);
        java.lang.Class<?> wildcardClass14 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0446");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(100, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0447");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) '#', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0448");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.all(booleanList7);
        boolean boolean12 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass13 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0449");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((-1), intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0450");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 10, intList2);
        java.lang.Class<?> wildcardClass4 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0451");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass15 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0452");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0453");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0454");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0455");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0456");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.util.ArrayList<java.lang.Boolean> booleanList2 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList2, booleanArray1);
        boolean boolean4 = java_programs.SIEVE.all(booleanList2);
        boolean boolean5 = java_programs.SIEVE.any(booleanList2);
        java.lang.Class<?> wildcardClass6 = booleanList2.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0457");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.all(booleanList17);
        boolean boolean20 = java_programs.SIEVE.all(booleanList17);
        java.lang.Class<?> wildcardClass21 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0458");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) '4', intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0459");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) ' ', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0460");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 0, intList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList5);
        java.lang.Class<?> wildcardClass7 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0461");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(10, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0462");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass12 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0463");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(0, intList8);
        java.lang.Class<?> wildcardClass16 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0464");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (byte) 10, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0465");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        java.lang.Class<?> wildcardClass15 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0466");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        boolean boolean12 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass13 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0467");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.lang.Class<?> wildcardClass8 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0468");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0469");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) -1, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0470");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        boolean boolean9 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass10 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0471");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        java.lang.Class<?> wildcardClass12 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0472");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (short) 1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) -1, intList4);
        boolean boolean8 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0473");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 1, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0474");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.all(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0475");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0476");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = java_programs.SIEVE.any(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0477");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 100);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0478");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0479");
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 1, 1, (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList8 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList8, intArray7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) 'a', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.any(booleanList11);
        java.lang.Class<?> wildcardClass14 = booleanList11.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0480");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) '#', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.lang.Class<?> wildcardClass14 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0481");
        java.util.ArrayList<java.lang.Integer> intList5 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(0, intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) ' ', intList5);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) (byte) 0, intList5);
        java.lang.Class<?> wildcardClass10 = booleanList9.getClass();
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0482");
        java.util.ArrayList<java.lang.Integer> intList10 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(10, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '#', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (byte) 100, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((-1), intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (short) 0, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList18 = java_programs.SIEVE.list_comp(1, intList10);
        java.util.ArrayList<java.lang.Boolean> booleanList19 = java_programs.SIEVE.list_comp((int) (short) 100, intList10);
        java.lang.Class<?> wildcardClass20 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(booleanList18);
        org.junit.Assert.assertNotNull(booleanList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0483");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((-1), intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(1, intList7);
        boolean boolean14 = java_programs.SIEVE.all(booleanList13);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0484");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(1, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 0, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        boolean boolean9 = java_programs.SIEVE.all(booleanList7);
        boolean boolean10 = java_programs.SIEVE.all(booleanList7);
        boolean boolean11 = java_programs.SIEVE.any(booleanList7);
        boolean boolean12 = java_programs.SIEVE.any(booleanList7);
        boolean boolean13 = java_programs.SIEVE.any(booleanList7);
        java.lang.Class<?> wildcardClass14 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0485");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (byte) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) ' ', intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0486");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(0, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        java.lang.Class<?> wildcardClass19 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0487");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp(10, intList2);
        boolean boolean4 = java_programs.SIEVE.any(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        boolean boolean7 = java_programs.SIEVE.all(booleanList3);
        boolean boolean8 = java_programs.SIEVE.any(booleanList3);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0488");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) -1, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0489");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (byte) 100, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.any(booleanList3);
        boolean boolean6 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass7 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0490");
        java.util.ArrayList<java.lang.Integer> intList6 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(10, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) '#', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) 'a', intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 100, intList6);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 1, intList6);
        boolean boolean12 = java_programs.SIEVE.all(booleanList11);
        boolean boolean13 = java_programs.SIEVE.all(booleanList11);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0491");
        java.util.ArrayList<java.lang.Integer> intList2 = java_programs.SIEVE.sieve((java.lang.Integer) 10);
        java.util.ArrayList<java.lang.Boolean> booleanList3 = java_programs.SIEVE.list_comp((int) (short) 10, intList2);
        boolean boolean4 = java_programs.SIEVE.all(booleanList3);
        boolean boolean5 = java_programs.SIEVE.all(booleanList3);
        java.lang.Class<?> wildcardClass6 = booleanList3.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(booleanList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0492");
        java.util.ArrayList<java.lang.Integer> intList8 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) ' ', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) 0, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) (short) 100, intList8);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '#', intList8);
        java.lang.Class<?> wildcardClass16 = booleanList15.getClass();
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0493");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        java.lang.Class<?> wildcardClass18 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0494");
        java.util.ArrayList<java.lang.Integer> intList3 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList4 = java_programs.SIEVE.list_comp((int) (byte) 100, intList3);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(10, intList3);
        boolean boolean6 = java_programs.SIEVE.any(booleanList5);
        boolean boolean7 = java_programs.SIEVE.any(booleanList5);
        boolean boolean8 = java_programs.SIEVE.any(booleanList5);
        java.lang.Class<?> wildcardClass9 = booleanList5.getClass();
        org.junit.Assert.assertNotNull(intList3);
        org.junit.Assert.assertNotNull(booleanList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0495");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) (-1));
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp(1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (short) -1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((-1), intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) '4', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp((int) (byte) 1, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp(100, intList9);
        boolean boolean18 = java_programs.SIEVE.all(booleanList17);
        boolean boolean19 = java_programs.SIEVE.any(booleanList17);
        boolean boolean20 = java_programs.SIEVE.all(booleanList17);
        java.lang.Class<?> wildcardClass21 = booleanList17.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0496");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp(0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp((int) (short) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) '4', intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) ' ', intList7);
        boolean boolean14 = java_programs.SIEVE.any(booleanList13);
        java.lang.Class<?> wildcardClass15 = booleanList13.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0497");
        java.util.ArrayList<java.lang.Integer> intList7 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList8 = java_programs.SIEVE.list_comp((int) (byte) 100, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList9 = java_programs.SIEVE.list_comp(10, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) (byte) -1, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) (byte) 0, intList7);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp(10, intList7);
        java.lang.Class<?> wildcardClass14 = intList7.getClass();
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(booleanList8);
        org.junit.Assert.assertNotNull(booleanList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0498");
        java.util.ArrayList<java.lang.Integer> intList9 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList10 = java_programs.SIEVE.list_comp(10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList11 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList12 = java_programs.SIEVE.list_comp((int) 'a', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList13 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList14 = java_programs.SIEVE.list_comp((int) '#', intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList15 = java_programs.SIEVE.list_comp((int) (short) 10, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList16 = java_programs.SIEVE.list_comp(0, intList9);
        java.util.ArrayList<java.lang.Boolean> booleanList17 = java_programs.SIEVE.list_comp((int) (byte) 10, intList9);
        java.lang.Class<?> wildcardClass18 = intList9.getClass();
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(booleanList10);
        org.junit.Assert.assertNotNull(booleanList11);
        org.junit.Assert.assertNotNull(booleanList12);
        org.junit.Assert.assertNotNull(booleanList13);
        org.junit.Assert.assertNotNull(booleanList14);
        org.junit.Assert.assertNotNull(booleanList15);
        org.junit.Assert.assertNotNull(booleanList16);
        org.junit.Assert.assertNotNull(booleanList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0499");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 0);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp(0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp((int) (byte) 0, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp(100, intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0500");
        java.util.ArrayList<java.lang.Integer> intList4 = java_programs.SIEVE.sieve((java.lang.Integer) 1);
        java.util.ArrayList<java.lang.Boolean> booleanList5 = java_programs.SIEVE.list_comp((int) (byte) 100, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList6 = java_programs.SIEVE.list_comp(10, intList4);
        java.util.ArrayList<java.lang.Boolean> booleanList7 = java_programs.SIEVE.list_comp((int) (short) 10, intList4);
        boolean boolean8 = java_programs.SIEVE.all(booleanList7);
        java.lang.Class<?> wildcardClass9 = booleanList7.getClass();
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(booleanList5);
        org.junit.Assert.assertNotNull(booleanList6);
        org.junit.Assert.assertNotNull(booleanList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

