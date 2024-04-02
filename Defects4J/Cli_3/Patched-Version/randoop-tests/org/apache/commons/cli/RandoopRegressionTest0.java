package org.apache.commons.cli;

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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test02");
        java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test03");
        java.lang.Class class1 = org.apache.commons.cli.TypeHandler.createClass("hi!");
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test04");
        org.apache.commons.cli.TypeHandler typeHandler0 = new org.apache.commons.cli.TypeHandler();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test05");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("hi!");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test06");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test07");
        java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("arg");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test08");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("[ option:   ::  ]");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test09");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("[ option:   ::  ]", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test10");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test11");
        java.lang.Class class2 = org.apache.commons.cli.PatternOptionBuilder.URL_VALUE;
        java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("arg", class2);
        java.lang.Object obj4 = org.apache.commons.cli.TypeHandler.createValue("[ option:   ::  ]", class2);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test12");
        java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("");
        org.junit.Assert.assertNull(fileArray1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test13");
        org.apache.commons.cli.CommandLine commandLine1 = new org.apache.commons.cli.CommandLine();
        java.util.List list2 = commandLine1.getArgList();
        java.lang.String str5 = commandLine1.getOptionValue("hi!", "");
        java.lang.String str7 = commandLine1.getOptionValue('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.UnrecognizedOptionException: hi!", (java.lang.Object) commandLine1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.CommandLine cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test14");
        java.lang.Class class1 = org.apache.commons.cli.TypeHandler.createClass("arg");
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test15");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("arg");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test16");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test17");
        org.apache.commons.cli.CommandLine commandLine1 = new org.apache.commons.cli.CommandLine();
        java.lang.String str3 = commandLine1.getOptionValue("hi!");
        java.lang.String str5 = commandLine1.getOptionValue("");
        java.util.List list6 = commandLine1.getArgList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.MissingArgumentException: ", (java.lang.Object) commandLine1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.CommandLine cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test18");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test19");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "[ Options: [ short {} ] [ long {} ]");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test20");
        java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test21");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "org.apache.commons.cli.MissingArgumentException: ");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test22");
        java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test23");
        java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test24");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test25");
        java.lang.Class class1 = org.apache.commons.cli.PatternOptionBuilder.FILE_VALUE;
        java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", class1);
        org.junit.Assert.assertNotNull(class1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test26");
        java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test27");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", false, "");
        option4.setArgName("");
        java.lang.String str7 = option4.getLongOpt();
        char char8 = option4.getValueSeparator();
        java.lang.String str9 = option4.getArgName();
        java.lang.String str11 = option4.getValue((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("arg", (java.lang.Object) option4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.Option cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test28");
        java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("arg");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test29");
        org.apache.commons.cli.CommandLine commandLine1 = new org.apache.commons.cli.CommandLine();
        java.util.List list2 = commandLine1.getArgList();
        java.lang.String str5 = commandLine1.getOptionValue(' ', "[ option:   ::  ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.MissingArgumentException: ", (java.lang.Object) "[ option:   ::  ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ option:   ::  ]" + "'", str5, "[ option:   ::  ]");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test30");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test31");
        java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("hi!");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test32");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("arg");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "arg");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test33");
        java.lang.Class class2 = org.apache.commons.cli.PatternOptionBuilder.STRING_VALUE;
        java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("", class2);
        java.lang.Object obj4 = org.apache.commons.cli.TypeHandler.createValue("hi!", class2);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "hi!" + "'", obj4, "hi!");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test34");
        java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.MissingArgumentException: ");
        org.junit.Assert.assertNull(fileArray1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test35");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("[ option:  [ option:   ::  ]  ::  ]");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test36");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("hi!");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test37");
        java.lang.Class class1 = org.apache.commons.cli.PatternOptionBuilder.OBJECT_VALUE;
        java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("[ option:  [ option:   ::  ]  ::  ]", class1);
        org.junit.Assert.assertNotNull(class1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test38");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", "hi!");
        org.apache.commons.cli.PosixParser posixParser4 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "arg", "" };
        java.lang.String[] strArray10 = posixParser4.flatten(options5, strArray8, true);
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser12 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray16 = new java.lang.String[] { "arg", "" };
        java.lang.String[] strArray18 = posixParser12.flatten(options13, strArray16, true);
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        java.util.Collection collection20 = options19.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser21 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options22 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray25 = new java.lang.String[] { "arg", "" };
        java.lang.String[] strArray27 = posixParser21.flatten(options22, strArray25, true);
        java.util.Properties properties28 = null;
        org.apache.commons.cli.CommandLine commandLine29 = posixParser12.parse(options19, strArray25, properties28);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!", "arg" };
        java.lang.String[] strArray35 = posixParser11.flatten(options19, strArray33, true);
        org.apache.commons.cli.CommandLine commandLine36 = new org.apache.commons.cli.CommandLine();
        java.lang.String str38 = commandLine36.getOptionValue("hi!");
        java.lang.String[] strArray39 = commandLine36.getArgs();
        java.util.Properties properties40 = null;
        org.apache.commons.cli.CommandLine commandLine41 = posixParser4.parse(options19, strArray39, properties40);
        java.util.Collection collection42 = options19.getOptionGroups();
        boolean boolean43 = option3.equals((java.lang.Object) options19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) boolean43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(commandLine41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test39");
        java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("[ option:   ::  ]");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test40");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test41");
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("[ option:  [ option:   ::  ]  ::  ]", obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test42");
        java.io.File file1 = org.apache.commons.cli.TypeHandler.createFile("org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "org.apache.commons.cli.ParseException: hi!");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test43");
        org.apache.commons.cli.PosixParser posixParser1 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.PosixParser posixParser2 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray6 = new java.lang.String[] { "arg", "" };
        java.lang.String[] strArray8 = posixParser2.flatten(options3, strArray6, true);
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.util.Collection collection10 = options9.getOptionGroups();
        org.apache.commons.cli.PosixParser posixParser11 = new org.apache.commons.cli.PosixParser();
        org.apache.commons.cli.Options options12 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray15 = new java.lang.String[] { "arg", "" };
        java.lang.String[] strArray17 = posixParser11.flatten(options12, strArray15, true);
        java.util.Properties properties18 = null;
        org.apache.commons.cli.CommandLine commandLine19 = posixParser2.parse(options9, strArray15, properties18);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "arg" };
        java.lang.String[] strArray25 = posixParser1.flatten(options9, strArray23, true);
        java.lang.String str26 = options9.toString();
        org.apache.commons.cli.Options options30 = options9.addOption("", false, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.UnrecognizedOptionException: hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[ Options: [ short {} ] [ long {} ]" + "'", str26, "[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNotNull(options30);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test44");
        java.lang.Class class1 = org.apache.commons.cli.TypeHandler.createClass("[ option:   ::  ]");
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test45");
        org.apache.commons.cli.MissingOptionException missingOptionException2 = new org.apache.commons.cli.MissingOptionException("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.ParseException: hi!", (java.lang.Object) missingOptionException2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.MissingOptionException cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test46");
        java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("[ option:   ::  ]");
        org.junit.Assert.assertNull(fileArray1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test47");
        java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test48");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", "");
        java.lang.String str4 = option3.getKey();
        option3.setOptionalArg(false);
        boolean boolean7 = option3.hasArgs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.ParseException: hi!", (java.lang.Object) option3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.Option cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test49");
        java.lang.Class class1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test50");
        java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test51");
        java.lang.Class class1 = org.apache.commons.cli.TypeHandler.createClass("");
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test52");
        java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("[ Options: [ short {=[ option:   ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(fileArray1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test53");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test54");
        java.lang.Class class1 = org.apache.commons.cli.TypeHandler.createClass("org.apache.commons.cli.ParseException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test55");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", false, "");
        option4.setArgName("");
        option4.clearValues();
        java.lang.String str9 = option4.getValue("arg");
        int int10 = option4.getArgs();
        option4.setLongOpt("[ option:   ::  ]");
        java.lang.Object obj13 = option4.getType();
        java.lang.String str14 = option4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("[ Options: [ short {=[ option:   :: hi! ]} ] [ long {} ]", (java.lang.Object) option4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.cli.Option cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[ option:  [ option:   ::  ]  ::  ]" + "'", str14, "[ option:  [ option:   ::  ]  ::  ]");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test56");
        org.apache.commons.cli.CommandLine commandLine1 = new org.apache.commons.cli.CommandLine();
        java.util.List list2 = commandLine1.getArgList();
        java.lang.String str5 = commandLine1.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray6 = commandLine1.getOptions();
        java.lang.String str9 = commandLine1.getOptionValue("[ option:   ::  ]", "");
        java.lang.String[] strArray11 = commandLine1.getOptionValues('a');
        boolean boolean13 = commandLine1.hasOption("[ option:  [ option:   ::  ]  ::  ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("arg", (java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Class");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test57");
        java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.ParseException: hi!");
        org.junit.Assert.assertNull(fileArray1);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test58");
        java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("org.apache.commons.cli.ParseException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test59");
        java.lang.Class class1 = null;
        java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("org.apache.commons.cli.MissingArgumentException: org.apache.commons.cli.MissingArgumentException: ", class1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test60");
        java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("[ Options: [ short {} ] [ long {} ]");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test61");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("arg");
        option1.setLongOpt("");
        option1.setRequired(false);
        java.lang.Class class7 = org.apache.commons.cli.PatternOptionBuilder.STRING_VALUE;
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("", class7);
        option1.setType((java.lang.Object) class7);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test62");
        java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("[ Options: [ short {=[ option:   ::  ]} ] [ long {} ]");
        org.junit.Assert.assertNull(uRL1);
    }
}

