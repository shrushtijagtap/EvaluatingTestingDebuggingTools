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
        com.squareup.javapoet.TypeName typeName0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder3 = com.squareup.javapoet.ParameterSpec.builder(typeName0, "", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.reflect.Type type0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder3 = com.squareup.javapoet.ParameterSpec.builder(type0, "", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.reflect.Type type0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder3 = com.squareup.javapoet.ParameterSpec.builder(type0, "hi!", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        javax.lang.model.element.VariableElement variableElement0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec parameterSpec1 = com.squareup.javapoet.ParameterSpec.get(variableElement0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.reflect.Type type0 = null;
        javax.lang.model.element.Modifier modifier2 = null;
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] { modifier2 };
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder4 = com.squareup.javapoet.ParameterSpec.builder(type0, "hi!", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.squareup.javapoet.TypeName typeName0 = null;
        javax.lang.model.element.Modifier modifier2 = null;
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] { modifier2 };
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder4 = com.squareup.javapoet.ParameterSpec.builder(typeName0, "", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder4 = com.squareup.javapoet.ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.squareup.javapoet.TypeName typeName0 = null;
        javax.lang.model.element.Modifier modifier2 = null;
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] { modifier2 };
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder4 = com.squareup.javapoet.ParameterSpec.builder(typeName0, "hi!", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.squareup.javapoet.TypeName typeName0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder3 = com.squareup.javapoet.ParameterSpec.builder(typeName0, "hi!", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.squareup.javapoet.TypeName typeName0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder3 = com.squareup.javapoet.ParameterSpec.builder(typeName0, "hi!", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder4 = com.squareup.javapoet.ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "hi!", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier modifier3 = null;
        javax.lang.model.element.Modifier[] modifierArray4 = new javax.lang.model.element.Modifier[] { modifier3 };
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder5 = com.squareup.javapoet.ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "", modifierArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(modifierArray4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier modifier3 = null;
        javax.lang.model.element.Modifier[] modifierArray4 = new javax.lang.model.element.Modifier[] { modifier3 };
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder5 = com.squareup.javapoet.ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "hi!", modifierArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(modifierArray4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier[] modifierArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder4 = com.squareup.javapoet.ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "hi!", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.squareup.javapoet.TypeName typeName0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder3 = com.squareup.javapoet.ParameterSpec.builder(typeName0, "", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.reflect.Type type0 = null;
        javax.lang.model.element.Modifier modifier2 = null;
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] { modifier2 };
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder4 = com.squareup.javapoet.ParameterSpec.builder(type0, "", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.reflect.Type type0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder3 = com.squareup.javapoet.ParameterSpec.builder(type0, "", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.reflect.Type type0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder3 = com.squareup.javapoet.ParameterSpec.builder(type0, "hi!", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier[] modifierArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.javapoet.ParameterSpec.Builder builder4 = com.squareup.javapoet.ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

