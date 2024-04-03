package com.google.javascript.jscomp;

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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.paramList();
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node2, node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test02");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.paramList();
        boolean boolean6 = node4.hasChild(node5);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = node4.isThis();
        boolean boolean14 = node4.isNew();
        boolean boolean15 = node4.isName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.paramList();
        boolean boolean19 = node17.hasChild(node18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = node17.isThis();
        boolean boolean28 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node17, "hi!");
        node17.setOptionalArg(true);
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node4, node17);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node17);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test03");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.Scope.Var var4 = null;
        java.lang.Iterable<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceIterable5 = referenceCollectingCallback3.getReferences(var4);
        com.google.javascript.jscomp.Scope.Var var6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = referenceCollectingCallback3.getReferences(var6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.IR.paramList();
        boolean boolean12 = node10.hasChild(node11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        node10.setDirectives((java.util.Set<java.lang.String>) strSet16);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.paramList();
        boolean boolean24 = node22.hasChild(node23);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        node22.setDirectives((java.util.Set<java.lang.String>) strSet28);
        boolean boolean31 = node22.isThis();
        boolean boolean32 = node22.isNew();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.IR.paramList();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) '#', node10, node20, node22, node33, (int) (short) 0, 25);
        node20.putIntProp((int) (short) 10, 4);
        node20.setSourceEncodedPosition(148);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables43 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.IR.paramList();
        boolean boolean48 = node46.hasChild(node47);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        node46.setDirectives((java.util.Set<java.lang.String>) strSet52);
        boolean boolean55 = node46.isThis();
        boolean boolean56 = node46.isNew();
        boolean boolean57 = node46.isName();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.IR.paramList();
        boolean boolean61 = node59.hasChild(node60);
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        node59.setDirectives((java.util.Set<java.lang.String>) strSet65);
        boolean boolean68 = node59.isThis();
        boolean boolean70 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node59, "hi!");
        node59.setOptionalArg(true);
        flowSensitiveInlineVariables43.visit(nodeTraversal44, node46, node59);
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.hotSwapScript(node20, node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(referenceIterable5);
        org.junit.Assert.assertNull(referenceCollection7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test04");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.IR.paramList();
        boolean boolean5 = node3.hasChild(node4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet9);
        boolean boolean12 = node3.isThis();
        boolean boolean14 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node3, "");
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) 10);
        boolean boolean17 = node16.isNot();
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node16);
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node3, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test05");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.paramList();
        boolean boolean6 = node4.hasChild(node5);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = node4.isThis();
        boolean boolean14 = node4.isNew();
        boolean boolean15 = node4.isName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.paramList();
        boolean boolean19 = node17.hasChild(node18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = node17.isThis();
        boolean boolean28 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node17, "hi!");
        node17.setOptionalArg(true);
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node4, node17);
        boolean boolean32 = node17.isIn();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test06");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.paramList();
        boolean boolean6 = node4.hasChild(node5);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = node4.isThis();
        boolean boolean14 = node4.isNew();
        boolean boolean15 = node4.isName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.paramList();
        boolean boolean19 = node17.hasChild(node18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = node17.isThis();
        boolean boolean28 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node17, "hi!");
        node17.setOptionalArg(true);
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node4, node17);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.isHidden();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.paramList();
        boolean boolean39 = node37.hasChild(node38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        node37.setDirectives((java.util.Set<java.lang.String>) strSet43);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.IR.paramList();
        boolean boolean51 = node49.hasChild(node50);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        node49.setDirectives((java.util.Set<java.lang.String>) strSet55);
        boolean boolean58 = node49.isThis();
        boolean boolean59 = node49.isNew();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.IR.paramList();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) '#', node37, node47, node49, node60, (int) (short) 0, 25);
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newVarNode("BITXOR", node63);
        jSDocInfo32.setAssociatedNode(node63);
        boolean boolean66 = node63.isNot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.IR.comma(node4, node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test07");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.paramList();
        boolean boolean6 = node4.hasChild(node5);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = node4.isThis();
        boolean boolean15 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node4, "hi!");
        node4.setOptionalArg(true);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.ControlFlowAnalysis controlFlowAnalysis21 = new com.google.javascript.jscomp.ControlFlowAnalysis(abstractCompiler18, false, false);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node4, controlFlowAnalysis21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.SyntacticScopeCreator syntacticScopeCreator24 = new com.google.javascript.jscomp.SyntacticScopeCreator(abstractCompiler23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, (com.google.javascript.jscomp.NodeTraversal.Callback) controlFlowAnalysis21, (com.google.javascript.jscomp.ScopeCreator) syntacticScopeCreator24);
        com.google.javascript.jscomp.Compiler compiler26 = nodeTraversal25.getCompiler();
        int int27 = nodeTraversal25.getScopeDepth();
        flowSensitiveInlineVariables1.exitScope(nodeTraversal25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 10);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node30);
        int int32 = node30.getChildCount();
        node30.setType((int) (short) 10);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.IR.paramList();
        boolean boolean38 = node36.hasChild(node37);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        node36.setDirectives((java.util.Set<java.lang.String>) strSet42);
        java.lang.Object obj46 = node36.getProp((int) (short) 100);
        com.google.javascript.rhino.Node node47 = node30.useSourceInfoIfMissingFromForTree(node36);
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal25.traverse(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(compiler26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test08");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.paramList();
        boolean boolean6 = node4.hasChild(node5);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = node4.isThis();
        boolean boolean14 = node4.isNew();
        boolean boolean15 = node4.isName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.paramList();
        boolean boolean19 = node17.hasChild(node18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = node17.isThis();
        boolean boolean28 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node17, "hi!");
        node17.setOptionalArg(true);
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node4, node17);
        int int32 = node17.getChildCount();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test09");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions1.outputJsStringUsage = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions4.outputJsStringUsage = true;
        java.lang.String[] strArray8 = new java.lang.String[] { "BITXOR\n" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        compilerOptions4.setStripTypePrefixes((java.util.Set<java.lang.String>) strSet9);
        compilerOptions1.stripNamePrefixes = strSet9;
        boolean boolean13 = compilerOptions1.checkSymbols;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.outputJsStringUsage = true;
        compilerOptions14.setAssumeStrictThis(false);
        boolean boolean19 = compilerOptions14.optimizeArgumentsArray;
        com.google.javascript.jscomp.MessageBundle messageBundle20 = null;
        compilerOptions14.messageBundle = messageBundle20;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap22 = compilerOptions14.cssRenamingMap;
        compilerOptions14.collapsePropertiesOnExternTypes = true;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup25 = com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE;
        com.google.javascript.jscomp.DiagnosticType diagnosticType30 = com.google.javascript.jscomp.DefaultPassConfig.CANNOT_USE_PROTOTYPE_AND_VAR;
        java.lang.String[] strArray36 = new java.lang.String[] { "overriding prototype with non-object", "Unknown class name", "hi!", "hi!", "Unknown class name" };
        com.google.javascript.jscomp.JSError jSError37 = com.google.javascript.jscomp.JSError.make("overriding prototype with non-object", 1, 46, diagnosticType30, strArray36);
        com.google.javascript.jscomp.CheckLevel checkLevel38 = diagnosticType30.defaultLevel;
        com.google.javascript.jscomp.DiagnosticType diagnosticType40 = com.google.javascript.jscomp.DiagnosticType.make("Not declared as a constructor", checkLevel38, "JSCOMPILER_PRESERVE");
        com.google.javascript.jscomp.DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard41 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(diagnosticGroup25, checkLevel38);
        compilerOptions14.brokenClosureRequiresLevel = checkLevel38;
        compilerOptions1.setCheckMissingGetCssNameLevel(checkLevel38);
        com.google.javascript.jscomp.CheckUnreachableCode checkUnreachableCode44 = new com.google.javascript.jscomp.CheckUnreachableCode(abstractCompiler0, checkLevel38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables46 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler45);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.IR.paramList();
        boolean boolean51 = node49.hasChild(node50);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        node49.setDirectives((java.util.Set<java.lang.String>) strSet55);
        boolean boolean58 = node49.isThis();
        boolean boolean60 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node49, "hi!");
        node49.setOptionalArg(true);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        com.google.javascript.jscomp.ControlFlowAnalysis controlFlowAnalysis66 = new com.google.javascript.jscomp.ControlFlowAnalysis(abstractCompiler63, false, false);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node49, controlFlowAnalysis66);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler68 = null;
        com.google.javascript.jscomp.SyntacticScopeCreator syntacticScopeCreator69 = new com.google.javascript.jscomp.SyntacticScopeCreator(abstractCompiler68);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal70 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler47, (com.google.javascript.jscomp.NodeTraversal.Callback) controlFlowAnalysis66, (com.google.javascript.jscomp.ScopeCreator) syntacticScopeCreator69);
        com.google.javascript.jscomp.Compiler compiler71 = nodeTraversal70.getCompiler();
        int int72 = nodeTraversal70.getScopeDepth();
        flowSensitiveInlineVariables46.exitScope(nodeTraversal70);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) 10);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node75);
        int int77 = node75.getChildCount();
        node75.setType((int) (short) 10);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getBestLValueName(node75);
        com.google.javascript.jscomp.DiagnosticType diagnosticType81 = com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION;
        java.lang.String[] strArray86 = new java.lang.String[] { "goog.exportSymbol", "overriding prototype with non-object", "BITXOR\n", "MSG_" };
        com.google.javascript.jscomp.JSError jSError87 = nodeTraversal70.makeError(node75, diagnosticType81, strArray86);
        // The following exception was thrown during execution in test generation
        try {
            checkUnreachableCode44.enterScope(nodeTraversal70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(cssRenamingMap22);
        org.junit.Assert.assertNotNull(diagnosticGroup25);
        org.junit.Assert.assertNotNull(diagnosticType30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(jSError37);
        org.junit.Assert.assertTrue("'" + checkLevel38 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel38.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(diagnosticType40);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(compiler71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(diagnosticType81);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(jSError87);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test10");
        com.google.javascript.jscomp.LightweightMessageFormatter lightweightMessageFormatter0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
        com.google.javascript.jscomp.DiagnosticType diagnosticType4 = com.google.javascript.jscomp.DefaultPassConfig.CANNOT_USE_PROTOTYPE_AND_VAR;
        java.lang.String[] strArray10 = new java.lang.String[] { "overriding prototype with non-object", "Unknown class name", "hi!", "hi!", "Unknown class name" };
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("overriding prototype with non-object", 1, 46, diagnosticType4, strArray10);
        java.lang.String str12 = lightweightMessageFormatter0.formatWarning(jSError11);
        java.util.logging.Logger logger13 = com.google.javascript.jscomp.Tracer.logger;
        com.google.javascript.jscomp.LoggerErrorManager loggerErrorManager14 = new com.google.javascript.jscomp.LoggerErrorManager((com.google.javascript.jscomp.MessageFormatter) lightweightMessageFormatter0, logger13);
        int int15 = loggerErrorManager14.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = loggerErrorManager14.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.VariableMap variableMap18 = null;
        compilerOptions17.inputVariableMap = variableMap18;
        java.util.Set<java.lang.String> strSet20 = compilerOptions17.stripTypePrefixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.outputJsStringUsage = true;
        compilerOptions21.setAssumeStrictThis(false);
        compilerOptions21.setInlineGetters(true);
        java.lang.String str28 = compilerOptions21.renamePrefixNamespace;
        compilerOptions21.groupVariableDeclarations = false;
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions21.checkMissingReturn;
        compilerOptions17.aggressiveVarCheck = checkLevel31;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables34 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.paramList();
        boolean boolean39 = node37.hasChild(node38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        node37.setDirectives((java.util.Set<java.lang.String>) strSet43);
        boolean boolean46 = node37.isThis();
        boolean boolean48 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node37, "hi!");
        node37.setOptionalArg(true);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.ControlFlowAnalysis controlFlowAnalysis54 = new com.google.javascript.jscomp.ControlFlowAnalysis(abstractCompiler51, false, false);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node37, controlFlowAnalysis54);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.SyntacticScopeCreator syntacticScopeCreator57 = new com.google.javascript.jscomp.SyntacticScopeCreator(abstractCompiler56);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, (com.google.javascript.jscomp.NodeTraversal.Callback) controlFlowAnalysis54, (com.google.javascript.jscomp.ScopeCreator) syntacticScopeCreator57);
        com.google.javascript.jscomp.Compiler compiler59 = nodeTraversal58.getCompiler();
        int int60 = nodeTraversal58.getScopeDepth();
        flowSensitiveInlineVariables34.exitScope(nodeTraversal58);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 10);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node63);
        int int65 = node63.getChildCount();
        node63.setType((int) (short) 10);
        java.lang.String str68 = com.google.javascript.jscomp.NodeUtil.getBestLValueName(node63);
        com.google.javascript.jscomp.DiagnosticType diagnosticType69 = com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION;
        java.lang.String[] strArray74 = new java.lang.String[] { "goog.exportSymbol", "overriding prototype with non-object", "BITXOR\n", "MSG_" };
        com.google.javascript.jscomp.JSError jSError75 = nodeTraversal58.makeError(node63, diagnosticType69, strArray74);
        loggerErrorManager14.report(checkLevel31, jSError75);
        com.google.javascript.jscomp.JSError[] jSErrorArray77 = loggerErrorManager14.getErrors();
        org.junit.Assert.assertNotNull(lightweightMessageFormatter0);
        org.junit.Assert.assertNotNull(diagnosticType4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "overriding prototype with non-object:1: WARNING - Rename prototypes and inline variables cannot be used together\n" + "'", str12, "overriding prototype with non-object:1: WARNING - Rename prototypes and inline variables cannot be used together\n");
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertEquals(logger13.getName(), "com.google.javascript.jscomp.Tracer");
        org.junit.Assert.assertNull("logger13.getResourceBundleName() == null", logger13.getResourceBundleName());
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(compiler59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(diagnosticType69);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(jSError75);
        org.junit.Assert.assertNotNull(jSErrorArray77);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test11");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.paramList();
        boolean boolean4 = node2.hasChild(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isBleedingFunctionName(node2);
        com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention7 = new com.google.javascript.jscomp.GoogleCodingConvention();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName((com.google.javascript.jscomp.CodingConvention) googleCodingConvention7, "./", node11);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship13 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node2, node12);
        com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention14 = new com.google.javascript.jscomp.GoogleCodingConvention();
        boolean boolean16 = googleCodingConvention14.isExported("Not declared as a constructor");
        com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention17 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention) googleCodingConvention14);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.jscomp.CodingConvention.Bind bind20 = googleCodingConvention17.describeFunctionBind(node19);
        int int21 = node19.getChildCount();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.paramList();
        boolean boolean28 = node26.hasChild(node27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        node26.setDirectives((java.util.Set<java.lang.String>) strSet32);
        boolean boolean35 = node26.isThis();
        boolean boolean36 = node26.isNew();
        boolean boolean37 = node26.isName();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.paramList();
        boolean boolean41 = node39.hasChild(node40);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet45);
        boolean boolean48 = node39.isThis();
        boolean boolean50 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node39, "hi!");
        node39.setOptionalArg(true);
        flowSensitiveInlineVariables23.visit(nodeTraversal24, node26, node39);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship54 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node19, node39);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) 10);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node58);
        int int60 = node58.getChildCount();
        node58.setType((int) (short) 10);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.IR.paramList();
        boolean boolean66 = node64.hasChild(node65);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        node64.setDirectives((java.util.Set<java.lang.String>) strSet70);
        java.lang.Object obj74 = node64.getProp((int) (short) 100);
        com.google.javascript.rhino.Node node75 = node58.useSourceInfoIfMissingFromForTree(node64);
        boolean boolean76 = node75.isHook();
        com.google.javascript.rhino.Node[] nodeArray77 = new com.google.javascript.rhino.Node[] { node56, node75 };
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.IR.call(node39, nodeArray77);
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(bind20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(nodeArray77);
        org.junit.Assert.assertNotNull(node78);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test12");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.paramList();
        boolean boolean6 = node4.hasChild(node5);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = node4.isThis();
        boolean boolean15 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node4, "hi!");
        node4.setOptionalArg(true);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        com.google.javascript.jscomp.ControlFlowAnalysis controlFlowAnalysis21 = new com.google.javascript.jscomp.ControlFlowAnalysis(abstractCompiler18, false, false);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node4, controlFlowAnalysis21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.SyntacticScopeCreator syntacticScopeCreator24 = new com.google.javascript.jscomp.SyntacticScopeCreator(abstractCompiler23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler2, (com.google.javascript.jscomp.NodeTraversal.Callback) controlFlowAnalysis21, (com.google.javascript.jscomp.ScopeCreator) syntacticScopeCreator24);
        com.google.javascript.jscomp.Compiler compiler26 = nodeTraversal25.getCompiler();
        int int27 = nodeTraversal25.getScopeDepth();
        flowSensitiveInlineVariables1.exitScope(nodeTraversal25);
        int int29 = nodeTraversal25.getLineNumber();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.IR.paramList();
        boolean boolean33 = node31.hasChild(node32);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        node31.setDirectives((java.util.Set<java.lang.String>) strSet37);
        boolean boolean40 = node31.isThis();
        com.google.javascript.jscomp.Scope scope41 = com.google.javascript.jscomp.Scope.createLatticeBottom(node31);
        com.google.javascript.jscomp.Scope.Var var43 = scope41.getVar("");
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversal25.traverseAtScope(scope41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(compiler26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(scope41);
        org.junit.Assert.assertNull(var43);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test13");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup1 = com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE;
        com.google.javascript.jscomp.DiagnosticType diagnosticType6 = com.google.javascript.jscomp.DefaultPassConfig.CANNOT_USE_PROTOTYPE_AND_VAR;
        java.lang.String[] strArray12 = new java.lang.String[] { "overriding prototype with non-object", "Unknown class name", "hi!", "hi!", "Unknown class name" };
        com.google.javascript.jscomp.JSError jSError13 = com.google.javascript.jscomp.JSError.make("overriding prototype with non-object", 1, 46, diagnosticType6, strArray12);
        com.google.javascript.jscomp.CheckLevel checkLevel14 = diagnosticType6.defaultLevel;
        com.google.javascript.jscomp.DiagnosticType diagnosticType16 = com.google.javascript.jscomp.DiagnosticType.make("Not declared as a constructor", checkLevel14, "JSCOMPILER_PRESERVE");
        com.google.javascript.jscomp.DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard17 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(diagnosticGroup1, checkLevel14);
        com.google.javascript.jscomp.CheckSideEffects checkSideEffects19 = new com.google.javascript.jscomp.CheckSideEffects(abstractCompiler0, checkLevel14, false);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables21 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.IR.paramList();
        boolean boolean26 = node24.hasChild(node25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        node24.setDirectives((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = node24.isThis();
        boolean boolean35 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node24, "hi!");
        node24.setOptionalArg(true);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        com.google.javascript.jscomp.ControlFlowAnalysis controlFlowAnalysis41 = new com.google.javascript.jscomp.ControlFlowAnalysis(abstractCompiler38, false, false);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node24, controlFlowAnalysis41);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        com.google.javascript.jscomp.SyntacticScopeCreator syntacticScopeCreator44 = new com.google.javascript.jscomp.SyntacticScopeCreator(abstractCompiler43);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal45 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler22, (com.google.javascript.jscomp.NodeTraversal.Callback) controlFlowAnalysis41, (com.google.javascript.jscomp.ScopeCreator) syntacticScopeCreator44);
        com.google.javascript.jscomp.Compiler compiler46 = nodeTraversal45.getCompiler();
        int int47 = nodeTraversal45.getScopeDepth();
        flowSensitiveInlineVariables21.exitScope(nodeTraversal45);
        java.util.Deque<com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node>> nodeControlFlowGraphQueue49 = nodeTraversal45.cfgs;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate50 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.IR.paramList();
        boolean boolean54 = node52.hasChild(node53);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        node52.setDirectives((java.util.Set<java.lang.String>) strSet58);
        boolean boolean61 = node52.isThis();
        boolean boolean63 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node52, "hi!");
        node52.setIsSyntheticBlock(false);
        boolean boolean66 = booleanResultPredicate50.apply(node52);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.IR.neg(node52);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.IR.paramList();
        boolean boolean71 = node69.hasChild(node70);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        node69.setDirectives((java.util.Set<java.lang.String>) strSet75);
        boolean boolean78 = node69.isThis();
        boolean boolean80 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node69, "hi!");
        boolean boolean81 = node69.isWith();
        boolean boolean82 = node69.isQualifiedName();
        boolean boolean83 = node69.isDelProp();
        // The following exception was thrown during execution in test generation
        try {
            checkSideEffects19.visit(nodeTraversal45, node67, node69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(diagnosticGroup1);
        org.junit.Assert.assertNotNull(diagnosticType6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(jSError13);
        org.junit.Assert.assertTrue("'" + checkLevel14 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel14.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertNotNull(diagnosticType16);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(compiler46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(nodeControlFlowGraphQueue49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test14");
        com.google.javascript.jscomp.LightweightMessageFormatter lightweightMessageFormatter0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
        com.google.javascript.jscomp.DiagnosticType diagnosticType4 = com.google.javascript.jscomp.DefaultPassConfig.CANNOT_USE_PROTOTYPE_AND_VAR;
        java.lang.String[] strArray10 = new java.lang.String[] { "overriding prototype with non-object", "Unknown class name", "hi!", "hi!", "Unknown class name" };
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("overriding prototype with non-object", 1, 46, diagnosticType4, strArray10);
        java.lang.String str12 = lightweightMessageFormatter0.formatWarning(jSError11);
        java.util.logging.Logger logger13 = com.google.javascript.jscomp.Tracer.logger;
        com.google.javascript.jscomp.LoggerErrorManager loggerErrorManager14 = new com.google.javascript.jscomp.LoggerErrorManager((com.google.javascript.jscomp.MessageFormatter) lightweightMessageFormatter0, logger13);
        int int15 = loggerErrorManager14.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = loggerErrorManager14.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.VariableMap variableMap18 = null;
        compilerOptions17.inputVariableMap = variableMap18;
        java.util.Set<java.lang.String> strSet20 = compilerOptions17.stripTypePrefixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.outputJsStringUsage = true;
        compilerOptions21.setAssumeStrictThis(false);
        compilerOptions21.setInlineGetters(true);
        java.lang.String str28 = compilerOptions21.renamePrefixNamespace;
        compilerOptions21.groupVariableDeclarations = false;
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions21.checkMissingReturn;
        compilerOptions17.aggressiveVarCheck = checkLevel31;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables34 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.paramList();
        boolean boolean39 = node37.hasChild(node38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        node37.setDirectives((java.util.Set<java.lang.String>) strSet43);
        boolean boolean46 = node37.isThis();
        boolean boolean48 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node37, "hi!");
        node37.setOptionalArg(true);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.ControlFlowAnalysis controlFlowAnalysis54 = new com.google.javascript.jscomp.ControlFlowAnalysis(abstractCompiler51, false, false);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node37, controlFlowAnalysis54);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.SyntacticScopeCreator syntacticScopeCreator57 = new com.google.javascript.jscomp.SyntacticScopeCreator(abstractCompiler56);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, (com.google.javascript.jscomp.NodeTraversal.Callback) controlFlowAnalysis54, (com.google.javascript.jscomp.ScopeCreator) syntacticScopeCreator57);
        com.google.javascript.jscomp.Compiler compiler59 = nodeTraversal58.getCompiler();
        int int60 = nodeTraversal58.getScopeDepth();
        flowSensitiveInlineVariables34.exitScope(nodeTraversal58);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 10);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node63);
        int int65 = node63.getChildCount();
        node63.setType((int) (short) 10);
        java.lang.String str68 = com.google.javascript.jscomp.NodeUtil.getBestLValueName(node63);
        com.google.javascript.jscomp.DiagnosticType diagnosticType69 = com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION;
        java.lang.String[] strArray74 = new java.lang.String[] { "goog.exportSymbol", "overriding prototype with non-object", "BITXOR\n", "MSG_" };
        com.google.javascript.jscomp.JSError jSError75 = nodeTraversal58.makeError(node63, diagnosticType69, strArray74);
        loggerErrorManager14.report(checkLevel31, jSError75);
        loggerErrorManager14.printSummary();
        double double78 = loggerErrorManager14.getTypedPercent();
        org.junit.Assert.assertNotNull(lightweightMessageFormatter0);
        org.junit.Assert.assertNotNull(diagnosticType4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "overriding prototype with non-object:1: WARNING - Rename prototypes and inline variables cannot be used together\n" + "'", str12, "overriding prototype with non-object:1: WARNING - Rename prototypes and inline variables cannot be used together\n");
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertEquals(logger13.getName(), "com.google.javascript.jscomp.Tracer");
        org.junit.Assert.assertNull("logger13.getResourceBundleName() == null", logger13.getResourceBundleName());
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(compiler59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(diagnosticType69);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(jSError75);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test15");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.paramList();
        boolean boolean4 = node2.hasChild(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isBleedingFunctionName(node2);
        com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention7 = new com.google.javascript.jscomp.GoogleCodingConvention();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName((com.google.javascript.jscomp.CodingConvention) googleCodingConvention7, "./", node11);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship13 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node2, node12);
        com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention14 = new com.google.javascript.jscomp.GoogleCodingConvention();
        boolean boolean16 = googleCodingConvention14.isExported("Not declared as a constructor");
        com.google.javascript.jscomp.GoogleCodingConvention googleCodingConvention17 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention) googleCodingConvention14);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.jscomp.CodingConvention.Bind bind20 = googleCodingConvention17.describeFunctionBind(node19);
        int int21 = node19.getChildCount();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables23 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.IR.paramList();
        boolean boolean28 = node26.hasChild(node27);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        node26.setDirectives((java.util.Set<java.lang.String>) strSet32);
        boolean boolean35 = node26.isThis();
        boolean boolean36 = node26.isNew();
        boolean boolean37 = node26.isName();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.IR.paramList();
        boolean boolean41 = node39.hasChild(node40);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet45);
        boolean boolean48 = node39.isThis();
        boolean boolean50 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node39, "hi!");
        node39.setOptionalArg(true);
        flowSensitiveInlineVariables23.visit(nodeTraversal24, node26, node39);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship54 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node19, node39);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType55 = subclassRelationship54.type;
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(bind20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + subclassType55 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType55.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test16");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.IR.paramList();
        boolean boolean7 = node5.hasChild(node6);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        node5.setDirectives((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = node5.isThis();
        boolean boolean16 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node5, "hi!");
        node5.setOptionalArg(true);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        com.google.javascript.jscomp.ControlFlowAnalysis controlFlowAnalysis22 = new com.google.javascript.jscomp.ControlFlowAnalysis(abstractCompiler19, false, false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node5, controlFlowAnalysis22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        com.google.javascript.jscomp.SyntacticScopeCreator syntacticScopeCreator25 = new com.google.javascript.jscomp.SyntacticScopeCreator(abstractCompiler24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler3, (com.google.javascript.jscomp.NodeTraversal.Callback) controlFlowAnalysis22, (com.google.javascript.jscomp.ScopeCreator) syntacticScopeCreator25);
        com.google.javascript.jscomp.Compiler compiler27 = nodeTraversal26.getCompiler();
        int int28 = nodeTraversal26.getScopeDepth();
        flowSensitiveInlineVariables2.exitScope(nodeTraversal26);
        int int30 = nodeTraversal26.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique0.enterScope(nodeTraversal26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(compiler27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test17");
        com.google.javascript.jscomp.LightweightMessageFormatter lightweightMessageFormatter0 = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
        com.google.javascript.jscomp.DiagnosticType diagnosticType4 = com.google.javascript.jscomp.DefaultPassConfig.CANNOT_USE_PROTOTYPE_AND_VAR;
        java.lang.String[] strArray10 = new java.lang.String[] { "overriding prototype with non-object", "Unknown class name", "hi!", "hi!", "Unknown class name" };
        com.google.javascript.jscomp.JSError jSError11 = com.google.javascript.jscomp.JSError.make("overriding prototype with non-object", 1, 46, diagnosticType4, strArray10);
        java.lang.String str12 = lightweightMessageFormatter0.formatWarning(jSError11);
        java.util.logging.Logger logger13 = com.google.javascript.jscomp.Tracer.logger;
        com.google.javascript.jscomp.LoggerErrorManager loggerErrorManager14 = new com.google.javascript.jscomp.LoggerErrorManager((com.google.javascript.jscomp.MessageFormatter) lightweightMessageFormatter0, logger13);
        int int15 = loggerErrorManager14.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = loggerErrorManager14.getErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        com.google.javascript.jscomp.VariableMap variableMap18 = null;
        compilerOptions17.inputVariableMap = variableMap18;
        java.util.Set<java.lang.String> strSet20 = compilerOptions17.stripTypePrefixes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.outputJsStringUsage = true;
        compilerOptions21.setAssumeStrictThis(false);
        compilerOptions21.setInlineGetters(true);
        java.lang.String str28 = compilerOptions21.renamePrefixNamespace;
        compilerOptions21.groupVariableDeclarations = false;
        com.google.javascript.jscomp.CheckLevel checkLevel31 = compilerOptions21.checkMissingReturn;
        compilerOptions17.aggressiveVarCheck = checkLevel31;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables34 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.IR.paramList();
        boolean boolean39 = node37.hasChild(node38);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        node37.setDirectives((java.util.Set<java.lang.String>) strSet43);
        boolean boolean46 = node37.isThis();
        boolean boolean48 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node37, "hi!");
        node37.setOptionalArg(true);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.ControlFlowAnalysis controlFlowAnalysis54 = new com.google.javascript.jscomp.ControlFlowAnalysis(abstractCompiler51, false, false);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(node37, controlFlowAnalysis54);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        com.google.javascript.jscomp.SyntacticScopeCreator syntacticScopeCreator57 = new com.google.javascript.jscomp.SyntacticScopeCreator(abstractCompiler56);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = new com.google.javascript.jscomp.NodeTraversal(abstractCompiler35, (com.google.javascript.jscomp.NodeTraversal.Callback) controlFlowAnalysis54, (com.google.javascript.jscomp.ScopeCreator) syntacticScopeCreator57);
        com.google.javascript.jscomp.Compiler compiler59 = nodeTraversal58.getCompiler();
        int int60 = nodeTraversal58.getScopeDepth();
        flowSensitiveInlineVariables34.exitScope(nodeTraversal58);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 10);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node63);
        int int65 = node63.getChildCount();
        node63.setType((int) (short) 10);
        java.lang.String str68 = com.google.javascript.jscomp.NodeUtil.getBestLValueName(node63);
        com.google.javascript.jscomp.DiagnosticType diagnosticType69 = com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION;
        java.lang.String[] strArray74 = new java.lang.String[] { "goog.exportSymbol", "overriding prototype with non-object", "BITXOR\n", "MSG_" };
        com.google.javascript.jscomp.JSError jSError75 = nodeTraversal58.makeError(node63, diagnosticType69, strArray74);
        loggerErrorManager14.report(checkLevel31, jSError75);
        loggerErrorManager14.printSummary();
        com.google.javascript.jscomp.JSError[] jSErrorArray78 = loggerErrorManager14.getErrors();
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager) loggerErrorManager14);
        org.junit.Assert.assertNotNull(lightweightMessageFormatter0);
        org.junit.Assert.assertNotNull(diagnosticType4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(jSError11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "overriding prototype with non-object:1: WARNING - Rename prototypes and inline variables cannot be used together\n" + "'", str12, "overriding prototype with non-object:1: WARNING - Rename prototypes and inline variables cannot be used together\n");
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertEquals(logger13.getName(), "com.google.javascript.jscomp.Tracer");
        org.junit.Assert.assertNull("logger13.getResourceBundleName() == null", logger13.getResourceBundleName());
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + checkLevel31 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel31.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(compiler59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(diagnosticType69);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(jSError75);
        org.junit.Assert.assertNotNull(jSErrorArray78);
    }
}

