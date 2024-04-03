package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter1 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry3.createObjectType("overriding prototype with non-object", node5, objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = jSTypeRegistry3.getErrorReporter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.TypeCheck typeCheck9 = new com.google.javascript.jscomp.TypeCheck(abstractCompiler0, reverseAbstractInterpreter1, jSTypeRegistry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertNull(errorReporter8);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter1 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry3.createObjectType("overriding prototype with non-object", node5, objectType6);
        boolean boolean9 = jSTypeRegistry3.isForwardDeclaredType("");
        com.google.javascript.jscomp.CheckLevel checkLevel10 = null;
        com.google.javascript.jscomp.CheckLevel checkLevel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.TypeCheck typeCheck12 = new com.google.javascript.jscomp.TypeCheck(abstractCompiler0, reverseAbstractInterpreter1, jSTypeRegistry3, checkLevel10, checkLevel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

