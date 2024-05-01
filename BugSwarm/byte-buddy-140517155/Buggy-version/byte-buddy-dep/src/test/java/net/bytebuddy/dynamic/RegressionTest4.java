import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='.class'}'}");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray4);
        byte[] byteArray6 = explicit5.resolve();
        boolean boolean8 = explicit5.equals((java.lang.Object) (short) 0);
        byte[] byteArray9 = explicit5.resolve();
        boolean boolean10 = explicit5.isResolved();
        boolean boolean11 = illegal1.equals((java.lang.Object) explicit5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        java.lang.String str2 = illegal1.toString();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        byte[] byteArray7 = explicit6.resolve();
        boolean boolean8 = explicit6.isResolved();
        boolean boolean10 = explicit6.equals((java.lang.Object) 10L);
        java.lang.String str11 = explicit6.toString();
        byte[] byteArray12 = explicit6.resolve();
        boolean boolean13 = illegal1.equals((java.lang.Object) byteArray12);
        java.lang.String str14 = illegal1.toString();
        boolean boolean15 = illegal1.isResolved();
        boolean boolean16 = illegal1.isResolved();
        boolean boolean17 = illegal1.isResolved();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str2, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str14, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray3);
        byte[] byteArray5 = explicit4.resolve();
        boolean boolean6 = explicit4.isResolved();
        boolean boolean8 = explicit4.equals((java.lang.Object) 10L);
        boolean boolean9 = explicit4.isResolved();
        java.lang.String str10 = explicit4.toString();
        byte[] byteArray11 = explicit4.resolve();
        java.lang.String str12 = explicit4.toString();
        byte[] byteArray13 = explicit4.resolve();
        boolean boolean14 = explicit4.isResolved();
        byte[] byteArray15 = explicit4.resolve();
        java.lang.String str16 = explicit4.toString();
        java.lang.String str17 = explicit4.toString();
        byte[] byteArray18 = explicit4.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator19 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}'}", byteArray18);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str10, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str12, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str16, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str17, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray4);
        byte[] byteArray6 = explicit5.resolve();
        boolean boolean7 = explicit5.isResolved();
        boolean boolean9 = explicit5.equals((java.lang.Object) 10L);
        boolean boolean10 = explicit5.isResolved();
        java.lang.String str11 = explicit5.toString();
        boolean boolean12 = explicit5.isResolved();
        boolean boolean13 = explicit5.isResolved();
        byte[] byteArray14 = explicit5.resolve();
        byte[] byteArray15 = explicit5.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator16 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='hi!'}", byteArray15);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit21 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray20);
        byte[] byteArray22 = explicit21.resolve();
        boolean boolean23 = explicit21.isResolved();
        boolean boolean25 = explicit21.equals((java.lang.Object) 10L);
        java.lang.String str26 = explicit21.toString();
        java.lang.String str27 = explicit21.toString();
        byte[] byteArray28 = explicit21.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit29 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray28);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray30 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound31 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray30);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit35 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray34);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp36 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean37 = explicit35.equals((java.lang.Object) noOp36);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution39 = noOp36.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution41 = noOp36.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str42 = noOp36.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution44 = noOp36.locate("");
        boolean boolean45 = compound31.equals((java.lang.Object) noOp36);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator46 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray28, (net.bytebuddy.dynamic.ClassFileLocator) noOp36);
        java.lang.String str47 = noOp36.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator48 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray15, (net.bytebuddy.dynamic.ClassFileLocator) noOp36);
        java.lang.String str49 = noOp36.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution51 = noOp36.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}'}");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str26, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str27, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocatorArray30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp36 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp36.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(resolution39);
        org.junit.Assert.assertNotNull(resolution41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str42, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(classFileLocator46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str47, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocator48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str49, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution51);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray0 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound1 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray0);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound2 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray0);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution4 = compound2.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution6 = compound2.locate("hi!");
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray16 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator17 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray16);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray13, classFileLocator17);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp19 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray29 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator30 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray29);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator31 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray26, classFileLocator30);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp32 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str33 = noOp32.toString();
        java.lang.String str34 = noOp32.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray35 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator17, noOp19, classFileLocator31, noOp32 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound36 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray35);
        boolean boolean38 = compound36.equals((java.lang.Object) "hi!");
        boolean boolean40 = compound36.equals((java.lang.Object) (-1.0d));
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution42 = compound36.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution44 = compound36.locate("");
        java.lang.String str45 = compound36.toString();
        java.lang.String str46 = compound36.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution48 = compound36.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        boolean boolean49 = compound2.equals((java.lang.Object) "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        java.lang.String str50 = compound2.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution52 = compound2.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray53 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound54 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray53);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound55 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray53);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound56 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray53);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator57 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofClassPath();
        boolean boolean58 = compound56.equals((java.lang.Object) classFileLocator57);
        boolean boolean59 = compound2.equals((java.lang.Object) boolean58);
        java.lang.String str60 = compound2.toString();
        org.junit.Assert.assertNotNull(classFileLocatorArray0);
        org.junit.Assert.assertNotNull(resolution4);
        org.junit.Assert.assertNotNull(resolution6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator17);
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertTrue("'" + noOp19 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp19.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator30);
        org.junit.Assert.assertNotNull(classFileLocator31);
        org.junit.Assert.assertTrue("'" + noOp32 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp32.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str33, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str34, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(resolution42);
        org.junit.Assert.assertNotNull(resolution44);
        org.junit.Assert.assertNotNull(resolution48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str50, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(resolution52);
        org.junit.Assert.assertNotNull(classFileLocatorArray53);
        org.junit.Assert.assertNotNull(classFileLocator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str60, "ClassFileLocator.Compound{classFileLocator=[]}");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        java.lang.String str9 = explicit3.toString();
        boolean boolean10 = explicit3.isResolved();
        boolean boolean11 = explicit3.isResolved();
        byte[] byteArray12 = explicit3.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit13 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray12);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray27 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray27);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator29 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray24, classFileLocator28);
        byte[] byteArray32 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator33 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray32);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator34 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray24, classFileLocator33);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator35 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray24);
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit39 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray38);
        byte[] byteArray40 = explicit39.resolve();
        boolean boolean41 = explicit39.isResolved();
        boolean boolean43 = explicit39.equals((java.lang.Object) 10L);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator44 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofClassPath();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution46 = classFileLocator44.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean47 = explicit39.equals((java.lang.Object) classFileLocator44);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator48 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray24, classFileLocator44);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit49 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray24);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit50 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray24);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator51 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray24);
        boolean boolean52 = explicit13.equals((java.lang.Object) "");
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit59 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray58);
        byte[] byteArray60 = explicit59.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator61 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray60);
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray72 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator73 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray72);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator74 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray69, classFileLocator73);
        byte[] byteArray77 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator78 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray77);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator79 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray69, classFileLocator78);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator80 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray60, classFileLocator78);
        byte[] byteArray84 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit85 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray84);
        byte[] byteArray86 = explicit85.resolve();
        boolean boolean87 = explicit85.isResolved();
        boolean boolean89 = explicit85.equals((java.lang.Object) 10L);
        boolean boolean90 = explicit85.isResolved();
        java.lang.String str91 = explicit85.toString();
        byte[] byteArray92 = explicit85.resolve();
        java.lang.String str93 = explicit85.toString();
        byte[] byteArray94 = explicit85.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator95 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray94);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator96 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray60, classFileLocator95);
        boolean boolean97 = explicit13.equals((java.lang.Object) classFileLocator96);
        boolean boolean98 = explicit13.isResolved();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertNotNull(classFileLocator29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator33);
        org.junit.Assert.assertNotNull(classFileLocator34);
        org.junit.Assert.assertNotNull(classFileLocator35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(classFileLocator44);
        org.junit.Assert.assertNotNull(resolution46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(classFileLocator48);
        org.junit.Assert.assertNotNull(classFileLocator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator61);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator73);
        org.junit.Assert.assertNotNull(classFileLocator74);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator78);
        org.junit.Assert.assertNotNull(classFileLocator79);
        org.junit.Assert.assertNotNull(classFileLocator80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str91, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray92), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str93, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray94), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator95);
        org.junit.Assert.assertNotNull(classFileLocator96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator14 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray13);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator15 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray10, classFileLocator14);
        byte[] byteArray18 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator19 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray18);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator20 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray10, classFileLocator19);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator21 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray10);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit25 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray24);
        byte[] byteArray26 = explicit25.resolve();
        boolean boolean27 = explicit25.isResolved();
        boolean boolean29 = explicit25.equals((java.lang.Object) 10L);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator30 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofClassPath();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution32 = classFileLocator30.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean33 = explicit25.equals((java.lang.Object) classFileLocator30);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator34 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray10, classFileLocator30);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator35 = null;
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator36 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray10, classFileLocator35);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit42 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray41);
        byte[] byteArray43 = explicit42.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator44 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray43);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator45 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}", byteArray43);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray46 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator35, classFileLocator45 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound47 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray46);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound48 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray46);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound49 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray46);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound50 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray46);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator14);
        org.junit.Assert.assertNotNull(classFileLocator15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator19);
        org.junit.Assert.assertNotNull(classFileLocator20);
        org.junit.Assert.assertNotNull(classFileLocator21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(classFileLocator30);
        org.junit.Assert.assertNotNull(resolution32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(classFileLocator34);
        org.junit.Assert.assertNotNull(classFileLocator36);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator44);
        org.junit.Assert.assertNotNull(classFileLocator45);
        org.junit.Assert.assertNotNull(classFileLocatorArray46);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator8 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofClassPath();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution10 = classFileLocator8.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean11 = explicit3.equals((java.lang.Object) classFileLocator8);
        boolean boolean12 = explicit3.isResolved();
        byte[] byteArray13 = explicit3.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit14 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray13);
        byte[] byteArray15 = explicit14.resolve();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(classFileLocator8);
        org.junit.Assert.assertNotNull(resolution10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator3 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit8 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        byte[] byteArray9 = explicit8.resolve();
        boolean boolean10 = explicit8.isResolved();
        boolean boolean12 = explicit8.equals((java.lang.Object) 10L);
        boolean boolean13 = explicit8.isResolved();
        java.lang.String str14 = explicit8.toString();
        byte[] byteArray15 = explicit8.resolve();
        java.lang.String str16 = explicit8.toString();
        boolean boolean17 = explicit4.equals((java.lang.Object) str16);
        byte[] byteArray18 = explicit4.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit19 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray18);
        byte[] byteArray20 = explicit19.resolve();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str14, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str16, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        boolean boolean31 = compound29.equals((java.lang.Object) "hi!");
        java.lang.String str32 = compound29.toString();
        java.lang.Object obj33 = null;
        boolean boolean34 = compound29.equals(obj33);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution36 = compound29.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution38 = compound29.locate("");
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit43 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray42);
        byte[] byteArray44 = explicit43.resolve();
        boolean boolean45 = explicit43.isResolved();
        boolean boolean47 = explicit43.equals((java.lang.Object) 10L);
        boolean boolean48 = explicit43.isResolved();
        java.lang.String str49 = explicit43.toString();
        byte[] byteArray50 = explicit43.resolve();
        java.lang.String str51 = explicit43.toString();
        byte[] byteArray52 = explicit43.resolve();
        boolean boolean53 = explicit43.isResolved();
        byte[] byteArray54 = explicit43.resolve();
        java.lang.Object obj55 = null;
        boolean boolean56 = explicit43.equals(obj55);
        byte[] byteArray57 = explicit43.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator58 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.NoOp.INSTANCE", byteArray57);
        boolean boolean59 = compound29.equals((java.lang.Object) classFileLocator58);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution61 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(resolution36);
        org.junit.Assert.assertNotNull(resolution38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str49, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str51, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(resolution61);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit7 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray6);
        byte[] byteArray8 = explicit7.resolve();
        boolean boolean9 = explicit7.isResolved();
        boolean boolean11 = explicit7.equals((java.lang.Object) 10L);
        boolean boolean12 = explicit7.isResolved();
        java.lang.String str13 = explicit7.toString();
        byte[] byteArray14 = explicit7.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp15 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str16 = noOp15.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution18 = noOp15.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator19 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='hi!'}", byteArray14, (net.bytebuddy.dynamic.ClassFileLocator) noOp15);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator20 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray14);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator21 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}", byteArray14);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit22 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray14);
        byte[] byteArray23 = explicit22.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit24 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray23);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit25 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray23);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit26 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray23);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator27 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray23);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str13, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp15 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp15.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str16, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution18);
        org.junit.Assert.assertNotNull(classFileLocator19);
        org.junit.Assert.assertNotNull(classFileLocator20);
        org.junit.Assert.assertNotNull(classFileLocator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator27);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        boolean boolean2 = illegal1.isResolved();
        java.lang.String str3 = illegal1.toString();
        boolean boolean4 = illegal1.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray5 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound6 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray5);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit10 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp11 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean12 = explicit10.equals((java.lang.Object) noOp11);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution14 = noOp11.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution16 = noOp11.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str17 = noOp11.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution19 = noOp11.locate("");
        boolean boolean20 = compound6.equals((java.lang.Object) noOp11);
        boolean boolean21 = illegal1.equals((java.lang.Object) compound6);
        boolean boolean22 = illegal1.isResolved();
        java.lang.String str23 = illegal1.toString();
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp24 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str25 = noOp24.toString();
        java.lang.String str26 = noOp24.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution28 = noOp24.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.String str29 = noOp24.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution31 = noOp24.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution33 = noOp24.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution35 = noOp24.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}");
        java.lang.String str36 = noOp24.toString();
        java.lang.String str37 = noOp24.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution39 = noOp24.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution41 = noOp24.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        boolean boolean42 = illegal1.equals((java.lang.Object) "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classFileLocatorArray5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp11 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp11.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(resolution14);
        org.junit.Assert.assertNotNull(resolution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str17, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str23, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertTrue("'" + noOp24 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp24.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str25, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str29, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution31);
        org.junit.Assert.assertNotNull(resolution33);
        org.junit.Assert.assertNotNull(resolution35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str36, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str37, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution39);
        org.junit.Assert.assertNotNull(resolution41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        java.lang.String str9 = explicit3.toString();
        boolean boolean10 = explicit3.isResolved();
        java.lang.Object obj11 = null;
        boolean boolean12 = explicit3.equals(obj11);
        byte[] byteArray13 = explicit3.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit14 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit7 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray6);
        byte[] byteArray8 = explicit7.resolve();
        boolean boolean9 = explicit7.isResolved();
        boolean boolean11 = explicit7.equals((java.lang.Object) 10L);
        boolean boolean12 = explicit7.isResolved();
        java.lang.String str13 = explicit7.toString();
        boolean boolean14 = explicit7.isResolved();
        boolean boolean15 = explicit7.isResolved();
        byte[] byteArray16 = explicit7.resolve();
        byte[] byteArray17 = explicit7.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='hi!'}", byteArray17);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit23 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray22);
        byte[] byteArray24 = explicit23.resolve();
        boolean boolean25 = explicit23.isResolved();
        boolean boolean27 = explicit23.equals((java.lang.Object) 10L);
        java.lang.String str28 = explicit23.toString();
        java.lang.String str29 = explicit23.toString();
        byte[] byteArray30 = explicit23.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit31 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray30);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray32 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound33 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray32);
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit37 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray36);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp38 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean39 = explicit37.equals((java.lang.Object) noOp38);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution41 = noOp38.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution43 = noOp38.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str44 = noOp38.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution46 = noOp38.locate("");
        boolean boolean47 = compound33.equals((java.lang.Object) noOp38);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator48 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray30, (net.bytebuddy.dynamic.ClassFileLocator) noOp38);
        java.lang.String str49 = noOp38.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator50 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) noOp38);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator51 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<6 bytes>}", byteArray17);
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray61 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator62 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray61);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator63 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray58, classFileLocator62);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp64 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray74 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator75 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray74);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator76 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray71, classFileLocator75);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp77 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str78 = noOp77.toString();
        java.lang.String str79 = noOp77.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray80 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator62, noOp64, classFileLocator76, noOp77 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound81 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray80);
        boolean boolean83 = compound81.equals((java.lang.Object) "hi!");
        java.lang.String str84 = compound81.toString();
        java.lang.Object obj85 = null;
        boolean boolean86 = compound81.equals(obj85);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator87 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) compound81);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str13, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str28, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str29, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocatorArray32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp38 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp38.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(resolution41);
        org.junit.Assert.assertNotNull(resolution43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str44, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(classFileLocator48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str49, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocator50);
        org.junit.Assert.assertNotNull(classFileLocator51);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator62);
        org.junit.Assert.assertNotNull(classFileLocator63);
        org.junit.Assert.assertTrue("'" + noOp64 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp64.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator75);
        org.junit.Assert.assertNotNull(classFileLocator76);
        org.junit.Assert.assertTrue("'" + noOp77 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp77.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str78, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str79, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(classFileLocator87);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution7 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution9 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution11 = noOp4.locate("hi!");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution13 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        java.lang.String str14 = noOp4.toString();
        java.lang.String str15 = noOp4.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(resolution7);
        org.junit.Assert.assertNotNull(resolution9);
        org.junit.Assert.assertNotNull(resolution11);
        org.junit.Assert.assertNotNull(resolution13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str14, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str15, "ClassFileLocator.NoOp.INSTANCE");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator7 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray5);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit8 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit9 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit13 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray12);
        byte[] byteArray14 = explicit13.resolve();
        boolean boolean15 = explicit13.isResolved();
        boolean boolean17 = explicit13.equals((java.lang.Object) 10L);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofClassPath();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution20 = classFileLocator18.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean21 = explicit13.equals((java.lang.Object) classFileLocator18);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution23 = classFileLocator18.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Compound{classFileLocator=[]}", byteArray5, classFileLocator18);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='hi!'}'}", byteArray5);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution27 = classFileLocator25.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertNotNull(resolution20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(resolution23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertNotNull(resolution27);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean2 = illegal1.isResolved();
        java.lang.String str3 = illegal1.toString();
        boolean boolean4 = illegal1.isResolved();
        boolean boolean6 = illegal1.equals((java.lang.Object) 0);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray16 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator17 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray16);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray13, classFileLocator17);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp19 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray29 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator30 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray29);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator31 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray26, classFileLocator30);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp32 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str33 = noOp32.toString();
        java.lang.String str34 = noOp32.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray35 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator17, noOp19, classFileLocator31, noOp32 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound36 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray35);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution38 = compound36.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        java.lang.String str39 = compound36.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution41 = compound36.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit46 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray45);
        byte[] byteArray47 = explicit46.resolve();
        java.lang.String str48 = explicit46.toString();
        boolean boolean49 = explicit46.isResolved();
        java.lang.String str50 = explicit46.toString();
        byte[] byteArray51 = explicit46.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator52 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray51);
        boolean boolean53 = compound36.equals((java.lang.Object) byteArray51);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit54 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray51);
        byte[] byteArray55 = explicit54.resolve();
        boolean boolean56 = explicit54.isResolved();
        boolean boolean57 = illegal1.equals((java.lang.Object) explicit54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator17);
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertTrue("'" + noOp19 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp19.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator30);
        org.junit.Assert.assertNotNull(classFileLocator31);
        org.junit.Assert.assertTrue("'" + noOp32 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp32.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str33, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str34, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray35);
        org.junit.Assert.assertNotNull(resolution38);
        org.junit.Assert.assertNotNull(resolution41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str48, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str50, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray0 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound1 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray0);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound2 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray0);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution4 = compound2.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution6 = compound2.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution8 = compound2.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit12 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray11);
        byte[] byteArray13 = explicit12.resolve();
        java.lang.String str14 = explicit12.toString();
        boolean boolean15 = explicit12.isResolved();
        java.lang.String str16 = explicit12.toString();
        byte[] byteArray17 = explicit12.resolve();
        boolean boolean18 = explicit12.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal20 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean21 = illegal20.isResolved();
        java.lang.String str22 = illegal20.toString();
        boolean boolean23 = illegal20.isResolved();
        boolean boolean24 = illegal20.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal26 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        byte[] byteArray29 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator30 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray29);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution32 = classFileLocator30.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        boolean boolean33 = illegal26.equals((java.lang.Object) resolution32);
        boolean boolean34 = illegal20.equals((java.lang.Object) boolean33);
        boolean boolean35 = illegal20.isResolved();
        boolean boolean36 = illegal20.isResolved();
        boolean boolean37 = illegal20.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray38 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound39 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray38);
        java.lang.String str40 = compound39.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution42 = compound39.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean43 = illegal20.equals((java.lang.Object) "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit47 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray46);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp48 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean49 = explicit47.equals((java.lang.Object) noOp48);
        java.lang.Class<?> wildcardClass50 = noOp48.getClass();
        boolean boolean51 = illegal20.equals((java.lang.Object) wildcardClass50);
        boolean boolean52 = illegal20.isResolved();
        boolean boolean53 = explicit12.equals((java.lang.Object) illegal20);
        byte[] byteArray54 = explicit12.resolve();
        boolean boolean55 = compound2.equals((java.lang.Object) explicit12);
        org.junit.Assert.assertNotNull(classFileLocatorArray0);
        org.junit.Assert.assertNotNull(resolution4);
        org.junit.Assert.assertNotNull(resolution6);
        org.junit.Assert.assertNotNull(resolution8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str14, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str16, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str22, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator30);
        org.junit.Assert.assertNotNull(resolution32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(classFileLocatorArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str40, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(resolution42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp48 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp48.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator4 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray3);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit8 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp9 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean10 = explicit8.equals((java.lang.Object) noOp9);
        java.lang.String str11 = noOp9.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator12 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Compound{classFileLocator=[]}", byteArray3, (net.bytebuddy.dynamic.ClassFileLocator) noOp9);
        java.lang.String str13 = noOp9.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution15 = noOp9.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        java.lang.String str16 = noOp9.toString();
        java.lang.String str17 = noOp9.toString();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp9 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp9.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str11, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str13, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str16, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str17, "ClassFileLocator.NoOp.INSTANCE");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        java.lang.String str9 = explicit3.toString();
        boolean boolean10 = explicit3.isResolved();
        boolean boolean11 = explicit3.isResolved();
        byte[] byteArray12 = explicit3.resolve();
        byte[] byteArray13 = explicit3.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp14 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str15 = noOp14.toString();
        java.lang.String str16 = noOp14.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution18 = noOp14.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.String str19 = noOp14.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution21 = noOp14.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution23 = noOp14.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution25 = noOp14.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}");
        java.lang.String str26 = noOp14.toString();
        java.lang.String str27 = noOp14.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution29 = noOp14.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean30 = explicit3.equals((java.lang.Object) noOp14);
        byte[] byteArray31 = explicit3.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit32 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray31);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit33 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray31);
        java.lang.String str34 = explicit33.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp14 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp14.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str15, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str16, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str19, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution21);
        org.junit.Assert.assertNotNull(resolution23);
        org.junit.Assert.assertNotNull(resolution25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str34, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        boolean boolean2 = illegal1.isResolved();
        java.lang.String str3 = illegal1.toString();
        boolean boolean4 = illegal1.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray5 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound6 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray5);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit10 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp11 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean12 = explicit10.equals((java.lang.Object) noOp11);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution14 = noOp11.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution16 = noOp11.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str17 = noOp11.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution19 = noOp11.locate("");
        boolean boolean20 = compound6.equals((java.lang.Object) noOp11);
        boolean boolean21 = illegal1.equals((java.lang.Object) compound6);
        boolean boolean22 = illegal1.isResolved();
        boolean boolean23 = illegal1.isResolved();
        boolean boolean24 = illegal1.isResolved();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classFileLocatorArray5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp11 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp11.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(resolution14);
        org.junit.Assert.assertNotNull(resolution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str17, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray10);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator12 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray7, classFileLocator11);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit13 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        byte[] byteArray17 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit19 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray17);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray29 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator30 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray29);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator31 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray26, classFileLocator30);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp32 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray42 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator43 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray42);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator44 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray39, classFileLocator43);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp45 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str46 = noOp45.toString();
        java.lang.String str47 = noOp45.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray48 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator30, noOp32, classFileLocator44, noOp45 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound49 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray48);
        boolean boolean51 = compound49.equals((java.lang.Object) "hi!");
        java.lang.String str52 = compound49.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator53 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) compound49);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator54 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='hi!'}", byteArray7, classFileLocator53);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit55 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        byte[] byteArray56 = explicit55.resolve();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertNotNull(classFileLocator12);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator30);
        org.junit.Assert.assertNotNull(classFileLocator31);
        org.junit.Assert.assertTrue("'" + noOp32 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp32.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator43);
        org.junit.Assert.assertNotNull(classFileLocator44);
        org.junit.Assert.assertTrue("'" + noOp45 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp45.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str46, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str47, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(classFileLocator53);
        org.junit.Assert.assertNotNull(classFileLocator54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 10, -1, -1, 1]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray3);
        byte[] byteArray5 = explicit4.resolve();
        boolean boolean6 = explicit4.isResolved();
        boolean boolean8 = explicit4.equals((java.lang.Object) 10L);
        java.lang.String str9 = explicit4.toString();
        byte[] byteArray10 = explicit4.resolve();
        byte[] byteArray11 = explicit4.resolve();
        byte[] byteArray12 = explicit4.resolve();
        byte[] byteArray13 = explicit4.resolve();
        byte[] byteArray14 = explicit4.resolve();
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray24 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray24);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator26 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray21, classFileLocator25);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp27 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray37 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator38 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray37);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator39 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray34, classFileLocator38);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp40 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str41 = noOp40.toString();
        java.lang.String str42 = noOp40.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray43 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator25, noOp27, classFileLocator39, noOp40 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound44 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray43);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution46 = compound44.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution48 = compound44.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution50 = compound44.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.Object obj51 = null;
        boolean boolean52 = compound44.equals(obj51);
        java.lang.String str53 = compound44.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator54 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}", byteArray14, (net.bytebuddy.dynamic.ClassFileLocator) compound44);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit55 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray14);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertNotNull(classFileLocator26);
        org.junit.Assert.assertTrue("'" + noOp27 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp27.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator38);
        org.junit.Assert.assertNotNull(classFileLocator39);
        org.junit.Assert.assertTrue("'" + noOp40 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp40.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str41, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str42, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray43);
        org.junit.Assert.assertNotNull(resolution46);
        org.junit.Assert.assertNotNull(resolution48);
        org.junit.Assert.assertNotNull(resolution50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(classFileLocator54);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean2 = illegal1.isResolved();
        java.lang.String str3 = illegal1.toString();
        boolean boolean4 = illegal1.isResolved();
        boolean boolean5 = illegal1.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal7 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        byte[] byteArray10 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray10);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution13 = classFileLocator11.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        boolean boolean14 = illegal7.equals((java.lang.Object) resolution13);
        boolean boolean15 = illegal1.equals((java.lang.Object) boolean14);
        boolean boolean16 = illegal1.isResolved();
        boolean boolean17 = illegal1.isResolved();
        boolean boolean18 = illegal1.isResolved();
        boolean boolean19 = illegal1.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal21 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray31 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator32 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray31);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator33 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray28, classFileLocator32);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp34 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray44 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator45 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray44);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator46 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray41, classFileLocator45);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp47 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str48 = noOp47.toString();
        java.lang.String str49 = noOp47.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray50 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator32, noOp34, classFileLocator46, noOp47 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound51 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray50);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution53 = compound51.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution55 = compound51.locate("");
        boolean boolean56 = illegal21.equals((java.lang.Object) resolution55);
        boolean boolean57 = illegal1.equals((java.lang.Object) illegal21);
        java.lang.String str58 = illegal21.toString();
        java.lang.String str59 = illegal21.toString();
        java.lang.String str60 = illegal21.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertNotNull(resolution13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator32);
        org.junit.Assert.assertNotNull(classFileLocator33);
        org.junit.Assert.assertTrue("'" + noOp34 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp34.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator45);
        org.junit.Assert.assertNotNull(classFileLocator46);
        org.junit.Assert.assertTrue("'" + noOp47 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp47.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str48, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str49, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray50);
        org.junit.Assert.assertNotNull(resolution53);
        org.junit.Assert.assertNotNull(resolution55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}" + "'", str58, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}" + "'", str59, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}" + "'", str60, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray0 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound1 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray0);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound2 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray0);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution4 = compound2.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution6 = compound2.locate("hi!");
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray16 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator17 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray16);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray13, classFileLocator17);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp19 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray29 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator30 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray29);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator31 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray26, classFileLocator30);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp32 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str33 = noOp32.toString();
        java.lang.String str34 = noOp32.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray35 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator17, noOp19, classFileLocator31, noOp32 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound36 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray35);
        boolean boolean38 = compound36.equals((java.lang.Object) "hi!");
        boolean boolean40 = compound36.equals((java.lang.Object) (-1.0d));
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution42 = compound36.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution44 = compound36.locate("");
        java.lang.String str45 = compound36.toString();
        java.lang.String str46 = compound36.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution48 = compound36.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        boolean boolean49 = compound2.equals((java.lang.Object) "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        java.lang.String str50 = compound2.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution52 = compound2.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution54 = compound2.locate("");
        boolean boolean55 = resolution54.isResolved();
        org.junit.Assert.assertNotNull(classFileLocatorArray0);
        org.junit.Assert.assertNotNull(resolution4);
        org.junit.Assert.assertNotNull(resolution6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator17);
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertTrue("'" + noOp19 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp19.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator30);
        org.junit.Assert.assertNotNull(classFileLocator31);
        org.junit.Assert.assertTrue("'" + noOp32 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp32.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str33, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str34, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(resolution42);
        org.junit.Assert.assertNotNull(resolution44);
        org.junit.Assert.assertNotNull(resolution48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str50, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(resolution52);
        org.junit.Assert.assertNotNull(resolution54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator3 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit8 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        byte[] byteArray9 = explicit8.resolve();
        boolean boolean10 = explicit8.isResolved();
        boolean boolean12 = explicit8.equals((java.lang.Object) 10L);
        boolean boolean13 = explicit8.isResolved();
        java.lang.String str14 = explicit8.toString();
        byte[] byteArray15 = explicit8.resolve();
        java.lang.String str16 = explicit8.toString();
        boolean boolean17 = explicit4.equals((java.lang.Object) str16);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal19 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean20 = illegal19.isResolved();
        java.lang.String str21 = illegal19.toString();
        java.lang.String str22 = illegal19.toString();
        boolean boolean23 = illegal19.isResolved();
        boolean boolean24 = explicit4.equals((java.lang.Object) illegal19);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str14, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str16, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}" + "'", str21, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}" + "'", str22, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray10);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator12 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray7, classFileLocator11);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp13 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray23 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray23);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray20, classFileLocator24);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp26 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str27 = noOp26.toString();
        java.lang.String str28 = noOp26.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray29 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator11, noOp13, classFileLocator25, noOp26 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound30 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray29);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution32 = compound30.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        java.lang.String str33 = compound30.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution35 = compound30.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit40 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray39);
        byte[] byteArray41 = explicit40.resolve();
        java.lang.String str42 = explicit40.toString();
        boolean boolean43 = explicit40.isResolved();
        java.lang.String str44 = explicit40.toString();
        byte[] byteArray45 = explicit40.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator46 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray45);
        boolean boolean47 = compound30.equals((java.lang.Object) byteArray45);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit48 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray45);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit54 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray53);
        byte[] byteArray55 = explicit54.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator56 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray55);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray57 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound58 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray57);
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit62 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray61);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp63 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean64 = explicit62.equals((java.lang.Object) noOp63);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution66 = noOp63.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution68 = noOp63.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str69 = noOp63.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution71 = noOp63.locate("");
        boolean boolean72 = compound58.equals((java.lang.Object) noOp63);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator73 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray55, (net.bytebuddy.dynamic.ClassFileLocator) noOp63);
        java.lang.String str74 = noOp63.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution76 = noOp63.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator77 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Compound{classFileLocator=[]}", byteArray45, (net.bytebuddy.dynamic.ClassFileLocator) noOp63);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution79 = noOp63.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<6 bytes>}'}");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertNotNull(classFileLocator12);
        org.junit.Assert.assertTrue("'" + noOp13 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp13.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertTrue("'" + noOp26 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp26.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str28, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray29);
        org.junit.Assert.assertNotNull(resolution32);
        org.junit.Assert.assertNotNull(resolution35);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str42, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str44, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator56);
        org.junit.Assert.assertNotNull(classFileLocatorArray57);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp63 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp63.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(resolution66);
        org.junit.Assert.assertNotNull(resolution68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str69, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(classFileLocator73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str74, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution76);
        org.junit.Assert.assertNotNull(classFileLocator77);
        org.junit.Assert.assertNotNull(resolution79);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound30 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound31 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound32 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound33 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound34 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        java.lang.String str6 = explicit3.toString();
        boolean boolean7 = explicit3.isResolved();
        byte[] byteArray8 = explicit3.resolve();
        java.lang.String str9 = explicit3.toString();
        boolean boolean10 = explicit3.isResolved();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit16 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray15);
        byte[] byteArray17 = explicit16.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray19 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound20 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray19);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit24 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean26 = explicit24.equals((java.lang.Object) noOp25);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution28 = noOp25.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution30 = noOp25.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str31 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution33 = noOp25.locate("");
        boolean boolean34 = compound20.equals((java.lang.Object) noOp25);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator35 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) noOp25);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution37 = noOp25.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        java.lang.String str38 = noOp25.toString();
        boolean boolean39 = explicit3.equals((java.lang.Object) noOp25);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution41 = noOp25.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str6, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertNotNull(classFileLocatorArray19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(resolution28);
        org.junit.Assert.assertNotNull(resolution30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str31, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classFileLocator35);
        org.junit.Assert.assertNotNull(resolution37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str38, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(resolution41);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution31 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution33 = compound29.locate("");
        java.lang.String str34 = compound29.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution36 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution38 = compound29.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        java.lang.String str39 = compound29.toString();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
        org.junit.Assert.assertNotNull(resolution31);
        org.junit.Assert.assertNotNull(resolution33);
        org.junit.Assert.assertNotNull(resolution36);
        org.junit.Assert.assertNotNull(resolution38);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        java.lang.String str9 = explicit3.toString();
        byte[] byteArray10 = explicit3.resolve();
        java.lang.String str11 = explicit3.toString();
        boolean boolean12 = explicit3.isResolved();
        java.lang.String str13 = explicit3.toString();
        boolean boolean14 = explicit3.isResolved();
        byte[] byteArray15 = explicit3.resolve();
        byte[] byteArray16 = explicit3.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit17 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray16);
        boolean boolean18 = explicit17.isResolved();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str13, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit7 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray6);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator8 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray6);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit9 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray6);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray6);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}", byteArray6);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit12 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray6);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator13 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='hi!'}", byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator8);
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertNotNull(classFileLocator13);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution7 = noOp4.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution9 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str10 = noOp4.toString();
        java.lang.String str11 = noOp4.toString();
        java.lang.String str12 = noOp4.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(resolution7);
        org.junit.Assert.assertNotNull(resolution9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str10, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str11, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str12, "ClassFileLocator.NoOp.INSTANCE");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        byte[] byteArray5 = explicit3.resolve();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit9 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray8);
        byte[] byteArray10 = explicit9.resolve();
        boolean boolean11 = explicit9.isResolved();
        boolean boolean13 = explicit9.equals((java.lang.Object) 10L);
        boolean boolean14 = explicit9.isResolved();
        boolean boolean15 = explicit9.isResolved();
        boolean boolean16 = explicit9.isResolved();
        byte[] byteArray17 = explicit9.resolve();
        boolean boolean18 = explicit3.equals((java.lang.Object) explicit9);
        boolean boolean19 = explicit3.isResolved();
        byte[] byteArray20 = explicit3.resolve();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 100]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        java.lang.String str2 = illegal1.toString();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator14 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray13);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator15 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray10, classFileLocator14);
        byte[] byteArray18 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator19 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray18);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator20 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray10, classFileLocator19);
        boolean boolean21 = illegal1.equals((java.lang.Object) "");
        boolean boolean22 = illegal1.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal24 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        boolean boolean25 = illegal24.isResolved();
        boolean boolean26 = illegal24.isResolved();
        boolean boolean27 = illegal24.isResolved();
        boolean boolean28 = illegal1.equals((java.lang.Object) illegal24);
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit32 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray31);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp33 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean34 = explicit32.equals((java.lang.Object) noOp33);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution36 = noOp33.locate("");
        boolean boolean37 = illegal1.equals((java.lang.Object) "");
        boolean boolean38 = illegal1.isResolved();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray39 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}" + "'", str2, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator14);
        org.junit.Assert.assertNotNull(classFileLocator15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator19);
        org.junit.Assert.assertNotNull(classFileLocator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp33 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp33.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(resolution36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray0 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound1 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray0);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound2 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray0);
        java.lang.String str3 = compound2.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray4 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound5 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray4);
        boolean boolean6 = compound2.equals((java.lang.Object) classFileLocatorArray4);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound7 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray4);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray8 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound9 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray8);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound10 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray8);
        java.lang.String str11 = compound10.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray12 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound13 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        boolean boolean14 = compound10.equals((java.lang.Object) classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound15 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound16 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound17 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound18 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound19 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound20 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound21 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        boolean boolean22 = compound7.equals((java.lang.Object) classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound23 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound24 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        org.junit.Assert.assertNotNull(classFileLocatorArray0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str3, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(classFileLocatorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(classFileLocatorArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str11, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(classFileLocatorArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution7 = noOp4.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution9 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution11 = noOp4.locate("");
        java.lang.String str12 = noOp4.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution14 = noOp4.locate(".class");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(resolution7);
        org.junit.Assert.assertNotNull(resolution9);
        org.junit.Assert.assertNotNull(resolution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str12, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution14);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator3 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator14 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray13);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator15 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray10, classFileLocator14);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp16 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray26 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator27 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray26);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray23, classFileLocator27);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp29 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str30 = noOp29.toString();
        java.lang.String str31 = noOp29.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray32 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator14, noOp16, classFileLocator28, noOp29 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound33 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray32);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution35 = compound33.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray36 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator3, compound33 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound37 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray36);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound38 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray36);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit42 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray41);
        byte[] byteArray43 = explicit42.resolve();
        boolean boolean44 = explicit42.isResolved();
        boolean boolean46 = explicit42.equals((java.lang.Object) 10L);
        boolean boolean47 = explicit42.isResolved();
        boolean boolean48 = explicit42.isResolved();
        boolean boolean49 = explicit42.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray50 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound51 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray50);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound52 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray50);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound53 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray50);
        boolean boolean54 = explicit42.equals((java.lang.Object) classFileLocatorArray50);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound55 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray50);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound56 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray50);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound57 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray50);
        boolean boolean58 = compound38.equals((java.lang.Object) classFileLocatorArray50);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound59 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray50);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator3);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator14);
        org.junit.Assert.assertNotNull(classFileLocator15);
        org.junit.Assert.assertTrue("'" + noOp16 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp16.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator27);
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertTrue("'" + noOp29 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp29.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str30, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str31, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray32);
        org.junit.Assert.assertNotNull(resolution35);
        org.junit.Assert.assertNotNull(classFileLocatorArray36);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(classFileLocatorArray50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        java.lang.String str4 = illegal3.toString();
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit8 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        byte[] byteArray9 = explicit8.resolve();
        boolean boolean10 = explicit8.isResolved();
        boolean boolean12 = explicit8.equals((java.lang.Object) 10L);
        java.lang.String str13 = explicit8.toString();
        java.lang.String str14 = explicit8.toString();
        byte[] byteArray15 = explicit8.resolve();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray26 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator27 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray26);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray23, classFileLocator27);
        byte[] byteArray32 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator33 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray32);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit34 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray32);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray44 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator45 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray44);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator46 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray41, classFileLocator45);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp47 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray57 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator58 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray57);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator59 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray54, classFileLocator58);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp60 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str61 = noOp60.toString();
        java.lang.String str62 = noOp60.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray63 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator45, noOp47, classFileLocator59, noOp60 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound64 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray63);
        boolean boolean66 = compound64.equals((java.lang.Object) "hi!");
        java.lang.String str67 = compound64.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator68 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray32, (net.bytebuddy.dynamic.ClassFileLocator) compound64);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator69 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray23, (net.bytebuddy.dynamic.ClassFileLocator) compound64);
        boolean boolean70 = explicit8.equals((java.lang.Object) "hi!");
        boolean boolean71 = illegal3.equals((java.lang.Object) explicit8);
        byte[] byteArray72 = explicit8.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator73 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='hi!'}", byteArray72);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator74 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<6 bytes>}'}", byteArray72);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str4, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str13, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str14, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator27);
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator33);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator45);
        org.junit.Assert.assertNotNull(classFileLocator46);
        org.junit.Assert.assertTrue("'" + noOp47 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp47.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator58);
        org.junit.Assert.assertNotNull(classFileLocator59);
        org.junit.Assert.assertTrue("'" + noOp60 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp60.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str61, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str62, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(classFileLocator68);
        org.junit.Assert.assertNotNull(classFileLocator69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator73);
        org.junit.Assert.assertNotNull(classFileLocator74);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator8 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray7);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit9 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        byte[] byteArray10 = explicit9.resolve();
        byte[] byteArray11 = explicit9.resolve();
        byte[] byteArray12 = explicit9.resolve();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(classFileLocator8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, -1, 1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, -1, 1, -1, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, -1, 1, -1, 0, 100]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        java.lang.String str7 = illegal6.toString();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit11 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray10);
        byte[] byteArray12 = explicit11.resolve();
        boolean boolean13 = explicit11.isResolved();
        boolean boolean15 = explicit11.equals((java.lang.Object) 10L);
        java.lang.String str16 = explicit11.toString();
        byte[] byteArray17 = explicit11.resolve();
        boolean boolean18 = illegal6.equals((java.lang.Object) byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator19 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray17);
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray33 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator34 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray33);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator35 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray30, classFileLocator34);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp36 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray46 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator47 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray46);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator48 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray43, classFileLocator47);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp49 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str50 = noOp49.toString();
        java.lang.String str51 = noOp49.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray52 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator34, noOp36, classFileLocator48, noOp49 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound53 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray52);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution55 = compound53.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray56 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator23, compound53 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound57 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray56);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator58 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) compound57);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator59 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}", byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator60 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator61 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}", byteArray17);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str7, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str16, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classFileLocator19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator34);
        org.junit.Assert.assertNotNull(classFileLocator35);
        org.junit.Assert.assertTrue("'" + noOp36 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp36.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator47);
        org.junit.Assert.assertNotNull(classFileLocator48);
        org.junit.Assert.assertTrue("'" + noOp49 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp49.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str50, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str51, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray52);
        org.junit.Assert.assertNotNull(resolution55);
        org.junit.Assert.assertNotNull(classFileLocatorArray56);
        org.junit.Assert.assertNotNull(classFileLocator58);
        org.junit.Assert.assertNotNull(classFileLocator59);
        org.junit.Assert.assertNotNull(classFileLocator60);
        org.junit.Assert.assertNotNull(classFileLocator61);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        boolean boolean9 = explicit3.isResolved();
        boolean boolean10 = explicit3.isResolved();
        java.lang.String str11 = explicit3.toString();
        byte[] byteArray12 = explicit3.resolve();
        boolean boolean13 = explicit3.isResolved();
        boolean boolean14 = explicit3.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray15 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound16 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray15);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound17 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray15);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound18 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray15);
        java.lang.String str19 = compound18.toString();
        java.lang.String str20 = compound18.toString();
        java.lang.String str21 = compound18.toString();
        java.lang.String str22 = compound18.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution24 = compound18.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution26 = compound18.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution28 = compound18.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution30 = compound18.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        boolean boolean31 = explicit3.equals((java.lang.Object) resolution30);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(classFileLocatorArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str19, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str20, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str21, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str22, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(resolution24);
        org.junit.Assert.assertNotNull(resolution26);
        org.junit.Assert.assertNotNull(resolution28);
        org.junit.Assert.assertNotNull(resolution30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean2 = illegal1.isResolved();
        java.lang.String str3 = illegal1.toString();
        boolean boolean4 = illegal1.isResolved();
        boolean boolean5 = illegal1.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal7 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        java.lang.String str8 = illegal7.toString();
        boolean boolean9 = illegal7.isResolved();
        boolean boolean10 = illegal1.equals((java.lang.Object) illegal7);
        java.lang.String str11 = illegal1.toString();
        boolean boolean12 = illegal1.isResolved();
        boolean boolean13 = illegal1.isResolved();
        boolean boolean14 = illegal1.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal16 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray26 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator27 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray26);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray23, classFileLocator27);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp29 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray39 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator40 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray39);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator41 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray36, classFileLocator40);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp42 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str43 = noOp42.toString();
        java.lang.String str44 = noOp42.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray45 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator27, noOp29, classFileLocator41, noOp42 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound46 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray45);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution48 = compound46.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution50 = compound46.locate("");
        boolean boolean51 = illegal16.equals((java.lang.Object) resolution50);
        java.lang.String str52 = illegal16.toString();
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit56 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray55);
        byte[] byteArray57 = explicit56.resolve();
        boolean boolean58 = explicit56.isResolved();
        boolean boolean60 = explicit56.equals((java.lang.Object) 10L);
        boolean boolean61 = explicit56.isResolved();
        java.lang.String str62 = explicit56.toString();
        byte[] byteArray63 = explicit56.resolve();
        boolean boolean64 = illegal16.equals((java.lang.Object) byteArray63);
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit68 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray67);
        byte[] byteArray69 = explicit68.resolve();
        boolean boolean70 = explicit68.isResolved();
        boolean boolean72 = explicit68.equals((java.lang.Object) 10L);
        boolean boolean73 = explicit68.isResolved();
        java.lang.String str74 = explicit68.toString();
        boolean boolean75 = explicit68.isResolved();
        boolean boolean76 = explicit68.isResolved();
        byte[] byteArray77 = explicit68.resolve();
        boolean boolean78 = illegal16.equals((java.lang.Object) explicit68);
        boolean boolean79 = illegal1.equals((java.lang.Object) explicit68);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray80 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound81 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray80);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound82 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray80);
        java.lang.String str83 = compound82.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray84 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound85 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray84);
        boolean boolean86 = compound82.equals((java.lang.Object) classFileLocatorArray84);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound87 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray84);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound88 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray84);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution90 = compound88.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution92 = compound88.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='hi!'}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution94 = compound88.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution96 = compound88.locate("");
        boolean boolean97 = illegal1.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str8, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str11, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator27);
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertTrue("'" + noOp29 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp29.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator40);
        org.junit.Assert.assertNotNull(classFileLocator41);
        org.junit.Assert.assertTrue("'" + noOp42 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp42.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str43, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str44, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray45);
        org.junit.Assert.assertNotNull(resolution48);
        org.junit.Assert.assertNotNull(resolution50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}" + "'", str52, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str62, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str74, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(classFileLocatorArray80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str83, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(classFileLocatorArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(resolution90);
        org.junit.Assert.assertNotNull(resolution92);
        org.junit.Assert.assertNotNull(resolution94);
        org.junit.Assert.assertNotNull(resolution96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        boolean boolean2 = illegal1.isResolved();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp7 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean8 = explicit6.equals((java.lang.Object) noOp7);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution10 = noOp7.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution12 = noOp7.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str13 = noOp7.toString();
        java.lang.String str14 = noOp7.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution16 = noOp7.locate("hi!");
        boolean boolean17 = illegal1.equals((java.lang.Object) resolution16);
        java.lang.String str18 = illegal1.toString();
        java.lang.String str19 = illegal1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp7 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp7.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(resolution10);
        org.junit.Assert.assertNotNull(resolution12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str13, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str14, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str18, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str19, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray3);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator5 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray3);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray3);
        boolean boolean7 = explicit6.isResolved();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        boolean boolean2 = illegal1.isResolved();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp7 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean8 = explicit6.equals((java.lang.Object) noOp7);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution10 = noOp7.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution12 = noOp7.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str13 = noOp7.toString();
        java.lang.String str14 = noOp7.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution16 = noOp7.locate("hi!");
        boolean boolean17 = illegal1.equals((java.lang.Object) resolution16);
        java.lang.String str18 = illegal1.toString();
        java.lang.String str19 = illegal1.toString();
        java.lang.String str20 = illegal1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp7 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp7.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(resolution10);
        org.junit.Assert.assertNotNull(resolution12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str13, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str14, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str18, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str19, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str20, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        java.lang.String str9 = explicit3.toString();
        boolean boolean10 = explicit3.isResolved();
        boolean boolean11 = explicit3.isResolved();
        byte[] byteArray12 = explicit3.resolve();
        byte[] byteArray13 = explicit3.resolve();
        byte[] byteArray14 = explicit3.resolve();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit18 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp19 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean20 = explicit18.equals((java.lang.Object) noOp19);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution22 = noOp19.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution24 = noOp19.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution26 = noOp19.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution28 = noOp19.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        boolean boolean29 = explicit3.equals((java.lang.Object) "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.Class<?> wildcardClass30 = explicit3.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp19 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp19.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(resolution22);
        org.junit.Assert.assertNotNull(resolution24);
        org.junit.Assert.assertNotNull(resolution26);
        org.junit.Assert.assertNotNull(resolution28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray3);
        byte[] byteArray5 = explicit4.resolve();
        boolean boolean6 = explicit4.isResolved();
        boolean boolean8 = explicit4.equals((java.lang.Object) 10L);
        boolean boolean9 = explicit4.isResolved();
        java.lang.String str10 = explicit4.toString();
        byte[] byteArray11 = explicit4.resolve();
        java.lang.String str12 = explicit4.toString();
        byte[] byteArray13 = explicit4.resolve();
        boolean boolean14 = explicit4.isResolved();
        byte[] byteArray15 = explicit4.resolve();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray16 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound17 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray16);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound18 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray16);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit22 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray21);
        byte[] byteArray23 = explicit22.resolve();
        boolean boolean24 = explicit22.isResolved();
        boolean boolean25 = compound18.equals((java.lang.Object) boolean24);
        java.lang.String str26 = compound18.toString();
        java.lang.String str27 = compound18.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}", byteArray15, (net.bytebuddy.dynamic.ClassFileLocator) compound18);
        java.lang.String str29 = compound18.toString();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str10, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str12, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocatorArray16);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str26, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str27, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str29, "ClassFileLocator.Compound{classFileLocator=[]}");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution7 = noOp4.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution9 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution11 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(resolution7);
        org.junit.Assert.assertNotNull(resolution9);
        org.junit.Assert.assertNotNull(resolution11);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        boolean boolean31 = compound29.equals((java.lang.Object) "hi!");
        boolean boolean33 = compound29.equals((java.lang.Object) (-1.0d));
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution35 = compound29.locate("ClassFileLocator.NoOp.INSTANCE");
        java.lang.String str36 = compound29.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal38 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean39 = illegal38.isResolved();
        java.lang.String str40 = illegal38.toString();
        java.lang.String str41 = illegal38.toString();
        boolean boolean42 = compound29.equals((java.lang.Object) str41);
        java.lang.String str43 = compound29.toString();
        java.lang.String str44 = compound29.toString();
        java.lang.String str45 = compound29.toString();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(resolution35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str40, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str41, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray4);
        byte[] byteArray6 = explicit5.resolve();
        boolean boolean7 = explicit5.isResolved();
        boolean boolean9 = explicit5.equals((java.lang.Object) 10L);
        boolean boolean10 = explicit5.isResolved();
        java.lang.String str11 = explicit5.toString();
        byte[] byteArray12 = explicit5.resolve();
        byte[] byteArray13 = explicit5.resolve();
        byte[] byteArray17 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray17);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit22 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray21);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp23 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean24 = explicit22.equals((java.lang.Object) noOp23);
        java.lang.String str25 = noOp23.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator26 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Compound{classFileLocator=[]}", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) noOp23);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator27 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray13, (net.bytebuddy.dynamic.ClassFileLocator) noOp23);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}", byteArray13);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution30 = classFileLocator28.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp23 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp23.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str25, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocator26);
        org.junit.Assert.assertNotNull(classFileLocator27);
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertNotNull(resolution30);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        java.lang.String str2 = illegal1.toString();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        byte[] byteArray7 = explicit6.resolve();
        boolean boolean8 = explicit6.isResolved();
        boolean boolean10 = explicit6.equals((java.lang.Object) 10L);
        java.lang.String str11 = explicit6.toString();
        byte[] byteArray12 = explicit6.resolve();
        boolean boolean13 = illegal1.equals((java.lang.Object) byteArray12);
        java.lang.String str14 = illegal1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str2, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str14, "ClassFileLocator.Resolution.Illegal{typeName=''}");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray3);
        byte[] byteArray5 = explicit4.resolve();
        boolean boolean6 = explicit4.isResolved();
        boolean boolean8 = explicit4.equals((java.lang.Object) 10L);
        java.lang.String str9 = explicit4.toString();
        java.lang.String str10 = explicit4.toString();
        byte[] byteArray11 = explicit4.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit12 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray11);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray13 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound14 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray13);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit18 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp19 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean20 = explicit18.equals((java.lang.Object) noOp19);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution22 = noOp19.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution24 = noOp19.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str25 = noOp19.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution27 = noOp19.locate("");
        boolean boolean28 = compound14.equals((java.lang.Object) noOp19);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator29 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray11, (net.bytebuddy.dynamic.ClassFileLocator) noOp19);
        java.lang.String str30 = noOp19.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution32 = noOp19.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<6 bytes>}");
        java.lang.String str33 = noOp19.toString();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str10, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocatorArray13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp19 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp19.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(resolution22);
        org.junit.Assert.assertNotNull(resolution24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str25, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(classFileLocator29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str30, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str33, "ClassFileLocator.NoOp.INSTANCE");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit9 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray8);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp10 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean11 = explicit9.equals((java.lang.Object) noOp10);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution13 = noOp10.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution15 = noOp10.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        boolean boolean16 = explicit3.equals((java.lang.Object) noOp10);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution18 = noOp10.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp10 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp10.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(resolution13);
        org.junit.Assert.assertNotNull(resolution15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(resolution18);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        boolean boolean2 = illegal1.isResolved();
        boolean boolean3 = illegal1.isResolved();
        boolean boolean4 = illegal1.isResolved();
        boolean boolean5 = illegal1.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal7 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean8 = illegal7.isResolved();
        java.lang.String str9 = illegal7.toString();
        boolean boolean10 = illegal7.isResolved();
        boolean boolean11 = illegal7.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal13 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        byte[] byteArray16 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator17 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray16);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution19 = classFileLocator17.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        boolean boolean20 = illegal13.equals((java.lang.Object) resolution19);
        boolean boolean21 = illegal7.equals((java.lang.Object) boolean20);
        boolean boolean22 = illegal7.isResolved();
        boolean boolean23 = illegal7.isResolved();
        boolean boolean24 = illegal7.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray25 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound26 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray25);
        java.lang.String str27 = compound26.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution29 = compound26.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean30 = illegal7.equals((java.lang.Object) "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit34 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray33);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp35 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean36 = explicit34.equals((java.lang.Object) noOp35);
        java.lang.Class<?> wildcardClass37 = noOp35.getClass();
        boolean boolean38 = illegal7.equals((java.lang.Object) wildcardClass37);
        java.lang.String str39 = illegal7.toString();
        java.lang.String str40 = illegal7.toString();
        java.lang.String str41 = illegal7.toString();
        boolean boolean42 = illegal1.equals((java.lang.Object) str41);
        java.lang.String str43 = illegal1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str9, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator17);
        org.junit.Assert.assertNotNull(resolution19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(classFileLocatorArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str27, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(resolution29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp35 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp35.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str39, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str40, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str41, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str43, "ClassFileLocator.Resolution.Illegal{typeName=''}");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        java.lang.String str2 = illegal1.toString();
        java.lang.String str3 = illegal1.toString();
        java.lang.String str4 = illegal1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for .class");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str2, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str4, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution7 = noOp4.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution9 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution11 = noOp4.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution13 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        java.lang.String str14 = noOp4.toString();
        java.lang.String str15 = noOp4.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution17 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='hi!'}'}");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(resolution7);
        org.junit.Assert.assertNotNull(resolution9);
        org.junit.Assert.assertNotNull(resolution11);
        org.junit.Assert.assertNotNull(resolution13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str14, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str15, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution17);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray10);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator12 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray7, classFileLocator11);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit13 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        byte[] byteArray14 = explicit13.resolve();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit18 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp19 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean20 = explicit18.equals((java.lang.Object) noOp19);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution22 = noOp19.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution24 = noOp19.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution26 = noOp19.locate("hi!");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution28 = noOp19.locate(".class");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator29 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}", byteArray14, (net.bytebuddy.dynamic.ClassFileLocator) noOp19);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution31 = noOp19.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertNotNull(classFileLocator12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp19 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp19.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(resolution22);
        org.junit.Assert.assertNotNull(resolution24);
        org.junit.Assert.assertNotNull(resolution26);
        org.junit.Assert.assertNotNull(resolution28);
        org.junit.Assert.assertNotNull(classFileLocator29);
        org.junit.Assert.assertNotNull(resolution31);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        byte[] byteArray7 = explicit6.resolve();
        boolean boolean8 = explicit6.isResolved();
        boolean boolean10 = explicit6.equals((java.lang.Object) 10L);
        boolean boolean11 = explicit6.isResolved();
        java.lang.String str12 = explicit6.toString();
        byte[] byteArray13 = explicit6.resolve();
        java.lang.String str14 = explicit6.toString();
        byte[] byteArray15 = explicit6.resolve();
        boolean boolean16 = explicit6.isResolved();
        byte[] byteArray17 = explicit6.resolve();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray18 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound19 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray18);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound20 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray18);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit24 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray23);
        byte[] byteArray25 = explicit24.resolve();
        boolean boolean26 = explicit24.isResolved();
        boolean boolean27 = compound20.equals((java.lang.Object) boolean26);
        java.lang.String str28 = compound20.toString();
        java.lang.String str29 = compound20.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator30 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) compound20);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit31 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator32 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}", byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator33 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray17);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str12, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str14, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocatorArray18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str28, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str29, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(classFileLocator30);
        org.junit.Assert.assertNotNull(classFileLocator32);
        org.junit.Assert.assertNotNull(classFileLocator33);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        java.lang.String str6 = explicit3.toString();
        boolean boolean7 = explicit3.isResolved();
        byte[] byteArray8 = explicit3.resolve();
        java.lang.String str9 = explicit3.toString();
        boolean boolean10 = explicit3.isResolved();
        java.lang.String str11 = explicit3.toString();
        java.lang.Class<?> wildcardClass12 = explicit3.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str6, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp0 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str1 = noOp0.toString();
        java.lang.String str2 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution4 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.String str5 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution7 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        java.lang.String str8 = noOp0.toString();
        java.lang.String str9 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution11 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}'}");
        org.junit.Assert.assertTrue("'" + noOp0 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp0.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str1, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str2, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str5, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str8, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str9, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution11);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound30 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound31 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound32 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound33 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        java.lang.String str34 = compound33.toString();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray10);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator12 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray7, classFileLocator11);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp13 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray23 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray23);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray20, classFileLocator24);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp26 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str27 = noOp26.toString();
        java.lang.String str28 = noOp26.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray29 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator11, noOp13, classFileLocator25, noOp26 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound30 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray29);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution32 = compound30.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str33 = compound30.toString();
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit38 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray37);
        byte[] byteArray39 = explicit38.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator40 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray39);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit41 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray39);
        boolean boolean42 = compound30.equals((java.lang.Object) byteArray39);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit43 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray39);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit44 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray39);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit45 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray39);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit46 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray39);
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit50 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray49);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp51 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean52 = explicit50.equals((java.lang.Object) noOp51);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution54 = noOp51.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution56 = noOp51.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution58 = noOp51.locate("hi!");
        java.lang.String str59 = noOp51.toString();
        java.lang.String str60 = noOp51.toString();
        java.lang.String str61 = noOp51.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator62 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<6 bytes>}", byteArray39, (net.bytebuddy.dynamic.ClassFileLocator) noOp51);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit63 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray39);
        boolean boolean64 = explicit63.isResolved();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertNotNull(classFileLocator12);
        org.junit.Assert.assertTrue("'" + noOp13 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp13.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertTrue("'" + noOp26 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp26.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str28, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray29);
        org.junit.Assert.assertNotNull(resolution32);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp51 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp51.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(resolution54);
        org.junit.Assert.assertNotNull(resolution56);
        org.junit.Assert.assertNotNull(resolution58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str59, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str60, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str61, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocator62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution7 = noOp4.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution9 = noOp4.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution11 = noOp4.locate("hi!");
        java.lang.String str12 = noOp4.toString();
        java.lang.String str13 = noOp4.toString();
        java.lang.String str14 = noOp4.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution16 = noOp4.locate("");
        java.lang.Class<?> wildcardClass17 = resolution16.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(resolution7);
        org.junit.Assert.assertNotNull(resolution9);
        org.junit.Assert.assertNotNull(resolution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str12, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str13, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str14, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray4);
        byte[] byteArray6 = explicit5.resolve();
        boolean boolean7 = explicit5.isResolved();
        boolean boolean9 = explicit5.equals((java.lang.Object) 10L);
        boolean boolean10 = explicit5.isResolved();
        java.lang.String str11 = explicit5.toString();
        byte[] byteArray12 = explicit5.resolve();
        java.lang.String str13 = explicit5.toString();
        boolean boolean14 = explicit5.isResolved();
        boolean boolean15 = illegal1.equals((java.lang.Object) explicit5);
        boolean boolean16 = explicit5.isResolved();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit20 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray19);
        byte[] byteArray21 = explicit20.resolve();
        boolean boolean22 = explicit20.isResolved();
        boolean boolean24 = explicit20.equals((java.lang.Object) 10L);
        java.lang.String str25 = explicit20.toString();
        java.lang.String str26 = explicit20.toString();
        byte[] byteArray27 = explicit20.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit28 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray27);
        boolean boolean29 = explicit5.equals((java.lang.Object) byteArray27);
        boolean boolean30 = explicit5.isResolved();
        java.lang.String str31 = explicit5.toString();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str13, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str25, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str26, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str31, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator19 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray14, classFileLocator18);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp20 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray30 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator31 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray30);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator32 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray27, classFileLocator31);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp33 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str34 = noOp33.toString();
        java.lang.String str35 = noOp33.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray36 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator18, noOp20, classFileLocator32, noOp33 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound37 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray36);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution39 = compound37.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        boolean boolean40 = explicit3.equals((java.lang.Object) "ClassFileLocator.Compound{classFileLocator=[]}");
        byte[] byteArray41 = explicit3.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit42 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray41);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertNotNull(classFileLocator19);
        org.junit.Assert.assertTrue("'" + noOp20 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp20.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator31);
        org.junit.Assert.assertNotNull(classFileLocator32);
        org.junit.Assert.assertTrue("'" + noOp33 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp33.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str34, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str35, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray36);
        org.junit.Assert.assertNotNull(resolution39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 100]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        java.lang.String str5 = explicit3.toString();
        boolean boolean6 = explicit3.isResolved();
        java.lang.String str7 = explicit3.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str5, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str7, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray4);
        byte[] byteArray6 = explicit5.resolve();
        boolean boolean7 = explicit5.isResolved();
        boolean boolean9 = explicit5.equals((java.lang.Object) 10L);
        boolean boolean10 = explicit5.isResolved();
        java.lang.String str11 = explicit5.toString();
        byte[] byteArray12 = explicit5.resolve();
        java.lang.String str13 = explicit5.toString();
        boolean boolean14 = explicit5.isResolved();
        boolean boolean15 = illegal1.equals((java.lang.Object) explicit5);
        boolean boolean16 = explicit5.isResolved();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit20 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray19);
        byte[] byteArray21 = explicit20.resolve();
        boolean boolean22 = explicit20.isResolved();
        boolean boolean24 = explicit20.equals((java.lang.Object) 10L);
        java.lang.String str25 = explicit20.toString();
        java.lang.String str26 = explicit20.toString();
        byte[] byteArray27 = explicit20.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit28 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray27);
        boolean boolean29 = explicit5.equals((java.lang.Object) byteArray27);
        boolean boolean30 = explicit5.isResolved();
        boolean boolean31 = explicit5.isResolved();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str13, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str25, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str26, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean2 = illegal1.isResolved();
        java.lang.String str3 = illegal1.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        byte[] byteArray8 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator9 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray8);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution11 = classFileLocator9.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        boolean boolean12 = illegal5.equals((java.lang.Object) resolution11);
        boolean boolean13 = illegal1.equals((java.lang.Object) resolution11);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator9);
        org.junit.Assert.assertNotNull(resolution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution7 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        java.lang.String str8 = noOp4.toString();
        java.lang.String str9 = noOp4.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution11 = noOp4.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        java.lang.String str12 = noOp4.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution14 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.String str15 = noOp4.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(resolution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str8, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str9, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str12, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str15, "ClassFileLocator.NoOp.INSTANCE");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp0 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str1 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution3 = noOp0.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution5 = noOp0.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        java.lang.String str6 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution8 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}");
        org.junit.Assert.assertTrue("'" + noOp0 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp0.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str1, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution3);
        org.junit.Assert.assertNotNull(resolution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str6, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution8);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Illegal{typeName=''}");
        boolean boolean4 = illegal3.isResolved();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray19 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator20 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray19);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator21 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray16, classFileLocator20);
        byte[] byteArray24 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray24);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator26 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray16, classFileLocator25);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator27 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray16);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit31 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray30);
        byte[] byteArray32 = explicit31.resolve();
        boolean boolean33 = explicit31.isResolved();
        boolean boolean35 = explicit31.equals((java.lang.Object) 10L);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator36 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofClassPath();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution38 = classFileLocator36.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        boolean boolean39 = explicit31.equals((java.lang.Object) classFileLocator36);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator40 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray16, classFileLocator36);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator41 = null;
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator42 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray16, classFileLocator41);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit47 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray46);
        byte[] byteArray48 = explicit47.resolve();
        boolean boolean49 = explicit47.isResolved();
        boolean boolean51 = explicit47.equals((java.lang.Object) 10L);
        boolean boolean52 = explicit47.isResolved();
        java.lang.String str53 = explicit47.toString();
        byte[] byteArray54 = explicit47.resolve();
        byte[] byteArray55 = explicit47.resolve();
        byte[] byteArray59 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator60 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray59);
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit64 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray63);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp65 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean66 = explicit64.equals((java.lang.Object) noOp65);
        java.lang.String str67 = noOp65.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator68 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Compound{classFileLocator=[]}", byteArray59, (net.bytebuddy.dynamic.ClassFileLocator) noOp65);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator69 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray55, (net.bytebuddy.dynamic.ClassFileLocator) noOp65);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator70 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray16, (net.bytebuddy.dynamic.ClassFileLocator) noOp65);
        boolean boolean71 = illegal3.equals((java.lang.Object) noOp65);
        java.lang.String str72 = noOp65.toString();
        boolean boolean73 = illegal1.equals((java.lang.Object) noOp65);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution75 = noOp65.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution77 = noOp65.locate("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator20);
        org.junit.Assert.assertNotNull(classFileLocator21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertNotNull(classFileLocator26);
        org.junit.Assert.assertNotNull(classFileLocator27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(classFileLocator36);
        org.junit.Assert.assertNotNull(resolution38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(classFileLocator40);
        org.junit.Assert.assertNotNull(classFileLocator42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str53, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator60);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp65 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp65.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str67, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocator68);
        org.junit.Assert.assertNotNull(classFileLocator69);
        org.junit.Assert.assertNotNull(classFileLocator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str72, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(resolution75);
        org.junit.Assert.assertNotNull(resolution77);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray3);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp5 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean6 = explicit4.equals((java.lang.Object) noOp5);
        boolean boolean7 = explicit4.isResolved();
        byte[] byteArray8 = explicit4.resolve();
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit13 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray12);
        byte[] byteArray14 = explicit13.resolve();
        boolean boolean15 = explicit13.isResolved();
        boolean boolean17 = explicit13.equals((java.lang.Object) 10L);
        boolean boolean18 = explicit13.isResolved();
        java.lang.String str19 = explicit13.toString();
        byte[] byteArray20 = explicit13.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp21 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str22 = noOp21.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution24 = noOp21.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='hi!'}", byteArray20, (net.bytebuddy.dynamic.ClassFileLocator) noOp21);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution27 = noOp21.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}'}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<6 bytes>}", byteArray8, (net.bytebuddy.dynamic.ClassFileLocator) noOp21);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp5 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp5.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str19, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp21 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp21.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str22, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution24);
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertNotNull(resolution27);
        org.junit.Assert.assertNotNull(classFileLocator28);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        java.lang.String str9 = explicit3.toString();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray21 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator22 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray21);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray18, classFileLocator22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray18);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of(".class", byteArray18);
        boolean boolean26 = explicit3.equals((java.lang.Object) ".class");
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit30 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray29);
        byte[] byteArray31 = explicit30.resolve();
        boolean boolean32 = explicit30.isResolved();
        boolean boolean34 = explicit30.equals((java.lang.Object) 10L);
        boolean boolean35 = explicit30.isResolved();
        java.lang.String str36 = explicit30.toString();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray48 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator49 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray48);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator50 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray45, classFileLocator49);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator51 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray45);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator52 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of(".class", byteArray45);
        boolean boolean53 = explicit30.equals((java.lang.Object) ".class");
        boolean boolean54 = explicit3.equals((java.lang.Object) boolean53);
        byte[] byteArray55 = explicit3.resolve();
        byte[] byteArray56 = explicit3.resolve();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator22);
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str36, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator49);
        org.junit.Assert.assertNotNull(classFileLocator50);
        org.junit.Assert.assertNotNull(classFileLocator51);
        org.junit.Assert.assertNotNull(classFileLocator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, 100]");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator12 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray11);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator13 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray8, classFileLocator12);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp14 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray24 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray24);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator26 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray21, classFileLocator25);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp27 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str28 = noOp27.toString();
        java.lang.String str29 = noOp27.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray30 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator12, noOp14, classFileLocator26, noOp27 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound31 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray30);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution33 = compound31.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution35 = compound31.locate("");
        boolean boolean36 = illegal1.equals((java.lang.Object) resolution35);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit40 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray39);
        byte[] byteArray41 = explicit40.resolve();
        java.lang.String str42 = explicit40.toString();
        boolean boolean43 = explicit40.isResolved();
        java.lang.Class<?> wildcardClass44 = explicit40.getClass();
        boolean boolean45 = illegal1.equals((java.lang.Object) wildcardClass44);
        boolean boolean46 = illegal1.isResolved();
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit50 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray49);
        byte[] byteArray51 = explicit50.resolve();
        boolean boolean52 = explicit50.isResolved();
        boolean boolean54 = explicit50.equals((java.lang.Object) 10L);
        boolean boolean56 = explicit50.equals((java.lang.Object) (byte) 100);
        boolean boolean57 = explicit50.isResolved();
        boolean boolean58 = illegal1.equals((java.lang.Object) explicit50);
        java.lang.String str59 = explicit50.toString();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator12);
        org.junit.Assert.assertNotNull(classFileLocator13);
        org.junit.Assert.assertTrue("'" + noOp14 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp14.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertNotNull(classFileLocator26);
        org.junit.Assert.assertTrue("'" + noOp27 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp27.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str28, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str29, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray30);
        org.junit.Assert.assertNotNull(resolution33);
        org.junit.Assert.assertNotNull(resolution35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str42, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str59, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        java.lang.String str6 = noOp4.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution8 = noOp4.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution10 = noOp4.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution12 = noOp4.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution14 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='hi!'}'}");
        java.lang.String str15 = noOp4.toString();
        java.lang.String str16 = noOp4.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution18 = noOp4.locate("hi!");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution20 = noOp4.locate("hi!");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str6, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution8);
        org.junit.Assert.assertNotNull(resolution10);
        org.junit.Assert.assertNotNull(resolution12);
        org.junit.Assert.assertNotNull(resolution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str15, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str16, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution18);
        org.junit.Assert.assertNotNull(resolution20);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal2 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Compound{classFileLocator=[]}");
        boolean boolean3 = illegal2.isResolved();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator7 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator19 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray14, classFileLocator18);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp20 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray30 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator31 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray30);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator32 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray27, classFileLocator31);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp33 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str34 = noOp33.toString();
        java.lang.String str35 = noOp33.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray36 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator18, noOp20, classFileLocator32, noOp33 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound37 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray36);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution39 = compound37.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray40 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator7, compound37 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound41 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray40);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound42 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray40);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound43 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray40);
        boolean boolean44 = illegal2.equals((java.lang.Object) compound43);
        boolean boolean45 = illegal2.isResolved();
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit49 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray48);
        byte[] byteArray50 = explicit49.resolve();
        boolean boolean51 = explicit49.isResolved();
        boolean boolean53 = explicit49.equals((java.lang.Object) 10L);
        boolean boolean55 = explicit49.equals((java.lang.Object) (byte) 100);
        boolean boolean56 = explicit49.isResolved();
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit60 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray59);
        byte[] byteArray61 = explicit60.resolve();
        java.lang.String str62 = explicit60.toString();
        boolean boolean63 = explicit60.isResolved();
        java.lang.String str64 = explicit60.toString();
        java.lang.String str65 = explicit60.toString();
        java.lang.String str66 = explicit60.toString();
        byte[] byteArray67 = explicit60.resolve();
        byte[] byteArray68 = explicit60.resolve();
        boolean boolean69 = explicit49.equals((java.lang.Object) byteArray68);
        byte[] byteArray70 = explicit49.resolve();
        boolean boolean71 = illegal2.equals((java.lang.Object) byteArray70);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator72 = null;
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator73 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of(".class", byteArray70, classFileLocator72);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertNotNull(classFileLocator19);
        org.junit.Assert.assertTrue("'" + noOp20 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp20.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator31);
        org.junit.Assert.assertNotNull(classFileLocator32);
        org.junit.Assert.assertTrue("'" + noOp33 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp33.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str34, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str35, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray36);
        org.junit.Assert.assertNotNull(resolution39);
        org.junit.Assert.assertNotNull(classFileLocatorArray40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str62, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str64, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str65, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str66, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(classFileLocator73);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit13 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray12);
        byte[] byteArray14 = explicit13.resolve();
        boolean boolean15 = explicit13.isResolved();
        boolean boolean17 = explicit13.equals((java.lang.Object) 10L);
        boolean boolean18 = explicit13.isResolved();
        java.lang.String str19 = explicit13.toString();
        byte[] byteArray20 = explicit13.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp21 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str22 = noOp21.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution24 = noOp21.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='hi!'}", byteArray20, (net.bytebuddy.dynamic.ClassFileLocator) noOp21);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator26 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray20);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator27 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}", byteArray7, classFileLocator26);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray7);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator29 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray7);
        java.lang.Class<?> wildcardClass30 = classFileLocator29.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str19, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp21 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp21.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str22, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution24);
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertNotNull(classFileLocator26);
        org.junit.Assert.assertNotNull(classFileLocator27);
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertNotNull(classFileLocator29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean6 = explicit3.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal8 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        boolean boolean9 = illegal8.isResolved();
        java.lang.String str10 = illegal8.toString();
        boolean boolean11 = illegal8.isResolved();
        boolean boolean12 = explicit3.equals((java.lang.Object) illegal8);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray13 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound14 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray13);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound15 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray13);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution17 = compound15.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution19 = compound15.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        boolean boolean20 = illegal8.equals((java.lang.Object) resolution19);
        boolean boolean21 = illegal8.isResolved();
        boolean boolean22 = illegal8.isResolved();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = illegal8.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str10, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classFileLocatorArray13);
        org.junit.Assert.assertNotNull(resolution17);
        org.junit.Assert.assertNotNull(resolution19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution31 = compound29.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution33 = compound29.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        boolean boolean34 = resolution33.isResolved();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
        org.junit.Assert.assertNotNull(resolution31);
        org.junit.Assert.assertNotNull(resolution33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean2 = illegal1.isResolved();
        java.lang.String str3 = illegal1.toString();
        boolean boolean4 = illegal1.isResolved();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for .class");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit8 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        byte[] byteArray9 = explicit8.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray11 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound12 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray11);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit16 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray15);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp17 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean18 = explicit16.equals((java.lang.Object) noOp17);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution20 = noOp17.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution22 = noOp17.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str23 = noOp17.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution25 = noOp17.locate("");
        boolean boolean26 = compound12.equals((java.lang.Object) noOp17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator27 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray9, (net.bytebuddy.dynamic.ClassFileLocator) noOp17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray9);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray38 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator39 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray38);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator40 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray35, classFileLocator39);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp41 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray51 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator52 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray51);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator53 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray48, classFileLocator52);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp54 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str55 = noOp54.toString();
        java.lang.String str56 = noOp54.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray57 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator39, noOp41, classFileLocator53, noOp54 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound58 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray57);
        boolean boolean60 = compound58.equals((java.lang.Object) "hi!");
        boolean boolean62 = compound58.equals((java.lang.Object) (-1.0d));
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution64 = compound58.locate("ClassFileLocator.NoOp.INSTANCE");
        java.lang.String str65 = compound58.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal67 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean68 = illegal67.isResolved();
        java.lang.String str69 = illegal67.toString();
        java.lang.String str70 = illegal67.toString();
        boolean boolean71 = compound58.equals((java.lang.Object) str70);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator72 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of(".class", byteArray9, (net.bytebuddy.dynamic.ClassFileLocator) compound58);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit73 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray9);
        byte[] byteArray74 = explicit73.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator75 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<1 bytes>}", byteArray74);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocatorArray11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp17 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp17.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(resolution20);
        org.junit.Assert.assertNotNull(resolution22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str23, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classFileLocator27);
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator39);
        org.junit.Assert.assertNotNull(classFileLocator40);
        org.junit.Assert.assertTrue("'" + noOp41 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp41.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator52);
        org.junit.Assert.assertNotNull(classFileLocator53);
        org.junit.Assert.assertTrue("'" + noOp54 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp54.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str55, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str56, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(resolution64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str69, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str70, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(classFileLocator72);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator75);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution31 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str32 = compound29.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution34 = compound29.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution36 = compound29.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
        org.junit.Assert.assertNotNull(resolution31);
        org.junit.Assert.assertNotNull(resolution34);
        org.junit.Assert.assertNotNull(resolution36);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal(".class");
        boolean boolean2 = illegal1.isResolved();
        java.lang.String str3 = illegal1.toString();
        java.lang.String str4 = illegal1.toString();
        boolean boolean5 = illegal1.isResolved();
        boolean boolean6 = illegal1.isResolved();
        boolean boolean7 = illegal1.isResolved();
        java.lang.String str8 = illegal1.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal10 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray20 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator21 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray20);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator22 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray17, classFileLocator21);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp23 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray33 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator34 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray33);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator35 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray30, classFileLocator34);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp36 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str37 = noOp36.toString();
        java.lang.String str38 = noOp36.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray39 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator21, noOp23, classFileLocator35, noOp36 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound40 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray39);
        boolean boolean42 = compound40.equals((java.lang.Object) "hi!");
        java.lang.String str43 = compound40.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution45 = compound40.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        boolean boolean46 = illegal10.equals((java.lang.Object) "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        boolean boolean47 = illegal10.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal49 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("");
        java.lang.String str50 = illegal49.toString();
        java.lang.String str51 = illegal49.toString();
        boolean boolean52 = illegal49.isResolved();
        boolean boolean53 = illegal10.equals((java.lang.Object) illegal49);
        boolean boolean54 = illegal1.equals((java.lang.Object) illegal10);
        java.lang.String str55 = illegal1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray56 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for .class");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str4, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str8, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator21);
        org.junit.Assert.assertNotNull(classFileLocator22);
        org.junit.Assert.assertTrue("'" + noOp23 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp23.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator34);
        org.junit.Assert.assertNotNull(classFileLocator35);
        org.junit.Assert.assertTrue("'" + noOp36 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp36.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str37, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str38, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(resolution45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str50, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName=''}" + "'", str51, "ClassFileLocator.Resolution.Illegal{typeName=''}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='.class'}" + "'", str55, "ClassFileLocator.Resolution.Illegal{typeName='.class'}");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp0 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str1 = noOp0.toString();
        java.lang.String str2 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution4 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.String str5 = noOp0.toString();
        java.lang.String str6 = noOp0.toString();
        java.lang.String str7 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution9 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        java.lang.String str10 = noOp0.toString();
        java.lang.String str11 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution13 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + noOp0 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp0.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str1, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str2, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str5, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str6, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str7, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str10, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str11, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution13);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution31 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution33 = compound29.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution35 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.Object obj36 = null;
        boolean boolean37 = compound29.equals(obj36);
        java.lang.String str38 = compound29.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal40 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        java.lang.String str41 = illegal40.toString();
        boolean boolean42 = compound29.equals((java.lang.Object) str41);
        java.lang.String str43 = compound29.toString();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
        org.junit.Assert.assertNotNull(resolution31);
        org.junit.Assert.assertNotNull(resolution33);
        org.junit.Assert.assertNotNull(resolution35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}" + "'", str41, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray4);
        byte[] byteArray6 = explicit5.resolve();
        boolean boolean7 = explicit5.isResolved();
        boolean boolean9 = explicit5.equals((java.lang.Object) 10L);
        boolean boolean10 = explicit5.isResolved();
        java.lang.String str11 = explicit5.toString();
        byte[] byteArray12 = explicit5.resolve();
        java.lang.String str13 = explicit5.toString();
        boolean boolean14 = explicit5.isResolved();
        byte[] byteArray15 = explicit5.resolve();
        boolean boolean16 = explicit5.isResolved();
        byte[] byteArray17 = explicit5.resolve();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray18 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound19 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray18);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound20 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray18);
        java.lang.String str21 = compound20.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution23 = compound20.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.NoOp.INSTANCE", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) compound20);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit28 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray27);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp29 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean30 = explicit28.equals((java.lang.Object) noOp29);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution32 = noOp29.locate("");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution34 = noOp29.locate(".class");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator35 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<6 bytes>}'}", byteArray17, (net.bytebuddy.dynamic.ClassFileLocator) noOp29);
        java.lang.String str36 = noOp29.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution38 = noOp29.locate(".class");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str13, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocatorArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClassFileLocator.Compound{classFileLocator=[]}" + "'", str21, "ClassFileLocator.Compound{classFileLocator=[]}");
        org.junit.Assert.assertNotNull(resolution23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp29 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp29.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(resolution32);
        org.junit.Assert.assertNotNull(resolution34);
        org.junit.Assert.assertNotNull(classFileLocator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str36, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution38);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp0 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str1 = noOp0.toString();
        java.lang.String str2 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution4 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.String str5 = noOp0.toString();
        java.lang.String str6 = noOp0.toString();
        java.lang.String str7 = noOp0.toString();
        java.lang.String str8 = noOp0.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution10 = noOp0.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution12 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='hi!'}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution14 = noOp0.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}'}");
        org.junit.Assert.assertTrue("'" + noOp0 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp0.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str1, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str2, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str5, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str6, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str7, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str8, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution10);
        org.junit.Assert.assertNotNull(resolution12);
        org.junit.Assert.assertNotNull(resolution14);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        java.lang.String str9 = explicit3.toString();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray21 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator22 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray21);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray18, classFileLocator22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray18);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator25 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of(".class", byteArray18);
        boolean boolean26 = explicit3.equals((java.lang.Object) ".class");
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit30 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray29);
        byte[] byteArray31 = explicit30.resolve();
        boolean boolean32 = explicit30.isResolved();
        boolean boolean34 = explicit30.equals((java.lang.Object) 10L);
        boolean boolean35 = explicit30.isResolved();
        java.lang.String str36 = explicit30.toString();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray48 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator49 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray48);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator50 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray45, classFileLocator49);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator51 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray45);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator52 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of(".class", byteArray45);
        boolean boolean53 = explicit30.equals((java.lang.Object) ".class");
        boolean boolean54 = explicit3.equals((java.lang.Object) boolean53);
        byte[] byteArray55 = explicit3.resolve();
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray68 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator69 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray68);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator70 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray65, classFileLocator69);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator71 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray65);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator72 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of(".class", byteArray65);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator73 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}", byteArray65);
        byte[] byteArray77 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator78 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray77);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit79 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray77);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit80 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray77);
        byte[] byteArray83 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit84 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray83);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp85 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean86 = explicit84.equals((java.lang.Object) noOp85);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution88 = noOp85.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution90 = noOp85.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution92 = noOp85.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator93 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='.class'}", byteArray77, (net.bytebuddy.dynamic.ClassFileLocator) noOp85);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray94 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator73, classFileLocator93 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound95 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray94);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound96 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray94);
        boolean boolean97 = explicit3.equals((java.lang.Object) classFileLocatorArray94);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator22);
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertNotNull(classFileLocator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str36, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator49);
        org.junit.Assert.assertNotNull(classFileLocator50);
        org.junit.Assert.assertNotNull(classFileLocator51);
        org.junit.Assert.assertNotNull(classFileLocator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator69);
        org.junit.Assert.assertNotNull(classFileLocator70);
        org.junit.Assert.assertNotNull(classFileLocator71);
        org.junit.Assert.assertNotNull(classFileLocator72);
        org.junit.Assert.assertNotNull(classFileLocator73);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator78);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp85 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp85.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(resolution88);
        org.junit.Assert.assertNotNull(resolution90);
        org.junit.Assert.assertNotNull(resolution92);
        org.junit.Assert.assertNotNull(classFileLocator93);
        org.junit.Assert.assertNotNull(classFileLocatorArray94);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        byte[] byteArray7 = explicit6.resolve();
        boolean boolean8 = explicit6.isResolved();
        boolean boolean10 = explicit6.equals((java.lang.Object) 10L);
        boolean boolean11 = explicit6.isResolved();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray12 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound13 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound14 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray12);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution16 = compound14.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        boolean boolean17 = explicit6.equals((java.lang.Object) compound14);
        boolean boolean18 = explicit6.isResolved();
        byte[] byteArray19 = explicit6.resolve();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator20 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}'}", byteArray19);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal23 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit27 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray26);
        byte[] byteArray28 = explicit27.resolve();
        boolean boolean29 = explicit27.isResolved();
        boolean boolean31 = explicit27.equals((java.lang.Object) 10L);
        boolean boolean32 = explicit27.isResolved();
        java.lang.String str33 = explicit27.toString();
        byte[] byteArray34 = explicit27.resolve();
        java.lang.String str35 = explicit27.toString();
        boolean boolean36 = explicit27.isResolved();
        boolean boolean37 = illegal23.equals((java.lang.Object) explicit27);
        boolean boolean38 = explicit27.isResolved();
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit42 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray41);
        byte[] byteArray43 = explicit42.resolve();
        boolean boolean44 = explicit42.isResolved();
        boolean boolean46 = explicit42.equals((java.lang.Object) 10L);
        java.lang.String str47 = explicit42.toString();
        java.lang.String str48 = explicit42.toString();
        byte[] byteArray49 = explicit42.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit50 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray49);
        boolean boolean51 = explicit27.equals((java.lang.Object) byteArray49);
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray52 = new net.bytebuddy.dynamic.ClassFileLocator[] {};
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound53 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray52);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution55 = compound53.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator56 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray49, (net.bytebuddy.dynamic.ClassFileLocator) compound53);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray66 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator67 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray66);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator68 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray63, classFileLocator67);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp69 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray76 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray79 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator80 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray79);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator81 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray76, classFileLocator80);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp82 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str83 = noOp82.toString();
        java.lang.String str84 = noOp82.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray85 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator67, noOp69, classFileLocator81, noOp82 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound86 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray85);
        boolean boolean88 = compound86.equals((java.lang.Object) "hi!");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution90 = compound86.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution92 = compound86.locate("ClassFileLocator.Compound{classFileLocator=[]}");
        boolean boolean93 = compound53.equals((java.lang.Object) "ClassFileLocator.Compound{classFileLocator=[]}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator94 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Compound{classFileLocator=[]}", byteArray19, (net.bytebuddy.dynamic.ClassFileLocator) compound53);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator95 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.NoOp.INSTANCE", byteArray19);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(classFileLocatorArray12);
        org.junit.Assert.assertNotNull(resolution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator20);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str33, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str35, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str47, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str48, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(classFileLocatorArray52);
        org.junit.Assert.assertNotNull(resolution55);
        org.junit.Assert.assertNotNull(classFileLocator56);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator67);
        org.junit.Assert.assertNotNull(classFileLocator68);
        org.junit.Assert.assertTrue("'" + noOp69 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp69.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator80);
        org.junit.Assert.assertNotNull(classFileLocator81);
        org.junit.Assert.assertTrue("'" + noOp82 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp82.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str83, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str84, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(resolution90);
        org.junit.Assert.assertNotNull(resolution92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(classFileLocator94);
        org.junit.Assert.assertNotNull(classFileLocator95);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator10 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray9);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray6, classFileLocator10);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp12 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator24 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray19, classFileLocator23);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp25 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str26 = noOp25.toString();
        java.lang.String str27 = noOp25.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray28 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator10, noOp12, classFileLocator24, noOp25 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound29 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray28);
        boolean boolean31 = compound29.equals((java.lang.Object) "hi!");
        boolean boolean33 = compound29.equals((java.lang.Object) (-1.0d));
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution35 = compound29.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution37 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        byte[] byteArray41 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator42 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray41);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit46 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray45);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp47 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean48 = explicit46.equals((java.lang.Object) noOp47);
        java.lang.String str49 = noOp47.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator50 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Compound{classFileLocator=[]}", byteArray41, (net.bytebuddy.dynamic.ClassFileLocator) noOp47);
        boolean boolean51 = compound29.equals((java.lang.Object) byteArray41);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution53 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution55 = compound29.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        java.lang.String str56 = compound29.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution58 = compound29.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator10);
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertTrue("'" + noOp12 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp12.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertNotNull(classFileLocator24);
        org.junit.Assert.assertTrue("'" + noOp25 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp25.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str26, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str27, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(resolution35);
        org.junit.Assert.assertNotNull(resolution37);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp47 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp47.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str49, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(resolution53);
        org.junit.Assert.assertNotNull(resolution55);
        org.junit.Assert.assertNotNull(resolution58);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("hi!");
        boolean boolean2 = illegal1.isResolved();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit6 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray5);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp7 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean8 = explicit6.equals((java.lang.Object) noOp7);
        boolean boolean9 = illegal1.equals((java.lang.Object) explicit6);
        java.lang.String str10 = illegal1.toString();
        java.lang.String str11 = illegal1.toString();
        boolean boolean12 = illegal1.isResolved();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp7 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp7.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str10, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='hi!'}" + "'", str11, "ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal2 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator3 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ofClassPath();
        boolean boolean4 = illegal2.equals((java.lang.Object) classFileLocator3);
        java.lang.String str5 = illegal2.toString();
        boolean boolean6 = illegal2.isResolved();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator18 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray17);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator19 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray14, classFileLocator18);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp20 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray30 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator31 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray30);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator32 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray27, classFileLocator31);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp33 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str34 = noOp33.toString();
        java.lang.String str35 = noOp33.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray36 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator18, noOp20, classFileLocator32, noOp33 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound37 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray36);
        boolean boolean39 = compound37.equals((java.lang.Object) "hi!");
        boolean boolean41 = compound37.equals((java.lang.Object) (-1.0d));
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution43 = compound37.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution45 = compound37.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        byte[] byteArray49 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator50 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray49);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit54 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray53);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp55 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean56 = explicit54.equals((java.lang.Object) noOp55);
        java.lang.String str57 = noOp55.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator58 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Compound{classFileLocator=[]}", byteArray49, (net.bytebuddy.dynamic.ClassFileLocator) noOp55);
        boolean boolean59 = compound37.equals((java.lang.Object) byteArray49);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator60 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray49);
        boolean boolean61 = illegal2.equals((java.lang.Object) byteArray49);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit62 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray49);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp63 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str64 = noOp63.toString();
        java.lang.String str65 = noOp63.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution67 = noOp63.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.String str68 = noOp63.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution70 = noOp63.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution72 = noOp63.locate("ClassFileLocator.Resolution.Illegal{typeName=''}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution74 = noOp63.locate("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Compound{classFileLocator=[]}'}");
        java.lang.String str75 = noOp63.toString();
        java.lang.String str76 = noOp63.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution78 = noOp63.locate("ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution80 = noOp63.locate(".class");
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator81 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}'}", byteArray49, (net.bytebuddy.dynamic.ClassFileLocator) noOp63);
        org.junit.Assert.assertNotNull(classFileLocator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='hi!'}'}" + "'", str5, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator18);
        org.junit.Assert.assertNotNull(classFileLocator19);
        org.junit.Assert.assertTrue("'" + noOp20 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp20.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator31);
        org.junit.Assert.assertNotNull(classFileLocator32);
        org.junit.Assert.assertTrue("'" + noOp33 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp33.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str34, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str35, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(resolution43);
        org.junit.Assert.assertNotNull(resolution45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp55 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp55.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str57, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(classFileLocator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + noOp63 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp63.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str64, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str65, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str68, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution70);
        org.junit.Assert.assertNotNull(resolution72);
        org.junit.Assert.assertNotNull(resolution74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str75, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str76, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution78);
        org.junit.Assert.assertNotNull(resolution80);
        org.junit.Assert.assertNotNull(classFileLocator81);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray4);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator6 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName=''}", byteArray4);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit7 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray4);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray19 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator20 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray19);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator21 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray16, classFileLocator20);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator22 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray16);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator23 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}'}", byteArray16);
        boolean boolean24 = explicit7.equals((java.lang.Object) byteArray16);
        byte[] byteArray27 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator28 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray27);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray38 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator39 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray38);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator40 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray35, classFileLocator39);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp41 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray51 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator52 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray51);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator53 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray48, classFileLocator52);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp54 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str55 = noOp54.toString();
        java.lang.String str56 = noOp54.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray57 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator39, noOp41, classFileLocator53, noOp54 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound58 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray57);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution60 = compound58.locate("ClassFileLocator.Resolution.Illegal{typeName='.class'}");
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray61 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator28, compound58 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound62 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray61);
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound63 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray61);
        java.lang.String str64 = compound63.toString();
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator65 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}", byteArray16, (net.bytebuddy.dynamic.ClassFileLocator) compound63);
        java.lang.String str66 = compound63.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution68 = compound63.locate("ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertNotNull(classFileLocator6);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator20);
        org.junit.Assert.assertNotNull(classFileLocator21);
        org.junit.Assert.assertNotNull(classFileLocator22);
        org.junit.Assert.assertNotNull(classFileLocator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator28);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator39);
        org.junit.Assert.assertNotNull(classFileLocator40);
        org.junit.Assert.assertTrue("'" + noOp41 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp41.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator52);
        org.junit.Assert.assertNotNull(classFileLocator53);
        org.junit.Assert.assertTrue("'" + noOp54 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp54.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str55, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str56, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray57);
        org.junit.Assert.assertNotNull(resolution60);
        org.junit.Assert.assertNotNull(classFileLocatorArray61);
        org.junit.Assert.assertNotNull(classFileLocator65);
        org.junit.Assert.assertNotNull(resolution68);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        boolean boolean5 = explicit3.equals((java.lang.Object) noOp4);
        java.lang.String str6 = noOp4.toString();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution8 = noOp4.locate("ClassFileLocator.NoOp.INSTANCE");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution10 = noOp4.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        java.lang.String str11 = noOp4.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + noOp4 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp4.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str6, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(resolution8);
        org.junit.Assert.assertNotNull(resolution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str11, "ClassFileLocator.NoOp.INSTANCE");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean9 = explicit3.equals((java.lang.Object) (byte) 100);
        boolean boolean10 = explicit3.isResolved();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit14 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray13);
        byte[] byteArray15 = explicit14.resolve();
        java.lang.String str16 = explicit14.toString();
        boolean boolean17 = explicit14.isResolved();
        java.lang.String str18 = explicit14.toString();
        java.lang.String str19 = explicit14.toString();
        java.lang.String str20 = explicit14.toString();
        byte[] byteArray21 = explicit14.resolve();
        byte[] byteArray22 = explicit14.resolve();
        boolean boolean23 = explicit3.equals((java.lang.Object) byteArray22);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit24 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray22);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str16, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str18, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str19, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str20, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.ClassLoader classLoader0 = null;
        java.security.AccessControlContext accessControlContext1 = null;
        net.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate classLoadingDelegate2 = net.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate.Default.of(classLoader0, accessControlContext1);
        java.lang.ClassLoader classLoader3 = classLoadingDelegate2.getClassLoader();
        java.lang.ClassLoader classLoader4 = classLoadingDelegate2.getClassLoader();
        net.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate classLoadingDelegate5 = net.bytebuddy.dynamic.ClassFileLocator.AgentBased.ClassLoadingDelegate.Default.of(classLoader4);
        org.junit.Assert.assertNotNull(classLoadingDelegate2);
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(classLoadingDelegate5);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal illegal1 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal("ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        java.lang.String str2 = illegal1.toString();
        java.lang.String str3 = illegal1.toString();
        boolean boolean4 = illegal1.isResolved();
        java.lang.String str5 = illegal1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = illegal1.resolve();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Could not locate class file for ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}" + "'", str2, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}" + "'", str3, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}" + "'", str5, "ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName='ClassFileLocator.Resolution.Illegal{typeName=''}'}'}");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator3 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit4 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit5 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray15 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator16 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray15);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator17 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray12, classFileLocator16);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp18 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray28 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator29 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray28);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator30 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray25, classFileLocator29);
        net.bytebuddy.dynamic.ClassFileLocator.NoOp noOp31 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE;
        java.lang.String str32 = noOp31.toString();
        java.lang.String str33 = noOp31.toString();
        net.bytebuddy.dynamic.ClassFileLocator[] classFileLocatorArray34 = new net.bytebuddy.dynamic.ClassFileLocator[] { classFileLocator16, noOp18, classFileLocator30, noOp31 };
        net.bytebuddy.dynamic.ClassFileLocator.Compound compound35 = new net.bytebuddy.dynamic.ClassFileLocator.Compound(classFileLocatorArray34);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution37 = compound35.locate("ClassFileLocator.Resolution.Illegal{typeName='hi!'}");
        net.bytebuddy.dynamic.ClassFileLocator.Resolution resolution39 = compound35.locate("");
        boolean boolean40 = explicit5.equals((java.lang.Object) compound35);
        byte[] byteArray41 = explicit5.resolve();
        byte[] byteArray42 = explicit5.resolve();
        boolean boolean43 = explicit5.isResolved();
        byte[] byteArray44 = explicit5.resolve();
        boolean boolean45 = explicit5.isResolved();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator3);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator16);
        org.junit.Assert.assertNotNull(classFileLocator17);
        org.junit.Assert.assertTrue("'" + noOp18 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp18.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator29);
        org.junit.Assert.assertNotNull(classFileLocator30);
        org.junit.Assert.assertTrue("'" + noOp31 + "' != '" + net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE + "'", noOp31.equals(net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str32, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ClassFileLocator.NoOp.INSTANCE" + "'", str33, "ClassFileLocator.NoOp.INSTANCE");
        org.junit.Assert.assertNotNull(classFileLocatorArray34);
        org.junit.Assert.assertNotNull(resolution37);
        org.junit.Assert.assertNotNull(resolution39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit3 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray2);
        byte[] byteArray4 = explicit3.resolve();
        boolean boolean5 = explicit3.isResolved();
        boolean boolean7 = explicit3.equals((java.lang.Object) 10L);
        boolean boolean8 = explicit3.isResolved();
        java.lang.String str9 = explicit3.toString();
        byte[] byteArray10 = explicit3.resolve();
        java.lang.String str11 = explicit3.toString();
        byte[] byteArray12 = explicit3.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit13 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray12);
        byte[] byteArray14 = explicit13.resolve();
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit15 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray14);
        boolean boolean16 = explicit15.isResolved();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str9, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}" + "'", str11, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<2 bytes>}");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator11 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray10);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator12 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray7, classFileLocator11);
        byte[] byteArray15 = new byte[] { (byte) 100 };
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator16 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("hi!", byteArray15);
        net.bytebuddy.dynamic.ClassFileLocator classFileLocator17 = net.bytebuddy.dynamic.ClassFileLocator.Simple.of("", byteArray7, classFileLocator16);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit18 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit explicit19 = new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(byteArray7);
        java.lang.String str20 = explicit19.toString();
        java.lang.String str21 = explicit19.toString();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator11);
        org.junit.Assert.assertNotNull(classFileLocator12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(classFileLocator16);
        org.junit.Assert.assertNotNull(classFileLocator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}" + "'", str20, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}" + "'", str21, "ClassFileLocator.Resolution.Explicit{binaryRepresentation=<5 bytes>}");
    }
}

