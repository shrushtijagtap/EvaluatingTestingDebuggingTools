package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.jxpath.CompiledExpression compiledExpression1 = org.apache.commons.jxpath.JXPathContext.compile("DOM");
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext4, nodeTest5);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext8 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext6, nodeTest7);
        java.lang.Object obj9 = constant3.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext8);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext12 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext10, nodeTest11);
        java.lang.Object obj13 = constant3.computeValue(evalContext10);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = org.apache.commons.jxpath.JXPathContext.newContext(obj13);
        org.apache.commons.jxpath.AbstractFactory abstractFactory15 = jXPathContext14.getFactory();
        compiledExpression1.removeAll(jXPathContext14);
        java.lang.Object obj17 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = org.apache.commons.jxpath.JXPathContext.newContext(obj17);
        org.apache.commons.jxpath.AbstractFactory abstractFactory19 = jXPathContext18.getFactory();
        org.apache.commons.jxpath.JXPathContext jXPathContext21 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext18, (java.lang.Object) 0.0d);
        java.util.Iterator iterator22 = compiledExpression1.iteratePointers(jXPathContext18);
        java.lang.Object obj23 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext24 = org.apache.commons.jxpath.JXPathContext.newContext(obj23);
        org.apache.commons.jxpath.AbstractFactory abstractFactory25 = jXPathContext24.getFactory();
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext24, (java.lang.Object) 0.0d);
        org.apache.commons.jxpath.AbstractFactory abstractFactory28 = null;
        jXPathContext27.setFactory(abstractFactory28);
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer32 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale30, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer33 = nullPointer32.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer33, "$null");
        org.apache.commons.jxpath.ri.QName qName36 = jDOMNamespacePointer35.getName();
        // The following exception was thrown during execution in test generation
        try {
            compiledExpression1.setValue(jXPathContext27, (java.lang.Object) qName36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot set property 0/DOM, path does not match a changeable location");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compiledExpression1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 9 + "'", obj9, 9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 9 + "'", obj13, 9);
        org.junit.Assert.assertNotNull(jXPathContext14);
        org.junit.Assert.assertNull(abstractFactory15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(jXPathContext18);
        org.junit.Assert.assertNull(abstractFactory19);
        org.junit.Assert.assertNotNull(jXPathContext21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(jXPathContext24);
        org.junit.Assert.assertNull(abstractFactory25);
        org.junit.Assert.assertNotNull(jXPathContext27);
        org.junit.Assert.assertNotNull(propertyPointer33);
        org.junit.Assert.assertNotNull(qName36);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        java.lang.String str5 = containerPointer2.getNamespaceURI("/");
        int int6 = containerPointer2.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = containerPointer2.namespacePointer("DOM");
        org.apache.commons.jxpath.ri.QName qName9 = containerPointer2.getName();
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNull(qName9);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNull(nodePointer7);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray2 = null;
        java.lang.Object obj3 = treeCompiler0.function(18, objArray2);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = treeCompiler0.variableReference(obj4);
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext6, nodeTest7);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext10 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext8, nodeTest9);
        int int11 = namespaceContext10.getPosition();
        boolean boolean13 = namespaceContext10.setPosition(39);
        java.util.List list14 = namespaceContext10.getContextNodeList();
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale16, "hi!");
        java.lang.Object obj19 = jDOMNodePointer18.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver21 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver22 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver21);
        jDOMNodePointer18.setNamespaceResolver(namespaceResolver21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = jDOMNodePointer18.namespacePointer("org.apache.commons.jxpath.JXPathContextFactory");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeCompiler0.lessThanOrEqual((java.lang.Object) list14, (java.lang.Object) nodePointer25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.ArrayList cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "boolean()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "boolean()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "boolean()");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "$null");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNotNull(nodePointer25);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale7, ":<<unknown namespace>>");
        boolean boolean11 = nullPointer10.isLeaf();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer12 = nullPointer10.getPropertyPointer();
        org.apache.commons.jxpath.ri.QName qName13 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer14 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName13);
        java.lang.String str15 = variablePointer14.asPath();
        org.apache.commons.jxpath.ri.QName qName16 = variablePointer14.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer10, (java.lang.Object) variablePointer14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(propertyPointer12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "$null" + "'", str15, "$null");
        org.junit.Assert.assertNull(qName16);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory collectionPointerFactory0 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        org.apache.commons.jxpath.ri.compiler.Constant constant8 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext9, nodeTest10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext13 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext11, nodeTest12);
        java.lang.Object obj14 = constant8.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest18 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        boolean boolean19 = nameAttributeTest18.computeContextDependent();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler20 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj21 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant23 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj24 = treeCompiler20.mod(obj21, (java.lang.Object) constant23);
        java.lang.Object obj25 = treeCompiler0.multiply((java.lang.Object) nameAttributeTest18, obj21);
        java.lang.Object obj27 = treeCompiler0.nodeTypeTest(20);
        java.lang.Object obj29 = treeCompiler0.literal("namespace::");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer31, "");
        boolean boolean34 = jDOMNamespacePointer33.isCollection();
        java.lang.Object obj35 = jDOMNamespacePointer33.getBaseValue();
        int int36 = jDOMNamespacePointer33.getLength();
        boolean boolean37 = jDOMNamespacePointer33.isLeaf();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler38 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj39 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant41 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj42 = treeCompiler38.mod(obj39, (java.lang.Object) constant41);
        java.lang.Object obj44 = treeCompiler38.nodeTypeTest(1);
        org.apache.commons.jxpath.ri.compiler.Constant constant46 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext47 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext49 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext47, nodeTest48);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext51 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext49, nodeTest50);
        java.lang.Object obj52 = constant46.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext51);
        org.apache.commons.jxpath.ri.compiler.Expression expression53 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual55 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression53, expression54);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest56 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual55);
        boolean boolean57 = nameAttributeTest56.computeContextDependent();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler58 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj59 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant61 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj62 = treeCompiler58.mod(obj59, (java.lang.Object) constant61);
        java.lang.Object obj63 = treeCompiler38.multiply((java.lang.Object) nameAttributeTest56, obj59);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer33, (java.lang.Object) nameAttributeTest56);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray65 = nameAttributeTest56.getArguments();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = treeCompiler0.locationPath(false, (java.lang.Object[]) expressionArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.compiler.Constant cannot be cast to org.apache.commons.jxpath.ri.compiler.Step");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 9 + "'", obj14, 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "UNKNOWN()");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "'namespace::'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "'namespace::'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "'namespace::'");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "node()");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 9 + "'", obj52, 9);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(expressionArray65);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer1 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName0);
        java.lang.String str2 = variablePointer1.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = variablePointer1.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = variablePointer1.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = variablePointer1.namespacePointer("");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer7, "");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer7, "", "");
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer16.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = propertyPointer17.namespaceIterator();
        org.w3c.dom.Node node19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node19, locale20, "hi!");
        boolean boolean23 = dOMNodePointer22.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = dOMNodePointer22.testNode(nodeTest24);
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean29 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext32 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext30, nodeTest31);
        boolean boolean34 = attributeContext32.setPosition(54);
        java.lang.Object obj35 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = org.apache.commons.jxpath.JXPathContext.newContext(obj35);
        java.util.Locale locale37 = jXPathContext36.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer38 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale37);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer39 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName28, dynaBean29, locale37);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer22, qName28);
        java.lang.Object obj41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = jDOMPointerFactory13.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer17, qName28, obj41);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler43 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj44 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant46 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj47 = treeCompiler43.mod(obj44, (java.lang.Object) constant46);
        java.lang.Object obj49 = treeCompiler43.nodeTypeTest(1);
        java.lang.Object obj51 = treeCompiler43.processingInstructionTest("$null");
        java.lang.Object[] objArray52 = null;
        java.lang.Object obj53 = treeCompiler43.sum(objArray52);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer12, qName28, obj53);
        org.apache.commons.jxpath.JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError56 = new org.apache.commons.jxpath.JXPathContextFactoryConfigurationError("hi!");
        java.lang.Throwable[] throwableArray57 = jXPathContextFactoryConfigurationError56.getSuppressed();
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo58 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer59 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) variablePointer1, qName28, (java.lang.Object) jXPathContextFactoryConfigurationError56, jXPathBeanInfo58);
        java.lang.String str60 = variablePointer1.asPath();
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext63 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext61, nodeTest62);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext65 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext63, nodeTest64);
        boolean boolean67 = attributeContext63.setPosition(0);
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer70 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale68, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer71 = nullPointer70.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer71, "$null");
        org.apache.commons.jxpath.ri.QName qName74 = jDOMNamespacePointer73.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest75 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName74);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext76 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext63, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest75);
        org.apache.commons.jxpath.ri.QName qName77 = nodeNameTest75.getNodeName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator78 = variablePointer1.attributeIterator(qName77);
        org.apache.commons.jxpath.ri.QName qName79 = variablePointer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$null" + "'", str2, "$null");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(jXPathContext36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "node()");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "processing-instruction('$null')");
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "$null" + "'", str60, "$null");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(propertyPointer71);
        org.junit.Assert.assertNotNull(qName74);
        org.junit.Assert.assertNotNull(qName77);
        org.junit.Assert.assertNotNull(nodeIterator78);
        org.junit.Assert.assertNull(qName79);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0);
        java.io.Reader reader2 = null;
        simpleCharStream1.ReInit(reader2, 45, 30, 71);
        int int7 = simpleCharStream1.getBeginColumn();
        int int8 = simpleCharStream1.bufpos;
        int int9 = simpleCharStream1.getBeginLine();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = simpleCharStream1.getEndColumn();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean3 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext4, nodeTest5);
        boolean boolean8 = attributeContext6.setPosition(54);
        java.lang.Object obj9 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(obj9);
        java.util.Locale locale11 = jXPathContext10.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer12 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale11);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer13 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean3, locale11);
        java.lang.String str14 = dynaBeanPointer13.asPath();
        org.w3c.dom.Attr attr15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer13, attr15);
        boolean boolean17 = dOMAttributePointer16.isLeaf();
        dOMAttributePointer16.setAttribute(true);
        java.lang.Object obj20 = dOMAttributePointer16.getBaseValue();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean3 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext4, nodeTest5);
        boolean boolean8 = attributeContext6.setPosition(54);
        java.lang.Object obj9 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(obj9);
        java.util.Locale locale11 = jXPathContext10.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer12 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale11);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer13 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean3, locale11);
        java.lang.String str14 = dynaBeanPointer13.asPath();
        org.w3c.dom.Attr attr15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer13, attr15);
        boolean boolean17 = dOMAttributePointer16.isLeaf();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext20 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext18, nodeTest19);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext22 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext20, nodeTest21);
        boolean boolean24 = attributeContext20.setPosition(0);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer28 = nullPointer27.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer28, "$null");
        org.apache.commons.jxpath.ri.QName qName31 = jDOMNamespacePointer30.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest32 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName31);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext33 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext20, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        org.apache.commons.jxpath.ri.QName qName34 = nodeNameTest32.getNodeName();
        boolean boolean35 = dOMAttributePointer16.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = dOMAttributePointer16.getValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName37 = dOMAttributePointer16.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(propertyPointer28);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodePointer36);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        java.lang.Object obj8 = treeCompiler0.processingInstructionTest("$null");
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "$null", locale9, "id(UNKNOWN)");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "processing-instruction('$null')");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator3, locale4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser10 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean11 = dOMParser10.isIgnoringElementContentWhitespace();
        dOMParser10.setNamespaceAware(false);
        boolean boolean14 = dOMParser10.isIgnoringComments();
        java.lang.Object obj15 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext(obj15);
        java.util.Locale locale17 = jXPathContext16.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = jDOMPointerFactory6.createNodePointer(qName9, (java.lang.Object) dOMParser10, locale17);
        org.apache.commons.beanutils.DynaBean dynaBean19 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, qName9, dynaBean19);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer23 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer20, "JDOM", "=");
        boolean boolean24 = namespacePointer23.isCollection();
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer28 = nullPointer27.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer28, "$null");
        org.apache.commons.jxpath.ri.QName qName31 = jDOMNamespacePointer30.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest32 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName31);
        boolean boolean33 = namespacePointer23.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        java.lang.String str34 = nodeNameTest32.getNamespaceURI();
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(propertyPointer28);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer4 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, (java.lang.Object) (byte) -1, dynamicPropertyHandler2, locale3);
        java.lang.Object obj5 = dynamicPointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer8 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer4, "", "hi!");
        java.lang.String str9 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) dynamicPointer4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        org.apache.commons.jxpath.Container container63 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer65 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container63, locale64);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator66 = containerPointer65.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator70 = containerPointer65.childIterator(nodeTest67, true, nodePointer69);
        boolean boolean71 = containerPointer65.isCollection();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext72 = jXPathContextReferenceImpl62.getRelativeContext((org.apache.commons.jxpath.Pointer) containerPointer65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create a relative context for a non-existent node: /");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(nodeIterator66);
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        simpleCharStream42.bufpos = 26;
        java.io.InputStream inputStream65 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleCharStream42.ReInit(inputStream65, (int) ' ', 73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean3 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext4, nodeTest5);
        boolean boolean8 = attributeContext6.setPosition(54);
        java.lang.Object obj9 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(obj9);
        java.util.Locale locale11 = jXPathContext10.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer12 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale11);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer13 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean3, locale11);
        java.lang.String str14 = dynaBeanPointer13.asPath();
        org.w3c.dom.Attr attr15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer13, attr15);
        boolean boolean17 = dOMAttributePointer16.isLeaf();
        org.apache.commons.jxpath.ri.QName qName18 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer22 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName18, (java.lang.Object) (byte) -1, dynamicPropertyHandler20, locale21);
        boolean boolean23 = dynamicPointer22.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = dynamicPointer22.namespacePointer("");
        int int26 = dynamicPointer22.getIndex();
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext29 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext27, nodeTest28);
        boolean boolean31 = attributeContext29.setPosition(54);
        java.lang.Object obj32 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext33 = org.apache.commons.jxpath.JXPathContext.newContext(obj32);
        java.util.Locale locale34 = jXPathContext33.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer35 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale34);
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale37, "hi!");
        java.lang.Object obj40 = jDOMNodePointer39.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer41, "");
        boolean boolean44 = jDOMNamespacePointer43.isCollection();
        org.apache.commons.jxpath.ri.QName qName45 = jDOMNamespacePointer43.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer39.attributeIterator(qName45);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = collectionPointer35.attributeIterator(qName45);
        org.apache.commons.jxpath.ri.QName qName48 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer49 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName48);
        java.lang.String str50 = variablePointer49.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = variablePointer49.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = variablePointer49.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = variablePointer49.namespacePointer("");
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale56, "hi!");
        java.lang.Object obj59 = jDOMNodePointer58.getBaseValue();
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer62 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale60, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer63 = nullPointer62.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer64 = nullPointer62.getPropertyPointer();
        org.w3c.dom.Node node65 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer66 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer62, node65);
        int int67 = variablePointer49.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer58, (org.apache.commons.jxpath.ri.model.NodePointer) nullPointer62);
        boolean boolean68 = variablePointer49.isContainer();
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory69 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale71, "hi!");
        java.lang.Object obj74 = jDOMNodePointer73.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator75 = jDOMNodePointer73.namespaceIterator();
        java.lang.Object obj76 = jDOMNodePointer73.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName77 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer78 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer80 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer78, "");
        boolean boolean81 = jDOMNamespacePointer80.isCollection();
        java.lang.Object obj82 = jDOMNamespacePointer80.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer83 = containerPointerFactory69.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73, qName77, (java.lang.Object) jDOMNamespacePointer80);
        int int84 = collectionPointer35.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) variablePointer49, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73);
        int int85 = dOMAttributePointer16.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer22, (org.apache.commons.jxpath.ri.model.NodePointer) variablePointer49);
        java.lang.Object obj86 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext87 = org.apache.commons.jxpath.JXPathContext.newContext(obj86);
        org.apache.commons.jxpath.AbstractFactory abstractFactory88 = jXPathContext87.getFactory();
        org.apache.commons.jxpath.JXPathContext jXPathContext90 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext87, (java.lang.Object) 0.0d);
        jXPathContext87.setLenient(false);
        org.apache.commons.jxpath.IdentityManager identityManager93 = null;
        jXPathContext87.setIdentityManager(identityManager93);
        org.apache.commons.jxpath.IdentityManager identityManager95 = null;
        jXPathContext87.setIdentityManager(identityManager95);
        java.lang.Object obj97 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer98 = variablePointer49.createPath(jXPathContext87, obj97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: $null");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(nodePointer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2147483648) + "'", int26 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(jXPathContext33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "$null" + "'", str50, "$null");
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNotNull(nodePointer52);
        org.junit.Assert.assertNull(nodePointer54);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
        org.junit.Assert.assertNotNull(propertyPointer63);
        org.junit.Assert.assertNotNull(propertyPointer64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 100.0d + "'", obj74, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator75);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 100.0d + "'", obj76, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(nodePointer83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(jXPathContext87);
        org.junit.Assert.assertNull(abstractFactory88);
        org.junit.Assert.assertNotNull(jXPathContext90);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl jXPathContextFactoryReferenceImpl0 = new org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl();
        java.lang.Object obj1 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext2 = org.apache.commons.jxpath.JXPathContext.newContext(obj1);
        java.util.Locale locale3 = jXPathContext2.getLocale();
        org.w3c.dom.Node node4 = null;
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.lang.Object obj7 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = org.apache.commons.jxpath.JXPathContext.newContext(obj7);
        java.util.Locale locale9 = jXPathContext8.getLocale();
        jXPathContext6.setLocale(locale9);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale9);
        int int12 = org.apache.commons.jxpath.util.ValueUtils.getLength((java.lang.Object) locale9);
        jXPathContext2.setLocale(locale9);
        org.apache.commons.jxpath.AbstractFactory abstractFactory14 = null;
        jXPathContext2.setFactory(abstractFactory14);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = jXPathContext2.getParentContext();
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = jXPathContext2.getParentContext();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext20 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext18, nodeTest19);
        boolean boolean22 = attributeContext20.setPosition(54);
        java.lang.Object obj23 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext24 = org.apache.commons.jxpath.JXPathContext.newContext(obj23);
        java.util.Locale locale25 = jXPathContext24.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer26 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale25);
        java.lang.String str27 = collectionPointer26.asPath();
        java.lang.Object obj28 = collectionPointer26.getImmediateNode();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser33 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean34 = dOMParser33.isIgnoringElementContentWhitespace();
        dOMParser33.setNamespaceAware(false);
        boolean boolean37 = dOMParser33.isIgnoringComments();
        java.lang.Object obj38 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = org.apache.commons.jxpath.JXPathContext.newContext(obj38);
        java.util.Locale locale40 = jXPathContext39.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = jDOMPointerFactory29.createNodePointer(qName32, (java.lang.Object) dOMParser33, locale40);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer43 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale40, "");
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError46 = new org.apache.commons.jxpath.ri.parser.TokenMgrError("", 47);
        org.apache.commons.jxpath.JXPathException jXPathException48 = new org.apache.commons.jxpath.JXPathException("$null");
        tokenMgrError46.addSuppressed((java.lang.Throwable) jXPathException48);
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer50 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43, (java.lang.Object) tokenMgrError46);
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer53 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale51, "$null");
        boolean boolean54 = nullPointer53.isCollection();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer55 = nullPointer53.getPropertyPointer();
        int int56 = collectionPointer26.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer43, (org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer55);
        org.apache.commons.jxpath.ri.QName qName57 = nullPointer43.getName();
        org.apache.commons.jxpath.JXPathContext jXPathContext58 = jXPathContextFactoryReferenceImpl0.newContext(jXPathContext2, (java.lang.Object) nullPointer43);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jXPathContext2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(jXPathContext8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(jXPathContext16);
        org.junit.Assert.assertNull(jXPathContext17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(jXPathContext24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/" + "'", str27, "/");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 54 + "'", obj28, 54);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(jXPathContext39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer41);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(propertyPointer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(qName57);
        org.junit.Assert.assertNotNull(jXPathContext58);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator3, locale4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser10 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean11 = dOMParser10.isIgnoringElementContentWhitespace();
        dOMParser10.setNamespaceAware(false);
        boolean boolean14 = dOMParser10.isIgnoringComments();
        java.lang.Object obj15 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext(obj15);
        java.util.Locale locale17 = jXPathContext16.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = jDOMPointerFactory6.createNodePointer(qName9, (java.lang.Object) dOMParser10, locale17);
        org.apache.commons.beanutils.DynaBean dynaBean19 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, qName9, dynaBean19);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer23 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer20, "JDOM", "=");
        java.lang.String str25 = namespacePointer23.getNamespaceURI("JDOM");
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.compiler.Constant constant34 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext37 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext35, nodeTest36);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext39 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext37, nodeTest38);
        java.lang.Object obj40 = constant34.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext39);
        org.apache.commons.jxpath.ri.EvalContext evalContext41 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext43 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext41, nodeTest42);
        java.lang.Object obj44 = constant34.computeValue(evalContext41);
        org.apache.commons.jxpath.JXPathContext jXPathContext45 = org.apache.commons.jxpath.JXPathContext.newContext(obj44);
        org.apache.commons.jxpath.Container container46 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer48 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container46, locale47);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = containerPointer48.namespaceIterator();
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator49, locale50);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName55 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser56 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean57 = dOMParser56.isIgnoringElementContentWhitespace();
        dOMParser56.setNamespaceAware(false);
        boolean boolean60 = dOMParser56.isIgnoringComments();
        java.lang.Object obj61 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext62 = org.apache.commons.jxpath.JXPathContext.newContext(obj61);
        java.util.Locale locale63 = jXPathContext62.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer64 = jDOMPointerFactory52.createNodePointer(qName55, (java.lang.Object) dOMParser56, locale63);
        org.apache.commons.beanutils.DynaBean dynaBean65 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer66 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51, qName55, dynaBean65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = collectionPointer8.createChild(jXPathContext45, qName55, 30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot turn java.lang.Integer into a collection of size 31");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 9 + "'", obj40, 9);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 9 + "'", obj44, 9);
        org.junit.Assert.assertNotNull(jXPathContext45);
        org.junit.Assert.assertNull(nodeIterator49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(jXPathContext62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer64);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.jdom.Attribute attribute33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer8, attribute33);
        java.lang.Object obj35 = jDOMAttributePointer34.getImmediateNode();
        boolean boolean36 = jDOMAttributePointer34.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer37, "");
        boolean boolean40 = jDOMNamespacePointer39.isCollection();
        org.apache.commons.jxpath.ri.QName qName41 = jDOMNamespacePointer39.getName();
        org.apache.commons.jxpath.JXPathContext jXPathContext42 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) jDOMNamespacePointer39);
        org.apache.commons.jxpath.IdentityManager identityManager43 = null;
        jXPathContext42.setIdentityManager(identityManager43);
        boolean boolean45 = jDOMAttributePointer34.equals((java.lang.Object) identityManager43);
        java.lang.String str46 = jDOMAttributePointer34.asPath();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(qName41);
        org.junit.Assert.assertNotNull(jXPathContext42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "/@null" + "'", str46, "/@null");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.Object obj5 = jDOMNodePointer3.getNodeValue();
        jDOMNodePointer3.printPointerChain();
        boolean boolean8 = jDOMNodePointer3.equals((java.lang.Object) (byte) 1);
        org.apache.commons.jxpath.ri.QName qName9 = jDOMNodePointer3.getName();
        org.apache.commons.beanutils.DynaBean dynaBean10 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory11 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale13, "hi!");
        java.lang.Object obj16 = jDOMNodePointer15.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = jDOMNodePointer15.namespaceIterator();
        java.lang.Object obj18 = jDOMNodePointer15.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer20, "");
        boolean boolean23 = jDOMNamespacePointer22.isCollection();
        java.lang.Object obj24 = jDOMNamespacePointer22.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = containerPointerFactory11.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer15, qName19, (java.lang.Object) jDOMNamespacePointer22);
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale27, "hi!");
        java.lang.Object obj30 = jDOMNodePointer29.getBaseValue();
        java.lang.Object obj31 = jDOMNodePointer29.getNodeValue();
        jDOMNodePointer29.printPointerChain();
        boolean boolean33 = jDOMNodePointer29.isLeaf();
        org.jdom.Attribute attribute34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, attribute34);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node37 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer40 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node37, locale38, "hi!");
        java.lang.String str42 = dOMNodePointer40.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMPointerFactory36.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer40, qName43, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext48 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext46, nodeTest47);
        boolean boolean50 = attributeContext48.setPosition(54);
        java.lang.Object obj51 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext52 = org.apache.commons.jxpath.JXPathContext.newContext(obj51);
        java.util.Locale locale53 = jXPathContext52.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer54 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale53);
        boolean boolean55 = dOMNodePointer40.equals((java.lang.Object) locale53);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMAttributePointer35, locale53);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer25, locale53, "id('hi!')");
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer59 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName9, dynaBean10, locale53);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(nodePointer25);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(jXPathContext52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        int int0 = org.apache.commons.jxpath.ri.Compiler.NODE_TYPE_COMMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = jDOMNodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver7 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver6);
        jDOMNodePointer3.setNamespaceResolver(namespaceResolver6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = jDOMNodePointer3.namespacePointer("org.apache.commons.jxpath.JXPathContextFactory");
        java.lang.Object obj11 = jDOMNodePointer3.getValue();
        java.lang.String str12 = jDOMNodePointer3.getLanguage();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator5);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.jdom.Attribute attribute33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer8, attribute33);
        java.lang.Object obj35 = jDOMAttributePointer34.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer36, "");
        java.lang.Object obj39 = jDOMNamespacePointer38.getBaseValue();
        org.w3c.dom.Node node40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node40, locale41, "hi!");
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext46 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext44, nodeTest45);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext48 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext46, nodeTest47);
        namespaceContext48.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = namespaceContext48.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext53 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext48, true, nodeTest52);
        int int54 = namespaceContext48.getPosition();
        boolean boolean55 = dOMNodePointer43.equals((java.lang.Object) int54);
        int int56 = jDOMAttributePointer34.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer38, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = jDOMAttributePointer34.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(nodePointer50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = collectionPointer8.namespaceIterator();
        boolean boolean34 = collectionPointer8.isLeaf();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer4 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, (java.lang.Object) (byte) -1, dynamicPropertyHandler2, locale3);
        org.apache.commons.jxpath.ri.QName qName5 = dynamicPointer4.getName();
        boolean boolean6 = dynamicPointer4.isContainer();
        java.lang.String str7 = dynamicPointer4.getNamespaceURI();
        java.lang.Object obj8 = dynamicPointer4.getValue();
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer4 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName0, (java.lang.Object) 100, jXPathBeanInfo2, locale3);
        boolean boolean5 = beanPointer4.isLeaf();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer6 = beanPointer4.getPropertyPointer();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("id('hi!')", "");
        org.apache.commons.jxpath.ri.compiler.Constant constant11 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext12, nodeTest13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext16 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext14, nodeTest15);
        java.lang.Object obj17 = constant11.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext16);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo18 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer19 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer4, qName9, (java.lang.Object) constant11, jXPathBeanInfo18);
        boolean boolean20 = beanPointer19.isCollection();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(propertyPointer6);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 9 + "'", obj17, 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler1 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj3 = treeCompiler1.processingInstructionTest("/");
        java.lang.Object obj4 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler1);
        java.lang.Object obj6 = treeCompiler1.literal("/:<<unknown namespace>>/namespace::JDOM");
        org.apache.commons.jxpath.ri.parser.ParseException parseException9 = new org.apache.commons.jxpath.ri.parser.ParseException("/");
        org.apache.commons.jxpath.JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError11 = new org.apache.commons.jxpath.JXPathContextFactoryConfigurationError((java.lang.Exception) parseException9, "/");
        org.apache.commons.jxpath.ri.parser.Token token12 = parseException9.currentToken;
        org.apache.commons.jxpath.ri.parser.Token token13 = null;
        int[] intArray17 = new int[] { 66, 17, 59 };
        int[] intArray21 = new int[] { 66, 17, 59 };
        int[] intArray25 = new int[] { 66, 17, 59 };
        int[] intArray29 = new int[] { 66, 17, 59 };
        int[][] intArray30 = new int[][] { intArray17, intArray21, intArray25, intArray29 };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "id($null)" };
        org.apache.commons.jxpath.ri.parser.ParseException parseException35 = new org.apache.commons.jxpath.ri.parser.ParseException(token13, intArray30, strArray34);
        parseException9.tokenImage = strArray34;
        org.apache.commons.jxpath.ri.parser.Token token37 = null;
        int[] intArray41 = new int[] { 66, 17, 59 };
        int[] intArray45 = new int[] { 66, 17, 59 };
        int[] intArray49 = new int[] { 66, 17, 59 };
        int[] intArray53 = new int[] { 66, 17, 59 };
        int[][] intArray54 = new int[][] { intArray41, intArray45, intArray49, intArray53 };
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!", "id($null)" };
        org.apache.commons.jxpath.ri.parser.ParseException parseException59 = new org.apache.commons.jxpath.ri.parser.ParseException(token37, intArray54, strArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = treeCompiler1.expressionPath((java.lang.Object) 23, (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "$null");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertNull(token12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        namespaceContext4.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = namespaceContext4.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext9 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, true, nodeTest8);
        int int10 = namespaceContext4.getPosition();
        boolean boolean12 = namespaceContext4.setPosition(71);
        org.apache.commons.jxpath.Container container14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer16 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container14, locale15);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = containerPointer16.namespaceIterator();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator17, locale18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName23 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser24 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean25 = dOMParser24.isIgnoringElementContentWhitespace();
        dOMParser24.setNamespaceAware(false);
        boolean boolean28 = dOMParser24.isIgnoringComments();
        java.lang.Object obj29 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = org.apache.commons.jxpath.JXPathContext.newContext(obj29);
        java.util.Locale locale31 = jXPathContext30.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = jDOMPointerFactory20.createNodePointer(qName23, (java.lang.Object) dOMParser24, locale31);
        org.apache.commons.beanutils.DynaBean dynaBean33 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer34 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19, qName23, dynaBean33);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer37 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer34, "JDOM", "=");
        boolean boolean38 = namespacePointer37.isCollection();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer41 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale39, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer42 = nullPointer41.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer42, "$null");
        org.apache.commons.jxpath.ri.QName qName45 = jDOMNamespacePointer44.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest46 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName45);
        boolean boolean47 = namespacePointer37.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext48 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext52 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext50, nodeTest51);
        boolean boolean54 = attributeContext52.setPosition(54);
        java.lang.Object obj55 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext56 = org.apache.commons.jxpath.JXPathContext.newContext(obj55);
        java.util.Locale locale57 = jXPathContext56.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer58 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale57);
        java.lang.String str59 = collectionPointer58.asPath();
        int int60 = collectionPointer58.getLength();
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext63 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext61, nodeTest62);
        org.apache.commons.jxpath.ri.EvalContext evalContext64 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest65 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext66 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext64, nodeTest65);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext68 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext66, nodeTest67);
        boolean boolean70 = attributeContext66.setPosition(0);
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer73 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale71, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer74 = nullPointer73.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer74, "$null");
        org.apache.commons.jxpath.ri.QName qName77 = jDOMNamespacePointer76.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest78 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName77);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext79 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext66, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest78);
        boolean boolean80 = nodeNameTest78.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext81 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext63, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest78);
        org.apache.commons.jxpath.ri.EvalContext evalContext82 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest83 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext84 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext82, nodeTest83);
        java.util.List list85 = attributeContext84.getContextNodeList();
        java.util.Locale locale87 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer89 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale87, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer90 = nullPointer89.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer92 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer90, "$null");
        org.apache.commons.jxpath.ri.QName qName93 = jDOMNamespacePointer92.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest94 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName93);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext95 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext84, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest94);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext96 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) selfContext81, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest94);
        boolean boolean97 = collectionPointer58.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest94);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext98 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest94);
        int int99 = ancestorContext98.getDocumentOrder();
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodeIterator17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(jXPathContext30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(propertyPointer42);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(jXPathContext56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/" + "'", str59, "/");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(propertyPointer74);
        org.junit.Assert.assertNotNull(qName77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertNotNull(propertyPointer90);
        org.junit.Assert.assertNotNull(qName93);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext2);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext7, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext11 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean13 = attributeContext9.setPosition(0);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer16.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer17, "$null");
        org.apache.commons.jxpath.ri.QName qName20 = jDOMNamespacePointer19.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName20);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext22 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = parentContext22.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] { parentContext22 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, evalContextArray24);
        int int26 = unionContext25.getDocumentOrder();
        int int27 = unionContext25.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext30 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) unionContext25, nodeTest28, false);
        int int31 = precedingOrFollowingContext30.getDocumentOrder();
        int int32 = precedingOrFollowingContext30.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator33 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) precedingOrFollowingContext30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = precedingOrFollowingContext30.setPosition(63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNull(nodePointer23);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext5, nodeTest6);
        boolean boolean9 = attributeContext7.setPosition(54);
        java.lang.Object obj10 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = org.apache.commons.jxpath.JXPathContext.newContext(obj10);
        java.util.Locale locale12 = jXPathContext11.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer13 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale12);
        java.lang.String str14 = collectionPointer13.asPath();
        int int15 = collectionPointer13.getLength();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext18 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext16, nodeTest17);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext20 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext18, nodeTest19);
        boolean boolean22 = attributeContext18.setPosition(0);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer25 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale23, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer26 = nullPointer25.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer26, "$null");
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer28.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest30 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName29);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext31 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext18, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest30);
        java.lang.String str32 = nodeNameTest30.toString();
        org.apache.commons.jxpath.ri.QName qName34 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler36 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName34, (java.lang.Object) (byte) -1, dynamicPropertyHandler36, locale37);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer38, (java.lang.Object) 100.0f, nodeTest40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = collectionPointer13.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest30, true, (org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer38);
        org.apache.commons.jxpath.ri.compiler.Constant constant44 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest46 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext47 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext45, nodeTest46);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext49 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext47, nodeTest48);
        java.lang.Object obj50 = constant44.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext49);
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext53 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext51, nodeTest52);
        java.lang.Object obj54 = constant44.computeValue(evalContext51);
        org.apache.commons.jxpath.JXPathContext jXPathContext55 = org.apache.commons.jxpath.JXPathContext.newContext(obj54);
        java.util.Locale locale56 = jXPathContext55.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = treeCompiler0.equal((java.lang.Object) collectionPointer13, (java.lang.Object) jXPathContext55);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.model.beans.CollectionPointer cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(jXPathContext11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(propertyPointer26);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "$null" + "'", str32, "$null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 9 + "'", obj50, 9);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 9 + "'", obj54, 9);
        org.junit.Assert.assertNotNull(jXPathContext55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer0, "");
        boolean boolean3 = jDOMNamespacePointer2.isCollection();
        java.lang.Object obj4 = jDOMNamespacePointer2.getBaseValue();
        int int5 = jDOMNamespacePointer2.getLength();
        boolean boolean6 = jDOMNamespacePointer2.isLeaf();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler7 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj8 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant10 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj11 = treeCompiler7.mod(obj8, (java.lang.Object) constant10);
        java.lang.Object obj13 = treeCompiler7.nodeTypeTest(1);
        org.apache.commons.jxpath.ri.compiler.Constant constant15 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext18 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext16, nodeTest17);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext20 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext18, nodeTest19);
        java.lang.Object obj21 = constant15.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext20);
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression22, expression23);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest25 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant15, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual24);
        boolean boolean26 = nameAttributeTest25.computeContextDependent();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler27 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj28 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant30 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj31 = treeCompiler27.mod(obj28, (java.lang.Object) constant30);
        java.lang.Object obj32 = treeCompiler7.multiply((java.lang.Object) nameAttributeTest25, obj28);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer2, (java.lang.Object) nameAttributeTest25);
        boolean boolean35 = jDOMNamespacePointer2.equals((java.lang.Object) 27);
        java.lang.Object obj36 = jDOMNamespacePointer2.getBaseValue();
        org.apache.commons.jxpath.Container container37 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer39 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container37, locale38);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = containerPointer39.namespaceIterator();
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator40, locale41);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName46 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser47 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean48 = dOMParser47.isIgnoringElementContentWhitespace();
        dOMParser47.setNamespaceAware(false);
        boolean boolean51 = dOMParser47.isIgnoringComments();
        java.lang.Object obj52 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext53 = org.apache.commons.jxpath.JXPathContext.newContext(obj52);
        java.util.Locale locale54 = jXPathContext53.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = jDOMPointerFactory43.createNodePointer(qName46, (java.lang.Object) dOMParser47, locale54);
        org.apache.commons.beanutils.DynaBean dynaBean56 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer57 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42, qName46, dynaBean56);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer60 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer57, "JDOM", "=");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = null;
        org.apache.commons.jxpath.Container container62 = null;
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer64 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container62, locale63);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = containerPointer64.namespaceIterator();
        java.lang.String str67 = containerPointer64.getNamespaceURI("/");
        int int68 = containerPointer64.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = containerPointer64.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName70 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo72 = null;
        java.util.Locale locale73 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer74 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName70, (java.lang.Object) 100, jXPathBeanInfo72, locale73);
        boolean boolean75 = beanPointer74.isLeaf();
        int int76 = beanPointer74.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory77 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName80 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser81 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean82 = dOMParser81.isIgnoringElementContentWhitespace();
        dOMParser81.setNamespaceAware(false);
        boolean boolean85 = dOMParser81.isIgnoringComments();
        java.lang.Object obj86 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext87 = org.apache.commons.jxpath.JXPathContext.newContext(obj86);
        java.util.Locale locale88 = jXPathContext87.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer89 = jDOMPointerFactory77.createNodePointer(qName80, (java.lang.Object) dOMParser81, locale88);
        org.apache.commons.beanutils.DynaBean dynaBean90 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer91 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer74, qName80, dynaBean90);
        org.apache.commons.jxpath.Container container92 = null;
        java.util.Locale locale93 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer94 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container92, locale93);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator95 = containerPointer94.namespaceIterator();
        int int96 = containerPointer64.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer74, (org.apache.commons.jxpath.ri.model.NodePointer) containerPointer94);
        int int97 = namespacePointer60.compareChildNodePointers(nodePointer61, (org.apache.commons.jxpath.ri.model.NodePointer) containerPointer94);
        java.lang.Object obj98 = containerPointer94.clone();
        // The following exception was thrown during execution in test generation
        try {
            jDOMNamespacePointer2.setValue((java.lang.Object) containerPointer94);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot modify a namespace");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "node()");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 9 + "'", obj21, 9);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(nodeIterator40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(jXPathContext53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer55);
        org.junit.Assert.assertNull(nodeIterator65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(nodePointer69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(jXPathContext87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer89);
        org.junit.Assert.assertNull(nodeIterator95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(obj98);
        org.junit.Assert.assertEquals(obj98.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj98), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj98), "/");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = simpleCharStream42.getColumn();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        namespaceContext4.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = namespaceContext4.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext9 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, true, nodeTest8);
        int int10 = namespaceContext4.getPosition();
        boolean boolean12 = namespaceContext4.setPosition(71);
        org.apache.commons.jxpath.Container container14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer16 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container14, locale15);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = containerPointer16.namespaceIterator();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator17, locale18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName23 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser24 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean25 = dOMParser24.isIgnoringElementContentWhitespace();
        dOMParser24.setNamespaceAware(false);
        boolean boolean28 = dOMParser24.isIgnoringComments();
        java.lang.Object obj29 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = org.apache.commons.jxpath.JXPathContext.newContext(obj29);
        java.util.Locale locale31 = jXPathContext30.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = jDOMPointerFactory20.createNodePointer(qName23, (java.lang.Object) dOMParser24, locale31);
        org.apache.commons.beanutils.DynaBean dynaBean33 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer34 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19, qName23, dynaBean33);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer37 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer34, "JDOM", "=");
        boolean boolean38 = namespacePointer37.isCollection();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer41 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale39, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer42 = nullPointer41.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer42, "$null");
        org.apache.commons.jxpath.ri.QName qName45 = jDOMNamespacePointer44.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest46 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName45);
        boolean boolean47 = namespacePointer37.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext48 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number49 = org.apache.commons.jxpath.ri.InfoSetUtil.number((java.lang.Object) namespaceContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodeIterator17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(jXPathContext30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(propertyPointer42);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.jdom.Attribute attribute33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer8, attribute33);
        java.lang.Object obj35 = jDOMAttributePointer34.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer36, "");
        java.lang.Object obj39 = jDOMNamespacePointer38.getBaseValue();
        org.w3c.dom.Node node40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node40, locale41, "hi!");
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext46 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext44, nodeTest45);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext48 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext46, nodeTest47);
        namespaceContext48.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = namespaceContext48.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext53 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext48, true, nodeTest52);
        int int54 = namespaceContext48.getPosition();
        boolean boolean55 = dOMNodePointer43.equals((java.lang.Object) int54);
        int int56 = jDOMAttributePointer34.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer38, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer43);
        dOMNodePointer43.printPointerChain();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(nodePointer50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext2);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext7, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext11 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean13 = attributeContext9.setPosition(0);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer16.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer17, "$null");
        org.apache.commons.jxpath.ri.QName qName20 = jDOMNamespacePointer19.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName20);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext22 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = parentContext22.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] { parentContext22 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, evalContextArray24);
        int int26 = unionContext25.getDocumentOrder();
        int int27 = unionContext25.getDocumentOrder();
        org.apache.commons.jxpath.NodeSet nodeSet28 = unionContext25.getNodeSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = unionContext25.setPosition(18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNull(nodePointer23);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodeSet28);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer4 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, (java.lang.Object) (byte) -1, dynamicPropertyHandler2, locale3);
        java.lang.Object obj5 = dynamicPointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer8 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer4, "", "hi!");
        dynamicPointer4.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dynamicPointer4.namespaceIterator();
        dynamicPointer4.setIndex(0);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer16.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = propertyPointer17.namespaceIterator();
        org.w3c.dom.Node node19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node19, locale20, "hi!");
        boolean boolean23 = dOMNodePointer22.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = dOMNodePointer22.testNode(nodeTest24);
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean29 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext32 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext30, nodeTest31);
        boolean boolean34 = attributeContext32.setPosition(54);
        java.lang.Object obj35 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = org.apache.commons.jxpath.JXPathContext.newContext(obj35);
        java.util.Locale locale37 = jXPathContext36.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer38 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale37);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer39 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName28, dynaBean29, locale37);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer22, qName28);
        java.lang.Object obj41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = jDOMPointerFactory13.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer17, qName28, obj41);
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer45 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale43, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer46 = nullPointer45.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer48 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer46, "$null");
        org.apache.commons.jxpath.ri.QName qName49 = jDOMNamespacePointer48.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest50 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName49);
        org.apache.commons.jxpath.xml.DOMParser dOMParser51 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean52 = dOMParser51.isCoalescing();
        boolean boolean53 = dOMParser51.isIgnoringComments();
        org.apache.commons.jxpath.ri.EvalContext evalContext54 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext56 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext54, nodeTest55);
        boolean boolean58 = attributeContext56.setPosition(54);
        java.lang.Object obj59 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext60 = org.apache.commons.jxpath.JXPathContext.newContext(obj59);
        java.util.Locale locale61 = jXPathContext60.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer62 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale61);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = jDOMPointerFactory13.createNodePointer(qName49, (java.lang.Object) boolean53, locale61);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator64 = dynamicPointer4.attributeIterator(qName49);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(jXPathContext36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertNotNull(propertyPointer46);
        org.junit.Assert.assertNotNull(qName49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(jXPathContext60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer63);
        org.junit.Assert.assertNotNull(nodeIterator64);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        org.apache.commons.jxpath.ri.compiler.Constant constant8 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext9, nodeTest10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext13 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext11, nodeTest12);
        java.lang.Object obj14 = constant8.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest18 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        boolean boolean19 = nameAttributeTest18.computeContextDependent();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler20 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj21 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant23 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj24 = treeCompiler20.mod(obj21, (java.lang.Object) constant23);
        java.lang.Object obj25 = treeCompiler0.multiply((java.lang.Object) nameAttributeTest18, obj21);
        java.lang.Object obj27 = treeCompiler0.nodeTypeTest(20);
        java.lang.Object obj29 = treeCompiler0.literal("namespace::");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler30 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj31 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant33 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj34 = treeCompiler30.mod(obj31, (java.lang.Object) constant33);
        java.lang.Object obj36 = treeCompiler30.nodeTypeTest(1);
        org.apache.commons.jxpath.ri.compiler.Constant constant38 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext41 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext39, nodeTest40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext43 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext41, nodeTest42);
        java.lang.Object obj44 = constant38.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext43);
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual47 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression45, expression46);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest48 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant38, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual47);
        boolean boolean49 = nameAttributeTest48.computeContextDependent();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler50 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj51 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant53 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj54 = treeCompiler50.mod(obj51, (java.lang.Object) constant53);
        java.lang.Object obj55 = treeCompiler30.multiply((java.lang.Object) nameAttributeTest48, obj51);
        java.lang.Object obj57 = treeCompiler30.nodeTypeTest(20);
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer60 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale58, "UNKNOWN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = treeCompiler0.greaterThan((java.lang.Object) 20, (java.lang.Object) nullPointer60);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 9 + "'", obj14, 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "UNKNOWN()");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "'namespace::'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "'namespace::'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "'namespace::'");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "node()");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 9 + "'", obj44, 9);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "UNKNOWN()");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory dOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory();
        org.apache.commons.jxpath.Container container1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer3 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container1, locale2);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = containerPointer3.namespaceIterator();
        java.lang.String str6 = containerPointer3.getNamespaceURI("/");
        int int7 = containerPointer3.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = containerPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer13 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, (java.lang.Object) 100, jXPathBeanInfo11, locale12);
        boolean boolean14 = beanPointer13.isLeaf();
        int int15 = beanPointer13.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser20 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean21 = dOMParser20.isIgnoringElementContentWhitespace();
        dOMParser20.setNamespaceAware(false);
        boolean boolean24 = dOMParser20.isIgnoringComments();
        java.lang.Object obj25 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext(obj25);
        java.util.Locale locale27 = jXPathContext26.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMPointerFactory16.createNodePointer(qName19, (java.lang.Object) dOMParser20, locale27);
        org.apache.commons.beanutils.DynaBean dynaBean29 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer30 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer13, qName19, dynaBean29);
        org.apache.commons.jxpath.Container container31 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer33 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container31, locale32);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = containerPointer33.namespaceIterator();
        int int35 = containerPointer3.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer13, (org.apache.commons.jxpath.ri.model.NodePointer) containerPointer33);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory36 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale38, "hi!");
        java.lang.Object obj41 = jDOMNodePointer40.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer40.namespaceIterator();
        java.lang.Object obj43 = jDOMNodePointer40.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer45, "");
        boolean boolean48 = jDOMNamespacePointer47.isCollection();
        java.lang.Object obj49 = jDOMNamespacePointer47.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = containerPointerFactory36.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40, qName44, (java.lang.Object) jDOMNamespacePointer47);
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer53 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale51, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer54 = nullPointer53.getPropertyPointer();
        org.w3c.dom.Node node55 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer58 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node55, locale56, "hi!");
        boolean boolean59 = dOMNodePointer58.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        boolean boolean61 = dOMNodePointer58.testNode(nodeTest60);
        org.apache.commons.jxpath.ri.QName qName64 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean65 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext66 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext68 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext66, nodeTest67);
        boolean boolean70 = attributeContext68.setPosition(54);
        java.lang.Object obj71 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext72 = org.apache.commons.jxpath.JXPathContext.newContext(obj71);
        java.util.Locale locale73 = jXPathContext72.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer74 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale73);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer75 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName64, dynaBean65, locale73);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer58, qName64);
        java.lang.Object obj77 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer78 = containerPointerFactory36.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer53, qName64, obj77);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest79 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName64);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler81 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj83 = treeCompiler81.processingInstructionTest("/");
        java.lang.Object obj84 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler81);
        boolean boolean85 = qName64.equals((java.lang.Object) "$null");
        org.apache.commons.jxpath.xml.DOMParser dOMParser87 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean88 = dOMParser87.isIgnoringElementContentWhitespace();
        dOMParser87.setNamespaceAware(false);
        boolean boolean91 = dOMParser87.isValidating();
        org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser("namespace::", (org.apache.commons.jxpath.xml.XMLParser) dOMParser87);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer93 = dOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) containerPointer33, qName64, (java.lang.Object) dOMParser87);
        boolean boolean94 = containerPointer33.isContainer();
        org.junit.Assert.assertNull(nodeIterator4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer28);
        org.junit.Assert.assertNull(nodeIterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(nodePointer50);
        org.junit.Assert.assertNotNull(propertyPointer54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(jXPathContext72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer78);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals(obj84.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj84), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "$null");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(nodePointer93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean3 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext4, nodeTest5);
        boolean boolean8 = attributeContext6.setPosition(54);
        java.lang.Object obj9 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(obj9);
        java.util.Locale locale11 = jXPathContext10.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer12 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale11);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer13 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean3, locale11);
        java.lang.String str14 = dynaBeanPointer13.asPath();
        org.w3c.dom.Attr attr15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer13, attr15);
        boolean boolean17 = dOMAttributePointer16.isLeaf();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext20 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext18, nodeTest19);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext22 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext20, nodeTest21);
        boolean boolean24 = attributeContext20.setPosition(0);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer28 = nullPointer27.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer28, "$null");
        org.apache.commons.jxpath.ri.QName qName31 = jDOMNamespacePointer30.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest32 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName31);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext33 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext20, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        org.apache.commons.jxpath.ri.QName qName34 = nodeNameTest32.getNodeName();
        boolean boolean35 = dOMAttributePointer16.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        java.lang.String str36 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue((java.lang.Object) nodeNameTest32);
        org.apache.commons.jxpath.ri.QName qName37 = nodeNameTest32.getNodeName();
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer38 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName37);
        java.lang.String str39 = qName37.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(propertyPointer28);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "$null" + "'", str36, "$null");
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "$null" + "'", str39, "$null");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale3, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer6 = nullPointer5.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = propertyPointer6.namespaceIterator();
        org.w3c.dom.Node node8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node8, locale9, "hi!");
        boolean boolean12 = dOMNodePointer11.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        boolean boolean14 = dOMNodePointer11.testNode(nodeTest13);
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean18 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext21 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext19, nodeTest20);
        boolean boolean23 = attributeContext21.setPosition(54);
        java.lang.Object obj24 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = org.apache.commons.jxpath.JXPathContext.newContext(obj24);
        java.util.Locale locale26 = jXPathContext25.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer27 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale26);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer28 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName17, dynaBean18, locale26);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer11, qName17);
        java.lang.Object obj30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = jDOMPointerFactory2.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer6, qName17, obj30);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer34 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale32, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer35 = nullPointer34.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer35, "$null");
        org.apache.commons.jxpath.ri.QName qName38 = jDOMNamespacePointer37.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest39 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName38);
        org.apache.commons.jxpath.xml.DOMParser dOMParser40 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean41 = dOMParser40.isCoalescing();
        boolean boolean42 = dOMParser40.isIgnoringComments();
        org.apache.commons.jxpath.ri.EvalContext evalContext43 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext45 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext43, nodeTest44);
        boolean boolean47 = attributeContext45.setPosition(54);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer51 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale50);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = jDOMPointerFactory2.createNodePointer(qName38, (java.lang.Object) boolean42, locale50);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 58, locale50, "id('hi!')/namespace::http://www.w3.org/2000/xmlns/:id($null)");
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer55 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale50);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer55.setValue((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyPointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(jXPathContext25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer31);
        org.junit.Assert.assertNotNull(propertyPointer35);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer52);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory7 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale9, "hi!");
        java.lang.Object obj12 = jDOMNodePointer11.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator13 = jDOMNodePointer11.namespaceIterator();
        java.lang.Object obj14 = jDOMNodePointer11.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer16, "");
        boolean boolean19 = jDOMNamespacePointer18.isCollection();
        java.lang.Object obj20 = jDOMNamespacePointer18.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = containerPointerFactory7.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer11, qName15, (java.lang.Object) jDOMNamespacePointer18);
        org.apache.commons.jxpath.ri.QName qName24 = new org.apache.commons.jxpath.ri.QName("id('hi!')", "");
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext28 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext25, false, nodeTest27);
        boolean boolean29 = qName24.equals((java.lang.Object) false);
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext32 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext30, nodeTest31);
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext35 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext33, nodeTest34);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext37 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext35, nodeTest36);
        boolean boolean39 = attributeContext35.setPosition(0);
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer42 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale40, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer43 = nullPointer42.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer43, "$null");
        org.apache.commons.jxpath.ri.QName qName46 = jDOMNamespacePointer45.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest47 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName46);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext48 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext35, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest47);
        boolean boolean49 = nodeNameTest47.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext50 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext32, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest47);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName54 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser55 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean56 = dOMParser55.isIgnoringElementContentWhitespace();
        dOMParser55.setNamespaceAware(false);
        boolean boolean59 = dOMParser55.isIgnoringComments();
        java.lang.Object obj60 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext61 = org.apache.commons.jxpath.JXPathContext.newContext(obj60);
        java.util.Locale locale62 = jXPathContext61.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = jDOMPointerFactory51.createNodePointer(qName54, (java.lang.Object) dOMParser55, locale62);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer64 = containerPointerFactory7.createNodePointer(qName24, (java.lang.Object) selfContext50, locale62);
        org.w3c.dom.Node node65 = null;
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer68 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node65, locale66, "hi!");
        java.lang.Object obj69 = dOMNodePointer68.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer71 = dOMNodePointer68.namespacePointer("DOM");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer68, "http://www.w3.org/2000/xmlns/");
        java.lang.String str74 = jDOMNamespacePointer73.asPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = treeCompiler0.notEqual((java.lang.Object) qName24, (java.lang.Object) jDOMNamespacePointer73);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.QName cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(propertyPointer43);
        org.junit.Assert.assertNotNull(qName46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(jXPathContext61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer63);
        org.junit.Assert.assertNull(nodePointer64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(nodePointer71);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "id('hi!')/namespace::http://www.w3.org/2000/xmlns/" + "'", str74, "id('hi!')/namespace::http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "hi!");
        java.lang.String str6 = dOMNodePointer4.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext10, nodeTest11);
        java.util.List list13 = attributeContext12.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext12);
        boolean boolean15 = dOMNodePointer4.equals((java.lang.Object) attributeContext12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext12);
        org.jdom.Namespace namespace18 = null;
        java.lang.String str19 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute((java.lang.Object) valueIterator16, "'id('hi!')'", namespace18);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.jxpath.ri.compiler.Constant constant1 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext2 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext2, nodeTest3);
        java.util.List list5 = attributeContext4.getContextNodeList();
        java.util.Iterator iterator6 = constant1.iterate((org.apache.commons.jxpath.ri.EvalContext) attributeContext4);
        org.apache.commons.jxpath.Container container7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer9 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container7, locale8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = containerPointer9.namespaceIterator();
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator10, locale11);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser17 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean18 = dOMParser17.isIgnoringElementContentWhitespace();
        dOMParser17.setNamespaceAware(false);
        boolean boolean21 = dOMParser17.isIgnoringComments();
        java.lang.Object obj22 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = org.apache.commons.jxpath.JXPathContext.newContext(obj22);
        java.util.Locale locale24 = jXPathContext23.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = jDOMPointerFactory13.createNodePointer(qName16, (java.lang.Object) dOMParser17, locale24);
        org.apache.commons.beanutils.DynaBean dynaBean26 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer27 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, qName16, dynaBean26);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer30 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer27, "JDOM", "=");
        boolean boolean31 = namespacePointer30.isCollection();
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer34 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale32, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer35 = nullPointer34.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer35, "$null");
        org.apache.commons.jxpath.ri.QName qName38 = jDOMNamespacePointer37.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest39 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName38);
        boolean boolean40 = namespacePointer30.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext41 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(jXPathContext23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(propertyPointer35);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer1 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName0);
        variablePointer1.remove();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator3, locale4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser10 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean11 = dOMParser10.isIgnoringElementContentWhitespace();
        dOMParser10.setNamespaceAware(false);
        boolean boolean14 = dOMParser10.isIgnoringComments();
        java.lang.Object obj15 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext(obj15);
        java.util.Locale locale17 = jXPathContext16.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = jDOMPointerFactory6.createNodePointer(qName9, (java.lang.Object) dOMParser10, locale17);
        org.apache.commons.beanutils.DynaBean dynaBean19 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, qName9, dynaBean19);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer23 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer20, "JDOM", "=");
        boolean boolean24 = namespacePointer23.isCollection();
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer28 = nullPointer27.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer28, "$null");
        org.apache.commons.jxpath.ri.QName qName31 = jDOMNamespacePointer30.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest32 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName31);
        boolean boolean33 = namespacePointer23.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        boolean boolean34 = namespacePointer23.isCollection();
        boolean boolean35 = namespacePointer23.isActual();
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(propertyPointer28);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory0 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale2, "hi!");
        java.lang.Object obj5 = jDOMNodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator6 = jDOMNodePointer4.namespaceIterator();
        java.lang.Object obj7 = jDOMNodePointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer9, "");
        boolean boolean12 = jDOMNamespacePointer11.isCollection();
        java.lang.Object obj13 = jDOMNamespacePointer11.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = containerPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer4, qName8, (java.lang.Object) jDOMNamespacePointer11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer4.namespacePointer("/@null");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer16);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver1 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver0);
        org.apache.commons.jxpath.Pointer pointer2 = namespaceResolver1.getNamespaceContextPointer();
        java.lang.Object obj3 = namespaceResolver1.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver1);
        java.lang.String str5 = namespaceResolver4.getDefaultNamespaceURI();
        org.junit.Assert.assertNull(pointer2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = collectionPointer8.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName34 = collectionPointer8.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(nodeIterator33);
        org.junit.Assert.assertNull(qName34);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj2 = treeCompiler0.processingInstructionTest("/");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver4);
        java.lang.Object obj6 = namespaceResolver5.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver7 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver5);
        org.apache.commons.jxpath.util.ValueUtils.setValue((java.lang.Object) treeCompiler0, 34, (java.lang.Object) namespaceResolver5);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator3, locale4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser10 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean11 = dOMParser10.isIgnoringElementContentWhitespace();
        dOMParser10.setNamespaceAware(false);
        boolean boolean14 = dOMParser10.isIgnoringComments();
        java.lang.Object obj15 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext(obj15);
        java.util.Locale locale17 = jXPathContext16.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = jDOMPointerFactory6.createNodePointer(qName9, (java.lang.Object) dOMParser10, locale17);
        org.apache.commons.beanutils.DynaBean dynaBean19 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, qName9, dynaBean19);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer23 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer20, "JDOM", "=");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = null;
        org.apache.commons.jxpath.Container container25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer27 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container25, locale26);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = containerPointer27.namespaceIterator();
        java.lang.String str30 = containerPointer27.getNamespaceURI("/");
        int int31 = containerPointer27.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = containerPointer27.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName33 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer37 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName33, (java.lang.Object) 100, jXPathBeanInfo35, locale36);
        boolean boolean38 = beanPointer37.isLeaf();
        int int39 = beanPointer37.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName43 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser44 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean45 = dOMParser44.isIgnoringElementContentWhitespace();
        dOMParser44.setNamespaceAware(false);
        boolean boolean48 = dOMParser44.isIgnoringComments();
        java.lang.Object obj49 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = org.apache.commons.jxpath.JXPathContext.newContext(obj49);
        java.util.Locale locale51 = jXPathContext50.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = jDOMPointerFactory40.createNodePointer(qName43, (java.lang.Object) dOMParser44, locale51);
        org.apache.commons.beanutils.DynaBean dynaBean53 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer54 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer37, qName43, dynaBean53);
        org.apache.commons.jxpath.Container container55 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer57 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container55, locale56);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = containerPointer57.namespaceIterator();
        int int59 = containerPointer27.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer37, (org.apache.commons.jxpath.ri.model.NodePointer) containerPointer57);
        int int60 = namespacePointer23.compareChildNodePointers(nodePointer24, (org.apache.commons.jxpath.ri.model.NodePointer) containerPointer57);
        java.lang.Object obj61 = namespacePointer23.getImmediateNode();
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertNull(nodeIterator28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(jXPathContext50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer52);
        org.junit.Assert.assertNull(nodeIterator58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "=" + "'", obj61, "=");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext2);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext7, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext11 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean13 = attributeContext9.setPosition(0);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer16.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer17, "$null");
        org.apache.commons.jxpath.ri.QName qName20 = jDOMNamespacePointer19.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName20);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext22 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = parentContext22.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] { parentContext22 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, evalContextArray24);
        int int26 = unionContext25.getDocumentOrder();
        int int27 = unionContext25.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext30 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) unionContext25, nodeTest28, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = unionContext25.nextNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNull(nodePointer23);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = org.apache.commons.jxpath.JXPathContext.newContext(obj8);
        java.util.Locale locale10 = jXPathContext9.getLocale();
        org.w3c.dom.Node node11 = null;
        java.lang.Object obj12 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = org.apache.commons.jxpath.JXPathContext.newContext(obj12);
        java.lang.Object obj14 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = org.apache.commons.jxpath.JXPathContext.newContext(obj14);
        java.util.Locale locale16 = jXPathContext15.getLocale();
        jXPathContext13.setLocale(locale16);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale16);
        int int19 = org.apache.commons.jxpath.util.ValueUtils.getLength((java.lang.Object) locale16);
        jXPathContext9.setLocale(locale16);
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext23 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext21, nodeTest22);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext25 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext23, nodeTest24);
        namespaceContext25.reset();
        java.lang.Object[] objArray27 = new java.lang.Object[] { jXPathContext9, namespaceContext25 };
        org.apache.commons.jxpath.ri.compiler.Constant constant29 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext32 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext30, nodeTest31);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext34 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext32, nodeTest33);
        java.lang.Object obj35 = constant29.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext34);
        org.apache.commons.jxpath.ri.compiler.Expression expression36 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression37 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual38 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression36, expression37);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest39 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant29, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual38);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray40 = coreOperationEqual38.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray41 = coreOperationEqual38.getArguments();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = treeCompiler0.expressionPath(obj7, objArray27, (java.lang.Object[]) expressionArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.JXPathContextReferenceImpl cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(jXPathContext9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(jXPathContext13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jXPathContext15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 9 + "'", obj35, 9);
        org.junit.Assert.assertNotNull(expressionArray40);
        org.junit.Assert.assertNotNull(expressionArray41);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory dynamicPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory();
        int int1 = dynamicPointerFactory0.getOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer2, "");
        boolean boolean5 = jDOMNamespacePointer4.isCollection();
        org.apache.commons.jxpath.ri.QName qName6 = jDOMNamespacePointer4.getName();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) jDOMNamespacePointer4);
        org.apache.commons.jxpath.ri.QName qName8 = jDOMNamespacePointer4.getName();
        org.apache.commons.jxpath.ri.QName qName9 = jDOMNamespacePointer4.getName();
        java.io.Reader reader10 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream11 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader10);
        int int12 = simpleCharStream11.bufpos;
        org.w3c.dom.Node node13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node13, locale14, "hi!");
        boolean boolean17 = dOMNodePointer16.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = dOMNodePointer16.testNode(nodeTest18);
        org.apache.commons.jxpath.ri.QName qName22 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean23 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext26 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext24, nodeTest25);
        boolean boolean28 = attributeContext26.setPosition(54);
        java.lang.Object obj29 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = org.apache.commons.jxpath.JXPathContext.newContext(obj29);
        java.util.Locale locale31 = jXPathContext30.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer32 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale31);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer33 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName22, dynaBean23, locale31);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer16, qName22);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer37 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale35, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = nullPointer37.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer42 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale40, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer43 = nullPointer42.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = propertyPointer43.namespaceIterator();
        org.w3c.dom.Node node45 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer48 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale46, "hi!");
        boolean boolean49 = dOMNodePointer48.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        boolean boolean51 = dOMNodePointer48.testNode(nodeTest50);
        org.apache.commons.jxpath.ri.QName qName54 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean55 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext56 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext58 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext56, nodeTest57);
        boolean boolean60 = attributeContext58.setPosition(54);
        java.lang.Object obj61 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext62 = org.apache.commons.jxpath.JXPathContext.newContext(obj61);
        java.util.Locale locale63 = jXPathContext62.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer64 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale63);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer65 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName54, dynaBean55, locale63);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer48, qName54);
        java.lang.Object obj67 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = jDOMPointerFactory39.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer43, qName54, obj67);
        org.apache.commons.jxpath.JXPathException jXPathException70 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler71 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer72 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer38, qName54, (java.lang.Object) jXPathException70, dynamicPropertyHandler71);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo73 = null;
        java.lang.Object obj74 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory75 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName78 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser79 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean80 = dOMParser79.isIgnoringElementContentWhitespace();
        dOMParser79.setNamespaceAware(false);
        boolean boolean83 = dOMParser79.isIgnoringComments();
        java.lang.Object obj84 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext85 = org.apache.commons.jxpath.JXPathContext.newContext(obj84);
        java.util.Locale locale86 = jXPathContext85.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer87 = jDOMPointerFactory75.createNodePointer(qName78, (java.lang.Object) dOMParser79, locale86);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer89 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj74, locale86, "Empty expression context");
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer90 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName22, (java.lang.Object) nodePointer38, jXPathBeanInfo73, locale86);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer91 = dynamicPointerFactory0.createNodePointer(qName9, (java.lang.Object) int12, locale86);
        int int92 = dynamicPointerFactory0.getOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 800 + "'", int1 == 800);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(qName8);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(jXPathContext30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(propertyPointer43);
        org.junit.Assert.assertNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(jXPathContext62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer68);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(jXPathContext85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer87);
        org.junit.Assert.assertNull(nodePointer91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 800 + "'", int92 == 800);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = containerPointer2.childIterator(nodeTest4, true, nodePointer6);
        boolean boolean9 = containerPointer2.equals((java.lang.Object) "http://www.w3.org/XML/1998/namespace");
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.Object obj5 = jDOMNodePointer3.getNodeValue();
        jDOMNodePointer3.printPointerChain();
        boolean boolean7 = jDOMNodePointer3.isLeaf();
        org.jdom.Attribute attribute8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, attribute8);
        boolean boolean10 = jDOMAttributePointer9.isLeaf();
        // The following exception was thrown during execution in test generation
        try {
            jDOMAttributePointer9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = containerPointer2.childIterator(nodeTest4, true, nodePointer6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = containerPointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext10, nodeTest11);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext13, nodeTest14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext17 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext15, nodeTest16);
        boolean boolean19 = attributeContext15.setPosition(0);
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer22 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale20, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer23 = nullPointer22.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer23, "$null");
        org.apache.commons.jxpath.ri.QName qName26 = jDOMNamespacePointer25.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest27 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName26);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext28 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext15, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest27);
        boolean boolean29 = nodeNameTest27.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext30 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext12, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest27);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext31 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext9, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest27);
        boolean boolean32 = containerPointer2.equals((java.lang.Object) nodeNameTest27);
        java.lang.String str33 = containerPointer2.asPath();
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(propertyPointer23);
        org.junit.Assert.assertNotNull(qName26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/" + "'", str33, "/");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory dOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory();
        org.apache.commons.jxpath.Container container1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer3 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container1, locale2);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = containerPointer3.namespaceIterator();
        java.lang.String str6 = containerPointer3.getNamespaceURI("/");
        int int7 = containerPointer3.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = containerPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer13 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, (java.lang.Object) 100, jXPathBeanInfo11, locale12);
        boolean boolean14 = beanPointer13.isLeaf();
        int int15 = beanPointer13.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser20 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean21 = dOMParser20.isIgnoringElementContentWhitespace();
        dOMParser20.setNamespaceAware(false);
        boolean boolean24 = dOMParser20.isIgnoringComments();
        java.lang.Object obj25 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext(obj25);
        java.util.Locale locale27 = jXPathContext26.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMPointerFactory16.createNodePointer(qName19, (java.lang.Object) dOMParser20, locale27);
        org.apache.commons.beanutils.DynaBean dynaBean29 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer30 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer13, qName19, dynaBean29);
        org.apache.commons.jxpath.Container container31 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer33 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container31, locale32);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = containerPointer33.namespaceIterator();
        int int35 = containerPointer3.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer13, (org.apache.commons.jxpath.ri.model.NodePointer) containerPointer33);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory36 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale38, "hi!");
        java.lang.Object obj41 = jDOMNodePointer40.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer40.namespaceIterator();
        java.lang.Object obj43 = jDOMNodePointer40.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer45, "");
        boolean boolean48 = jDOMNamespacePointer47.isCollection();
        java.lang.Object obj49 = jDOMNamespacePointer47.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = containerPointerFactory36.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40, qName44, (java.lang.Object) jDOMNamespacePointer47);
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer53 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale51, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer54 = nullPointer53.getPropertyPointer();
        org.w3c.dom.Node node55 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer58 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node55, locale56, "hi!");
        boolean boolean59 = dOMNodePointer58.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        boolean boolean61 = dOMNodePointer58.testNode(nodeTest60);
        org.apache.commons.jxpath.ri.QName qName64 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean65 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext66 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext68 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext66, nodeTest67);
        boolean boolean70 = attributeContext68.setPosition(54);
        java.lang.Object obj71 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext72 = org.apache.commons.jxpath.JXPathContext.newContext(obj71);
        java.util.Locale locale73 = jXPathContext72.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer74 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale73);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer75 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName64, dynaBean65, locale73);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer58, qName64);
        java.lang.Object obj77 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer78 = containerPointerFactory36.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer53, qName64, obj77);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest79 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName64);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler81 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj83 = treeCompiler81.processingInstructionTest("/");
        java.lang.Object obj84 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler81);
        boolean boolean85 = qName64.equals((java.lang.Object) "$null");
        org.apache.commons.jxpath.xml.DOMParser dOMParser87 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean88 = dOMParser87.isIgnoringElementContentWhitespace();
        dOMParser87.setNamespaceAware(false);
        boolean boolean91 = dOMParser87.isValidating();
        org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser("namespace::", (org.apache.commons.jxpath.xml.XMLParser) dOMParser87);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer93 = dOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) containerPointer33, qName64, (java.lang.Object) dOMParser87);
        boolean boolean94 = dOMParser87.isValidating();
        org.junit.Assert.assertNull(nodeIterator4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer28);
        org.junit.Assert.assertNull(nodeIterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(nodePointer50);
        org.junit.Assert.assertNotNull(propertyPointer54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(jXPathContext72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer78);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals(obj84.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj84), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "$null");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(nodePointer93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.jxpath.CompiledExpression compiledExpression1 = org.apache.commons.jxpath.JXPathContext.compile("DOM");
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext4, nodeTest5);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext8 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext6, nodeTest7);
        java.lang.Object obj9 = constant3.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext8);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext12 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext10, nodeTest11);
        java.lang.Object obj13 = constant3.computeValue(evalContext10);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = org.apache.commons.jxpath.JXPathContext.newContext(obj13);
        org.apache.commons.jxpath.AbstractFactory abstractFactory15 = jXPathContext14.getFactory();
        compiledExpression1.removeAll(jXPathContext14);
        java.text.DecimalFormatSymbols decimalFormatSymbols18 = null;
        jXPathContext14.setDecimalFormatSymbols("<<unknown namespace>>", decimalFormatSymbols18);
        // The following exception was thrown during execution in test generation
        try {
            jXPathContext14.removeAll("/");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove an object that is not some other object's property or a collection element");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compiledExpression1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 9 + "'", obj9, 9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 9 + "'", obj13, 9);
        org.junit.Assert.assertNotNull(jXPathContext14);
        org.junit.Assert.assertNull(abstractFactory15);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer3.namespacePointer("DOM");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer10 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, ":<<unknown namespace>>");
        java.lang.String str11 = namespacePointer10.asPath();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer16 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName12, (java.lang.Object) (byte) -1, dynamicPropertyHandler14, locale15);
        org.apache.commons.jxpath.ri.QName qName17 = dynamicPointer16.getName();
        boolean boolean18 = dynamicPointer16.isContainer();
        org.w3c.dom.Node node19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node19, locale20, "hi!");
        java.lang.Object obj23 = dOMNodePointer22.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = dOMNodePointer22.namespacePointer("DOM");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer22, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer29 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer22, ":<<unknown namespace>>");
        java.lang.String str30 = namespacePointer29.getNamespaceURI();
        int int31 = namespacePointer10.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer16, (org.apache.commons.jxpath.ri.model.NodePointer) namespacePointer29);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer32 = dynamicPointer16.getPropertyPointer();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "id('hi!')/namespace:::<<unknown namespace>>" + "'", str11, "id('hi!')/namespace:::<<unknown namespace>>");
        org.junit.Assert.assertNull(qName17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(propertyPointer32);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        boolean boolean6 = attributeContext2.setPosition(0);
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale7, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer10 = nullPointer9.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer10, "$null");
        org.apache.commons.jxpath.ri.QName qName13 = jDOMNamespacePointer12.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName13);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext15 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14);
        int int16 = parentContext15.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = parentContext15.nextNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(propertyPointer10);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        org.apache.commons.jxpath.ri.compiler.Constant constant67 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        boolean boolean68 = constant67.computeContextDependent();
        boolean boolean69 = constant67.isContextDependent();
        org.apache.commons.jxpath.Pointer pointer70 = jXPathContextReferenceImpl62.getPointer("$:<<unknown namespace>>", (org.apache.commons.jxpath.ri.compiler.Expression) constant67);
        org.apache.commons.jxpath.Pointer pointer71 = jXPathContextReferenceImpl62.getContextPointer();
        jXPathContextReferenceImpl62.registerNamespace("", "id('hi!')/namespace::http://www.w3.org/2000/xmlns/:id($null)");
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointer70);
        org.junit.Assert.assertNotNull(pointer71);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0);
        int int2 = simpleCharStream1.bufpos;
        java.lang.String str3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) simpleCharStream1);
        int int4 = simpleCharStream1.getBeginColumn();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = simpleCharStream1.getColumn();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        boolean boolean6 = dOMNodePointer3.testNode(nodeTest5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean10 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName9, dynaBean10, locale18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName9);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale22, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nullPointer24.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer29 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale27, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer30 = nullPointer29.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = propertyPointer30.namespaceIterator();
        org.w3c.dom.Node node32 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer35 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node32, locale33, "hi!");
        boolean boolean36 = dOMNodePointer35.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        boolean boolean38 = dOMNodePointer35.testNode(nodeTest37);
        org.apache.commons.jxpath.ri.QName qName41 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean42 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext43 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext45 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext43, nodeTest44);
        boolean boolean47 = attributeContext45.setPosition(54);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer51 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale50);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer52 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName41, dynaBean42, locale50);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer35, qName41);
        java.lang.Object obj54 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = jDOMPointerFactory26.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer30, qName41, obj54);
        org.apache.commons.jxpath.JXPathException jXPathException57 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler58 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer59 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer25, qName41, (java.lang.Object) jXPathException57, dynamicPropertyHandler58);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo60 = null;
        java.lang.Object obj61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName65 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser66 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean67 = dOMParser66.isIgnoringElementContentWhitespace();
        dOMParser66.setNamespaceAware(false);
        boolean boolean70 = dOMParser66.isIgnoringComments();
        java.lang.Object obj71 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext72 = org.apache.commons.jxpath.JXPathContext.newContext(obj71);
        java.util.Locale locale73 = jXPathContext72.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = jDOMPointerFactory62.createNodePointer(qName65, (java.lang.Object) dOMParser66, locale73);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj61, locale73, "Empty expression context");
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer77 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, (java.lang.Object) nodePointer25, jXPathBeanInfo60, locale73);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer79 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale73, "http://www.w3.org/XML/1998/namespace");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(propertyPointer30);
        org.junit.Assert.assertNull(nodeIterator31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer55);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(jXPathContext72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer74);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "hi!");
        boolean boolean5 = dOMNodePointer4.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = dOMNodePointer4.testNode(nodeTest6);
        org.apache.commons.jxpath.ri.QName qName10 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean11 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext12, nodeTest13);
        boolean boolean16 = attributeContext14.setPosition(54);
        java.lang.Object obj17 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = org.apache.commons.jxpath.JXPathContext.newContext(obj17);
        java.util.Locale locale19 = jXPathContext18.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer20 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale19);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer21 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName10, dynaBean11, locale19);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName10);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler24 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj26 = treeCompiler24.processingInstructionTest("/");
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler24);
        java.lang.Object obj29 = treeCompiler24.literal("/:<<unknown namespace>>/namespace::JDOM");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer33 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale31, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = nullPointer33.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer38 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale36, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer39 = nullPointer38.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = propertyPointer39.namespaceIterator();
        org.w3c.dom.Node node41 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer44 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node41, locale42, "hi!");
        boolean boolean45 = dOMNodePointer44.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest46 = null;
        boolean boolean47 = dOMNodePointer44.testNode(nodeTest46);
        org.apache.commons.jxpath.ri.QName qName50 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean51 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext52 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext54 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext52, nodeTest53);
        boolean boolean56 = attributeContext54.setPosition(54);
        java.lang.Object obj57 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext58 = org.apache.commons.jxpath.JXPathContext.newContext(obj57);
        java.util.Locale locale59 = jXPathContext58.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer60 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale59);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer61 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName50, dynaBean51, locale59);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer44, qName50);
        java.lang.Object obj63 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer64 = jDOMPointerFactory35.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer39, qName50, obj63);
        org.apache.commons.jxpath.JXPathException jXPathException66 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler67 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer68 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer34, qName50, (java.lang.Object) jXPathException66, dynamicPropertyHandler67);
        java.io.Reader reader69 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream72 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader69, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager73 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream72);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo74 = null;
        org.w3c.dom.Node node75 = null;
        java.lang.Object obj76 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext77 = org.apache.commons.jxpath.JXPathContext.newContext(obj76);
        java.lang.Object obj78 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext79 = org.apache.commons.jxpath.JXPathContext.newContext(obj78);
        java.util.Locale locale80 = jXPathContext79.getLocale();
        jXPathContext77.setLocale(locale80);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer82 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node75, locale80);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer83 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName50, (java.lang.Object) simpleCharStream72, jXPathBeanInfo74, locale80);
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer84 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName10, (java.lang.Object) treeCompiler24, dynamicPropertyHandler30, locale80);
        org.apache.commons.jxpath.ri.EvalContext evalContext85 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest86 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext87 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext85, nodeTest86);
        java.util.List list88 = attributeContext87.getContextNodeList();
        java.util.List list89 = attributeContext87.getContextNodeList();
        boolean boolean90 = attributeContext87.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer91 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName10, (java.lang.Object) boolean90);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(jXPathContext18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "$null");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(propertyPointer39);
        org.junit.Assert.assertNull(nodeIterator40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(jXPathContext58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer64);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(jXPathContext77);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(jXPathContext79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(list89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(nodePointer91);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        org.apache.commons.jxpath.ri.compiler.Constant constant67 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        boolean boolean68 = constant67.computeContextDependent();
        boolean boolean69 = constant67.isContextDependent();
        org.apache.commons.jxpath.Pointer pointer70 = jXPathContextReferenceImpl62.getPointer("$:<<unknown namespace>>", (org.apache.commons.jxpath.ri.compiler.Expression) constant67);
        org.apache.commons.jxpath.Pointer pointer71 = jXPathContextReferenceImpl62.getContextPointer();
        java.lang.Object obj72 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext73 = org.apache.commons.jxpath.JXPathContext.newContext(obj72);
        java.text.DecimalFormatSymbols decimalFormatSymbols75 = null;
        jXPathContext73.setDecimalFormatSymbols("id($null)", decimalFormatSymbols75);
        org.apache.commons.jxpath.Pointer pointer77 = jXPathContext73.getContextPointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext78 = jXPathContextReferenceImpl62.getRelativeContext(pointer77);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointer70);
        org.junit.Assert.assertNotNull(pointer71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(jXPathContext73);
        org.junit.Assert.assertNotNull(pointer77);
        org.junit.Assert.assertNotNull(jXPathContext78);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.jxpath.xml.DOMParser dOMParser0 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean1 = dOMParser0.isCoalescing();
        boolean boolean2 = dOMParser0.isIgnoringComments();
        boolean boolean3 = dOMParser0.isNamespaceAware();
        dOMParser0.setIgnoringComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        namespaceContext4.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = namespaceContext4.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext9 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, true, nodeTest8);
        int int10 = namespaceContext4.getPosition();
        boolean boolean12 = namespaceContext4.setPosition(71);
        org.apache.commons.jxpath.Container container14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer16 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container14, locale15);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = containerPointer16.namespaceIterator();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator17, locale18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName23 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser24 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean25 = dOMParser24.isIgnoringElementContentWhitespace();
        dOMParser24.setNamespaceAware(false);
        boolean boolean28 = dOMParser24.isIgnoringComments();
        java.lang.Object obj29 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = org.apache.commons.jxpath.JXPathContext.newContext(obj29);
        java.util.Locale locale31 = jXPathContext30.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = jDOMPointerFactory20.createNodePointer(qName23, (java.lang.Object) dOMParser24, locale31);
        org.apache.commons.beanutils.DynaBean dynaBean33 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer34 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19, qName23, dynaBean33);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer37 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer34, "JDOM", "=");
        boolean boolean38 = namespacePointer37.isCollection();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer41 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale39, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer42 = nullPointer41.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer42, "$null");
        org.apache.commons.jxpath.ri.QName qName45 = jDOMNamespacePointer44.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest46 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName45);
        boolean boolean47 = namespacePointer37.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext48 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        boolean boolean49 = descendantContext48.isChildOrderingRequired();
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodeIterator17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(jXPathContext30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(propertyPointer42);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer4 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, (java.lang.Object) (byte) -1, dynamicPropertyHandler2, locale3);
        org.apache.commons.jxpath.ri.QName qName5 = dynamicPointer4.getName();
        java.lang.Object obj6 = null;
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer7 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer4, obj6);
        org.junit.Assert.assertNull(qName5);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer4 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName0, (java.lang.Object) 100, jXPathBeanInfo2, locale3);
        boolean boolean5 = beanPointer4.isLeaf();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer6 = beanPointer4.getPropertyPointer();
        java.lang.String str7 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue((java.lang.Object) beanPointer4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer12 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale10, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer13 = nullPointer12.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = propertyPointer13.namespaceIterator();
        org.w3c.dom.Node node15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node15, locale16, "hi!");
        boolean boolean19 = dOMNodePointer18.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = dOMNodePointer18.testNode(nodeTest20);
        org.apache.commons.jxpath.ri.QName qName24 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean25 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext28 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext26, nodeTest27);
        boolean boolean30 = attributeContext28.setPosition(54);
        java.lang.Object obj31 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = org.apache.commons.jxpath.JXPathContext.newContext(obj31);
        java.util.Locale locale33 = jXPathContext32.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer34 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale33);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer35 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName24, dynaBean25, locale33);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer18, qName24);
        java.lang.Object obj37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = jDOMPointerFactory9.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer13, qName24, obj37);
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer41 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale39, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer42 = nullPointer41.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer42, "$null");
        org.apache.commons.jxpath.ri.QName qName45 = jDOMNamespacePointer44.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest46 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName45);
        org.apache.commons.jxpath.xml.DOMParser dOMParser47 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean48 = dOMParser47.isCoalescing();
        boolean boolean49 = dOMParser47.isIgnoringComments();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext52 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext50, nodeTest51);
        boolean boolean54 = attributeContext52.setPosition(54);
        java.lang.Object obj55 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext56 = org.apache.commons.jxpath.JXPathContext.newContext(obj55);
        java.util.Locale locale57 = jXPathContext56.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer58 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale57);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = jDOMPointerFactory9.createNodePointer(qName45, (java.lang.Object) boolean49, locale57);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 58, locale57, "id('hi!')/namespace::http://www.w3.org/2000/xmlns/:id($null)");
        // The following exception was thrown during execution in test generation
        try {
            beanPointer4.setValue((java.lang.Object) "id('hi!')/namespace::http://www.w3.org/2000/xmlns/:id($null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(propertyPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertNotNull(propertyPointer13);
        org.junit.Assert.assertNull(nodeIterator14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(jXPathContext32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer38);
        org.junit.Assert.assertNotNull(propertyPointer42);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(jXPathContext56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer59);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer3.namespacePointer("DOM");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer10 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, ":<<unknown namespace>>");
        java.lang.String str11 = namespacePointer10.getNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = namespacePointer10.namespacePointer("100");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.lang.Object obj0 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext(obj0);
        java.lang.Object obj2 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext3 = org.apache.commons.jxpath.JXPathContext.newContext(obj2);
        java.util.Locale locale4 = jXPathContext3.getLocale();
        jXPathContext1.setLocale(locale4);
        jXPathContext1.setLenient(true);
        jXPathContext1.registerNamespace("9", "$:<<unknown namespace>>");
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(jXPathContext3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "hi!");
        java.lang.String str6 = dOMNodePointer4.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext10, nodeTest11);
        java.util.List list13 = attributeContext12.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext12);
        boolean boolean15 = dOMNodePointer4.equals((java.lang.Object) attributeContext12);
        java.lang.Object obj16 = dOMNodePointer4.clone();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, "DOM", "=");
        java.lang.Object obj20 = dOMNodePointer4.getBaseValue();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "id('hi!')");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext2);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray2 = null;
        java.lang.Object obj3 = treeCompiler0.function(18, objArray2);
        java.lang.Object obj5 = treeCompiler0.literal("id($null)");
        java.lang.Object obj7 = treeCompiler0.nodeTypeTest(63);
        java.lang.Object obj9 = treeCompiler0.literal("id('hi!')/namespace::http://www.w3.org/2000/xmlns/");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "boolean()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "boolean()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "boolean()");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "'id($null)'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "'id($null)'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "'id($null)'");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "UNKNOWN()");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "'id('hi!')/namespace::http://www.w3.org/2000/xmlns/'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "'id('hi!')/namespace::http://www.w3.org/2000/xmlns/'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "'id('hi!')/namespace::http://www.w3.org/2000/xmlns/'");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer3.namespacePointer("DOM");
        boolean boolean7 = dOMNodePointer3.isNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dOMNodePointer3.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest2 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext3 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext1, nodeTest2);
        java.util.List list4 = attributeContext3.getContextNodeList();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, "$null");
        org.apache.commons.jxpath.ri.QName qName12 = jDOMNamespacePointer11.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext14 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext3, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNotNull(qName12);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.jxpath.ri.compiler.Constant constant1 = new org.apache.commons.jxpath.ri.compiler.Constant("id('hi!')");
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray3 = new org.apache.commons.jxpath.ri.compiler.Step[] {};
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath4 = new org.apache.commons.jxpath.ri.compiler.LocationPath(true, stepArray3);
        boolean boolean5 = locationPath4.isAbsolute();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual((org.apache.commons.jxpath.ri.compiler.Expression) constant1, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath4);
        boolean boolean7 = locationPath4.computeContextDependent();
        org.junit.Assert.assertNotNull(stepArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        java.lang.Object obj8 = treeCompiler0.processingInstructionTest("$null");
        java.lang.Object obj10 = treeCompiler0.nodeTypeTest(63);
        org.apache.commons.jxpath.ri.compiler.Constant constant12 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext13, nodeTest14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext17 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext15, nodeTest16);
        java.lang.Object obj18 = constant12.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext17);
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression19, expression20);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest22 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant12, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual21);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray23 = coreOperationEqual21.getArguments();
        java.lang.Object obj24 = treeCompiler0.and((java.lang.Object[]) expressionArray23);
        java.lang.Object obj26 = treeCompiler0.processingInstructionTest("UNKNOWN");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "processing-instruction('$null')");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "UNKNOWN()");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 9 + "'", obj18, 9);
        org.junit.Assert.assertNotNull(expressionArray23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "processing-instruction('UNKNOWN')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "processing-instruction('UNKNOWN')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "processing-instruction('UNKNOWN')");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean3 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext4, nodeTest5);
        boolean boolean8 = attributeContext6.setPosition(54);
        java.lang.Object obj9 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(obj9);
        java.util.Locale locale11 = jXPathContext10.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer12 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale11);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer13 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean3, locale11);
        java.lang.String str14 = dynaBeanPointer13.asPath();
        org.w3c.dom.Attr attr15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer13, attr15);
        boolean boolean17 = dOMAttributePointer16.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer18, "");
        boolean boolean21 = jDOMNamespacePointer20.isCollection();
        org.apache.commons.jxpath.ri.QName qName22 = jDOMNamespacePointer20.getName();
        int int23 = jDOMNamespacePointer20.getLength();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer26 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale24, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer27 = nullPointer26.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer27, "$null");
        org.apache.commons.jxpath.ri.QName qName30 = jDOMNamespacePointer29.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest31 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName30);
        org.apache.commons.jxpath.ri.compiler.Constant constant33 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext36 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext34, nodeTest35);
        boolean boolean38 = attributeContext36.setPosition(54);
        java.lang.Object obj39 = constant33.computeValue((org.apache.commons.jxpath.ri.EvalContext) attributeContext36);
        boolean boolean41 = attributeContext36.setPosition(10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer20, qName30, (java.lang.Object) boolean41);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMAttributePointer16, qName30);
        boolean boolean44 = dOMAttributePointer16.isActual();
        boolean boolean45 = dOMAttributePointer16.isCollection();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver46 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver47 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver46);
        boolean boolean48 = namespaceResolver47.isSealed();
        boolean boolean49 = namespaceResolver47.isSealed();
        namespaceResolver47.registerNamespace("id('hi!')/namespace:::<<unknown namespace>>", "id('hi!')/namespace::http://www.w3.org/2000/xmlns/:id($null)");
        dOMAttributePointer16.setNamespaceResolver(namespaceResolver47);
        int int54 = dOMAttributePointer16.getLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = dOMAttributePointer16.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(qName22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(propertyPointer27);
        org.junit.Assert.assertNotNull(qName30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 9 + "'", obj39, 9);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "hi!");
        java.lang.String str6 = dOMNodePointer4.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext10, nodeTest11);
        java.util.List list13 = attributeContext12.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext12);
        boolean boolean15 = dOMNodePointer4.equals((java.lang.Object) attributeContext12);
        int int16 = attributeContext12.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext17 = attributeContext12.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "hi!");
        java.lang.String str6 = dOMNodePointer4.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName7, (java.lang.Object) (byte) -1);
        int int10 = jDOMPointerFactory0.getOrder();
        int int11 = jDOMPointerFactory0.getOrder();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 110 + "'", int10 == 110);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 110 + "'", int11 == 110);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "hi!");
        java.lang.String str6 = dOMNodePointer4.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName7, (java.lang.Object) (byte) -1);
        org.w3c.dom.Node node10 = null;
        java.lang.Object obj11 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = org.apache.commons.jxpath.JXPathContext.newContext(obj11);
        java.lang.Object obj13 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = org.apache.commons.jxpath.JXPathContext.newContext(obj13);
        java.util.Locale locale15 = jXPathContext14.getLocale();
        jXPathContext12.setLocale(locale15);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node10, locale15);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer9, locale15);
        int int19 = jDOMNodePointer18.getLength();
        java.lang.String str20 = jDOMNodePointer18.getNamespaceURI();
        java.lang.String str21 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue((java.lang.Object) jDOMNodePointer18);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jXPathContext12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(jXPathContext14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        java.lang.Object obj8 = treeCompiler0.processingInstructionTest("$null");
        java.lang.Object obj10 = treeCompiler0.nodeTypeTest(63);
        org.apache.commons.jxpath.JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError13 = new org.apache.commons.jxpath.JXPathContextFactoryConfigurationError("hi!");
        java.lang.Throwable[] throwableArray14 = jXPathContextFactoryConfigurationError13.getSuppressed();
        java.lang.Object obj15 = treeCompiler0.function(68, (java.lang.Object[]) throwableArray14);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "processing-instruction('$null')");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "UNKNOWN()");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "unknownFunction68()()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "unknownFunction68()()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "unknownFunction68()()");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.jdom.Attribute attribute33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer8, attribute33);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory35 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale37, "hi!");
        java.lang.Object obj40 = jDOMNodePointer39.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer39.namespaceIterator();
        java.lang.Object obj42 = jDOMNodePointer39.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer44, "");
        boolean boolean47 = jDOMNamespacePointer46.isCollection();
        java.lang.Object obj48 = jDOMNamespacePointer46.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = containerPointerFactory35.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39, qName43, (java.lang.Object) jDOMNamespacePointer46);
        org.apache.commons.jxpath.ri.QName qName52 = new org.apache.commons.jxpath.ri.QName("id('hi!')", "");
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext56 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext53, false, nodeTest55);
        boolean boolean57 = qName52.equals((java.lang.Object) false);
        org.apache.commons.jxpath.ri.EvalContext evalContext58 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext60 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext58, nodeTest59);
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext63 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext61, nodeTest62);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext65 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext63, nodeTest64);
        boolean boolean67 = attributeContext63.setPosition(0);
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer70 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale68, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer71 = nullPointer70.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer71, "$null");
        org.apache.commons.jxpath.ri.QName qName74 = jDOMNamespacePointer73.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest75 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName74);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext76 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext63, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest75);
        boolean boolean77 = nodeNameTest75.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext78 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext60, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest75);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory79 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName82 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser83 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean84 = dOMParser83.isIgnoringElementContentWhitespace();
        dOMParser83.setNamespaceAware(false);
        boolean boolean87 = dOMParser83.isIgnoringComments();
        java.lang.Object obj88 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext89 = org.apache.commons.jxpath.JXPathContext.newContext(obj88);
        java.util.Locale locale90 = jXPathContext89.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer91 = jDOMPointerFactory79.createNodePointer(qName82, (java.lang.Object) dOMParser83, locale90);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer92 = containerPointerFactory35.createNodePointer(qName52, (java.lang.Object) selfContext78, locale90);
        boolean boolean93 = jDOMAttributePointer34.equals((java.lang.Object) containerPointerFactory35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(nodePointer49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(propertyPointer71);
        org.junit.Assert.assertNotNull(qName74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(jXPathContext89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer91);
        org.junit.Assert.assertNull(nodePointer92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.lang.Object obj2 = org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.allocateConditionally("DOM", "");
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory0 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale3, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer6 = nullPointer5.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = propertyPointer6.namespaceIterator();
        org.w3c.dom.Node node8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node8, locale9, "hi!");
        boolean boolean12 = dOMNodePointer11.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        boolean boolean14 = dOMNodePointer11.testNode(nodeTest13);
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean18 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext21 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext19, nodeTest20);
        boolean boolean23 = attributeContext21.setPosition(54);
        java.lang.Object obj24 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = org.apache.commons.jxpath.JXPathContext.newContext(obj24);
        java.util.Locale locale26 = jXPathContext25.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer27 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale26);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer28 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName17, dynaBean18, locale26);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer11, qName17);
        java.lang.Object obj30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = jDOMPointerFactory2.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer6, qName17, obj30);
        org.apache.commons.jxpath.ri.EvalContext evalContext32 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext34 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext32, nodeTest33);
        boolean boolean36 = attributeContext34.setPosition(54);
        java.lang.Object obj37 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext38 = org.apache.commons.jxpath.JXPathContext.newContext(obj37);
        java.util.Locale locale39 = jXPathContext38.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer40 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale39);
        java.lang.String str41 = collectionPointer40.asPath();
        int int42 = collectionPointer40.getLength();
        org.apache.commons.jxpath.ri.EvalContext evalContext43 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext45 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext43, nodeTest44);
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext48 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext46, nodeTest47);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext50 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext48, nodeTest49);
        boolean boolean52 = attributeContext48.setPosition(0);
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer55 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale53, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer56 = nullPointer55.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer56, "$null");
        org.apache.commons.jxpath.ri.QName qName59 = jDOMNamespacePointer58.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest60 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName59);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext61 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext48, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest60);
        boolean boolean62 = nodeNameTest60.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext63 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext45, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest60);
        org.apache.commons.jxpath.ri.EvalContext evalContext64 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest65 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext66 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext64, nodeTest65);
        java.util.List list67 = attributeContext66.getContextNodeList();
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer71 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale69, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer72 = nullPointer71.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer74 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer72, "$null");
        org.apache.commons.jxpath.ri.QName qName75 = jDOMNamespacePointer74.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest76 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName75);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext77 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext66, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest76);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext78 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) selfContext63, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest76);
        boolean boolean79 = collectionPointer40.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest76);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = containerPointerFactory0.createNodePointer(nodePointer1, qName17, (java.lang.Object) nodeNameTest76);
        org.apache.commons.jxpath.Container container81 = null;
        java.util.Locale locale82 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer83 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container81, locale82);
        org.apache.commons.jxpath.ri.QName qName84 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant86 = new org.apache.commons.jxpath.ri.compiler.Constant("http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer87 = containerPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) containerPointer83, qName84, (java.lang.Object) constant86);
        org.junit.Assert.assertNotNull(propertyPointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(jXPathContext25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(jXPathContext38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "/" + "'", str41, "/");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(propertyPointer56);
        org.junit.Assert.assertNotNull(qName59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(propertyPointer72);
        org.junit.Assert.assertNotNull(qName75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(nodePointer80);
        org.junit.Assert.assertNull(nodePointer87);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer1 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName0);
        java.lang.String str2 = variablePointer1.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = variablePointer1.getImmediateValuePointer();
        variablePointer1.remove();
        java.lang.Object obj5 = null;
        boolean boolean6 = variablePointer1.equals(obj5);
        variablePointer1.setIndex(71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$null" + "'", str2, "$null");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        java.lang.Object obj3 = nullPointer2.getBaseValue();
        java.util.Locale locale4 = nullPointer2.getLocale();
        org.apache.commons.jxpath.ri.compiler.Constant constant6 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext7, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext11 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        java.lang.Object obj12 = constant6.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext11);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext15 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext13, nodeTest14);
        java.lang.Object obj16 = constant6.computeValue(evalContext13);
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory18 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        int int19 = dynaBeanPointerFactory18.getOrder();
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer24 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) 100, jXPathBeanInfo22, locale23);
        boolean boolean25 = beanPointer24.isLeaf();
        int int26 = beanPointer24.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName30 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser31 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean32 = dOMParser31.isIgnoringElementContentWhitespace();
        dOMParser31.setNamespaceAware(false);
        boolean boolean35 = dOMParser31.isIgnoringComments();
        java.lang.Object obj36 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext37 = org.apache.commons.jxpath.JXPathContext.newContext(obj36);
        java.util.Locale locale38 = jXPathContext37.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = jDOMPointerFactory27.createNodePointer(qName30, (java.lang.Object) dOMParser31, locale38);
        org.apache.commons.beanutils.DynaBean dynaBean40 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer41 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer24, qName30, dynaBean40);
        org.apache.commons.jxpath.ri.compiler.Constant constant43 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 37);
        org.apache.commons.jxpath.ri.QName qName46 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean47 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext48 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext50 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext48, nodeTest49);
        boolean boolean52 = attributeContext50.setPosition(54);
        java.lang.Object obj53 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext54 = org.apache.commons.jxpath.JXPathContext.newContext(obj53);
        java.util.Locale locale55 = jXPathContext54.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer56 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale55);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer57 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName46, dynaBean47, locale55);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = dynaBeanPointerFactory18.createNodePointer(qName30, (java.lang.Object) constant43, locale55);
        int int59 = dynaBeanPointerFactory18.getOrder();
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer62 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale60, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer63 = nullPointer62.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer64 = nullPointer62.getPropertyPointer();
        int int65 = nullPointer62.getLength();
        boolean boolean66 = nullPointer62.isNode();
        boolean boolean67 = nullPointer62.isActual();
        boolean boolean68 = nullPointer62.isLeaf();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName72 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser73 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean74 = dOMParser73.isIgnoringElementContentWhitespace();
        dOMParser73.setNamespaceAware(false);
        boolean boolean77 = dOMParser73.isIgnoringComments();
        java.lang.Object obj78 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext79 = org.apache.commons.jxpath.JXPathContext.newContext(obj78);
        java.util.Locale locale80 = jXPathContext79.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer81 = jDOMPointerFactory69.createNodePointer(qName72, (java.lang.Object) dOMParser73, locale80);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory82 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale84 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer86 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale84, "hi!");
        java.lang.Object obj87 = jDOMNodePointer86.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator88 = jDOMNodePointer86.namespaceIterator();
        java.lang.Object obj89 = jDOMNodePointer86.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName90 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer91 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer93 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer91, "");
        boolean boolean94 = jDOMNamespacePointer93.isCollection();
        java.lang.Object obj95 = jDOMNamespacePointer93.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer96 = containerPointerFactory82.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer86, qName90, (java.lang.Object) jDOMNamespacePointer93);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer97 = dynaBeanPointerFactory18.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer62, qName72, (java.lang.Object) containerPointerFactory82);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer99 = nullPointer2.createChild(jXPathContext17, qName72, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: id($null)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 9 + "'", obj12, 9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 9 + "'", obj16, 9);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 700 + "'", int19 == 700);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(jXPathContext37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer39);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(jXPathContext54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 700 + "'", int59 == 700);
        org.junit.Assert.assertNotNull(propertyPointer63);
        org.junit.Assert.assertNotNull(propertyPointer64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(jXPathContext79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer81);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + 100.0d + "'", obj87, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator88);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 100.0d + "'", obj89, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(nodePointer96);
        org.junit.Assert.assertNull(nodePointer97);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0);
        int int2 = simpleCharStream1.bufpos;
        java.lang.String str3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) simpleCharStream1);
        simpleCharStream1.bufpos = '#';
        simpleCharStream1.bufpos = 64;
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleCharStream1.ReInit(inputStream8, 0, 0, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.jxpath.xml.DOMParser dOMParser0 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean1 = dOMParser0.isNamespaceAware();
        dOMParser0.setNamespaceAware(false);
        dOMParser0.setCoalescing(true);
        dOMParser0.setExpandEntityReferences(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "UNKNOWN");
        java.lang.String str3 = nullPointer2.asPath();
        org.apache.commons.jxpath.ri.QName qName6 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean7 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext10 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext8, nodeTest9);
        boolean boolean12 = attributeContext10.setPosition(54);
        java.lang.Object obj13 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = org.apache.commons.jxpath.JXPathContext.newContext(obj13);
        java.util.Locale locale15 = jXPathContext14.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer16 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale15);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer17 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName6, dynaBean7, locale15);
        java.lang.String str18 = dynaBeanPointer17.asPath();
        org.w3c.dom.Attr attr19 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer20 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer17, attr19);
        boolean boolean21 = dOMAttributePointer20.isLeaf();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext26 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext24, nodeTest25);
        boolean boolean28 = attributeContext24.setPosition(0);
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer31 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale29, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer32 = nullPointer31.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer32, "$null");
        org.apache.commons.jxpath.ri.QName qName35 = jDOMNamespacePointer34.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest36 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName35);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext37 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext24, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest36);
        org.apache.commons.jxpath.ri.QName qName38 = nodeNameTest36.getNodeName();
        boolean boolean39 = dOMAttributePointer20.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest36);
        java.lang.String str40 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue((java.lang.Object) nodeNameTest36);
        org.apache.commons.jxpath.ri.QName qName41 = nodeNameTest36.getNodeName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node44 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer47 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node44, locale45, "hi!");
        java.lang.String str49 = dOMNodePointer47.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName50 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = jDOMPointerFactory43.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer47, qName50, (java.lang.Object) (byte) -1);
        org.w3c.dom.Node node53 = null;
        java.lang.Object obj54 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext55 = org.apache.commons.jxpath.JXPathContext.newContext(obj54);
        java.lang.Object obj56 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext57 = org.apache.commons.jxpath.JXPathContext.newContext(obj56);
        java.util.Locale locale58 = jXPathContext57.getLocale();
        jXPathContext55.setLocale(locale58);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer60 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node53, locale58);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer52, locale58);
        org.apache.commons.jxpath.ri.parser.Token token62 = null;
        int[] intArray66 = new int[] { 66, 17, 59 };
        int[] intArray70 = new int[] { 66, 17, 59 };
        int[] intArray74 = new int[] { 66, 17, 59 };
        int[] intArray78 = new int[] { 66, 17, 59 };
        int[][] intArray79 = new int[][] { intArray66, intArray70, intArray74, intArray78 };
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "hi!", "id($null)" };
        org.apache.commons.jxpath.ri.parser.ParseException parseException84 = new org.apache.commons.jxpath.ri.parser.ParseException(token62, intArray79, strArray83);
        boolean boolean85 = jDOMNodePointer61.equals((java.lang.Object) token62);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator jDOMNodeIterator86 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest36, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer61);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer87 = jDOMNodeIterator86.getNodePointer();
        int int88 = jDOMNodeIterator86.getPosition();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "id(UNKNOWN)" + "'", str3, "id(UNKNOWN)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(jXPathContext14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/" + "'", str18, "/");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(propertyPointer32);
        org.junit.Assert.assertNotNull(qName35);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "$null" + "'", str40, "$null");
        org.junit.Assert.assertNotNull(qName41);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(nodePointer52);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(jXPathContext55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(jXPathContext57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[66, 17, 59]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(nodePointer87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        boolean boolean3 = nullPointer2.isCollection();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer4 = nullPointer2.getPropertyPointer();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale8, "hi!");
        java.lang.Object obj11 = jDOMNodePointer10.getBaseValue();
        java.lang.Object obj12 = jDOMNodePointer10.getNodeValue();
        jDOMNodePointer10.printPointerChain();
        boolean boolean14 = jDOMNodePointer10.isLeaf();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nullPointer2.createNodeIterator("id(UNKNOWN)", false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: PropertyIerator startWith parameter is not a child of the supplied parent");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(propertyPointer4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale66, "hi!");
        java.lang.Object obj69 = jDOMNodePointer68.getBaseValue();
        java.lang.Object obj70 = jDOMNodePointer68.getNodeValue();
        jDOMNodePointer68.printPointerChain();
        boolean boolean72 = jDOMNodePointer68.isLeaf();
        boolean boolean73 = jDOMNodePointer68.isNode();
        int int74 = jDOMNodePointer68.getLength();
        org.apache.commons.jxpath.JXPathContext jXPathContext75 = jXPathContextReferenceImpl62.getRelativeContext((org.apache.commons.jxpath.Pointer) jDOMNodePointer68);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver76 = jXPathContextReferenceImpl62.getNamespaceResolver();
        org.apache.commons.jxpath.ri.EvalContext evalContext77 = jXPathContextReferenceImpl62.getAbsoluteRootContext();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0d + "'", obj69, 100.0d);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0d + "'", obj70, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(jXPathContext75);
        org.junit.Assert.assertNotNull(namespaceResolver76);
        org.junit.Assert.assertNotNull(evalContext77);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray2 = null;
        java.lang.Object obj3 = treeCompiler0.function(18, objArray2);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = treeCompiler0.variableReference(obj4);
        org.apache.commons.jxpath.JXPathException jXPathException7 = new org.apache.commons.jxpath.JXPathException("$null");
        java.lang.Throwable[] throwableArray8 = jXPathException7.getSuppressed();
        java.lang.Object obj9 = treeCompiler0.or((java.lang.Object[]) throwableArray8);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler11 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray13 = null;
        java.lang.Object obj14 = treeCompiler11.function(18, objArray13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = treeCompiler11.variableReference(obj15);
        org.apache.commons.jxpath.JXPathException jXPathException18 = new org.apache.commons.jxpath.JXPathException("$null");
        java.lang.Throwable[] throwableArray19 = jXPathException18.getSuppressed();
        java.lang.Object obj20 = treeCompiler11.or((java.lang.Object[]) throwableArray19);
        java.lang.Object obj21 = treeCompiler0.locationPath(true, (java.lang.Object[]) throwableArray19);
        java.lang.Object obj22 = null;
        java.lang.Object obj24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser29 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean30 = dOMParser29.isIgnoringElementContentWhitespace();
        dOMParser29.setNamespaceAware(false);
        boolean boolean33 = dOMParser29.isIgnoringComments();
        java.lang.Object obj34 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext35 = org.apache.commons.jxpath.JXPathContext.newContext(obj34);
        java.util.Locale locale36 = jXPathContext35.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = jDOMPointerFactory25.createNodePointer(qName28, (java.lang.Object) dOMParser29, locale36);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj24, locale36, "Empty expression context");
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer40 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 69, locale36);
        boolean boolean41 = collectionPointer40.isContainer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = treeCompiler0.lessThan(obj22, (java.lang.Object) boolean41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "boolean()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "boolean()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "boolean()");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "$null");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "boolean()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "boolean()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "boolean()");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "$null");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(jXPathContext35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.Object obj5 = jDOMNodePointer3.getNodeValue();
        jDOMNodePointer3.printPointerChain();
        boolean boolean7 = jDOMNodePointer3.isLeaf();
        org.jdom.Attribute attribute8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, attribute8);
        java.lang.String str10 = jDOMAttributePointer9.asPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = jDOMAttributePointer9.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "id('hi!')/@null" + "'", str10, "id('hi!')/@null");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.Object obj5 = jDOMNodePointer3.getValue();
        boolean boolean6 = jDOMNodePointer3.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer3.namespacePointer("id('hi!')");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer8);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.lang.Object obj0 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext(obj0);
        org.apache.commons.jxpath.AbstractFactory abstractFactory2 = jXPathContext1.getFactory();
        java.util.Locale locale3 = jXPathContext1.getLocale();
        org.apache.commons.jxpath.IdentityManager identityManager4 = null;
        jXPathContext1.setIdentityManager(identityManager4);
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNull(abstractFactory2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.lang.Object obj0 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext(obj0);
        org.apache.commons.jxpath.KeyManager keyManager2 = null;
        jXPathContext1.setKeyManager(keyManager2);
        org.w3c.dom.Node node4 = null;
        org.apache.commons.jxpath.ri.QName qName7 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean8 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext9, nodeTest10);
        boolean boolean13 = attributeContext11.setPosition(54);
        java.lang.Object obj14 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = org.apache.commons.jxpath.JXPathContext.newContext(obj14);
        java.util.Locale locale16 = jXPathContext15.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer17 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale16);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer18 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName7, dynaBean8, locale16);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale16);
        jXPathContext1.setLocale(locale16);
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jXPathContext15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        org.apache.commons.jxpath.ri.compiler.Constant constant67 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        boolean boolean68 = constant67.computeContextDependent();
        boolean boolean69 = constant67.isContextDependent();
        org.apache.commons.jxpath.Pointer pointer70 = jXPathContextReferenceImpl62.getPointer("$:<<unknown namespace>>", (org.apache.commons.jxpath.ri.compiler.Expression) constant67);
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer73 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale71, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer74 = nullPointer73.getPropertyPointer();
        java.lang.Object obj75 = nullPointer73.getNode();
        java.lang.String str76 = nullPointer73.asPath();
        jXPathContextReferenceImpl62.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) nullPointer73);
        org.apache.commons.jxpath.ri.QName qName79 = new org.apache.commons.jxpath.ri.QName("id('hi!')");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = jXPathContextReferenceImpl62.getVariablePointer(qName79);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointer70);
        org.junit.Assert.assertNotNull(propertyPointer74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "id($null)" + "'", str76, "id($null)");
        org.junit.Assert.assertNotNull(nodePointer80);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        boolean boolean6 = attributeContext2.setPosition(0);
        java.lang.String str7 = attributeContext2.toString();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        boolean boolean9 = attributeContext2.nextNode();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "hi!");
        java.lang.String str6 = dOMNodePointer4.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext10, nodeTest11);
        java.util.List list13 = attributeContext12.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext12);
        boolean boolean15 = dOMNodePointer4.equals((java.lang.Object) attributeContext12);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator16 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = valueIterator16.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        org.apache.commons.jxpath.ri.parser.TokenMgrError tokenMgrError9 = new org.apache.commons.jxpath.ri.parser.TokenMgrError("", 72);
        java.lang.Throwable[] throwableArray10 = tokenMgrError9.getSuppressed();
        java.lang.Object obj11 = treeCompiler0.and((java.lang.Object[]) throwableArray10);
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer15 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale13, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nullPointer15.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer20 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale18, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer21 = nullPointer20.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = propertyPointer21.namespaceIterator();
        org.w3c.dom.Node node23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node23, locale24, "hi!");
        boolean boolean27 = dOMNodePointer26.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        boolean boolean29 = dOMNodePointer26.testNode(nodeTest28);
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean33 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext36 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext34, nodeTest35);
        boolean boolean38 = attributeContext36.setPosition(54);
        java.lang.Object obj39 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = org.apache.commons.jxpath.JXPathContext.newContext(obj39);
        java.util.Locale locale41 = jXPathContext40.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer42 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale41);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer43 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName32, dynaBean33, locale41);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer26, qName32);
        java.lang.Object obj45 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = jDOMPointerFactory17.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer21, qName32, obj45);
        org.apache.commons.jxpath.JXPathException jXPathException48 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler49 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer50 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer16, qName32, (java.lang.Object) jXPathException48, dynamicPropertyHandler49);
        java.io.Reader reader51 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream54 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader51, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager55 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream54);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo56 = null;
        org.w3c.dom.Node node57 = null;
        java.lang.Object obj58 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext59 = org.apache.commons.jxpath.JXPathContext.newContext(obj58);
        java.lang.Object obj60 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext61 = org.apache.commons.jxpath.JXPathContext.newContext(obj60);
        java.util.Locale locale62 = jXPathContext61.getLocale();
        jXPathContext59.setLocale(locale62);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer64 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node57, locale62);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer65 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName32, (java.lang.Object) simpleCharStream54, jXPathBeanInfo56, locale62);
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale67, "hi!");
        java.lang.Object obj70 = jDOMNodePointer69.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator71 = jDOMNodePointer69.namespaceIterator();
        java.lang.String str72 = jDOMNodePointer69.asPath();
        java.lang.String str73 = jDOMNodePointer69.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl74 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext12, (java.lang.Object) simpleCharStream54, (org.apache.commons.jxpath.Pointer) jDOMNodePointer69);
        jXPathContextReferenceImpl74.removeAll("DOM");
        java.util.Locale locale78 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer80 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale78, "hi!");
        java.lang.Object obj81 = jDOMNodePointer80.getBaseValue();
        java.lang.Object obj82 = jDOMNodePointer80.getNodeValue();
        jDOMNodePointer80.printPointerChain();
        boolean boolean84 = jDOMNodePointer80.isLeaf();
        boolean boolean85 = jDOMNodePointer80.isNode();
        int int86 = jDOMNodePointer80.getLength();
        org.apache.commons.jxpath.JXPathContext jXPathContext87 = jXPathContextReferenceImpl74.getRelativeContext((org.apache.commons.jxpath.Pointer) jDOMNodePointer80);
        org.apache.commons.jxpath.Pointer pointer88 = jXPathContextReferenceImpl74.getNamespaceContextPointer();
        org.apache.commons.jxpath.JXPathException jXPathException90 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.JXPathException jXPathException91 = new org.apache.commons.jxpath.JXPathException((java.lang.Throwable) jXPathException90);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj92 = treeCompiler0.minus((java.lang.Object) jXPathContextReferenceImpl74, (java.lang.Object) jXPathException90);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.JXPathContextReferenceImpl cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(propertyPointer21);
        org.junit.Assert.assertNull(nodeIterator22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(jXPathContext40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer46);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(jXPathContext59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(jXPathContext61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0d + "'", obj70, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "id('hi!')" + "'", str72, "id('hi!')");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 100.0d + "'", obj81, 100.0d);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 100.0d + "'", obj82, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(jXPathContext87);
        org.junit.Assert.assertNotNull(pointer88);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray1 = new org.apache.commons.jxpath.ri.compiler.Step[] {};
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath2 = new org.apache.commons.jxpath.ri.compiler.LocationPath(true, stepArray1);
        boolean boolean3 = locationPath2.computeContextDependent();
        boolean boolean4 = locationPath2.isContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext8 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext5, false, nodeTest7);
        org.apache.commons.jxpath.ri.QName qName11 = new org.apache.commons.jxpath.ri.QName("id('hi!')/namespace::http://www.w3.org/2000/xmlns/", "id($null)");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = null;
        org.apache.commons.jxpath.ri.QName qName15 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean16 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext19 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext17, nodeTest18);
        boolean boolean21 = attributeContext19.setPosition(54);
        java.lang.Object obj22 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = org.apache.commons.jxpath.JXPathContext.newContext(obj22);
        java.util.Locale locale24 = jXPathContext23.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer25 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale24);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer26 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName15, dynaBean16, locale24);
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext29 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext27, nodeTest28);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext31 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext29, nodeTest30);
        boolean boolean33 = attributeContext29.setPosition(0);
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer36 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale34, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer37 = nullPointer36.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer37, "$null");
        org.apache.commons.jxpath.ri.QName qName40 = jDOMNamespacePointer39.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest41 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName40);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext42 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext29, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest41);
        boolean boolean43 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer12, (java.lang.Object) locale24, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest41);
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator44 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) descendantContext8, qName11, locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = locationPath2.computeValue((org.apache.commons.jxpath.ri.EvalContext) descendantContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stepArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(jXPathContext23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(propertyPointer37);
        org.junit.Assert.assertNotNull(qName40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer3.namespacePointer("DOM");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer10 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, ":<<unknown namespace>>");
        java.lang.String str11 = namespacePointer10.asPath();
        org.w3c.dom.Attr attr12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) namespacePointer10, attr12);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "id('hi!')/namespace:::<<unknown namespace>>" + "'", str11, "id('hi!')/namespace:::<<unknown namespace>>");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        java.lang.Object obj3 = nullPointer2.getBaseValue();
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, obj4);
        jDOMNodePointer5.printPointerChain();
        org.apache.commons.jxpath.Container container7 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer8 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, container7);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer3 = nullPointer2.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer3, "$null");
        org.apache.commons.jxpath.ri.QName qName6 = jDOMNamespacePointer5.getName();
        int int7 = jDOMNamespacePointer5.getLength();
        org.apache.commons.jxpath.ri.QName qName8 = jDOMNamespacePointer5.getName();
        java.lang.Object obj9 = jDOMNamespacePointer5.getBaseValue();
        org.junit.Assert.assertNotNull(propertyPointer3);
        org.junit.Assert.assertNotNull(qName6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(qName8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0);
        int int2 = simpleCharStream1.bufpos;
        java.lang.String str3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) simpleCharStream1);
        simpleCharStream1.bufpos = '#';
        simpleCharStream1.bufpos = 64;
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager8 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer4 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, (java.lang.Object) (byte) -1, dynamicPropertyHandler2, locale3);
        java.lang.Object obj5 = dynamicPointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer8 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer4, "", "hi!");
        org.apache.commons.jxpath.ri.QName qName9 = dynamicPointer4.getName();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext13 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext10, false, nodeTest12);
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("id('hi!')/namespace::http://www.w3.org/2000/xmlns/", "id($null)");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.EvalContext evalContext32 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext34 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext32, nodeTest33);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext36 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext34, nodeTest35);
        boolean boolean38 = attributeContext34.setPosition(0);
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer41 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale39, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer42 = nullPointer41.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer42, "$null");
        org.apache.commons.jxpath.ri.QName qName45 = jDOMNamespacePointer44.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest46 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName45);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext47 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext34, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        boolean boolean48 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer17, (java.lang.Object) locale29, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator49 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) descendantContext13, qName16, locale29);
        int int50 = org.apache.commons.jxpath.util.ValueUtils.getLength((java.lang.Object) qName16);
        java.lang.String str51 = qName16.toString();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = dynamicPointer4.attributeIterator(qName16);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNull(qName9);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(propertyPointer42);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "id('hi!')/namespace::http://www.w3.org/2000/xmlns/:id($null)" + "'", str51, "id('hi!')/namespace::http://www.w3.org/2000/xmlns/:id($null)");
        org.junit.Assert.assertNotNull(nodeIterator52);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = nullPointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = nullPointer7.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = propertyPointer8.namespaceIterator();
        org.w3c.dom.Node node10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node10, locale11, "hi!");
        boolean boolean14 = dOMNodePointer13.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = dOMNodePointer13.testNode(nodeTest15);
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean20 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext23 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext21, nodeTest22);
        boolean boolean25 = attributeContext23.setPosition(54);
        java.lang.Object obj26 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = org.apache.commons.jxpath.JXPathContext.newContext(obj26);
        java.util.Locale locale28 = jXPathContext27.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer29 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale28);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer30 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName19, dynaBean20, locale28);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer13, qName19);
        java.lang.Object obj32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMPointerFactory4.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer8, qName19, obj32);
        org.apache.commons.jxpath.JXPathException jXPathException35 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler36 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer37 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer3, qName19, (java.lang.Object) jXPathException35, dynamicPropertyHandler36);
        java.io.Reader reader38 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream41 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader38, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager42 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream41);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        org.w3c.dom.Node node44 = null;
        java.lang.Object obj45 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = org.apache.commons.jxpath.JXPathContext.newContext(obj45);
        java.lang.Object obj47 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext48 = org.apache.commons.jxpath.JXPathContext.newContext(obj47);
        java.util.Locale locale49 = jXPathContext48.getLocale();
        jXPathContext46.setLocale(locale49);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer51 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node44, locale49);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer52 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName19, (java.lang.Object) simpleCharStream41, jXPathBeanInfo43, locale49);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer53 = beanPointer52.getPropertyPointer();
        boolean boolean54 = beanPointer52.isCollection();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertNull(nodeIterator9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(jXPathContext27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer33);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(jXPathContext46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(jXPathContext48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(propertyPointer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator3, locale4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser10 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean11 = dOMParser10.isIgnoringElementContentWhitespace();
        dOMParser10.setNamespaceAware(false);
        boolean boolean14 = dOMParser10.isIgnoringComments();
        java.lang.Object obj15 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext(obj15);
        java.util.Locale locale17 = jXPathContext16.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = jDOMPointerFactory6.createNodePointer(qName9, (java.lang.Object) dOMParser10, locale17);
        org.apache.commons.beanutils.DynaBean dynaBean19 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, qName9, dynaBean19);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer23 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer20, "JDOM", "=");
        boolean boolean24 = namespacePointer23.isCollection();
        org.apache.commons.jxpath.ri.compiler.Constant constant27 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext30 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext28, nodeTest29);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext32 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext30, nodeTest31);
        java.lang.Object obj33 = constant27.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression34, expression35);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest37 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant27, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual36);
        boolean boolean38 = constant27.isContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext41 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext39, nodeTest40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext43 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext41, nodeTest42);
        boolean boolean45 = attributeContext41.setPosition(51);
        org.apache.commons.jxpath.Pointer pointer46 = attributeContext41.getContextNodePointer();
        java.lang.Object obj47 = constant27.compute((org.apache.commons.jxpath.ri.EvalContext) attributeContext41);
        org.apache.commons.jxpath.util.ValueUtils.setValue((java.lang.Object) boolean24, 12, obj47);
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 9 + "'", obj33, 9);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(pointer46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 9 + "'", obj47, 9);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getBaseValue();
        java.lang.Object obj11 = collectionPointer8.getBaseValue();
        boolean boolean12 = collectionPointer8.isLeaf();
        boolean boolean13 = collectionPointer8.isCollection();
        java.lang.Object obj14 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = org.apache.commons.jxpath.JXPathContext.newContext(obj14);
        org.apache.commons.jxpath.AbstractFactory abstractFactory16 = jXPathContext15.getFactory();
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext15, (java.lang.Object) 0.0d);
        org.apache.commons.jxpath.Pointer pointer19 = jXPathContext18.getContextPointer();
        org.apache.commons.jxpath.KeyManager keyManager20 = null;
        jXPathContext18.setKeyManager(keyManager20);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale22, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer25 = nullPointer24.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer25, "$null");
        org.apache.commons.jxpath.ri.QName qName28 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest29 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest30 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28);
        java.lang.String str31 = qName28.getPrefix();
        org.apache.commons.jxpath.ri.QName qName33 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer34 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName33);
        java.lang.String str35 = variablePointer34.asPath();
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer38 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale36, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer39 = nullPointer38.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = propertyPointer39.namespaceIterator();
        boolean boolean41 = variablePointer34.equals((java.lang.Object) nodeIterator40);
        org.apache.commons.jxpath.ri.QName qName42 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer46 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName42, (java.lang.Object) 100, jXPathBeanInfo44, locale45);
        boolean boolean47 = beanPointer46.isLeaf();
        int int48 = beanPointer46.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName52 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser53 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean54 = dOMParser53.isIgnoringElementContentWhitespace();
        dOMParser53.setNamespaceAware(false);
        boolean boolean57 = dOMParser53.isIgnoringComments();
        java.lang.Object obj58 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext59 = org.apache.commons.jxpath.JXPathContext.newContext(obj58);
        java.util.Locale locale60 = jXPathContext59.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = jDOMPointerFactory49.createNodePointer(qName52, (java.lang.Object) dOMParser53, locale60);
        org.apache.commons.beanutils.DynaBean dynaBean62 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer63 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer46, qName52, dynaBean62);
        java.lang.Object obj64 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer65 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) variablePointer34, qName52, obj64);
        boolean boolean66 = variablePointer34.isActual();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = collectionPointer8.createChild(jXPathContext18, qName28, 78, (java.lang.Object) boolean66);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot turn java.lang.Integer into a collection of size 79");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 54 + "'", obj11, 54);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jXPathContext15);
        org.junit.Assert.assertNull(abstractFactory16);
        org.junit.Assert.assertNotNull(jXPathContext18);
        org.junit.Assert.assertNotNull(pointer19);
        org.junit.Assert.assertNotNull(propertyPointer25);
        org.junit.Assert.assertNotNull(qName28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "$null" + "'", str35, "$null");
        org.junit.Assert.assertNotNull(propertyPointer39);
        org.junit.Assert.assertNull(nodeIterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(jXPathContext59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer61);
        org.junit.Assert.assertNotNull(nodePointer65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.jdom.Attribute attribute33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer8, attribute33);
        java.lang.Object obj35 = jDOMAttributePointer34.getImmediateNode();
        boolean boolean36 = jDOMAttributePointer34.isActual();
        java.lang.Object obj37 = jDOMAttributePointer34.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName40 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean41 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext44 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext42, nodeTest43);
        boolean boolean46 = attributeContext44.setPosition(54);
        java.lang.Object obj47 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext48 = org.apache.commons.jxpath.JXPathContext.newContext(obj47);
        java.util.Locale locale49 = jXPathContext48.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer50 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale49);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer51 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName40, dynaBean41, locale49);
        java.lang.String str52 = dynaBeanPointer51.asPath();
        org.w3c.dom.Attr attr53 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer54 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer51, attr53);
        boolean boolean55 = dOMAttributePointer54.isLeaf();
        org.apache.commons.jxpath.ri.EvalContext evalContext56 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext58 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext56, nodeTest57);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext60 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext58, nodeTest59);
        boolean boolean62 = attributeContext58.setPosition(0);
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer65 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale63, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer66 = nullPointer65.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer66, "$null");
        org.apache.commons.jxpath.ri.QName qName69 = jDOMNamespacePointer68.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest70 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName69);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext71 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext58, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest70);
        org.apache.commons.jxpath.ri.QName qName72 = nodeNameTest70.getNodeName();
        boolean boolean73 = dOMAttributePointer54.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest70);
        java.lang.String str74 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue((java.lang.Object) nodeNameTest70);
        org.apache.commons.jxpath.ri.QName qName75 = nodeNameTest70.getNodeName();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler77 = null;
        org.apache.commons.jxpath.Container container78 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory79 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName82 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser83 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean84 = dOMParser83.isIgnoringElementContentWhitespace();
        dOMParser83.setNamespaceAware(false);
        boolean boolean87 = dOMParser83.isIgnoringComments();
        java.lang.Object obj88 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext89 = org.apache.commons.jxpath.JXPathContext.newContext(obj88);
        java.util.Locale locale90 = jXPathContext89.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer91 = jDOMPointerFactory79.createNodePointer(qName82, (java.lang.Object) dOMParser83, locale90);
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer92 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container78, locale90);
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer93 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName75, (java.lang.Object) 13, dynamicPropertyHandler77, locale90);
        // The following exception was thrown during execution in test generation
        try {
            jDOMAttributePointer34.setValue((java.lang.Object) qName75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(jXPathContext48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "/" + "'", str52, "/");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(propertyPointer66);
        org.junit.Assert.assertNotNull(qName69);
        org.junit.Assert.assertNotNull(qName72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "$null" + "'", str74, "$null");
        org.junit.Assert.assertNotNull(qName75);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(jXPathContext89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer91);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.jdom.Attribute attribute33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer8, attribute33);
        java.lang.Object obj35 = jDOMAttributePointer34.getImmediateNode();
        boolean boolean36 = jDOMAttributePointer34.isActual();
        java.lang.Object obj37 = jDOMAttributePointer34.getImmediateNode();
        java.lang.String str38 = jDOMAttributePointer34.asPath();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/@null" + "'", str38, "/@null");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler1 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj3 = treeCompiler1.processingInstructionTest("/");
        java.lang.Object obj4 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler1);
        java.lang.Object[] objArray5 = null;
        java.lang.Object obj6 = treeCompiler1.or(objArray5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = treeCompiler1.variableReference(obj7);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "$null");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "$null");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray2 = null;
        java.lang.Object obj3 = treeCompiler0.function(18, objArray2);
        java.lang.Object obj5 = treeCompiler0.literal("id($null)");
        java.lang.Object obj7 = treeCompiler0.nodeTypeTest(63);
        org.apache.commons.jxpath.CompiledExpression compiledExpression9 = org.apache.commons.jxpath.JXPathContext.compile("DOM");
        org.apache.commons.jxpath.ri.compiler.Constant constant11 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext12, nodeTest13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext16 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext14, nodeTest15);
        java.lang.Object obj17 = constant11.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext16);
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext20 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext18, nodeTest19);
        java.lang.Object obj21 = constant11.computeValue(evalContext18);
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = org.apache.commons.jxpath.JXPathContext.newContext(obj21);
        org.apache.commons.jxpath.AbstractFactory abstractFactory23 = jXPathContext22.getFactory();
        compiledExpression9.removeAll(jXPathContext22);
        org.w3c.dom.Node node25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer28 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node25, locale26, "hi!");
        boolean boolean29 = dOMNodePointer28.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = dOMNodePointer28.testNode(nodeTest30);
        org.apache.commons.jxpath.ri.QName qName34 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean35 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext38 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext36, nodeTest37);
        boolean boolean40 = attributeContext38.setPosition(54);
        java.lang.Object obj41 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext42 = org.apache.commons.jxpath.JXPathContext.newContext(obj41);
        java.util.Locale locale43 = jXPathContext42.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer44 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale43);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer45 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName34, dynaBean35, locale43);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer28, qName34);
        int int47 = dOMNodePointer28.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = dOMNodePointer28.getValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = treeCompiler0.equal((java.lang.Object) compiledExpression9, (java.lang.Object) nodePointer48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.JXPathCompiledExpression cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "boolean()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "boolean()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "boolean()");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "'id($null)'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "'id($null)'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "'id($null)'");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "UNKNOWN()");
        org.junit.Assert.assertNotNull(compiledExpression9);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 9 + "'", obj17, 9);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 9 + "'", obj21, 9);
        org.junit.Assert.assertNotNull(jXPathContext22);
        org.junit.Assert.assertNull(abstractFactory23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(jXPathContext42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(nodePointer48);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = nullPointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = nullPointer7.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = propertyPointer8.namespaceIterator();
        org.w3c.dom.Node node10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node10, locale11, "hi!");
        boolean boolean14 = dOMNodePointer13.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = dOMNodePointer13.testNode(nodeTest15);
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean20 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext23 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext21, nodeTest22);
        boolean boolean25 = attributeContext23.setPosition(54);
        java.lang.Object obj26 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = org.apache.commons.jxpath.JXPathContext.newContext(obj26);
        java.util.Locale locale28 = jXPathContext27.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer29 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale28);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer30 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName19, dynaBean20, locale28);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer13, qName19);
        java.lang.Object obj32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMPointerFactory4.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer8, qName19, obj32);
        org.apache.commons.jxpath.JXPathException jXPathException35 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler36 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer37 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer3, qName19, (java.lang.Object) jXPathException35, dynamicPropertyHandler36);
        java.io.Reader reader38 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream41 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader38, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager42 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream41);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        org.w3c.dom.Node node44 = null;
        java.lang.Object obj45 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = org.apache.commons.jxpath.JXPathContext.newContext(obj45);
        java.lang.Object obj47 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext48 = org.apache.commons.jxpath.JXPathContext.newContext(obj47);
        java.util.Locale locale49 = jXPathContext48.getLocale();
        jXPathContext46.setLocale(locale49);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer51 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node44, locale49);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer52 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName19, (java.lang.Object) simpleCharStream41, jXPathBeanInfo43, locale49);
        java.lang.String str53 = beanPointer52.asPath();
        int int54 = beanPointer52.getLength();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertNull(nodeIterator9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(jXPathContext27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer33);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(jXPathContext46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(jXPathContext48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "/" + "'", str53, "/");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.jxpath.JXPathException jXPathException1 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.JXPathException jXPathException2 = new org.apache.commons.jxpath.JXPathException((java.lang.Throwable) jXPathException1);
        java.lang.String str3 = jXPathException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.jxpath.JXPathException: $null" + "'", str3, "org.apache.commons.jxpath.JXPathException: $null");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        namespaceContext4.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = namespaceContext4.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext9 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, true, nodeTest8);
        int int10 = namespaceContext4.getPosition();
        boolean boolean12 = namespaceContext4.setPosition(71);
        org.apache.commons.jxpath.Container container14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer16 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container14, locale15);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = containerPointer16.namespaceIterator();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator17, locale18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName23 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser24 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean25 = dOMParser24.isIgnoringElementContentWhitespace();
        dOMParser24.setNamespaceAware(false);
        boolean boolean28 = dOMParser24.isIgnoringComments();
        java.lang.Object obj29 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = org.apache.commons.jxpath.JXPathContext.newContext(obj29);
        java.util.Locale locale31 = jXPathContext30.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = jDOMPointerFactory20.createNodePointer(qName23, (java.lang.Object) dOMParser24, locale31);
        org.apache.commons.beanutils.DynaBean dynaBean33 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer34 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19, qName23, dynaBean33);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer37 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer34, "JDOM", "=");
        boolean boolean38 = namespacePointer37.isCollection();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer41 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale39, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer42 = nullPointer41.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer42, "$null");
        org.apache.commons.jxpath.ri.QName qName45 = jDOMNamespacePointer44.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest46 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName45);
        boolean boolean47 = namespacePointer37.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext48 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext52 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext50, nodeTest51);
        boolean boolean54 = attributeContext52.setPosition(54);
        java.lang.Object obj55 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext56 = org.apache.commons.jxpath.JXPathContext.newContext(obj55);
        java.util.Locale locale57 = jXPathContext56.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer58 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale57);
        java.lang.String str59 = collectionPointer58.asPath();
        int int60 = collectionPointer58.getLength();
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext63 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext61, nodeTest62);
        org.apache.commons.jxpath.ri.EvalContext evalContext64 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest65 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext66 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext64, nodeTest65);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext68 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext66, nodeTest67);
        boolean boolean70 = attributeContext66.setPosition(0);
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer73 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale71, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer74 = nullPointer73.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer74, "$null");
        org.apache.commons.jxpath.ri.QName qName77 = jDOMNamespacePointer76.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest78 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName77);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext79 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext66, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest78);
        boolean boolean80 = nodeNameTest78.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext81 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext63, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest78);
        org.apache.commons.jxpath.ri.EvalContext evalContext82 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest83 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext84 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext82, nodeTest83);
        java.util.List list85 = attributeContext84.getContextNodeList();
        java.util.Locale locale87 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer89 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale87, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer90 = nullPointer89.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer92 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer90, "$null");
        org.apache.commons.jxpath.ri.QName qName93 = jDOMNamespacePointer92.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest94 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName93);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext95 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext84, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest94);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext96 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) selfContext81, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest94);
        boolean boolean97 = collectionPointer58.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest94);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext98 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest94);
        namespaceContext4.reset();
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodeIterator17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(jXPathContext30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(propertyPointer42);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(jXPathContext56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/" + "'", str59, "/");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(propertyPointer74);
        org.junit.Assert.assertNotNull(qName77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertNotNull(propertyPointer90);
        org.junit.Assert.assertNotNull(qName93);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.Object obj5 = jDOMNodePointer3.getNodeValue();
        jDOMNodePointer3.printPointerChain();
        boolean boolean7 = jDOMNodePointer3.isLeaf();
        boolean boolean8 = jDOMNodePointer3.isNode();
        int int9 = jDOMNodePointer3.getLength();
        boolean boolean10 = jDOMNodePointer3.isCollection();
        java.lang.Object obj11 = jDOMNodePointer3.getImmediateNode();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory0 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale2, "hi!");
        java.lang.Object obj5 = jDOMNodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator6 = jDOMNodePointer4.namespaceIterator();
        java.lang.Object obj7 = jDOMNodePointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer9, "");
        boolean boolean12 = jDOMNamespacePointer11.isCollection();
        java.lang.Object obj13 = jDOMNamespacePointer11.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = containerPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer4, qName8, (java.lang.Object) jDOMNamespacePointer11);
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale15, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer18 = nullPointer17.getPropertyPointer();
        org.w3c.dom.Node node19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node19, locale20, "hi!");
        boolean boolean23 = dOMNodePointer22.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = dOMNodePointer22.testNode(nodeTest24);
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean29 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext32 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext30, nodeTest31);
        boolean boolean34 = attributeContext32.setPosition(54);
        java.lang.Object obj35 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = org.apache.commons.jxpath.JXPathContext.newContext(obj35);
        java.util.Locale locale37 = jXPathContext36.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer38 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale37);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer39 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName28, dynaBean29, locale37);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer22, qName28);
        java.lang.Object obj41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = containerPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer17, qName28, obj41);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest43 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28);
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer44 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName28);
        java.lang.String str45 = variablePointer44.asPath();
        org.apache.commons.jxpath.CompiledExpression compiledExpression47 = org.apache.commons.jxpath.JXPathContext.compile("DOM");
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Iterator iterator50 = compiledExpression47.iterate(jXPathContext49);
        java.lang.Object obj51 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext52 = org.apache.commons.jxpath.JXPathContext.newContext(obj51);
        java.text.DecimalFormatSymbols decimalFormatSymbols54 = null;
        jXPathContext52.setDecimalFormatSymbols("id($null)", decimalFormatSymbols54);
        java.util.Iterator iterator56 = compiledExpression47.iterate(jXPathContext52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = variablePointer44.createPath(jXPathContext52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: $:<<unknown namespace>>");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(propertyPointer18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(jXPathContext36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "$:<<unknown namespace>>" + "'", str45, "$:<<unknown namespace>>");
        org.junit.Assert.assertNotNull(compiledExpression47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(jXPathContext52);
        org.junit.Assert.assertNotNull(iterator56);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = jXPathContextReferenceImpl62.getAbsoluteRootContext();
        jXPathContextReferenceImpl62.registerNamespace("", "=");
        org.apache.commons.jxpath.ri.EvalContext evalContext68 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext70 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext68, nodeTest69);
        org.apache.commons.jxpath.ri.compiler.Constant constant72 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        boolean boolean73 = constant72.computeContextDependent();
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext74 = new org.apache.commons.jxpath.ri.axes.PredicateContext(evalContext68, (org.apache.commons.jxpath.ri.compiler.Expression) constant72);
        // The following exception was thrown during execution in test generation
        try {
            jXPathContextReferenceImpl62.removeAll("id('hi!')/namespace:::<<unknown namespace>>", (org.apache.commons.jxpath.ri.compiler.Expression) constant72);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove an object that is not some other object's property or a collection element");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(evalContext63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer1 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName0);
        java.lang.String str2 = variablePointer1.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = variablePointer1.getImmediateValuePointer();
        variablePointer1.remove();
        int int5 = variablePointer1.getLength();
        org.apache.commons.jxpath.ri.QName qName6 = variablePointer1.getName();
        org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl jXPathContextFactoryReferenceImpl7 = new org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl();
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext10 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext8, nodeTest9);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext12 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext10, nodeTest11);
        boolean boolean14 = attributeContext10.setPosition(0);
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale15, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer18 = nullPointer17.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer18, "$null");
        org.apache.commons.jxpath.ri.QName qName21 = jDOMNamespacePointer20.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest22 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName21);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext23 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext10, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest22);
        boolean boolean24 = nodeNameTest22.isWildcard();
        boolean boolean25 = nodeNameTest22.isWildcard();
        boolean boolean26 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) variablePointer1, (java.lang.Object) jXPathContextFactoryReferenceImpl7, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$null" + "'", str2, "$null");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(qName6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(propertyPointer18);
        org.junit.Assert.assertNotNull(qName21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer3.namespacePointer("DOM");
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean10 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName9, dynaBean10, locale18);
        java.lang.String str21 = dynaBeanPointer20.asPath();
        org.w3c.dom.Attr attr22 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer23 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer20, attr22);
        boolean boolean24 = dOMAttributePointer23.isLeaf();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext27 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext25, nodeTest26);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext29 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext27, nodeTest28);
        boolean boolean31 = attributeContext27.setPosition(0);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer34 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale32, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer35 = nullPointer34.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer35, "$null");
        org.apache.commons.jxpath.ri.QName qName38 = jDOMNamespacePointer37.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest39 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName38);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext40 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext27, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        org.apache.commons.jxpath.ri.QName qName41 = nodeNameTest39.getNodeName();
        boolean boolean42 = dOMAttributePointer23.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest39);
        java.lang.String str43 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue((java.lang.Object) nodeNameTest39);
        org.apache.commons.jxpath.ri.QName qName44 = nodeNameTest39.getNodeName();
        boolean boolean45 = dOMNodePointer3.equals((java.lang.Object) qName44);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(propertyPointer35);
        org.junit.Assert.assertNotNull(qName38);
        org.junit.Assert.assertNotNull(qName41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "$null" + "'", str43, "$null");
        org.junit.Assert.assertNotNull(qName44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        boolean boolean6 = dOMNodePointer3.testNode(nodeTest5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean10 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName9, dynaBean10, locale18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName9);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler23 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj25 = treeCompiler23.processingInstructionTest("/");
        java.lang.Object obj26 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler23);
        java.lang.Object obj28 = treeCompiler23.literal("/:<<unknown namespace>>/namespace::JDOM");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer32 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale30, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nullPointer32.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer37 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale35, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer38 = nullPointer37.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator39 = propertyPointer38.namespaceIterator();
        org.w3c.dom.Node node40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node40, locale41, "hi!");
        boolean boolean44 = dOMNodePointer43.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = dOMNodePointer43.testNode(nodeTest45);
        org.apache.commons.jxpath.ri.QName qName49 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean50 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext53 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext51, nodeTest52);
        boolean boolean55 = attributeContext53.setPosition(54);
        java.lang.Object obj56 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext57 = org.apache.commons.jxpath.JXPathContext.newContext(obj56);
        java.util.Locale locale58 = jXPathContext57.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer59 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale58);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer60 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName49, dynaBean50, locale58);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer43, qName49);
        java.lang.Object obj62 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = jDOMPointerFactory34.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer38, qName49, obj62);
        org.apache.commons.jxpath.JXPathException jXPathException65 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler66 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer67 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer33, qName49, (java.lang.Object) jXPathException65, dynamicPropertyHandler66);
        java.io.Reader reader68 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream71 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader68, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager72 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream71);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo73 = null;
        org.w3c.dom.Node node74 = null;
        java.lang.Object obj75 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext76 = org.apache.commons.jxpath.JXPathContext.newContext(obj75);
        java.lang.Object obj77 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext78 = org.apache.commons.jxpath.JXPathContext.newContext(obj77);
        java.util.Locale locale79 = jXPathContext78.getLocale();
        jXPathContext76.setLocale(locale79);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer81 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node74, locale79);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer82 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName49, (java.lang.Object) simpleCharStream71, jXPathBeanInfo73, locale79);
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer83 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName9, (java.lang.Object) treeCompiler23, dynamicPropertyHandler29, locale79);
        java.lang.Object obj84 = null;
        java.lang.Object obj85 = null;
        java.lang.Object obj86 = treeCompiler23.minus(obj84, obj85);
        java.lang.Object obj88 = treeCompiler23.nodeTypeTest(9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "$null");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "'/:<<unknown namespace>>/namespace::JDOM'");
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(propertyPointer38);
        org.junit.Assert.assertNull(nodeIterator39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(jXPathContext57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer63);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(jXPathContext76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(jXPathContext78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertEquals(obj88.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "UNKNOWN()");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer4 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, (java.lang.Object) (byte) -1, dynamicPropertyHandler2, locale3);
        boolean boolean5 = dynamicPointer4.isActual();
        dynamicPointer4.setAttribute(false);
        java.lang.String str8 = dynamicPointer4.toString();
        java.lang.Object obj9 = dynamicPointer4.getNodeValue();
        java.lang.Object obj10 = dynamicPointer4.getNodeValue();
        java.lang.Object obj11 = dynamicPointer4.getNode();
        org.apache.commons.jxpath.ri.QName qName12 = dynamicPointer4.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNull(qName12);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        int int5 = namespaceContext4.getPosition();
        boolean boolean7 = namespaceContext4.setPosition(39);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory8 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale10, "hi!");
        java.lang.Object obj13 = jDOMNodePointer12.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer12.namespaceIterator();
        java.lang.Object obj15 = jDOMNodePointer12.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer17, "");
        boolean boolean20 = jDOMNamespacePointer19.isCollection();
        java.lang.Object obj21 = jDOMNamespacePointer19.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = containerPointerFactory8.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, qName16, (java.lang.Object) jDOMNamespacePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer25 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale23, "$null");
        boolean boolean26 = nullPointer25.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer27, "");
        org.apache.commons.jxpath.ri.parser.ParseException parseException30 = new org.apache.commons.jxpath.ri.parser.ParseException();
        org.apache.commons.jxpath.ri.parser.Token token31 = parseException30.currentToken;
        java.lang.String[] strArray32 = org.apache.commons.jxpath.ri.parser.XPathParserTokenManager.jjstrLiteralImages;
        parseException30.tokenImage = strArray32;
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext36 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext34, nodeTest35);
        java.util.List list37 = attributeContext36.getContextNodeList();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer41 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale39, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer42 = nullPointer41.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer42, "$null");
        org.apache.commons.jxpath.ri.QName qName45 = jDOMNamespacePointer44.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest46 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName45);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext47 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext36, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        boolean boolean48 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer27, (java.lang.Object) parseException30, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        boolean boolean49 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, (java.lang.Object) boolean26, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext50 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(token31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(propertyPointer42);
        org.junit.Assert.assertNotNull(qName45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.lang.Object obj0 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext(obj0);
        org.apache.commons.jxpath.AbstractFactory abstractFactory2 = jXPathContext1.getFactory();
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext1, (java.lang.Object) 0.0d);
        org.apache.commons.jxpath.Variables variables5 = jXPathContext4.getVariables();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nullPointer8.getImmediateValuePointer();
        jXPathContext4.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) nullPointer8);
        org.apache.commons.jxpath.ri.QName qName13 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean14 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext15, nodeTest16);
        boolean boolean19 = attributeContext17.setPosition(54);
        java.lang.Object obj20 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext21 = org.apache.commons.jxpath.JXPathContext.newContext(obj20);
        java.util.Locale locale22 = jXPathContext21.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer23 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale22);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer24 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName13, dynaBean14, locale22);
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = dynaBeanPointer24.attributeIterator(qName27);
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext31 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext29, nodeTest30);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext33 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext31, nodeTest32);
        namespaceContext33.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = namespaceContext33.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext38 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext33, true, nodeTest37);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory39 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale41, "hi!");
        java.lang.Object obj44 = jDOMNodePointer43.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = jDOMNodePointer43.namespaceIterator();
        java.lang.Object obj46 = jDOMNodePointer43.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName47 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer48, "");
        boolean boolean51 = jDOMNamespacePointer50.isCollection();
        java.lang.Object obj52 = jDOMNamespacePointer50.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = containerPointerFactory39.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer43, qName47, (java.lang.Object) jDOMNamespacePointer50);
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer56 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale54, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer57 = nullPointer56.getPropertyPointer();
        org.w3c.dom.Node node58 = null;
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer61 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node58, locale59, "hi!");
        boolean boolean62 = dOMNodePointer61.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest63 = null;
        boolean boolean64 = dOMNodePointer61.testNode(nodeTest63);
        org.apache.commons.jxpath.ri.QName qName67 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean68 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext69 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest70 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext71 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext69, nodeTest70);
        boolean boolean73 = attributeContext71.setPosition(54);
        java.lang.Object obj74 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext75 = org.apache.commons.jxpath.JXPathContext.newContext(obj74);
        java.util.Locale locale76 = jXPathContext75.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer77 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale76);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer78 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName67, dynaBean68, locale76);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator79 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer61, qName67);
        java.lang.Object obj80 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer81 = containerPointerFactory39.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer56, qName67, obj80);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest82 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName67);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext83 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext33, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest82);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo84 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer85 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer8, qName27, (java.lang.Object) nodeNameTest82, jXPathBeanInfo84);
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNull(abstractFactory2);
        org.junit.Assert.assertNotNull(jXPathContext4);
        org.junit.Assert.assertNotNull(variables5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(jXPathContext21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertNull(nodePointer35);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(nodePointer53);
        org.junit.Assert.assertNotNull(propertyPointer57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(jXPathContext75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer81);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer3.namespacePointer("DOM");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer10 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, ":<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = dOMNodePointer3.getValuePointer();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        namespaceContext4.reset();
        namespaceContext4.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext7, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext11 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        namespaceContext11.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = namespaceContext11.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext15, nodeTest16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext19 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext17, nodeTest18);
        boolean boolean21 = attributeContext17.setPosition(0);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale22, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer25 = nullPointer24.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer25, "$null");
        org.apache.commons.jxpath.ri.QName qName28 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest29 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext30 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext17, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest29);
        org.apache.commons.jxpath.ri.QName qName31 = nodeNameTest29.getNodeName();
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext32 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext11, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest29);
        org.apache.commons.jxpath.ri.axes.ChildContext childContext35 = new org.apache.commons.jxpath.ri.axes.ChildContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext4, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest29, false, true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = childContext35.getCurrentNodePointer();
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyPointer25);
        org.junit.Assert.assertNotNull(qName28);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNull(nodePointer36);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        org.jdom.Attribute attribute33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer8, attribute33);
        java.lang.Object obj35 = jDOMAttributePointer34.getImmediateNode();
        boolean boolean36 = jDOMAttributePointer34.isActual();
        java.lang.Object obj37 = jDOMAttributePointer34.getImmediateNode();
        boolean boolean38 = jDOMAttributePointer34.isCollection();
        int int39 = jDOMAttributePointer34.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray1 = new org.apache.commons.jxpath.ri.compiler.Step[] {};
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath2 = new org.apache.commons.jxpath.ri.compiler.LocationPath(true, stepArray1);
        boolean boolean3 = locationPath2.isAbsolute();
        boolean boolean4 = locationPath2.isSimplePath();
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray5 = locationPath2.getSteps();
        boolean boolean6 = locationPath2.computeContextDependent();
        org.junit.Assert.assertNotNull(stepArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stepArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        boolean boolean6 = dOMNodePointer3.testNode(nodeTest5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean10 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName9, dynaBean10, locale18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName9);
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        java.util.List list25 = attributeContext24.getContextNodeList();
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer29 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale27, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer30 = nullPointer29.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer30, "$null");
        org.apache.commons.jxpath.ri.QName qName33 = jDOMNamespacePointer32.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName33);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext35 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext24, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest34);
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer39 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale37, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer40 = nullPointer39.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer40, "$null");
        org.apache.commons.jxpath.ri.QName qName43 = jDOMNamespacePointer42.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest44 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName43);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext45 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext35, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest44);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest44, false, nodePointer47);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory49 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale51, "hi!");
        java.lang.Object obj54 = jDOMNodePointer53.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator55 = jDOMNodePointer53.namespaceIterator();
        java.lang.Object obj56 = jDOMNodePointer53.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName57 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer58, "");
        boolean boolean61 = jDOMNamespacePointer60.isCollection();
        java.lang.Object obj62 = jDOMNamespacePointer60.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = containerPointerFactory49.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer53, qName57, (java.lang.Object) jDOMNamespacePointer60);
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer66 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale64, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer67 = nullPointer66.getPropertyPointer();
        org.w3c.dom.Node node68 = null;
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer71 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node68, locale69, "hi!");
        boolean boolean72 = dOMNodePointer71.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest73 = null;
        boolean boolean74 = dOMNodePointer71.testNode(nodeTest73);
        org.apache.commons.jxpath.ri.QName qName77 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean78 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext79 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest80 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext81 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext79, nodeTest80);
        boolean boolean83 = attributeContext81.setPosition(54);
        java.lang.Object obj84 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext85 = org.apache.commons.jxpath.JXPathContext.newContext(obj84);
        java.util.Locale locale86 = jXPathContext85.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer87 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale86);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer88 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName77, dynaBean78, locale86);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator89 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer71, qName77);
        java.lang.Object obj90 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer91 = containerPointerFactory49.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer66, qName77, obj90);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator92 = dOMNodePointer3.attributeIterator(qName77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(propertyPointer30);
        org.junit.Assert.assertNotNull(qName33);
        org.junit.Assert.assertNotNull(propertyPointer40);
        org.junit.Assert.assertNotNull(qName43);
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0d + "'", obj54, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(nodePointer63);
        org.junit.Assert.assertNotNull(propertyPointer67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(jXPathContext85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer91);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.lang.Object obj0 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext(obj0);
        java.util.Locale locale2 = jXPathContext1.getLocale();
        org.w3c.dom.Node node3 = null;
        java.lang.Object obj4 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = org.apache.commons.jxpath.JXPathContext.newContext(obj4);
        java.lang.Object obj6 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext(obj6);
        java.util.Locale locale8 = jXPathContext7.getLocale();
        jXPathContext5.setLocale(locale8);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node3, locale8);
        int int11 = org.apache.commons.jxpath.util.ValueUtils.getLength((java.lang.Object) locale8);
        jXPathContext1.setLocale(locale8);
        org.apache.commons.jxpath.AbstractFactory abstractFactory13 = null;
        jXPathContext1.setFactory(abstractFactory13);
        jXPathContext1.setLenient(false);
        java.io.Reader reader18 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream21 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader18, 15, 62);
        java.lang.Class<?> wildcardClass22 = simpleCharStream21.getClass();
        int int23 = org.apache.commons.jxpath.util.ValueUtils.getCollectionHint((java.lang.Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = jXPathContext1.getValue("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Invalid XPath: ''. Invalid symbol '' at the beginning of the expression");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jXPathContext5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory0 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale2, "hi!");
        java.lang.Object obj5 = jDOMNodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator6 = jDOMNodePointer4.namespaceIterator();
        java.lang.Object obj7 = jDOMNodePointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer9, "");
        boolean boolean12 = jDOMNamespacePointer11.isCollection();
        java.lang.Object obj13 = jDOMNamespacePointer11.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = containerPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer4, qName8, (java.lang.Object) jDOMNamespacePointer11);
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("id('hi!')", "");
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext21 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext18, false, nodeTest20);
        boolean boolean22 = qName17.equals((java.lang.Object) false);
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext25 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext23, nodeTest24);
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext28 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext26, nodeTest27);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext30 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext28, nodeTest29);
        boolean boolean32 = attributeContext28.setPosition(0);
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer35 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale33, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer36 = nullPointer35.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer36, "$null");
        org.apache.commons.jxpath.ri.QName qName39 = jDOMNamespacePointer38.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest40 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName39);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext41 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext28, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest40);
        boolean boolean42 = nodeNameTest40.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext43 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext25, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest40);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName47 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser48 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean49 = dOMParser48.isIgnoringElementContentWhitespace();
        dOMParser48.setNamespaceAware(false);
        boolean boolean52 = dOMParser48.isIgnoringComments();
        java.lang.Object obj53 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext54 = org.apache.commons.jxpath.JXPathContext.newContext(obj53);
        java.util.Locale locale55 = jXPathContext54.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = jDOMPointerFactory44.createNodePointer(qName47, (java.lang.Object) dOMParser48, locale55);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = containerPointerFactory0.createNodePointer(qName17, (java.lang.Object) selfContext43, locale55);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator58 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) selfContext43);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = selfContext43.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer60 = selfContext43.getCurrentNodePointer();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(propertyPointer36);
        org.junit.Assert.assertNotNull(qName39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(jXPathContext54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer56);
        org.junit.Assert.assertNull(nodePointer57);
        org.junit.Assert.assertNull(nodePointer59);
        org.junit.Assert.assertNull(nodePointer60);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        java.lang.Object obj8 = treeCompiler0.processingInstructionTest("$null");
        java.lang.Object obj10 = treeCompiler0.nodeTypeTest(9);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver11);
        java.lang.String str13 = namespaceResolver12.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer15 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName14);
        java.lang.String str16 = variablePointer15.asPath();
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale17, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer20 = nullPointer19.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = propertyPointer20.namespaceIterator();
        boolean boolean22 = variablePointer15.equals((java.lang.Object) nodeIterator21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer27 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName23, (java.lang.Object) 100, jXPathBeanInfo25, locale26);
        boolean boolean28 = beanPointer27.isLeaf();
        int int29 = beanPointer27.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName33 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser34 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean35 = dOMParser34.isIgnoringElementContentWhitespace();
        dOMParser34.setNamespaceAware(false);
        boolean boolean38 = dOMParser34.isIgnoringComments();
        java.lang.Object obj39 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = org.apache.commons.jxpath.JXPathContext.newContext(obj39);
        java.util.Locale locale41 = jXPathContext40.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = jDOMPointerFactory30.createNodePointer(qName33, (java.lang.Object) dOMParser34, locale41);
        org.apache.commons.beanutils.DynaBean dynaBean43 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer44 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer27, qName33, dynaBean43);
        java.lang.Object obj45 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) variablePointer15, qName33, obj45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = treeCompiler0.lessThan((java.lang.Object) namespaceResolver12, obj45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.NamespaceResolver cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "processing-instruction('$null')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "processing-instruction('$null')");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "UNKNOWN()");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$null" + "'", str16, "$null");
        org.junit.Assert.assertNotNull(propertyPointer20);
        org.junit.Assert.assertNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(jXPathContext40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer46);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory0 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale2, "hi!");
        java.lang.Object obj5 = jDOMNodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator6 = jDOMNodePointer4.namespaceIterator();
        java.lang.Object obj7 = jDOMNodePointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer9, "");
        boolean boolean12 = jDOMNamespacePointer11.isCollection();
        java.lang.Object obj13 = jDOMNamespacePointer11.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = containerPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer4, qName8, (java.lang.Object) jDOMNamespacePointer11);
        org.apache.commons.jxpath.ri.QName qName15 = jDOMNamespacePointer11.getName();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(qName15);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        boolean boolean6 = dOMNodePointer3.testNode(nodeTest5);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale66, "hi!");
        java.lang.Object obj69 = jDOMNodePointer68.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator70 = jDOMNodePointer68.namespaceIterator();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver71 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver72 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver71);
        jDOMNodePointer68.setNamespaceResolver(namespaceResolver71);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory74 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node75 = null;
        java.util.Locale locale76 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer78 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node75, locale76, "hi!");
        java.lang.String str80 = dOMNodePointer78.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName81 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer83 = jDOMPointerFactory74.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer78, qName81, (java.lang.Object) (byte) -1);
        org.w3c.dom.Node node84 = null;
        java.lang.Object obj85 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext86 = org.apache.commons.jxpath.JXPathContext.newContext(obj85);
        java.lang.Object obj87 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext88 = org.apache.commons.jxpath.JXPathContext.newContext(obj87);
        java.util.Locale locale89 = jXPathContext88.getLocale();
        jXPathContext86.setLocale(locale89);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer91 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node84, locale89);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer92 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer83, locale89);
        int int93 = jDOMNodePointer92.getLength();
        boolean boolean95 = jDOMNodePointer92.equals((java.lang.Object) 18);
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl96 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl62, (java.lang.Object) jDOMNodePointer68, (org.apache.commons.jxpath.Pointer) jDOMNodePointer92);
        org.apache.commons.jxpath.Functions functions97 = jXPathContextReferenceImpl62.getFunctions();
        jXPathContextReferenceImpl62.registerDefaultNamespace("/:<<unknown namespace>>/namespace::JDOM");
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0d + "'", obj69, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(nodePointer83);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(jXPathContext86);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(jXPathContext88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(functions97);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext2);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext7, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext11 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean13 = attributeContext9.setPosition(0);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer16.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer17, "$null");
        org.apache.commons.jxpath.ri.QName qName20 = jDOMNamespacePointer19.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName20);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext22 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = parentContext22.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] { parentContext22 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, evalContextArray24);
        int int26 = unionContext25.getDocumentOrder();
        int int27 = unionContext25.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext30 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) unionContext25, nodeTest28, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = unionContext25.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNull(nodePointer23);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer4 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node1, locale2, "hi!");
        java.lang.String str6 = dOMNodePointer4.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, qName7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext10, nodeTest11);
        java.util.List list13 = attributeContext12.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator14 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext12);
        boolean boolean15 = dOMNodePointer4.equals((java.lang.Object) attributeContext12);
        java.lang.Object obj16 = dOMNodePointer4.clone();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer4, "DOM", "=");
        java.lang.String str20 = dOMNodePointer4.getDefaultNamespaceURI();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "id('hi!')");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = containerPointer2.childIterator(nodeTest4, true, nodePointer6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = containerPointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName11 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean12 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext13, nodeTest14);
        boolean boolean17 = attributeContext15.setPosition(54);
        java.lang.Object obj18 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = org.apache.commons.jxpath.JXPathContext.newContext(obj18);
        java.util.Locale locale20 = jXPathContext19.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer21 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale20);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer22 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName11, dynaBean12, locale20);
        org.apache.commons.jxpath.ri.QName qName25 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = dynaBeanPointer22.attributeIterator(qName25);
        // The following exception was thrown during execution in test generation
        try {
            containerPointer2.setValue((java.lang.Object) nodeIterator26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(jXPathContext19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodeIterator26);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = jXPathContextReferenceImpl62.getAbsoluteRootContext();
        java.lang.String str64 = jXPathContextReferenceImpl62.getDefaultNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(evalContext63);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray2 = null;
        java.lang.Object obj3 = treeCompiler0.function(18, objArray2);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = treeCompiler0.variableReference(obj4);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory6 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("hi!", "namespace::");
        java.lang.Object obj10 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = org.apache.commons.jxpath.JXPathContext.newContext(obj10);
        java.text.DecimalFormatSymbols decimalFormatSymbols13 = null;
        jXPathContext11.setDecimalFormatSymbols("id($null)", decimalFormatSymbols13);
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean18 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext21 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext19, nodeTest20);
        boolean boolean23 = attributeContext21.setPosition(54);
        java.lang.Object obj24 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = org.apache.commons.jxpath.JXPathContext.newContext(obj24);
        java.util.Locale locale26 = jXPathContext25.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer27 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale26);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer28 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName17, dynaBean18, locale26);
        org.apache.commons.jxpath.ri.QName qName31 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = dynaBeanPointer28.attributeIterator(qName31);
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext35 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext33, nodeTest34);
        java.util.List list36 = attributeContext35.getContextNodeList();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer40 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale38, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer41 = nullPointer40.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer41, "$null");
        org.apache.commons.jxpath.ri.QName qName44 = jDOMNamespacePointer43.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest45 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName44);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext46 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext35, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest45);
        org.apache.commons.jxpath.NodeSet nodeSet47 = null;
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext48 = new org.apache.commons.jxpath.ri.axes.NodeSetContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext46, nodeSet47);
        java.lang.Object obj49 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = org.apache.commons.jxpath.JXPathContext.newContext(obj49);
        java.util.Locale locale51 = jXPathContext50.getLocale();
        org.w3c.dom.Node node52 = null;
        java.lang.Object obj53 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext54 = org.apache.commons.jxpath.JXPathContext.newContext(obj53);
        java.lang.Object obj55 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext56 = org.apache.commons.jxpath.JXPathContext.newContext(obj55);
        java.util.Locale locale57 = jXPathContext56.getLocale();
        jXPathContext54.setLocale(locale57);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer59 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node52, locale57);
        int int60 = org.apache.commons.jxpath.util.ValueUtils.getLength((java.lang.Object) locale57);
        jXPathContext50.setLocale(locale57);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName31, (java.lang.Object) nodeSetContext48, locale57);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = containerPointerFactory6.createNodePointer(qName9, (java.lang.Object) "id($null)", locale57);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler65 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj67 = treeCompiler65.processingInstructionTest("/");
        java.lang.Object obj68 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler65);
        java.lang.Object[] objArray69 = null;
        java.lang.Object obj70 = treeCompiler65.or(objArray69);
        java.lang.Object obj73 = treeCompiler65.qname("", "JDOM");
        org.apache.commons.jxpath.JXPathNotFoundException jXPathNotFoundException76 = new org.apache.commons.jxpath.JXPathNotFoundException("id($null)");
        org.apache.commons.jxpath.JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError78 = new org.apache.commons.jxpath.JXPathContextFactoryConfigurationError((java.lang.Exception) jXPathNotFoundException76, "/");
        java.lang.Throwable[] throwableArray79 = jXPathContextFactoryConfigurationError78.getSuppressed();
        java.lang.Object obj80 = treeCompiler65.locationPath(true, (java.lang.Object[]) throwableArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = treeCompiler0.function((java.lang.Object) "id($null)", (java.lang.Object[]) throwableArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.commons.jxpath.ri.QName");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "boolean()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "boolean()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "boolean()");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "$null");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(jXPathContext11);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(jXPathContext25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(propertyPointer41);
        org.junit.Assert.assertNotNull(qName44);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(jXPathContext50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(jXPathContext54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(jXPathContext56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(nodePointer62);
        org.junit.Assert.assertNull(nodePointer63);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj68), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "$null");
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), ":JDOM");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), ":JDOM");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), ":JDOM");
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals(obj80.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer3 = nullPointer2.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer4 = nullPointer2.getPropertyPointer();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, node5);
        java.lang.Object obj7 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = org.apache.commons.jxpath.JXPathContext.newContext(obj7);
        java.lang.Object obj9 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(obj9);
        java.util.Locale locale11 = jXPathContext10.getLocale();
        jXPathContext8.setLocale(locale11);
        jXPathContext8.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nullPointer2.createPath(jXPathContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: id($null)");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyPointer3);
        org.junit.Assert.assertNotNull(propertyPointer4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(jXPathContext8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest2 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext3 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext1, nodeTest2);
        java.util.List list4 = attributeContext3.getContextNodeList();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, "$null");
        org.apache.commons.jxpath.ri.QName qName12 = jDOMNamespacePointer11.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest13 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext14 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext3, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest13);
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext15, nodeTest16);
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext20 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext18, nodeTest19);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext22 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext20, nodeTest21);
        boolean boolean24 = attributeContext20.setPosition(0);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer28 = nullPointer27.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer28, "$null");
        org.apache.commons.jxpath.ri.QName qName31 = jDOMNamespacePointer30.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest32 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName31);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext33 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext20, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        boolean boolean34 = nodeNameTest32.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext35 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext17, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext36 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext14, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(propertyPointer28);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory0 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale2, "hi!");
        java.lang.Object obj5 = jDOMNodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator6 = jDOMNodePointer4.namespaceIterator();
        java.lang.Object obj7 = jDOMNodePointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer9, "");
        boolean boolean12 = jDOMNamespacePointer11.isCollection();
        java.lang.Object obj13 = jDOMNamespacePointer11.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = containerPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer4, qName8, (java.lang.Object) jDOMNamespacePointer11);
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer17 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale15, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer18 = nullPointer17.getPropertyPointer();
        org.w3c.dom.Node node19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node19, locale20, "hi!");
        boolean boolean23 = dOMNodePointer22.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = dOMNodePointer22.testNode(nodeTest24);
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean29 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext32 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext30, nodeTest31);
        boolean boolean34 = attributeContext32.setPosition(54);
        java.lang.Object obj35 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = org.apache.commons.jxpath.JXPathContext.newContext(obj35);
        java.util.Locale locale37 = jXPathContext36.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer38 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale37);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer39 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName28, dynaBean29, locale37);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer22, qName28);
        java.lang.Object obj41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = containerPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer17, qName28, obj41);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest43 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28);
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer44 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName28);
        org.apache.commons.jxpath.ri.QName qName45 = variablePointer44.getName();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(propertyPointer18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(jXPathContext36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertNotNull(qName45);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = nullPointer7.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer8, "$null");
        org.apache.commons.jxpath.ri.QName qName11 = jDOMNamespacePointer10.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest12 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName11);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext13 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest12);
        boolean boolean14 = descendantContext13.isChildOrderingRequired();
        boolean boolean15 = descendantContext13.nextNode();
        boolean boolean17 = descendantContext13.setPosition(52);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        int int1 = dynaBeanPointerFactory0.getOrder();
        org.apache.commons.jxpath.ri.QName qName2 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer6 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName2, (java.lang.Object) 100, jXPathBeanInfo4, locale5);
        boolean boolean7 = beanPointer6.isLeaf();
        int int8 = beanPointer6.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName12 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser13 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean14 = dOMParser13.isIgnoringElementContentWhitespace();
        dOMParser13.setNamespaceAware(false);
        boolean boolean17 = dOMParser13.isIgnoringComments();
        java.lang.Object obj18 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = org.apache.commons.jxpath.JXPathContext.newContext(obj18);
        java.util.Locale locale20 = jXPathContext19.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = jDOMPointerFactory9.createNodePointer(qName12, (java.lang.Object) dOMParser13, locale20);
        org.apache.commons.beanutils.DynaBean dynaBean22 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer23 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer6, qName12, dynaBean22);
        org.apache.commons.jxpath.ri.compiler.Constant constant25 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 37);
        org.apache.commons.jxpath.ri.QName qName28 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean29 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext32 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext30, nodeTest31);
        boolean boolean34 = attributeContext32.setPosition(54);
        java.lang.Object obj35 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = org.apache.commons.jxpath.JXPathContext.newContext(obj35);
        java.util.Locale locale37 = jXPathContext36.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer38 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale37);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer39 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName28, dynaBean29, locale37);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = dynaBeanPointerFactory0.createNodePointer(qName12, (java.lang.Object) constant25, locale37);
        int int41 = dynaBeanPointerFactory0.getOrder();
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer44 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale42, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer45 = nullPointer44.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer46 = nullPointer44.getPropertyPointer();
        int int47 = nullPointer44.getLength();
        boolean boolean48 = nullPointer44.isNode();
        boolean boolean49 = nullPointer44.isActual();
        boolean boolean50 = nullPointer44.isLeaf();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName54 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser55 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean56 = dOMParser55.isIgnoringElementContentWhitespace();
        dOMParser55.setNamespaceAware(false);
        boolean boolean59 = dOMParser55.isIgnoringComments();
        java.lang.Object obj60 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext61 = org.apache.commons.jxpath.JXPathContext.newContext(obj60);
        java.util.Locale locale62 = jXPathContext61.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = jDOMPointerFactory51.createNodePointer(qName54, (java.lang.Object) dOMParser55, locale62);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory64 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale66, "hi!");
        java.lang.Object obj69 = jDOMNodePointer68.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator70 = jDOMNodePointer68.namespaceIterator();
        java.lang.Object obj71 = jDOMNodePointer68.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName72 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer75 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer73, "");
        boolean boolean76 = jDOMNamespacePointer75.isCollection();
        java.lang.Object obj77 = jDOMNamespacePointer75.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer78 = containerPointerFactory64.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68, qName72, (java.lang.Object) jDOMNamespacePointer75);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer79 = dynaBeanPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer44, qName54, (java.lang.Object) containerPointerFactory64);
        java.lang.String str80 = nullPointer44.asPath();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 700 + "'", int1 == 700);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(jXPathContext19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(jXPathContext36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 700 + "'", int41 == 700);
        org.junit.Assert.assertNotNull(propertyPointer45);
        org.junit.Assert.assertNotNull(propertyPointer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(jXPathContext61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer63);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0d + "'", obj69, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0d + "'", obj71, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(nodePointer78);
        org.junit.Assert.assertNull(nodePointer79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "id($null)" + "'", str80, "id($null)");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.lang.Object obj2 = org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.allocateConditionally("id('hi!')", "id(UNKNOWN)");
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = containerPointer2.getImmediateValuePointer();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale4, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer7 = nullPointer6.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer7, "$null");
        org.apache.commons.jxpath.ri.QName qName10 = jDOMNamespacePointer9.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest11 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName10);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest12 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName10);
        boolean boolean13 = containerPointer2.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer15 = new org.apache.commons.jxpath.ri.model.VariablePointer(qName14);
        java.lang.String str16 = variablePointer15.asPath();
        org.apache.commons.jxpath.Container container17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer19 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container17, locale18);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = containerPointer19.namespaceIterator();
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator20, locale21);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName26 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser27 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean28 = dOMParser27.isIgnoringElementContentWhitespace();
        dOMParser27.setNamespaceAware(false);
        boolean boolean31 = dOMParser27.isIgnoringComments();
        java.lang.Object obj32 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext33 = org.apache.commons.jxpath.JXPathContext.newContext(obj32);
        java.util.Locale locale34 = jXPathContext33.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = jDOMPointerFactory23.createNodePointer(qName26, (java.lang.Object) dOMParser27, locale34);
        org.apache.commons.beanutils.DynaBean dynaBean36 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer37 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer22, qName26, dynaBean36);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer40 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer37, "JDOM", "=");
        int int41 = containerPointer2.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) variablePointer15, (org.apache.commons.jxpath.ri.model.NodePointer) namespacePointer40);
        int int42 = variablePointer15.getLength();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(propertyPointer7);
        org.junit.Assert.assertNotNull(qName10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "$null" + "'", str16, "$null");
        org.junit.Assert.assertNull(nodeIterator20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(jXPathContext33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer4 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, (java.lang.Object) (byte) -1, dynamicPropertyHandler2, locale3);
        java.lang.Object obj5 = dynamicPointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer8 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer4, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dynamicPointer4.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext4 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest3);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) attributeContext2);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext7, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext11 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean13 = attributeContext9.setPosition(0);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer16.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer17, "$null");
        org.apache.commons.jxpath.ri.QName qName20 = jDOMNamespacePointer19.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName20);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext22 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = parentContext22.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] { parentContext22 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, evalContextArray24);
        org.apache.commons.jxpath.Container container27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer29 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container27, locale28);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = containerPointer29.namespaceIterator();
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator30, locale31);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser37 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean38 = dOMParser37.isIgnoringElementContentWhitespace();
        dOMParser37.setNamespaceAware(false);
        boolean boolean41 = dOMParser37.isIgnoringComments();
        java.lang.Object obj42 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext43 = org.apache.commons.jxpath.JXPathContext.newContext(obj42);
        java.util.Locale locale44 = jXPathContext43.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMPointerFactory33.createNodePointer(qName36, (java.lang.Object) dOMParser37, locale44);
        org.apache.commons.beanutils.DynaBean dynaBean46 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer47 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32, qName36, dynaBean46);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer50 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer47, "JDOM", "=");
        boolean boolean51 = namespacePointer50.isCollection();
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer54 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale52, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer55 = nullPointer54.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer55, "$null");
        org.apache.commons.jxpath.ri.QName qName58 = jDOMNamespacePointer57.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest59 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName58);
        boolean boolean60 = namespacePointer50.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest59);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext61 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) unionContext25, false, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest59);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer62 = ancestorContext61.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNull(nodePointer23);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertNull(nodeIterator30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(jXPathContext43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(propertyPointer55);
        org.junit.Assert.assertNotNull(qName58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        java.lang.Object obj63 = jDOMNodePointer57.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0d + "'", obj63, 100.0d);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.jxpath.ri.parser.ParseException parseException1 = new org.apache.commons.jxpath.ri.parser.ParseException("id(UNKNOWN)");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.lang.Object obj0 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext1 = org.apache.commons.jxpath.JXPathContext.newContext(obj0);
        java.util.Locale locale2 = jXPathContext1.getLocale();
        org.w3c.dom.Node node3 = null;
        java.lang.Object obj4 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = org.apache.commons.jxpath.JXPathContext.newContext(obj4);
        java.lang.Object obj6 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = org.apache.commons.jxpath.JXPathContext.newContext(obj6);
        java.util.Locale locale8 = jXPathContext7.getLocale();
        jXPathContext5.setLocale(locale8);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node3, locale8);
        int int11 = org.apache.commons.jxpath.util.ValueUtils.getLength((java.lang.Object) locale8);
        jXPathContext1.setLocale(locale8);
        org.apache.commons.jxpath.AbstractFactory abstractFactory13 = null;
        jXPathContext1.setFactory(abstractFactory13);
        java.lang.String str16 = jXPathContext1.getNamespaceURI("");
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(jXPathContext1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jXPathContext5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(jXPathContext7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver1 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver0);
        namespaceResolver1.seal();
        java.lang.Object obj3 = namespaceResolver1.clone();
        java.lang.Object obj4 = namespaceResolver1.clone();
        namespaceResolver1.registerNamespace("", ":<<unknown namespace>>");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale66, "hi!");
        java.lang.Object obj69 = jDOMNodePointer68.getBaseValue();
        java.lang.Object obj70 = jDOMNodePointer68.getNodeValue();
        jDOMNodePointer68.printPointerChain();
        boolean boolean72 = jDOMNodePointer68.isLeaf();
        boolean boolean73 = jDOMNodePointer68.isNode();
        int int74 = jDOMNodePointer68.getLength();
        org.apache.commons.jxpath.JXPathContext jXPathContext75 = jXPathContextReferenceImpl62.getRelativeContext((org.apache.commons.jxpath.Pointer) jDOMNodePointer68);
        java.lang.Object obj77 = null;
        // The following exception was thrown during execution in test generation
        try {
            jXPathContextReferenceImpl62.setValue("namespace::", obj77);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Invalid XPath: 'namespace::'. Syntax error after: 'n'");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0d + "'", obj69, 100.0d);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0d + "'", obj70, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(jXPathContext75);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.jxpath.ri.compiler.Constant constant1 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext2 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext6 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest5);
        namespaceContext6.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = namespaceContext6.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext11 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext6, true, nodeTest10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = namespaceContext6.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer13 = namespaceContext6.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer14, "");
        org.apache.commons.jxpath.ri.parser.ParseException parseException17 = new org.apache.commons.jxpath.ri.parser.ParseException();
        org.apache.commons.jxpath.ri.parser.Token token18 = parseException17.currentToken;
        java.lang.String[] strArray19 = org.apache.commons.jxpath.ri.parser.XPathParserTokenManager.jjstrLiteralImages;
        parseException17.tokenImage = strArray19;
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext23 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext21, nodeTest22);
        java.util.List list24 = attributeContext23.getContextNodeList();
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale26, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer29 = nullPointer28.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer29, "$null");
        org.apache.commons.jxpath.ri.QName qName32 = jDOMNamespacePointer31.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest33 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName32);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext23, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest33);
        boolean boolean35 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer14, (java.lang.Object) parseException17, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest33);
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext37 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) namespaceContext6, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest33, true);
        java.lang.Object obj38 = constant1.computeValue((org.apache.commons.jxpath.ri.EvalContext) precedingOrFollowingContext37);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertNull(token18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(propertyPointer29);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 9 + "'", obj38, 9);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray2 = null;
        java.lang.Object obj3 = treeCompiler0.function(18, objArray2);
        java.lang.Object obj5 = treeCompiler0.literal("id($null)");
        java.lang.Object obj7 = treeCompiler0.nodeTypeTest(63);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext10 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext8, nodeTest9);
        org.apache.commons.jxpath.ri.compiler.Constant constant12 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        boolean boolean13 = constant12.computeContextDependent();
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext14 = new org.apache.commons.jxpath.ri.axes.PredicateContext(evalContext8, (org.apache.commons.jxpath.ri.compiler.Expression) constant12);
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext15, nodeTest16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext19 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext17, nodeTest18);
        boolean boolean21 = attributeContext17.setPosition(0);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale22, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer25 = nullPointer24.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer25, "$null");
        org.apache.commons.jxpath.ri.QName qName28 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest29 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext30 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext17, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = parentContext30.getCurrentNodePointer();
        java.util.Iterator iterator32 = constant12.iterate((org.apache.commons.jxpath.ri.EvalContext) parentContext30);
        org.apache.commons.jxpath.ri.compiler.Constant constant34 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext37 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext35, nodeTest36);
        boolean boolean39 = attributeContext37.setPosition(54);
        java.lang.Object obj40 = constant34.computeValue((org.apache.commons.jxpath.ri.EvalContext) attributeContext37);
        attributeContext37.reset();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer45 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale43, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer46 = nullPointer45.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = propertyPointer46.namespaceIterator();
        org.w3c.dom.Node node48 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer51 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node48, locale49, "hi!");
        boolean boolean52 = dOMNodePointer51.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        boolean boolean54 = dOMNodePointer51.testNode(nodeTest53);
        org.apache.commons.jxpath.ri.QName qName57 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean58 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext59 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext61 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext59, nodeTest60);
        boolean boolean63 = attributeContext61.setPosition(54);
        java.lang.Object obj64 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext65 = org.apache.commons.jxpath.JXPathContext.newContext(obj64);
        java.util.Locale locale66 = jXPathContext65.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer67 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale66);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer68 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName57, dynaBean58, locale66);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer51, qName57);
        java.lang.Object obj70 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer71 = jDOMPointerFactory42.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer46, qName57, obj70);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory72 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName75 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser76 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean77 = dOMParser76.isIgnoringElementContentWhitespace();
        dOMParser76.setNamespaceAware(false);
        boolean boolean80 = dOMParser76.isIgnoringComments();
        java.lang.Object obj81 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext82 = org.apache.commons.jxpath.JXPathContext.newContext(obj81);
        java.util.Locale locale83 = jXPathContext82.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = jDOMPointerFactory72.createNodePointer(qName75, (java.lang.Object) dOMParser76, locale83);
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator85 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) attributeContext37, qName57, locale83);
        java.util.List list86 = attributeContext37.getContextNodeList();
        java.lang.Object obj87 = constant12.computeValue((org.apache.commons.jxpath.ri.EvalContext) attributeContext37);
        java.lang.Object obj88 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj89 = treeCompiler0.greaterThan(obj87, obj88);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "boolean()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "boolean()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "boolean()");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "'id($null)'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "'id($null)'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "'id($null)'");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "UNKNOWN()");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(propertyPointer25);
        org.junit.Assert.assertNotNull(qName28);
        org.junit.Assert.assertNull(nodePointer31);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 9 + "'", obj40, 9);
        org.junit.Assert.assertNotNull(propertyPointer46);
        org.junit.Assert.assertNull(nodeIterator47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(jXPathContext65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(jXPathContext82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer84);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + 9 + "'", obj87, 9);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory dynamicPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory();
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale2, "hi!");
        java.lang.Object obj5 = jDOMNodePointer4.getBaseValue();
        java.lang.Object obj6 = jDOMNodePointer4.getNodeValue();
        jDOMNodePointer4.printPointerChain();
        boolean boolean8 = jDOMNodePointer4.isLeaf();
        org.jdom.Attribute attribute9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer4, attribute9);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory11 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale13, "hi!");
        java.lang.Object obj16 = jDOMNodePointer15.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = jDOMNodePointer15.namespaceIterator();
        java.lang.Object obj18 = jDOMNodePointer15.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer20, "");
        boolean boolean23 = jDOMNamespacePointer22.isCollection();
        java.lang.Object obj24 = jDOMNamespacePointer22.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = containerPointerFactory11.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer15, qName19, (java.lang.Object) jDOMNamespacePointer22);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale26, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer29 = nullPointer28.getPropertyPointer();
        org.w3c.dom.Node node30 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer33 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node30, locale31, "hi!");
        boolean boolean34 = dOMNodePointer33.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        boolean boolean36 = dOMNodePointer33.testNode(nodeTest35);
        org.apache.commons.jxpath.ri.QName qName39 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean40 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext41 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext43 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext41, nodeTest42);
        boolean boolean45 = attributeContext43.setPosition(54);
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.util.Locale locale48 = jXPathContext47.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer49 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale48);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer50 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName39, dynaBean40, locale48);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer33, qName39);
        java.lang.Object obj52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = containerPointerFactory11.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer28, qName39, obj52);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest54 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName39);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler56 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj58 = treeCompiler56.processingInstructionTest("/");
        java.lang.Object obj59 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler56);
        boolean boolean60 = qName39.equals((java.lang.Object) "$null");
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext63 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext61, nodeTest62);
        boolean boolean65 = attributeContext63.setPosition(54);
        java.lang.Object obj66 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext67 = org.apache.commons.jxpath.JXPathContext.newContext(obj66);
        java.util.Locale locale68 = jXPathContext67.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer69 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale68);
        java.lang.String str70 = collectionPointer69.asPath();
        java.lang.Object obj71 = collectionPointer69.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext72 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest73 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext74 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext72, nodeTest73);
        boolean boolean76 = attributeContext74.setPosition(54);
        java.lang.Object obj77 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext78 = org.apache.commons.jxpath.JXPathContext.newContext(obj77);
        java.util.Locale locale79 = jXPathContext78.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer80 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale79);
        java.util.Locale locale82 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer84 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale82, "hi!");
        java.lang.Object obj85 = jDOMNodePointer84.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer86 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer88 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer86, "");
        boolean boolean89 = jDOMNamespacePointer88.isCollection();
        org.apache.commons.jxpath.ri.QName qName90 = jDOMNamespacePointer88.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator91 = jDOMNodePointer84.attributeIterator(qName90);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator92 = collectionPointer80.attributeIterator(qName90);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator93 = collectionPointer69.attributeIterator(qName90);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer94 = dynamicPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMAttributePointer10, qName39, (java.lang.Object) nodeIterator93);
        boolean boolean95 = jDOMAttributePointer10.isLeaf();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(nodePointer25);
        org.junit.Assert.assertNotNull(propertyPointer29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer53);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "$null");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(jXPathContext67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "/" + "'", str70, "/");
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 54 + "'", obj71, 54);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(jXPathContext78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 100.0d + "'", obj85, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(qName90);
        org.junit.Assert.assertNotNull(nodeIterator91);
        org.junit.Assert.assertNotNull(nodeIterator92);
        org.junit.Assert.assertNotNull(nodeIterator93);
        org.junit.Assert.assertNull(nodePointer94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.jxpath.ri.QName qName2 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean3 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext4, nodeTest5);
        boolean boolean8 = attributeContext6.setPosition(54);
        java.lang.Object obj9 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(obj9);
        java.util.Locale locale11 = jXPathContext10.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer12 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale11);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer13 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean3, locale11);
        java.lang.String str14 = dynaBeanPointer13.asPath();
        org.w3c.dom.Attr attr15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer13, attr15);
        boolean boolean17 = dOMAttributePointer16.isLeaf();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext20 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext18, nodeTest19);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext22 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext20, nodeTest21);
        boolean boolean24 = attributeContext20.setPosition(0);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale25, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer28 = nullPointer27.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer28, "$null");
        org.apache.commons.jxpath.ri.QName qName31 = jDOMNamespacePointer30.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest32 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName31);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext33 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext20, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        org.apache.commons.jxpath.ri.QName qName34 = nodeNameTest32.getNodeName();
        boolean boolean35 = dOMAttributePointer16.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest32);
        java.lang.String str36 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue((java.lang.Object) nodeNameTest32);
        org.apache.commons.jxpath.ri.QName qName37 = nodeNameTest32.getNodeName();
        org.w3c.dom.Node node38 = null;
        org.apache.commons.jxpath.ri.QName qName41 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean42 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext43 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext45 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext43, nodeTest44);
        boolean boolean47 = attributeContext45.setPosition(54);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer51 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale50);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer52 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName41, dynaBean42, locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer53 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node38, locale50);
        boolean boolean54 = qName37.equals((java.lang.Object) dOMNodePointer53);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(propertyPointer28);
        org.junit.Assert.assertNotNull(qName31);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "$null" + "'", str36, "$null");
        org.junit.Assert.assertNotNull(qName37);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj1 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant3 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj4 = treeCompiler0.mod(obj1, (java.lang.Object) constant3);
        java.lang.Object obj6 = treeCompiler0.nodeTypeTest(1);
        org.apache.commons.jxpath.ri.compiler.Constant constant8 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext9, nodeTest10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext13 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext11, nodeTest12);
        java.lang.Object obj14 = constant8.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext13);
        org.apache.commons.jxpath.ri.compiler.Expression expression15 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression15, expression16);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest18 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual17);
        boolean boolean19 = nameAttributeTest18.computeContextDependent();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler20 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj21 = null;
        org.apache.commons.jxpath.ri.compiler.Constant constant23 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        java.lang.Object obj24 = treeCompiler20.mod(obj21, (java.lang.Object) constant23);
        java.lang.Object obj25 = treeCompiler0.multiply((java.lang.Object) nameAttributeTest18, obj21);
        java.lang.Object obj27 = treeCompiler0.nodeTypeTest(20);
        java.lang.String str28 = org.apache.commons.jxpath.ri.InfoSetUtil.stringValue(obj27);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "node()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "node()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "node()");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 9 + "'", obj14, 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "UNKNOWN()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "UNKNOWN()");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UNKNOWN()" + "'", str28, "UNKNOWN()");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        org.apache.commons.jxpath.ri.compiler.Constant constant67 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        boolean boolean68 = constant67.computeContextDependent();
        boolean boolean69 = constant67.isContextDependent();
        org.apache.commons.jxpath.Pointer pointer70 = jXPathContextReferenceImpl62.getPointer("$:<<unknown namespace>>", (org.apache.commons.jxpath.ri.compiler.Expression) constant67);
        org.apache.commons.jxpath.Pointer pointer71 = jXPathContextReferenceImpl62.getContextPointer();
        jXPathContextReferenceImpl62.registerDefaultNamespace("org.apache.commons.jxpath.JXPathException: $null");
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointer70);
        org.junit.Assert.assertNotNull(pointer71);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream3 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager4 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream3);
        java.io.PrintStream printStream5 = xPathParserTokenManager4.debugStream;
        java.io.PrintStream printStream6 = xPathParserTokenManager4.debugStream;
        java.io.Reader reader7 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream10 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader7, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager11 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream10);
        java.io.PrintStream printStream12 = xPathParserTokenManager11.debugStream;
        java.io.PrintStream printStream13 = xPathParserTokenManager11.debugStream;
        xPathParserTokenManager4.debugStream = printStream13;
        java.io.Reader reader15 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream18 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader15, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager19 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream18);
        java.io.PrintStream printStream20 = xPathParserTokenManager19.debugStream;
        java.io.PrintStream printStream21 = xPathParserTokenManager19.debugStream;
        xPathParserTokenManager4.debugStream = printStream21;
        org.junit.Assert.assertNotNull(printStream5);
        org.junit.Assert.assertNotNull(printStream6);
        org.junit.Assert.assertNotNull(printStream12);
        org.junit.Assert.assertNotNull(printStream13);
        org.junit.Assert.assertNotNull(printStream20);
        org.junit.Assert.assertNotNull(printStream21);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        boolean boolean6 = dOMNodePointer3.testNode(nodeTest5);
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean10 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName9, dynaBean10, locale18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName9);
        org.apache.commons.jxpath.Container container22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer24 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container22, locale23);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = containerPointer24.namespaceIterator();
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator25, locale26);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer30 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale28, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer31 = nullPointer30.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer31, "$null");
        org.apache.commons.jxpath.ri.QName qName34 = jDOMNamespacePointer33.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest36 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName34, "id('hi!')/namespace:::<<unknown namespace>>");
        boolean boolean37 = jDOMNodePointer27.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest36);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node40, locale41, "hi!");
        java.lang.String str45 = dOMNodePointer43.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName46 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = jDOMPointerFactory39.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer43, qName46, (java.lang.Object) (byte) -1);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer51 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale49, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer52 = nullPointer51.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer53 = nullPointer51.getPropertyPointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext54 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext56 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext54, nodeTest55);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext58 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext56, nodeTest57);
        boolean boolean60 = attributeContext56.setPosition(51);
        boolean boolean61 = nullPointer51.equals((java.lang.Object) boolean60);
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer64 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale62, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer65 = nullPointer64.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer67 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer65, "$null");
        org.apache.commons.jxpath.ri.QName qName68 = jDOMNamespacePointer67.getName();
        java.lang.Object obj69 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = jDOMPointerFactory39.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer51, qName68, obj69);
        org.apache.commons.jxpath.ri.compiler.Constant constant72 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext73 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext75 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext73, nodeTest74);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest76 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext77 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext75, nodeTest76);
        java.lang.Object obj78 = constant72.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext77);
        org.apache.commons.jxpath.ri.compiler.Expression expression79 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression80 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual81 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression79, expression80);
        org.apache.commons.jxpath.ri.compiler.NameAttributeTest nameAttributeTest82 = new org.apache.commons.jxpath.ri.compiler.NameAttributeTest((org.apache.commons.jxpath.ri.compiler.Expression) constant72, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual81);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray83 = coreOperationEqual81.getArguments();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer84 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer70, (java.lang.Object) expressionArray83);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator85 = dOMNodePointer3.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest36, false, nodePointer70);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer87 = dOMNodePointer3.namespacePointer("org.apache.commons.jxpath.JXPathException: $null");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNull(nodeIterator25);
        org.junit.Assert.assertNotNull(propertyPointer31);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(nodePointer48);
        org.junit.Assert.assertNotNull(propertyPointer52);
        org.junit.Assert.assertNotNull(propertyPointer53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(propertyPointer65);
        org.junit.Assert.assertNotNull(qName68);
        org.junit.Assert.assertNull(nodePointer70);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 9 + "'", obj78, 9);
        org.junit.Assert.assertNotNull(expressionArray83);
        org.junit.Assert.assertNotNull(nodeIterator85);
        org.junit.Assert.assertNotNull(nodePointer87);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.jxpath.ri.compiler.Constant constant1 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        org.apache.commons.jxpath.ri.EvalContext evalContext2 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext2, nodeTest3);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext6 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest5);
        java.lang.Object obj7 = constant1.computeValue((org.apache.commons.jxpath.ri.EvalContext) namespaceContext6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext10 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext8, nodeTest9);
        java.lang.Object obj11 = constant1.computeValue(evalContext8);
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = org.apache.commons.jxpath.JXPathContext.newContext(obj11);
        java.util.Locale locale13 = jXPathContext12.getLocale();
        org.apache.commons.jxpath.Variables variables14 = jXPathContext12.getVariables();
        java.lang.Object obj15 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext(obj15);
        java.util.Locale locale17 = jXPathContext16.getLocale();
        org.w3c.dom.Node node18 = null;
        java.lang.Object obj19 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = org.apache.commons.jxpath.JXPathContext.newContext(obj19);
        java.lang.Object obj21 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = org.apache.commons.jxpath.JXPathContext.newContext(obj21);
        java.util.Locale locale23 = jXPathContext22.getLocale();
        jXPathContext20.setLocale(locale23);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node18, locale23);
        int int26 = org.apache.commons.jxpath.util.ValueUtils.getLength((java.lang.Object) locale23);
        jXPathContext16.setLocale(locale23);
        org.apache.commons.jxpath.AbstractFactory abstractFactory28 = null;
        jXPathContext16.setFactory(abstractFactory28);
        org.apache.commons.jxpath.Functions functions30 = jXPathContext16.getFunctions();
        jXPathContext12.setFunctions(functions30);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 9 + "'", obj7, 9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 9 + "'", obj11, 9);
        org.junit.Assert.assertNotNull(jXPathContext12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(variables14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(jXPathContext20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(jXPathContext22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(functions30);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0);
        int int2 = simpleCharStream1.bufpos;
        java.lang.String str3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) simpleCharStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = simpleCharStream1.getLine();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator3, locale4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName9 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser10 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean11 = dOMParser10.isIgnoringElementContentWhitespace();
        dOMParser10.setNamespaceAware(false);
        boolean boolean14 = dOMParser10.isIgnoringComments();
        java.lang.Object obj15 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = org.apache.commons.jxpath.JXPathContext.newContext(obj15);
        java.util.Locale locale17 = jXPathContext16.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = jDOMPointerFactory6.createNodePointer(qName9, (java.lang.Object) dOMParser10, locale17);
        org.apache.commons.beanutils.DynaBean dynaBean19 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer20 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, qName9, dynaBean19);
        org.apache.commons.jxpath.ri.model.dom.NamespacePointer namespacePointer23 = new org.apache.commons.jxpath.ri.model.dom.NamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer20, "JDOM", "=");
        java.lang.Object obj24 = namespacePointer23.getBaseValue();
        int int25 = namespacePointer23.getLength();
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jXPathContext16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.jxpath.Container container0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer2 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = containerPointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator3, locale4);
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, "$null");
        org.apache.commons.jxpath.ri.QName qName12 = jDOMNamespacePointer11.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest14 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName12, "id('hi!')/namespace:::<<unknown namespace>>");
        boolean boolean15 = jDOMNodePointer5.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest14);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale17, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer20 = nullPointer19.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = propertyPointer20.namespaceIterator();
        org.w3c.dom.Node node22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node22, locale23, "hi!");
        boolean boolean26 = dOMNodePointer25.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        boolean boolean28 = dOMNodePointer25.testNode(nodeTest27);
        org.apache.commons.jxpath.ri.QName qName31 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean32 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext35 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext33, nodeTest34);
        boolean boolean37 = attributeContext35.setPosition(54);
        java.lang.Object obj38 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = org.apache.commons.jxpath.JXPathContext.newContext(obj38);
        java.util.Locale locale40 = jXPathContext39.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer41 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale40);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer42 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName31, dynaBean32, locale40);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer25, qName31);
        java.lang.Object obj44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMPointerFactory16.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer20, qName31, obj44);
        int int46 = jDOMPointerFactory16.getOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = null;
        org.apache.commons.jxpath.ri.QName qName50 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.JXPathException jXPathException51 = new org.apache.commons.jxpath.JXPathException();
        org.apache.commons.jxpath.JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError52 = new org.apache.commons.jxpath.JXPathContextFactoryConfigurationError((java.lang.Exception) jXPathException51);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = jDOMPointerFactory16.createNodePointer(nodePointer47, qName50, (java.lang.Object) jXPathException51);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer5.attributeIterator(qName50);
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer5.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove root JDOM node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(nodeIterator3);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNotNull(qName12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyPointer20);
        org.junit.Assert.assertNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(jXPathContext39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 110 + "'", int46 == 110);
        org.junit.Assert.assertNull(nodePointer53);
        org.junit.Assert.assertNotNull(nodeIterator54);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        org.apache.commons.jxpath.ri.compiler.Constant constant67 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        boolean boolean68 = constant67.computeContextDependent();
        boolean boolean69 = constant67.isContextDependent();
        org.apache.commons.jxpath.Pointer pointer70 = jXPathContextReferenceImpl62.getPointer("$:<<unknown namespace>>", (org.apache.commons.jxpath.ri.compiler.Expression) constant67);
        org.apache.commons.jxpath.Pointer pointer71 = jXPathContextReferenceImpl62.getContextPointer();
        java.lang.String str72 = jXPathContextReferenceImpl62.getDefaultNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(pointer70);
        org.junit.Assert.assertNotNull(pointer71);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = nullPointer7.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer8, "$null");
        org.apache.commons.jxpath.ri.QName qName11 = jDOMNamespacePointer10.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest12 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName11);
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext13 = new org.apache.commons.jxpath.ri.axes.DescendantContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest12);
        boolean boolean14 = descendantContext13.isChildOrderingRequired();
        boolean boolean15 = descendantContext13.nextNode();
        int int16 = descendantContext13.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertNotNull(qName11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.String str5 = jDOMNodePointer3.asPath();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "id('hi!')" + "'", str5, "id('hi!')");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer3 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale1, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nullPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = propertyPointer9.namespaceIterator();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        boolean boolean15 = dOMNodePointer14.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = dOMNodePointer14.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext24 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext22, nodeTest23);
        boolean boolean26 = attributeContext24.setPosition(54);
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer30 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale29);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer31 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName20);
        java.lang.Object obj33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMPointerFactory5.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, qName20, obj33);
        org.apache.commons.jxpath.JXPathException jXPathException36 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler37 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer38 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer4, qName20, (java.lang.Object) jXPathException36, dynamicPropertyHandler37);
        java.io.Reader reader39 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream42 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader39, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager43 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream42);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo44 = null;
        org.w3c.dom.Node node45 = null;
        java.lang.Object obj46 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = org.apache.commons.jxpath.JXPathContext.newContext(obj46);
        java.lang.Object obj48 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = org.apache.commons.jxpath.JXPathContext.newContext(obj48);
        java.util.Locale locale50 = jXPathContext49.getLocale();
        jXPathContext47.setLocale(locale50);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node45, locale50);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer53 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName20, (java.lang.Object) simpleCharStream42, jXPathBeanInfo44, locale50);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale55, "hi!");
        java.lang.Object obj58 = jDOMNodePointer57.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer57.namespaceIterator();
        java.lang.String str60 = jDOMNodePointer57.asPath();
        java.lang.String str61 = jDOMNodePointer57.getLanguage();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl62 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) simpleCharStream42, (org.apache.commons.jxpath.Pointer) jDOMNodePointer57);
        jXPathContextReferenceImpl62.removeAll("DOM");
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale66, "hi!");
        java.lang.Object obj69 = jDOMNodePointer68.getBaseValue();
        java.lang.Object obj70 = jDOMNodePointer68.getNodeValue();
        jDOMNodePointer68.printPointerChain();
        boolean boolean72 = jDOMNodePointer68.isLeaf();
        boolean boolean73 = jDOMNodePointer68.isNode();
        int int74 = jDOMNodePointer68.getLength();
        org.apache.commons.jxpath.JXPathContext jXPathContext75 = jXPathContextReferenceImpl62.getRelativeContext((org.apache.commons.jxpath.Pointer) jDOMNodePointer68);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver76 = jXPathContextReferenceImpl62.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray79 = new org.apache.commons.jxpath.ri.compiler.Step[] {};
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath80 = new org.apache.commons.jxpath.ri.compiler.LocationPath(true, stepArray79);
        boolean boolean81 = locationPath80.isAbsolute();
        boolean boolean82 = locationPath80.isSimplePath();
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray83 = locationPath80.getSteps();
        java.util.Iterator iterator84 = jXPathContextReferenceImpl62.iterate("$:<<unknown namespace>>", (org.apache.commons.jxpath.ri.compiler.Expression) locationPath80);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(jXPathContext47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(jXPathContext49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "id('hi!')" + "'", str60, "id('hi!')");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0d + "'", obj69, 100.0d);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0d + "'", obj70, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(jXPathContext75);
        org.junit.Assert.assertNotNull(namespaceResolver76);
        org.junit.Assert.assertNotNull(stepArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(stepArray83);
        org.junit.Assert.assertNotNull(iterator84);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer3 = nullPointer2.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer4 = nullPointer2.getPropertyPointer();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, node5);
        boolean boolean7 = nullPointer2.isLeaf();
        org.jdom.Attribute attribute8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer2, attribute8);
        java.lang.Object obj10 = jDOMAttributePointer9.getImmediateNode();
        org.junit.Assert.assertNotNull(propertyPointer3);
        org.junit.Assert.assertNotNull(propertyPointer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        int int10 = collectionPointer8.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = collectionPointer8.getValuePointer();
        java.lang.Object obj12 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = collectionPointer8.namespacePointer("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.jxpath.ri.QName qName15 = collectionPointer8.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 54 + "'", obj12, 54);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNull(qName15);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        java.lang.Object obj10 = collectionPointer8.getImmediateNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext11, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition(54);
        java.lang.Object obj16 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = org.apache.commons.jxpath.JXPathContext.newContext(obj16);
        java.util.Locale locale18 = jXPathContext17.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer19 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer25, "");
        boolean boolean28 = jDOMNamespacePointer27.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer27.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer23.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = collectionPointer19.attributeIterator(qName29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = collectionPointer8.attributeIterator(qName29);
        java.util.Iterator iterator33 = org.apache.commons.jxpath.util.ValueUtils.iterate((java.lang.Object) collectionPointer8);
        org.apache.commons.jxpath.ri.QName qName36 = new org.apache.commons.jxpath.ri.QName("DOM", "id('hi!')");
        org.apache.commons.beanutils.DynaBean dynaBean37 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer38 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) collectionPointer8, qName36, dynaBean37);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 54 + "'", obj10, 54);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jXPathContext17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        java.lang.String str9 = collectionPointer8.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext((java.lang.Object) str9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertNotNull(jXPathContext10);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory dynamicPointerFactory0 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory();
        org.apache.commons.jxpath.ri.QName qName3 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext5, nodeTest6);
        boolean boolean9 = attributeContext7.setPosition(54);
        java.lang.Object obj10 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = org.apache.commons.jxpath.JXPathContext.newContext(obj10);
        java.util.Locale locale12 = jXPathContext11.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer13 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale12);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer14 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName3, dynaBean4, locale12);
        org.apache.commons.jxpath.ri.QName qName17 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = dynaBeanPointer14.attributeIterator(qName17);
        java.lang.Object obj19 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = org.apache.commons.jxpath.JXPathContext.newContext(obj19);
        java.util.Locale locale21 = jXPathContext20.getLocale();
        org.apache.commons.jxpath.AbstractFactory abstractFactory22 = jXPathContext20.getFactory();
        org.w3c.dom.Node node23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer28 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node25, locale26, "hi!");
        java.lang.String str30 = dOMNodePointer28.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMPointerFactory24.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer28, qName31, (java.lang.Object) (byte) -1);
        org.w3c.dom.Node node34 = null;
        java.lang.Object obj35 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = org.apache.commons.jxpath.JXPathContext.newContext(obj35);
        java.lang.Object obj37 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext38 = org.apache.commons.jxpath.JXPathContext.newContext(obj37);
        java.util.Locale locale39 = jXPathContext38.getLocale();
        jXPathContext36.setLocale(locale39);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node34, locale39);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer33, locale39);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node23, locale39);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = dynamicPointerFactory0.createNodePointer(qName17, (java.lang.Object) jXPathContext20, locale39);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(jXPathContext11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(jXPathContext20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNull(abstractFactory22);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(nodePointer33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(jXPathContext36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(jXPathContext38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer44);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.commons.jxpath.ri.parser.ParseException parseException0 = new org.apache.commons.jxpath.ri.parser.ParseException();
        org.apache.commons.jxpath.JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError1 = new org.apache.commons.jxpath.JXPathContextFactoryConfigurationError((java.lang.Exception) parseException0);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.Object obj5 = jDOMNodePointer3.getNodeValue();
        jDOMNodePointer3.printPointerChain();
        boolean boolean7 = jDOMNodePointer3.isLeaf();
        org.jdom.Attribute attribute8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, attribute8);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12, "hi!");
        java.lang.String str16 = dOMNodePointer14.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = jDOMPointerFactory10.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer14, qName17, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext22 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext20, nodeTest21);
        boolean boolean24 = attributeContext22.setPosition(54);
        java.lang.Object obj25 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext(obj25);
        java.util.Locale locale27 = jXPathContext26.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer28 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale27);
        boolean boolean29 = dOMNodePointer14.equals((java.lang.Object) locale27);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMAttributePointer9, locale27);
        org.apache.commons.jxpath.ri.QName qName31 = jDOMAttributePointer9.getName();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(qName31);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory dOMPointerFactory0 = new org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory();
        org.apache.commons.jxpath.Container container1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer3 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container1, locale2);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = containerPointer3.namespaceIterator();
        java.lang.String str6 = containerPointer3.getNamespaceURI("/");
        int int7 = containerPointer3.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = containerPointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer13 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName9, (java.lang.Object) 100, jXPathBeanInfo11, locale12);
        boolean boolean14 = beanPointer13.isLeaf();
        int int15 = beanPointer13.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser20 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean21 = dOMParser20.isIgnoringElementContentWhitespace();
        dOMParser20.setNamespaceAware(false);
        boolean boolean24 = dOMParser20.isIgnoringComments();
        java.lang.Object obj25 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = org.apache.commons.jxpath.JXPathContext.newContext(obj25);
        java.util.Locale locale27 = jXPathContext26.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMPointerFactory16.createNodePointer(qName19, (java.lang.Object) dOMParser20, locale27);
        org.apache.commons.beanutils.DynaBean dynaBean29 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer30 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer13, qName19, dynaBean29);
        org.apache.commons.jxpath.Container container31 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer33 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container31, locale32);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = containerPointer33.namespaceIterator();
        int int35 = containerPointer3.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer13, (org.apache.commons.jxpath.ri.model.NodePointer) containerPointer33);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory36 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale38, "hi!");
        java.lang.Object obj41 = jDOMNodePointer40.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer40.namespaceIterator();
        java.lang.Object obj43 = jDOMNodePointer40.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer45, "");
        boolean boolean48 = jDOMNamespacePointer47.isCollection();
        java.lang.Object obj49 = jDOMNamespacePointer47.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = containerPointerFactory36.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40, qName44, (java.lang.Object) jDOMNamespacePointer47);
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer53 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale51, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer54 = nullPointer53.getPropertyPointer();
        org.w3c.dom.Node node55 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer58 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node55, locale56, "hi!");
        boolean boolean59 = dOMNodePointer58.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        boolean boolean61 = dOMNodePointer58.testNode(nodeTest60);
        org.apache.commons.jxpath.ri.QName qName64 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean65 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext66 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext68 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext66, nodeTest67);
        boolean boolean70 = attributeContext68.setPosition(54);
        java.lang.Object obj71 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext72 = org.apache.commons.jxpath.JXPathContext.newContext(obj71);
        java.util.Locale locale73 = jXPathContext72.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer74 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale73);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer75 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName64, dynaBean65, locale73);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer58, qName64);
        java.lang.Object obj77 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer78 = containerPointerFactory36.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer53, qName64, obj77);
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest79 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName64);
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler81 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object obj83 = treeCompiler81.processingInstructionTest("/");
        java.lang.Object obj84 = org.apache.commons.jxpath.ri.Parser.parseExpression("$null", (org.apache.commons.jxpath.ri.Compiler) treeCompiler81);
        boolean boolean85 = qName64.equals((java.lang.Object) "$null");
        org.apache.commons.jxpath.xml.DOMParser dOMParser87 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean88 = dOMParser87.isIgnoringElementContentWhitespace();
        dOMParser87.setNamespaceAware(false);
        boolean boolean91 = dOMParser87.isValidating();
        org.apache.commons.jxpath.xml.DocumentContainer.registerXMLParser("namespace::", (org.apache.commons.jxpath.xml.XMLParser) dOMParser87);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer93 = dOMPointerFactory0.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) containerPointer33, qName64, (java.lang.Object) dOMParser87);
        java.lang.Object obj94 = containerPointer33.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer95 = containerPointer33.getImmediateValuePointer();
        int int96 = nodePointer95.getLength();
        org.junit.Assert.assertNull(nodeIterator4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(jXPathContext26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer28);
        org.junit.Assert.assertNull(nodeIterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(nodePointer50);
        org.junit.Assert.assertNotNull(propertyPointer54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(jXPathContext72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer78);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "processing-instruction('/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "processing-instruction('/')");
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals(obj84.toString(), "$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj84), "$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "$null");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(nodePointer93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(nodePointer95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer4 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName0, (java.lang.Object) 100, jXPathBeanInfo2, locale3);
        boolean boolean5 = beanPointer4.isLeaf();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale6, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer9 = nullPointer8.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer9, "$null");
        org.apache.commons.jxpath.ri.QName qName12 = jDOMNamespacePointer11.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator dOMAttributeIterator13 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) beanPointer4, qName12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.w3c.dom.Node");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(propertyPointer9);
        org.junit.Assert.assertNotNull(qName12);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale1, "hi!");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.Object obj5 = jDOMNodePointer3.getNodeValue();
        jDOMNodePointer3.printPointerChain();
        boolean boolean7 = jDOMNodePointer3.isLeaf();
        org.jdom.Attribute attribute8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, attribute8);
        boolean boolean10 = jDOMAttributePointer9.isLeaf();
        java.lang.String str11 = jDOMAttributePointer9.asPath();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "id('hi!')/@null" + "'", str11, "id('hi!')/@null");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext2 = new org.apache.commons.jxpath.ri.axes.SelfContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.Constant constant4 = new org.apache.commons.jxpath.ri.compiler.Constant((java.lang.Number) 9);
        boolean boolean5 = constant4.computeContextDependent();
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext6 = new org.apache.commons.jxpath.ri.axes.PredicateContext(evalContext0, (org.apache.commons.jxpath.ri.compiler.Expression) constant4);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext7, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext11 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean13 = attributeContext9.setPosition(0);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale14, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer17 = nullPointer16.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer17, "$null");
        org.apache.commons.jxpath.ri.QName qName20 = jDOMNamespacePointer19.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest21 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName20);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext22 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = parentContext22.getCurrentNodePointer();
        java.util.Iterator iterator24 = constant4.iterate((org.apache.commons.jxpath.ri.EvalContext) parentContext22);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator25 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator24);
        boolean boolean26 = valueIterator25.hasNext();
        boolean boolean27 = valueIterator25.hasNext();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(propertyPointer17);
        org.junit.Assert.assertNotNull(qName20);
        org.junit.Assert.assertNull(nodePointer23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition(54);
        java.lang.Object obj5 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = org.apache.commons.jxpath.JXPathContext.newContext(obj5);
        java.util.Locale locale7 = jXPathContext6.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer8 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale7);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer10 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale7, ":<<unknown namespace>>");
        boolean boolean11 = nullPointer10.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer18 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName14, (java.lang.Object) (byte) -1, dynamicPropertyHandler16, locale17);
        java.lang.Object obj19 = dynamicPointer18.getImmediateNode();
        org.w3c.dom.Node node20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer18, node20);
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl22 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext12, (java.lang.Object) 800, (org.apache.commons.jxpath.Pointer) dynamicPointer18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer25 = nullPointer10.getPointerByKey(jXPathContext12, "id()", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jXPathContext6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.util.Locale locale0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer2 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale0, "$null");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = nullPointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory4 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer7 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale5, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer8 = nullPointer7.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = propertyPointer8.namespaceIterator();
        org.w3c.dom.Node node10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node10, locale11, "hi!");
        boolean boolean14 = dOMNodePointer13.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = dOMNodePointer13.testNode(nodeTest15);
        org.apache.commons.jxpath.ri.QName qName19 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.beanutils.DynaBean dynaBean20 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext23 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext21, nodeTest22);
        boolean boolean25 = attributeContext23.setPosition(54);
        java.lang.Object obj26 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = org.apache.commons.jxpath.JXPathContext.newContext(obj26);
        java.util.Locale locale28 = jXPathContext27.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer29 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) 54, locale28);
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer30 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName19, dynaBean20, locale28);
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer13, qName19);
        java.lang.Object obj32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMPointerFactory4.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer8, qName19, obj32);
        org.apache.commons.jxpath.JXPathException jXPathException35 = new org.apache.commons.jxpath.JXPathException("$null");
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler36 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer37 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(nodePointer3, qName19, (java.lang.Object) jXPathException35, dynamicPropertyHandler36);
        java.io.Reader reader38 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream41 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader38, 15, 62);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager42 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream41);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo43 = null;
        org.w3c.dom.Node node44 = null;
        java.lang.Object obj45 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = org.apache.commons.jxpath.JXPathContext.newContext(obj45);
        java.lang.Object obj47 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext48 = org.apache.commons.jxpath.JXPathContext.newContext(obj47);
        java.util.Locale locale49 = jXPathContext48.getLocale();
        jXPathContext46.setLocale(locale49);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer51 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node44, locale49);
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer52 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName19, (java.lang.Object) simpleCharStream41, jXPathBeanInfo43, locale49);
        java.io.Reader reader53 = null;
        simpleCharStream41.ReInit(reader53, 66, 72, 54);
        java.io.Reader reader58 = null;
        simpleCharStream41.ReInit(reader58);
        simpleCharStream41.Done();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(propertyPointer8);
        org.junit.Assert.assertNull(nodeIterator9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(jXPathContext27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer33);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(jXPathContext46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(jXPathContext48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer4 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, (java.lang.Object) (byte) -1, dynamicPropertyHandler2, locale3);
        boolean boolean5 = dynamicPointer4.isActual();
        dynamicPointer4.setAttribute(false);
        java.lang.String str8 = dynamicPointer4.toString();
        java.lang.Object obj9 = dynamicPointer4.getNodeValue();
        boolean boolean10 = dynamicPointer4.isActual();
        java.lang.Object obj11 = dynamicPointer4.getRootNode();
        org.apache.commons.jxpath.Container container12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer14 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container12, locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = containerPointer14.namespaceIterator();
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodeIterator15, locale16);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName21 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser22 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean23 = dOMParser22.isIgnoringElementContentWhitespace();
        dOMParser22.setNamespaceAware(false);
        boolean boolean26 = dOMParser22.isIgnoringComments();
        java.lang.Object obj27 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = org.apache.commons.jxpath.JXPathContext.newContext(obj27);
        java.util.Locale locale29 = jXPathContext28.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = jDOMPointerFactory18.createNodePointer(qName21, (java.lang.Object) dOMParser22, locale29);
        org.apache.commons.beanutils.DynaBean dynaBean31 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer32 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, qName21, dynaBean31);
        org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory containerPointerFactory33 = new org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory();
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100.0d, locale35, "hi!");
        java.lang.Object obj38 = jDOMNodePointer37.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator39 = jDOMNodePointer37.namespaceIterator();
        java.lang.Object obj40 = jDOMNodePointer37.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer(nodePointer42, "");
        boolean boolean45 = jDOMNamespacePointer44.isCollection();
        java.lang.Object obj46 = jDOMNamespacePointer44.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = containerPointerFactory33.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, qName41, (java.lang.Object) jDOMNamespacePointer44);
        org.apache.commons.jxpath.ri.QName qName50 = new org.apache.commons.jxpath.ri.QName("id('hi!')", "");
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext54 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext51, false, nodeTest53);
        boolean boolean55 = qName50.equals((java.lang.Object) false);
        org.apache.commons.jxpath.ri.EvalContext evalContext56 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext58 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext56, nodeTest57);
        org.apache.commons.jxpath.ri.EvalContext evalContext59 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext61 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext59, nodeTest60);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext63 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext61, nodeTest62);
        boolean boolean65 = attributeContext61.setPosition(0);
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer68 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(locale66, "$null");
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer69 = nullPointer68.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer69, "$null");
        org.apache.commons.jxpath.ri.QName qName72 = jDOMNamespacePointer71.getName();
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest73 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName72);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext74 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext61, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest73);
        boolean boolean75 = nodeNameTest73.isWildcard();
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext76 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext58, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest73);
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory77 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName80 = new org.apache.commons.jxpath.ri.QName("", "<<unknown namespace>>");
        org.apache.commons.jxpath.xml.DOMParser dOMParser81 = new org.apache.commons.jxpath.xml.DOMParser();
        boolean boolean82 = dOMParser81.isIgnoringElementContentWhitespace();
        dOMParser81.setNamespaceAware(false);
        boolean boolean85 = dOMParser81.isIgnoringComments();
        java.lang.Object obj86 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.JXPathContext jXPathContext87 = org.apache.commons.jxpath.JXPathContext.newContext(obj86);
        java.util.Locale locale88 = jXPathContext87.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer89 = jDOMPointerFactory77.createNodePointer(qName80, (java.lang.Object) dOMParser81, locale88);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer90 = containerPointerFactory33.createNodePointer(qName50, (java.lang.Object) selfContext76, locale88);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator91 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) selfContext76);
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo92 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer93 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer4, qName21, (java.lang.Object) selfContext76, jXPathBeanInfo92);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNull(nodeIterator15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jXPathContext28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer30);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertNotNull(nodeIterator39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(nodePointer47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(propertyPointer69);
        org.junit.Assert.assertNotNull(qName72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(jXPathContext87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNull(nodePointer89);
        org.junit.Assert.assertNull(nodePointer90);
    }
}

