package com.google.javascript.rhino.jstype;

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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.NamedType namedType5 = new com.google.javascript.rhino.jstype.NamedType(jSTypeRegistry0, "", "", (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test2");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = null;
        com.google.javascript.rhino.Node node5 = node3.setJSDocInfo(jSDocInfo4);
        java.lang.String str6 = node2.checkTreeEquals(node5);
        boolean boolean7 = node2.isVarArgs();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = null;
        com.google.javascript.rhino.Node node11 = node9.setJSDocInfo(jSDocInfo10);
        java.lang.String str12 = node8.checkTreeEquals(node11);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = null;
        com.google.javascript.rhino.Node node16 = node14.setJSDocInfo(jSDocInfo15);
        java.lang.String str17 = node13.checkTreeEquals(node16);
        boolean boolean18 = node13.isVarArgs();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) '4', node1, node2, node8, node13, (int) '#', (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.IR.returnNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = null;
        com.google.javascript.rhino.Node node25 = node23.setJSDocInfo(jSDocInfo24);
        java.lang.String str26 = node22.checkTreeEquals(node25);
        node22.setWasEmptyNode(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.IR.regexp(node1, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test3");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative3 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative4 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative5 = com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative6 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative7 = com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative8 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray9 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative3, jSTypeNative4, jSTypeNative5, jSTypeNative6, jSTypeNative7, jSTypeNative8 };
        com.google.javascript.rhino.jstype.JSType jSType10 = jSTypeRegistry2.createUnionType(jSTypeNativeArray9);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.rhino.jstype.StringType stringType13 = new com.google.javascript.rhino.jstype.StringType(jSTypeRegistry12);
        com.google.javascript.rhino.jstype.SimpleSlot simpleSlot15 = new com.google.javascript.rhino.jstype.SimpleSlot("", (com.google.javascript.rhino.jstype.JSType) stringType13, false);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative19 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative20 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative21 = com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative22 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative23 = com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative24 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray25 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative19, jSTypeNative20, jSTypeNative21, jSTypeNative22, jSTypeNative23, jSTypeNative24 };
        com.google.javascript.rhino.jstype.JSType jSType26 = jSTypeRegistry18.createUnionType(jSTypeNativeArray25);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { jSType26 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) stringType13, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder31 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(jSTypeRegistry2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = jSTypeRegistry2.createAnonymousObjectType(jSDocInfo32);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative38 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative39 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative40 = com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative41 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative42 = com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative43 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray44 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative38, jSTypeNative39, jSTypeNative40, jSTypeNative41, jSTypeNative42, jSTypeNative43 };
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry37.createUnionType(jSTypeNativeArray44);
        boolean boolean47 = jSTypeRegistry37.isForwardDeclaredType("hi!");
        com.google.javascript.rhino.jstype.TemplateType templateType49 = new com.google.javascript.rhino.jstype.TemplateType(jSTypeRegistry37, "");
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative53 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative54 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative55 = com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative56 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative57 = com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative58 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray59 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative53, jSTypeNative54, jSTypeNative55, jSTypeNative56, jSTypeNative57, jSTypeNative58 };
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry52.createUnionType(jSTypeNativeArray59);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = null;
        com.google.javascript.rhino.jstype.StringType stringType63 = new com.google.javascript.rhino.jstype.StringType(jSTypeRegistry62);
        com.google.javascript.rhino.jstype.SimpleSlot simpleSlot65 = new com.google.javascript.rhino.jstype.SimpleSlot("", (com.google.javascript.rhino.jstype.JSType) stringType63, false);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, false);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative69 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative70 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative71 = com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative72 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative73 = com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE;
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative74 = com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray75 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative69, jSTypeNative70, jSTypeNative71, jSTypeNative72, jSTypeNative73, jSTypeNative74 };
        com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeRegistry68.createUnionType(jSTypeNativeArray75);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] { jSType76 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList78 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList78, jSTypeArray77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry52.createFunctionType((com.google.javascript.rhino.jstype.JSType) stringType63, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList78);
        com.google.javascript.rhino.jstype.UnionType unionType81 = new com.google.javascript.rhino.jstype.UnionType(jSTypeRegistry37, (java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList78);
        com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry37.createNamedType("Unversioned directory", "RETURN", (int) '#', (-1));
        jSTypeRegistry2.unregisterPropertyOnType("{({({804406666},{557170180},{-1795692850},function (this:{-1850962679}, {1405343690}, {1405343690}): {-1850962679})})}", jSType86);
        org.junit.Assert.assertTrue("'" + jSTypeNative3 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative3.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative4 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative4.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative5 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE + "'", jSTypeNative5.equals(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative6 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative6.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative7 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE + "'", jSTypeNative7.equals(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative8 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative8.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertNotNull(jSTypeNativeArray9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertTrue("'" + jSTypeNative19 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative19.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative20 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative20.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative21 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE + "'", jSTypeNative21.equals(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative22 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative22.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative23 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE + "'", jSTypeNative23.equals(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative24 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative24.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertNotNull(jSTypeNativeArray25);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertTrue("'" + jSTypeNative38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative38.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative39 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative39.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative40 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE + "'", jSTypeNative40.equals(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative41 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative41.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative42 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE + "'", jSTypeNative42.equals(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative43 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative43.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertNotNull(jSTypeNativeArray44);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + jSTypeNative53 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative53.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative54 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative54.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative55 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE + "'", jSTypeNative55.equals(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative56 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative56.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative57 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE + "'", jSTypeNative57.equals(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative58 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative58.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertNotNull(jSTypeNativeArray59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + jSTypeNative69 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative69.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative70 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative70.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative71 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE + "'", jSTypeNative71.equals(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative72 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative72.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertTrue("'" + jSTypeNative73 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE + "'", jSTypeNative73.equals(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE));
        org.junit.Assert.assertTrue("'" + jSTypeNative74 + "' != '" + com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID + "'", jSTypeNative74.equals(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID));
        org.junit.Assert.assertNotNull(jSTypeNativeArray75);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertNotNull(jSType86);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test4");
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format> dependencyInfoLinkedDirectedGraph0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
        java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge> graphvizEdgeList1 = dependencyInfoLinkedDirectedGraph0.getGraphvizEdges();
        java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format>> dependencyInfoGraphNodeCollection2 = dependencyInfoLinkedDirectedGraph0.getNodes();
        java.util.List<com.google.javascript.jscomp.graph.Graph.GraphEdge<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format>> dependencyInfoGraphEdgeList3 = dependencyInfoLinkedDirectedGraph0.getEdges();
        java.util.Collection<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format>> dependencyInfoGraphNodeCollection4 = dependencyInfoLinkedDirectedGraph0.getNodes();
        java.lang.Iterable<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format>> dependencyInfoDiGraphNodeIterable5 = dependencyInfoLinkedDirectedGraph0.getDirectedGraphNodes();
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format> dependencyInfoLinkedDirectedGraph6 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
        dependencyInfoLinkedDirectedGraph6.clearEdgeAnnotations();
        com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format> dependencyInfoLinkedDirectedGraph8 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
        dependencyInfoLinkedDirectedGraph8.clearEdgeAnnotations();
        com.google.javascript.jscomp.SourceAst sourceAst10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = new com.google.javascript.jscomp.CompilerInput(sourceAst10, "RETURN", true);
        com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format> dependencyInfoDiGraphNode14 = dependencyInfoLinkedDirectedGraph8.getDirectedGraphNode((com.google.javascript.jscomp.deps.DependencyInfo) compilerInput13);
        com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format> dependencyInfoDiGraphNode15 = dependencyInfoLinkedDirectedGraph6.getDirectedGraphNode((com.google.javascript.jscomp.deps.DependencyInfo) compilerInput13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.SourceMap.Format>> dependencyInfoGraphNodeItor16 = dependencyInfoLinkedDirectedGraph0.getNeighborNodesIterator((com.google.javascript.jscomp.deps.DependencyInfo) compilerInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dependencyInfoLinkedDirectedGraph0);
        org.junit.Assert.assertNotNull(graphvizEdgeList1);
        org.junit.Assert.assertNotNull(dependencyInfoGraphNodeCollection2);
        org.junit.Assert.assertNotNull(dependencyInfoGraphEdgeList3);
        org.junit.Assert.assertNotNull(dependencyInfoGraphNodeCollection4);
        org.junit.Assert.assertNotNull(dependencyInfoDiGraphNodeIterable5);
        org.junit.Assert.assertNotNull(dependencyInfoLinkedDirectedGraph6);
        org.junit.Assert.assertNotNull(dependencyInfoLinkedDirectedGraph8);
        org.junit.Assert.assertNull(dependencyInfoDiGraphNode14);
        org.junit.Assert.assertNull(dependencyInfoDiGraphNode15);
    }
}

