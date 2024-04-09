package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.nextRecord();
        long long6 = cSVParser3.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long6 = cSVParser3.getRecordNumber();
        cSVParser3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser3.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\t');
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\u2028", cSVFormat8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser12.getHeaderMap();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        long long9 = cSVParser7.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        long long7 = cSVParser3.getCurrentLineNumber();
        long long8 = cSVParser3.getRecordNumber();
        long long9 = cSVParser3.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat1);
        long long8 = cSVParser7.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        boolean boolean6 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat1);
        long long8 = cSVParser7.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser7.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser3.getRecords();
        cSVParser3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser3.spliterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        long long9 = cSVParser7.getRecordNumber();
        long long10 = cSVParser7.getCurrentLineNumber();
        boolean boolean11 = cSVParser7.isClosed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        long long5 = cSVParser3.getCurrentLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("a\fa,\205,hi!,hi!,aaa\205aa,aa\r\naa,aa\r\naa,\205,\205,aa\r\naaa", cSVFormat3);
        cSVParser4.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        long long5 = cSVParser3.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
        long long8 = cSVParser3.getCurrentLineNumber();
        boolean boolean9 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser3.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray11 = cSVFormat8.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withEscape('\t');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("", cSVFormat13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cSVParser14.getHeaderMap();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\t');
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("\u2028", cSVFormat8);
        cSVParser12.close();
        cSVParser12.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cSVParser12.getHeaderMap();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        long long9 = cSVParser7.getRecordNumber();
        long long10 = cSVParser7.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser7.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        long long7 = cSVParser3.getCurrentLineNumber();
        long long8 = cSVParser3.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser3.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter(' ');
        boolean boolean9 = cSVFormat8.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\u2029", cSVFormat8);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser10.iterator();
        long long12 = cSVParser10.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser10.getHeaderMap();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote4 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("0\tDelimiter=<,> QuoteChar=<\"> CommentStart=<\f> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\tfalse", cSVFormat1);
        boolean boolean8 = cSVParser7.isClosed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser7.getHeaderMap();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withEscape('\"');
        java.lang.String[] strArray18 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeader(strArray18);
        java.lang.String str20 = cSVFormat5.format((java.lang.Object[]) strArray18);
        org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse("\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser21.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator23 = cSVParser21.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = cSVParser21.getHeaderMap();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long8 = cSVParser3.getCurrentLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        long long4 = cSVParser3.getCurrentLineNumber();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser3.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withEscape('\"');
        java.lang.String[] strArray18 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeader(strArray18);
        java.lang.String str20 = cSVFormat5.format((java.lang.Object[]) strArray18);
        org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse("\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser21.spliterator();
        boolean boolean23 = cSVParser21.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList24 = cSVParser21.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = cSVParser21.getHeaderMap();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.Character char6 = cSVFormat5.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withEscape('\"');
        java.lang.String[] strArray18 = new java.lang.String[] { "\f", "\205", "hi!", "hi!", "a\205a,a\r\na,a\r\na,\205,\205,a\r\na" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeader(strArray18);
        java.lang.String str20 = cSVFormat5.format((java.lang.Object[]) strArray18);
        org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse("\"\f\",\205,hi!,hi!,\"a\205a,a\r\na,a\r\na,\205,\205,a\r\na\"", cSVFormat5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = cSVParser21.getHeaderMap();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        long long8 = cSVParser3.getCurrentLineNumber();
        long long9 = cSVParser3.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        long long5 = cSVParser3.getCurrentLineNumber();
        boolean boolean6 = cSVParser3.isClosed();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter(' ');
        boolean boolean9 = cSVFormat8.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\u2029", cSVFormat8);
        cSVParser10.close();
        cSVParser10.close();
        long long13 = cSVParser10.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser10.getHeaderMap();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        boolean boolean8 = cSVParser3.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser3.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        long long7 = cSVParser3.getRecordNumber();
        boolean boolean8 = cSVParser3.isClosed();
        long long9 = cSVParser3.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        long long5 = cSVParser3.getCurrentLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser3.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.nextRecord();
        long long8 = cSVParser3.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        cSVParser3.close();
        long long6 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser3.spliterator();
        long long7 = cSVParser3.getRecordNumber();
        cSVParser3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter(' ');
        boolean boolean9 = cSVFormat8.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\u2029", cSVFormat8);
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser10.nextRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser10.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser10.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser10.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cSVParser10.getHeaderMap();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> SkipHeaderRecord:false");
        java.lang.String[] strArray19 = cSVFormat18.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withNullString("\205 hi! hi! a\205a,a\\r\\na,a\\r\\na,\205,\205,a\\r\\nanull\t#\205#hi!#hi!#a\205a,a\\r\\na,a\\r\\na,\205,\205,a\\r\\nanull\thi!\t\\r\\n\t#\205# #\\r\\n# #\\r\\n# \205 \205 #\\r\\n#");
        org.apache.commons.csv.CSVParser cSVParser24 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<#> QuoteChar=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = cSVParser24.getHeaderMap();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        cSVParser3.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser3.iterator();
        long long6 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        long long8 = cSVParser3.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser3.iterator();
        long long10 = cSVParser3.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser3.nextRecord();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        long long7 = cSVParser3.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser3.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser3.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        cSVFormat3.validate();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter(' ');
        boolean boolean9 = cSVFormat8.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\u2029", cSVFormat8);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor11 = cSVParser10.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser10.getHeaderMap();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray11 = cSVFormat8.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withEscape('\t');
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("", cSVFormat13);
        boolean boolean15 = cSVParser14.isClosed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cSVParser14.getHeaderMap();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("a\205a,a\r\na,a\r\na,\205,\205,a\r\na", cSVFormat2);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        boolean boolean5 = cSVParser3.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser3.iterator();
        long long8 = cSVParser3.getCurrentLineNumber();
        cSVParser3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser3.getHeaderMap();
    }
}

