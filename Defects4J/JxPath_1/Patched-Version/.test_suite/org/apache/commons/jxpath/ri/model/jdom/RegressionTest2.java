package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        java.lang.String str20 = jXPathContextReferenceImpl18.getNamespaceURI("/");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver21 = jXPathContextReferenceImpl18.getNamespaceResolver();
        org.apache.commons.jxpath.ri.QName qName22 = null;
        org.apache.commons.beanutils.DynaBean dynaBean23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer25 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName22, dynaBean23, locale24);
        org.apache.commons.jxpath.ri.QName qName26 = dynaBeanPointer25.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer25, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = jDOMNodePointer28.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer31 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28);
        java.lang.String[] strArray32 = nullPropertyPointer31.getPropertyNames();
        boolean boolean33 = nullPropertyPointer31.isContainer();
        java.lang.String str34 = nullPropertyPointer31.asPath();
        java.lang.Object obj35 = nullPropertyPointer31.getImmediateNode();
        java.lang.String str36 = nullPropertyPointer31.getPropertyName();
        jXPathContextReferenceImpl18.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) nullPropertyPointer31);
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(namespaceResolver21);
        org.junit.Assert.assertNull(qName26);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/*" + "'", str34, "/*");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "*" + "'", str36, "*");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Attr attr1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer(nodePointer0, attr1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.beanutils.DynaBean dynaBean4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer6 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName3, dynaBean4, locale5);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer6, "");
        int int9 = jDOMNamespacePointer8.getLength();
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
        java.lang.String str24 = collectionPointer23.asPath();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = collectionPointer23.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName26 = null;
        org.apache.commons.beanutils.DynaBean dynaBean27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer29 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName26, dynaBean27, locale28);
        org.apache.commons.jxpath.ri.QName qName30 = dynaBeanPointer29.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer29, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMNodePointer32.namespacePointer("hi!");
        boolean boolean35 = jDOMNodePointer32.isCollection();
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj38 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler39 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer40 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32, qName37, obj38, dynamicPropertyHandler39);
        org.apache.commons.jxpath.ri.QName qName42 = new org.apache.commons.jxpath.ri.QName("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = dynamicPointer40.attributeIterator(qName42);
        java.lang.Object obj44 = dynamicPointer40.getBaseValue();
        boolean boolean45 = collectionPointer23.equals((java.lang.Object) dynamicPointer40);
        org.apache.commons.jxpath.ri.model.beans.LangAttributePointer langAttributePointer46 = new org.apache.commons.jxpath.ri.model.beans.LangAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer40);
        java.lang.String str47 = langAttributePointer46.getNamespaceURI();
        int int48 = dOMAttributePointer2.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer8, (org.apache.commons.jxpath.ri.model.NodePointer) langAttributePointer46);
        org.apache.commons.jxpath.ri.QName qName49 = null;
        org.apache.commons.beanutils.DynaBean dynaBean50 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer52 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName49, dynaBean50, locale51);
        org.apache.commons.jxpath.ri.QName qName53 = dynaBeanPointer52.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer52, (java.lang.Object) (byte) -1);
        java.lang.Object obj56 = jDOMNodePointer55.getRootNode();
        int int57 = jDOMNodePointer55.getLength();
        java.lang.String str58 = jDOMNodePointer55.getNamespaceURI();
        org.apache.commons.jxpath.ri.EvalContext evalContext59 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest61 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext62 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext59, false, nodeTest61);
        int int63 = descendantContext62.getCurrentPosition();
        int int64 = descendantContext62.getCurrentPosition();
        org.apache.commons.jxpath.ri.QName qName65 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest67 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName65, "hi!");
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext68 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext62, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest67);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = null;
        org.jdom.Attribute attribute71 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer72 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer70, attribute71);
        boolean boolean73 = jDOMAttributePointer72.isLeaf();
        org.apache.commons.jxpath.ri.QName qName74 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator75 = jDOMAttributePointer72.attributeIterator(qName74);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator76 = jDOMNodePointer55.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest67, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMAttributePointer72);
        org.apache.commons.jxpath.ri.QName qName77 = null;
        org.apache.commons.beanutils.DynaBean dynaBean78 = null;
        java.util.Locale locale79 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer80 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName77, dynaBean78, locale79);
        org.apache.commons.jxpath.ri.QName qName81 = dynaBeanPointer80.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer83 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer80, (java.lang.Object) (byte) -1);
        int int84 = langAttributePointer46.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer55, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer83);
        java.lang.String str86 = jDOMNodePointer83.getNamespaceURI("Empty expression context");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(qName15);
        org.junit.Assert.assertNotNull(jXPathContext20);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertNull(nodeIterator25);
        org.junit.Assert.assertNull(qName30);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(qName53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(nodeIterator75);
        org.junit.Assert.assertNotNull(nodeIterator76);
        org.junit.Assert.assertNull(qName81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.jdom.Attribute attribute1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer0, attribute1);
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer4 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer(nodePointer0, (int) (short) 0);
        java.lang.Object obj5 = nullElementPointer4.getImmediateNode();
        java.lang.Object obj6 = nullElementPointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.beanutils.DynaBean dynaBean8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer10 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName7, dynaBean8, locale9);
        org.apache.commons.jxpath.ri.QName qName11 = dynaBeanPointer10.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer10, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = jDOMNodePointer13.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.lang.String[] strArray17 = nullPropertyPointer16.getPropertyNames();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer16);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer23 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = dynaBeanPointer23.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer23, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext29 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext27, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = dynaBeanPointer23.createPath(jXPathContext29);
        java.util.List list32 = jXPathContext29.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        boolean boolean33 = jXPathContext29.isLenient();
        org.apache.commons.jxpath.AbstractFactory abstractFactory34 = jXPathContext29.getFactory();
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler35 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer36 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer18, qName19, (java.lang.Object) jXPathContext29, dynamicPropertyHandler35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nullElementPointer4.createPath(jXPathContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(qName11);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(qName24);
        org.junit.Assert.assertNotNull(jXPathContext29);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(abstractFactory34);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.QName qName2 = null;
        org.apache.commons.beanutils.DynaBean dynaBean3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer5 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName2, dynaBean3, locale4);
        org.apache.commons.jxpath.ri.QName qName6 = dynaBeanPointer5.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer5, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext9, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = dynaBeanPointer5.createPath(jXPathContext11);
        java.util.Locale locale13 = jXPathContext11.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer14 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale13);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale13, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str17 = dOMNodePointer16.asPath();
        org.apache.commons.jxpath.ri.compiler.NodeTypeTest nodeTypeTest19 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest(50);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        org.apache.commons.beanutils.DynaBean dynaBean22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer24 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName21, dynaBean22, locale23);
        org.apache.commons.jxpath.ri.QName qName25 = dynaBeanPointer24.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer24, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = jDOMNodePointer27.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer30 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27);
        java.lang.String[] strArray31 = nullPropertyPointer30.getPropertyNames();
        boolean boolean32 = nullPropertyPointer30.isContainer();
        int int33 = nullPropertyPointer30.getLength();
        org.apache.commons.jxpath.ri.QName qName34 = nullPropertyPointer30.getName();
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.jxpath.JXPathBeanInfo jXPathBeanInfo37 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointer beanPointer39 = new org.apache.commons.jxpath.ri.model.beans.BeanPointer(qName35, (java.lang.Object) 800, jXPathBeanInfo37, locale38);
        boolean boolean40 = nullPropertyPointer30.equals((java.lang.Object) jXPathBeanInfo37);
        org.apache.commons.jxpath.ri.EvalContext evalContext41 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext44 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext41, false, nodeTest43);
        int int45 = descendantContext44.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.Step step47 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray48 = new org.apache.commons.jxpath.ri.compiler.Step[] { step47 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath49 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray48);
        boolean boolean50 = locationPath49.isAbsolute();
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext51 = new org.apache.commons.jxpath.ri.axes.PredicateContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext44, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath49);
        org.apache.commons.jxpath.ri.EvalContext evalContext52 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext55 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext52, false, nodeTest54);
        org.apache.commons.jxpath.ri.QName qName56 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest58 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName56, "hi!");
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext60 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext55, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest58, true);
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext61 = new org.apache.commons.jxpath.ri.axes.NamespaceContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext44, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest58);
        boolean boolean62 = nullPropertyPointer30.equals((java.lang.Object) namespaceContext61);
        nullPropertyPointer30.setNameAttributeValue("/namespace::hi!");
        int int65 = nullPropertyPointer30.getLength();
        org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator dOMNodeIterator66 = new org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer16, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeTypeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer30);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = dOMNodePointer16.namespacePointer("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNull(qName6);
        org.junit.Assert.assertNotNull(jXPathContext11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "id('\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000')" + "'", str17, "id('\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000')");
        org.junit.Assert.assertNull(qName25);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(qName34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(stepArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(nodePointer68);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest3 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName1, "hi!");
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.beanutils.DynaBean dynaBean5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer7 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName4, dynaBean5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = dynaBeanPointer7.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer10.namespacePointer("hi!");
        boolean boolean13 = jDOMNodePointer10.isCollection();
        boolean boolean15 = jDOMNodePointer10.equals((java.lang.Object) "");
        boolean boolean16 = jDOMNodePointer10.isLeaf();
        java.lang.Object obj17 = jDOMNodePointer10.getValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodeNameTest3, (org.apache.commons.jxpath.Pointer) jDOMNodePointer10);
        java.lang.String str19 = jXPathContextReferenceImpl18.getDefaultNamespaceURI();
        java.lang.String str21 = jXPathContextReferenceImpl18.getNamespaceURI("/namespace::hi!");
        org.apache.commons.jxpath.Pointer pointer22 = jXPathContextReferenceImpl18.getContextPointer();
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.beanutils.DynaBean dynaBean24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer26 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName23, dynaBean24, locale25);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer26, "");
        boolean boolean29 = jDOMNamespacePointer28.isCollection();
        java.lang.String str30 = jDOMNamespacePointer28.getNamespaceURI();
        boolean boolean31 = jDOMNamespacePointer28.isCollection();
        org.apache.commons.jxpath.ri.QName qName32 = jDOMNamespacePointer28.getName();
        jXPathContextReferenceImpl18.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) jDOMNamespacePointer28);
        org.apache.commons.jxpath.ri.QName qName34 = null;
        org.apache.commons.beanutils.DynaBean dynaBean35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer37 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName34, dynaBean35, locale36);
        org.apache.commons.jxpath.ri.QName qName38 = dynaBeanPointer37.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer37, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.axes.RootContext rootContext41 = new org.apache.commons.jxpath.ri.axes.RootContext(jXPathContextReferenceImpl18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40);
        org.apache.commons.jxpath.JXPathContext jXPathContext42 = rootContext41.getJXPathContext();
        org.apache.commons.jxpath.ri.EvalContext evalContext43 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext46 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext43, false, nodeTest45);
        org.apache.commons.jxpath.ri.QName qName47 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest49 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName47, "hi!");
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext51 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext46, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest49, true);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext52 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) rootContext41, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest49);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext54 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) rootContext41, nodeTest53);
        selfContext54.reset();
        boolean boolean57 = selfContext54.setPosition(38);
        org.junit.Assert.assertNull(qName8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(pointer22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNull(qName38);
        org.junit.Assert.assertNotNull(jXPathContext42);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.io.Reader reader0 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader0);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager3 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream1, 0);
        java.io.Reader reader4 = null;
        simpleCharStream1.ReInit(reader4, 26, 29, 39);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = simpleCharStream1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        java.lang.String str14 = collectionPointer13.asPath();
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler15 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray16 = null;
        java.lang.Object obj17 = treeCompiler15.sum(objArray16);
        boolean boolean18 = collectionPointer13.equals((java.lang.Object) treeCompiler15);
        org.apache.commons.jxpath.ri.parser.Token token20 = null;
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler21 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        org.apache.commons.jxpath.ri.parser.Token token23 = null;
        int[][] intArray24 = new int[][] {};
        java.lang.String[] strArray25 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.tokenImage;
        org.apache.commons.jxpath.ri.parser.ParseException parseException26 = new org.apache.commons.jxpath.ri.parser.ParseException(token23, intArray24, strArray25);
        java.lang.Object obj27 = treeCompiler21.locationPath(false, (java.lang.Object[]) intArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "$null", "JDOM", "*" };
        org.apache.commons.jxpath.ri.parser.ParseException parseException32 = new org.apache.commons.jxpath.ri.parser.ParseException(token20, intArray24, strArray31);
        java.lang.Object obj33 = treeCompiler15.function(77, (java.lang.Object[]) intArray24);
        java.lang.Object obj36 = treeCompiler15.qname("/*", "/namespace::$null");
        org.apache.commons.jxpath.ri.compiler.Step step38 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray39 = new org.apache.commons.jxpath.ri.compiler.Step[] { step38 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath40 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray39);
        boolean boolean41 = locationPath40.isAbsolute();
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray42 = locationPath40.getSteps();
        java.lang.Object obj43 = treeCompiler15.sum((java.lang.Object[]) stepArray42);
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "unknownFunction77()()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "unknownFunction77()()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "unknownFunction77()()");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "/*:/namespace::$null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "/*:/namespace::$null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "/*:/namespace::$null");
        org.junit.Assert.assertNotNull(stepArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(stepArray42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.jdom.Attribute attribute1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer0, attribute1);
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer4 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer(nodePointer0, (int) (short) 0);
        java.lang.Object obj5 = nullElementPointer4.getImmediateNode();
        java.lang.Object obj6 = nullElementPointer4.getImmediateNode();
        int int7 = nullElementPointer4.getLength();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer6.namespacePointer("hi!");
        boolean boolean9 = jDOMNodePointer6.isCollection();
        org.apache.commons.jxpath.ri.QName qName11 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj12 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler13 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer14 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer6, qName11, obj12, dynamicPropertyHandler13);
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = dynamicPointer14.attributeIterator(qName16);
        java.lang.Object obj18 = dynamicPointer14.getBaseValue();
        java.lang.String str19 = dynamicPointer14.asPath();
        int int20 = dynamicPointer14.getLength();
        boolean boolean21 = dynamicPointer14.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = null;
        org.jdom.Attribute attribute25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer24, attribute25);
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer28 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer(nodePointer24, (int) (short) 0);
        java.lang.Object obj29 = nullElementPointer28.getImmediateNode();
        boolean boolean30 = nullElementPointer28.isNode();
        boolean boolean31 = nullElementPointer28.isLeaf();
        int int32 = nullElementPointer28.getLength();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = dynamicPointer14.createNodeIterator("UNKNOWN()", true, (org.apache.commons.jxpath.ri.model.NodePointer) nullElementPointer28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: PropertyIerator startWith parameter is not a child of the supplied parent");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeIterator17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator61 = containerPointer59.namespaceIterator();
        boolean boolean62 = containerPointer59.isContainer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName64 = null;
        org.apache.commons.beanutils.DynaBean dynaBean65 = null;
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer67 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName64, dynaBean65, locale66);
        org.apache.commons.jxpath.ri.QName qName68 = dynaBeanPointer67.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer67, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer72 = jDOMNodePointer70.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = nodePointer72.getImmediateValuePointer();
        org.w3c.dom.Node node74 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer75 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer73, node74);
        org.apache.commons.jxpath.ri.QName qName76 = null;
        org.apache.commons.beanutils.DynaBean dynaBean77 = null;
        java.util.Locale locale78 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer79 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName76, dynaBean77, locale78);
        org.apache.commons.jxpath.ri.QName qName80 = dynaBeanPointer79.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer82 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer79, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = jDOMNodePointer82.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer85 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer82);
        java.lang.String[] strArray86 = nullPropertyPointer85.getPropertyNames();
        boolean boolean87 = nullPropertyPointer85.isContainer();
        int int88 = nullPropertyPointer85.getLength();
        org.apache.commons.jxpath.ri.QName qName89 = nullPropertyPointer85.getName();
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory90 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        int int91 = dynaBeanPointerFactory90.getOrder();
        int int92 = dynaBeanPointerFactory90.getOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer93 = jDOMPointerFactory63.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer75, qName89, (java.lang.Object) dynaBeanPointerFactory90);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator94 = containerPointer59.attributeIterator(qName89);
        int int95 = nodeIterator94.getPosition();
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
        org.junit.Assert.assertNull(nodeIterator61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(qName68);
        org.junit.Assert.assertNotNull(nodePointer72);
        org.junit.Assert.assertNotNull(nodePointer73);
        org.junit.Assert.assertNull(qName80);
        org.junit.Assert.assertNotNull(nodePointer84);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(qName89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 700 + "'", int91 == 700);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 700 + "'", int92 == 700);
        org.junit.Assert.assertNull(nodePointer93);
        org.junit.Assert.assertNotNull(nodeIterator94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest3 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName1, "hi!");
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.beanutils.DynaBean dynaBean5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer7 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName4, dynaBean5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = dynaBeanPointer7.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer10.namespacePointer("hi!");
        boolean boolean13 = jDOMNodePointer10.isCollection();
        boolean boolean15 = jDOMNodePointer10.equals((java.lang.Object) "");
        boolean boolean16 = jDOMNodePointer10.isLeaf();
        java.lang.Object obj17 = jDOMNodePointer10.getValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodeNameTest3, (org.apache.commons.jxpath.Pointer) jDOMNodePointer10);
        java.lang.String str19 = jXPathContextReferenceImpl18.getDefaultNamespaceURI();
        java.lang.String str21 = jXPathContextReferenceImpl18.getNamespaceURI("/namespace::hi!");
        org.apache.commons.jxpath.Pointer pointer22 = jXPathContextReferenceImpl18.getContextPointer();
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.beanutils.DynaBean dynaBean24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer26 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName23, dynaBean24, locale25);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer26, "");
        boolean boolean29 = jDOMNamespacePointer28.isCollection();
        java.lang.String str30 = jDOMNamespacePointer28.getNamespaceURI();
        boolean boolean31 = jDOMNamespacePointer28.isCollection();
        org.apache.commons.jxpath.ri.QName qName32 = jDOMNamespacePointer28.getName();
        jXPathContextReferenceImpl18.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) jDOMNamespacePointer28);
        org.apache.commons.jxpath.ri.QName qName34 = null;
        org.apache.commons.beanutils.DynaBean dynaBean35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer37 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName34, dynaBean35, locale36);
        org.apache.commons.jxpath.ri.QName qName38 = dynaBeanPointer37.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer37, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.axes.RootContext rootContext41 = new org.apache.commons.jxpath.ri.axes.RootContext(jXPathContextReferenceImpl18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40);
        org.apache.commons.jxpath.JXPathContext jXPathContext42 = rootContext41.getJXPathContext();
        org.apache.commons.jxpath.ri.EvalContext evalContext43 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext46 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext43, false, nodeTest45);
        org.apache.commons.jxpath.ri.QName qName47 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest49 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName47, "hi!");
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext51 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext46, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest49, true);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext52 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) rootContext41, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest49);
        int int53 = parentContext52.getCurrentPosition();
        int int54 = parentContext52.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTypeTest nodeTypeTest56 = new org.apache.commons.jxpath.ri.compiler.NodeTypeTest(50);
        java.lang.String str57 = nodeTypeTest56.toString();
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext58 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) parentContext52, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeTypeTest56);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = parentContext52.getCurrentNodePointer();
        org.junit.Assert.assertNull(qName8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(pointer22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNull(qName38);
        org.junit.Assert.assertNotNull(jXPathContext42);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UNKNOWN()" + "'", str57, "UNKNOWN()");
        org.junit.Assert.assertNull(nodePointer59);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        int int0 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.MOD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29 + "'", int0 == 29);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest2 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext3 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext0, false, nodeTest2);
        int int4 = descendantContext3.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.Step step6 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray7 = new org.apache.commons.jxpath.ri.compiler.Step[] { step6 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath8 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray7);
        boolean boolean9 = locationPath8.isAbsolute();
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext10 = new org.apache.commons.jxpath.ri.axes.PredicateContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext3, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath8);
        predicateContext10.reset();
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.beanutils.DynaBean dynaBean15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer17 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName14, dynaBean15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = dynaBeanPointer17.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer17, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext21 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext21, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = dynaBeanPointer17.createPath(jXPathContext23);
        java.util.Locale locale25 = jXPathContext23.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer26 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale25);
        java.lang.String str27 = collectionPointer26.asPath();
        org.apache.commons.jxpath.ri.QName qName28 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest30 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName28, "hi!");
        boolean boolean31 = collectionPointer26.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest30);
        org.apache.commons.jxpath.ri.axes.AncestorContext ancestorContext32 = new org.apache.commons.jxpath.ri.axes.AncestorContext((org.apache.commons.jxpath.ri.EvalContext) predicateContext10, true, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest30);
        ancestorContext32.reset();
        ancestorContext32.reset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(stepArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(qName18);
        org.junit.Assert.assertNotNull(jXPathContext23);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/" + "'", str27, "/");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext7, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = dynaBeanPointer3.createPath(jXPathContext9);
        java.util.List list12 = jXPathContext9.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        boolean boolean13 = jXPathContext9.isLenient();
        java.beans.IndexedPropertyDescriptor indexedPropertyDescriptor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.jxpath.util.ValueUtils.getIndexedPropertyLength((java.lang.Object) boolean13, indexedPropertyDescriptor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNotNull(jXPathContext9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.jdom.Attribute attribute8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer7, attribute8);
        boolean boolean10 = jDOMAttributePointer9.isLeaf();
        boolean boolean11 = jDOMAttributePointer9.isActual();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.beanutils.DynaBean dynaBean13 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer15 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName12, dynaBean13, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = dynaBeanPointer15.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer15, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = jDOMNodePointer18.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer21 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18);
        java.lang.String[] strArray22 = nullPropertyPointer21.getPropertyNames();
        boolean boolean23 = nullPropertyPointer21.isContainer();
        int int24 = nullPropertyPointer21.getLength();
        int int25 = jDOMNodePointer6.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMAttributePointer9, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer21);
        java.lang.Class<?> wildcardClass26 = jDOMNodePointer6.getClass();
        int int27 = org.apache.commons.jxpath.util.ValueUtils.getCollectionHint((java.lang.Class) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler28 = org.apache.commons.jxpath.util.ValueUtils.getDynamicPropertyHandler((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot allocate dynamic property handler of class org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer; org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(qName16);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext7, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = dynaBeanPointer3.createPath(jXPathContext9);
        java.util.List list12 = jXPathContext9.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        jXPathContext9.removeAll("DOM");
        org.apache.commons.jxpath.IdentityManager identityManager15 = jXPathContext9.getIdentityManager();
        org.apache.commons.jxpath.Variables variables16 = jXPathContext9.getVariables();
        org.apache.commons.jxpath.AbstractFactory abstractFactory17 = null;
        jXPathContext9.setFactory(abstractFactory17);
        jXPathContext9.registerNamespace("/@xml:lang", "Empty expression context");
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNotNull(jXPathContext9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(identityManager15);
        org.junit.Assert.assertNotNull(variables16);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.jdom.Attribute attribute1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer0, attribute1);
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer4 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer(nodePointer0, (int) (short) 0);
        java.lang.Object obj5 = nullElementPointer4.getImmediateNode();
        java.lang.Object obj6 = nullElementPointer4.getImmediateNode();
        int int7 = nullElementPointer4.getIndex();
        java.lang.Object obj8 = nullElementPointer4.getImmediateNode();
        java.lang.Object obj9 = nullElementPointer4.getBaseValue();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.beanutils.DynaBean dynaBean2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer4 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName1, dynaBean2, locale3);
        org.apache.commons.jxpath.ri.QName qName5 = dynaBeanPointer4.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer4, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext8, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = dynaBeanPointer4.createPath(jXPathContext10);
        java.util.List list13 = jXPathContext10.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        jXPathContext10.removeAll("DOM");
        java.util.Locale locale16 = jXPathContext10.getLocale();
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale16);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer17, "");
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest3 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName1, "hi!");
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.beanutils.DynaBean dynaBean5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer7 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName4, dynaBean5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = dynaBeanPointer7.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer10.namespacePointer("hi!");
        boolean boolean13 = jDOMNodePointer10.isCollection();
        boolean boolean15 = jDOMNodePointer10.equals((java.lang.Object) "");
        boolean boolean16 = jDOMNodePointer10.isLeaf();
        java.lang.Object obj17 = jDOMNodePointer10.getValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodeNameTest3, (org.apache.commons.jxpath.Pointer) jDOMNodePointer10);
        java.lang.String str19 = jXPathContextReferenceImpl18.getDefaultNamespaceURI();
        java.lang.String str21 = jXPathContextReferenceImpl18.getNamespaceURI("/namespace::hi!");
        org.apache.commons.jxpath.Pointer pointer22 = jXPathContextReferenceImpl18.getContextPointer();
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.beanutils.DynaBean dynaBean24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer26 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName23, dynaBean24, locale25);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer26, "");
        boolean boolean29 = jDOMNamespacePointer28.isCollection();
        java.lang.String str30 = jDOMNamespacePointer28.getNamespaceURI();
        boolean boolean31 = jDOMNamespacePointer28.isCollection();
        org.apache.commons.jxpath.ri.QName qName32 = jDOMNamespacePointer28.getName();
        jXPathContextReferenceImpl18.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) jDOMNamespacePointer28);
        org.apache.commons.jxpath.ri.QName qName34 = null;
        org.apache.commons.beanutils.DynaBean dynaBean35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer37 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName34, dynaBean35, locale36);
        org.apache.commons.jxpath.ri.QName qName38 = dynaBeanPointer37.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer37, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.axes.RootContext rootContext41 = new org.apache.commons.jxpath.ri.axes.RootContext(jXPathContextReferenceImpl18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = rootContext41.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext45 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) rootContext41, nodeTest43, false);
        org.apache.commons.jxpath.Pointer pointer46 = precedingOrFollowingContext45.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = precedingOrFollowingContext45.getCurrentNodePointer();
        org.junit.Assert.assertNull(qName8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(pointer22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNull(qName38);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNull(pointer46);
        org.junit.Assert.assertNull(nodePointer47);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.jxpath.ri.parser.Token token1 = org.apache.commons.jxpath.ri.parser.Token.newToken(60);
        java.lang.String str2 = token1.toString();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer6.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer6);
        java.lang.String[] strArray10 = nullPropertyPointer9.getPropertyNames();
        boolean boolean11 = nullPropertyPointer9.isContainer();
        int int12 = nullPropertyPointer9.getLength();
        org.apache.commons.jxpath.ri.QName qName13 = nullPropertyPointer9.getName();
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.beanutils.DynaBean dynaBean15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer17 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName14, dynaBean15, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = dynaBeanPointer17.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer17, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = jDOMNodePointer20.namespacePointer("hi!");
        boolean boolean23 = jDOMNodePointer20.isCollection();
        org.apache.commons.jxpath.ri.QName qName25 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj26 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler27 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer28 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer20, qName25, obj26, dynamicPropertyHandler27);
        org.apache.commons.jxpath.ri.QName qName30 = new org.apache.commons.jxpath.ri.QName("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = dynamicPointer28.attributeIterator(qName30);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = nullPropertyPointer9.attributeIterator(qName30);
        java.lang.Object obj33 = nullPropertyPointer9.getImmediateNode();
        org.apache.commons.jxpath.Container container34 = null;
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer35 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer9, container34);
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = null;
        org.apache.commons.jxpath.ri.QName qName37 = null;
        org.apache.commons.beanutils.DynaBean dynaBean38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer40 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName37, dynaBean38, locale39);
        org.apache.commons.jxpath.ri.QName qName41 = dynaBeanPointer40.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer40, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMNodePointer43.namespacePointer("hi!");
        boolean boolean46 = jDOMNodePointer43.isCollection();
        boolean boolean48 = jDOMNodePointer43.equals((java.lang.Object) "");
        boolean boolean49 = jDOMNodePointer43.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = null;
        org.jdom.Attribute attribute51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer50, attribute51);
        java.lang.Object obj53 = jDOMAttributePointer52.getBaseValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl54 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext36, (java.lang.Object) boolean49, (org.apache.commons.jxpath.Pointer) jDOMAttributePointer52);
        java.lang.String str56 = jXPathContextReferenceImpl54.getNamespaceURI("/");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver57 = jXPathContextReferenceImpl54.getNamespaceResolver();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = nullPropertyPointer9.createPath((org.apache.commons.jxpath.JXPathContext) jXPathContextReferenceImpl54);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Factory is not set on the JXPathContext - cannot create path: /");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(qName13);
        org.junit.Assert.assertNull(qName18);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(qName41);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(namespaceResolver57);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.lang.String str20 = jXPathContextReferenceImpl18.getNamespaceURI("/");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver21 = jXPathContextReferenceImpl18.getNamespaceResolver();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator23 = jXPathContextReferenceImpl18.iterate("id('\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000')");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot find an element by ID - no IdentityManager has been specified");
        } catch (org.apache.commons.jxpath.JXPathException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(namespaceResolver21);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.lang.Object obj1 = org.apache.commons.jxpath.ri.axes.RootContext.UNKNOWN_VALUE;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler2 = null;
        org.apache.commons.jxpath.Container container3 = null;
        org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory beanPointerFactory4 = new org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        org.apache.commons.beanutils.DynaBean dynaBean6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer8 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName5, dynaBean6, locale7);
        org.apache.commons.jxpath.ri.QName qName9 = dynaBeanPointer8.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer8, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = jDOMNodePointer11.namespacePointer("hi!");
        boolean boolean14 = jDOMNodePointer11.isCollection();
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj17 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler18 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer19 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer11, qName16, obj17, dynamicPropertyHandler18);
        java.lang.String str20 = qName16.toString();
        org.apache.commons.jxpath.ri.QName qName21 = null;
        org.apache.commons.beanutils.DynaBean dynaBean22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer24 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName21, dynaBean22, locale23);
        org.apache.commons.jxpath.ri.QName qName25 = dynaBeanPointer24.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer24, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext28, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = dynaBeanPointer24.createPath(jXPathContext30);
        java.util.List list33 = jXPathContext30.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        org.w3c.dom.Node node34 = null;
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.beanutils.DynaBean dynaBean36 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer38 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName35, dynaBean36, locale37);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer38, "");
        boolean boolean41 = jDOMNamespacePointer40.isCollection();
        java.lang.String str42 = jDOMNamespacePointer40.getNamespaceURI();
        boolean boolean43 = jDOMNamespacePointer40.isCollection();
        org.apache.commons.jxpath.ri.QName qName44 = jDOMNamespacePointer40.getName();
        org.apache.commons.jxpath.ri.QName qName46 = null;
        org.apache.commons.beanutils.DynaBean dynaBean47 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer49 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName46, dynaBean47, locale48);
        org.apache.commons.jxpath.ri.QName qName50 = dynaBeanPointer49.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer49, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext53 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext55 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext53, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = dynaBeanPointer49.createPath(jXPathContext55);
        java.util.Locale locale57 = jXPathContext55.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer58 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale57);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer59 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName44, locale57);
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer60 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node34, locale57);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = beanPointerFactory4.createNodePointer(qName16, (java.lang.Object) "org.apache.commons.jxpath.JXPathContextFactory", locale57);
        org.apache.commons.jxpath.ri.model.container.ContainerPointer containerPointer62 = new org.apache.commons.jxpath.ri.model.container.ContainerPointer(container3, locale57);
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer63 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer(qName0, obj1, dynamicPropertyHandler2, locale57);
        org.apache.commons.jxpath.ri.QName qName64 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest66 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName64, "hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = null;
        org.w3c.dom.Attr attr69 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer70 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer(nodePointer68, attr69);
        org.apache.commons.jxpath.ri.QName qName71 = null;
        org.apache.commons.beanutils.DynaBean dynaBean72 = null;
        java.util.Locale locale73 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer74 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName71, dynaBean72, locale73);
        org.apache.commons.jxpath.ri.QName qName75 = dynaBeanPointer74.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer77 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer74, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer79 = jDOMNodePointer77.namespacePointer("hi!");
        boolean boolean80 = jDOMNodePointer77.isCollection();
        boolean boolean82 = jDOMNodePointer77.equals((java.lang.Object) "");
        boolean boolean83 = jDOMNodePointer77.isLeaf();
        org.apache.commons.jxpath.ri.QName qName84 = null;
        org.apache.commons.beanutils.DynaBean dynaBean85 = null;
        java.util.Locale locale86 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer87 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName84, dynaBean85, locale86);
        org.apache.commons.jxpath.ri.QName qName88 = dynaBeanPointer87.getName();
        java.lang.String str90 = dynaBeanPointer87.getNamespaceURI("");
        java.lang.Object obj91 = dynaBeanPointer87.getImmediateNode();
        int int92 = dOMAttributePointer70.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer77, (org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer87);
        org.apache.commons.jxpath.ri.QName qName93 = jDOMNodePointer77.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator94 = dynamicPointer63.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest66, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(qName9);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(qName25);
        org.junit.Assert.assertNotNull(jXPathContext30);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(qName44);
        org.junit.Assert.assertNull(qName50);
        org.junit.Assert.assertNotNull(jXPathContext55);
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(nodePointer61);
        org.junit.Assert.assertNull(qName75);
        org.junit.Assert.assertNotNull(nodePointer79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(qName88);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(qName93);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.lang.String str14 = collectionPointer13.asPath();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = collectionPointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        org.apache.commons.beanutils.DynaBean dynaBean17 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer19 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName16, dynaBean17, locale18);
        org.apache.commons.jxpath.ri.QName qName20 = dynaBeanPointer19.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer19, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = jDOMNodePointer22.namespacePointer("hi!");
        boolean boolean25 = jDOMNodePointer22.isCollection();
        org.apache.commons.jxpath.ri.QName qName27 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj28 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler29 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer30 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer22, qName27, obj28, dynamicPropertyHandler29);
        org.apache.commons.jxpath.ri.QName qName32 = new org.apache.commons.jxpath.ri.QName("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = dynamicPointer30.attributeIterator(qName32);
        java.lang.Object obj34 = dynamicPointer30.getBaseValue();
        boolean boolean35 = collectionPointer13.equals((java.lang.Object) dynamicPointer30);
        org.apache.commons.jxpath.ri.QName qName36 = dynamicPointer30.getName();
        org.apache.commons.jxpath.ri.QName qName37 = null;
        org.apache.commons.beanutils.DynaBean dynaBean38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer40 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName37, dynaBean38, locale39);
        org.apache.commons.jxpath.ri.QName qName41 = dynaBeanPointer40.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer40, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = dynaBeanPointer40.namespacePointer("");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = dynaBeanPointer40.namespacePointer("$null");
        org.apache.commons.jxpath.ri.QName qName48 = null;
        org.apache.commons.beanutils.DynaBean dynaBean49 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer51 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName48, dynaBean49, locale50);
        org.apache.commons.jxpath.ri.QName qName52 = dynaBeanPointer51.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer51, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext55 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext57 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext55, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = dynaBeanPointer51.createPath(jXPathContext57);
        java.util.List list60 = jXPathContext57.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = dynaBeanPointer40.createPath(jXPathContext57);
        java.lang.String str63 = dynaBeanPointer40.getNamespaceURI("*");
        org.apache.commons.jxpath.ri.QName qName64 = null;
        org.apache.commons.beanutils.DynaBean dynaBean65 = null;
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer67 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName64, dynaBean65, locale66);
        org.apache.commons.jxpath.ri.QName qName68 = dynaBeanPointer67.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer67, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer72 = jDOMNodePointer70.namespacePointer("hi!");
        boolean boolean73 = jDOMNodePointer70.isCollection();
        org.apache.commons.jxpath.ri.QName qName75 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj76 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler77 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer78 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer70, qName75, obj76, dynamicPropertyHandler77);
        org.apache.commons.jxpath.ri.QName qName80 = new org.apache.commons.jxpath.ri.QName("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator81 = dynamicPointer78.attributeIterator(qName80);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator82 = dynaBeanPointer40.attributeIterator(qName80);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator83 = dynamicPointer30.attributeIterator(qName80);
        java.lang.Object obj84 = dynamicPointer30.getBaseValue();
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNotNull(jXPathContext10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertNull(nodeIterator15);
        org.junit.Assert.assertNull(qName20);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(qName36);
        org.junit.Assert.assertNull(qName41);
        org.junit.Assert.assertNull(nodePointer45);
        org.junit.Assert.assertNull(nodePointer47);
        org.junit.Assert.assertNull(qName52);
        org.junit.Assert.assertNotNull(jXPathContext57);
        org.junit.Assert.assertNotNull(nodePointer58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(nodePointer61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(qName68);
        org.junit.Assert.assertNotNull(nodePointer72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(nodeIterator81);
        org.junit.Assert.assertNotNull(nodeIterator82);
        org.junit.Assert.assertNotNull(nodeIterator83);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.jdom.Attribute attribute1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer0, attribute1);
        org.apache.commons.jxpath.ri.model.beans.NullElementPointer nullElementPointer4 = new org.apache.commons.jxpath.ri.model.beans.NullElementPointer(nodePointer0, (int) (short) 0);
        java.lang.Object obj5 = nullElementPointer4.getImmediateNode();
        java.lang.Object obj6 = nullElementPointer4.getImmediateNode();
        org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory jDOMPointerFactory7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.beanutils.DynaBean dynaBean9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer11 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName8, dynaBean9, locale10);
        org.apache.commons.jxpath.ri.QName qName12 = dynaBeanPointer11.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer11, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer14.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer16.getImmediateValuePointer();
        org.w3c.dom.Node node18 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer17, node18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer23 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale22);
        org.apache.commons.jxpath.ri.QName qName24 = dynaBeanPointer23.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer23, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer26.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer29 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26);
        java.lang.String[] strArray30 = nullPropertyPointer29.getPropertyNames();
        boolean boolean31 = nullPropertyPointer29.isContainer();
        int int32 = nullPropertyPointer29.getLength();
        org.apache.commons.jxpath.ri.QName qName33 = nullPropertyPointer29.getName();
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory dynaBeanPointerFactory34 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory();
        int int35 = dynaBeanPointerFactory34.getOrder();
        int int36 = dynaBeanPointerFactory34.getOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = jDOMPointerFactory7.createNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer19, qName33, (java.lang.Object) dynaBeanPointerFactory34);
        org.apache.commons.jxpath.ri.QName qName38 = null;
        org.apache.commons.beanutils.DynaBean dynaBean39 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer41 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName38, dynaBean39, locale40);
        org.apache.commons.jxpath.ri.QName qName42 = dynaBeanPointer41.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer41, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = jDOMNodePointer44.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = nodePointer46.getImmediateValuePointer();
        org.w3c.dom.Node node48 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer49 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer47, node48);
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler50 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer51 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullElementPointer4, qName33, (java.lang.Object) dOMNodePointer49, dynamicPropertyHandler50);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = nullElementPointer4.namespacePointer("/@xml:lang");
        boolean boolean54 = nullElementPointer4.isContainer();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(qName12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNull(qName24);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(qName33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 700 + "'", int35 == 700);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNull(nodePointer37);
        org.junit.Assert.assertNull(qName42);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNull(nodePointer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext2 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext5 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext2, false, nodeTest4);
        int int6 = descendantContext5.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.Step step8 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray9 = new org.apache.commons.jxpath.ri.compiler.Step[] { step8 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath10 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray9);
        boolean boolean11 = locationPath10.isAbsolute();
        org.apache.commons.jxpath.ri.axes.PredicateContext predicateContext12 = new org.apache.commons.jxpath.ri.axes.PredicateContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext5, (org.apache.commons.jxpath.ri.compiler.Expression) locationPath10);
        predicateContext12.reset();
        predicateContext12.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext18 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext15, false, nodeTest17);
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext22 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext19, false, nodeTest21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest25 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName23, "hi!");
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext27 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext22, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest25, true);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray28 = new org.apache.commons.jxpath.ri.EvalContext[] { predicateContext12, evalContext15, descendantContext22 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext1, evalContextArray28);
        int int30 = unionContext29.getDocumentOrder();
        org.apache.commons.jxpath.NodeSet nodeSet31 = unionContext29.getNodeSet();
        java.util.List list32 = nodeSet31.getNodes();
        java.util.List list33 = nodeSet31.getNodes();
        org.apache.commons.jxpath.ri.axes.NodeSetContext nodeSetContext34 = new org.apache.commons.jxpath.ri.axes.NodeSetContext(evalContext0, nodeSet31);
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext38 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext35, false, nodeTest37);
        int int39 = descendantContext38.getCurrentPosition();
        int int40 = descendantContext38.getCurrentPosition();
        org.apache.commons.jxpath.ri.QName qName41 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest43 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName41, "hi!");
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext44 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext38, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest43);
        org.apache.commons.jxpath.ri.QName qName45 = nodeNameTest43.getNodeName();
        org.apache.commons.jxpath.ri.axes.NamespaceContext namespaceContext46 = new org.apache.commons.jxpath.ri.axes.NamespaceContext(evalContext0, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest43);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = namespaceContext46.getCurrentNodePointer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(stepArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(evalContextArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(nodeSet31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(qName45);
        org.junit.Assert.assertNull(nodePointer47);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext7, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = dynaBeanPointer3.createPath(jXPathContext9);
        java.util.List list12 = jXPathContext9.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        jXPathContext9.removeAll("DOM");
        org.apache.commons.jxpath.IdentityManager identityManager15 = jXPathContext9.getIdentityManager();
        org.apache.commons.jxpath.Pointer pointer16 = jXPathContext9.getContextPointer();
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNotNull(jXPathContext9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(identityManager15);
        org.junit.Assert.assertNotNull(pointer16);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.beanutils.DynaBean dynaBean2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer4 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName1, dynaBean2, locale3);
        org.apache.commons.jxpath.ri.QName qName5 = dynaBeanPointer4.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer4, (java.lang.Object) (byte) -1);
        java.lang.Object obj8 = jDOMNodePointer7.getRootNode();
        int int9 = jDOMNodePointer7.getLength();
        java.lang.String str10 = jDOMNodePointer7.getNamespaceURI();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext14 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext11, false, nodeTest13);
        int int15 = descendantContext14.getCurrentPosition();
        int int16 = descendantContext14.getCurrentPosition();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest19 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName17, "hi!");
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext20 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext14, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest19);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = null;
        org.jdom.Attribute attribute23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer jDOMAttributePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer(nodePointer22, attribute23);
        boolean boolean25 = jDOMAttributePointer24.isLeaf();
        org.apache.commons.jxpath.ri.QName qName26 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMAttributePointer24.attributeIterator(qName26);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer7.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMAttributePointer24);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext29 = new org.apache.commons.jxpath.ri.axes.ParentContext(evalContext0, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest19);
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext33 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext30, false, nodeTest32);
        int int34 = descendantContext33.getCurrentPosition();
        int int35 = descendantContext33.getCurrentPosition();
        org.apache.commons.jxpath.ri.QName qName36 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest38 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName36, "hi!");
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext39 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext33, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest38);
        org.apache.commons.jxpath.ri.QName qName41 = null;
        org.apache.commons.beanutils.DynaBean dynaBean42 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer44 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName41, dynaBean42, locale43);
        org.apache.commons.jxpath.ri.QName qName45 = dynaBeanPointer44.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer44, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext48 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext48, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = dynaBeanPointer44.createPath(jXPathContext50);
        java.util.Locale locale52 = jXPathContext50.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer53 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale52);
        java.lang.String str54 = collectionPointer53.asPath();
        org.apache.commons.jxpath.ri.QName qName55 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest57 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName55, "hi!");
        boolean boolean58 = collectionPointer53.testNode((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest57);
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext59 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext33, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest57);
        org.apache.commons.jxpath.ri.axes.ChildContext childContext62 = new org.apache.commons.jxpath.ri.axes.ChildContext((org.apache.commons.jxpath.ri.EvalContext) parentContext29, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest57, false, false);
        childContext62.reset();
        org.junit.Assert.assertNull(qName5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(nodeIterator27);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(qName45);
        org.junit.Assert.assertNotNull(jXPathContext50);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "/" + "'", str54, "/");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        boolean boolean29 = nullPointer24.isActual();
        boolean boolean30 = nullPointer24.isActual();
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext34 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext32, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.beanutils.DynaBean dynaBean36 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer38 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName35, dynaBean36, locale37);
        org.apache.commons.jxpath.ri.QName qName39 = dynaBeanPointer38.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer38, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext42 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext44 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext42, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = dynaBeanPointer38.createPath(jXPathContext44);
        java.util.List list47 = jXPathContext44.selectNodes("org.apache.commons.jxpath.JXPathContextFactory");
        jXPathContext44.removeAll("DOM");
        org.apache.commons.jxpath.IdentityManager identityManager50 = jXPathContext44.getIdentityManager();
        org.apache.commons.jxpath.Variables variables51 = jXPathContext44.getVariables();
        variables51.undeclareVariable("$null");
        org.apache.commons.jxpath.ri.QName qName54 = null;
        org.apache.commons.beanutils.DynaBean dynaBean55 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer57 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName54, dynaBean55, locale56);
        org.apache.commons.jxpath.ri.QName qName58 = dynaBeanPointer57.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer57, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = dynaBeanPointer57.namespacePointer("");
        org.apache.commons.jxpath.ri.QName qName64 = new org.apache.commons.jxpath.ri.QName("/");
        org.apache.commons.beanutils.DynaBean dynaBean65 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer66 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(nodePointer62, qName64, dynaBean65);
        java.lang.String str67 = qName64.toString();
        org.apache.commons.jxpath.ri.model.VariablePointer variablePointer68 = new org.apache.commons.jxpath.ri.model.VariablePointer(variables51, qName64);
        jXPathContext34.setVariables(variables51);
        variables51.undeclareVariable("null");
        org.apache.commons.jxpath.util.ValueUtils.setValue((java.lang.Object) nullPointer24, 29, (java.lang.Object) variables51);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jXPathContext34);
        org.junit.Assert.assertNull(qName39);
        org.junit.Assert.assertNotNull(jXPathContext44);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNull(identityManager50);
        org.junit.Assert.assertNotNull(variables51);
        org.junit.Assert.assertNull(qName58);
        org.junit.Assert.assertNull(nodePointer62);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "/" + "'", str67, "/");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = dynaBeanPointer3.namespacePointer("");
        java.lang.Object obj9 = dynaBeanPointer3.getImmediateNode();
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer10 = dynaBeanPointer3.getPropertyPointer();
        org.w3c.dom.Attr attr11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer12 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) propertyPointer10, attr11);
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(propertyPointer10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler1 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
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
        java.lang.Object obj17 = treeCompiler1.nodeNameTest((java.lang.Object) qName13);
        org.apache.commons.jxpath.ri.compiler.Step step19 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray20 = new org.apache.commons.jxpath.ri.compiler.Step[] { step19 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath21 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray20);
        java.lang.Object obj22 = treeCompiler1.or((java.lang.Object[]) stepArray20);
        java.lang.Object obj23 = org.apache.commons.jxpath.ri.Parser.parseExpression("null()", (org.apache.commons.jxpath.ri.Compiler) treeCompiler1);
        org.apache.commons.jxpath.ri.parser.Token token24 = null;
        int[][] intArray25 = new int[][] {};
        java.lang.String[] strArray26 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.tokenImage;
        org.apache.commons.jxpath.ri.parser.ParseException parseException27 = new org.apache.commons.jxpath.ri.parser.ParseException(token24, intArray25, strArray26);
        int[][] intArray28 = parseException27.expectedTokenSequences;
        java.lang.Object obj29 = treeCompiler1.sum((java.lang.Object[]) intArray28);
        java.lang.String[] strArray30 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.tokenImage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = treeCompiler1.or((java.lang.Object[]) strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qName6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(stepArray20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "unknownFunction28()()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "unknownFunction28()()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "unknownFunction28()()");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer6.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer6);
        java.lang.String[] strArray10 = nullPropertyPointer9.getPropertyNames();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer11 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer9);
        org.w3c.dom.Node node12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer11, node12);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nullPropertyPointer11.getValuePointer();
        nullPropertyPointer11.setPropertyName("");
        int int17 = nullPropertyPointer11.getLength();
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest3 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName1, "hi!");
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.beanutils.DynaBean dynaBean5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer7 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName4, dynaBean5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = dynaBeanPointer7.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer10.namespacePointer("hi!");
        boolean boolean13 = jDOMNodePointer10.isCollection();
        boolean boolean15 = jDOMNodePointer10.equals((java.lang.Object) "");
        boolean boolean16 = jDOMNodePointer10.isLeaf();
        java.lang.Object obj17 = jDOMNodePointer10.getValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodeNameTest3, (org.apache.commons.jxpath.Pointer) jDOMNodePointer10);
        java.lang.String str19 = jXPathContextReferenceImpl18.getDefaultNamespaceURI();
        java.lang.String str21 = jXPathContextReferenceImpl18.getNamespaceURI("/namespace::hi!");
        org.apache.commons.jxpath.Pointer pointer22 = jXPathContextReferenceImpl18.getContextPointer();
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.beanutils.DynaBean dynaBean24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer26 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName23, dynaBean24, locale25);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer26, "");
        boolean boolean29 = jDOMNamespacePointer28.isCollection();
        java.lang.String str30 = jDOMNamespacePointer28.getNamespaceURI();
        boolean boolean31 = jDOMNamespacePointer28.isCollection();
        org.apache.commons.jxpath.ri.QName qName32 = jDOMNamespacePointer28.getName();
        jXPathContextReferenceImpl18.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) jDOMNamespacePointer28);
        org.apache.commons.jxpath.ri.QName qName34 = null;
        org.apache.commons.beanutils.DynaBean dynaBean35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer37 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName34, dynaBean35, locale36);
        org.apache.commons.jxpath.ri.QName qName38 = dynaBeanPointer37.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer37, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.axes.RootContext rootContext41 = new org.apache.commons.jxpath.ri.axes.RootContext(jXPathContextReferenceImpl18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40);
        org.apache.commons.jxpath.JXPathContext jXPathContext42 = rootContext41.getJXPathContext();
        org.apache.commons.jxpath.ri.EvalContext evalContext43 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext46 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext43, false, nodeTest45);
        org.apache.commons.jxpath.ri.QName qName47 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest49 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName47, "hi!");
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext51 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext46, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest49, true);
        org.apache.commons.jxpath.ri.axes.ParentContext parentContext52 = new org.apache.commons.jxpath.ri.axes.ParentContext((org.apache.commons.jxpath.ri.EvalContext) rootContext41, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest49);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        org.apache.commons.jxpath.ri.axes.SelfContext selfContext54 = new org.apache.commons.jxpath.ri.axes.SelfContext((org.apache.commons.jxpath.ri.EvalContext) rootContext41, nodeTest53);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = selfContext54.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver56 = null;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver57 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver56);
        org.apache.commons.jxpath.Pointer pointer58 = namespaceResolver57.getNamespaceContextPointer();
        java.lang.Object obj59 = namespaceResolver57.clone();
        namespaceResolver57.registerDefaultNamespaceURI("@null");
        nodePointer55.setNamespaceResolver(namespaceResolver57);
        org.junit.Assert.assertNull(qName8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(pointer22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(qName32);
        org.junit.Assert.assertNull(qName38);
        org.junit.Assert.assertNotNull(jXPathContext42);
        org.junit.Assert.assertNotNull(nodePointer55);
        org.junit.Assert.assertNull(pointer58);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler0 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
        java.lang.Object[] objArray1 = null;
        java.lang.Object obj2 = treeCompiler0.sum(objArray1);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.beanutils.DynaBean dynaBean5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer7 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName4, dynaBean5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = dynaBeanPointer7.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext11, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = dynaBeanPointer7.createPath(jXPathContext13);
        org.apache.commons.jxpath.PackageFunctions packageFunctions17 = new org.apache.commons.jxpath.PackageFunctions("DOM", "DOM");
        java.util.Set set18 = packageFunctions17.getUsedNamespaces();
        jXPathContext13.setFunctions((org.apache.commons.jxpath.Functions) packageFunctions17);
        org.apache.commons.jxpath.JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError22 = new org.apache.commons.jxpath.JXPathContextFactoryConfigurationError();
        java.lang.Throwable[] throwableArray23 = jXPathContextFactoryConfigurationError22.getSuppressed();
        org.apache.commons.jxpath.Function function24 = packageFunctions17.getFunction("Expression context [0] /:/", "Expression context [0] /:/", (java.lang.Object[]) throwableArray23);
        java.lang.Object obj25 = treeCompiler0.function(0, (java.lang.Object[]) throwableArray23);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(qName8);
        org.junit.Assert.assertNotNull(jXPathContext13);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNull(function24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "unknownFunction0()()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "unknownFunction0()()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "unknownFunction0()()");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Attr attr1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer(nodePointer0, attr1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.beanutils.DynaBean dynaBean4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer6 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName3, dynaBean4, locale5);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer6, "");
        int int9 = jDOMNamespacePointer8.getLength();
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
        java.lang.String str24 = collectionPointer23.asPath();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = collectionPointer23.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName26 = null;
        org.apache.commons.beanutils.DynaBean dynaBean27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer29 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName26, dynaBean27, locale28);
        org.apache.commons.jxpath.ri.QName qName30 = dynaBeanPointer29.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer29, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMNodePointer32.namespacePointer("hi!");
        boolean boolean35 = jDOMNodePointer32.isCollection();
        org.apache.commons.jxpath.ri.QName qName37 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj38 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler39 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer40 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32, qName37, obj38, dynamicPropertyHandler39);
        org.apache.commons.jxpath.ri.QName qName42 = new org.apache.commons.jxpath.ri.QName("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = dynamicPointer40.attributeIterator(qName42);
        java.lang.Object obj44 = dynamicPointer40.getBaseValue();
        boolean boolean45 = collectionPointer23.equals((java.lang.Object) dynamicPointer40);
        org.apache.commons.jxpath.ri.model.beans.LangAttributePointer langAttributePointer46 = new org.apache.commons.jxpath.ri.model.beans.LangAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynamicPointer40);
        java.lang.String str47 = langAttributePointer46.getNamespaceURI();
        int int48 = dOMAttributePointer2.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNamespacePointer8, (org.apache.commons.jxpath.ri.model.NodePointer) langAttributePointer46);
        java.lang.Object obj49 = dOMAttributePointer2.getBaseValue();
        java.lang.Object obj50 = dOMAttributePointer2.getBaseValue();
        java.lang.Object obj51 = dOMAttributePointer2.getBaseValue();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(qName15);
        org.junit.Assert.assertNotNull(jXPathContext20);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertNull(nodeIterator25);
        org.junit.Assert.assertNull(qName30);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.beanutils.DynaBean dynaBean1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer3 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName0, dynaBean1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = dynaBeanPointer3.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer3, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer6.namespacePointer("hi!");
        boolean boolean9 = jDOMNodePointer6.isCollection();
        org.apache.commons.jxpath.ri.QName qName11 = new org.apache.commons.jxpath.ri.QName("");
        java.lang.Object obj12 = null;
        org.apache.commons.jxpath.DynamicPropertyHandler dynamicPropertyHandler13 = null;
        org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer dynamicPointer14 = new org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer6, qName11, obj12, dynamicPropertyHandler13);
        org.apache.commons.jxpath.ri.QName qName16 = new org.apache.commons.jxpath.ri.QName("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = dynamicPointer14.attributeIterator(qName16);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer18 = dynamicPointer14.getPropertyPointer();
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.beanutils.DynaBean dynaBean21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer23 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName20, dynaBean21, locale22);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer jDOMNamespacePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer23, "");
        boolean boolean26 = jDOMNamespacePointer25.isCollection();
        java.lang.String str27 = jDOMNamespacePointer25.getNamespaceURI();
        boolean boolean28 = jDOMNamespacePointer25.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNamespacePointer25.getName();
        org.apache.commons.jxpath.ri.QName qName31 = null;
        org.apache.commons.beanutils.DynaBean dynaBean32 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer34 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName31, dynaBean32, locale33);
        org.apache.commons.jxpath.ri.QName qName35 = dynaBeanPointer34.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer34, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.JXPathContext jXPathContext38 = null;
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = org.apache.commons.jxpath.JXPathContext.newContext(jXPathContext38, (java.lang.Object) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = dynaBeanPointer34.createPath(jXPathContext40);
        java.util.Locale locale42 = jXPathContext40.getLocale();
        org.apache.commons.jxpath.ri.model.beans.CollectionPointer collectionPointer43 = new org.apache.commons.jxpath.ri.model.beans.CollectionPointer((java.lang.Object) (byte) -1, locale42);
        org.apache.commons.jxpath.ri.model.beans.NullPointer nullPointer44 = new org.apache.commons.jxpath.ri.model.beans.NullPointer(qName29, locale42);
        java.lang.String str45 = nullPointer44.asPath();
        java.io.Reader reader46 = null;
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream47 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(reader46);
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager49 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream47, 0);
        org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream50 = null;
        org.apache.commons.jxpath.ri.parser.XPathParserTokenManager xPathParserTokenManager51 = new org.apache.commons.jxpath.ri.parser.XPathParserTokenManager(simpleCharStream50);
        java.io.PrintStream printStream52 = xPathParserTokenManager51.debugStream;
        xPathParserTokenManager49.debugStream = printStream52;
        boolean boolean54 = nullPointer44.equals((java.lang.Object) xPathParserTokenManager49);
        org.apache.commons.jxpath.util.ValueUtils.setValue((java.lang.Object) propertyPointer18, 5, (java.lang.Object) nullPointer44);
        org.apache.commons.jxpath.ri.model.beans.PropertyPointer propertyPointer56 = nullPointer44.getPropertyPointer();
        org.junit.Assert.assertNull(qName4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeIterator17);
        org.junit.Assert.assertNotNull(propertyPointer18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
        org.junit.Assert.assertNull(qName35);
        org.junit.Assert.assertNotNull(jXPathContext40);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "null()" + "'", str45, "null()");
        org.junit.Assert.assertNotNull(printStream52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(propertyPointer56);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        boolean boolean29 = nullPointer24.isActual();
        java.lang.Object obj30 = nullPointer24.getBaseValue();
        org.apache.commons.jxpath.ri.model.beans.LangAttributePointer langAttributePointer31 = new org.apache.commons.jxpath.ri.model.beans.LangAttributePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPointer24);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.jxpath.JXPathContext jXPathContext0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest3 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName1, "hi!");
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.beanutils.DynaBean dynaBean5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer7 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName4, dynaBean5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = dynaBeanPointer7.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer7, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer10.namespacePointer("hi!");
        boolean boolean13 = jDOMNodePointer10.isCollection();
        boolean boolean15 = jDOMNodePointer10.equals((java.lang.Object) "");
        boolean boolean16 = jDOMNodePointer10.isLeaf();
        java.lang.Object obj17 = jDOMNodePointer10.getValue();
        org.apache.commons.jxpath.ri.JXPathContextReferenceImpl jXPathContextReferenceImpl18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(jXPathContext0, (java.lang.Object) nodeNameTest3, (org.apache.commons.jxpath.Pointer) jDOMNodePointer10);
        java.lang.String str19 = jXPathContextReferenceImpl18.getDefaultNamespaceURI();
        java.lang.String str21 = jXPathContextReferenceImpl18.getNamespaceURI("/namespace::hi!");
        org.apache.commons.jxpath.Pointer pointer22 = jXPathContextReferenceImpl18.getContextPointer();
        org.apache.commons.jxpath.Pointer pointer23 = jXPathContextReferenceImpl18.getContextPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = null;
        org.w3c.dom.Attr attr25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer(nodePointer24, attr25);
        java.lang.Object obj27 = dOMAttributePointer26.getBaseValue();
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 0.0f, locale29);
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        org.apache.commons.jxpath.ri.axes.DescendantContext descendantContext34 = new org.apache.commons.jxpath.ri.axes.DescendantContext(evalContext31, false, nodeTest33);
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.jxpath.ri.compiler.NodeNameTest nodeNameTest37 = new org.apache.commons.jxpath.ri.compiler.NodeNameTest(qName35, "hi!");
        org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext precedingOrFollowingContext39 = new org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext((org.apache.commons.jxpath.ri.EvalContext) descendantContext34, (org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest37, true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = null;
        org.w3c.dom.Attr attr42 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer dOMAttributePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer(nodePointer41, attr42);
        java.lang.Object obj44 = dOMAttributePointer43.getBaseValue();
        java.lang.Object obj45 = dOMAttributePointer43.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer30.childIterator((org.apache.commons.jxpath.ri.compiler.NodeTest) nodeNameTest37, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMAttributePointer43);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = null;
        int int48 = dOMAttributePointer26.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30, nodePointer47);
        jXPathContextReferenceImpl18.setNamespaceContextPointer((org.apache.commons.jxpath.Pointer) jDOMNodePointer30);
        java.util.Locale locale50 = jXPathContextReferenceImpl18.getLocale();
        org.apache.commons.jxpath.ri.compiler.Step step53 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray54 = new org.apache.commons.jxpath.ri.compiler.Step[] { step53 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath55 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray54);
        boolean boolean56 = locationPath55.isAbsolute();
        boolean boolean57 = locationPath55.isContextDependent();
        boolean boolean58 = locationPath55.computeContextDependent();
        org.apache.commons.jxpath.ri.QName qName59 = null;
        org.apache.commons.beanutils.DynaBean dynaBean60 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer62 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName59, dynaBean60, locale61);
        org.apache.commons.jxpath.ri.QName qName63 = dynaBeanPointer62.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer62, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = jDOMNodePointer65.namespacePointer("hi!");
        java.lang.Class<?> wildcardClass68 = jDOMNodePointer65.getClass();
        int int69 = org.apache.commons.jxpath.util.ValueUtils.getCollectionHint((java.lang.Class) wildcardClass68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = jXPathContextReferenceImpl18.getValue("", (org.apache.commons.jxpath.ri.compiler.Expression) locationPath55, (java.lang.Class) wildcardClass68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(qName8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(pointer22);
        org.junit.Assert.assertNotNull(pointer23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(stepArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(qName63);
        org.junit.Assert.assertNotNull(nodePointer67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator61 = containerPointer59.namespaceIterator();
        java.lang.Object obj62 = containerPointer59.getRootNode();
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
        org.junit.Assert.assertNull(nodeIterator61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.jxpath.ri.compiler.TreeCompiler treeCompiler1 = new org.apache.commons.jxpath.ri.compiler.TreeCompiler();
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
        java.lang.Object obj17 = treeCompiler1.nodeNameTest((java.lang.Object) qName13);
        org.apache.commons.jxpath.ri.compiler.Step step19 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray20 = new org.apache.commons.jxpath.ri.compiler.Step[] { step19 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath21 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray20);
        java.lang.Object obj22 = treeCompiler1.or((java.lang.Object[]) stepArray20);
        java.lang.Object obj23 = org.apache.commons.jxpath.ri.Parser.parseExpression("null()", (org.apache.commons.jxpath.ri.Compiler) treeCompiler1);
        org.apache.commons.jxpath.ri.parser.Token token24 = null;
        int[][] intArray25 = new int[][] {};
        java.lang.String[] strArray26 = org.apache.commons.jxpath.ri.parser.XPathParserConstants.tokenImage;
        org.apache.commons.jxpath.ri.parser.ParseException parseException27 = new org.apache.commons.jxpath.ri.parser.ParseException(token24, intArray25, strArray26);
        int[][] intArray28 = parseException27.expectedTokenSequences;
        java.lang.Object obj29 = treeCompiler1.sum((java.lang.Object[]) intArray28);
        org.apache.commons.jxpath.ri.compiler.Step step31 = null;
        org.apache.commons.jxpath.ri.compiler.Step[] stepArray32 = new org.apache.commons.jxpath.ri.compiler.Step[] { step31 };
        org.apache.commons.jxpath.ri.compiler.LocationPath locationPath33 = new org.apache.commons.jxpath.ri.compiler.LocationPath(false, stepArray32);
        java.lang.Object obj34 = treeCompiler1.sum((java.lang.Object[]) stepArray32);
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.beanutils.DynaBean dynaBean36 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer dynaBeanPointer38 = new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer(qName35, dynaBean36, locale37);
        org.apache.commons.jxpath.ri.QName qName39 = dynaBeanPointer38.getName();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dynaBeanPointer38, (java.lang.Object) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = jDOMNodePointer41.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer44 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer41);
        java.lang.String[] strArray45 = nullPropertyPointer44.getPropertyNames();
        java.lang.Object obj46 = treeCompiler1.union((java.lang.Object[]) strArray45);
        org.junit.Assert.assertNull(qName6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(stepArray20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "unknownFunction28()()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "unknownFunction28()()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "unknownFunction28()()");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(stepArray32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(qName39);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "");
    }
}

