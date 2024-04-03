package com.squareup.javapoet;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        TypeName typeName0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder3 = ParameterSpec.builder(typeName0, "", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (NullPointerException e) {
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
            ParameterSpec.Builder builder3 = ParameterSpec.builder(type0, "", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (IllegalArgumentException e) {
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
            ParameterSpec.Builder builder3 = ParameterSpec.builder(type0, "hi!", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (IllegalArgumentException e) {
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
            ParameterSpec parameterSpec1 = ParameterSpec.get(variableElement0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
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
            ParameterSpec.Builder builder4 = ParameterSpec.builder(type0, "hi!", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        TypeName typeName0 = null;
        javax.lang.model.element.Modifier modifier2 = null;
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] { modifier2 };
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder4 = ParameterSpec.builder(typeName0, "", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder4 = ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: ");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        TypeName typeName0 = null;
        javax.lang.model.element.Modifier modifier2 = null;
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] { modifier2 };
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder4 = ParameterSpec.builder(typeName0, "hi!", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        TypeName typeName0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder3 = ParameterSpec.builder(typeName0, "hi!", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        TypeName typeName0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder3 = ParameterSpec.builder(typeName0, "hi!", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier[] modifierArray3 = new javax.lang.model.element.Modifier[] {};
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder4 = ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "hi!", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: hi!");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(modifierArray3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier modifier3 = null;
        javax.lang.model.element.Modifier[] modifierArray4 = new javax.lang.model.element.Modifier[] { modifier3 };
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder5 = ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "", modifierArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: ");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(modifierArray4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier modifier3 = null;
        javax.lang.model.element.Modifier[] modifierArray4 = new javax.lang.model.element.Modifier[] { modifier3 };
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder5 = ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "hi!", modifierArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: hi!");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(modifierArray4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier[] modifierArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder4 = ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "hi!", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: hi!");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        TypeName typeName0 = null;
        javax.lang.model.element.Modifier[] modifierArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder3 = ParameterSpec.builder(typeName0, "", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type == null");
        } catch (NullPointerException e) {
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
            ParameterSpec.Builder builder4 = ParameterSpec.builder(type0, "", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (IllegalArgumentException e) {
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
            ParameterSpec.Builder builder3 = ParameterSpec.builder(type0, "", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (IllegalArgumentException e) {
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
            ParameterSpec.Builder builder3 = ParameterSpec.builder(type0, "hi!", modifierArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected type: null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(modifierArray2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        javax.lang.model.element.Modifier[] modifierArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            ParameterSpec.Builder builder4 = ParameterSpec.builder((java.lang.reflect.Type) wildcardClass1, "", modifierArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: not a valid name: ");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

