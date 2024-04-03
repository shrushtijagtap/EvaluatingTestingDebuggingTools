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
        java_programs.GCD gCD0 = new java_programs.GCD();
        java.lang.Class<?> wildcardClass1 = gCD0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test02");
        int int2 = java_programs.GCD.gcd((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test04");
        int int2 = java_programs.GCD.gcd((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test05");
        int int2 = java_programs.GCD.gcd((-1), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test06");
        int int2 = java_programs.GCD.gcd(52, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test07");
        int int2 = java_programs.GCD.gcd((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test08");
        int int2 = java_programs.GCD.gcd(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test09");
        int int2 = java_programs.GCD.gcd((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test10");
        int int2 = java_programs.GCD.gcd(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test11");
        int int2 = java_programs.GCD.gcd((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test12");
        int int2 = java_programs.GCD.gcd((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test13");
        int int2 = java_programs.GCD.gcd((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test14");
        int int2 = java_programs.GCD.gcd((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test15");
        int int2 = java_programs.GCD.gcd(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test16");
        int int2 = java_programs.GCD.gcd(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test17");
        int int2 = java_programs.GCD.gcd((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test18");
        int int2 = java_programs.GCD.gcd((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test19");
        int int2 = java_programs.GCD.gcd((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test20");
        int int2 = java_programs.GCD.gcd((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test21");
        int int2 = java_programs.GCD.gcd((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test22");
        int int2 = java_programs.GCD.gcd((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test23");
        int int2 = java_programs.GCD.gcd(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test24");
        int int2 = java_programs.GCD.gcd(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test25");
        int int2 = java_programs.GCD.gcd((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test26");
        int int2 = java_programs.GCD.gcd((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test27");
        int int2 = java_programs.GCD.gcd((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test28");
        int int2 = java_programs.GCD.gcd((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test29");
        int int2 = java_programs.GCD.gcd(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test30");
        int int2 = java_programs.GCD.gcd((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test31");
        int int2 = java_programs.GCD.gcd(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test32");
        int int2 = java_programs.GCD.gcd(32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test33");
        int int2 = java_programs.GCD.gcd(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test34");
        int int2 = java_programs.GCD.gcd((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test35");
        int int2 = java_programs.GCD.gcd(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test36");
        int int2 = java_programs.GCD.gcd(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test37");
        int int2 = java_programs.GCD.gcd((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test38");
        int int2 = java_programs.GCD.gcd(32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test39");
        int int2 = java_programs.GCD.gcd((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test40");
        int int2 = java_programs.GCD.gcd((-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test41");
        int int2 = java_programs.GCD.gcd(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test42");
        int int2 = java_programs.GCD.gcd((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test43");
        int int2 = java_programs.GCD.gcd((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test44");
        int int2 = java_programs.GCD.gcd(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test45");
        int int2 = java_programs.GCD.gcd((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test46");
        int int2 = java_programs.GCD.gcd((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test47");
        int int2 = java_programs.GCD.gcd((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test48");
        int int2 = java_programs.GCD.gcd(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test49");
        int int2 = java_programs.GCD.gcd((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test50");
        int int2 = java_programs.GCD.gcd((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test51");
        int int2 = java_programs.GCD.gcd((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test52");
        int int2 = java_programs.GCD.gcd(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test53");
        int int2 = java_programs.GCD.gcd(52, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test54");
        int int2 = java_programs.GCD.gcd((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test55");
        int int2 = java_programs.GCD.gcd((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test56");
        int int2 = java_programs.GCD.gcd((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test57");
        int int2 = java_programs.GCD.gcd((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test58");
        int int2 = java_programs.GCD.gcd(35, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test59");
        int int2 = java_programs.GCD.gcd((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test60");
        int int2 = java_programs.GCD.gcd(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test61");
        int int2 = java_programs.GCD.gcd((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test62");
        int int2 = java_programs.GCD.gcd((int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test63");
        int int2 = java_programs.GCD.gcd(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test64");
        int int2 = java_programs.GCD.gcd(97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test65");
        int int2 = java_programs.GCD.gcd(97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test66");
        int int2 = java_programs.GCD.gcd((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test67");
        int int2 = java_programs.GCD.gcd((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test68");
        int int2 = java_programs.GCD.gcd((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test69");
        int int2 = java_programs.GCD.gcd((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test70");
        int int2 = java_programs.GCD.gcd((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test71");
        int int2 = java_programs.GCD.gcd((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }
}

