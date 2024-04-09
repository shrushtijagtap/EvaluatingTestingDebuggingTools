package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test001");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test002");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test003");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat2.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.lang.Class<?> wildcardClass4 = cSVParser3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test007");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withCommentStart((java.lang.Character) '\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        java.lang.String[] strArray8 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape(',');
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat9.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test011");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test012");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat10.withHeader(strArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test013");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('#');
        java.lang.String str9 = cSVFormat6.getRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\f" + "'", str9, "\f");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test014");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        boolean boolean10 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withNullString("\205");
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat12.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test016");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test017");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat4.isCommentingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test018");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test019");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator('\f');
        boolean boolean7 = cSVFormat6.isEscaping();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test021");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("EOF []", cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [?, ??, ??, ?, ?, ??]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        boolean boolean6 = cSVFormat3.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean9 = cSVFormat3.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withRecordSeparator("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat11.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test023");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test024");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('\"');
        boolean boolean8 = cSVFormat5.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean11 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withRecordSeparator("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test025");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        boolean boolean8 = cSVFormat4.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test028");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote15 = cSVFormat12.getQuotePolicy();
        org.apache.commons.csv.Quote quote16 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withQuotePolicy(quote16);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray25 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withEscape('\"');
        java.lang.String[] strArray35 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat24.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote16, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray35, false);
        java.lang.String str39 = cSVFormat9.format((java.lang.Object[]) strArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser40 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(quote15);
        org.junit.Assert.assertTrue("'" + quote16 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote16.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str39, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test029");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentStart((java.lang.Character) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser9.nextRecord();
        long long11 = cSVParser9.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        boolean boolean6 = cSVFormat3.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean9 = cSVFormat3.isCommentingEnabled();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat3.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test033");
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape('\"');
        boolean boolean17 = cSVFormat14.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote25 = cSVFormat22.getQuotePolicy();
        org.apache.commons.csv.Quote quote26 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuotePolicy(quote26);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withEscape('\"');
        java.lang.String[] strArray45 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote26, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray45, false);
        java.lang.String str49 = cSVFormat19.format((java.lang.Object[]) strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat51 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote4, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray45, true);
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat58.withIgnoreSurroundingSpaces(true);
        java.lang.Character char63 = cSVFormat62.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray65 = cSVFormat64.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat64.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat64.withEscape('\"');
        java.lang.String[] strArray75 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat64.withHeader(strArray75);
        java.lang.String str77 = cSVFormat62.format((java.lang.Object[]) strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat79 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote4, (java.lang.Character) ' ', (java.lang.Character) ',', true, false, "", "", strArray75, false);
        java.io.Reader reader80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser81 = cSVFormat79.parse(reader80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote4.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(quote25);
        org.junit.Assert.assertTrue("'" + quote26 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote26.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str49, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNull(char63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNull(strArray65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str77, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = cSVFormat1.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test035");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test036");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote12 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuotePolicy(quote12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + quote12 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote12.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        boolean boolean5 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test040");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        boolean boolean6 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuoteChar('\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        boolean boolean6 = cSVFormat3.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        java.lang.String[] strArray17 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat9.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord(false);
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser23 = cSVFormat19.parse(reader22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test042");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        boolean boolean11 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader12 = null;
        org.apache.commons.csv.Lexer lexer13 = new org.apache.commons.csv.Lexer(cSVFormat4, extendedBufferedReader12);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        boolean boolean9 = cSVParser7.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test045");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withRecordSeparator("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        boolean boolean7 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        long long10 = cSVParser7.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        cSVFormat4.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test049");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\"');
        cSVFormat1.validate();
        java.lang.String[] strArray8 = cSVFormat1.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> CommentStart=<\f> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        cSVFormat16.validate();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('#');
        java.lang.String str22 = cSVFormat19.getRecordSeparator();
        java.lang.Character char23 = cSVFormat19.getEscape();
        boolean boolean24 = cSVFormat10.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.Quote quote25 = cSVFormat10.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\f" + "'", str22, "\f");
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(quote25);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser9.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser9.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withEscape((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test056");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat1.getCommentStart();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test057");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote11 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quote11 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote11.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser8.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test060");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote7 = cSVFormat4.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quote7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test061");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator("");
        boolean boolean7 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withEscape((java.lang.Character) 'a');
        java.lang.String str10 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(cSVParser11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('a');
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test064");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test065");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\n" + "'", str2, "\r\n");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVRecordItor8, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test067");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        boolean boolean9 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat2.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor15 = cSVParser14.iterator();
        java.lang.Class<?> wildcardClass16 = cSVRecordItor15.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordItor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        boolean boolean15 = cSVFormat4.equals((java.lang.Object) cSVFormat14);
        java.lang.String str16 = cSVFormat14.toString();
        java.lang.Class<?> wildcardClass17 = cSVFormat14.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str16, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test071");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote5 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        java.lang.String[] strArray14 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray14);
        java.lang.String str16 = cSVFormat2.format((java.lang.Object[]) strArray14);
        boolean boolean17 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat2.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withCommentStart('\f');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape((java.lang.Character) ',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quote5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str16, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test072");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withDelimiter('#');
        boolean boolean9 = cSVFormat4.getSkipHeaderRecord();
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test073");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        java.lang.String[] strArray20 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray20);
        java.lang.String str22 = cSVFormat11.format((java.lang.Object[]) strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat11.withEscape((java.lang.Character) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str22, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withSkipHeaderRecord(false);
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat15.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test076");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Character char7 = cSVFormat2.getQuoteChar();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test077");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        boolean boolean11 = cSVFormat3.getIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test078");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("4\f4,\205,hi!,hi!,4a\205a,a\r\na,a\r\na,\205,\205,a\r\na4");
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat9.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        boolean boolean15 = cSVParser14.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test081");
        java.io.File file0 = null;
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape('\"');
        boolean boolean18 = cSVFormat15.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote26 = cSVFormat23.getQuotePolicy();
        org.apache.commons.csv.Quote quote27 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withQuotePolicy(quote27);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray36 = cSVFormat35.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withEscape('\"');
        java.lang.String[] strArray46 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat35.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote27, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray46, false);
        java.lang.String str50 = cSVFormat20.format((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat52 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote5, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray46, true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat59.withIgnoreSurroundingSpaces(true);
        java.lang.Character char64 = cSVFormat63.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray66 = cSVFormat65.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat65.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat65.withEscape('\"');
        java.lang.String[] strArray76 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat65.withHeader(strArray76);
        java.lang.String str78 = cSVFormat63.format((java.lang.Object[]) strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat80 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote5, (java.lang.Character) ' ', (java.lang.Character) ',', true, false, "", "", strArray76, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser81 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote5.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(quote26);
        org.junit.Assert.assertTrue("'" + quote27 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote27.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str50, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNull(char64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str78, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test082");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        boolean boolean6 = cSVFormat5.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String str9 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        boolean boolean5 = cSVFormat0.isQuoting();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat0.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote19 = cSVFormat16.getQuotePolicy();
        org.apache.commons.csv.Quote quote20 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withQuotePolicy(quote20);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withEscape('\"');
        java.lang.String[] strArray39 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat28.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote20, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray39, false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat11.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat11.withCommentStart('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(quote19);
        org.junit.Assert.assertTrue("'" + quote20 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote20.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getCurrentLineNumber();
        boolean boolean11 = cSVParser7.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test086");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(',');
        java.lang.String str15 = cSVFormat14.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test087");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        boolean boolean4 = cSVFormat2.isNullHandling();
        java.lang.Class<?> wildcardClass5 = cSVFormat2.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withNullString("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        boolean boolean13 = cSVFormat2.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        boolean boolean24 = cSVFormat10.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        org.apache.commons.csv.CSVRecord cSVRecord26 = cSVParser25.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList27 = cSVParser25.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVParser25);
        org.junit.Assert.assertNull(cSVRecord26);
        org.junit.Assert.assertNotNull(cSVRecordList27);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test091");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser9.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser9.nextRecord();
        boolean boolean13 = cSVParser9.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        java.lang.String[] strArray8 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape(',');
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat11.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test096");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentStart((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat2.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test098");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.Lexer lexer5 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test099");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        java.lang.String str8 = cSVFormat2.getRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        boolean boolean12 = cSVParser7.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test101");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator("");
        boolean boolean7 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withEscape((java.lang.Character) 'a');
        java.lang.String str10 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        java.lang.Character char12 = cSVFormat6.getEscape();
        boolean boolean13 = cSVFormat6.isNullHandling();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        java.lang.String[] strArray8 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withSkipHeaderRecord(true);
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat15.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.Character char4 = cSVFormat1.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(char4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test104");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        java.lang.String[] strArray20 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray20);
        java.lang.String str22 = cSVFormat11.format((java.lang.Object[]) strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat11.withSkipHeaderRecord(false);
        java.lang.String[] strArray28 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat11.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat11.withNullString("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote32 = cSVFormat31.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser33 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str22, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNull(quote32);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote3 = cSVFormat0.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String[] strArray12 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withHeader(strArray12);
        java.lang.String str14 = cSVFormat0.format((java.lang.Object[]) strArray12);
        boolean boolean15 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withCommentStart('\f');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withIgnoreSurroundingSpaces(false);
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser25 = cSVFormat23.parse(reader24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quote3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str14, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart((java.lang.Character) 'a');
        java.lang.String str6 = cSVFormat3.toString();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat3.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str6, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withNullString("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.apache.commons.csv.Quote quote13 = cSVFormat12.getQuotePolicy();
        java.lang.String[] strArray14 = cSVFormat12.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(quote13);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test109");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteChar('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test110");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\u2028");
        java.lang.Character char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreEmptyLines(false);
        java.lang.Character char9 = cSVFormat5.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withCommentStart('\t');
        boolean boolean16 = cSVFormat5.equals((java.lang.Object) cSVFormat11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("");
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat9.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getCurrentLineNumber();
        boolean boolean11 = cSVParser7.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser7.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.lang.Class<?> wildcardClass6 = cSVParser3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test114");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Character char7 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        boolean boolean10 = cSVFormat9.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test115");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat10.withHeader(strArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test116");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.Quote quote11 = cSVFormat4.getQuotePolicy();
        org.apache.commons.csv.Quote quote14 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray22 = cSVFormat21.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('\"');
        boolean boolean27 = cSVFormat24.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote35 = cSVFormat32.getQuotePolicy();
        org.apache.commons.csv.Quote quote36 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withQuotePolicy(quote36);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray45 = cSVFormat44.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withEscape('\"');
        java.lang.String[] strArray55 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat44.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote36, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray55, false);
        java.lang.String str59 = cSVFormat29.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat61 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote14, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray55, true);
        java.lang.String str62 = cSVFormat4.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat4.withRecordSeparator("#\205#,#\r\n#,#\r\n#,\205,\205,#\r\n#");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser65 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertTrue("'" + quote14 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote14.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(quote35);
        org.junit.Assert.assertTrue("'" + quote36 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote36.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str59, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str62, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat64);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withDelimiter('#');
        boolean boolean6 = cSVFormat1.getSkipHeaderRecord();
        boolean boolean8 = cSVFormat1.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart((java.lang.Character) 'a');
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat10.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test118");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteChar((java.lang.Character) 'a');
        cSVFormat9.validate();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withRecordSeparator('a');
        boolean boolean15 = cSVFormat9.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat18);
        boolean boolean20 = cSVFormat9.equals((java.lang.Object) cSVFormat18);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote26 = cSVFormat23.getQuotePolicy();
        org.apache.commons.csv.Quote quote27 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withQuotePolicy(quote27);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray36 = cSVFormat35.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withEscape('\"');
        java.lang.String[] strArray46 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat35.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote27, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray46, false);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat18.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat3.withHeader(strArray46);
        org.apache.commons.csv.Quote quote52 = cSVFormat51.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser53 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(quote26);
        org.junit.Assert.assertTrue("'" + quote27 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote27.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNull(quote52);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        long long8 = cSVParser3.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        long long8 = cSVParser3.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        boolean boolean10 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withNullString("\205");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withRecordSeparator("a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = cSVFormat2.parse(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test124");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test125");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        long long8 = cSVParser3.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        boolean boolean11 = cSVParser9.isClosed();
        boolean boolean12 = cSVParser9.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar((java.lang.Character) ',');
        java.lang.Character char21 = cSVFormat18.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > CommentStart=<\t> SkipHeaderRecord:false", cSVFormat18);
        boolean boolean23 = cSVParser22.isClosed();
        long long24 = cSVParser22.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        boolean boolean8 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test132");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withEscape('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser8.getRecords();
        long long12 = cSVParser8.getRecordNumber();
        long long13 = cSVParser8.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray18 = cSVFormat17.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withEscape('\"');
        boolean boolean23 = cSVFormat20.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote31 = cSVFormat28.getQuotePolicy();
        org.apache.commons.csv.Quote quote32 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withQuotePolicy(quote32);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray41 = cSVFormat40.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withEscape('\"');
        java.lang.String[] strArray51 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat40.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote32, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray51, false);
        java.lang.String str55 = cSVFormat25.format((java.lang.Object[]) strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat57 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote10, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray51, true);
        java.lang.String[] strArray64 = null;
        org.apache.commons.csv.CSVFormat cSVFormat66 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) 'a', quote10, (java.lang.Character) '\\', (java.lang.Character) 'a', false, false, "\u2028", "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", strArray64, false);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat2.withQuotePolicy(quote10);
        java.io.Reader reader68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser69 = cSVFormat67.parse(reader68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote10.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(quote31);
        org.junit.Assert.assertTrue("'" + quote32 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote32.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str55, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat67);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        boolean boolean9 = cSVParser7.isClosed();
        boolean boolean10 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser7.spliterator();
        long long13 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNull(cSVRecord10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test140");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test141");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        boolean boolean6 = cSVFormat5.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String str9 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) '\t');
        java.lang.String str14 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withRecordSeparator("a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false" + "'", str14, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test142");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        boolean boolean14 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test144");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser8.getRecords();
        long long12 = cSVParser8.getRecordNumber();
        long long13 = cSVParser8.getCurrentLineNumber();
        long long14 = cSVParser8.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test146");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Character char7 = cSVFormat2.getQuoteChar();
        java.lang.String[] strArray8 = cSVFormat2.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        boolean boolean12 = cSVParser7.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser7.spliterator();
        long long14 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        boolean boolean11 = cSVParser8.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser8.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser8.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test149");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        java.lang.String str8 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.Quote quote9 = cSVFormat6.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withNullString("Delimiter=<\b> SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\r\n" + "'", str8, "\r\n");
        org.junit.Assert.assertNull(quote9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        long long11 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        boolean boolean7 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test154");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withEscape(',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        cSVParser8.close();
        long long12 = cSVParser8.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser8.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser8.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat9);
        java.lang.String[] strArray12 = cSVFormat9.getHeader();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat9, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test158");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        java.lang.String str6 = cSVFormat3.getNullString();
        java.lang.String str7 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote10 = cSVFormat9.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quote10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray18);
        java.lang.String str20 = cSVFormat9.format((java.lang.Object[]) strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat9.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('\f');
        java.io.Reader reader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser28 = cSVFormat26.parse(reader27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str20, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        char char1 = cSVFormat0.getDelimiter();
        boolean boolean2 = cSVFormat0.getSkipHeaderRecord();
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = cSVFormat0.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\t' + "'", char1 == '\t');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) "\r\n", "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test163");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        boolean boolean8 = cSVFormat6.isEscaping();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test164");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\u2028");
        java.lang.Character char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(false);
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        boolean boolean12 = cSVFormat10.getSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser8.getRecords();
        long long12 = cSVParser8.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser8.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser8.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordList13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        long long11 = cSVParser8.getCurrentLineNumber();
        cSVParser8.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat9);
        boolean boolean12 = cSVParser11.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser11.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        long long16 = cSVParser14.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test169");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        boolean boolean11 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withNullString("\205");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withRecordSeparator("a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        cSVFormat3.validate();
        boolean boolean17 = cSVFormat3.getIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        boolean boolean12 = cSVParser7.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser7.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test171");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withEscape((java.lang.Character) ' ');
        java.lang.Character char7 = cSVFormat6.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator('\\');
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuotePolicy(quote10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuoteChar((java.lang.Character) ',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote10.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart((java.lang.Character) '#');
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat7.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withEscape('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = null;
        org.apache.commons.csv.Lexer lexer17 = new org.apache.commons.csv.Lexer(cSVFormat10, extendedBufferedReader16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = lexer17.readEscape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(false);
        boolean boolean9 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\"Delimiter=<,> Escape=<#> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withCommentStart((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withSkipHeaderRecord(true);
        java.lang.String str16 = cSVFormat10.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        long long12 = cSVParser8.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser8.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser8.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        boolean boolean11 = cSVParser8.isClosed();
        cSVParser8.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuotePolicy(quote10);
        java.lang.String str12 = cSVFormat11.getNullString();
        boolean boolean13 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withCommentStart('\\');
        boolean boolean16 = cSVFormat15.isCommentingEnabled();
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = cSVFormat15.parse(reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote10.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withSkipHeaderRecord(true);
        boolean boolean16 = cSVFormat10.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test182");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('#');
        java.lang.Character char8 = cSVFormat3.getQuoteChar();
        boolean boolean9 = cSVFormat3.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test183");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.Lexer lexer6 = new org.apache.commons.csv.Lexer(cSVFormat4, extendedBufferedReader5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withCommentStart('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\b');
        java.lang.Character char9 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\u2029", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser10.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVRecord11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test185");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\u2028");
        java.lang.Character char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withRecordSeparator("\u2029");
        org.apache.commons.csv.Quote quote11 = cSVFormat5.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        boolean boolean10 = cSVParser8.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        long long8 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test188");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        boolean boolean7 = cSVFormat6.isCommentingEnabled();
        cSVFormat6.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test189");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = null;
        org.apache.commons.csv.Lexer lexer12 = new org.apache.commons.csv.Lexer(cSVFormat10, extendedBufferedReader11);
        org.apache.commons.csv.Quote quote13 = cSVFormat10.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser9.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser9.getHeaderMap();
        long long13 = cSVParser9.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar('\"');
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = cSVFormat4.parse(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test194");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.Character char8 = cSVFormat4.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar((java.lang.Character) 'a');
        cSVFormat11.validate();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat11.withIgnoreEmptyLines(true);
        boolean boolean23 = cSVFormat11.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote27 = cSVFormat24.getQuotePolicy();
        org.apache.commons.csv.Quote quote28 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withQuoteChar((java.lang.Character) 'a');
        cSVFormat32.validate();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat32.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray41 = cSVFormat40.getHeader();
        java.lang.String[] strArray48 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat40.withHeader(strArray48);
        java.lang.String str50 = cSVFormat39.format((java.lang.Object[]) strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat24.withHeader(strArray48);
        java.lang.String str52 = cSVFormat11.format((java.lang.Object[]) strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat4.withHeader(strArray48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser54 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(quote27);
        org.junit.Assert.assertTrue("'" + quote28 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote28.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str50, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str52, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat53);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser8.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser8.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withEscape((java.lang.Character) '4');
        boolean boolean16 = cSVFormat15.isEscaping();
        boolean boolean17 = cSVFormat15.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser10.close();
        long long12 = cSVParser10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser10.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test198");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        boolean boolean12 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withNullString("\205");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat4.withRecordSeparator("a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        long long11 = cSVParser8.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuoteChar('\t');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        java.lang.String str14 = cSVFormat11.toString();
        org.apache.commons.csv.Quote quote15 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuotePolicy(quote15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat7.withQuotePolicy(quote15);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat17);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cSVParser18.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str14, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quote15 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote15.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        boolean boolean12 = cSVParser7.isClosed();
        boolean boolean13 = cSVParser7.isClosed();
        long long14 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        boolean boolean11 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withEscape('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat4.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser10.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser10.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser7.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withEscape((java.lang.Character) '\\');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape((java.lang.Character) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser9.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser9.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser9.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser9.getHeaderMap();
        long long15 = cSVParser9.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertNull(cSVRecord7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test209");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\"');
        org.apache.commons.csv.Quote quote7 = cSVFormat6.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quote7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        boolean boolean7 = cSVParser3.isClosed();
        cSVParser3.close();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test212");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withDelimiter('\"');
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.String str7 = cSVFormat6.getNullString();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withNullString("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\", \r\n\u2028]");
        java.lang.String str13 = cSVFormat6.getNullString();
        java.lang.String str14 = cSVFormat6.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str8, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        long long9 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecord7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test215");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withEscape((java.lang.Character) '#');
        cSVFormat10.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser8.getRecords();
        long long12 = cSVParser8.getRecordNumber();
        long long13 = cSVParser8.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser8.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator15 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test217");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuoteChar('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test218");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        java.lang.Class<?> wildcardClass10 = cSVFormat9.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test221");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '\t');
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test223");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        boolean boolean11 = cSVFormat10.getSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test224");
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withDelimiter('#');
        boolean boolean9 = cSVFormat4.getSkipHeaderRecord();
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withNullString("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.apache.commons.csv.Quote quote17 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuoteChar((java.lang.Character) 'a');
        cSVFormat26.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat26.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        java.lang.String[] strArray42 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat34.withHeader(strArray42);
        java.lang.String str44 = cSVFormat33.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) ' ', quote17, (java.lang.Character) '\f', (java.lang.Character) '\b', true, true, "\205", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", strArray42, true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat4.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat56.withIgnoreSurroundingSpaces(true);
        java.lang.Character char61 = cSVFormat60.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray63 = cSVFormat62.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat62.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat62.withEscape('\"');
        java.lang.String[] strArray73 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat62.withHeader(strArray73);
        java.lang.String str75 = cSVFormat60.format((java.lang.Object[]) strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat55.withHeader(strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat78 = new org.apache.commons.csv.CSVFormat('\\', (java.lang.Character) '#', quote17, (java.lang.Character) '\\', (java.lang.Character) 'a', true, true, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\205\bhi!\bhi!\ba\205a,a\r\na,a\r\na,\205,\205,a\r\nanull", strArray73, false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + quote17 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote17.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str44, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNull(char61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str75, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat76);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withEscape((java.lang.Character) '4');
        boolean boolean16 = cSVFormat15.isEscaping();
        java.lang.String str17 = cSVFormat15.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test226");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        boolean boolean6 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = null;
        org.apache.commons.csv.Lexer lexer8 = new org.apache.commons.csv.Lexer(cSVFormat5, extendedBufferedReader7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVRecordList6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test228");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat1.isNullHandling();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat4.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.Quote quote23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withQuotePolicy(quote23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = org.apache.commons.csv.CSVParser.parse("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null", cSVFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [?, ??, ??, ?, ?, ??]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test230");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat4.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withNullString("4");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser25 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser9.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser9.nextRecord();
        cSVParser9.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser9.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        boolean boolean9 = cSVParser3.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        cSVFormat8.validate();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withRecordSeparator('a');
        boolean boolean14 = cSVFormat8.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat17);
        boolean boolean19 = cSVFormat8.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote25 = cSVFormat22.getQuotePolicy();
        org.apache.commons.csv.Quote quote26 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuotePolicy(quote26);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withEscape('\"');
        java.lang.String[] strArray45 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote26, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray45, false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat17.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat2.withHeader(strArray45);
        java.lang.Class<?> wildcardClass51 = cSVFormat2.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(quote25);
        org.junit.Assert.assertTrue("'" + quote26 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote26.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test236");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\u2028");
        java.lang.Character char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        long long11 = cSVParser9.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Character char7 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        boolean boolean10 = cSVFormat9.isQuoting();
        java.lang.Character char11 = cSVFormat9.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator("\205");
        boolean boolean16 = cSVFormat15.isQuoting();
        boolean boolean17 = cSVFormat9.equals((java.lang.Object) cSVFormat15);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("", cSVFormat15);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser18.getRecords();
        boolean boolean20 = cSVParser18.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuotePolicy(quote10);
        java.lang.String str12 = cSVFormat11.getNullString();
        boolean boolean13 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withDelimiter(' ');
        cSVFormat11.validate();
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = cSVFormat11.parse(reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote10.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test240");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("\u2028");
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(false);
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat11);
        java.lang.String[] strArray14 = cSVFormat11.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreEmptyLines(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        cSVFormat16.validate();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('#');
        java.lang.String str22 = cSVFormat19.getRecordSeparator();
        java.lang.Character char23 = cSVFormat19.getEscape();
        boolean boolean24 = cSVFormat10.equals((java.lang.Object) cSVFormat19);
        boolean boolean25 = cSVFormat10.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\f" + "'", str22, "\f");
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test242");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withEscape((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test243");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        long long11 = cSVParser8.getCurrentLineNumber();
        long long12 = cSVParser8.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord(false);
        boolean boolean11 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVParser12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        cSVParser8.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser14.iterator();
        long long17 = cSVParser14.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('\b');
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat2.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        long long8 = cSVParser3.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser3.getHeaderMap();
        long long10 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withNullString("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        boolean boolean9 = cSVFormat5.equals((java.lang.Object) "Delimiter=<,> Escape=<a> QuoteChar=<a> CommentStart=<\f> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withCommentStart('\"');
        org.apache.commons.csv.Quote quote12 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withQuotePolicy(quote12);
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = cSVFormat13.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + quote12 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote12.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test250");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.Quote quote11 = cSVFormat4.getQuotePolicy();
        org.apache.commons.csv.Quote quote14 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray22 = cSVFormat21.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('\"');
        boolean boolean27 = cSVFormat24.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote35 = cSVFormat32.getQuotePolicy();
        org.apache.commons.csv.Quote quote36 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withQuotePolicy(quote36);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray45 = cSVFormat44.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withEscape('\"');
        java.lang.String[] strArray55 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat44.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote36, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray55, false);
        java.lang.String str59 = cSVFormat29.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat61 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote14, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray55, true);
        java.lang.String str62 = cSVFormat4.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat4.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser65 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertTrue("'" + quote14 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote14.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(quote35);
        org.junit.Assert.assertTrue("'" + quote36 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote36.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str59, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str62, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat64);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test251");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '\t');
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        boolean boolean9 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        long long16 = cSVParser14.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser14.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        boolean boolean9 = cSVParser3.isClosed();
        boolean boolean10 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test257");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withEscape('\f');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withNullString("\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentStart((java.lang.Character) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser25 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test258");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Character char7 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        boolean boolean10 = cSVFormat9.isQuoting();
        java.lang.Character char11 = cSVFormat9.getCommentStart();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(char11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        boolean boolean4 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart((java.lang.Character) 'a');
        boolean boolean11 = cSVFormat10.isEscaping();
        boolean boolean12 = cSVFormat2.equals((java.lang.Object) boolean11);
        org.apache.commons.csv.Quote quote13 = cSVFormat2.getQuotePolicy();
        java.lang.String[] strArray14 = cSVFormat2.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(quote13);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test260");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat4.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.Quote quote23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withQuotePolicy(quote23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = org.apache.commons.csv.CSVParser.parse("4", cSVFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [?, ??, ??, ?, ?, ??]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote19 = cSVFormat16.getQuotePolicy();
        org.apache.commons.csv.Quote quote20 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withQuotePolicy(quote20);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withEscape('\"');
        java.lang.String[] strArray39 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat28.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote20, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray39, false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat11.withHeader(strArray39);
        java.io.Reader reader44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser45 = cSVFormat11.parse(reader44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(quote19);
        org.junit.Assert.assertTrue("'" + quote20 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote20.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat43);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test262");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        boolean boolean12 = cSVParser7.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser7.spliterator();
        cSVParser7.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser7.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        boolean boolean6 = cSVFormat5.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String str9 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteChar((java.lang.Character) 'a');
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withDelimiter('#');
        java.lang.String str23 = cSVFormat20.getRecordSeparator();
        java.lang.Character char24 = cSVFormat20.getEscape();
        boolean boolean25 = cSVFormat11.equals((java.lang.Object) cSVFormat20);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuoteChar((java.lang.Character) 'a');
        cSVFormat28.validate();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote36 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray44 = cSVFormat43.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withEscape('\"');
        boolean boolean49 = cSVFormat46.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote57 = cSVFormat54.getQuotePolicy();
        org.apache.commons.csv.Quote quote58 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat54.withQuotePolicy(quote58);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray67 = cSVFormat66.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat66.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat66.withEscape('\"');
        java.lang.String[] strArray77 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat66.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat80 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote58, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray77, false);
        java.lang.String str81 = cSVFormat51.format((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat83 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote36, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray77, true);
        java.lang.String[] strArray90 = null;
        org.apache.commons.csv.CSVFormat cSVFormat92 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) 'a', quote36, (java.lang.Character) '\\', (java.lang.Character) 'a', false, false, "\u2028", "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", strArray90, false);
        org.apache.commons.csv.CSVFormat cSVFormat93 = cSVFormat28.withQuotePolicy(quote36);
        org.apache.commons.csv.CSVFormat cSVFormat94 = cSVFormat11.withQuotePolicy(quote36);
        org.apache.commons.csv.CSVParser cSVParser95 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat94);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\f" + "'", str23, "\f");
        org.junit.Assert.assertNull(char24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + quote36 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote36.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNull(quote57);
        org.junit.Assert.assertTrue("'" + quote58 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote58.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNull(strArray67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str81, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat93);
        org.junit.Assert.assertNotNull(cSVFormat94);
        org.junit.Assert.assertNotNull(cSVParser95);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
        boolean boolean11 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser14.iterator();
        cSVParser14.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test267");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        cSVParser8.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser8.spliterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser8.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(false);
        boolean boolean9 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\"Delimiter=<,> Escape=<#> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!", cSVFormat4);
        long long11 = cSVParser10.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser8.getRecords();
        long long12 = cSVParser8.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor13 = cSVParser8.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordItor13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test270");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test271");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        boolean boolean8 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withQuoteChar((java.lang.Character) ',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser24 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> NullString=<Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar((java.lang.Character) 'a');
        char char16 = cSVFormat15.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + ' ' + "'", char16 == ' ');
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test274");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        cSVParser7.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test275");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        boolean boolean11 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withEscape('\"');
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = cSVFormat13.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test276");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator("INVALID []");
        java.lang.Character char11 = cSVFormat10.getCommentStart();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test277");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\b');
        java.lang.Character char9 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withNullString("\"Delimiter=<,> Escape=<#> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false\",hi!");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withNullString("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null");
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\205 hi! hi! a\205a,a\r\na,a\r\na,\205,\205,a\r\nanull", cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        boolean boolean11 = cSVFormat4.isNullHandling();
        boolean boolean12 = cSVFormat4.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test279");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\u2028");
        java.lang.Character char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(false);
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreSurroundingSpaces(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser7.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test281");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser7.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test282");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser8.getRecords();
        long long12 = cSVParser8.getRecordNumber();
        long long13 = cSVParser8.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser8.iterator();
        long long15 = cSVParser8.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test283");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        cSVFormat1.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test284");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote5 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        java.lang.String[] strArray14 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray14);
        java.lang.String str16 = cSVFormat2.format((java.lang.Object[]) strArray14);
        boolean boolean17 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat2.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withCommentStart('\f');
        org.apache.commons.csv.Quote quote24 = cSVFormat23.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withQuoteChar('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quote5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str16, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(quote24);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        long long8 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test286");
        org.apache.commons.csv.Quote quote3 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        boolean boolean16 = cSVFormat13.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote24 = cSVFormat21.getQuotePolicy();
        org.apache.commons.csv.Quote quote25 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withQuotePolicy(quote25);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray34 = cSVFormat33.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withEscape('\"');
        java.lang.String[] strArray44 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat33.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote25, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray44, false);
        java.lang.String str48 = cSVFormat18.format((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat50 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote3, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray44, true);
        java.lang.String str51 = cSVFormat50.getRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser52 = org.apache.commons.csv.CSVParser.parse("\f", cSVFormat50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The escape character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote3 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote3.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(quote24);
        org.junit.Assert.assertTrue("'" + quote25 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote25.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str48, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u2028" + "'", str51, "\u2028");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test287");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        java.lang.String[] strArray20 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray20);
        java.lang.String str22 = cSVFormat11.format((java.lang.Object[]) strArray20);
        cSVFormat11.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser24 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str22, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test288");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withRecordSeparator("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test289");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        boolean boolean6 = cSVFormat5.isQuoting();
        java.lang.Character char7 = cSVFormat5.getEscape();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test290");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        boolean boolean5 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test291");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        cSVParser3.close();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreEmptyLines(false);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat1.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test293");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuoteChar('\t');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart((java.lang.Character) 'a');
        java.lang.String str14 = cSVFormat11.toString();
        org.apache.commons.csv.Quote quote15 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuotePolicy(quote15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat7.withQuotePolicy(quote15);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat17);
        long long19 = cSVParser18.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str14, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quote15 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote15.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        boolean boolean7 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test295");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader11 = null;
        org.apache.commons.csv.Lexer lexer12 = new org.apache.commons.csv.Lexer(cSVFormat4, extendedBufferedReader11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test296");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser8.spliterator();
        long long14 = cSVParser8.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test297");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        cSVParser8.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser8.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test298");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator("");
        boolean boolean7 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withEscape((java.lang.Character) 'a');
        java.lang.String str10 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        java.lang.Character char12 = cSVFormat6.getEscape();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test299");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '\f');
        boolean boolean10 = cSVFormat7.isCommentingEnabled();
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat7.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test300");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.Character char7 = cSVFormat3.getEscape();
        boolean boolean8 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat3);
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser9.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNotNull(cSVRecord10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test301");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat14);
        long long18 = cSVParser17.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser17.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser17.getRecords();
        boolean boolean21 = cSVFormat7.equals((java.lang.Object) cSVParser17);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVParser17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test302");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote3 = cSVFormat0.getQuotePolicy();
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        cSVFormat8.validate();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray17 = cSVFormat16.getHeader();
        java.lang.String[] strArray24 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat16.withHeader(strArray24);
        java.lang.String str26 = cSVFormat15.format((java.lang.Object[]) strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat0.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withIgnoreSurroundingSpaces(false);
        boolean boolean30 = cSVFormat27.isQuoting();
        java.lang.String[] strArray31 = cSVFormat27.getHeader();
        java.io.Reader reader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser33 = cSVFormat27.parse(reader32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quote3);
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote4.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str26, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test303");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test304");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        boolean boolean9 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test305");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        java.lang.String[] strArray8 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreSurroundingSpaces(false);
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat13.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test306");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getCurrentLineNumber();
        cSVParser7.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser7.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test307");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        boolean boolean6 = cSVFormat4.isEscaping();
        java.lang.String str7 = cSVFormat4.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withSkipHeaderRecord(false);
        java.lang.String str10 = cSVFormat9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str10, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test308");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withEscape((java.lang.Character) ' ');
        boolean boolean8 = cSVFormat3.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) '\f');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test309");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        java.lang.String str9 = cSVFormat7.getRecordSeparator();
        boolean boolean10 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteChar(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test310");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test311");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        java.lang.Class<?> wildcardClass8 = cSVRecordSpliterator7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test312");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withSkipHeaderRecord(false);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test313");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteChar((java.lang.Character) 'a');
        cSVFormat9.validate();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray18 = cSVFormat17.getHeader();
        java.lang.String[] strArray25 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray25);
        java.lang.String str27 = cSVFormat16.format((java.lang.Object[]) strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat1.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreSurroundingSpaces(false);
        boolean boolean31 = cSVFormat28.isQuoting();
        java.lang.Character char32 = cSVFormat28.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat28.withIgnoreSurroundingSpaces(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser35 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str27, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(char32);
        org.junit.Assert.assertNotNull(cSVFormat34);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test314");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        long long7 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test315");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar((java.lang.Character) ',');
        java.lang.String str21 = cSVFormat18.toString();
        boolean boolean22 = cSVFormat18.getIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser23 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Delimiter=<,> Escape=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str21, "Delimiter=<,> Escape=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test316");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        boolean boolean11 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withNullString("\205");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withRecordSeparator("a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        cSVFormat3.validate();
        boolean boolean17 = cSVFormat3.getIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test317");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        long long8 = cSVParser3.getRecordNumber();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test318");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        long long8 = cSVParser3.getCurrentLineNumber();
        boolean boolean9 = cSVParser3.isClosed();
        java.lang.Class<?> wildcardClass10 = cSVParser3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test319");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\b');
        java.lang.Character char9 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\u2029", cSVFormat6);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser10.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test320");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test321");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        boolean boolean6 = cSVFormat3.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        java.lang.String[] strArray17 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat9.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.Quote quote22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withQuotePolicy(quote22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withRecordSeparator('\"');
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser29 = cSVFormat27.parse(reader28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test322");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.nextRecord();
        boolean boolean11 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test323");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        boolean boolean24 = cSVFormat10.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        boolean boolean26 = cSVParser25.isClosed();
        boolean boolean27 = cSVParser25.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator28 = cSVParser25.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVParser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator28);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test324");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withDelimiter('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withDelimiter('\t');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test325");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withDelimiter('#');
        java.lang.Character char15 = cSVFormat10.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withIgnoreEmptyLines(true);
        boolean boolean18 = cSVFormat17.isQuoting();
        java.lang.Character char19 = cSVFormat17.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator("\205");
        boolean boolean24 = cSVFormat23.isQuoting();
        boolean boolean25 = cSVFormat17.equals((java.lang.Object) cSVFormat23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuoteChar((java.lang.Character) 'a');
        cSVFormat28.validate();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withRecordSeparator('a');
        boolean boolean34 = cSVFormat28.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser38 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat37);
        boolean boolean39 = cSVFormat28.equals((java.lang.Object) cSVFormat37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote45 = cSVFormat42.getQuotePolicy();
        org.apache.commons.csv.Quote quote46 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withQuotePolicy(quote46);
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray55 = cSVFormat54.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat54.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat54.withEscape('\"');
        java.lang.String[] strArray65 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat54.withHeader(strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat68 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote46, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray65, false);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat37.withHeader(strArray65);
        boolean boolean70 = cSVFormat17.equals((java.lang.Object) strArray65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat72 = new org.apache.commons.csv.CSVFormat('\n', (java.lang.Character) ',', quote2, (java.lang.Character) '#', (java.lang.Character) '\n', false, false, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", "", strArray65, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote2.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(char19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVParser38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(quote45);
        org.junit.Assert.assertTrue("'" + quote46 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote46.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNull(strArray55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test326");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test327");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\f');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("TOKEN []", cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test328");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote19 = cSVFormat16.getQuotePolicy();
        org.apache.commons.csv.Quote quote20 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withQuotePolicy(quote20);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withEscape('\"');
        java.lang.String[] strArray39 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat28.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote20, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray39, false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat11.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat45.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withEscape('a');
        boolean boolean52 = cSVFormat49.getIgnoreEmptyLines();
        org.apache.commons.csv.Quote quote55 = org.apache.commons.csv.Quote.MINIMAL;
        java.lang.String[] strArray62 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\"', quote55, (java.lang.Character) 'a', (java.lang.Character) ' ', false, false, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", "\u2029", strArray62, false);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat49.withQuotePolicy(quote55);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat11.withQuotePolicy(quote55);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(quote19);
        org.junit.Assert.assertTrue("'" + quote20 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote20.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + quote55 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote55.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test329");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getCurrentLineNumber();
        boolean boolean11 = cSVParser7.isClosed();
        long long12 = cSVParser7.getCurrentLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser7.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test330");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser8.getHeaderMap();
        cSVParser8.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser8.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test331");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        cSVFormat8.validate();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withRecordSeparator('a');
        boolean boolean14 = cSVFormat8.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat17);
        boolean boolean19 = cSVFormat8.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote25 = cSVFormat22.getQuotePolicy();
        org.apache.commons.csv.Quote quote26 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuotePolicy(quote26);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withEscape('\"');
        java.lang.String[] strArray45 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote26, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray45, false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat17.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat2.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat2.withCommentStart('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(quote25);
        org.junit.Assert.assertTrue("'" + quote26 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote26.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test332");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test333");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('a');
        boolean boolean8 = cSVFormat2.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat11);
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote19 = cSVFormat16.getQuotePolicy();
        org.apache.commons.csv.Quote quote20 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withQuotePolicy(quote20);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withEscape('\"');
        java.lang.String[] strArray39 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat28.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote20, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray39, false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat11.withHeader(strArray39);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat43, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na4");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(quote19);
        org.junit.Assert.assertTrue("'" + quote20 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote20.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat43);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test334");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withEscape((java.lang.Character) ' ');
        boolean boolean6 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) '\f');
        boolean boolean9 = cSVFormat8.isCommentingEnabled();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat8.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test335");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray18);
        java.lang.String str20 = cSVFormat9.format((java.lang.Object[]) strArray18);
        cSVFormat9.validate();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = null;
        org.apache.commons.csv.Lexer lexer25 = new org.apache.commons.csv.Lexer(cSVFormat23, extendedBufferedReader24);
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = cSVFormat23.parse(reader26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str20, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test336");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        boolean boolean7 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test337");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.Character char7 = cSVFormat3.getEscape();
        boolean boolean8 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat3);
        java.lang.String str10 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test338");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test339");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser5.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: (line 4) invalid char between encapsulated token and delimiter");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test340");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        long long14 = cSVParser13.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord15);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test341");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.String str6 = cSVFormat2.toString();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat2);
        boolean boolean8 = cSVFormat2.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\b> SkipHeaderRecord:false" + "'", str6, "Delimiter=<\b> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test342");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        java.lang.Character char8 = cSVFormat7.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withEscape('\"');
        java.lang.String[] strArray20 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat9.withHeader(strArray20);
        java.lang.String str22 = cSVFormat7.format((java.lang.Object[]) strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat2.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat2.withCommentStart('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str22, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test343");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test344");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test345");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getCurrentLineNumber();
        cSVParser7.close();
        long long12 = cSVParser7.getRecordNumber();
        cSVParser7.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test346");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuotePolicy(quote10);
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat11.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote10.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test347");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("\u2028> RecordSeparator=<Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\", \r\n\u2028]> SkipHeaderRecord:false", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test348");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean4 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test349");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuoteChar((java.lang.Character) '#');
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        boolean boolean7 = cSVFormat5.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat12);
        long long16 = cSVParser15.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList17 = cSVParser15.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList18 = cSVParser15.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cSVParser15.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cSVParser15.getHeaderMap();
        boolean boolean21 = cSVFormat5.equals((java.lang.Object) strMap20);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVParser15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList17);
        org.junit.Assert.assertNotNull(cSVRecordList18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test350");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar('\b');
        java.lang.Character char5 = cSVFormat1.getCommentStart();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test351");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser9.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser9.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser9.getRecords();
        boolean boolean14 = cSVParser9.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cSVParser9.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test352");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser9.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser9.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser9.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser9.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser9.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(cSVRecord15);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test353");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withEscape((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withNullString("\u2028");
        java.lang.Character char18 = cSVFormat17.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat17);
        long long22 = cSVParser21.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = cSVParser21.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord24 = cSVParser21.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator25 = cSVParser21.spliterator();
        boolean boolean26 = cSVFormat2.equals((java.lang.Object) cSVRecordSpliterator25);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVParser21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(cSVRecord24);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test354");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        cSVFormat10.validate();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat10.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse("\f", cSVFormat10);
        boolean boolean26 = cSVParser25.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVParser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test355");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.Lexer lexer4 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader3);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser5.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser5.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser5.getRecords();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser5, "Delimiter=<,> Escape=<#> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecord6);
        org.junit.Assert.assertNull(cSVRecord7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test356");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader4 = null;
        org.apache.commons.csv.Lexer lexer5 = new org.apache.commons.csv.Lexer(cSVFormat1, extendedBufferedReader4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test357");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null", cSVFormat4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser5.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: (line 4) invalid char between encapsulated token and delimiter");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test358");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser10.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser10.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test359");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser9.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser9.nextRecord();
        cSVParser9.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNull(cSVRecord12);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test360");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.nextRecord();
        long long11 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test361");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        java.lang.String[] strArray20 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray20);
        java.lang.String str22 = cSVFormat11.format((java.lang.Object[]) strArray20);
        cSVFormat11.validate();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat11.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray27 = cSVFormat26.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray31 = cSVFormat30.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote40 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withQuotePolicy(quote40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat26.withQuotePolicy(quote40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat11.withQuotePolicy(quote40);
        java.lang.String[] strArray56 = new java.lang.String[] { "4\f4,\205,hi!,hi!,4a\205a,a\r\na,a\r\na,\205,\205,a\r\na4", "\u2028", "\r\n", "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat58 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) '\"', quote40, (java.lang.Character) ' ', (java.lang.Character) '#', true, true, "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", strArray56, true);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withNullString("hi!");
        java.io.Reader reader61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser62 = cSVFormat60.parse(reader61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str22, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + quote40 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote40.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(cSVFormat60);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test362");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser8.spliterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser8.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser8.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test363");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.String str10 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withEscape((java.lang.Character) '\f');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test364");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        boolean boolean15 = cSVFormat4.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean17 = cSVFormat16.getIgnoreEmptyLines();
        java.lang.Character char18 = cSVFormat16.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withCommentStart((java.lang.Character) '\t');
        java.lang.String[] strArray21 = cSVFormat20.getHeader();
        boolean boolean22 = cSVFormat14.equals((java.lang.Object) strArray21);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test365");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        long long5 = cSVParser3.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Assertions.notNull((java.lang.Object) strMap6, "Delimiter=<,> Escape=<a> QuoteChar=<a> NullString=<Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'Delimiter=<,> Escape=<a> QuoteChar=<a> NullString=<Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<??> SkipHeaderRecord:false> RecordSeparator=<??> SurroundingSpaces:ignored SkipHeaderRecord:false' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test366");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote3 = cSVFormat0.getQuotePolicy();
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat5.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quote3);
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote4.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test367");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        java.lang.String str6 = cSVFormat3.getNullString();
        java.lang.String str7 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withCommentStart((java.lang.Character) '\f');
        boolean boolean10 = cSVFormat3.getSkipHeaderRecord();
        java.lang.Character char11 = cSVFormat3.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape((java.lang.Character) '\f');
        boolean boolean22 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray26 = cSVFormat25.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote35 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withQuotePolicy(quote35);
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray44 = cSVFormat43.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withEscape('\"');
        boolean boolean49 = cSVFormat46.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote57 = cSVFormat54.getQuotePolicy();
        org.apache.commons.csv.Quote quote58 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat54.withQuotePolicy(quote58);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray67 = cSVFormat66.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat66.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat66.withEscape('\"');
        java.lang.String[] strArray77 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat66.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat80 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote58, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray77, false);
        java.lang.String str81 = cSVFormat51.format((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat83 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) '\"', quote35, (java.lang.Character) '#', (java.lang.Character) '#', false, false, "\r\n", "\f", strArray77, false);
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat19.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat3.withHeader(strArray77);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser86 = org.apache.commons.csv.CSVParser.parse("\f", cSVFormat85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [?, ?, hi!, hi!, a?a,a??a,a??a,?,?,a??a]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + quote35 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote35.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNull(quote57);
        org.junit.Assert.assertTrue("'" + quote58 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote58.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNull(strArray67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str81, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(cSVFormat85);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test368");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        long long5 = cSVParser3.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test369");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        boolean boolean11 = cSVParser8.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser8.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser8.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(cSVRecord13);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test370");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser10.close();
        long long12 = cSVParser10.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser10.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test371");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        cSVFormat3.validate();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("a\fa,\205,hi!,hi!,aaa\205aa,aa\r\naa,aa\r\naa,\205,\205,aa\r\naaaINVALID []", cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test372");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        cSVParser7.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test373");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        java.lang.Class<?> wildcardClass7 = cSVParser3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test374");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        java.lang.String[] strArray8 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat11.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\r\n" + "'", str12, "\r\n");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test375");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withDelimiter('#');
        java.lang.Character char6 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(true);
        boolean boolean9 = cSVFormat8.isQuoting();
        java.lang.Character char10 = cSVFormat8.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("\205");
        boolean boolean15 = cSVFormat14.isQuoting();
        boolean boolean16 = cSVFormat8.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteChar((java.lang.Character) 'a');
        cSVFormat19.validate();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withRecordSeparator('a');
        boolean boolean25 = cSVFormat19.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser29 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat28);
        boolean boolean30 = cSVFormat19.equals((java.lang.Object) cSVFormat28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote36 = cSVFormat33.getQuotePolicy();
        org.apache.commons.csv.Quote quote37 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withQuotePolicy(quote37);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray46 = cSVFormat45.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat45.withEscape('\"');
        java.lang.String[] strArray56 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat45.withHeader(strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote37, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray56, false);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat28.withHeader(strArray56);
        boolean boolean61 = cSVFormat8.equals((java.lang.Object) strArray56);
        cSVFormat8.validate();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat8.withCommentStart('\"');
        char char65 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVParser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(quote36);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote37.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + char65 + "' != '" + ' ' + "'", char65 == ' ');
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test376");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        long long8 = cSVParser3.getCurrentLineNumber();
        long long9 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test377");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        char char11 = cSVFormat4.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat4.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test378");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.lang.Class<?> wildcardClass7 = cSVRecordSpliterator6.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test379");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        boolean boolean8 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteChar((java.lang.Character) 'a');
        cSVFormat17.validate();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat17.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray26 = cSVFormat25.getHeader();
        java.lang.String[] strArray33 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat25.withHeader(strArray33);
        java.lang.String str35 = cSVFormat24.format((java.lang.Object[]) strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat24.withSkipHeaderRecord(false);
        java.lang.String[] strArray41 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat24.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat2.withHeader(strArray41);
        java.lang.String str44 = cSVFormat43.toString();
        java.io.Reader reader45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser46 = cSVFormat43.parse(reader45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str35, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\", \r\n\u2028]" + "'", str44, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\", \r\n\u2028]");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test380");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        long long11 = cSVParser7.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser7.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test381");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser8.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser8.getRecords();
        long long14 = cSVParser8.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test382");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        boolean boolean5 = cSVParser3.isClosed();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test383");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteChar((java.lang.Character) 'a');
        cSVFormat9.validate();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray18 = cSVFormat17.getHeader();
        java.lang.String[] strArray25 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray25);
        java.lang.String str27 = cSVFormat16.format((java.lang.Object[]) strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat1.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreSurroundingSpaces(false);
        boolean boolean31 = cSVFormat30.getIgnoreEmptyLines();
        java.lang.String str32 = cSVFormat30.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser33 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + quote5 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote5.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str27, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test384");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        java.lang.String[] strArray18 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeader(strArray18);
        java.lang.String str20 = cSVFormat9.format((java.lang.Object[]) strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withEscape((java.lang.Character) '#');
        cSVFormat9.validate();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat9.withRecordSeparator('a');
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = cSVFormat9.parse(reader26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str20, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test385");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote5 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        java.lang.String[] strArray14 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray14);
        java.lang.String str16 = cSVFormat2.format((java.lang.Object[]) strArray14);
        boolean boolean17 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat2.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withCommentStart('\f');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withIgnoreSurroundingSpaces(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quote5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str16, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test386");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test387");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test388");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        long long8 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test389");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        java.lang.Object obj8 = null;
        boolean boolean9 = cSVFormat5.equals(obj8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withCommentStart((java.lang.Character) '\f');
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat5.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test390");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withQuoteChar('\f');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray22 = cSVFormat21.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withEscape('\"');
        java.lang.String[] strArray32 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat21.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat21.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser36 = org.apache.commons.csv.CSVParser.parse("", cSVFormat21);
        org.apache.commons.csv.Quote quote39 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray47 = cSVFormat46.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withEscape('\"');
        boolean boolean52 = cSVFormat49.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat49.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote60 = cSVFormat57.getQuotePolicy();
        org.apache.commons.csv.Quote quote61 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withQuotePolicy(quote61);
        org.apache.commons.csv.CSVFormat cSVFormat69 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray70 = cSVFormat69.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat69.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat69.withEscape('\"');
        java.lang.String[] strArray80 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat69.withHeader(strArray80);
        org.apache.commons.csv.CSVFormat cSVFormat83 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote61, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray80, false);
        java.lang.String str84 = cSVFormat54.format((java.lang.Object[]) strArray80);
        org.apache.commons.csv.CSVFormat cSVFormat86 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote39, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray80, true);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat21.withHeader(strArray80);
        java.lang.String str88 = cSVFormat15.format((java.lang.Object[]) strArray80);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat9.withHeader(strArray80);
        boolean boolean90 = cSVFormat9.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVParser36);
        org.junit.Assert.assertTrue("'" + quote39 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote39.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNull(strArray47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNull(quote60);
        org.junit.Assert.assertTrue("'" + quote61 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote61.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNull(strArray70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str84, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str88, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test391");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withDelimiter('#');
        java.lang.Character char6 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(true);
        boolean boolean9 = cSVFormat8.isQuoting();
        java.lang.Character char10 = cSVFormat8.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("\205");
        boolean boolean15 = cSVFormat14.isQuoting();
        boolean boolean16 = cSVFormat8.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteChar((java.lang.Character) 'a');
        cSVFormat19.validate();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withRecordSeparator('a');
        boolean boolean25 = cSVFormat19.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser29 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat28);
        boolean boolean30 = cSVFormat19.equals((java.lang.Object) cSVFormat28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote36 = cSVFormat33.getQuotePolicy();
        org.apache.commons.csv.Quote quote37 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withQuotePolicy(quote37);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray46 = cSVFormat45.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat45.withEscape('\"');
        java.lang.String[] strArray56 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat45.withHeader(strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote37, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray56, false);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat28.withHeader(strArray56);
        boolean boolean61 = cSVFormat8.equals((java.lang.Object) strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat8.withQuoteChar('\t');
        java.lang.String str64 = cSVFormat8.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVParser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(quote36);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote37.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false" + "'", str64, "Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test392");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote5 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.Quote quote6 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuotePolicy(quote6);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withEscape('\"');
        java.lang.String[] strArray25 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat14.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote6, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray25, false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withQuoteChar((java.lang.Character) 'a');
        cSVFormat34.validate();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat34.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray50 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat42.withHeader(strArray50);
        java.lang.String str52 = cSVFormat41.format((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat41.withSkipHeaderRecord(false);
        boolean boolean55 = cSVFormat41.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser56 = org.apache.commons.csv.CSVParser.parse("", cSVFormat41);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator57 = cSVParser56.spliterator();
        boolean boolean58 = cSVFormat28.equals((java.lang.Object) cSVParser56);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quote5);
        org.junit.Assert.assertTrue("'" + quote6 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote6.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str52, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(cSVParser56);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test393");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withDelimiter('\b');
        boolean boolean9 = cSVFormat8.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> CommentStart=<#> RecordSeparator=<> SkipHeaderRecord:false", cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test394");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.Lexer lexer4 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader3);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser5.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser5.nextRecord();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser5.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecord6);
        org.junit.Assert.assertNull(cSVRecord7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test395");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        long long9 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test396");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVRecord6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test397");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        boolean boolean15 = cSVFormat4.equals((java.lang.Object) cSVFormat14);
        boolean boolean16 = cSVFormat14.isNullHandling();
        boolean boolean17 = cSVFormat14.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test398");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withNullString("EORECORD []");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test399");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test400");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test401");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.Lexer lexer4 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader3);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart((java.lang.Character) 'a');
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat7.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test402");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        cSVFormat8.validate();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withRecordSeparator('a');
        boolean boolean14 = cSVFormat8.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat17);
        boolean boolean19 = cSVFormat8.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote25 = cSVFormat22.getQuotePolicy();
        org.apache.commons.csv.Quote quote26 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuotePolicy(quote26);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withEscape('\"');
        java.lang.String[] strArray45 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote26, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray45, false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat17.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat2.withHeader(strArray45);
        org.apache.commons.csv.Quote quote51 = cSVFormat50.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withQuoteChar((java.lang.Character) 'a');
        cSVFormat54.validate();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat54.withRecordSeparator('\f');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader58 = null;
        org.apache.commons.csv.Lexer lexer59 = new org.apache.commons.csv.Lexer(cSVFormat54, extendedBufferedReader58);
        boolean boolean60 = cSVFormat50.equals((java.lang.Object) cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(quote25);
        org.junit.Assert.assertTrue("'" + quote26 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote26.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNull(quote51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test403");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.Quote quote11 = cSVFormat4.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withRecordSeparator("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        boolean boolean14 = cSVFormat4.getIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test404");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withQuoteChar('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test405");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote3 = cSVFormat0.getQuotePolicy();
        org.apache.commons.csv.Quote quote4 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuotePolicy(quote4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        cSVFormat8.validate();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray17 = cSVFormat16.getHeader();
        java.lang.String[] strArray24 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat16.withHeader(strArray24);
        java.lang.String str26 = cSVFormat15.format((java.lang.Object[]) strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat0.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withIgnoreSurroundingSpaces(false);
        boolean boolean30 = cSVFormat27.isQuoting();
        java.lang.Character char31 = cSVFormat27.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat27.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat27.withEscape((java.lang.Character) '\b');
        java.io.Reader reader36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser37 = cSVFormat27.parse(reader36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quote3);
        org.junit.Assert.assertTrue("'" + quote4 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote4.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str26, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(char31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test406");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape('4');
        org.apache.commons.csv.Quote quote17 = cSVFormat16.getQuotePolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(quote17);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test407");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        boolean boolean15 = cSVFormat10.getIgnoreEmptyLines();
        java.lang.String str16 = cSVFormat10.toString();
        java.lang.String[] strArray17 = cSVFormat10.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str16, "Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test408");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        cSVFormat16.validate();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('#');
        java.lang.String str22 = cSVFormat19.getRecordSeparator();
        java.lang.Character char23 = cSVFormat19.getEscape();
        boolean boolean24 = cSVFormat10.equals((java.lang.Object) cSVFormat19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withQuoteChar((java.lang.Character) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\f" + "'", str22, "\f");
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test409");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = null;
        org.apache.commons.csv.Lexer lexer8 = new org.apache.commons.csv.Lexer(cSVFormat4, extendedBufferedReader7);
        java.lang.String str9 = cSVFormat4.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test410");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser7.getHeaderMap();
        long long12 = cSVParser7.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test411");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        cSVParser8.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test412");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        boolean boolean7 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test413");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        long long7 = cSVParser3.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test414");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat12);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser13.iterator();
        java.lang.Class<?> wildcardClass15 = cSVParser13.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test415");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        long long8 = cSVParser3.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test416");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test417");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('a');
        boolean boolean10 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.Quote quote21 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withEscape('\"');
        boolean boolean34 = cSVFormat31.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote42 = cSVFormat39.getQuotePolicy();
        org.apache.commons.csv.Quote quote43 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withQuotePolicy(quote43);
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray52 = cSVFormat51.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withEscape('\"');
        java.lang.String[] strArray62 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat51.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote43, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray62, false);
        java.lang.String str66 = cSVFormat36.format((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat68 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote21, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray62, true);
        org.apache.commons.csv.CSVFormat cSVFormat75 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat75.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat75.withIgnoreSurroundingSpaces(true);
        java.lang.Character char80 = cSVFormat79.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat81 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray82 = cSVFormat81.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat81.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat81.withEscape('\"');
        java.lang.String[] strArray92 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat93 = cSVFormat81.withHeader(strArray92);
        java.lang.String str94 = cSVFormat79.format((java.lang.Object[]) strArray92);
        org.apache.commons.csv.CSVFormat cSVFormat96 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '#', quote21, (java.lang.Character) ' ', (java.lang.Character) ',', true, false, "", "", strArray92, false);
        java.lang.String str97 = cSVFormat11.format((java.lang.Object[]) strArray92);
        org.apache.commons.csv.CSVFormat cSVFormat98 = cSVFormat7.withHeader(strArray92);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser99 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + quote21 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote21.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNull(quote42);
        org.junit.Assert.assertTrue("'" + quote43 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote43.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str66, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNull(char80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNull(strArray82);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(cSVFormat93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str94, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str97, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat98);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test418");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withRecordSeparator('4');
        boolean boolean8 = cSVFormat3.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat3.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withCommentStart((java.lang.Character) ',');
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat11.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test419");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        cSVParser7.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test420");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        cSVParser3.close();
        long long9 = cSVParser3.getCurrentLineNumber();
        boolean boolean10 = cSVParser3.isClosed();
        long long11 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test421");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreEmptyLines(false);
        java.lang.Character char14 = cSVFormat13.getQuoteChar();
        char char15 = cSVFormat13.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + ' ' + "'", char15 == ' ');
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test422");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        boolean boolean24 = cSVFormat10.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        long long26 = cSVParser25.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVParser25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test423");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test424");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser8.getHeaderMap();
        long long13 = cSVParser8.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test425");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat12);
        boolean boolean14 = cSVFormat12.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test426");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        long long11 = cSVParser7.getCurrentLineNumber();
        boolean boolean12 = cSVParser7.isClosed();
        java.lang.Class<?> wildcardClass13 = cSVParser7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test427");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        java.lang.String[] strArray19 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withHeader(strArray19);
        java.lang.String str21 = cSVFormat10.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withSkipHeaderRecord(false);
        boolean boolean24 = cSVFormat10.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser25 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator26 = cSVParser25.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator27 = cSVParser25.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str21, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVParser25);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator26);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator27);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test428");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withEscape('\"');
        cSVFormat2.validate();
        java.lang.String[] strArray9 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteChar((java.lang.Character) 'a');
        cSVFormat12.validate();
        boolean boolean14 = cSVFormat12.isEscaping();
        java.lang.String str15 = cSVFormat12.getNullString();
        java.lang.String str16 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withCommentStart((java.lang.Character) '\f');
        boolean boolean19 = cSVFormat12.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote22 = org.apache.commons.csv.Quote.MINIMAL;
        java.lang.String[] strArray29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\"', quote22, (java.lang.Character) 'a', (java.lang.Character) ' ', false, false, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", "\u2029", strArray29, false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat12.withQuotePolicy(quote22);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat2.withQuotePolicy(quote22);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        cSVFormat42.validate();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withQuoteChar((java.lang.Character) 'a');
        cSVFormat48.validate();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withRecordSeparator('a');
        boolean boolean54 = cSVFormat48.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser58 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat57);
        boolean boolean59 = cSVFormat48.equals((java.lang.Object) cSVFormat57);
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote65 = cSVFormat62.getQuotePolicy();
        org.apache.commons.csv.Quote quote66 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat62.withQuotePolicy(quote66);
        org.apache.commons.csv.CSVFormat cSVFormat74 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray75 = cSVFormat74.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat74.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat74.withEscape('\"');
        java.lang.String[] strArray85 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat74.withHeader(strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat88 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote66, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray85, false);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat57.withHeader(strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat42.withHeader(strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat92 = new org.apache.commons.csv.CSVFormat('\"', (java.lang.Character) '\t', quote22, (java.lang.Character) '\r', (java.lang.Character) '\\', true, false, "COMMENT []", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true", strArray85, false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str16, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + quote22 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote22.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVParser58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNull(quote65);
        org.junit.Assert.assertTrue("'" + quote66 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote66.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNull(strArray75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVFormat90);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test429");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withEscape((java.lang.Character) ' ');
        java.lang.Character char8 = cSVFormat7.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withRecordSeparator('\\');
        org.apache.commons.csv.Quote quote11 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuoteChar((java.lang.Character) ',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quote11 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote11.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test430");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote12 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuotePolicy(quote12);
        java.lang.String str14 = cSVFormat13.getNullString();
        boolean boolean15 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withDelimiter(' ');
        cSVFormat13.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + quote12 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote12.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test431");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteChar((java.lang.Character) 'a');
        cSVFormat6.validate();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        java.lang.String[] strArray22 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeader(strArray22);
        java.lang.String str24 = cSVFormat13.format((java.lang.Object[]) strArray22);
        cSVFormat13.validate();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat13.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray33 = cSVFormat32.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote42 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withQuotePolicy(quote42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat28.withQuotePolicy(quote42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat13.withQuotePolicy(quote42);
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray53 = cSVFormat52.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withEscape('\"');
        boolean boolean58 = cSVFormat55.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray62 = cSVFormat61.getHeader();
        java.lang.String[] strArray69 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat61.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat55.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat73.withCommentStart((java.lang.Character) '\\');
        java.lang.Character char76 = cSVFormat73.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat77 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray78 = cSVFormat77.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat77.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat77.withEscape('\"');
        java.lang.String[] strArray88 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat77.withHeader(strArray88);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat73.withHeader(strArray88);
        org.apache.commons.csv.CSVFormat cSVFormat92 = new org.apache.commons.csv.CSVFormat('#', (java.lang.Character) ' ', quote42, (java.lang.Character) '4', (java.lang.Character) '\r', false, true, "", "", strArray88, true);
        java.lang.String[] strArray93 = cSVFormat92.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser94 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str24, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + quote42 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote42.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNull(char76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVFormat90);
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test432");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test433");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteChar((java.lang.Character) 'a');
        cSVFormat5.validate();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withEscape((java.lang.Character) 'a');
        boolean boolean13 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVParser14);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test434");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        java.lang.Class<?> wildcardClass10 = cSVRecordItor9.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test435");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withDelimiter(',');
        boolean boolean12 = cSVFormat11.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test436");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        boolean boolean7 = cSVParser3.isClosed();
        long long8 = cSVParser3.getCurrentLineNumber();
        boolean boolean9 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test437");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        boolean boolean10 = cSVFormat9.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test438");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withNullString("\u2028");
        java.lang.Character char4 = cSVFormat3.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray14 = cSVFormat13.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote23 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withQuotePolicy(quote23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat9.withQuotePolicy(quote23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat3.withQuotePolicy(quote23);
        boolean boolean27 = cSVFormat26.getIgnoreEmptyLines();
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser29 = cSVFormat26.parse(reader28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + quote23 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote23.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test439");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser8.spliterator();
        long long13 = cSVParser8.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser8.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator15 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator15);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test440");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser3.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser3.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test441");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        boolean boolean7 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("4", cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test442");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(false);
        java.lang.String str15 = cSVFormat12.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test443");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withNullString("EOF []");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test444");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test445");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        long long10 = cSVParser9.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser9.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser9.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser9.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser9.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cSVParser9.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test446");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        java.lang.Character char13 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test447");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote11 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteChar((java.lang.Character) '\f');
        java.lang.String str15 = cSVFormat12.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quote11 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote11.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<,> QuoteChar=<\"> CommentStart=<#> RecordSeparator=<> SkipHeaderRecord:false" + "'", str15, "Delimiter=<,> QuoteChar=<\"> CommentStart=<#> RecordSeparator=<> SkipHeaderRecord:false");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test448");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test449");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser5.iterator();
        boolean boolean7 = cSVParser5.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test450");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean7 = cSVFormat2.isCommentingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test451");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        java.lang.Character char7 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreEmptyLines(true);
        boolean boolean10 = cSVFormat9.isQuoting();
        java.lang.Character char11 = cSVFormat9.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator("\205");
        boolean boolean16 = cSVFormat15.isQuoting();
        boolean boolean17 = cSVFormat9.equals((java.lang.Object) cSVFormat15);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("", cSVFormat15);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser18.getRecords();
        long long20 = cSVParser18.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(cSVRecordList19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test452");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        boolean boolean11 = cSVFormat4.isNullHandling();
        cSVFormat4.validate();
        java.lang.String str13 = cSVFormat4.getRecordSeparator();
        char char14 = cSVFormat4.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test453");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        boolean boolean6 = cSVFormat5.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String str9 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.Character char11 = cSVFormat5.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreSurroundingSpaces(true);
        boolean boolean16 = cSVFormat5.equals((java.lang.Object) cSVFormat15);
        org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse("", cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVParser17);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test454");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        cSVParser7.close();
        boolean boolean10 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test455");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser8.iterator();
        long long13 = cSVParser8.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test456");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        cSVFormat16.validate();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('#');
        java.lang.String str22 = cSVFormat19.getRecordSeparator();
        java.lang.Character char23 = cSVFormat19.getEscape();
        boolean boolean24 = cSVFormat10.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteChar((java.lang.Character) 'a');
        cSVFormat27.validate();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote35 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withEscape('\"');
        boolean boolean48 = cSVFormat45.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat45.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote56 = cSVFormat53.getQuotePolicy();
        org.apache.commons.csv.Quote quote57 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat53.withQuotePolicy(quote57);
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray66 = cSVFormat65.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat65.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat65.withEscape('\"');
        java.lang.String[] strArray76 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat65.withHeader(strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat79 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote57, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray76, false);
        java.lang.String str80 = cSVFormat50.format((java.lang.Object[]) strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat82 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote35, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray76, true);
        java.lang.String[] strArray89 = null;
        org.apache.commons.csv.CSVFormat cSVFormat91 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) 'a', quote35, (java.lang.Character) '\\', (java.lang.Character) 'a', false, false, "\u2028", "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", strArray89, false);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat27.withQuotePolicy(quote35);
        org.apache.commons.csv.CSVFormat cSVFormat93 = cSVFormat10.withQuotePolicy(quote35);
        org.apache.commons.csv.CSVFormat cSVFormat95 = cSVFormat93.withIgnoreEmptyLines(false);
        boolean boolean96 = cSVFormat95.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\f" + "'", str22, "\f");
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + quote35 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote35.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNull(quote56);
        org.junit.Assert.assertTrue("'" + quote57 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote57.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str80, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat92);
        org.junit.Assert.assertNotNull(cSVFormat93);
        org.junit.Assert.assertNotNull(cSVFormat95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test457");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser8.spliterator();
        long long13 = cSVParser8.getRecordNumber();
        long long14 = cSVParser8.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test458");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test459");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        boolean boolean4 = cSVFormat2.isNullHandling();
        cSVFormat2.validate();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test460");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        boolean boolean9 = cSVParser3.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test461");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser8.getHeaderMap();
        boolean boolean11 = cSVParser8.isClosed();
        long long12 = cSVParser8.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList13);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test462");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser8.spliterator();
        long long11 = cSVParser8.getCurrentLineNumber();
        long long12 = cSVParser8.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test463");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test464");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getCurrentLineNumber();
        cSVParser7.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser7.spliterator();
        boolean boolean13 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test465");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withDelimiter('\"');
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.String str7 = cSVFormat6.getNullString();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("a\fa,\205,hi!,hi!,aaa\205aa,aa\r\naa,aa\r\naa,\205,\205,aa\r\naaa", cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str8, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test466");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null", cSVFormat4);
        cSVParser5.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser5.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser5.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test467");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart(',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test468");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        boolean boolean11 = cSVFormat4.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withEscape('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test469");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser8.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser8.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test470");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser8.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser8.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test471");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        cSVParser3.close();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test472");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('\b');
        java.lang.Character char10 = cSVFormat7.getCommentStart();
        java.lang.String str11 = cSVFormat7.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withNullString("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test473");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withDelimiter('\"');
        java.lang.String str4 = cSVFormat1.getNullString();
        char char5 = cSVFormat1.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test474");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        cSVFormat16.validate();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('#');
        java.lang.String str22 = cSVFormat19.getRecordSeparator();
        java.lang.Character char23 = cSVFormat19.getEscape();
        boolean boolean24 = cSVFormat10.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withQuoteChar('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\f" + "'", str22, "\f");
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test475");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote3 = cSVFormat0.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String[] strArray12 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withHeader(strArray12);
        java.lang.String str14 = cSVFormat0.format((java.lang.Object[]) strArray12);
        boolean boolean15 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteChar((java.lang.Character) ',');
        boolean boolean20 = cSVFormat19.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char24 = cSVFormat23.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withQuoteChar('\"');
        java.lang.Character char27 = cSVFormat26.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat26);
        org.apache.commons.csv.CSVRecord cSVRecord29 = cSVParser28.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList30 = cSVParser28.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord31 = cSVParser28.nextRecord();
        cSVParser28.close();
        boolean boolean33 = cSVFormat19.equals((java.lang.Object) cSVParser28);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(quote3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str14, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(char24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(char27);
        org.junit.Assert.assertNotNull(cSVParser28);
        org.junit.Assert.assertNotNull(cSVRecord29);
        org.junit.Assert.assertNotNull(cSVRecordList30);
        org.junit.Assert.assertNull(cSVRecord31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test476");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("");
        java.lang.String str12 = cSVFormat9.toString();
        org.apache.commons.csv.Token token13 = new org.apache.commons.csv.Token();
        java.lang.StringBuilder stringBuilder14 = token13.content;
        org.apache.commons.csv.Token.Type type15 = org.apache.commons.csv.Token.Type.COMMENT;
        token13.type = type15;
        boolean boolean17 = cSVFormat9.equals((java.lang.Object) type15);
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = cSVFormat9.parse(reader18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str12, "Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.commons.csv.Token.Type.COMMENT + "'", type15.equals(org.apache.commons.csv.Token.Type.COMMENT));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test477");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        java.lang.String[] strArray10 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat2.withNullString("Delimiter=<\b> SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test478");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        java.lang.String str8 = cSVFormat6.getRecordSeparator();
        boolean boolean9 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteChar(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\r\n" + "'", str8, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test479");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null", cSVFormat4);
        cSVParser5.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser5.spliterator();
        boolean boolean8 = cSVParser5.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test480");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.Character char10 = cSVFormat4.getEscape();
        char char11 = cSVFormat4.getDelimiter();
        boolean boolean12 = cSVFormat4.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test481");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withDelimiter('#');
        boolean boolean10 = cSVFormat5.getSkipHeaderRecord();
        boolean boolean12 = cSVFormat5.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat5.withNullString("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.apache.commons.csv.Quote quote18 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteChar((java.lang.Character) 'a');
        cSVFormat27.validate();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat27.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray36 = cSVFormat35.getHeader();
        java.lang.String[] strArray43 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat35.withHeader(strArray43);
        java.lang.String str45 = cSVFormat34.format((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat47 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) ' ', quote18, (java.lang.Character) '\f', (java.lang.Character) '\b', true, true, "\205", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", strArray43, true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat5.withQuotePolicy(quote18);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat1.withQuotePolicy(quote18);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + quote18 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote18.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str45, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test482");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        boolean boolean11 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withNullString("\205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test483");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        boolean boolean9 = cSVParser8.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test484");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        boolean boolean10 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test485");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentStart((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean7 = cSVParser6.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser6.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordList8);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test486");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar((java.lang.Character) ',');
        java.lang.Character char21 = cSVFormat18.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > CommentStart=<\t> SkipHeaderRecord:false", cSVFormat18);
        boolean boolean23 = cSVParser22.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor24 = cSVParser22.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = cSVParser22.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor24);
        org.junit.Assert.assertNull(strMap25);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test487");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        boolean boolean6 = cSVFormat5.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String str9 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withQuoteChar('\"');
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat11);
        long long20 = cSVParser19.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test488");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote5 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.Quote quote6 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuotePolicy(quote6);
        java.lang.String[] strArray14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = new org.apache.commons.csv.CSVFormat('\"', (java.lang.Character) '4', quote6, (java.lang.Character) '4', (java.lang.Character) ' ', true, false, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", "\u2029", strArray14, true);
        boolean boolean17 = cSVFormat16.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray20 = cSVFormat19.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withEscape('\"');
        java.lang.String[] strArray30 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat19.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat19.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser34 = org.apache.commons.csv.CSVParser.parse("", cSVFormat19);
        org.apache.commons.csv.Quote quote37 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray45 = cSVFormat44.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('\"');
        boolean boolean50 = cSVFormat47.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote58 = cSVFormat55.getQuotePolicy();
        org.apache.commons.csv.Quote quote59 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withQuotePolicy(quote59);
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray68 = cSVFormat67.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat67.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat67.withEscape('\"');
        java.lang.String[] strArray78 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat67.withHeader(strArray78);
        org.apache.commons.csv.CSVFormat cSVFormat81 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote59, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray78, false);
        java.lang.String str82 = cSVFormat52.format((java.lang.Object[]) strArray78);
        org.apache.commons.csv.CSVFormat cSVFormat84 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote37, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray78, true);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat19.withHeader(strArray78);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat16.withHeader(strArray78);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat86.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quote5);
        org.junit.Assert.assertTrue("'" + quote6 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote6.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVParser34);
        org.junit.Assert.assertTrue("'" + quote37 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote37.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNull(quote58);
        org.junit.Assert.assertTrue("'" + quote59 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote59.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNull(strArray68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str82, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(cSVFormat88);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test489");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        long long8 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test490");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuoteChar('\t');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test491");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser8.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test492");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser10.close();
        boolean boolean12 = cSVParser10.isClosed();
        boolean boolean13 = cSVParser10.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test493");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test494");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        java.lang.String[] strArray13 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(strArray13);
        java.lang.String str15 = cSVFormat1.format((java.lang.Object[]) strArray13);
        boolean boolean16 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar((java.lang.Character) ',');
        java.lang.Character char21 = cSVFormat18.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > CommentStart=<\t> SkipHeaderRecord:false", cSVFormat18);
        cSVParser22.close();
        boolean boolean24 = cSVParser22.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList25 = cSVParser22.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str15, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test495");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        java.lang.String[] strArray20 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray20);
        java.lang.String str22 = cSVFormat11.format((java.lang.Object[]) strArray20);
        cSVFormat11.validate();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat11.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray27 = cSVFormat26.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray31 = cSVFormat30.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote40 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withQuotePolicy(quote40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat26.withQuotePolicy(quote40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat11.withQuotePolicy(quote40);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray51 = cSVFormat50.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat50.withEscape('\"');
        java.lang.String[] strArray61 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat50.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = new org.apache.commons.csv.CSVFormat('\t', (java.lang.Character) '\"', quote40, (java.lang.Character) '#', (java.lang.Character) ' ', false, true, "4", "4", strArray61, false);
        java.io.Reader reader65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser66 = cSVFormat64.parse(reader65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str22, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + quote40 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote40.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(cSVFormat62);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test496");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentStart((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean7 = cSVParser6.isClosed();
        long long8 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test497");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote13 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(quote13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test498");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        long long10 = cSVParser7.getCurrentLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test499");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser8.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor13 = cSVParser8.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertNotNull(cSVRecordItor13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test500");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser8.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser8.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertNotNull(cSVRecordList13);
    }
}
