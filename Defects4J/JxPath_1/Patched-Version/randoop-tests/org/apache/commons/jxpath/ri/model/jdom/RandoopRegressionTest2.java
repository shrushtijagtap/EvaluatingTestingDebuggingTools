package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1001");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.beanutils.DynaBean dynaBean2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer4 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName1, dynaBean2, locale3);
        org.apache.commons.jxpath.ri.QName qName5 = dynaBeanPointer4.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer4, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodePointer7.namespacePointer("hi!");
        boolean boolean10 = jDOMNodePointer7.isCollection();
        boolean boolean12 = jDOMNodePointer7.equals((java.lang.Object) "");
        boolean boolean13 = jDOMNodePointer7.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = null;
        org.jdom.Attribute attribute15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer14, attribute15);
        java.lang.Object obj17 = jDOMAttributePointer16.getBaseValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) boolean13, (org.apache.commons.jxpath.Pointer) jDOMAttributePointer16);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = jXPathContextReferenceImpl18.getParentContext();
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer23 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = dynaBeanPointer23.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer23, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer26.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer29 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26);
        java.lang.Object obj30 = nullPropertyPointer29.clone();
        org.apache.commons.jxpath.ri.axes.RootContext rootContext31 = new org.apache.commons.jxpath.ri.axes.RootContext(jXPathContextReferenceImpl18, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = null;
        org.jdom.Attribute attribute33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer32, attribute33);
        java.lang.Object obj35 = jDOMAttributePointer34.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName36 = jDOMAttributePointer34.getName();
        org.apache.commons.jxpath.ri.EvalContext evalContext37 = rootContext31.getVariableContext(qName36);
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(jXPathContext19);
        org.junit.Assert.assertNull(qName24);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "/*");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "/*");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "/*");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNotNull(evalContext37);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1002");
        org.apache.commons.jxpath.Container container0 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory1 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName2 = null;
        org.apache.commons.beanutils.DynaBean dynaBean3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer5 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean3, locale4);
        org.apache.commons.jxpath.ri.QName qName6 = dynaBeanPointer5.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer5, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = jDOMNodePointer8.namespacePointer("hi!");
        boolean boolean11 = jDOMNodePointer8.isCollection();
        org.apache.commons.jxpath.ri.QName qName13 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj14 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler15 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer16 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, qName13, obj14, dynamicPropertyHandler15);
        java.lang.String str17 = qName13.toString();
        org.apache.commons.jxpath.ri.QName qName18 = null;
        org.apache.commons.beanutils.DynaBean dynaBean19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer21 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName18, dynaBean19, locale20);
        org.apache.commons.jxpath.ri.QName qName22 = dynaBeanPointer21.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer21, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext25, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = dynaBeanPointer21.createPath(jXPathContext27);
        java.util.List list30 = jXPathContext27.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.QName qName32 = null;
        org.apache.commons.beanutils.DynaBean dynaBean33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer35 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName32, dynaBean33, locale34);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer35, "");
        boolean boolean38 = jDOMNamespacePointer37.isCollection();
        java.lang.String str39 = jDOMNamespacePointer37.getNamespaceURI();
        boolean boolean40 = jDOMNamespacePointer37.isCollection();
        org.apache.commons.jxpath.ri.QName qName41 = jDOMNamespacePointer37.getName();
        org.apache.commons.jxpath.ri.QName qName43 = null;
        org.apache.commons.beanutils.DynaBean dynaBean44 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer46 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName43, dynaBean44, locale45);
        org.apache.commons.jxpath.ri.QName qName47 = dynaBeanPointer46.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer46, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext52 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext50, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = dynaBeanPointer46.createPath(jXPathContext52);
        java.util.Locale locale54 = jXPathContext52.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer55 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale54);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer56 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName41, locale54);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer57 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node31, locale54);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = beanPointerFactory1.createNodePointer(qName13, (java.lang.Object) "org.apache.commons.jxpath.JXPathContextFactory", locale54);
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer59 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container0, locale54);
        java.lang.Object obj60 = containerPointer59.getBaseValue();
        java.io.Reader reader61 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream62 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader61);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager64 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream62, 0);
        boolean boolean65 = containerPointer59.equals((java.lang.Object) 0);
        int int66 = containerPointer59.getLength();
        org.junit.Assert.assertNull(qName6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(qName22);
        org.junit.Assert.assertNotNull(jXPathContext27);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(qName41);
        org.junit.Assert.assertNull(qName47);
        org.junit.Assert.assertNotNull(jXPathContext52);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodePointer58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1003");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, "");
        boolean boolean6 = jDOMNamespacePointer5.isCollection();
        java.lang.String str7 = jDOMNamespacePointer5.getNamespaceURI();
        boolean boolean8 = jDOMNamespacePointer5.isCollection();
        org.apache.commons.jxpath.ri.QName qName9 = jDOMNamespacePointer5.getName();
        org.apache.commons.jxpath.ri.QName qName11 = null;
        org.apache.commons.beanutils.DynaBean dynaBean12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer14 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName11, dynaBean12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = dynaBeanPointer14.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer14, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext18, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = dynaBeanPointer14.createPath(jXPathContext20);
        java.util.Locale locale22 = jXPathContext20.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer23 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale22);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer24 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName9, locale22);
        java.lang.String str25 = nullPointer24.asPath();
        boolean boolean26 = nullPointer24.isLeaf();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer27 = nullPointer24.getPropertyPointer();
        java.lang.String str28 = nullPointer24.asPath();
        org.apache.commons.jxpath.CompiledExpression compiledExpression30 = org.apache.commons.jxpath.JXPathContext.compile("*");
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = null;
        org.apache.commons.jxpath.ri.QName qName32 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest34 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName32, "hi!");
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.beanutils.DynaBean dynaBean36 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer38 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName35, dynaBean36, locale37);
        org.apache.commons.jxpath.ri.QName qName39 = dynaBeanPointer38.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer38, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = jDOMNodePointer41.namespacePointer("hi!");
        boolean boolean44 = jDOMNodePointer41.isCollection();
        boolean boolean46 = jDOMNodePointer41.equals((java.lang.Object) "");
        boolean boolean47 = jDOMNodePointer41.isLeaf();
        java.lang.Object obj48 = jDOMNodePointer41.getValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl49 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext31, (java.lang.Object) nodeNameTest34, (org.apache.commons.jxpath.Pointer) jDOMNodePointer41);
        jXPathContextReferenceImpl49.registerNamespace("hi!", "Empty expression context");
        java.util.Iterator iterator53 = compiledExpression30.iteratePointers((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl49);
        java.lang.String str54 = jXPathContextReferenceImpl49.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.QName qName55 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = null;
        org.w3c.dom.Attr attr58 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer59 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer(nodePointer57, attr58);
        org.apache.commons.jxpath.ri.QName qName60 = null;
        org.apache.commons.beanutils.DynaBean dynaBean61 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer63 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName60, dynaBean61, locale62);
        org.apache.commons.jxpath.ri.QName qName64 = dynaBeanPointer63.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer63, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = jDOMNodePointer66.namespacePointer("hi!");
        boolean boolean69 = jDOMNodePointer66.isCollection();
        boolean boolean71 = jDOMNodePointer66.equals((java.lang.Object) "");
        boolean boolean72 = jDOMNodePointer66.isLeaf();
        org.apache.commons.jxpath.ri.QName qName73 = null;
        org.apache.commons.beanutils.DynaBean dynaBean74 = null;
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer76 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName73, dynaBean74, locale75);
        org.apache.commons.jxpath.ri.QName qName77 = dynaBeanPointer76.getName();
        java.lang.String str79 = dynaBeanPointer76.getNamespaceURI("");
        java.lang.Object obj80 = dynaBeanPointer76.getImmediateNode();
        int int81 = dOMAttributePointer59.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer66, (org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer82 = nullPointer24.createChild((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl49, qName55, 75, (java.lang.Object) jDOMNodePointer66);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot create the root object: null()");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNull(qName15);
        org.junit.Assert.assertNotNull(jXPathContext20);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "null()" + "'", str25, "null()");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(propertyPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null()" + "'", str28, "null()");
        org.junit.Assert.assertNotNull(compiledExpression30);
        org.junit.Assert.assertNull(qName39);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(qName64);
        org.junit.Assert.assertNotNull(nodePointer68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(qName77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1004");
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.beanutils.DynaBean dynaBean2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer4 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName1, dynaBean2, locale3);
        org.apache.commons.jxpath.ri.QName qName5 = dynaBeanPointer4.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer4, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext8, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = dynaBeanPointer4.createPath(jXPathContext10);
        java.util.Locale locale12 = jXPathContext10.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer13 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale12);
        java.lang.Object obj14 = collectionPointer13.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = collectionPointer13.namespacePointer("/namespace::$null");
        boolean boolean17 = collectionPointer13.isLeaf();
        org.apache.commons.jxpath.ri.QName qName18 = null;
        org.apache.commons.beanutils.DynaBean dynaBean19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer21 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName18, dynaBean19, locale20);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer21, "");
        boolean boolean24 = jDOMNamespacePointer23.isCollection();
        java.lang.String str25 = jDOMNamespacePointer23.getNamespaceURI();
        boolean boolean26 = jDOMNamespacePointer23.isCollection();
        org.apache.commons.jxpath.ri.QName qName27 = jDOMNamespacePointer23.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = collectionPointer13.attributeIterator(qName27);
        boolean boolean29 = collectionPointer13.isContainer();
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(qName27);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1005");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.beanutils.DynaBean dynaBean2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer4 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName1, dynaBean2, locale3);
        org.apache.commons.jxpath.ri.QName qName5 = dynaBeanPointer4.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer4, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodePointer7.namespacePointer("hi!");
        boolean boolean10 = jDOMNodePointer7.isCollection();
        boolean boolean12 = jDOMNodePointer7.equals((java.lang.Object) "");
        boolean boolean13 = jDOMNodePointer7.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = null;
        org.jdom.Attribute attribute15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer14, attribute15);
        java.lang.Object obj17 = jDOMAttributePointer16.getBaseValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) boolean13, (org.apache.commons.jxpath.Pointer) jDOMAttributePointer16);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = jXPathContextReferenceImpl18.getParentContext();
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer23 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = dynaBeanPointer23.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer23, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer26.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer29 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26);
        java.lang.Object obj30 = nullPropertyPointer29.clone();
        org.apache.commons.jxpath.ri.axes.RootContext rootContext31 = new org.apache.commons.jxpath.ri.axes.RootContext(jXPathContextReferenceImpl18, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer29);
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext36 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext33, false, nodeTest35);
        int int37 = descendantContext36.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.Step step39 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray40 = new org.apache.commons.jxpath.ri.compiler.Step[] { step39 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath41 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray40);
        boolean boolean42 = locationPath41.isAbsolute();
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext43 = new org.apache.commons.jxpath.ri.axes.PredicateContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext36, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer44 = jXPathContextReferenceImpl18.getPointer("", (org.apache.commons.jxpath.ri.compiler.Expression) locationPath41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(jXPathContext19);
        org.junit.Assert.assertNull(qName24);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "/*");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "/*");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "/*");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(stepArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1006");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = dynaBeanPointer3.namespacePointer("");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = dynaBeanPointer3.namespacePointer("$null");
        org.apache.commons.jxpath.ri.QName qName11 = null;
        org.apache.commons.beanutils.DynaBean dynaBean12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer14 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName11, dynaBean12, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = dynaBeanPointer14.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer14, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext18, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = dynaBeanPointer14.createPath(jXPathContext20);
        java.util.List list23 = jXPathContext20.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = dynaBeanPointer3.createPath(jXPathContext20);
        java.lang.String str26 = dynaBeanPointer3.getNamespaceURI("*");
        org.apache.commons.jxpath.ri.QName qName27 = null;
        org.apache.commons.beanutils.DynaBean dynaBean28 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer30 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName27, dynaBean28, locale29);
        org.apache.commons.jxpath.ri.QName qName31 = dynaBeanPointer30.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer30, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = jDOMNodePointer33.namespacePointer("hi!");
        boolean boolean36 = jDOMNodePointer33.isCollection();
        org.apache.commons.jxpath.ri.QName qName38 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj39 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler40 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer41 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer33, qName38, obj39, dynamicPropertyHandler40);
        org.apache.commons.jxpath.ri.QName qName43 = new org.apache.commons.jxpath.ri.QName("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = dynamicPointer41.attributeIterator(qName43);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = dynaBeanPointer3.attributeIterator(qName43);
        boolean boolean46 = dynaBeanPointer3.isCollection();
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNull(qName15);
        org.junit.Assert.assertNotNull(jXPathContext20);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(qName31);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1007");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.beanutils.DynaBean dynaBean2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer4 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName1, dynaBean2, locale3);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer4, "");
        boolean boolean7 = jDOMNamespacePointer6.isCollection();
        java.lang.String str8 = jDOMNamespacePointer6.getNamespaceURI();
        boolean boolean9 = jDOMNamespacePointer6.isCollection();
        org.apache.commons.jxpath.ri.QName qName10 = jDOMNamespacePointer6.getName();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.beanutils.DynaBean dynaBean13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer15 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName12, dynaBean13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = dynaBeanPointer15.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer15, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext21 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext19, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = dynaBeanPointer15.createPath(jXPathContext21);
        java.util.Locale locale23 = jXPathContext21.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer24 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale23);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer25 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName10, locale23);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale23);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        org.apache.commons.beanutils.DynaBean dynaBean28 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer30 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName27, dynaBean28, locale29);
        org.apache.commons.jxpath.ri.QName qName31 = dynaBeanPointer30.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer30, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dynaBeanPointer30.namespacePointer("");
        java.lang.Object obj36 = dynaBeanPointer30.getImmediateNode();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer37 = dynaBeanPointer30.getPropertyPointer();
        org.apache.commons.jxpath.ri.QName qName38 = null;
        org.apache.commons.beanutils.DynaBean dynaBean39 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer41 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName38, dynaBean39, locale40);
        org.apache.commons.jxpath.ri.QName qName42 = dynaBeanPointer41.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer41, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = jDOMNodePointer44.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer47 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer44);
        java.lang.String[] strArray48 = nullPropertyPointer47.getPropertyNames();
        boolean boolean49 = nullPropertyPointer47.isContainer();
        java.lang.String str50 = nullPropertyPointer47.asPath();
        java.lang.Object obj51 = nullPropertyPointer47.getImmediateNode();
        java.lang.String str52 = nullPropertyPointer47.getPropertyName();
        // The following exception was thrown during execution in test generation
        try {
            int int53 = dOMNodePointer26.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer37, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(qName10);
        org.junit.Assert.assertNull(qName16);
        org.junit.Assert.assertNotNull(jXPathContext21);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNull(qName31);
        org.junit.Assert.assertNull(nodePointer35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(propertyPointer37);
        org.junit.Assert.assertNull(qName42);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/*" + "'", str50, "/*");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "*" + "'", str52, "*");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1008");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, "");
        java.lang.Object obj6 = dynaBeanPointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer7 = dynaBeanPointer3.getPropertyPointer();
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory8 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.beanutils.DynaBean dynaBean10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer12 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName9, dynaBean10, locale11);
        org.apache.commons.jxpath.ri.QName qName13 = dynaBeanPointer12.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer12, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = jDOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = jDOMNodePointer15.isCollection();
        org.apache.commons.jxpath.ri.QName qName20 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj21 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler22 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer23 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer15, qName20, obj21, dynamicPropertyHandler22);
        java.lang.String str24 = qName20.toString();
        org.apache.commons.jxpath.ri.QName qName25 = null;
        org.apache.commons.beanutils.DynaBean dynaBean26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer28 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName25, dynaBean26, locale27);
        org.apache.commons.jxpath.ri.QName qName29 = dynaBeanPointer28.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer28, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext34 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext32, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dynaBeanPointer28.createPath(jXPathContext34);
        java.util.List list37 = jXPathContext34.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        org.w3c.dom.Node node38 = null;
        org.apache.commons.jxpath.ri.QName qName39 = null;
        org.apache.commons.beanutils.DynaBean dynaBean40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer42 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName39, dynaBean40, locale41);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer42, "");
        boolean boolean45 = jDOMNamespacePointer44.isCollection();
        java.lang.String str46 = jDOMNamespacePointer44.getNamespaceURI();
        boolean boolean47 = jDOMNamespacePointer44.isCollection();
        org.apache.commons.jxpath.ri.QName qName48 = jDOMNamespacePointer44.getName();
        org.apache.commons.jxpath.ri.QName qName50 = null;
        org.apache.commons.beanutils.DynaBean dynaBean51 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer53 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName50, dynaBean51, locale52);
        org.apache.commons.jxpath.ri.QName qName54 = dynaBeanPointer53.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer53, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext57 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext59 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext57, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer60 = dynaBeanPointer53.createPath(jXPathContext59);
        java.util.Locale locale61 = jXPathContext59.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer62 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale61);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer63 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName48, locale61);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer64 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node38, locale61);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer65 = beanPointerFactory8.createNodePointer(qName20, (java.lang.Object) "org.apache.commons.jxpath.JXPathContextFactory", locale61);
        boolean boolean66 = propertyPointer7.equals((java.lang.Object) beanPointerFactory8);
        org.apache.commons.jxpath.ri.QName qName67 = null;
        org.apache.commons.beanutils.DynaBean dynaBean68 = null;
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer70 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName67, dynaBean68, locale69);
        org.apache.commons.jxpath.ri.QName qName71 = dynaBeanPointer70.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer70, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer75 = jDOMNodePointer73.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer76 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73);
        java.lang.String[] strArray77 = nullPropertyPointer76.getPropertyNames();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer78 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer76);
        org.apache.commons.jxpath.ri.QName qName79 = null;
        org.apache.commons.jxpath.ri.QName qName80 = null;
        org.apache.commons.beanutils.DynaBean dynaBean81 = null;
        java.util.Locale locale82 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer83 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName80, dynaBean81, locale82);
        org.apache.commons.jxpath.ri.QName qName84 = dynaBeanPointer83.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer86 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer83, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext87 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext89 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext87, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer90 = dynaBeanPointer83.createPath(jXPathContext89);
        java.util.List list92 = jXPathContext89.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        boolean boolean93 = jXPathContext89.isLenient();
        org.apache.commons.jxpath.AbstractFactory abstractFactory94 = jXPathContext89.getFactory();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler95 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer96 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer78, qName79, (java.lang.Object) jXPathContext89, dynamicPropertyHandler95);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer97 = propertyPointer7.createPath(jXPathContext89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(propertyPointer7);
        org.junit.Assert.assertNull(qName13);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(qName29);
        org.junit.Assert.assertNotNull(jXPathContext34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(qName48);
        org.junit.Assert.assertNull(qName54);
        org.junit.Assert.assertNotNull(jXPathContext59);
        org.junit.Assert.assertNotNull(nodePointer60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodePointer65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(qName71);
        org.junit.Assert.assertNotNull(nodePointer75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNull(qName84);
        org.junit.Assert.assertNotNull(jXPathContext89);
        org.junit.Assert.assertNotNull(nodePointer90);
        org.junit.Assert.assertNotNull(list92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(abstractFactory94);
    }
}

