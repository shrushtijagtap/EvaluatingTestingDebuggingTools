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
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        long long7 = cSVParser4.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser4.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!,,hi!,,hi!,hi!", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser4.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser4.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser4.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        long long9 = cSVParser4.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        java.lang.Character char3 = cSVFormat1.getEscape();
        boolean boolean4 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser5.getHeaderMap();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("Delimiter=< > Escape=<\f> QuoteChar=<a> CommentStart=<4>", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser4.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser4.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser4.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        long long10 = cSVParser4.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        long long10 = cSVParser4.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        long long9 = cSVParser4.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser4.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        long long8 = cSVParser4.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        java.lang.Character char3 = cSVFormat1.getEscape();
        boolean boolean4 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        long long6 = cSVParser5.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser5.getHeaderMap();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = cSVFormat1.toBuilder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder5 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat4);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder6 = cSVFormat4.toBuilder();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder8 = cSVFormatBuilder6.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormatBuilder8.build();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder11 = cSVFormatBuilder8.withDelimiter('4');
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder13 = cSVFormatBuilder8.withNullToString("Delimiter=<,> QuoteChar=<\">");
        boolean boolean14 = cSVFormat1.equals((java.lang.Object) "Delimiter=<,> QuoteChar=<\">");
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder15 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat1);
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder16 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat1);
        java.lang.String str17 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser("INVALID []", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cSVParser18.getHeaderMap();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        long long9 = cSVParser4.getRecordNumber();
        long long10 = cSVParser4.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser4.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        long long9 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser4.iterator();
        long long11 = cSVParser4.getLineNumber();
        long long12 = cSVParser4.getLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser4.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        long long10 = cSVParser4.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        long long6 = cSVParser4.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser4.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser4.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser4.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser4.nextRecord();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.Character char2 = cSVFormat1.getQuoteChar();
        boolean boolean3 = cSVFormat1.isEscaping();
        java.lang.Character char4 = cSVFormat1.getQuoteChar();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder5 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        boolean boolean6 = cSVFormat1.isEscaping();
        java.lang.Character char7 = cSVFormat1.getQuoteChar();
        boolean boolean8 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("INVALID []", cSVFormat1);
        long long10 = cSVParser9.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser9.getHeaderMap();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        java.lang.String str3 = cSVFormat1.getNullToString();
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        long long9 = cSVParser4.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser4.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        long long9 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser4.getRecords();
        long long11 = cSVParser4.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        char char4 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("[hi!, , hi!, , hi!, hi!]", cSVFormat1);
        long long6 = cSVParser5.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser5.getHeaderMap();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        java.lang.Character char3 = cSVFormat1.getEscape();
        boolean boolean4 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser5.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser5.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser5.getHeaderMap();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        java.lang.Character char3 = cSVFormat1.getEscape();
        boolean boolean4 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser5.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser5.getHeaderMap();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        long long7 = cSVParser4.getLineNumber();
        long long8 = cSVParser4.getRecordNumber();
        long long9 = cSVParser4.getRecordNumber();
        long long10 = cSVParser4.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser4.nextRecord();
        long long11 = cSVParser4.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        long long9 = cSVParser4.getRecordNumber();
        long long10 = cSVParser4.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord11 = cSVParser4.nextRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser4.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser4.nextRecord();
        long long10 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser4.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(' ');
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder4 = cSVFormatBuilder2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder6 = cSVFormatBuilder2.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder8 = cSVFormatBuilder2.withCommentStart('a');
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder10 = cSVFormatBuilder8.withEscape((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder12 = cSVFormatBuilder8.withCommentStart('4');
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder14 = cSVFormatBuilder12.withEscape((java.lang.Character) '\f');
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder16 = cSVFormatBuilder14.withNullToString("hi!\t\thi!\t\thi!\thi!");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormatBuilder14.build();
        org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser("Delimiter=<,> QuoteChar=<\">", cSVFormat17);
        long long19 = cSVParser18.getLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator20 = cSVParser18.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cSVParser18.getHeaderMap();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean2 = cSVFormat1.isEscaping();
        org.apache.commons.csv.Quote quote3 = cSVFormat1.getQuotePolicy();
        java.lang.Character char4 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("Delimiter=< > Escape=<#> QuoteChar=<#> CommentStart=<\r> EmptyLines:ignored", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser5.getHeaderMap();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser4.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser4.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser4.nextRecord();
        long long11 = cSVParser4.getLineNumber();
        long long12 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser4.getRecords();
        long long14 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor15 = cSVParser4.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser4.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser4.nextRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser4.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser4.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser4.getRecords();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser4.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser4.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser4.spliterator();
        long long12 = cSVParser4.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        long long7 = cSVParser4.getRecordNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char2 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder3 = new org.apache.commons.csv.CSVFormat.CSVFormatBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser4.iterator();
        long long6 = cSVParser4.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        long long9 = cSVParser4.getRecordNumber();
        long long10 = cSVParser4.getLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser4.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord12 = cSVParser4.nextRecord();
        long long13 = cSVParser4.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser4.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cSVParser4.getHeaderMap();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat.CSVFormatBuilder cSVFormatBuilder2 = org.apache.commons.csv.CSVFormat.newBuilder(cSVFormat1);
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("Delimiter=< > Escape=<\f> QuoteChar=<a> CommentStart=<4>", cSVFormat1);
        long long4 = cSVParser3.getRecordNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser3.getRecords();
        long long6 = cSVParser3.getRecordNumber();
        long long7 = cSVParser3.getLineNumber();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser3.getHeaderMap();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("[]", cSVFormat1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cSVParser2.getHeaderMap();
    }
}

