import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        int[] intArray2 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (short) 0 };
        int[][] intArray5 = new int[][] { intArray2, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = correct_java_programs.KNAPSACK.knapsack((-1), intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int[] intArray7 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray15 = new int[][] { intArray7, intArray14 };
        int int16 = correct_java_programs.KNAPSACK.knapsack(0, intArray15);
        java.lang.Class<?> wildcardClass17 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int[] intArray8 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray16);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int[] intArray7 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray15 = new int[][] { intArray7, intArray14 };
        int int16 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray15);
        java.lang.Class<?> wildcardClass17 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.KNAPSACK.knapsack((-1), intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int[] intArray8 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray16);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(100, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        correct_java_programs.KNAPSACK kNAPSACK0 = new correct_java_programs.KNAPSACK();
        java.lang.Class<?> wildcardClass1 = kNAPSACK0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int[] intArray8 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray16);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int[] intArray8 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(100, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int[] intArray8 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray16);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((-1), intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack((-1), intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(1, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.KNAPSACK.knapsack((-1), intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int[] intArray8 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.KNAPSACK.knapsack((-1), intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int[] intArray8 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray16);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int[][] intArray1 = new int[][] {};
        int int2 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((-1), intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int[] intArray5 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        int int7 = correct_java_programs.KNAPSACK.knapsack(0, intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack(1, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(10, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack(0, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int[] intArray6 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        int int8 = correct_java_programs.KNAPSACK.knapsack(0, intArray7);
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        int[][] intArray2 = new int[][] {};
        int int3 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int[] intArray6 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        int int8 = correct_java_programs.KNAPSACK.knapsack(0, intArray7);
        int int9 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((-1), intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack(1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(1, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        int[] intArray7 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray8 = new int[][] { intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray8);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray8);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((-1), intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((-1), intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack(100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        int[] intArray6 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray12 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray18 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[][] intArray19 = new int[][] { intArray6, intArray12, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        java.lang.Class<?> wildcardClass21 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 30 + "'", int20 == 30);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        int[] intArray3 = new int[] { (-1), ' ' };
        int[] intArray6 = new int[] { (-1), ' ' };
        int[][] intArray7 = new int[][] { intArray3, intArray6 };
        int int8 = correct_java_programs.KNAPSACK.knapsack(0, intArray7);
        java.lang.Class<?> wildcardClass9 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        int[] intArray8 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack(1, intArray16);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((-1), intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack(10, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((-1), intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((-1), intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((-1), intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(10, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((-1), intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        int[][] intArray2 = new int[][] {};
        int int3 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray2);
        int int4 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(100, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        int[] intArray6 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        int int8 = correct_java_programs.KNAPSACK.knapsack(0, intArray7);
        int int9 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(100, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        int[] intArray7 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray8 = new int[][] { intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray8);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray8);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack(1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        int[] intArray8 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray16);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.KNAPSACK.knapsack((-1), intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(1, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        int[] intArray7 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray8 = new int[][] { intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray8);
        int int11 = correct_java_programs.KNAPSACK.knapsack(1, intArray8);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((-1), intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        int[][] intArray2 = new int[][] {};
        int int3 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray2);
        int int4 = correct_java_programs.KNAPSACK.knapsack(0, intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        int[] intArray9 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray10 = new int[][] { intArray9 };
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray10);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray10);
        int int14 = correct_java_programs.KNAPSACK.knapsack(30, intArray10);
        int int15 = correct_java_programs.KNAPSACK.knapsack(52, intArray10);
        java.lang.Class<?> wildcardClass16 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack(1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(1, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(10, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(100, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(10, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(1, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(52, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((-1), intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        int[] intArray7 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray8 = new int[][] { intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        int[] intArray7 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray8 = new int[][] { intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray8);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        int[] intArray10 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray11 = new int[][] { intArray10 };
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray11);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray11);
        int int15 = correct_java_programs.KNAPSACK.knapsack(30, intArray11);
        int int16 = correct_java_programs.KNAPSACK.knapsack(52, intArray11);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray11);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack(1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(30, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack(100, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((-1), intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack(1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(10, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(52, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        int[] intArray8 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray9 = new int[][] { intArray8 };
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray9);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = correct_java_programs.KNAPSACK.knapsack((-1), intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(52, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        int[] intArray3 = new int[] { (byte) -1, 30 };
        int[] intArray6 = new int[] { (byte) -1, 30 };
        int[] intArray9 = new int[] { (byte) -1, 30 };
        int[] intArray12 = new int[] { (byte) -1, 30 };
        int[] intArray15 = new int[] { (byte) -1, 30 };
        int[][] intArray16 = new int[][] { intArray3, intArray6, intArray9, intArray12, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 30]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 30]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 30]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 30]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 30]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(30, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(10, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(1, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((-1), intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(30, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((-1), intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack(52, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(1, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        int[] intArray2 = new int[] { ' ' };
        int[] intArray4 = new int[] { ' ' };
        int[] intArray6 = new int[] { ' ' };
        int[] intArray8 = new int[] { ' ' };
        int[] intArray10 = new int[] { ' ' };
        int[][] intArray11 = new int[][] { intArray2, intArray4, intArray6, intArray8, intArray10 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = correct_java_programs.KNAPSACK.knapsack(1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        int[][] intArray3 = new int[][] {};
        int int4 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray3);
        int int5 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray3);
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(52, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        int[] intArray8 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray9 = new int[][] { intArray8 };
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray9);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray9);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray9);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((-1), intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        int[][] intArray3 = new int[][] {};
        int int4 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray3);
        int int5 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        int[][] intArray3 = new int[][] {};
        int int4 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray3);
        int int5 = correct_java_programs.KNAPSACK.knapsack(0, intArray3);
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        int[] intArray8 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray9 = new int[][] { intArray8 };
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray9);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray9);
        int int13 = correct_java_programs.KNAPSACK.knapsack(30, intArray9);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        int[][] intArray3 = new int[][] {};
        int int4 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray3);
        int int5 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray3);
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(52, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        int[] intArray4 = new int[] { (-1), ' ' };
        int[] intArray7 = new int[] { (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray4, intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        int[][] intArray4 = new int[][] {};
        int int5 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray4);
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray4);
        int int7 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray4);
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        int[][] intArray4 = new int[][] {};
        int int5 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray4);
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray4);
        int int7 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray4);
        int int8 = correct_java_programs.KNAPSACK.knapsack(0, intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((-1), intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(10, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(30, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(52, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((-1), intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        int[] intArray8 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray9 = new int[][] { intArray8 };
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray9);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray9);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray9);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(30, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack(1, intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((-1), intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = correct_java_programs.KNAPSACK.knapsack((-1), intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(30, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack(1, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack(30, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack(10, intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(30, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((-1), intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        int[][] intArray4 = new int[][] {};
        int int5 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray4);
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray4);
        int int7 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray4);
        int int8 = correct_java_programs.KNAPSACK.knapsack(100, intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(1, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((-1), intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.KNAPSACK.knapsack((-1), intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((-1), intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(52, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((-1), intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(52, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        int[] intArray8 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray16);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray16);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        int[] intArray8 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray16 = new int[][] { intArray8, intArray15 };
        int int17 = correct_java_programs.KNAPSACK.knapsack(0, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = correct_java_programs.KNAPSACK.knapsack((-1), intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((-1), intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        int[] intArray10 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray11 = new int[][] { intArray10 };
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray11);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray11);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray11);
        int int15 = correct_java_programs.KNAPSACK.knapsack(30, intArray11);
        int int16 = correct_java_programs.KNAPSACK.knapsack(52, intArray11);
        int int17 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray11);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        int[] intArray11 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray12 = new int[][] { intArray11 };
        int int13 = correct_java_programs.KNAPSACK.knapsack(0, intArray12);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray12);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray12);
        int int16 = correct_java_programs.KNAPSACK.knapsack(30, intArray12);
        int int17 = correct_java_programs.KNAPSACK.knapsack(52, intArray12);
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray12);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray12);
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        int[][] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        int[] intArray7 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray8 = new int[][] { intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray8);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray8);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        int[][] intArray3 = new int[][] {};
        int int4 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray3);
        int int5 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray3);
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray25 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray26 = new int[][] { intArray18, intArray25 };
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray26);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray26);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray26);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray26);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray26);
        int int36 = correct_java_programs.KNAPSACK.knapsack(100, intArray26);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray26);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray26);
        java.lang.Class<?> wildcardClass39 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        int[] intArray11 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray18 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        int[] intArray8 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray9 = new int[][] { intArray8 };
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = correct_java_programs.KNAPSACK.knapsack((-1), intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        int[] intArray7 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray13 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[] intArray19 = new int[] { 1, 10, (byte) 10, 52, (short) -1 };
        int[][] intArray20 = new int[][] { intArray7, intArray13, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        int[] intArray15 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray22 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(30, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        int[] intArray7 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray8 = new int[][] { intArray7 };
        int int9 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray8);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray8);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        int[] intArray9 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack(0, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        int[] intArray14 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray21 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack(30, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((-1), intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray24 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        int[] intArray8 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray9 = new int[][] { intArray8 };
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int12 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray9);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray9);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(52, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        int[] intArray13 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray20 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(30, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(30, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(52, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        int[] intArray9 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray10 = new int[][] { intArray9 };
        int int11 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        int int12 = correct_java_programs.KNAPSACK.knapsack(0, intArray10);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray10);
        int int14 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray10);
        int int15 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray10);
        java.lang.Class<?> wildcardClass16 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(30, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        int[] intArray16 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray23 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(10, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray26 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray27 = new int[][] { intArray19, intArray26 };
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray27);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray27);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray27);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray27);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray27);
        int int36 = correct_java_programs.KNAPSACK.knapsack(10, intArray27);
        int int37 = correct_java_programs.KNAPSACK.knapsack(100, intArray27);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray27);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        int[] intArray11 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray18 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray19 = new int[][] { intArray11, intArray18 };
        int int20 = correct_java_programs.KNAPSACK.knapsack(0, intArray19);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray19);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray19);
        int int23 = correct_java_programs.KNAPSACK.knapsack(10, intArray19);
        int int24 = correct_java_programs.KNAPSACK.knapsack(1, intArray19);
        java.lang.Class<?> wildcardClass25 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray23 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray16, intArray23 };
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray24);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray24);
        int int30 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray24);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray24);
        int int33 = correct_java_programs.KNAPSACK.knapsack(1, intArray24);
        int int34 = correct_java_programs.KNAPSACK.knapsack(0, intArray24);
        java.lang.Class<?> wildcardClass35 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(1, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = correct_java_programs.KNAPSACK.knapsack((-1), intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        int[] intArray10 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack(0, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray18);
        int int22 = correct_java_programs.KNAPSACK.knapsack(100, intArray18);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) -1, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack((int) (short) 100, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(30, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(1, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int36 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        java.lang.Class<?> wildcardClass37 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray23);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray27 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray28 = new int[][] { intArray20, intArray27 };
        int int29 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray28);
        int int31 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int32 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int33 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray28);
        int int35 = correct_java_programs.KNAPSACK.knapsack(0, intArray28);
        int int36 = correct_java_programs.KNAPSACK.knapsack(1, intArray28);
        int int37 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray28);
        int int38 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int39 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray28);
        int int40 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray28);
        int int41 = correct_java_programs.KNAPSACK.knapsack(10, intArray28);
        int int42 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray28);
        java.lang.Class<?> wildcardClass43 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        int[][] intArray4 = new int[][] {};
        int int5 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray4);
        int int6 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray4);
        int int7 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray4);
        int int8 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(100, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(52, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 1, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) '4', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(10, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        int[] intArray17 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray24 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray25 = new int[][] { intArray17, intArray24 };
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray25);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray25);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray25);
        int int29 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray25);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray25);
        int int31 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int32 = correct_java_programs.KNAPSACK.knapsack(100, intArray25);
        int int33 = correct_java_programs.KNAPSACK.knapsack(10, intArray25);
        int int34 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray25);
        int int35 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = correct_java_programs.KNAPSACK.knapsack((-1), intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        int[] intArray10 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray17 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray18 = new int[][] { intArray10, intArray17 };
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray18);
        int int20 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray18);
        int int21 = correct_java_programs.KNAPSACK.knapsack(30, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) -1, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        int[] intArray9 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray16 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray17 = new int[][] { intArray9, intArray16 };
        int int18 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray17);
        int int19 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray17);
        int int20 = correct_java_programs.KNAPSACK.knapsack(30, intArray17);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        int[] intArray15 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray22 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray23 = new int[][] { intArray15, intArray22 };
        int int24 = correct_java_programs.KNAPSACK.knapsack(0, intArray23);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray23);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray23);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray23);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray23);
        int int29 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        int int30 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int31 = correct_java_programs.KNAPSACK.knapsack(100, intArray23);
        int int32 = correct_java_programs.KNAPSACK.knapsack(10, intArray23);
        java.lang.Class<?> wildcardClass33 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(10, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        int[] intArray12 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray19 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack(1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = correct_java_programs.KNAPSACK.knapsack((-1), intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 10, 52, 100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        int[] intArray13 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray20 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray21 = new int[][] { intArray13, intArray20 };
        int int22 = correct_java_programs.KNAPSACK.knapsack(0, intArray21);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray21);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray21);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray21);
        int int27 = correct_java_programs.KNAPSACK.knapsack(52, intArray21);
        int int28 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray21);
        java.lang.Class<?> wildcardClass29 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) (short) 1, intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (short) 0, intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        int[] intArray8 = new int[] { (byte) 1, '4', (byte) 100, 0 };
        int[][] intArray9 = new int[][] { intArray8 };
        int int10 = correct_java_programs.KNAPSACK.knapsack(0, intArray9);
        int int11 = correct_java_programs.KNAPSACK.knapsack((int) '#', intArray9);
        int int12 = correct_java_programs.KNAPSACK.knapsack(1, intArray9);
        int int13 = correct_java_programs.KNAPSACK.knapsack((int) (short) 10, intArray9);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 52, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        int[] intArray12 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray19 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray20 = new int[][] { intArray12, intArray19 };
        int int21 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        int int22 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray20);
        int int23 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray20);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) ' ', intArray20);
        int int25 = correct_java_programs.KNAPSACK.knapsack(10, intArray20);
        int int26 = correct_java_programs.KNAPSACK.knapsack(0, intArray20);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        int[] intArray14 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[] intArray21 = new int[] { 'a', (byte) -1, 'a', (byte) 10, '#', (-1) };
        int[][] intArray22 = new int[][] { intArray14, intArray21 };
        int int23 = correct_java_programs.KNAPSACK.knapsack(0, intArray22);
        int int24 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 100, intArray22);
        int int25 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int26 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 0, intArray22);
        int int27 = correct_java_programs.KNAPSACK.knapsack((int) 'a', intArray22);
        int int28 = correct_java_programs.KNAPSACK.knapsack(1, intArray22);
        int int29 = correct_java_programs.KNAPSACK.knapsack(100, intArray22);
        int int30 = correct_java_programs.KNAPSACK.knapsack((int) (byte) 10, intArray22);
        java.lang.Class<?> wildcardClass31 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, -1, 97, 10, 35, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}

