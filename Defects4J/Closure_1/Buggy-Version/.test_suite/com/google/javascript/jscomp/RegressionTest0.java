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
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = null;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig1 = new com.google.javascript.jscomp.DefaultPassConfig(compilerOptions0);
        com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory hotSwapPassFactory2 = defaultPassConfig1.inferJsDocInfo;
        com.google.javascript.jscomp.PassFactory passFactory3 = defaultPassConfig1.devirtualizePrototypeMethods;
        com.google.javascript.jscomp.PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments4 = new com.google.javascript.jscomp.PeepholeCollectPropertyAssignments();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType5 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.IR.returnNode();
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.IR.returnNode();
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node10);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(10, node7, node9, node10, (int) '#', (int) ' ');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.IR.returnNode();
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node15);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship17 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node14, node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isConstantName(node14);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType19 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.IR.returnNode();
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.IR.returnNode();
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node24);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node21, node23, node24, (int) '#', (int) ' ');
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.returnNode();
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node29);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship31 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType19, node28, node29);
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.IR.sheq(node14, node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.IR.pos(node34);
        boolean boolean36 = peepholeCollectPropertyAssignments4.isInterestingValue(node34);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        compiler37.setProgress((double) 53, "L ");
        com.google.common.base.Supplier<java.lang.String> strSupplier41 = compiler37.getUniqueNameIdSupplier();
        peepholeCollectPropertyAssignments4.endTraversal((com.google.javascript.jscomp.AbstractCompiler) compiler37);
        com.google.javascript.jscomp.HotSwapCompilerPass hotSwapCompilerPass43 = passFactory3.getHotSwapPass((com.google.javascript.jscomp.AbstractCompiler) compiler37);
        com.google.javascript.jscomp.ControlStructureCheck controlStructureCheck44 = new com.google.javascript.jscomp.ControlStructureCheck((com.google.javascript.jscomp.AbstractCompiler) compiler37);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.IR.returnNode();
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node46);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.IR.returnNode();
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node49);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(10, node46, node48, node49, (int) '#', (int) ' ');
        node53.setVarArgs(true);
        java.lang.String str56 = node53.toString();
        com.google.javascript.rhino.InputId inputId57 = node53.getInputId();
        boolean boolean58 = node53.isQuotedString();
        com.google.javascript.jscomp.GlobalNamespace globalNamespace59 = new com.google.javascript.jscomp.GlobalNamespace((com.google.javascript.jscomp.AbstractCompiler) compiler37, node53);
        com.google.javascript.jscomp.CoalesceVariableNames coalesceVariableNames61 = new com.google.javascript.jscomp.CoalesceVariableNames((com.google.javascript.jscomp.AbstractCompiler) compiler37, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars65 = new com.google.javascript.jscomp.RemoveUnusedVars((com.google.javascript.jscomp.AbstractCompiler) compiler37, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hotSwapPassFactory2);
        org.junit.Assert.assertNotNull(passFactory3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strSupplier41);
        org.junit.Assert.assertNull(hotSwapCompilerPass43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "BITXOR 35 [var_args_name: 1]" + "'", str56, "BITXOR 35 [var_args_name: 1]");
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.ErrorFormat errorFormat0 = com.google.javascript.jscomp.ErrorFormat.LEGACY;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        compiler1.setProgress((double) 53, "L ");
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = compiler1.getUniqueNameIdSupplier();
        java.io.PrintStream printStream6 = null;
        com.google.common.base.Predicate<java.lang.String> strPredicate7 = null;
        com.google.javascript.jscomp.GlobalNamespace.Tracker tracker8 = new com.google.javascript.jscomp.GlobalNamespace.Tracker((com.google.javascript.jscomp.AbstractCompiler) compiler1, printStream6, strPredicate7);
        double double9 = compiler1.getProgress();
        com.google.javascript.jscomp.CheckLevel checkLevel10 = com.google.javascript.jscomp.CheckLevel.WARNING;
        com.google.javascript.jscomp.CheckSideEffects checkSideEffects12 = new com.google.javascript.jscomp.CheckSideEffects((com.google.javascript.jscomp.AbstractCompiler) compiler1, checkLevel10, true);
        com.google.javascript.jscomp.Denormalize denormalize13 = new com.google.javascript.jscomp.Denormalize((com.google.javascript.jscomp.AbstractCompiler) compiler1);
        com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass memoizedScopeCleanupPass14 = new com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass((com.google.javascript.jscomp.AbstractCompiler) compiler1);
        com.google.javascript.jscomp.MessageFormatter messageFormatter16 = errorFormat0.toFormatter((com.google.javascript.jscomp.SourceExcerptProvider) compiler1, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RemoveUnusedVars removeUnusedVars20 = new com.google.javascript.jscomp.RemoveUnusedVars((com.google.javascript.jscomp.AbstractCompiler) compiler1, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorFormat0);
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.WARNING + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.WARNING));
        org.junit.Assert.assertNotNull(messageFormatter16);
    }
}

