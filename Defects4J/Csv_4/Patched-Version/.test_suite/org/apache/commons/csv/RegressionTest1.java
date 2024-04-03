package org.apache.commons.csv;

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
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.Lexer lexer4 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader3);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", cSVFormat2);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser5.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser5.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser8.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser8.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser8.getHeaderMap();
        long long13 = cSVParser8.getRecordNumber();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser8, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser23 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat20);
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
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        java.lang.String str7 = cSVFormat4.toString();
        org.apache.commons.csv.Quote quote8 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuotePolicy(quote8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str7, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quote8 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote8.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = cSVParser25.getHeaderMap();
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
        org.junit.Assert.assertNull(strMap26);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
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
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withNullString("\205");
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withRecordSeparator("");
        boolean boolean13 = cSVFormat12.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withEscape((java.lang.Character) 'a');
        java.lang.String str16 = cSVFormat12.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat18);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withSkipHeaderRecord(true);
        boolean boolean24 = cSVFormat1.equals((java.lang.Object) cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVParser21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        boolean boolean9 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat3);
        cSVParser12.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withCommentStart('\t');
        java.io.Reader reader33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser34 = cSVFormat27.parse(reader33);
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
        org.junit.Assert.assertNotNull(cSVFormat32);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        cSVParser8.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        boolean boolean9 = cSVParser7.isClosed();
        cSVParser7.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        long long5 = cSVParser3.getRecordNumber();
        long long6 = cSVParser3.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        cSVParser3.close();
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        java.lang.String str7 = cSVFormat4.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator("\f");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withCommentStart(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str7, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        java.lang.String str44 = cSVFormat43.getNullString();
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
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        long long11 = cSVParser7.getCurrentLineNumber();
        long long12 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        long long7 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> CommentStart=<,> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat17);
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
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter('\"');
        java.lang.String str3 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        char char6 = cSVFormat0.getDelimiter();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat0.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ',' + "'", char6 == ',');
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        cSVParser8.close();
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
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withEscape((java.lang.Character) ' ');
        java.lang.Character char7 = cSVFormat6.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator('\\');
        org.apache.commons.csv.Quote quote10 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuotePolicy(quote10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\u2028> RecordSeparator=<Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\", \r\n\u2028]> SkipHeaderRecord:false", cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The escape character and the delimiter cannot be the same (' ')");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + quote10 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote10.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor28 = cSVParser25.iterator();
        long long29 = cSVParser25.getRecordNumber();
        long long30 = cSVParser25.getCurrentLineNumber();
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
        org.junit.Assert.assertNotNull(cSVRecordItor28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        boolean boolean10 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        long long15 = cSVParser8.getCurrentLineNumber();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        boolean boolean4 = cSVFormat3.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String str7 = cSVFormat3.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.Quote quote10 = cSVFormat3.getQuotePolicy();
        org.apache.commons.csv.Quote quote13 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray21 = cSVFormat20.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape('\"');
        boolean boolean26 = cSVFormat23.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote34 = cSVFormat31.getQuotePolicy();
        org.apache.commons.csv.Quote quote35 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withQuotePolicy(quote35);
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray44 = cSVFormat43.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat43.withEscape('\"');
        java.lang.String[] strArray54 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat43.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote35, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray54, false);
        java.lang.String str58 = cSVFormat28.format((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat60 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote13, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray54, true);
        java.lang.String str61 = cSVFormat3.format((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat3.withRecordSeparator("#\205#,#\r\n#,#\r\n#,\205,\205,#\r\n#");
        boolean boolean64 = cSVFormat63.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat63.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat63.withSkipHeaderRecord(false);
        java.io.Reader reader69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser70 = cSVFormat63.parse(reader69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quote10);
        org.junit.Assert.assertTrue("'" + quote13 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote13.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(quote34);
        org.junit.Assert.assertTrue("'" + quote35 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote35.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str58, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str61, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        boolean boolean10 = cSVParser7.isClosed();
        boolean boolean11 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '\t');
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", cSVFormat3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentStart((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote5 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.Quote quote6 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuotePolicy(quote6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar((java.lang.Character) 'a');
        cSVFormat10.validate();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray19 = cSVFormat18.getHeader();
        java.lang.String[] strArray26 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat18.withHeader(strArray26);
        java.lang.String str28 = cSVFormat17.format((java.lang.Object[]) strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat2.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withIgnoreSurroundingSpaces(false);
        boolean boolean32 = cSVFormat29.isQuoting();
        java.lang.Character char33 = cSVFormat29.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat29.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat29.withEscape((java.lang.Character) '\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser38 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quote5);
        org.junit.Assert.assertTrue("'" + quote6 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote6.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str28, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(char33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withDelimiter('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat12);
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
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser3.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(cSVRecord8);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar((java.lang.Character) 'a');
        cSVFormat15.validate();
        boolean boolean17 = cSVFormat15.isEscaping();
        java.lang.String str18 = cSVFormat15.getNullString();
        java.lang.String str19 = cSVFormat15.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat15.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray23 = cSVFormat22.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray27 = cSVFormat26.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote36 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withQuotePolicy(quote36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat22.withQuotePolicy(quote36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat15.withQuotePolicy(quote36);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat4.withQuotePolicy(quote36);
        java.lang.String str41 = cSVFormat40.toString();
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
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str19, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + quote36 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote36.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false" + "'", str41, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        cSVParser7.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        java.lang.String str6 = cSVFormat3.getNullString();
        java.lang.String str7 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withCommentStart((java.lang.Character) '\f');
        boolean boolean10 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withQuoteChar('#');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat3);
        cSVParser13.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser3.iterator();
        boolean boolean9 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser11.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser11.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNotNull(cSVRecord13);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        boolean boolean7 = cSVParser3.isClosed();
        cSVParser3.close();
        long long9 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        org.apache.commons.csv.CSVRecord cSVRecord14 = cSVParser8.nextRecord();
        boolean boolean15 = cSVParser8.isClosed();
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
        org.junit.Assert.assertNull(cSVRecord14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser11.getHeaderMap();
        long long13 = cSVParser11.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = cSVParser22.getHeaderMap();
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
        org.junit.Assert.assertNull(strMap24);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withNullString("\u2028");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withEscape((java.lang.Character) 'a');
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = cSVFormat9.parse(reader14);
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
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("\"\"\"\205\"\",\"\"\r\n\"\",\"\"\r\n\"\",\205,\205,\"\"\r\n\"\"\",\"\r\n\",\"\u2028\"");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        long long8 = cSVParser3.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser3.spliterator();
        cSVParser3.close();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader5 = null;
        org.apache.commons.csv.Lexer lexer6 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuoteChar('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        boolean boolean7 = cSVParser3.isClosed();
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = cSVParser25.getHeaderMap();
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
        org.junit.Assert.assertNull(strMap27);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        long long8 = cSVParser3.getRecordNumber();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        java.lang.String str13 = cSVFormat10.toString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withRecordSeparator("a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator('4');
        java.lang.String str20 = cSVFormat19.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse("4", cSVFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The quoteChar character and the delimiter cannot be the same ('\"')");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false" + "'", str13, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat4);
        java.lang.String str10 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\f, \205, hi!, hi!, a\205a,a\r\na,a\r\na,\205,\205,a\r\na]");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        cSVParser8.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser8.nextRecord();
        long long13 = cSVParser8.getCurrentLineNumber();
        long long14 = cSVParser8.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cSVParser8.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        long long8 = cSVParser3.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser3.getHeaderMap();
        long long10 = cSVParser3.getCurrentLineNumber();
        boolean boolean11 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat63, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\", \r\n\u2028]");
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
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('#');
        cSVFormat3.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        long long8 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('a');
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat8);
        long long10 = cSVParser9.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator16 = cSVParser9.spliterator();
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
        org.junit.Assert.assertNotNull(cSVRecordSpliterator16);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote11 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuotePolicy(quote11);
        java.lang.String str13 = cSVFormat12.getNullString();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator(',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser23 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat16);
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        boolean boolean6 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar((java.lang.Character) 'a');
        cSVFormat11.validate();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withRecordSeparator('a');
        boolean boolean17 = cSVFormat11.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote21 = cSVFormat18.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray23 = cSVFormat22.getHeader();
        java.lang.String[] strArray30 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat22.withHeader(strArray30);
        java.lang.String str32 = cSVFormat18.format((java.lang.Object[]) strArray30);
        boolean boolean33 = cSVFormat11.equals((java.lang.Object) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat1.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser37 = org.apache.commons.csv.CSVParser.parse("a\fa,\205,hi!,hi!,aaa\205aa,aa\r\naa,aa\r\naa,\205,\205,aa\r\naaa", cSVFormat36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The header contains duplicate names: [?, ??, ??, ?, ?, ??]");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(quote21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"" + "'", str32, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser7.iterator();
        long long12 = cSVParser7.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat9.withIgnoreEmptyLines(false);
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
        org.junit.Assert.assertNotNull(cSVFormat91);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat9);
        java.lang.String[] strArray12 = cSVFormat9.getHeader();
        java.lang.Character char13 = cSVFormat9.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cSVParser18.getHeaderMap();
        cSVParser18.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser18.spliterator();
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
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator22);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("#\205#,#\r\n#,#\r\n#,\205,\205,#\r\n#");
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
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat9.withQuotePolicy(quote22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser34 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<4> RecordSeparator=<> SkipHeaderRecord:false", cSVFormat33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
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
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
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
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar((java.lang.Character) '\f');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat9);
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
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        long long11 = cSVParser8.getCurrentLineNumber();
        boolean boolean12 = cSVParser8.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat5);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser9.nextRecord();
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
        org.junit.Assert.assertNull(cSVRecord13);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        org.apache.commons.csv.CSVRecord cSVRecord14 = cSVParser7.nextRecord();
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
        org.junit.Assert.assertNull(cSVRecord14);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote24 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withQuotePolicy(quote24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withNullString("Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withEscape('a');
        boolean boolean38 = cSVFormat35.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withQuoteChar((java.lang.Character) 'a');
        cSVFormat43.validate();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat43.withQuoteChar((java.lang.Character) '#');
        boolean boolean49 = cSVFormat43.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat43.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat43.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat43.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuoteChar((java.lang.Character) 'a');
        cSVFormat58.validate();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat58.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat58.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray67 = cSVFormat66.getHeader();
        java.lang.String[] strArray74 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat66.withHeader(strArray74);
        java.lang.String str76 = cSVFormat65.format((java.lang.Object[]) strArray74);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat65.withSkipHeaderRecord(false);
        java.lang.String[] strArray82 = new java.lang.String[] { "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"", "\r\n", "\u2028" };
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat65.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat43.withHeader(strArray82);
        java.lang.String str85 = cSVFormat35.format((java.lang.Object[]) strArray82);
        java.lang.String str86 = cSVFormat29.format((java.lang.Object[]) strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat13.withHeader(strArray82);
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
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quote24 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote24.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNull(strArray67);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str76, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertNotNull(cSVFormat84);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null" + "'", str85, "\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"#\r\n\u2028null");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\"\"\"\205\"\",\"\"\r\n\"\",\"\"\r\n\"\",\205,\205,\"\"\r\n\"\"\",\"\r\n\",\"\u2028\"" + "'", str86, "\"\"\"\205\"\",\"\"\r\n\"\",\"\"\r\n\"\",\205,\205,\"\"\r\n\"\"\",\"\r\n\",\"\u2028\"");
        org.junit.Assert.assertNotNull(cSVFormat87);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator96 = cSVParser95.spliterator();
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
        org.junit.Assert.assertNotNull(cSVRecordSpliterator96);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteChar((java.lang.Character) 'a');
        cSVFormat4.validate();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat4.withIgnoreEmptyLines(true);
        boolean boolean16 = cSVFormat15.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withQuoteChar('\b');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat15);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        long long5 = cSVParser3.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat11.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = null;
        org.apache.commons.csv.Lexer lexer27 = new org.apache.commons.csv.Lexer(cSVFormat25, extendedBufferedReader26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withQuoteChar('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser30 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat29);
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
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        boolean boolean7 = cSVParser3.isClosed();
        long long8 = cSVParser3.getCurrentLineNumber();
        boolean boolean9 = cSVParser3.isClosed();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        long long8 = cSVParser3.getRecordNumber();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\f> QuoteChar=<a> CommentStart=<#> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'format' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        boolean boolean3 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", cSVFormat5);
        java.lang.String str7 = cSVFormat5.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\n" + "'", str2, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        long long5 = cSVParser3.getRecordNumber();
        long long6 = cSVParser3.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord7);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.NONE;
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
        org.apache.commons.csv.CSVFormat cSVFormat72 = new org.apache.commons.csv.CSVFormat(' ', (java.lang.Character) '4', quote2, (java.lang.Character) '\\', (java.lang.Character) '4', true, true, "Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", strArray65, true);
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.NONE + "'", quote2.equals(org.apache.commons.csv.Quote.NONE));
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
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentStart((java.lang.Character) 'a');
        java.lang.String str13 = cSVFormat12.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat12);
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.Quote quote19 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuoteChar((java.lang.Character) 'a');
        cSVFormat28.validate();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat28.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        java.lang.String[] strArray44 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat36.withHeader(strArray44);
        java.lang.String str46 = cSVFormat35.format((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) ' ', quote19, (java.lang.Character) '\f', (java.lang.Character) '\b', true, true, "\205", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", strArray44, true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat1.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat1.withCommentStart(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser52 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
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
        org.junit.Assert.assertTrue("'" + quote19 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote19.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str46, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withRecordSeparator('\n');
        java.io.Reader reader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser31 = cSVFormat23.parse(reader30);
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
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.Lexer lexer4 = new org.apache.commons.csv.Lexer(cSVFormat2, extendedBufferedReader3);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray25 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote38 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withQuotePolicy(quote38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat24.withQuotePolicy(quote38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat9.withQuotePolicy(quote38);
        java.io.Reader reader42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser43 = cSVFormat9.parse(reader42);
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
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + quote38 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote38.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        cSVParser3.close();
        boolean boolean7 = cSVParser3.isClosed();
        long long8 = cSVParser3.getCurrentLineNumber();
        boolean boolean9 = cSVParser3.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        boolean boolean5 = cSVFormat3.isEscaping();
        java.lang.String str6 = cSVFormat3.getNullString();
        java.lang.String str7 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("INVALID []", cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        char char93 = cSVFormat92.getDelimiter();
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
        org.junit.Assert.assertTrue("'" + char93 + "' != '" + '\"' + "'", char93 == '\"');
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat18.withQuoteChar('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar cannot be a line break");
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
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertNotNull(cSVParser22);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat7.withQuoteChar((java.lang.Character) '\f');
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
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        java.lang.Character char46 = cSVFormat11.getQuoteChar();
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
        org.junit.Assert.assertNull(char46);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        cSVParser95.close();
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
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat12);
        boolean boolean14 = cSVFormat12.isCommentingEnabled();
        boolean boolean15 = cSVFormat12.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
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
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('\b');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar('\"');
        java.lang.String str6 = cSVFormat2.toString();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat2);
        boolean boolean8 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withRecordSeparator('a');
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\b> SkipHeaderRecord:false" + "'", str6, "Delimiter=<\b> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('a');
        boolean boolean10 = cSVFormat7.getIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withRecordSeparator('a');
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
        org.junit.Assert.assertNotNull(cSVFormat51);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        java.lang.String[] strArray8 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote12 = cSVFormat0.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('\\');
        java.io.Reader reader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser20 = cSVFormat18.parse(reader19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser8.getHeaderMap();
        boolean boolean11 = cSVParser8.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser8.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser8.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
        org.junit.Assert.assertNotNull(cSVRecord13);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.Lexer lexer7 = new org.apache.commons.csv.Lexer(cSVFormat3, extendedBufferedReader6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withCommentStart((java.lang.Character) 'a');
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter(' ');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isNullHandling();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote11 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuotePolicy(quote11);
        java.lang.String str13 = cSVFormat12.getNullString();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withDelimiter(' ');
        cSVFormat12.validate();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat12.withNullString("\"\205\",\"\r\n\",\"\r\n\",\"\205\",\"\205\",\"\r\n\"");
        org.apache.commons.csv.CSVParser cSVParser20 = org.apache.commons.csv.CSVParser.parse("#\205#hi!#hi!#a\205a,a\r\na,a\r\na,\205,\205,a\r\nanull", cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quote11 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote11.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVParser20);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
        boolean boolean11 = cSVParser7.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        boolean boolean7 = cSVFormat2.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat2.equals((java.lang.Object) 0);
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withNullString("\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\"");
        boolean boolean13 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
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
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser8.iterator();
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
        org.junit.Assert.assertNotNull(cSVRecordItor14);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        long long8 = cSVParser3.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser3.getHeaderMap();
        long long10 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        long long14 = cSVParser8.getRecordNumber();
        cSVParser8.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser8.getRecords();
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
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote6 = cSVFormat3.getQuotePolicy();
        org.apache.commons.csv.Quote quote7 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuotePolicy(quote7);
        java.lang.String[] strArray15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('\"', (java.lang.Character) '4', quote7, (java.lang.Character) '4', (java.lang.Character) ' ', true, false, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", "\u2029", strArray15, true);
        boolean boolean18 = cSVFormat17.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray21 = cSVFormat20.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withEscape('\"');
        java.lang.String[] strArray31 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat20.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat20.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser35 = org.apache.commons.csv.CSVParser.parse("", cSVFormat20);
        org.apache.commons.csv.Quote quote38 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray46 = cSVFormat45.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withEscape('\"');
        boolean boolean51 = cSVFormat48.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote59 = cSVFormat56.getQuotePolicy();
        org.apache.commons.csv.Quote quote60 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withQuotePolicy(quote60);
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray69 = cSVFormat68.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat68.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat68.withEscape('\"');
        java.lang.String[] strArray79 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat68.withHeader(strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat82 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote60, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray79, false);
        java.lang.String str83 = cSVFormat53.format((java.lang.Object[]) strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat85 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) ',', quote38, (java.lang.Character) 'a', (java.lang.Character) 'a', true, true, "\u2028", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false", strArray79, true);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat20.withHeader(strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat17.withHeader(strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat87.withDelimiter('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser90 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'file' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quote6);
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote7.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVParser35);
        org.junit.Assert.assertTrue("'" + quote38 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote38.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNull(quote59);
        org.junit.Assert.assertTrue("'" + quote60 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote60.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNull(strArray69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str83, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(cSVFormat87);
        org.junit.Assert.assertNotNull(cSVFormat89);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        boolean boolean10 = cSVParser7.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        long long8 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
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
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        cSVParser3.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
        java.lang.String str44 = cSVFormat11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser45 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat11);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str44, "Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        boolean boolean7 = cSVParser3.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        cSVParser7.close();
        boolean boolean9 = cSVParser7.isClosed();
        cSVParser7.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser7.iterator();
        boolean boolean12 = cSVParser7.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) '\f');
        boolean boolean11 = cSVFormat8.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote24 = org.apache.commons.csv.Quote.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withQuotePolicy(quote24);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray33 = cSVFormat32.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withEscape('\"');
        boolean boolean38 = cSVFormat35.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withNullString("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote46 = cSVFormat43.getQuotePolicy();
        org.apache.commons.csv.Quote quote47 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat43.withQuotePolicy(quote47);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray56 = cSVFormat55.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat55.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withEscape('\"');
        java.lang.String[] strArray66 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat55.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) '\f', quote47, (java.lang.Character) 'a', (java.lang.Character) '\\', true, true, "\205", "\r\n", strArray66, false);
        java.lang.String str70 = cSVFormat40.format((java.lang.Object[]) strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat72 = new org.apache.commons.csv.CSVFormat('a', (java.lang.Character) '\"', quote24, (java.lang.Character) '#', (java.lang.Character) '#', false, false, "\r\n", "\f", strArray66, false);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat8.withHeader(strArray66);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser74 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat73);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quote24 + "' != '" + org.apache.commons.csv.Quote.NON_NUMERIC + "'", quote24.equals(org.apache.commons.csv.Quote.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNull(quote46);
        org.junit.Assert.assertTrue("'" + quote47 + "' != '" + org.apache.commons.csv.Quote.ALL + "'", quote47.equals(org.apache.commons.csv.Quote.ALL));
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"" + "'", str70, "\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"");
        org.junit.Assert.assertNotNull(cSVFormat73);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean6 = cSVParser3.isClosed();
        cSVParser3.close();
        cSVParser3.close();
        cSVParser3.close();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        boolean boolean7 = cSVParser3.isClosed();
        boolean boolean8 = cSVParser3.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('a');
        boolean boolean9 = cSVFormat6.getIgnoreEmptyLines();
        org.apache.commons.csv.Quote quote12 = org.apache.commons.csv.Quote.MINIMAL;
        java.lang.String[] strArray19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = new org.apache.commons.csv.CSVFormat(',', (java.lang.Character) '\"', quote12, (java.lang.Character) 'a', (java.lang.Character) ' ', false, false, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", "\u2029", strArray19, false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat6.withQuotePolicy(quote12);
        java.lang.Character char23 = cSVFormat6.getEscape();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser24 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + quote12 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote12.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(char23);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        long long5 = cSVParser3.getRecordNumber();
        long long6 = cSVParser3.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList7);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.csv.Quote quote2 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteChar((java.lang.Character) 'a');
        cSVFormat12.validate();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat12.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withNullString("");
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray24 = cSVFormat23.getHeader();
        java.lang.String[] strArray31 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat23.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat23.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat23.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.Quote quote41 = org.apache.commons.csv.Quote.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withQuoteChar((java.lang.Character) 'a');
        cSVFormat50.validate();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat50.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat50.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray59 = cSVFormat58.getHeader();
        java.lang.String[] strArray66 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat58.withHeader(strArray66);
        java.lang.String str68 = cSVFormat57.format((java.lang.Object[]) strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat70 = new org.apache.commons.csv.CSVFormat('\f', (java.lang.Character) ' ', quote41, (java.lang.Character) '\f', (java.lang.Character) '\b', true, true, "\205", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na", strArray66, true);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat23.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withCommentStart((java.lang.Character) '\b');
        java.lang.String[] strArray74 = cSVFormat73.getHeader();
        java.lang.String str75 = cSVFormat21.format((java.lang.Object[]) strArray74);
        org.apache.commons.csv.CSVFormat cSVFormat77 = new org.apache.commons.csv.CSVFormat('4', (java.lang.Character) '\"', quote2, (java.lang.Character) '\r', (java.lang.Character) '4', true, false, "Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\", \r\n\u2028]", "Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\"\205\",\"\r\n\",\"\r\n\",\205,\205,\"\r\n\", \r\n\u2028]", strArray74, false);
        org.junit.Assert.assertTrue("'" + quote2 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote2.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + quote41 + "' != '" + org.apache.commons.csv.Quote.MINIMAL + "'", quote41.equals(org.apache.commons.csv.Quote.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNull(strArray59);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str68, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str75, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        org.apache.commons.csv.Quote quote18 = cSVFormat15.getQuotePolicy();
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
        org.junit.Assert.assertNull(quote18);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser3.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser3.spliterator();
        java.lang.Class<?> wildcardClass10 = cSVParser3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\"');
        org.apache.commons.csv.Quote quote7 = cSVFormat6.getQuotePolicy();
        boolean boolean8 = cSVFormat6.isQuoting();
        boolean boolean9 = cSVFormat6.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quote7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart('a');
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        java.lang.String[] strArray18 = cSVFormat16.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withRecordSeparator(',');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser21 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat16);
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
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        long long9 = cSVParser8.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser8.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor13 = cSVParser8.iterator();
        long long14 = cSVParser8.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
        org.junit.Assert.assertNotNull(cSVRecordItor13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        long long8 = cSVParser3.getCurrentLineNumber();
        long long9 = cSVParser3.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser3.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cSVParser8.getHeaderMap();
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
        org.junit.Assert.assertNull(strMap16);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        boolean boolean5 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withDelimiter('\f');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
        long long14 = cSVParser8.getRecordNumber();
        cSVParser8.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser8.nextRecord();
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
        org.junit.Assert.assertNull(cSVRecord11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        boolean boolean8 = cSVParser3.isClosed();
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
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        long long9 = cSVParser3.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withCommentStart((java.lang.Character) ' ');
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
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        long long12 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4L + "'", long11 == 4L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser8.getRecords();
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
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '\t');
        java.lang.String str13 = cSVFormat10.toString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withRecordSeparator("a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator('4');
        java.lang.String str20 = cSVFormat19.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse(file0, cSVFormat19);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false" + "'", str13, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser7.getRecords();
        long long11 = cSVParser7.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser7.nextRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(cSVRecord12);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cSVParser8.getHeaderMap();
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
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser7.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser7.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecord10);
        org.junit.Assert.assertNotNull(cSVRecordItor11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
        long long15 = cSVParser7.getCurrentLineNumber();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser8.getHeaderMap();
        long long10 = cSVParser8.getRecordNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser8.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser8.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor13 = cSVParser8.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser8.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(cSVRecord11);
        org.junit.Assert.assertNull(cSVRecord12);
        org.junit.Assert.assertNotNull(cSVRecordItor13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray9 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart((java.lang.Character) '\f');
        cSVFormat1.validate();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withEscape('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\u2028");
        java.lang.Character char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) false, "");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
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
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser7, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=< > SkipHeaderRecord:false");
        long long16 = cSVParser7.getCurrentLineNumber();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withRecordSeparator('\f');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("", cSVFormat8);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser10.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteChar((java.lang.Character) 'a');
        cSVFormat2.validate();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('\b');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator("INVALID []");
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteChar((java.lang.Character) 'a');
        cSVFormat13.validate();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray22 = cSVFormat21.getHeader();
        java.lang.String[] strArray29 = new java.lang.String[] { "\205", "\r\n", "\r\n", "\205", "\205", "\r\n" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat21.withHeader(strArray29);
        java.lang.String str31 = cSVFormat20.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat9.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat9.withRecordSeparator('\r');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator("Delimiter=<,> Escape=<a> QuoteChar=<a> NullString=<Delimiter=<,> Escape=<a> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:false");
        java.io.Reader reader37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser38 = cSVFormat36.parse(reader37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" + "'", str31, "a\205a,a\r\na,a\r\na,\205,\205,a\r\na");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat4);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser7.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.lang.Class<?> wildcardClass10 = cSVRecordItor9.getClass();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        cSVParser3.close();
        long long9 = cSVParser3.getCurrentLineNumber();
        boolean boolean10 = cSVParser3.isClosed();
        long long11 = cSVParser3.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVParser9, "Delimiter=<,> QuoteChar=<#> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[\f, \205, hi!, hi!, a\205a,a\r\na,a\r\na,\205,\205,a\r\na]");
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
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        boolean boolean6 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser3.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser3.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser3.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
        java.lang.Class<?> wildcardClass61 = cSVFormat54.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withEscape('\"');
        java.lang.String[] strArray13 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\f');
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("TOKEN []", cSVFormat12);
        long long14 = cSVParser13.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        long long14 = cSVParser8.getCurrentLineNumber();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = null;
        org.apache.commons.csv.Lexer lexer11 = new org.apache.commons.csv.Lexer(cSVFormat9, extendedBufferedReader10);
        org.apache.commons.csv.Quote quote12 = cSVFormat9.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withCommentStart((java.lang.Character) '\"');
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = cSVFormat9.parse(reader15);
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
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar('#');
        java.lang.String[] strArray12 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'url' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }
}
