import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test1");
        java_programs.IS_VALID_PARENTHESIZATION iS_VALID_PARENTHESIZATION0 = new java_programs.IS_VALID_PARENTHESIZATION();
        java.lang.Class<?> wildcardClass1 = iS_VALID_PARENTHESIZATION0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test2");
        java.lang.Boolean boolean1 = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("hi!");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test3");
        java.lang.Boolean boolean1 = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

